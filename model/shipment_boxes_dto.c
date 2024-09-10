#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "shipment_boxes_dto.h"



shipment_boxes_dto_t *shipment_boxes_dto_create(
    list_t *boxes
    ) {
    shipment_boxes_dto_t *shipment_boxes_dto_local_var = malloc(sizeof(shipment_boxes_dto_t));
    if (!shipment_boxes_dto_local_var) {
        return NULL;
    }
    shipment_boxes_dto_local_var->boxes = boxes;

    return shipment_boxes_dto_local_var;
}


void shipment_boxes_dto_free(shipment_boxes_dto_t *shipment_boxes_dto) {
    if(NULL == shipment_boxes_dto){
        return ;
    }
    listEntry_t *listEntry;
    if (shipment_boxes_dto->boxes) {
        list_ForEach(listEntry, shipment_boxes_dto->boxes) {
            parcel_box_dto_free(listEntry->data);
        }
        list_freeList(shipment_boxes_dto->boxes);
        shipment_boxes_dto->boxes = NULL;
    }
    free(shipment_boxes_dto);
}

cJSON *shipment_boxes_dto_convertToJSON(shipment_boxes_dto_t *shipment_boxes_dto) {
    cJSON *item = cJSON_CreateObject();

    // shipment_boxes_dto->boxes
    if (!shipment_boxes_dto->boxes) {
        goto fail;
    }
    cJSON *boxes = cJSON_AddArrayToObject(item, "boxes");
    if(boxes == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *boxesListEntry;
    if (shipment_boxes_dto->boxes) {
    list_ForEach(boxesListEntry, shipment_boxes_dto->boxes) {
    cJSON *itemLocal = parcel_box_dto_convertToJSON(boxesListEntry->data);
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

shipment_boxes_dto_t *shipment_boxes_dto_parseFromJSON(cJSON *shipment_boxes_dtoJSON){

    shipment_boxes_dto_t *shipment_boxes_dto_local_var = NULL;

    // define the local list for shipment_boxes_dto->boxes
    list_t *boxesList = NULL;

    // shipment_boxes_dto->boxes
    cJSON *boxes = cJSON_GetObjectItemCaseSensitive(shipment_boxes_dtoJSON, "boxes");
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
        parcel_box_dto_t *boxesItem = parcel_box_dto_parseFromJSON(boxes_local_nonprimitive);

        list_addElement(boxesList, boxesItem);
    }


    shipment_boxes_dto_local_var = shipment_boxes_dto_create (
        boxesList
        );

    return shipment_boxes_dto_local_var;
end:
    if (boxesList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, boxesList) {
            parcel_box_dto_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(boxesList);
        boxesList = NULL;
    }
    return NULL;

}
