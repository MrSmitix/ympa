#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "enriched_order_box_layout_dto.h"



enriched_order_box_layout_dto_t *enriched_order_box_layout_dto_create(
    list_t *items,
    long box_id
    ) {
    enriched_order_box_layout_dto_t *enriched_order_box_layout_dto_local_var = malloc(sizeof(enriched_order_box_layout_dto_t));
    if (!enriched_order_box_layout_dto_local_var) {
        return NULL;
    }
    enriched_order_box_layout_dto_local_var->items = items;
    enriched_order_box_layout_dto_local_var->box_id = box_id;

    return enriched_order_box_layout_dto_local_var;
}


void enriched_order_box_layout_dto_free(enriched_order_box_layout_dto_t *enriched_order_box_layout_dto) {
    if(NULL == enriched_order_box_layout_dto){
        return ;
    }
    listEntry_t *listEntry;
    if (enriched_order_box_layout_dto->items) {
        list_ForEach(listEntry, enriched_order_box_layout_dto->items) {
            order_box_layout_item_dto_free(listEntry->data);
        }
        list_freeList(enriched_order_box_layout_dto->items);
        enriched_order_box_layout_dto->items = NULL;
    }
    free(enriched_order_box_layout_dto);
}

cJSON *enriched_order_box_layout_dto_convertToJSON(enriched_order_box_layout_dto_t *enriched_order_box_layout_dto) {
    cJSON *item = cJSON_CreateObject();

    // enriched_order_box_layout_dto->items
    if (!enriched_order_box_layout_dto->items) {
        goto fail;
    }
    cJSON *items = cJSON_AddArrayToObject(item, "items");
    if(items == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *itemsListEntry;
    if (enriched_order_box_layout_dto->items) {
    list_ForEach(itemsListEntry, enriched_order_box_layout_dto->items) {
    cJSON *itemLocal = order_box_layout_item_dto_convertToJSON(itemsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(items, itemLocal);
    }
    }


    // enriched_order_box_layout_dto->box_id
    if(enriched_order_box_layout_dto->box_id) {
    if(cJSON_AddNumberToObject(item, "boxId", enriched_order_box_layout_dto->box_id) == NULL) {
    goto fail; //Numeric
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

enriched_order_box_layout_dto_t *enriched_order_box_layout_dto_parseFromJSON(cJSON *enriched_order_box_layout_dtoJSON){

    enriched_order_box_layout_dto_t *enriched_order_box_layout_dto_local_var = NULL;

    // define the local list for enriched_order_box_layout_dto->items
    list_t *itemsList = NULL;

    // enriched_order_box_layout_dto->items
    cJSON *items = cJSON_GetObjectItemCaseSensitive(enriched_order_box_layout_dtoJSON, "items");
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

    // enriched_order_box_layout_dto->box_id
    cJSON *box_id = cJSON_GetObjectItemCaseSensitive(enriched_order_box_layout_dtoJSON, "boxId");
    if (box_id) { 
    if(!cJSON_IsNumber(box_id))
    {
    goto end; //Numeric
    }
    }


    enriched_order_box_layout_dto_local_var = enriched_order_box_layout_dto_create (
        itemsList,
        box_id ? box_id->valuedouble : 0
        );

    return enriched_order_box_layout_dto_local_var;
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
