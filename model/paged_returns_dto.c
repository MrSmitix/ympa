#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "paged_returns_dto.h"



paged_returns_dto_t *paged_returns_dto_create(
    forward_scrolling_pager_dto_t *paging,
    list_t *returns
    ) {
    paged_returns_dto_t *paged_returns_dto_local_var = malloc(sizeof(paged_returns_dto_t));
    if (!paged_returns_dto_local_var) {
        return NULL;
    }
    paged_returns_dto_local_var->paging = paging;
    paged_returns_dto_local_var->returns = returns;

    return paged_returns_dto_local_var;
}


void paged_returns_dto_free(paged_returns_dto_t *paged_returns_dto) {
    if(NULL == paged_returns_dto){
        return ;
    }
    listEntry_t *listEntry;
    if (paged_returns_dto->paging) {
        forward_scrolling_pager_dto_free(paged_returns_dto->paging);
        paged_returns_dto->paging = NULL;
    }
    if (paged_returns_dto->returns) {
        list_ForEach(listEntry, paged_returns_dto->returns) {
            return_dto_free(listEntry->data);
        }
        list_freeList(paged_returns_dto->returns);
        paged_returns_dto->returns = NULL;
    }
    free(paged_returns_dto);
}

cJSON *paged_returns_dto_convertToJSON(paged_returns_dto_t *paged_returns_dto) {
    cJSON *item = cJSON_CreateObject();

    // paged_returns_dto->paging
    if(paged_returns_dto->paging) {
    cJSON *paging_local_JSON = forward_scrolling_pager_dto_convertToJSON(paged_returns_dto->paging);
    if(paging_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "paging", paging_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // paged_returns_dto->returns
    if (!paged_returns_dto->returns) {
        goto fail;
    }
    cJSON *returns = cJSON_AddArrayToObject(item, "returns");
    if(returns == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *returnsListEntry;
    if (paged_returns_dto->returns) {
    list_ForEach(returnsListEntry, paged_returns_dto->returns) {
    cJSON *itemLocal = return_dto_convertToJSON(returnsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(returns, itemLocal);
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

paged_returns_dto_t *paged_returns_dto_parseFromJSON(cJSON *paged_returns_dtoJSON){

    paged_returns_dto_t *paged_returns_dto_local_var = NULL;

    // define the local variable for paged_returns_dto->paging
    forward_scrolling_pager_dto_t *paging_local_nonprim = NULL;

    // define the local list for paged_returns_dto->returns
    list_t *returnsList = NULL;

    // paged_returns_dto->paging
    cJSON *paging = cJSON_GetObjectItemCaseSensitive(paged_returns_dtoJSON, "paging");
    if (paging) { 
    paging_local_nonprim = forward_scrolling_pager_dto_parseFromJSON(paging); //nonprimitive
    }

    // paged_returns_dto->returns
    cJSON *returns = cJSON_GetObjectItemCaseSensitive(paged_returns_dtoJSON, "returns");
    if (!returns) {
        goto end;
    }

    
    cJSON *returns_local_nonprimitive = NULL;
    if(!cJSON_IsArray(returns)){
        goto end; //nonprimitive container
    }

    returnsList = list_createList();

    cJSON_ArrayForEach(returns_local_nonprimitive,returns )
    {
        if(!cJSON_IsObject(returns_local_nonprimitive)){
            goto end;
        }
        return_dto_t *returnsItem = return_dto_parseFromJSON(returns_local_nonprimitive);

        list_addElement(returnsList, returnsItem);
    }


    paged_returns_dto_local_var = paged_returns_dto_create (
        paging ? paging_local_nonprim : NULL,
        returnsList
        );

    return paged_returns_dto_local_var;
end:
    if (paging_local_nonprim) {
        forward_scrolling_pager_dto_free(paging_local_nonprim);
        paging_local_nonprim = NULL;
    }
    if (returnsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, returnsList) {
            return_dto_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(returnsList);
        returnsList = NULL;
    }
    return NULL;

}
