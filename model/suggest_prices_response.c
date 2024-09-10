#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "suggest_prices_response.h"


char* suggest_prices_response_status_ToString(_api__suggest_prices_response__e status) {
    char* statusArray[] =  { "NULL", "OK", "ERROR" };
    return statusArray[status];
}

_api__suggest_prices_response__e suggest_prices_response_status_FromString(char* status){
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

suggest_prices_response_t *suggest_prices_response_create(
    api_response_status_type_t *status,
    suggest_prices_result_dto_t *result
    ) {
    suggest_prices_response_t *suggest_prices_response_local_var = malloc(sizeof(suggest_prices_response_t));
    if (!suggest_prices_response_local_var) {
        return NULL;
    }
    suggest_prices_response_local_var->status = status;
    suggest_prices_response_local_var->result = result;

    return suggest_prices_response_local_var;
}


void suggest_prices_response_free(suggest_prices_response_t *suggest_prices_response) {
    if(NULL == suggest_prices_response){
        return ;
    }
    listEntry_t *listEntry;
    if (suggest_prices_response->status) {
        api_response_status_type_free(suggest_prices_response->status);
        suggest_prices_response->status = NULL;
    }
    if (suggest_prices_response->result) {
        suggest_prices_result_dto_free(suggest_prices_response->result);
        suggest_prices_response->result = NULL;
    }
    free(suggest_prices_response);
}

cJSON *suggest_prices_response_convertToJSON(suggest_prices_response_t *suggest_prices_response) {
    cJSON *item = cJSON_CreateObject();

    // suggest_prices_response->status
    if(suggest_prices_response->status != _api__suggest_prices_response__NULL) {
    cJSON *status_local_JSON = api_response_status_type_convertToJSON(suggest_prices_response->status);
    if(status_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "status", status_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // suggest_prices_response->result
    if(suggest_prices_response->result) {
    cJSON *result_local_JSON = suggest_prices_result_dto_convertToJSON(suggest_prices_response->result);
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

suggest_prices_response_t *suggest_prices_response_parseFromJSON(cJSON *suggest_prices_responseJSON){

    suggest_prices_response_t *suggest_prices_response_local_var = NULL;

    // define the local variable for suggest_prices_response->status
    api_response_status_type_t *status_local_nonprim = NULL;

    // define the local variable for suggest_prices_response->result
    suggest_prices_result_dto_t *result_local_nonprim = NULL;

    // suggest_prices_response->status
    cJSON *status = cJSON_GetObjectItemCaseSensitive(suggest_prices_responseJSON, "status");
    if (status) { 
    status_local_nonprim = api_response_status_type_parseFromJSON(status); //custom
    }

    // suggest_prices_response->result
    cJSON *result = cJSON_GetObjectItemCaseSensitive(suggest_prices_responseJSON, "result");
    if (result) { 
    result_local_nonprim = suggest_prices_result_dto_parseFromJSON(result); //nonprimitive
    }


    suggest_prices_response_local_var = suggest_prices_response_create (
        status ? status_local_nonprim : NULL,
        result ? result_local_nonprim : NULL
        );

    return suggest_prices_response_local_var;
end:
    if (status_local_nonprim) {
        api_response_status_type_free(status_local_nonprim);
        status_local_nonprim = NULL;
    }
    if (result_local_nonprim) {
        suggest_prices_result_dto_free(result_local_nonprim);
        result_local_nonprim = NULL;
    }
    return NULL;

}
