#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "warehouses_dto.h"



warehouses_dto_t *warehouses_dto_create(
    list_t *warehouses,
    list_t *warehouse_groups
    ) {
    warehouses_dto_t *warehouses_dto_local_var = malloc(sizeof(warehouses_dto_t));
    if (!warehouses_dto_local_var) {
        return NULL;
    }
    warehouses_dto_local_var->warehouses = warehouses;
    warehouses_dto_local_var->warehouse_groups = warehouse_groups;

    return warehouses_dto_local_var;
}


void warehouses_dto_free(warehouses_dto_t *warehouses_dto) {
    if(NULL == warehouses_dto){
        return ;
    }
    listEntry_t *listEntry;
    if (warehouses_dto->warehouses) {
        list_ForEach(listEntry, warehouses_dto->warehouses) {
            warehouse_dto_free(listEntry->data);
        }
        list_freeList(warehouses_dto->warehouses);
        warehouses_dto->warehouses = NULL;
    }
    if (warehouses_dto->warehouse_groups) {
        list_ForEach(listEntry, warehouses_dto->warehouse_groups) {
            warehouse_group_dto_free(listEntry->data);
        }
        list_freeList(warehouses_dto->warehouse_groups);
        warehouses_dto->warehouse_groups = NULL;
    }
    free(warehouses_dto);
}

cJSON *warehouses_dto_convertToJSON(warehouses_dto_t *warehouses_dto) {
    cJSON *item = cJSON_CreateObject();

    // warehouses_dto->warehouses
    if (!warehouses_dto->warehouses) {
        goto fail;
    }
    cJSON *warehouses = cJSON_AddArrayToObject(item, "warehouses");
    if(warehouses == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *warehousesListEntry;
    if (warehouses_dto->warehouses) {
    list_ForEach(warehousesListEntry, warehouses_dto->warehouses) {
    cJSON *itemLocal = warehouse_dto_convertToJSON(warehousesListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(warehouses, itemLocal);
    }
    }


    // warehouses_dto->warehouse_groups
    if (!warehouses_dto->warehouse_groups) {
        goto fail;
    }
    cJSON *warehouse_groups = cJSON_AddArrayToObject(item, "warehouseGroups");
    if(warehouse_groups == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *warehouse_groupsListEntry;
    if (warehouses_dto->warehouse_groups) {
    list_ForEach(warehouse_groupsListEntry, warehouses_dto->warehouse_groups) {
    cJSON *itemLocal = warehouse_group_dto_convertToJSON(warehouse_groupsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(warehouse_groups, itemLocal);
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

warehouses_dto_t *warehouses_dto_parseFromJSON(cJSON *warehouses_dtoJSON){

    warehouses_dto_t *warehouses_dto_local_var = NULL;

    // define the local list for warehouses_dto->warehouses
    list_t *warehousesList = NULL;

    // define the local list for warehouses_dto->warehouse_groups
    list_t *warehouse_groupsList = NULL;

    // warehouses_dto->warehouses
    cJSON *warehouses = cJSON_GetObjectItemCaseSensitive(warehouses_dtoJSON, "warehouses");
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
        warehouse_dto_t *warehousesItem = warehouse_dto_parseFromJSON(warehouses_local_nonprimitive);

        list_addElement(warehousesList, warehousesItem);
    }

    // warehouses_dto->warehouse_groups
    cJSON *warehouse_groups = cJSON_GetObjectItemCaseSensitive(warehouses_dtoJSON, "warehouseGroups");
    if (!warehouse_groups) {
        goto end;
    }

    
    cJSON *warehouse_groups_local_nonprimitive = NULL;
    if(!cJSON_IsArray(warehouse_groups)){
        goto end; //nonprimitive container
    }

    warehouse_groupsList = list_createList();

    cJSON_ArrayForEach(warehouse_groups_local_nonprimitive,warehouse_groups )
    {
        if(!cJSON_IsObject(warehouse_groups_local_nonprimitive)){
            goto end;
        }
        warehouse_group_dto_t *warehouse_groupsItem = warehouse_group_dto_parseFromJSON(warehouse_groups_local_nonprimitive);

        list_addElement(warehouse_groupsList, warehouse_groupsItem);
    }


    warehouses_dto_local_var = warehouses_dto_create (
        warehousesList,
        warehouse_groupsList
        );

    return warehouses_dto_local_var;
end:
    if (warehousesList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, warehousesList) {
            warehouse_dto_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(warehousesList);
        warehousesList = NULL;
    }
    if (warehouse_groupsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, warehouse_groupsList) {
            warehouse_group_dto_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(warehouse_groupsList);
        warehouse_groupsList = NULL;
    }
    return NULL;

}
