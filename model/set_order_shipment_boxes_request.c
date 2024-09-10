#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "set_order_shipment_boxes_request.h"



set_order_shipment_boxes_request_t *set_order_shipment_boxes_request_create(
    list_t *boxes
    ) {
    set_order_shipment_boxes_request_t *set_order_shipment_boxes_request_local_var = malloc(sizeof(set_order_shipment_boxes_request_t));
    if (!set_order_shipment_boxes_request_local_var) {
        return NULL;
    }
    set_order_shipment_boxes_request_local_var->boxes = boxes;

    return set_order_shipment_boxes_request_local_var;
}


void set_order_shipment_boxes_request_free(set_order_shipment_boxes_request_t *set_order_shipment_boxes_request) {
    if(NULL == set_order_shipment_boxes_request){
        return ;
    }
    listEntry_t *listEntry;
    if (set_order_shipment_boxes_request->boxes) {
        list_ForEach(listEntry, set_order_shipment_boxes_request->boxes) {
            parcel_box_dto_free(listEntry->data);
        }
        list_freeList(set_order_shipment_boxes_request->boxes);
        set_order_shipment_boxes_request->boxes = NULL;
    }
    free(set_order_shipment_boxes_request);
}

cJSON *set_order_shipment_boxes_request_convertToJSON(set_order_shipment_boxes_request_t *set_order_shipment_boxes_request) {
    cJSON *item = cJSON_CreateObject();

    // set_order_shipment_boxes_request->boxes
    if (!set_order_shipment_boxes_request->boxes) {
        goto fail;
    }
    cJSON *boxes = cJSON_AddArrayToObject(item, "boxes");
    if(boxes == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *boxesListEntry;
    if (set_order_shipment_boxes_request->boxes) {
    list_ForEach(boxesListEntry, set_order_shipment_boxes_request->boxes) {
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

set_order_shipment_boxes_request_t *set_order_shipment_boxes_request_parseFromJSON(cJSON *set_order_shipment_boxes_requestJSON){

    set_order_shipment_boxes_request_t *set_order_shipment_boxes_request_local_var = NULL;

    // define the local list for set_order_shipment_boxes_request->boxes
    list_t *boxesList = NULL;

    // set_order_shipment_boxes_request->boxes
    cJSON *boxes = cJSON_GetObjectItemCaseSensitive(set_order_shipment_boxes_requestJSON, "boxes");
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


    set_order_shipment_boxes_request_local_var = set_order_shipment_boxes_request_create (
        boxesList
        );

    return set_order_shipment_boxes_request_local_var;
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
