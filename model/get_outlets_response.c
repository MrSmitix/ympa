#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "get_outlets_response.h"



get_outlets_response_t *get_outlets_response_create(
    list_t *outlets,
    scrolling_pager_dto_t *paging,
    flipping_pager_dto_t *pager
    ) {
    get_outlets_response_t *get_outlets_response_local_var = malloc(sizeof(get_outlets_response_t));
    if (!get_outlets_response_local_var) {
        return NULL;
    }
    get_outlets_response_local_var->outlets = outlets;
    get_outlets_response_local_var->paging = paging;
    get_outlets_response_local_var->pager = pager;

    return get_outlets_response_local_var;
}


void get_outlets_response_free(get_outlets_response_t *get_outlets_response) {
    if(NULL == get_outlets_response){
        return ;
    }
    listEntry_t *listEntry;
    if (get_outlets_response->outlets) {
        list_ForEach(listEntry, get_outlets_response->outlets) {
            full_outlet_dto_free(listEntry->data);
        }
        list_freeList(get_outlets_response->outlets);
        get_outlets_response->outlets = NULL;
    }
    if (get_outlets_response->paging) {
        scrolling_pager_dto_free(get_outlets_response->paging);
        get_outlets_response->paging = NULL;
    }
    if (get_outlets_response->pager) {
        flipping_pager_dto_free(get_outlets_response->pager);
        get_outlets_response->pager = NULL;
    }
    free(get_outlets_response);
}

cJSON *get_outlets_response_convertToJSON(get_outlets_response_t *get_outlets_response) {
    cJSON *item = cJSON_CreateObject();

    // get_outlets_response->outlets
    if (!get_outlets_response->outlets) {
        goto fail;
    }
    cJSON *outlets = cJSON_AddArrayToObject(item, "outlets");
    if(outlets == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *outletsListEntry;
    if (get_outlets_response->outlets) {
    list_ForEach(outletsListEntry, get_outlets_response->outlets) {
    cJSON *itemLocal = full_outlet_dto_convertToJSON(outletsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(outlets, itemLocal);
    }
    }


    // get_outlets_response->paging
    if(get_outlets_response->paging) {
    cJSON *paging_local_JSON = scrolling_pager_dto_convertToJSON(get_outlets_response->paging);
    if(paging_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "paging", paging_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // get_outlets_response->pager
    if(get_outlets_response->pager) {
    cJSON *pager_local_JSON = flipping_pager_dto_convertToJSON(get_outlets_response->pager);
    if(pager_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "pager", pager_local_JSON);
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

get_outlets_response_t *get_outlets_response_parseFromJSON(cJSON *get_outlets_responseJSON){

    get_outlets_response_t *get_outlets_response_local_var = NULL;

    // define the local list for get_outlets_response->outlets
    list_t *outletsList = NULL;

    // define the local variable for get_outlets_response->paging
    scrolling_pager_dto_t *paging_local_nonprim = NULL;

    // define the local variable for get_outlets_response->pager
    flipping_pager_dto_t *pager_local_nonprim = NULL;

    // get_outlets_response->outlets
    cJSON *outlets = cJSON_GetObjectItemCaseSensitive(get_outlets_responseJSON, "outlets");
    if (!outlets) {
        goto end;
    }

    
    cJSON *outlets_local_nonprimitive = NULL;
    if(!cJSON_IsArray(outlets)){
        goto end; //nonprimitive container
    }

    outletsList = list_createList();

    cJSON_ArrayForEach(outlets_local_nonprimitive,outlets )
    {
        if(!cJSON_IsObject(outlets_local_nonprimitive)){
            goto end;
        }
        full_outlet_dto_t *outletsItem = full_outlet_dto_parseFromJSON(outlets_local_nonprimitive);

        list_addElement(outletsList, outletsItem);
    }

    // get_outlets_response->paging
    cJSON *paging = cJSON_GetObjectItemCaseSensitive(get_outlets_responseJSON, "paging");
    if (paging) { 
    paging_local_nonprim = scrolling_pager_dto_parseFromJSON(paging); //nonprimitive
    }

    // get_outlets_response->pager
    cJSON *pager = cJSON_GetObjectItemCaseSensitive(get_outlets_responseJSON, "pager");
    if (pager) { 
    pager_local_nonprim = flipping_pager_dto_parseFromJSON(pager); //nonprimitive
    }


    get_outlets_response_local_var = get_outlets_response_create (
        outletsList,
        paging ? paging_local_nonprim : NULL,
        pager ? pager_local_nonprim : NULL
        );

    return get_outlets_response_local_var;
end:
    if (outletsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, outletsList) {
            full_outlet_dto_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(outletsList);
        outletsList = NULL;
    }
    if (paging_local_nonprim) {
        scrolling_pager_dto_free(paging_local_nonprim);
        paging_local_nonprim = NULL;
    }
    if (pager_local_nonprim) {
        flipping_pager_dto_free(pager_local_nonprim);
        pager_local_nonprim = NULL;
    }
    return NULL;

}
