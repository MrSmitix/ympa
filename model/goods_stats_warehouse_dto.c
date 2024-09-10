#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "goods_stats_warehouse_dto.h"



goods_stats_warehouse_dto_t *goods_stats_warehouse_dto_create(
    long id,
    char *name,
    list_t *stocks
    ) {
    goods_stats_warehouse_dto_t *goods_stats_warehouse_dto_local_var = malloc(sizeof(goods_stats_warehouse_dto_t));
    if (!goods_stats_warehouse_dto_local_var) {
        return NULL;
    }
    goods_stats_warehouse_dto_local_var->id = id;
    goods_stats_warehouse_dto_local_var->name = name;
    goods_stats_warehouse_dto_local_var->stocks = stocks;

    return goods_stats_warehouse_dto_local_var;
}


void goods_stats_warehouse_dto_free(goods_stats_warehouse_dto_t *goods_stats_warehouse_dto) {
    if(NULL == goods_stats_warehouse_dto){
        return ;
    }
    listEntry_t *listEntry;
    if (goods_stats_warehouse_dto->name) {
        free(goods_stats_warehouse_dto->name);
        goods_stats_warehouse_dto->name = NULL;
    }
    if (goods_stats_warehouse_dto->stocks) {
        list_ForEach(listEntry, goods_stats_warehouse_dto->stocks) {
            warehouse_stock_dto_free(listEntry->data);
        }
        list_freeList(goods_stats_warehouse_dto->stocks);
        goods_stats_warehouse_dto->stocks = NULL;
    }
    free(goods_stats_warehouse_dto);
}

cJSON *goods_stats_warehouse_dto_convertToJSON(goods_stats_warehouse_dto_t *goods_stats_warehouse_dto) {
    cJSON *item = cJSON_CreateObject();

    // goods_stats_warehouse_dto->id
    if(goods_stats_warehouse_dto->id) {
    if(cJSON_AddNumberToObject(item, "id", goods_stats_warehouse_dto->id) == NULL) {
    goto fail; //Numeric
    }
    }


    // goods_stats_warehouse_dto->name
    if(goods_stats_warehouse_dto->name) {
    if(cJSON_AddStringToObject(item, "name", goods_stats_warehouse_dto->name) == NULL) {
    goto fail; //String
    }
    }


    // goods_stats_warehouse_dto->stocks
    if (!goods_stats_warehouse_dto->stocks) {
        goto fail;
    }
    cJSON *stocks = cJSON_AddArrayToObject(item, "stocks");
    if(stocks == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *stocksListEntry;
    if (goods_stats_warehouse_dto->stocks) {
    list_ForEach(stocksListEntry, goods_stats_warehouse_dto->stocks) {
    cJSON *itemLocal = warehouse_stock_dto_convertToJSON(stocksListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(stocks, itemLocal);
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

goods_stats_warehouse_dto_t *goods_stats_warehouse_dto_parseFromJSON(cJSON *goods_stats_warehouse_dtoJSON){

    goods_stats_warehouse_dto_t *goods_stats_warehouse_dto_local_var = NULL;

    // define the local list for goods_stats_warehouse_dto->stocks
    list_t *stocksList = NULL;

    // goods_stats_warehouse_dto->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(goods_stats_warehouse_dtoJSON, "id");
    if (id) { 
    if(!cJSON_IsNumber(id))
    {
    goto end; //Numeric
    }
    }

    // goods_stats_warehouse_dto->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(goods_stats_warehouse_dtoJSON, "name");
    if (name) { 
    if(!cJSON_IsString(name) && !cJSON_IsNull(name))
    {
    goto end; //String
    }
    }

    // goods_stats_warehouse_dto->stocks
    cJSON *stocks = cJSON_GetObjectItemCaseSensitive(goods_stats_warehouse_dtoJSON, "stocks");
    if (!stocks) {
        goto end;
    }

    
    cJSON *stocks_local_nonprimitive = NULL;
    if(!cJSON_IsArray(stocks)){
        goto end; //nonprimitive container
    }

    stocksList = list_createList();

    cJSON_ArrayForEach(stocks_local_nonprimitive,stocks )
    {
        if(!cJSON_IsObject(stocks_local_nonprimitive)){
            goto end;
        }
        warehouse_stock_dto_t *stocksItem = warehouse_stock_dto_parseFromJSON(stocks_local_nonprimitive);

        list_addElement(stocksList, stocksItem);
    }


    goods_stats_warehouse_dto_local_var = goods_stats_warehouse_dto_create (
        id ? id->valuedouble : 0,
        name && !cJSON_IsNull(name) ? strdup(name->valuestring) : NULL,
        stocksList
        );

    return goods_stats_warehouse_dto_local_var;
end:
    if (stocksList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, stocksList) {
            warehouse_stock_dto_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(stocksList);
        stocksList = NULL;
    }
    return NULL;

}
