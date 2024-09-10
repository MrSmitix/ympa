#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "put_sku_bids_request.h"



put_sku_bids_request_t *put_sku_bids_request_create(
    list_t *bids
    ) {
    put_sku_bids_request_t *put_sku_bids_request_local_var = malloc(sizeof(put_sku_bids_request_t));
    if (!put_sku_bids_request_local_var) {
        return NULL;
    }
    put_sku_bids_request_local_var->bids = bids;

    return put_sku_bids_request_local_var;
}


void put_sku_bids_request_free(put_sku_bids_request_t *put_sku_bids_request) {
    if(NULL == put_sku_bids_request){
        return ;
    }
    listEntry_t *listEntry;
    if (put_sku_bids_request->bids) {
        list_ForEach(listEntry, put_sku_bids_request->bids) {
            sku_bid_item_dto_free(listEntry->data);
        }
        list_freeList(put_sku_bids_request->bids);
        put_sku_bids_request->bids = NULL;
    }
    free(put_sku_bids_request);
}

cJSON *put_sku_bids_request_convertToJSON(put_sku_bids_request_t *put_sku_bids_request) {
    cJSON *item = cJSON_CreateObject();

    // put_sku_bids_request->bids
    if (!put_sku_bids_request->bids) {
        goto fail;
    }
    cJSON *bids = cJSON_AddArrayToObject(item, "bids");
    if(bids == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *bidsListEntry;
    if (put_sku_bids_request->bids) {
    list_ForEach(bidsListEntry, put_sku_bids_request->bids) {
    cJSON *itemLocal = sku_bid_item_dto_convertToJSON(bidsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(bids, itemLocal);
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

put_sku_bids_request_t *put_sku_bids_request_parseFromJSON(cJSON *put_sku_bids_requestJSON){

    put_sku_bids_request_t *put_sku_bids_request_local_var = NULL;

    // define the local list for put_sku_bids_request->bids
    list_t *bidsList = NULL;

    // put_sku_bids_request->bids
    cJSON *bids = cJSON_GetObjectItemCaseSensitive(put_sku_bids_requestJSON, "bids");
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


    put_sku_bids_request_local_var = put_sku_bids_request_create (
        bidsList
        );

    return put_sku_bids_request_local_var;
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
    return NULL;

}
