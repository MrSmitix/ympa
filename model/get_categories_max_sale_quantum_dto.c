#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "get_categories_max_sale_quantum_dto.h"



get_categories_max_sale_quantum_dto_t *get_categories_max_sale_quantum_dto_create(
    list_t *results,
    list_t *errors
    ) {
    get_categories_max_sale_quantum_dto_t *get_categories_max_sale_quantum_dto_local_var = malloc(sizeof(get_categories_max_sale_quantum_dto_t));
    if (!get_categories_max_sale_quantum_dto_local_var) {
        return NULL;
    }
    get_categories_max_sale_quantum_dto_local_var->results = results;
    get_categories_max_sale_quantum_dto_local_var->errors = errors;

    return get_categories_max_sale_quantum_dto_local_var;
}


void get_categories_max_sale_quantum_dto_free(get_categories_max_sale_quantum_dto_t *get_categories_max_sale_quantum_dto) {
    if(NULL == get_categories_max_sale_quantum_dto){
        return ;
    }
    listEntry_t *listEntry;
    if (get_categories_max_sale_quantum_dto->results) {
        list_ForEach(listEntry, get_categories_max_sale_quantum_dto->results) {
            max_sale_quantum_dto_free(listEntry->data);
        }
        list_freeList(get_categories_max_sale_quantum_dto->results);
        get_categories_max_sale_quantum_dto->results = NULL;
    }
    if (get_categories_max_sale_quantum_dto->errors) {
        list_ForEach(listEntry, get_categories_max_sale_quantum_dto->errors) {
            category_error_dto_free(listEntry->data);
        }
        list_freeList(get_categories_max_sale_quantum_dto->errors);
        get_categories_max_sale_quantum_dto->errors = NULL;
    }
    free(get_categories_max_sale_quantum_dto);
}

cJSON *get_categories_max_sale_quantum_dto_convertToJSON(get_categories_max_sale_quantum_dto_t *get_categories_max_sale_quantum_dto) {
    cJSON *item = cJSON_CreateObject();

    // get_categories_max_sale_quantum_dto->results
    if (!get_categories_max_sale_quantum_dto->results) {
        goto fail;
    }
    cJSON *results = cJSON_AddArrayToObject(item, "results");
    if(results == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *resultsListEntry;
    if (get_categories_max_sale_quantum_dto->results) {
    list_ForEach(resultsListEntry, get_categories_max_sale_quantum_dto->results) {
    cJSON *itemLocal = max_sale_quantum_dto_convertToJSON(resultsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(results, itemLocal);
    }
    }


    // get_categories_max_sale_quantum_dto->errors
    if(get_categories_max_sale_quantum_dto->errors) {
    cJSON *errors = cJSON_AddArrayToObject(item, "errors");
    if(errors == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *errorsListEntry;
    if (get_categories_max_sale_quantum_dto->errors) {
    list_ForEach(errorsListEntry, get_categories_max_sale_quantum_dto->errors) {
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

get_categories_max_sale_quantum_dto_t *get_categories_max_sale_quantum_dto_parseFromJSON(cJSON *get_categories_max_sale_quantum_dtoJSON){

    get_categories_max_sale_quantum_dto_t *get_categories_max_sale_quantum_dto_local_var = NULL;

    // define the local list for get_categories_max_sale_quantum_dto->results
    list_t *resultsList = NULL;

    // define the local list for get_categories_max_sale_quantum_dto->errors
    list_t *errorsList = NULL;

    // get_categories_max_sale_quantum_dto->results
    cJSON *results = cJSON_GetObjectItemCaseSensitive(get_categories_max_sale_quantum_dtoJSON, "results");
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

    // get_categories_max_sale_quantum_dto->errors
    cJSON *errors = cJSON_GetObjectItemCaseSensitive(get_categories_max_sale_quantum_dtoJSON, "errors");
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


    get_categories_max_sale_quantum_dto_local_var = get_categories_max_sale_quantum_dto_create (
        resultsList,
        errors ? errorsList : NULL
        );

    return get_categories_max_sale_quantum_dto_local_var;
end:
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
