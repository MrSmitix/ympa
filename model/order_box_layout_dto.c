#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "order_box_layout_dto.h"



order_box_layout_dto_t *order_box_layout_dto_create(
    list_t *items
    ) {
    order_box_layout_dto_t *order_box_layout_dto_local_var = malloc(sizeof(order_box_layout_dto_t));
    if (!order_box_layout_dto_local_var) {
        return NULL;
    }
    order_box_layout_dto_local_var->items = items;

    return order_box_layout_dto_local_var;
}


void order_box_layout_dto_free(order_box_layout_dto_t *order_box_layout_dto) {
    if(NULL == order_box_layout_dto){
        return ;
    }
    listEntry_t *listEntry;
    if (order_box_layout_dto->items) {
        list_ForEach(listEntry, order_box_layout_dto->items) {
            order_box_layout_item_dto_free(listEntry->data);
        }
        list_freeList(order_box_layout_dto->items);
        order_box_layout_dto->items = NULL;
    }
    free(order_box_layout_dto);
}

cJSON *order_box_layout_dto_convertToJSON(order_box_layout_dto_t *order_box_layout_dto) {
    cJSON *item = cJSON_CreateObject();

    // order_box_layout_dto->items
    if (!order_box_layout_dto->items) {
        goto fail;
    }
    cJSON *items = cJSON_AddArrayToObject(item, "items");
    if(items == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *itemsListEntry;
    if (order_box_layout_dto->items) {
    list_ForEach(itemsListEntry, order_box_layout_dto->items) {
    cJSON *itemLocal = order_box_layout_item_dto_convertToJSON(itemsListEntry->data);
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

order_box_layout_dto_t *order_box_layout_dto_parseFromJSON(cJSON *order_box_layout_dtoJSON){

    order_box_layout_dto_t *order_box_layout_dto_local_var = NULL;

    // define the local list for order_box_layout_dto->items
    list_t *itemsList = NULL;

    // order_box_layout_dto->items
    cJSON *items = cJSON_GetObjectItemCaseSensitive(order_box_layout_dtoJSON, "items");
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
        order_box_layout_item_dto_t *itemsItem = order_box_layout_item_dto_parseFromJSON(items_local_nonprimitive);

        list_addElement(itemsList, itemsItem);
    }


    order_box_layout_dto_local_var = order_box_layout_dto_create (
        itemsList
        );

    return order_box_layout_dto_local_var;
end:
    if (itemsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, itemsList) {
            order_box_layout_item_dto_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(itemsList);
        itemsList = NULL;
    }
    return NULL;

}
