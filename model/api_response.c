#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "api_response.h"


char* api_response_status_ToString(_api__api_response__e status) {
    char* statusArray[] =  { "NULL", "OK", "ERROR" };
    return statusArray[status];
}

_api__api_response__e api_response_status_FromString(char* status){
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

api_response_t *api_response_create(
    api_response_status_type_t *status
    ) {
    api_response_t *api_response_local_var = malloc(sizeof(api_response_t));
    if (!api_response_local_var) {
        return NULL;
    }
    api_response_local_var->status = status;

    return api_response_local_var;
}


void api_response_free(api_response_t *api_response) {
    if(NULL == api_response){
        return ;
    }
    listEntry_t *listEntry;
    if (api_response->status) {
        api_response_status_type_free(api_response->status);
        api_response->status = NULL;
    }
    free(api_response);
}

cJSON *api_response_convertToJSON(api_response_t *api_response) {
    cJSON *item = cJSON_CreateObject();

    // api_response->status
    if(api_response->status != _api__api_response__NULL) {
    cJSON *status_local_JSON = api_response_status_type_convertToJSON(api_response->status);
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

api_response_t *api_response_parseFromJSON(cJSON *api_responseJSON){

    api_response_t *api_response_local_var = NULL;

    // define the local variable for api_response->status
    api_response_status_type_t *status_local_nonprim = NULL;

    // api_response->status
    cJSON *status = cJSON_GetObjectItemCaseSensitive(api_responseJSON, "status");
    if (status) { 
    status_local_nonprim = api_response_status_type_parseFromJSON(status); //custom
    }


    api_response_local_var = api_response_create (
        status ? status_local_nonprim : NULL
        );

    return api_response_local_var;
end:
    if (status_local_nonprim) {
        api_response_status_type_free(status_local_nonprim);
        status_local_nonprim = NULL;
    }
    return NULL;

}
