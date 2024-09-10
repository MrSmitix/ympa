#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "provide_order_item_identifiers_response.h"


char* provide_order_item_identifiers_response_status_ToString(_api__provide_order_item_identifiers_response__e status) {
    char* statusArray[] =  { "NULL", "OK", "ERROR" };
    return statusArray[status];
}

_api__provide_order_item_identifiers_response__e provide_order_item_identifiers_response_status_FromString(char* status){
    int stringToReturn = 0;
    char *statusArray[] =  { "NULL", "OK", "ERROR" };
    size_t sizeofArray = sizeof(statusArray) / sizeof(statusArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(status, statusArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

provide_order_item_identifiers_response_t *provide_order_item_identifiers_response_create(
    api_response_status_type_t *status,
    order_items_modification_result_dto_t *result
    ) {
    provide_order_item_identifiers_response_t *provide_order_item_identifiers_response_local_var = malloc(sizeof(provide_order_item_identifiers_response_t));
    if (!provide_order_item_identifiers_response_local_var) {
        return NULL;
    }
    provide_order_item_identifiers_response_local_var->status = status;
    provide_order_item_identifiers_response_local_var->result = result;

    return provide_order_item_identifiers_response_local_var;
}


void provide_order_item_identifiers_response_free(provide_order_item_identifiers_response_t *provide_order_item_identifiers_response) {
    if(NULL == provide_order_item_identifiers_response){
        return ;
    }
    listEntry_t *listEntry;
    if (provide_order_item_identifiers_response->status) {
        api_response_status_type_free(provide_order_item_identifiers_response->status);
        provide_order_item_identifiers_response->status = NULL;
    }
    if (provide_order_item_identifiers_response->result) {
        order_items_modification_result_dto_free(provide_order_item_identifiers_response->result);
        provide_order_item_identifiers_response->result = NULL;
    }
    free(provide_order_item_identifiers_response);
}

cJSON *provide_order_item_identifiers_response_convertToJSON(provide_order_item_identifiers_response_t *provide_order_item_identifiers_response) {
    cJSON *item = cJSON_CreateObject();

    // provide_order_item_identifiers_response->status
    if(provide_order_item_identifiers_response->status != _api__provide_order_item_identifiers_response__NULL) {
    cJSON *status_local_JSON = api_response_status_type_convertToJSON(provide_order_item_identifiers_response->status);
    if(status_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "status", status_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // provide_order_item_identifiers_response->result
    if(provide_order_item_identifiers_response->result) {
    cJSON *result_local_JSON = order_items_modification_result_dto_convertToJSON(provide_order_item_identifiers_response->result);
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

provide_order_item_identifiers_response_t *provide_order_item_identifiers_response_parseFromJSON(cJSON *provide_order_item_identifiers_responseJSON){

    provide_order_item_identifiers_response_t *provide_order_item_identifiers_response_local_var = NULL;

    // define the local variable for provide_order_item_identifiers_response->status
    api_response_status_type_t *status_local_nonprim = NULL;

    // define the local variable for provide_order_item_identifiers_response->result
    order_items_modification_result_dto_t *result_local_nonprim = NULL;

    // provide_order_item_identifiers_response->status
    cJSON *status = cJSON_GetObjectItemCaseSensitive(provide_order_item_identifiers_responseJSON, "status");
    if (status) { 
    status_local_nonprim = api_response_status_type_parseFromJSON(status); //custom
    }

    // provide_order_item_identifiers_response->result
    cJSON *result = cJSON_GetObjectItemCaseSensitive(provide_order_item_identifiers_responseJSON, "result");
    if (result) { 
    result_local_nonprim = order_items_modification_result_dto_parseFromJSON(result); //nonprimitive
    }


    provide_order_item_identifiers_response_local_var = provide_order_item_identifiers_response_create (
        status ? status_local_nonprim : NULL,
        result ? result_local_nonprim : NULL
        );

    return provide_order_item_identifiers_response_local_var;
end:
    if (status_local_nonprim) {
        api_response_status_type_free(status_local_nonprim);
        status_local_nonprim = NULL;
    }
    if (result_local_nonprim) {
        order_items_modification_result_dto_free(result_local_nonprim);
        result_local_nonprim = NULL;
    }
    return NULL;

}
