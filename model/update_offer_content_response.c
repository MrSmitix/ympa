#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "update_offer_content_response.h"


char* update_offer_content_response_status_ToString(_api__update_offer_content_response__e status) {
    char* statusArray[] =  { "NULL", "OK", "ERROR" };
    return statusArray[status];
}

_api__update_offer_content_response__e update_offer_content_response_status_FromString(char* status){
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

update_offer_content_response_t *update_offer_content_response_create(
    api_response_status_type_t *status,
    list_t *results
    ) {
    update_offer_content_response_t *update_offer_content_response_local_var = malloc(sizeof(update_offer_content_response_t));
    if (!update_offer_content_response_local_var) {
        return NULL;
    }
    update_offer_content_response_local_var->status = status;
    update_offer_content_response_local_var->results = results;

    return update_offer_content_response_local_var;
}


void update_offer_content_response_free(update_offer_content_response_t *update_offer_content_response) {
    if(NULL == update_offer_content_response){
        return ;
    }
    listEntry_t *listEntry;
    if (update_offer_content_response->status) {
        api_response_status_type_free(update_offer_content_response->status);
        update_offer_content_response->status = NULL;
    }
    if (update_offer_content_response->results) {
        list_ForEach(listEntry, update_offer_content_response->results) {
            update_offer_content_result_dto_free(listEntry->data);
        }
        list_freeList(update_offer_content_response->results);
        update_offer_content_response->results = NULL;
    }
    free(update_offer_content_response);
}

cJSON *update_offer_content_response_convertToJSON(update_offer_content_response_t *update_offer_content_response) {
    cJSON *item = cJSON_CreateObject();

    // update_offer_content_response->status
    if(update_offer_content_response->status != _api__update_offer_content_response__NULL) {
    cJSON *status_local_JSON = api_response_status_type_convertToJSON(update_offer_content_response->status);
    if(status_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "status", status_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // update_offer_content_response->results
    if(update_offer_content_response->results) {
    cJSON *results = cJSON_AddArrayToObject(item, "results");
    if(results == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *resultsListEntry;
    if (update_offer_content_response->results) {
    list_ForEach(resultsListEntry, update_offer_content_response->results) {
    cJSON *itemLocal = update_offer_content_result_dto_convertToJSON(resultsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(results, itemLocal);
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

update_offer_content_response_t *update_offer_content_response_parseFromJSON(cJSON *update_offer_content_responseJSON){

    update_offer_content_response_t *update_offer_content_response_local_var = NULL;

    // define the local variable for update_offer_content_response->status
    api_response_status_type_t *status_local_nonprim = NULL;

    // define the local list for update_offer_content_response->results
    list_t *resultsList = NULL;

    // update_offer_content_response->status
    cJSON *status = cJSON_GetObjectItemCaseSensitive(update_offer_content_responseJSON, "status");
    if (status) { 
    status_local_nonprim = api_response_status_type_parseFromJSON(status); //custom
    }

    // update_offer_content_response->results
    cJSON *results = cJSON_GetObjectItemCaseSensitive(update_offer_content_responseJSON, "results");
    if (results) { 
    cJSON *results_local_nonprimitive = NULL;
    if(!cJSON_IsArray(results)){
        goto end; //nonprimitive container
    }

    resultsList = list_createList();

    cJSON_ArrayForEach(results_local_nonprimitive,results )
    {
        if(!cJSON_IsObject(results_local_nonprimitive)){
            goto end;
        }
        update_offer_content_result_dto_t *resultsItem = update_offer_content_result_dto_parseFromJSON(results_local_nonprimitive);

        list_addElement(resultsList, resultsItem);
    }
    }


    update_offer_content_response_local_var = update_offer_content_response_create (
        status ? status_local_nonprim : NULL,
        results ? resultsList : NULL
        );

    return update_offer_content_response_local_var;
end:
    if (status_local_nonprim) {
        api_response_status_type_free(status_local_nonprim);
        status_local_nonprim = NULL;
    }
    if (resultsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, resultsList) {
            update_offer_content_result_dto_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(resultsList);
        resultsList = NULL;
    }
    return NULL;

}
