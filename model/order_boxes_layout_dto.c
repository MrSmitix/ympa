#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "order_boxes_layout_dto.h"



order_boxes_layout_dto_t *order_boxes_layout_dto_create(
    list_t *boxes
    ) {
    order_boxes_layout_dto_t *order_boxes_layout_dto_local_var = malloc(sizeof(order_boxes_layout_dto_t));
    if (!order_boxes_layout_dto_local_var) {
        return NULL;
    }
    order_boxes_layout_dto_local_var->boxes = boxes;

    return order_boxes_layout_dto_local_var;
}


void order_boxes_layout_dto_free(order_boxes_layout_dto_t *order_boxes_layout_dto) {
    if(NULL == order_boxes_layout_dto){
        return ;
    }
    listEntry_t *listEntry;
    if (order_boxes_layout_dto->boxes) {
        list_ForEach(listEntry, order_boxes_layout_dto->boxes) {
            enriched_order_box_layout_dto_free(listEntry->data);
        }
        list_freeList(order_boxes_layout_dto->boxes);
        order_boxes_layout_dto->boxes = NULL;
    }
    free(order_boxes_layout_dto);
}

cJSON *order_boxes_layout_dto_convertToJSON(order_boxes_layout_dto_t *order_boxes_layout_dto) {
    cJSON *item = cJSON_CreateObject();

    // order_boxes_layout_dto->boxes
    if (!order_boxes_layout_dto->boxes) {
        goto fail;
    }
    cJSON *boxes = cJSON_AddArrayToObject(item, "boxes");
    if(boxes == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *boxesListEntry;
    if (order_boxes_layout_dto->boxes) {
    list_ForEach(boxesListEntry, order_boxes_layout_dto->boxes) {
    cJSON *itemLocal = enriched_order_box_layout_dto_convertToJSON(boxesListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(boxes, itemLocal);
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

order_boxes_layout_dto_t *order_boxes_layout_dto_parseFromJSON(cJSON *order_boxes_layout_dtoJSON){

    order_boxes_layout_dto_t *order_boxes_layout_dto_local_var = NULL;

    // define the local list for order_boxes_layout_dto->boxes
    list_t *boxesList = NULL;

    // order_boxes_layout_dto->boxes
    cJSON *boxes = cJSON_GetObjectItemCaseSensitive(order_boxes_layout_dtoJSON, "boxes");
    if (!boxes) {
        goto end;
    }

    
    cJSON *boxes_local_nonprimitive = NULL;
    if(!cJSON_IsArray(boxes)){
        goto end; //nonprimitive container
    }

    boxesList = list_createList();

    cJSON_ArrayForEach(boxes_local_nonprimitive,boxes )
    {
        if(!cJSON_IsObject(boxes_local_nonprimitive)){
            goto end;
        }
        enriched_order_box_layout_dto_t *boxesItem = enriched_order_box_layout_dto_parseFromJSON(boxes_local_nonprimitive);

        list_addElement(boxesList, boxesItem);
    }


    order_boxes_layout_dto_local_var = order_boxes_layout_dto_create (
        boxesList
        );

    return order_boxes_layout_dto_local_var;
end:
    if (boxesList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, boxesList) {
            enriched_order_box_layout_dto_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(boxesList);
        boxesList = NULL;
    }
    return NULL;

}
