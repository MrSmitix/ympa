#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "order_items_modification_result_dto.h"



order_items_modification_result_dto_t *order_items_modification_result_dto_create(
    list_t *items
    ) {
    order_items_modification_result_dto_t *order_items_modification_result_dto_local_var = malloc(sizeof(order_items_modification_result_dto_t));
    if (!order_items_modification_result_dto_local_var) {
        return NULL;
    }
    order_items_modification_result_dto_local_var->items = items;

    return order_items_modification_result_dto_local_var;
}


void order_items_modification_result_dto_free(order_items_modification_result_dto_t *order_items_modification_result_dto) {
    if(NULL == order_items_modification_result_dto){
        return ;
    }
    listEntry_t *listEntry;
    if (order_items_modification_result_dto->items) {
        list_ForEach(listEntry, order_items_modification_result_dto->items) {
            brief_order_item_dto_free(listEntry->data);
        }
        list_freeList(order_items_modification_result_dto->items);
        order_items_modification_result_dto->items = NULL;
    }
    free(order_items_modification_result_dto);
}

cJSON *order_items_modification_result_dto_convertToJSON(order_items_modification_result_dto_t *order_items_modification_result_dto) {
    cJSON *item = cJSON_CreateObject();

    // order_items_modification_result_dto->items
    if (!order_items_modification_result_dto->items) {
        goto fail;
    }
    cJSON *items = cJSON_AddArrayToObject(item, "items");
    if(items == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *itemsListEntry;
    if (order_items_modification_result_dto->items) {
    list_ForEach(itemsListEntry, order_items_modification_result_dto->items) {
    cJSON *itemLocal = brief_order_item_dto_convertToJSON(itemsListEntry->data);
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

order_items_modification_result_dto_t *order_items_modification_result_dto_parseFromJSON(cJSON *order_items_modification_result_dtoJSON){

    order_items_modification_result_dto_t *order_items_modification_result_dto_local_var = NULL;

    // define the local list for order_items_modification_result_dto->items
    list_t *itemsList = NULL;

    // order_items_modification_result_dto->items
    cJSON *items = cJSON_GetObjectItemCaseSensitive(order_items_modification_result_dtoJSON, "items");
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
        brief_order_item_dto_t *itemsItem = brief_order_item_dto_parseFromJSON(items_local_nonprimitive);

        list_addElement(itemsList, itemsItem);
    }


    order_items_modification_result_dto_local_var = order_items_modification_result_dto_create (
        itemsList
        );

    return order_items_modification_result_dto_local_var;
end:
    if (itemsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, itemsList) {
            brief_order_item_dto_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(itemsList);
        itemsList = NULL;
    }
    return NULL;

}
