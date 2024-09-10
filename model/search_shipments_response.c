#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "search_shipments_response.h"


char* search_shipments_response_status_ToString(_api__search_shipments_response__e status) {
    char* statusArray[] =  { "NULL", "OK", "ERROR" };
    return statusArray[status];
}

_api__search_shipments_response__e search_shipments_response_status_FromString(char* status){
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

search_shipments_response_t *search_shipments_response_create(
    api_response_status_type_t *status,
    search_shipments_response_dto_t *result
    ) {
    search_shipments_response_t *search_shipments_response_local_var = malloc(sizeof(search_shipments_response_t));
    if (!search_shipments_response_local_var) {
        return NULL;
    }
    search_shipments_response_local_var->status = status;
    search_shipments_response_local_var->result = result;

    return search_shipments_response_local_var;
}


void search_shipments_response_free(search_shipments_response_t *search_shipments_response) {
    if(NULL == search_shipments_response){
        return ;
    }
    listEntry_t *listEntry;
    if (search_shipments_response->status) {
        api_response_status_type_free(search_shipments_response->status);
        search_shipments_response->status = NULL;
    }
    if (search_shipments_response->result) {
        search_shipments_response_dto_free(search_shipments_response->result);
        search_shipments_response->result = NULL;
    }
    free(search_shipments_response);
}

cJSON *search_shipments_response_convertToJSON(search_shipments_response_t *search_shipments_response) {
    cJSON *item = cJSON_CreateObject();

    // search_shipments_response->status
    if(search_shipments_response->status != _api__search_shipments_response__NULL) {
    cJSON *status_local_JSON = api_response_status_type_convertToJSON(search_shipments_response->status);
    if(status_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "status", status_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // search_shipments_response->result
    if(search_shipments_response->result) {
    cJSON *result_local_JSON = search_shipments_response_dto_convertToJSON(search_shipments_response->result);
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

search_shipments_response_t *search_shipments_response_parseFromJSON(cJSON *search_shipments_responseJSON){

    search_shipments_response_t *search_shipments_response_local_var = NULL;

    // define the local variable for search_shipments_response->status
    api_response_status_type_t *status_local_nonprim = NULL;

    // define the local variable for search_shipments_response->result
    search_shipments_response_dto_t *result_local_nonprim = NULL;

    // search_shipments_response->status
    cJSON *status = cJSON_GetObjectItemCaseSensitive(search_shipments_responseJSON, "status");
    if (status) { 
    status_local_nonprim = api_response_status_type_parseFromJSON(status); //custom
    }

    // search_shipments_response->result
    cJSON *result = cJSON_GetObjectItemCaseSensitive(search_shipments_responseJSON, "result");
    if (result) { 
    result_local_nonprim = search_shipments_response_dto_parseFromJSON(result); //nonprimitive
    }


    search_shipments_response_local_var = search_shipments_response_create (
        status ? status_local_nonprim : NULL,
        result ? result_local_nonprim : NULL
        );

    return search_shipments_response_local_var;
end:
    if (status_local_nonprim) {
        api_response_status_type_free(status_local_nonprim);
        status_local_nonprim = NULL;
    }
    if (result_local_nonprim) {
        search_shipments_response_dto_free(result_local_nonprim);
        result_local_nonprim = NULL;
    }
    return NULL;

}
