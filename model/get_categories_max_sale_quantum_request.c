#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "get_categories_max_sale_quantum_request.h"



get_categories_max_sale_quantum_request_t *get_categories_max_sale_quantum_request_create(
    list_t *market_category_ids
    ) {
    get_categories_max_sale_quantum_request_t *get_categories_max_sale_quantum_request_local_var = malloc(sizeof(get_categories_max_sale_quantum_request_t));
    if (!get_categories_max_sale_quantum_request_local_var) {
        return NULL;
    }
    get_categories_max_sale_quantum_request_local_var->market_category_ids = market_category_ids;

    return get_categories_max_sale_quantum_request_local_var;
}


void get_categories_max_sale_quantum_request_free(get_categories_max_sale_quantum_request_t *get_categories_max_sale_quantum_request) {
    if(NULL == get_categories_max_sale_quantum_request){
        return ;
    }
    listEntry_t *listEntry;
    if (get_categories_max_sale_quantum_request->market_category_ids) {
        list_ForEach(listEntry, get_categories_max_sale_quantum_request->market_category_ids) {
            free(listEntry->data);
        }
        list_freeList(get_categories_max_sale_quantum_request->market_category_ids);
        get_categories_max_sale_quantum_request->market_category_ids = NULL;
    }
    free(get_categories_max_sale_quantum_request);
}

cJSON *get_categories_max_sale_quantum_request_convertToJSON(get_categories_max_sale_quantum_request_t *get_categories_max_sale_quantum_request) {
    cJSON *item = cJSON_CreateObject();

    // get_categories_max_sale_quantum_request->market_category_ids
    if (!get_categories_max_sale_quantum_request->market_category_ids) {
        goto fail;
    }
    cJSON *market_category_ids = cJSON_AddArrayToObject(item, "marketCategoryIds");
    if(market_category_ids == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *market_category_idsListEntry;
    list_ForEach(market_category_idsListEntry, get_categories_max_sale_quantum_request->market_category_ids) {
    if(cJSON_AddNumberToObject(market_category_ids, "", *(double *)market_category_idsListEntry->data) == NULL)
    {
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

get_categories_max_sale_quantum_request_t *get_categories_max_sale_quantum_request_parseFromJSON(cJSON *get_categories_max_sale_quantum_requestJSON){

    get_categories_max_sale_quantum_request_t *get_categories_max_sale_quantum_request_local_var = NULL;

    // define the local list for get_categories_max_sale_quantum_request->market_category_ids
    list_t *market_category_idsList = NULL;

    // get_categories_max_sale_quantum_request->market_category_ids
    cJSON *market_category_ids = cJSON_GetObjectItemCaseSensitive(get_categories_max_sale_quantum_requestJSON, "marketCategoryIds");
    if (!market_category_ids) {
        goto end;
    }

    
    cJSON *market_category_ids_local = NULL;
    if(!cJSON_IsArray(market_category_ids)) {
        goto end;//primitive container
    }
    market_category_idsList = list_createList();

    cJSON_ArrayForEach(market_category_ids_local, market_category_ids)
    {
        if(!cJSON_IsNumber(market_category_ids_local))
        {
            goto end;
        }
        double *market_category_ids_local_value = (double *)calloc(1, sizeof(double));
        if(!market_category_ids_local_value)
        {
            goto end;
        }
        *market_category_ids_local_value = market_category_ids_local->valuedouble;
        list_addElement(market_category_idsList , market_category_ids_local_value);
    }


    get_categories_max_sale_quantum_request_local_var = get_categories_max_sale_quantum_request_create (
        market_category_idsList
        );

    return get_categories_max_sale_quantum_request_local_var;
end:
    if (market_category_idsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, market_category_idsList) {
            free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(market_category_idsList);
        market_category_idsList = NULL;
    }
    return NULL;

}
