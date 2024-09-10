#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "update_order_statuses_response.h"


char* update_order_statuses_response_status_ToString(_api__update_order_statuses_response__e status) {
    char* statusArray[] =  { "NULL", "OK", "ERROR" };
    return statusArray[status];
}

_api__update_order_statuses_response__e update_order_statuses_response_status_FromString(char* status){
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

update_order_statuses_response_t *update_order_statuses_response_create(
    api_response_status_type_t *status,
    update_order_statuses_dto_t *result
    ) {
    update_order_statuses_response_t *update_order_statuses_response_local_var = malloc(sizeof(update_order_statuses_response_t));
    if (!update_order_statuses_response_local_var) {
        return NULL;
    }
    update_order_statuses_response_local_var->status = status;
    update_order_statuses_response_local_var->result = result;

    return update_order_statuses_response_local_var;
}


void update_order_statuses_response_free(update_order_statuses_response_t *update_order_statuses_response) {
    if(NULL == update_order_statuses_response){
        return ;
    }
    listEntry_t *listEntry;
    if (update_order_statuses_response->status) {
        api_response_status_type_free(update_order_statuses_response->status);
        update_order_statuses_response->status = NULL;
    }
    if (update_order_statuses_response->result) {
        update_order_statuses_dto_free(update_order_statuses_response->result);
        update_order_statuses_response->result = NULL;
    }
    free(update_order_statuses_response);
}

cJSON *update_order_statuses_response_convertToJSON(update_order_statuses_response_t *update_order_statuses_response) {
    cJSON *item = cJSON_CreateObject();

    // update_order_statuses_response->status
    if(update_order_statuses_response->status != _api__update_order_statuses_response__NULL) {
    cJSON *status_local_JSON = api_response_status_type_convertToJSON(update_order_statuses_response->status);
    if(status_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "status", status_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // update_order_statuses_response->result
    if(update_order_statuses_response->result) {
    cJSON *result_local_JSON = update_order_statuses_dto_convertToJSON(update_order_statuses_response->result);
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

update_order_statuses_response_t *update_order_statuses_response_parseFromJSON(cJSON *update_order_statuses_responseJSON){

    update_order_statuses_response_t *update_order_statuses_response_local_var = NULL;

    // define the local variable for update_order_statuses_response->status
    api_response_status_type_t *status_local_nonprim = NULL;

    // define the local variable for update_order_statuses_response->result
    update_order_statuses_dto_t *result_local_nonprim = NULL;

    // update_order_statuses_response->status
    cJSON *status = cJSON_GetObjectItemCaseSensitive(update_order_statuses_responseJSON, "status");
    if (status) { 
    status_local_nonprim = api_response_status_type_parseFromJSON(status); //custom
    }

    // update_order_statuses_response->result
    cJSON *result = cJSON_GetObjectItemCaseSensitive(update_order_statuses_responseJSON, "result");
    if (result) { 
    result_local_nonprim = update_order_statuses_dto_parseFromJSON(result); //nonprimitive
    }


    update_order_statuses_response_local_var = update_order_statuses_response_create (
        status ? status_local_nonprim : NULL,
        result ? result_local_nonprim : NULL
        );

    return update_order_statuses_response_local_var;
end:
    if (status_local_nonprim) {
        api_response_status_type_free(status_local_nonprim);
        status_local_nonprim = NULL;
    }
    if (result_local_nonprim) {
        update_order_statuses_dto_free(result_local_nonprim);
        result_local_nonprim = NULL;
    }
    return NULL;

}
