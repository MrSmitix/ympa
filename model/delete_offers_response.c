#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "delete_offers_response.h"


char* delete_offers_response_status_ToString(_api__delete_offers_response__e status) {
    char* statusArray[] =  { "NULL", "OK", "ERROR" };
    return statusArray[status];
}

_api__delete_offers_response__e delete_offers_response_status_FromString(char* status){
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

delete_offers_response_t *delete_offers_response_create(
    api_response_status_type_t *status,
    delete_offers_dto_t *result
    ) {
    delete_offers_response_t *delete_offers_response_local_var = malloc(sizeof(delete_offers_response_t));
    if (!delete_offers_response_local_var) {
        return NULL;
    }
    delete_offers_response_local_var->status = status;
    delete_offers_response_local_var->result = result;

    return delete_offers_response_local_var;
}


void delete_offers_response_free(delete_offers_response_t *delete_offers_response) {
    if(NULL == delete_offers_response){
        return ;
    }
    listEntry_t *listEntry;
    if (delete_offers_response->status) {
        api_response_status_type_free(delete_offers_response->status);
        delete_offers_response->status = NULL;
    }
    if (delete_offers_response->result) {
        delete_offers_dto_free(delete_offers_response->result);
        delete_offers_response->result = NULL;
    }
    free(delete_offers_response);
}

cJSON *delete_offers_response_convertToJSON(delete_offers_response_t *delete_offers_response) {
    cJSON *item = cJSON_CreateObject();

    // delete_offers_response->status
    if(delete_offers_response->status != _api__delete_offers_response__NULL) {
    cJSON *status_local_JSON = api_response_status_type_convertToJSON(delete_offers_response->status);
    if(status_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "status", status_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // delete_offers_response->result
    if(delete_offers_response->result) {
    cJSON *result_local_JSON = delete_offers_dto_convertToJSON(delete_offers_response->result);
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

delete_offers_response_t *delete_offers_response_parseFromJSON(cJSON *delete_offers_responseJSON){

    delete_offers_response_t *delete_offers_response_local_var = NULL;

    // define the local variable for delete_offers_response->status
    api_response_status_type_t *status_local_nonprim = NULL;

    // define the local variable for delete_offers_response->result
    delete_offers_dto_t *result_local_nonprim = NULL;

    // delete_offers_response->status
    cJSON *status = cJSON_GetObjectItemCaseSensitive(delete_offers_responseJSON, "status");
    if (status) { 
    status_local_nonprim = api_response_status_type_parseFromJSON(status); //custom
    }

    // delete_offers_response->result
    cJSON *result = cJSON_GetObjectItemCaseSensitive(delete_offers_responseJSON, "result");
    if (result) { 
    result_local_nonprim = delete_offers_dto_parseFromJSON(result); //nonprimitive
    }


    delete_offers_response_local_var = delete_offers_response_create (
        status ? status_local_nonprim : NULL,
        result ? result_local_nonprim : NULL
        );

    return delete_offers_response_local_var;
end:
    if (status_local_nonprim) {
        api_response_status_type_free(status_local_nonprim);
        status_local_nonprim = NULL;
    }
    if (result_local_nonprim) {
        delete_offers_dto_free(result_local_nonprim);
        result_local_nonprim = NULL;
    }
    return NULL;

}
