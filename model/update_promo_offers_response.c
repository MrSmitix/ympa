#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "update_promo_offers_response.h"


char* update_promo_offers_response_status_ToString(_api__update_promo_offers_response__e status) {
    char* statusArray[] =  { "NULL", "OK", "ERROR" };
    return statusArray[status];
}

_api__update_promo_offers_response__e update_promo_offers_response_status_FromString(char* status){
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

update_promo_offers_response_t *update_promo_offers_response_create(
    api_response_status_type_t *status,
    update_promo_offers_result_dto_t *result
    ) {
    update_promo_offers_response_t *update_promo_offers_response_local_var = malloc(sizeof(update_promo_offers_response_t));
    if (!update_promo_offers_response_local_var) {
        return NULL;
    }
    update_promo_offers_response_local_var->status = status;
    update_promo_offers_response_local_var->result = result;

    return update_promo_offers_response_local_var;
}


void update_promo_offers_response_free(update_promo_offers_response_t *update_promo_offers_response) {
    if(NULL == update_promo_offers_response){
        return ;
    }
    listEntry_t *listEntry;
    if (update_promo_offers_response->status) {
        api_response_status_type_free(update_promo_offers_response->status);
        update_promo_offers_response->status = NULL;
    }
    if (update_promo_offers_response->result) {
        update_promo_offers_result_dto_free(update_promo_offers_response->result);
        update_promo_offers_response->result = NULL;
    }
    free(update_promo_offers_response);
}

cJSON *update_promo_offers_response_convertToJSON(update_promo_offers_response_t *update_promo_offers_response) {
    cJSON *item = cJSON_CreateObject();

    // update_promo_offers_response->status
    if(update_promo_offers_response->status != _api__update_promo_offers_response__NULL) {
    cJSON *status_local_JSON = api_response_status_type_convertToJSON(update_promo_offers_response->status);
    if(status_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "status", status_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // update_promo_offers_response->result
    if(update_promo_offers_response->result) {
    cJSON *result_local_JSON = update_promo_offers_result_dto_convertToJSON(update_promo_offers_response->result);
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

update_promo_offers_response_t *update_promo_offers_response_parseFromJSON(cJSON *update_promo_offers_responseJSON){

    update_promo_offers_response_t *update_promo_offers_response_local_var = NULL;

    // define the local variable for update_promo_offers_response->status
    api_response_status_type_t *status_local_nonprim = NULL;

    // define the local variable for update_promo_offers_response->result
    update_promo_offers_result_dto_t *result_local_nonprim = NULL;

    // update_promo_offers_response->status
    cJSON *status = cJSON_GetObjectItemCaseSensitive(update_promo_offers_responseJSON, "status");
    if (status) { 
    status_local_nonprim = api_response_status_type_parseFromJSON(status); //custom
    }

    // update_promo_offers_response->result
    cJSON *result = cJSON_GetObjectItemCaseSensitive(update_promo_offers_responseJSON, "result");
    if (result) { 
    result_local_nonprim = update_promo_offers_result_dto_parseFromJSON(result); //nonprimitive
    }


    update_promo_offers_response_local_var = update_promo_offers_response_create (
        status ? status_local_nonprim : NULL,
        result ? result_local_nonprim : NULL
        );

    return update_promo_offers_response_local_var;
end:
    if (status_local_nonprim) {
        api_response_status_type_free(status_local_nonprim);
        status_local_nonprim = NULL;
    }
    if (result_local_nonprim) {
        update_promo_offers_result_dto_free(result_local_nonprim);
        result_local_nonprim = NULL;
    }
    return NULL;

}
