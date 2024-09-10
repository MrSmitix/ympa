#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "calculate_tariffs_response.h"


char* calculate_tariffs_response_status_ToString(_api__calculate_tariffs_response__e status) {
    char* statusArray[] =  { "NULL", "OK", "ERROR" };
    return statusArray[status];
}

_api__calculate_tariffs_response__e calculate_tariffs_response_status_FromString(char* status){
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

calculate_tariffs_response_t *calculate_tariffs_response_create(
    api_response_status_type_t *status,
    calculate_tariffs_response_dto_t *result
    ) {
    calculate_tariffs_response_t *calculate_tariffs_response_local_var = malloc(sizeof(calculate_tariffs_response_t));
    if (!calculate_tariffs_response_local_var) {
        return NULL;
    }
    calculate_tariffs_response_local_var->status = status;
    calculate_tariffs_response_local_var->result = result;

    return calculate_tariffs_response_local_var;
}


void calculate_tariffs_response_free(calculate_tariffs_response_t *calculate_tariffs_response) {
    if(NULL == calculate_tariffs_response){
        return ;
    }
    listEntry_t *listEntry;
    if (calculate_tariffs_response->status) {
        api_response_status_type_free(calculate_tariffs_response->status);
        calculate_tariffs_response->status = NULL;
    }
    if (calculate_tariffs_response->result) {
        calculate_tariffs_response_dto_free(calculate_tariffs_response->result);
        calculate_tariffs_response->result = NULL;
    }
    free(calculate_tariffs_response);
}

cJSON *calculate_tariffs_response_convertToJSON(calculate_tariffs_response_t *calculate_tariffs_response) {
    cJSON *item = cJSON_CreateObject();

    // calculate_tariffs_response->status
    if(calculate_tariffs_response->status != _api__calculate_tariffs_response__NULL) {
    cJSON *status_local_JSON = api_response_status_type_convertToJSON(calculate_tariffs_response->status);
    if(status_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "status", status_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // calculate_tariffs_response->result
    if(calculate_tariffs_response->result) {
    cJSON *result_local_JSON = calculate_tariffs_response_dto_convertToJSON(calculate_tariffs_response->result);
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

calculate_tariffs_response_t *calculate_tariffs_response_parseFromJSON(cJSON *calculate_tariffs_responseJSON){

    calculate_tariffs_response_t *calculate_tariffs_response_local_var = NULL;

    // define the local variable for calculate_tariffs_response->status
    api_response_status_type_t *status_local_nonprim = NULL;

    // define the local variable for calculate_tariffs_response->result
    calculate_tariffs_response_dto_t *result_local_nonprim = NULL;

    // calculate_tariffs_response->status
    cJSON *status = cJSON_GetObjectItemCaseSensitive(calculate_tariffs_responseJSON, "status");
    if (status) { 
    status_local_nonprim = api_response_status_type_parseFromJSON(status); //custom
    }

    // calculate_tariffs_response->result
    cJSON *result = cJSON_GetObjectItemCaseSensitive(calculate_tariffs_responseJSON, "result");
    if (result) { 
    result_local_nonprim = calculate_tariffs_response_dto_parseFromJSON(result); //nonprimitive
    }


    calculate_tariffs_response_local_var = calculate_tariffs_response_create (
        status ? status_local_nonprim : NULL,
        result ? result_local_nonprim : NULL
        );

    return calculate_tariffs_response_local_var;
end:
    if (status_local_nonprim) {
        api_response_status_type_free(status_local_nonprim);
        status_local_nonprim = NULL;
    }
    if (result_local_nonprim) {
        calculate_tariffs_response_dto_free(result_local_nonprim);
        result_local_nonprim = NULL;
    }
    return NULL;

}
