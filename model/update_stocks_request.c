#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "update_stocks_request.h"



update_stocks_request_t *update_stocks_request_create(
    list_t *skus
    ) {
    update_stocks_request_t *update_stocks_request_local_var = malloc(sizeof(update_stocks_request_t));
    if (!update_stocks_request_local_var) {
        return NULL;
    }
    update_stocks_request_local_var->skus = skus;

    return update_stocks_request_local_var;
}


void update_stocks_request_free(update_stocks_request_t *update_stocks_request) {
    if(NULL == update_stocks_request){
        return ;
    }
    listEntry_t *listEntry;
    if (update_stocks_request->skus) {
        list_ForEach(listEntry, update_stocks_request->skus) {
            update_stock_dto_free(listEntry->data);
        }
        list_freeList(update_stocks_request->skus);
        update_stocks_request->skus = NULL;
    }
    free(update_stocks_request);
}

cJSON *update_stocks_request_convertToJSON(update_stocks_request_t *update_stocks_request) {
    cJSON *item = cJSON_CreateObject();

    // update_stocks_request->skus
    if (!update_stocks_request->skus) {
        goto fail;
    }
    cJSON *skus = cJSON_AddArrayToObject(item, "skus");
    if(skus == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *skusListEntry;
    if (update_stocks_request->skus) {
    list_ForEach(skusListEntry, update_stocks_request->skus) {
    cJSON *itemLocal = update_stock_dto_convertToJSON(skusListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(skus, itemLocal);
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

update_stocks_request_t *update_stocks_request_parseFromJSON(cJSON *update_stocks_requestJSON){

    update_stocks_request_t *update_stocks_request_local_var = NULL;

    // define the local list for update_stocks_request->skus
    list_t *skusList = NULL;

    // update_stocks_request->skus
    cJSON *skus = cJSON_GetObjectItemCaseSensitive(update_stocks_requestJSON, "skus");
    if (!skus) {
        goto end;
    }

    
    cJSON *skus_local_nonprimitive = NULL;
    if(!cJSON_IsArray(skus)){
        goto end; //nonprimitive container
    }

    skusList = list_createList();

    cJSON_ArrayForEach(skus_local_nonprimitive,skus )
    {
        if(!cJSON_IsObject(skus_local_nonprimitive)){
            goto end;
        }
        update_stock_dto_t *skusItem = update_stock_dto_parseFromJSON(skus_local_nonprimitive);

        list_addElement(skusList, skusItem);
    }


    update_stocks_request_local_var = update_stocks_request_create (
        skusList
        );

    return update_stocks_request_local_var;
end:
    if (skusList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, skusList) {
            update_stock_dto_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(skusList);
        skusList = NULL;
    }
    return NULL;

}
