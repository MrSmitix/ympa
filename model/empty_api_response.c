#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "empty_api_response.h"


char* empty_api_response_status_ToString(_api__empty_api_response__e status) {
    char* statusArray[] =  { "NULL", "OK", "ERROR" };
    return statusArray[status];
}

_api__empty_api_response__e empty_api_response_status_FromString(char* status){
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

empty_api_response_t *empty_api_response_create(
    api_response_status_type_t *status
    ) {
    empty_api_response_t *empty_api_response_local_var = malloc(sizeof(empty_api_response_t));
    if (!empty_api_response_local_var) {
        return NULL;
    }
    empty_api_response_local_var->status = status;

    return empty_api_response_local_var;
}


void empty_api_response_free(empty_api_response_t *empty_api_response) {
    if(NULL == empty_api_response){
        return ;
    }
    listEntry_t *listEntry;
    if (empty_api_response->status) {
        api_response_status_type_free(empty_api_response->status);
        empty_api_response->status = NULL;
    }
    free(empty_api_response);
}

cJSON *empty_api_response_convertToJSON(empty_api_response_t *empty_api_response) {
    cJSON *item = cJSON_CreateObject();

    // empty_api_response->status
    if(empty_api_response->status != _api__empty_api_response__NULL) {
    cJSON *status_local_JSON = api_response_status_type_convertToJSON(empty_api_response->status);
    if(status_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "status", status_local_JSON);
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

empty_api_response_t *empty_api_response_parseFromJSON(cJSON *empty_api_responseJSON){

    empty_api_response_t *empty_api_response_local_var = NULL;

    // define the local variable for empty_api_response->status
    api_response_status_type_t *status_local_nonprim = NULL;

    // empty_api_response->status
    cJSON *status = cJSON_GetObjectItemCaseSensitive(empty_api_responseJSON, "status");
    if (status) { 
    status_local_nonprim = api_response_status_type_parseFromJSON(status); //custom
    }


    empty_api_response_local_var = empty_api_response_create (
        status ? status_local_nonprim : NULL
        );

    return empty_api_response_local_var;
end:
    if (status_local_nonprim) {
        api_response_status_type_free(status_local_nonprim);
        status_local_nonprim = NULL;
    }
    return NULL;

}
