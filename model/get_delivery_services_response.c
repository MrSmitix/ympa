#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "get_delivery_services_response.h"



get_delivery_services_response_t *get_delivery_services_response_create(
    delivery_services_dto_t *result
    ) {
    get_delivery_services_response_t *get_delivery_services_response_local_var = malloc(sizeof(get_delivery_services_response_t));
    if (!get_delivery_services_response_local_var) {
        return NULL;
    }
    get_delivery_services_response_local_var->result = result;

    return get_delivery_services_response_local_var;
}


void get_delivery_services_response_free(get_delivery_services_response_t *get_delivery_services_response) {
    if(NULL == get_delivery_services_response){
        return ;
    }
    listEntry_t *listEntry;
    if (get_delivery_services_response->result) {
        delivery_services_dto_free(get_delivery_services_response->result);
        get_delivery_services_response->result = NULL;
    }
    free(get_delivery_services_response);
}

cJSON *get_delivery_services_response_convertToJSON(get_delivery_services_response_t *get_delivery_services_response) {
    cJSON *item = cJSON_CreateObject();

    // get_delivery_services_response->result
    if(get_delivery_services_response->result) {
    cJSON *result_local_JSON = delivery_services_dto_convertToJSON(get_delivery_services_response->result);
    if(result_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "result", result_local_JSON);
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

get_delivery_services_response_t *get_delivery_services_response_parseFromJSON(cJSON *get_delivery_services_responseJSON){

    get_delivery_services_response_t *get_delivery_services_response_local_var = NULL;

    // define the local variable for get_delivery_services_response->result
    delivery_services_dto_t *result_local_nonprim = NULL;

    // get_delivery_services_response->result
    cJSON *result = cJSON_GetObjectItemCaseSensitive(get_delivery_services_responseJSON, "result");
    if (result) { 
    result_local_nonprim = delivery_services_dto_parseFromJSON(result); //nonprimitive
    }


    get_delivery_services_response_local_var = get_delivery_services_response_create (
        result ? result_local_nonprim : NULL
        );

    return get_delivery_services_response_local_var;
end:
    if (result_local_nonprim) {
        delivery_services_dto_free(result_local_nonprim);
        result_local_nonprim = NULL;
    }
    return NULL;

}
