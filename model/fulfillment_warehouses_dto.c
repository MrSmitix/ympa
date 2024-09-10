#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "fulfillment_warehouses_dto.h"



fulfillment_warehouses_dto_t *fulfillment_warehouses_dto_create(
    list_t *warehouses
    ) {
    fulfillment_warehouses_dto_t *fulfillment_warehouses_dto_local_var = malloc(sizeof(fulfillment_warehouses_dto_t));
    if (!fulfillment_warehouses_dto_local_var) {
        return NULL;
    }
    fulfillment_warehouses_dto_local_var->warehouses = warehouses;

    return fulfillment_warehouses_dto_local_var;
}


void fulfillment_warehouses_dto_free(fulfillment_warehouses_dto_t *fulfillment_warehouses_dto) {
    if(NULL == fulfillment_warehouses_dto){
        return ;
    }
    listEntry_t *listEntry;
    if (fulfillment_warehouses_dto->warehouses) {
        list_ForEach(listEntry, fulfillment_warehouses_dto->warehouses) {
            fulfillment_warehouse_dto_free(listEntry->data);
        }
        list_freeList(fulfillment_warehouses_dto->warehouses);
        fulfillment_warehouses_dto->warehouses = NULL;
    }
    free(fulfillment_warehouses_dto);
}

cJSON *fulfillment_warehouses_dto_convertToJSON(fulfillment_warehouses_dto_t *fulfillment_warehouses_dto) {
    cJSON *item = cJSON_CreateObject();

    // fulfillment_warehouses_dto->warehouses
    if (!fulfillment_warehouses_dto->warehouses) {
        goto fail;
    }
    cJSON *warehouses = cJSON_AddArrayToObject(item, "warehouses");
    if(warehouses == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *warehousesListEntry;
    if (fulfillment_warehouses_dto->warehouses) {
    list_ForEach(warehousesListEntry, fulfillment_warehouses_dto->warehouses) {
    cJSON *itemLocal = fulfillment_warehouse_dto_convertToJSON(warehousesListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(warehouses, itemLocal);
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

fulfillment_warehouses_dto_t *fulfillment_warehouses_dto_parseFromJSON(cJSON *fulfillment_warehouses_dtoJSON){

    fulfillment_warehouses_dto_t *fulfillment_warehouses_dto_local_var = NULL;

    // define the local list for fulfillment_warehouses_dto->warehouses
    list_t *warehousesList = NULL;

    // fulfillment_warehouses_dto->warehouses
    cJSON *warehouses = cJSON_GetObjectItemCaseSensitive(fulfillment_warehouses_dtoJSON, "warehouses");
    if (!warehouses) {
        goto end;
    }

    
    cJSON *warehouses_local_nonprimitive = NULL;
    if(!cJSON_IsArray(warehouses)){
        goto end; //nonprimitive container
    }

    warehousesList = list_createList();

    cJSON_ArrayForEach(warehouses_local_nonprimitive,warehouses )
    {
        if(!cJSON_IsObject(warehouses_local_nonprimitive)){
            goto end;
        }
        fulfillment_warehouse_dto_t *warehousesItem = fulfillment_warehouse_dto_parseFromJSON(warehouses_local_nonprimitive);

        list_addElement(warehousesList, warehousesItem);
    }


    fulfillment_warehouses_dto_local_var = fulfillment_warehouses_dto_create (
        warehousesList
        );

    return fulfillment_warehouses_dto_local_var;
end:
    if (warehousesList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, warehousesList) {
            fulfillment_warehouse_dto_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(warehousesList);
        warehousesList = NULL;
    }
    return NULL;

}
