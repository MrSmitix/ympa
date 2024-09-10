#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "update_stock_dto.h"



update_stock_dto_t *update_stock_dto_create(
    char *sku,
    list_t *items
    ) {
    update_stock_dto_t *update_stock_dto_local_var = malloc(sizeof(update_stock_dto_t));
    if (!update_stock_dto_local_var) {
        return NULL;
    }
    update_stock_dto_local_var->sku = sku;
    update_stock_dto_local_var->items = items;

    return update_stock_dto_local_var;
}


void update_stock_dto_free(update_stock_dto_t *update_stock_dto) {
    if(NULL == update_stock_dto){
        return ;
    }
    listEntry_t *listEntry;
    if (update_stock_dto->sku) {
        free(update_stock_dto->sku);
        update_stock_dto->sku = NULL;
    }
    if (update_stock_dto->items) {
        list_ForEach(listEntry, update_stock_dto->items) {
            update_stock_item_dto_free(listEntry->data);
        }
        list_freeList(update_stock_dto->items);
        update_stock_dto->items = NULL;
    }
    free(update_stock_dto);
}

cJSON *update_stock_dto_convertToJSON(update_stock_dto_t *update_stock_dto) {
    cJSON *item = cJSON_CreateObject();

    // update_stock_dto->sku
    if (!update_stock_dto->sku) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "sku", update_stock_dto->sku) == NULL) {
    goto fail; //String
    }


    // update_stock_dto->items
    if (!update_stock_dto->items) {
        goto fail;
    }
    cJSON *items = cJSON_AddArrayToObject(item, "items");
    if(items == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *itemsListEntry;
    if (update_stock_dto->items) {
    list_ForEach(itemsListEntry, update_stock_dto->items) {
    cJSON *itemLocal = update_stock_item_dto_convertToJSON(itemsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(items, itemLocal);
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

update_stock_dto_t *update_stock_dto_parseFromJSON(cJSON *update_stock_dtoJSON){

    update_stock_dto_t *update_stock_dto_local_var = NULL;

    // define the local list for update_stock_dto->items
    list_t *itemsList = NULL;

    // update_stock_dto->sku
    cJSON *sku = cJSON_GetObjectItemCaseSensitive(update_stock_dtoJSON, "sku");
    if (!sku) {
        goto end;
    }

    
    if(!cJSON_IsString(sku))
    {
    goto end; //String
    }

    // update_stock_dto->items
    cJSON *items = cJSON_GetObjectItemCaseSensitive(update_stock_dtoJSON, "items");
    if (!items) {
        goto end;
    }

    
    cJSON *items_local_nonprimitive = NULL;
    if(!cJSON_IsArray(items)){
        goto end; //nonprimitive container
    }

    itemsList = list_createList();

    cJSON_ArrayForEach(items_local_nonprimitive,items )
    {
        if(!cJSON_IsObject(items_local_nonprimitive)){
            goto end;
        }
        update_stock_item_dto_t *itemsItem = update_stock_item_dto_parseFromJSON(items_local_nonprimitive);

        list_addElement(itemsList, itemsItem);
    }


    update_stock_dto_local_var = update_stock_dto_create (
        strdup(sku->valuestring),
        itemsList
        );

    return update_stock_dto_local_var;
end:
    if (itemsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, itemsList) {
            update_stock_item_dto_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(itemsList);
        itemsList = NULL;
    }
    return NULL;

}
