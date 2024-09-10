#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "add_offers_to_archive_response.h"


char* add_offers_to_archive_response_status_ToString(_api__add_offers_to_archive_response__e status) {
    char* statusArray[] =  { "NULL", "OK", "ERROR" };
    return statusArray[status];
}

_api__add_offers_to_archive_response__e add_offers_to_archive_response_status_FromString(char* status){
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

add_offers_to_archive_response_t *add_offers_to_archive_response_create(
    api_response_status_type_t *status,
    add_offers_to_archive_dto_t *result
    ) {
    add_offers_to_archive_response_t *add_offers_to_archive_response_local_var = malloc(sizeof(add_offers_to_archive_response_t));
    if (!add_offers_to_archive_response_local_var) {
        return NULL;
    }
    add_offers_to_archive_response_local_var->status = status;
    add_offers_to_archive_response_local_var->result = result;

    return add_offers_to_archive_response_local_var;
}


void add_offers_to_archive_response_free(add_offers_to_archive_response_t *add_offers_to_archive_response) {
    if(NULL == add_offers_to_archive_response){
        return ;
    }
    listEntry_t *listEntry;
    if (add_offers_to_archive_response->status) {
        api_response_status_type_free(add_offers_to_archive_response->status);
        add_offers_to_archive_response->status = NULL;
    }
    if (add_offers_to_archive_response->result) {
        add_offers_to_archive_dto_free(add_offers_to_archive_response->result);
        add_offers_to_archive_response->result = NULL;
    }
    free(add_offers_to_archive_response);
}

cJSON *add_offers_to_archive_response_convertToJSON(add_offers_to_archive_response_t *add_offers_to_archive_response) {
    cJSON *item = cJSON_CreateObject();

    // add_offers_to_archive_response->status
    if(add_offers_to_archive_response->status != _api__add_offers_to_archive_response__NULL) {
    cJSON *status_local_JSON = api_response_status_type_convertToJSON(add_offers_to_archive_response->status);
    if(status_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "status", status_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // add_offers_to_archive_response->result
    if(add_offers_to_archive_response->result) {
    cJSON *result_local_JSON = add_offers_to_archive_dto_convertToJSON(add_offers_to_archive_response->result);
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

add_offers_to_archive_response_t *add_offers_to_archive_response_parseFromJSON(cJSON *add_offers_to_archive_responseJSON){

    add_offers_to_archive_response_t *add_offers_to_archive_response_local_var = NULL;

    // define the local variable for add_offers_to_archive_response->status
    api_response_status_type_t *status_local_nonprim = NULL;

    // define the local variable for add_offers_to_archive_response->result
    add_offers_to_archive_dto_t *result_local_nonprim = NULL;

    // add_offers_to_archive_response->status
    cJSON *status = cJSON_GetObjectItemCaseSensitive(add_offers_to_archive_responseJSON, "status");
    if (status) { 
    status_local_nonprim = api_response_status_type_parseFromJSON(status); //custom
    }

    // add_offers_to_archive_response->result
    cJSON *result = cJSON_GetObjectItemCaseSensitive(add_offers_to_archive_responseJSON, "result");
    if (result) { 
    result_local_nonprim = add_offers_to_archive_dto_parseFromJSON(result); //nonprimitive
    }


    add_offers_to_archive_response_local_var = add_offers_to_archive_response_create (
        status ? status_local_nonprim : NULL,
        result ? result_local_nonprim : NULL
        );

    return add_offers_to_archive_response_local_var;
end:
    if (status_local_nonprim) {
        api_response_status_type_free(status_local_nonprim);
        status_local_nonprim = NULL;
    }
    if (result_local_nonprim) {
        add_offers_to_archive_dto_free(result_local_nonprim);
        result_local_nonprim = NULL;
    }
    return NULL;

}
