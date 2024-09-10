#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "get_warehouse_stocks_dto.h"



get_warehouse_stocks_dto_t *get_warehouse_stocks_dto_create(
    scrolling_pager_dto_t *paging,
    list_t *warehouses
    ) {
    get_warehouse_stocks_dto_t *get_warehouse_stocks_dto_local_var = malloc(sizeof(get_warehouse_stocks_dto_t));
    if (!get_warehouse_stocks_dto_local_var) {
        return NULL;
    }
    get_warehouse_stocks_dto_local_var->paging = paging;
    get_warehouse_stocks_dto_local_var->warehouses = warehouses;

    return get_warehouse_stocks_dto_local_var;
}


void get_warehouse_stocks_dto_free(get_warehouse_stocks_dto_t *get_warehouse_stocks_dto) {
    if(NULL == get_warehouse_stocks_dto){
        return ;
    }
    listEntry_t *listEntry;
    if (get_warehouse_stocks_dto->paging) {
        scrolling_pager_dto_free(get_warehouse_stocks_dto->paging);
        get_warehouse_stocks_dto->paging = NULL;
    }
    if (get_warehouse_stocks_dto->warehouses) {
        list_ForEach(listEntry, get_warehouse_stocks_dto->warehouses) {
            warehouse_offers_dto_free(listEntry->data);
        }
        list_freeList(get_warehouse_stocks_dto->warehouses);
        get_warehouse_stocks_dto->warehouses = NULL;
    }
    free(get_warehouse_stocks_dto);
}

cJSON *get_warehouse_stocks_dto_convertToJSON(get_warehouse_stocks_dto_t *get_warehouse_stocks_dto) {
    cJSON *item = cJSON_CreateObject();

    // get_warehouse_stocks_dto->paging
    if(get_warehouse_stocks_dto->paging) {
    cJSON *paging_local_JSON = scrolling_pager_dto_convertToJSON(get_warehouse_stocks_dto->paging);
    if(paging_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "paging", paging_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // get_warehouse_stocks_dto->warehouses
    if (!get_warehouse_stocks_dto->warehouses) {
        goto fail;
    }
    cJSON *warehouses = cJSON_AddArrayToObject(item, "warehouses");
    if(warehouses == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *warehousesListEntry;
    if (get_warehouse_stocks_dto->warehouses) {
    list_ForEach(warehousesListEntry, get_warehouse_stocks_dto->warehouses) {
    cJSON *itemLocal = warehouse_offers_dto_convertToJSON(warehousesListEntry->data);
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

get_warehouse_stocks_dto_t *get_warehouse_stocks_dto_parseFromJSON(cJSON *get_warehouse_stocks_dtoJSON){

    get_warehouse_stocks_dto_t *get_warehouse_stocks_dto_local_var = NULL;

    // define the local variable for get_warehouse_stocks_dto->paging
    scrolling_pager_dto_t *paging_local_nonprim = NULL;

    // define the local list for get_warehouse_stocks_dto->warehouses
    list_t *warehousesList = NULL;

    // get_warehouse_stocks_dto->paging
    cJSON *paging = cJSON_GetObjectItemCaseSensitive(get_warehouse_stocks_dtoJSON, "paging");
    if (paging) { 
    paging_local_nonprim = scrolling_pager_dto_parseFromJSON(paging); //nonprimitive
    }

    // get_warehouse_stocks_dto->warehouses
    cJSON *warehouses = cJSON_GetObjectItemCaseSensitive(get_warehouse_stocks_dtoJSON, "warehouses");
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
        warehouse_offers_dto_t *warehousesItem = warehouse_offers_dto_parseFromJSON(warehouses_local_nonprimitive);

        list_addElement(warehousesList, warehousesItem);
    }


    get_warehouse_stocks_dto_local_var = get_warehouse_stocks_dto_create (
        paging ? paging_local_nonprim : NULL,
        warehousesList
        );

    return get_warehouse_stocks_dto_local_var;
end:
    if (paging_local_nonprim) {
        scrolling_pager_dto_free(paging_local_nonprim);
        paging_local_nonprim = NULL;
    }
    if (warehousesList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, warehousesList) {
            warehouse_offers_dto_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(warehousesList);
        warehousesList = NULL;
    }
    return NULL;

}
