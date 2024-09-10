#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "warehouse_group_dto.h"



warehouse_group_dto_t *warehouse_group_dto_create(
    char *name,
    warehouse_dto_t *main_warehouse,
    list_t *warehouses
    ) {
    warehouse_group_dto_t *warehouse_group_dto_local_var = malloc(sizeof(warehouse_group_dto_t));
    if (!warehouse_group_dto_local_var) {
        return NULL;
    }
    warehouse_group_dto_local_var->name = name;
    warehouse_group_dto_local_var->main_warehouse = main_warehouse;
    warehouse_group_dto_local_var->warehouses = warehouses;

    return warehouse_group_dto_local_var;
}


void warehouse_group_dto_free(warehouse_group_dto_t *warehouse_group_dto) {
    if(NULL == warehouse_group_dto){
        return ;
    }
    listEntry_t *listEntry;
    if (warehouse_group_dto->name) {
        free(warehouse_group_dto->name);
        warehouse_group_dto->name = NULL;
    }
    if (warehouse_group_dto->main_warehouse) {
        warehouse_dto_free(warehouse_group_dto->main_warehouse);
        warehouse_group_dto->main_warehouse = NULL;
    }
    if (warehouse_group_dto->warehouses) {
        list_ForEach(listEntry, warehouse_group_dto->warehouses) {
            warehouse_dto_free(listEntry->data);
        }
        list_freeList(warehouse_group_dto->warehouses);
        warehouse_group_dto->warehouses = NULL;
    }
    free(warehouse_group_dto);
}

cJSON *warehouse_group_dto_convertToJSON(warehouse_group_dto_t *warehouse_group_dto) {
    cJSON *item = cJSON_CreateObject();

    // warehouse_group_dto->name
    if (!warehouse_group_dto->name) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "name", warehouse_group_dto->name) == NULL) {
    goto fail; //String
    }


    // warehouse_group_dto->main_warehouse
    if (!warehouse_group_dto->main_warehouse) {
        goto fail;
    }
    cJSON *main_warehouse_local_JSON = warehouse_dto_convertToJSON(warehouse_group_dto->main_warehouse);
    if(main_warehouse_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "mainWarehouse", main_warehouse_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }


    // warehouse_group_dto->warehouses
    if (!warehouse_group_dto->warehouses) {
        goto fail;
    }
    cJSON *warehouses = cJSON_AddArrayToObject(item, "warehouses");
    if(warehouses == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *warehousesListEntry;
    if (warehouse_group_dto->warehouses) {
    list_ForEach(warehousesListEntry, warehouse_group_dto->warehouses) {
    cJSON *itemLocal = warehouse_dto_convertToJSON(warehousesListEntry->data);
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

warehouse_group_dto_t *warehouse_group_dto_parseFromJSON(cJSON *warehouse_group_dtoJSON){

    warehouse_group_dto_t *warehouse_group_dto_local_var = NULL;

    // define the local variable for warehouse_group_dto->main_warehouse
    warehouse_dto_t *main_warehouse_local_nonprim = NULL;

    // define the local list for warehouse_group_dto->warehouses
    list_t *warehousesList = NULL;

    // warehouse_group_dto->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(warehouse_group_dtoJSON, "name");
    if (!name) {
        goto end;
    }

    
    if(!cJSON_IsString(name))
    {
    goto end; //String
    }

    // warehouse_group_dto->main_warehouse
    cJSON *main_warehouse = cJSON_GetObjectItemCaseSensitive(warehouse_group_dtoJSON, "mainWarehouse");
    if (!main_warehouse) {
        goto end;
    }

    
    main_warehouse_local_nonprim = warehouse_dto_parseFromJSON(main_warehouse); //nonprimitive

    // warehouse_group_dto->warehouses
    cJSON *warehouses = cJSON_GetObjectItemCaseSensitive(warehouse_group_dtoJSON, "warehouses");
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


    warehouse_group_dto_local_var = warehouse_group_dto_create (
        strdup(name->valuestring),
        main_warehouse_local_nonprim,
        warehousesList
        );

    return warehouse_group_dto_local_var;
end:
    if (main_warehouse_local_nonprim) {
        warehouse_dto_free(main_warehouse_local_nonprim);
        main_warehouse_local_nonprim = NULL;
    }
    if (warehousesList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, warehousesList) {
            warehouse_dto_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(warehousesList);
        warehousesList = NULL;
    }
    return NULL;

}
