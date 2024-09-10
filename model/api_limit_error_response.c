#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "api_limit_error_response.h"


char* api_limit_error_response_status_ToString(_api__api_limit_error_response__e status) {
    char* statusArray[] =  { "NULL", "OK", "ERROR" };
    return statusArray[status];
}

_api__api_limit_error_response__e api_limit_error_response_status_FromString(char* status){
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

api_limit_error_response_t *api_limit_error_response_create(
    api_response_status_type_t *status,
    list_t *errors
    ) {
    api_limit_error_response_t *api_limit_error_response_local_var = malloc(sizeof(api_limit_error_response_t));
    if (!api_limit_error_response_local_var) {
        return NULL;
    }
    api_limit_error_response_local_var->status = status;
    api_limit_error_response_local_var->errors = errors;

    return api_limit_error_response_local_var;
}


void api_limit_error_response_free(api_limit_error_response_t *api_limit_error_response) {
    if(NULL == api_limit_error_response){
        return ;
    }
    listEntry_t *listEntry;
    if (api_limit_error_response->status) {
        api_response_status_type_free(api_limit_error_response->status);
        api_limit_error_response->status = NULL;
    }
    if (api_limit_error_response->errors) {
        list_ForEach(listEntry, api_limit_error_response->errors) {
            api_error_dto_free(listEntry->data);
        }
        list_freeList(api_limit_error_response->errors);
        api_limit_error_response->errors = NULL;
    }
    free(api_limit_error_response);
}

cJSON *api_limit_error_response_convertToJSON(api_limit_error_response_t *api_limit_error_response) {
    cJSON *item = cJSON_CreateObject();

    // api_limit_error_response->status
    if(api_limit_error_response->status != _api__api_limit_error_response__NULL) {
    cJSON *status_local_JSON = api_response_status_type_convertToJSON(api_limit_error_response->status);
    if(status_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "status", status_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // api_limit_error_response->errors
    if(api_limit_error_response->errors) {
    cJSON *errors = cJSON_AddArrayToObject(item, "errors");
    if(errors == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *errorsListEntry;
    if (api_limit_error_response->errors) {
    list_ForEach(errorsListEntry, api_limit_error_response->errors) {
    cJSON *itemLocal = api_error_dto_convertToJSON(errorsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(errors, itemLocal);
    }
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

api_limit_error_response_t *api_limit_error_response_parseFromJSON(cJSON *api_limit_error_responseJSON){

    api_limit_error_response_t *api_limit_error_response_local_var = NULL;

    // define the local variable for api_limit_error_response->status
    api_response_status_type_t *status_local_nonprim = NULL;

    // define the local list for api_limit_error_response->errors
    list_t *errorsList = NULL;

    // api_limit_error_response->status
    cJSON *status = cJSON_GetObjectItemCaseSensitive(api_limit_error_responseJSON, "status");
    if (status) { 
    status_local_nonprim = api_response_status_type_parseFromJSON(status); //custom
    }

    // api_limit_error_response->errors
    cJSON *errors = cJSON_GetObjectItemCaseSensitive(api_limit_error_responseJSON, "errors");
    if (errors) { 
    cJSON *errors_local_nonprimitive = NULL;
    if(!cJSON_IsArray(errors)){
        goto end; //nonprimitive container
    }

    errorsList = list_createList();

    cJSON_ArrayForEach(errors_local_nonprimitive,errors )
    {
        if(!cJSON_IsObject(errors_local_nonprimitive)){
            goto end;
        }
        api_error_dto_t *errorsItem = api_error_dto_parseFromJSON(errors_local_nonprimitive);

        list_addElement(errorsList, errorsItem);
    }
    }


    api_limit_error_response_local_var = api_limit_error_response_create (
        status ? status_local_nonprim : NULL,
        errors ? errorsList : NULL
        );

    return api_limit_error_response_local_var;
end:
    if (status_local_nonprim) {
        api_response_status_type_free(status_local_nonprim);
        status_local_nonprim = NULL;
    }
    if (errorsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, errorsList) {
            api_error_dto_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(errorsList);
        errorsList = NULL;
    }
    return NULL;

}
