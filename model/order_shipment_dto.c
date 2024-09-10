#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "order_shipment_dto.h"



order_shipment_dto_t *order_shipment_dto_create(
    long id,
    char *shipment_date,
    char *shipment_time,
    list_t *tracks,
    list_t *boxes
    ) {
    order_shipment_dto_t *order_shipment_dto_local_var = malloc(sizeof(order_shipment_dto_t));
    if (!order_shipment_dto_local_var) {
        return NULL;
    }
    order_shipment_dto_local_var->id = id;
    order_shipment_dto_local_var->shipment_date = shipment_date;
    order_shipment_dto_local_var->shipment_time = shipment_time;
    order_shipment_dto_local_var->tracks = tracks;
    order_shipment_dto_local_var->boxes = boxes;

    return order_shipment_dto_local_var;
}


void order_shipment_dto_free(order_shipment_dto_t *order_shipment_dto) {
    if(NULL == order_shipment_dto){
        return ;
    }
    listEntry_t *listEntry;
    if (order_shipment_dto->shipment_date) {
        free(order_shipment_dto->shipment_date);
        order_shipment_dto->shipment_date = NULL;
    }
    if (order_shipment_dto->shipment_time) {
        free(order_shipment_dto->shipment_time);
        order_shipment_dto->shipment_time = NULL;
    }
    if (order_shipment_dto->tracks) {
        list_ForEach(listEntry, order_shipment_dto->tracks) {
            order_track_dto_free(listEntry->data);
        }
        list_freeList(order_shipment_dto->tracks);
        order_shipment_dto->tracks = NULL;
    }
    if (order_shipment_dto->boxes) {
        list_ForEach(listEntry, order_shipment_dto->boxes) {
            order_parcel_box_dto_free(listEntry->data);
        }
        list_freeList(order_shipment_dto->boxes);
        order_shipment_dto->boxes = NULL;
    }
    free(order_shipment_dto);
}

cJSON *order_shipment_dto_convertToJSON(order_shipment_dto_t *order_shipment_dto) {
    cJSON *item = cJSON_CreateObject();

    // order_shipment_dto->id
    if(order_shipment_dto->id) {
    if(cJSON_AddNumberToObject(item, "id", order_shipment_dto->id) == NULL) {
    goto fail; //Numeric
    }
    }


    // order_shipment_dto->shipment_date
    if(order_shipment_dto->shipment_date) {
    if(cJSON_AddStringToObject(item, "shipmentDate", order_shipment_dto->shipment_date) == NULL) {
    goto fail; //String
    }
    }


    // order_shipment_dto->shipment_time
    if(order_shipment_dto->shipment_time) {
    if(cJSON_AddStringToObject(item, "shipmentTime", order_shipment_dto->shipment_time) == NULL) {
    goto fail; //String
    }
    }


    // order_shipment_dto->tracks
    if(order_shipment_dto->tracks) {
    cJSON *tracks = cJSON_AddArrayToObject(item, "tracks");
    if(tracks == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *tracksListEntry;
    if (order_shipment_dto->tracks) {
    list_ForEach(tracksListEntry, order_shipment_dto->tracks) {
    cJSON *itemLocal = order_track_dto_convertToJSON(tracksListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(tracks, itemLocal);
    }
    }
    }


    // order_shipment_dto->boxes
    if(order_shipment_dto->boxes) {
    cJSON *boxes = cJSON_AddArrayToObject(item, "boxes");
    if(boxes == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *boxesListEntry;
    if (order_shipment_dto->boxes) {
    list_ForEach(boxesListEntry, order_shipment_dto->boxes) {
    cJSON *itemLocal = order_parcel_box_dto_convertToJSON(boxesListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(boxes, itemLocal);
    }
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

order_shipment_dto_t *order_shipment_dto_parseFromJSON(cJSON *order_shipment_dtoJSON){

    order_shipment_dto_t *order_shipment_dto_local_var = NULL;

    // define the local list for order_shipment_dto->tracks
    list_t *tracksList = NULL;

    // define the local list for order_shipment_dto->boxes
    list_t *boxesList = NULL;

    // order_shipment_dto->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(order_shipment_dtoJSON, "id");
    if (id) { 
    if(!cJSON_IsNumber(id))
    {
    goto end; //Numeric
    }
    }

    // order_shipment_dto->shipment_date
    cJSON *shipment_date = cJSON_GetObjectItemCaseSensitive(order_shipment_dtoJSON, "shipmentDate");
    if (shipment_date) { 
    if(!cJSON_IsString(shipment_date) && !cJSON_IsNull(shipment_date))
    {
    goto end; //String
    }
    }

    // order_shipment_dto->shipment_time
    cJSON *shipment_time = cJSON_GetObjectItemCaseSensitive(order_shipment_dtoJSON, "shipmentTime");
    if (shipment_time) { 
    if(!cJSON_IsString(shipment_time) && !cJSON_IsNull(shipment_time))
    {
    goto end; //String
    }
    }

    // order_shipment_dto->tracks
    cJSON *tracks = cJSON_GetObjectItemCaseSensitive(order_shipment_dtoJSON, "tracks");
    if (tracks) { 
    cJSON *tracks_local_nonprimitive = NULL;
    if(!cJSON_IsArray(tracks)){
        goto end; //nonprimitive container
    }

    tracksList = list_createList();

    cJSON_ArrayForEach(tracks_local_nonprimitive,tracks )
    {
        if(!cJSON_IsObject(tracks_local_nonprimitive)){
            goto end;
        }
        order_track_dto_t *tracksItem = order_track_dto_parseFromJSON(tracks_local_nonprimitive);

        list_addElement(tracksList, tracksItem);
    }
    }

    // order_shipment_dto->boxes
    cJSON *boxes = cJSON_GetObjectItemCaseSensitive(order_shipment_dtoJSON, "boxes");
    if (boxes) { 
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
        order_parcel_box_dto_t *boxesItem = order_parcel_box_dto_parseFromJSON(boxes_local_nonprimitive);

        list_addElement(boxesList, boxesItem);
    }
    }


    order_shipment_dto_local_var = order_shipment_dto_create (
        id ? id->valuedouble : 0,
        shipment_date && !cJSON_IsNull(shipment_date) ? strdup(shipment_date->valuestring) : NULL,
        shipment_time && !cJSON_IsNull(shipment_time) ? strdup(shipment_time->valuestring) : NULL,
        tracks ? tracksList : NULL,
        boxes ? boxesList : NULL
        );

    return order_shipment_dto_local_var;
end:
    if (tracksList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, tracksList) {
            order_track_dto_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(tracksList);
        tracksList = NULL;
    }
    if (boxesList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, boxesList) {
            order_parcel_box_dto_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(boxesList);
        boxesList = NULL;
    }
    return NULL;

}
