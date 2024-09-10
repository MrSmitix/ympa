#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "get_shipment_response.h"


char* get_shipment_response_status_ToString(_api__get_shipment_response__e status) {
    char* statusArray[] =  { "NULL", "OK", "ERROR" };
    return statusArray[status];
}

_api__get_shipment_response__e get_shipment_response_status_FromString(char* status){
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

get_shipment_response_t *get_shipment_response_create(
    api_response_status_type_t *status,
    shipment_dto_t *result
    ) {
    get_shipment_response_t *get_shipment_response_local_var = malloc(sizeof(get_shipment_response_t));
    if (!get_shipment_response_local_var) {
        return NULL;
    }
    get_shipment_response_local_var->status = status;
    get_shipment_response_local_var->result = result;

    return get_shipment_response_local_var;
}


void get_shipment_response_free(get_shipment_response_t *get_shipment_response) {
    if(NULL == get_shipment_response){
        return ;
    }
    listEntry_t *listEntry;
    if (get_shipment_response->status) {
        api_response_status_type_free(get_shipment_response->status);
        get_shipment_response->status = NULL;
    }
    if (get_shipment_response->result) {
        shipment_dto_free(get_shipment_response->result);
        get_shipment_response->result = NULL;
    }
    free(get_shipment_response);
}

cJSON *get_shipment_response_convertToJSON(get_shipment_response_t *get_shipment_response) {
    cJSON *item = cJSON_CreateObject();

    // get_shipment_response->status
    if(get_shipment_response->status != _api__get_shipment_response__NULL) {
    cJSON *status_local_JSON = api_response_status_type_convertToJSON(get_shipment_response->status);
    if(status_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "status", status_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // get_shipment_response->result
    if(get_shipment_response->result) {
    cJSON *result_local_JSON = shipment_dto_convertToJSON(get_shipment_response->result);
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

get_shipment_response_t *get_shipment_response_parseFromJSON(cJSON *get_shipment_responseJSON){

    get_shipment_response_t *get_shipment_response_local_var = NULL;

    // define the local variable for get_shipment_response->status
    api_response_status_type_t *status_local_nonprim = NULL;

    // define the local variable for get_shipment_response->result
    shipment_dto_t *result_local_nonprim = NULL;

    // get_shipment_response->status
    cJSON *status = cJSON_GetObjectItemCaseSensitive(get_shipment_responseJSON, "status");
    if (status) { 
    status_local_nonprim = api_response_status_type_parseFromJSON(status); //custom
    }

    // get_shipment_response->result
    cJSON *result = cJSON_GetObjectItemCaseSensitive(get_shipment_responseJSON, "result");
    if (result) { 
    result_local_nonprim = shipment_dto_parseFromJSON(result); //nonprimitive
    }


    get_shipment_response_local_var = get_shipment_response_create (
        status ? status_local_nonprim : NULL,
        result ? result_local_nonprim : NULL
        );

    return get_shipment_response_local_var;
end:
    if (status_local_nonprim) {
        api_response_status_type_free(status_local_nonprim);
        status_local_nonprim = NULL;
    }
    if (result_local_nonprim) {
        shipment_dto_free(result_local_nonprim);
        result_local_nonprim = NULL;
    }
    return NULL;

}
