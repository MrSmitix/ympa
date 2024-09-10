#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "get_categories_max_sale_quantum_response.h"


char* get_categories_max_sale_quantum_response_status_ToString(_api__get_categories_max_sale_quantum_response__e status) {
    char* statusArray[] =  { "NULL", "OK", "ERROR" };
    return statusArray[status];
}

_api__get_categories_max_sale_quantum_response__e get_categories_max_sale_quantum_response_status_FromString(char* status){
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

get_categories_max_sale_quantum_response_t *get_categories_max_sale_quantum_response_create(
    api_response_status_type_t *status,
    list_t *results,
    list_t *errors
    ) {
    get_categories_max_sale_quantum_response_t *get_categories_max_sale_quantum_response_local_var = malloc(sizeof(get_categories_max_sale_quantum_response_t));
    if (!get_categories_max_sale_quantum_response_local_var) {
        return NULL;
    }
    get_categories_max_sale_quantum_response_local_var->status = status;
    get_categories_max_sale_quantum_response_local_var->results = results;
    get_categories_max_sale_quantum_response_local_var->errors = errors;

    return get_categories_max_sale_quantum_response_local_var;
}


void get_categories_max_sale_quantum_response_free(get_categories_max_sale_quantum_response_t *get_categories_max_sale_quantum_response) {
    if(NULL == get_categories_max_sale_quantum_response){
        return ;
    }
    listEntry_t *listEntry;
    if (get_categories_max_sale_quantum_response->status) {
        api_response_status_type_free(get_categories_max_sale_quantum_response->status);
        get_categories_max_sale_quantum_response->status = NULL;
    }
    if (get_categories_max_sale_quantum_response->results) {
        list_ForEach(listEntry, get_categories_max_sale_quantum_response->results) {
            max_sale_quantum_dto_free(listEntry->data);
        }
        list_freeList(get_categories_max_sale_quantum_response->results);
        get_categories_max_sale_quantum_response->results = NULL;
    }
    if (get_categories_max_sale_quantum_response->errors) {
        list_ForEach(listEntry, get_categories_max_sale_quantum_response->errors) {
            category_error_dto_free(listEntry->data);
        }
        list_freeList(get_categories_max_sale_quantum_response->errors);
        get_categories_max_sale_quantum_response->errors = NULL;
    }
    free(get_categories_max_sale_quantum_response);
}

cJSON *get_categories_max_sale_quantum_response_convertToJSON(get_categories_max_sale_quantum_response_t *get_categories_max_sale_quantum_response) {
    cJSON *item = cJSON_CreateObject();

    // get_categories_max_sale_quantum_response->status
    if(get_categories_max_sale_quantum_response->status != _api__get_categories_max_sale_quantum_response__NULL) {
    cJSON *status_local_JSON = api_response_status_type_convertToJSON(get_categories_max_sale_quantum_response->status);
    if(status_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "status", status_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // get_categories_max_sale_quantum_response->results
    if (!get_categories_max_sale_quantum_response->results) {
        goto fail;
    }
    cJSON *results = cJSON_AddArrayToObject(item, "results");
    if(results == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *resultsListEntry;
    if (get_categories_max_sale_quantum_response->results) {
    list_ForEach(resultsListEntry, get_categories_max_sale_quantum_response->results) {
    cJSON *itemLocal = max_sale_quantum_dto_convertToJSON(resultsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(results, itemLocal);
    }
    }


    // get_categories_max_sale_quantum_response->errors
    if(get_categories_max_sale_quantum_response->errors) {
    cJSON *errors = cJSON_AddArrayToObject(item, "errors");
    if(errors == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *errorsListEntry;
    if (get_categories_max_sale_quantum_response->errors) {
    list_ForEach(errorsListEntry, get_categories_max_sale_quantum_response->errors) {
    cJSON *itemLocal = category_error_dto_convertToJSON(errorsListEntry->data);
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

get_categories_max_sale_quantum_response_t *get_categories_max_sale_quantum_response_parseFromJSON(cJSON *get_categories_max_sale_quantum_responseJSON){

    get_categories_max_sale_quantum_response_t *get_categories_max_sale_quantum_response_local_var = NULL;

    // define the local variable for get_categories_max_sale_quantum_response->status
    api_response_status_type_t *status_local_nonprim = NULL;

    // define the local list for get_categories_max_sale_quantum_response->results
    list_t *resultsList = NULL;

    // define the local list for get_categories_max_sale_quantum_response->errors
    list_t *errorsList = NULL;

    // get_categories_max_sale_quantum_response->status
    cJSON *status = cJSON_GetObjectItemCaseSensitive(get_categories_max_sale_quantum_responseJSON, "status");
    if (status) { 
    status_local_nonprim = api_response_status_type_parseFromJSON(status); //custom
    }

    // get_categories_max_sale_quantum_response->results
    cJSON *results = cJSON_GetObjectItemCaseSensitive(get_categories_max_sale_quantum_responseJSON, "results");
    if (!results) {
        goto end;
    }

    
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
        max_sale_quantum_dto_t *resultsItem = max_sale_quantum_dto_parseFromJSON(results_local_nonprimitive);

        list_addElement(resultsList, resultsItem);
    }

    // get_categories_max_sale_quantum_response->errors
    cJSON *errors = cJSON_GetObjectItemCaseSensitive(get_categories_max_sale_quantum_responseJSON, "errors");
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
        category_error_dto_t *errorsItem = category_error_dto_parseFromJSON(errors_local_nonprimitive);

        list_addElement(errorsList, errorsItem);
    }
    }


    get_categories_max_sale_quantum_response_local_var = get_categories_max_sale_quantum_response_create (
        status ? status_local_nonprim : NULL,
        resultsList,
        errors ? errorsList : NULL
        );

    return get_categories_max_sale_quantum_response_local_var;
end:
    if (status_local_nonprim) {
        api_response_status_type_free(status_local_nonprim);
        status_local_nonprim = NULL;
    }
    if (resultsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, resultsList) {
            max_sale_quantum_dto_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(resultsList);
        resultsList = NULL;
    }
    if (errorsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, errorsList) {
            category_error_dto_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(errorsList);
        errorsList = NULL;
    }
    return NULL;

}
