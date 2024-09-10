#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "get_bids_info_response_dto.h"



get_bids_info_response_dto_t *get_bids_info_response_dto_create(
    list_t *bids,
    forward_scrolling_pager_dto_t *paging
    ) {
    get_bids_info_response_dto_t *get_bids_info_response_dto_local_var = malloc(sizeof(get_bids_info_response_dto_t));
    if (!get_bids_info_response_dto_local_var) {
        return NULL;
    }
    get_bids_info_response_dto_local_var->bids = bids;
    get_bids_info_response_dto_local_var->paging = paging;

    return get_bids_info_response_dto_local_var;
}


void get_bids_info_response_dto_free(get_bids_info_response_dto_t *get_bids_info_response_dto) {
    if(NULL == get_bids_info_response_dto){
        return ;
    }
    listEntry_t *listEntry;
    if (get_bids_info_response_dto->bids) {
        list_ForEach(listEntry, get_bids_info_response_dto->bids) {
            sku_bid_item_dto_free(listEntry->data);
        }
        list_freeList(get_bids_info_response_dto->bids);
        get_bids_info_response_dto->bids = NULL;
    }
    if (get_bids_info_response_dto->paging) {
        forward_scrolling_pager_dto_free(get_bids_info_response_dto->paging);
        get_bids_info_response_dto->paging = NULL;
    }
    free(get_bids_info_response_dto);
}

cJSON *get_bids_info_response_dto_convertToJSON(get_bids_info_response_dto_t *get_bids_info_response_dto) {
    cJSON *item = cJSON_CreateObject();

    // get_bids_info_response_dto->bids
    if (!get_bids_info_response_dto->bids) {
        goto fail;
    }
    cJSON *bids = cJSON_AddArrayToObject(item, "bids");
    if(bids == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *bidsListEntry;
    if (get_bids_info_response_dto->bids) {
    list_ForEach(bidsListEntry, get_bids_info_response_dto->bids) {
    cJSON *itemLocal = sku_bid_item_dto_convertToJSON(bidsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(bids, itemLocal);
    }
    }


    // get_bids_info_response_dto->paging
    if(get_bids_info_response_dto->paging) {
    cJSON *paging_local_JSON = forward_scrolling_pager_dto_convertToJSON(get_bids_info_response_dto->paging);
    if(paging_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "paging", paging_local_JSON);
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

get_bids_info_response_dto_t *get_bids_info_response_dto_parseFromJSON(cJSON *get_bids_info_response_dtoJSON){

    get_bids_info_response_dto_t *get_bids_info_response_dto_local_var = NULL;

    // define the local list for get_bids_info_response_dto->bids
    list_t *bidsList = NULL;

    // define the local variable for get_bids_info_response_dto->paging
    forward_scrolling_pager_dto_t *paging_local_nonprim = NULL;

    // get_bids_info_response_dto->bids
    cJSON *bids = cJSON_GetObjectItemCaseSensitive(get_bids_info_response_dtoJSON, "bids");
    if (!bids) {
        goto end;
    }

    
    cJSON *bids_local_nonprimitive = NULL;
    if(!cJSON_IsArray(bids)){
        goto end; //nonprimitive container
    }

    bidsList = list_createList();

    cJSON_ArrayForEach(bids_local_nonprimitive,bids )
    {
        if(!cJSON_IsObject(bids_local_nonprimitive)){
            goto end;
        }
        sku_bid_item_dto_t *bidsItem = sku_bid_item_dto_parseFromJSON(bids_local_nonprimitive);

        list_addElement(bidsList, bidsItem);
    }

    // get_bids_info_response_dto->paging
    cJSON *paging = cJSON_GetObjectItemCaseSensitive(get_bids_info_response_dtoJSON, "paging");
    if (paging) { 
    paging_local_nonprim = forward_scrolling_pager_dto_parseFromJSON(paging); //nonprimitive
    }


    get_bids_info_response_dto_local_var = get_bids_info_response_dto_create (
        bidsList,
        paging ? paging_local_nonprim : NULL
        );

    return get_bids_info_response_dto_local_var;
end:
    if (bidsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, bidsList) {
            sku_bid_item_dto_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(bidsList);
        bidsList = NULL;
    }
    if (paging_local_nonprim) {
        forward_scrolling_pager_dto_free(paging_local_nonprim);
        paging_local_nonprim = NULL;
    }
    return NULL;

}
