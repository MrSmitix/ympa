#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "get_order_response.h"



get_order_response_t *get_order_response_create(
    order_dto_t *order
    ) {
    get_order_response_t *get_order_response_local_var = malloc(sizeof(get_order_response_t));
    if (!get_order_response_local_var) {
        return NULL;
    }
    get_order_response_local_var->order = order;

    return get_order_response_local_var;
}


void get_order_response_free(get_order_response_t *get_order_response) {
    if(NULL == get_order_response){
        return ;
    }
    listEntry_t *listEntry;
    if (get_order_response->order) {
        order_dto_free(get_order_response->order);
        get_order_response->order = NULL;
    }
    free(get_order_response);
}

cJSON *get_order_response_convertToJSON(get_order_response_t *get_order_response) {
    cJSON *item = cJSON_CreateObject();

    // get_order_response->order
    if(get_order_response->order) {
    cJSON *order_local_JSON = order_dto_convertToJSON(get_order_response->order);
    if(order_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "order", order_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

get_order_response_t *get_order_response_parseFromJSON(cJSON *get_order_responseJSON){

    get_order_response_t *get_order_response_local_var = NULL;

    // define the local variable for get_order_response->order
    order_dto_t *order_local_nonprim = NULL;

    // get_order_response->order
    cJSON *order = cJSON_GetObjectItemCaseSensitive(get_order_responseJSON, "order");
    if (order) { 
    order_local_nonprim = order_dto_parseFromJSON(order); //nonprimitive
    }


    get_order_response_local_var = get_order_response_create (
        order ? order_local_nonprim : NULL
        );

    return get_order_response_local_var;
end:
    if (order_local_nonprim) {
        order_dto_free(order_local_nonprim);
        order_local_nonprim = NULL;
    }
    return NULL;

}
