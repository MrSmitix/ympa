#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "parcel_dto.h"



parcel_dto_t *parcel_dto_create(
    list_t *boxes
    ) {
    parcel_dto_t *parcel_dto_local_var = malloc(sizeof(parcel_dto_t));
    if (!parcel_dto_local_var) {
        return NULL;
    }
    parcel_dto_local_var->boxes = boxes;

    return parcel_dto_local_var;
}


void parcel_dto_free(parcel_dto_t *parcel_dto) {
    if(NULL == parcel_dto){
        return ;
    }
    listEntry_t *listEntry;
    if (parcel_dto->boxes) {
        list_ForEach(listEntry, parcel_dto->boxes) {
            parcel_box_dto_free(listEntry->data);
        }
        list_freeList(parcel_dto->boxes);
        parcel_dto->boxes = NULL;
    }
    free(parcel_dto);
}

cJSON *parcel_dto_convertToJSON(parcel_dto_t *parcel_dto) {
    cJSON *item = cJSON_CreateObject();

    // parcel_dto->boxes
    if (!parcel_dto->boxes) {
        goto fail;
    }
    cJSON *boxes = cJSON_AddArrayToObject(item, "boxes");
    if(boxes == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *boxesListEntry;
    if (parcel_dto->boxes) {
    list_ForEach(boxesListEntry, parcel_dto->boxes) {
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

parcel_dto_t *parcel_dto_parseFromJSON(cJSON *parcel_dtoJSON){

    parcel_dto_t *parcel_dto_local_var = NULL;

    // define the local list for parcel_dto->boxes
    list_t *boxesList = NULL;

    // parcel_dto->boxes
    cJSON *boxes = cJSON_GetObjectItemCaseSensitive(parcel_dtoJSON, "boxes");
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


    parcel_dto_local_var = parcel_dto_create (
        boxesList
        );

    return parcel_dto_local_var;
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
