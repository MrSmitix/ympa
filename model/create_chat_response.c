#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "create_chat_response.h"


char* create_chat_response_status_ToString(_api__create_chat_response__e status) {
    char* statusArray[] =  { "NULL", "OK", "ERROR" };
    return statusArray[status];
}

_api__create_chat_response__e create_chat_response_status_FromString(char* status){
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

create_chat_response_t *create_chat_response_create(
    api_response_status_type_t *status,
    create_chat_result_dto_t *result
    ) {
    create_chat_response_t *create_chat_response_local_var = malloc(sizeof(create_chat_response_t));
    if (!create_chat_response_local_var) {
        return NULL;
    }
    create_chat_response_local_var->status = status;
    create_chat_response_local_var->result = result;

    return create_chat_response_local_var;
}


void create_chat_response_free(create_chat_response_t *create_chat_response) {
    if(NULL == create_chat_response){
        return ;
    }
    listEntry_t *listEntry;
    if (create_chat_response->status) {
        api_response_status_type_free(create_chat_response->status);
        create_chat_response->status = NULL;
    }
    if (create_chat_response->result) {
        create_chat_result_dto_free(create_chat_response->result);
        create_chat_response->result = NULL;
    }
    free(create_chat_response);
}

cJSON *create_chat_response_convertToJSON(create_chat_response_t *create_chat_response) {
    cJSON *item = cJSON_CreateObject();

    // create_chat_response->status
    if(create_chat_response->status != _api__create_chat_response__NULL) {
    cJSON *status_local_JSON = api_response_status_type_convertToJSON(create_chat_response->status);
    if(status_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "status", status_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // create_chat_response->result
    if(create_chat_response->result) {
    cJSON *result_local_JSON = create_chat_result_dto_convertToJSON(create_chat_response->result);
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

create_chat_response_t *create_chat_response_parseFromJSON(cJSON *create_chat_responseJSON){

    create_chat_response_t *create_chat_response_local_var = NULL;

    // define the local variable for create_chat_response->status
    api_response_status_type_t *status_local_nonprim = NULL;

    // define the local variable for create_chat_response->result
    create_chat_result_dto_t *result_local_nonprim = NULL;

    // create_chat_response->status
    cJSON *status = cJSON_GetObjectItemCaseSensitive(create_chat_responseJSON, "status");
    if (status) { 
    status_local_nonprim = api_response_status_type_parseFromJSON(status); //custom
    }

    // create_chat_response->result
    cJSON *result = cJSON_GetObjectItemCaseSensitive(create_chat_responseJSON, "result");
    if (result) { 
    result_local_nonprim = create_chat_result_dto_parseFromJSON(result); //nonprimitive
    }


    create_chat_response_local_var = create_chat_response_create (
        status ? status_local_nonprim : NULL,
        result ? result_local_nonprim : NULL
        );

    return create_chat_response_local_var;
end:
    if (status_local_nonprim) {
        api_response_status_type_free(status_local_nonprim);
        status_local_nonprim = NULL;
    }
    if (result_local_nonprim) {
        create_chat_result_dto_free(result_local_nonprim);
        result_local_nonprim = NULL;
    }
    return NULL;

}
