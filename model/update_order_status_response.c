#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "update_order_status_response.h"



update_order_status_response_t *update_order_status_response_create(
    order_dto_t *order
    ) {
    update_order_status_response_t *update_order_status_response_local_var = malloc(sizeof(update_order_status_response_t));
    if (!update_order_status_response_local_var) {
        return NULL;
    }
    update_order_status_response_local_var->order = order;

    return update_order_status_response_local_var;
}


void update_order_status_response_free(update_order_status_response_t *update_order_status_response) {
    if(NULL == update_order_status_response){
        return ;
    }
    listEntry_t *listEntry;
    if (update_order_status_response->order) {
        order_dto_free(update_order_status_response->order);
        update_order_status_response->order = NULL;
    }
    free(update_order_status_response);
}

cJSON *update_order_status_response_convertToJSON(update_order_status_response_t *update_order_status_response) {
    cJSON *item = cJSON_CreateObject();

    // update_order_status_response->order
    if(update_order_status_response->order) {
    cJSON *order_local_JSON = order_dto_convertToJSON(update_order_status_response->order);
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

update_order_status_response_t *update_order_status_response_parseFromJSON(cJSON *update_order_status_responseJSON){

    update_order_status_response_t *update_order_status_response_local_var = NULL;

    // define the local variable for update_order_status_response->order
    order_dto_t *order_local_nonprim = NULL;

    // update_order_status_response->order
    cJSON *order = cJSON_GetObjectItemCaseSensitive(update_order_status_responseJSON, "order");
    if (order) { 
    order_local_nonprim = order_dto_parseFromJSON(order); //nonprimitive
    }


    update_order_status_response_local_var = update_order_status_response_create (
        order ? order_local_nonprim : NULL
        );

    return update_order_status_response_local_var;
end:
    if (order_local_nonprim) {
        order_dto_free(order_local_nonprim);
        order_local_nonprim = NULL;
    }
    return NULL;

}
