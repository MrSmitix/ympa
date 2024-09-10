#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "verify_order_eac_response.h"


char* verify_order_eac_response_status_ToString(_api__verify_order_eac_response__e status) {
    char* statusArray[] =  { "NULL", "OK", "ERROR" };
    return statusArray[status];
}

_api__verify_order_eac_response__e verify_order_eac_response_status_FromString(char* status){
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

verify_order_eac_response_t *verify_order_eac_response_create(
    api_response_status_type_t *status,
    eac_verification_result_dto_t *result
    ) {
    verify_order_eac_response_t *verify_order_eac_response_local_var = malloc(sizeof(verify_order_eac_response_t));
    if (!verify_order_eac_response_local_var) {
        return NULL;
    }
    verify_order_eac_response_local_var->status = status;
    verify_order_eac_response_local_var->result = result;

    return verify_order_eac_response_local_var;
}


void verify_order_eac_response_free(verify_order_eac_response_t *verify_order_eac_response) {
    if(NULL == verify_order_eac_response){
        return ;
    }
    listEntry_t *listEntry;
    if (verify_order_eac_response->status) {
        api_response_status_type_free(verify_order_eac_response->status);
        verify_order_eac_response->status = NULL;
    }
    if (verify_order_eac_response->result) {
        eac_verification_result_dto_free(verify_order_eac_response->result);
        verify_order_eac_response->result = NULL;
    }
    free(verify_order_eac_response);
}

cJSON *verify_order_eac_response_convertToJSON(verify_order_eac_response_t *verify_order_eac_response) {
    cJSON *item = cJSON_CreateObject();

    // verify_order_eac_response->status
    if(verify_order_eac_response->status != _api__verify_order_eac_response__NULL) {
    cJSON *status_local_JSON = api_response_status_type_convertToJSON(verify_order_eac_response->status);
    if(status_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "status", status_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // verify_order_eac_response->result
    if(verify_order_eac_response->result) {
    cJSON *result_local_JSON = eac_verification_result_dto_convertToJSON(verify_order_eac_response->result);
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

verify_order_eac_response_t *verify_order_eac_response_parseFromJSON(cJSON *verify_order_eac_responseJSON){

    verify_order_eac_response_t *verify_order_eac_response_local_var = NULL;

    // define the local variable for verify_order_eac_response->status
    api_response_status_type_t *status_local_nonprim = NULL;

    // define the local variable for verify_order_eac_response->result
    eac_verification_result_dto_t *result_local_nonprim = NULL;

    // verify_order_eac_response->status
    cJSON *status = cJSON_GetObjectItemCaseSensitive(verify_order_eac_responseJSON, "status");
    if (status) { 
    status_local_nonprim = api_response_status_type_parseFromJSON(status); //custom
    }

    // verify_order_eac_response->result
    cJSON *result = cJSON_GetObjectItemCaseSensitive(verify_order_eac_responseJSON, "result");
    if (result) { 
    result_local_nonprim = eac_verification_result_dto_parseFromJSON(result); //nonprimitive
    }


    verify_order_eac_response_local_var = verify_order_eac_response_create (
        status ? status_local_nonprim : NULL,
        result ? result_local_nonprim : NULL
        );

    return verify_order_eac_response_local_var;
end:
    if (status_local_nonprim) {
        api_response_status_type_free(status_local_nonprim);
        status_local_nonprim = NULL;
    }
    if (result_local_nonprim) {
        eac_verification_result_dto_free(result_local_nonprim);
        result_local_nonprim = NULL;
    }
    return NULL;

}
