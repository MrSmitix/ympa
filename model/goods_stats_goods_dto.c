#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "goods_stats_goods_dto.h"



goods_stats_goods_dto_t *goods_stats_goods_dto_create(
    char *shop_sku,
    long market_sku,
    char *name,
    double price,
    long category_id,
    char *category_name,
    goods_stats_weight_dimensions_dto_t *weight_dimensions,
    list_t *warehouses,
    list_t *tariffs,
    list_t *pictures
    ) {
    goods_stats_goods_dto_t *goods_stats_goods_dto_local_var = malloc(sizeof(goods_stats_goods_dto_t));
    if (!goods_stats_goods_dto_local_var) {
        return NULL;
    }
    goods_stats_goods_dto_local_var->shop_sku = shop_sku;
    goods_stats_goods_dto_local_var->market_sku = market_sku;
    goods_stats_goods_dto_local_var->name = name;
    goods_stats_goods_dto_local_var->price = price;
    goods_stats_goods_dto_local_var->category_id = category_id;
    goods_stats_goods_dto_local_var->category_name = category_name;
    goods_stats_goods_dto_local_var->weight_dimensions = weight_dimensions;
    goods_stats_goods_dto_local_var->warehouses = warehouses;
    goods_stats_goods_dto_local_var->tariffs = tariffs;
    goods_stats_goods_dto_local_var->pictures = pictures;

    return goods_stats_goods_dto_local_var;
}


void goods_stats_goods_dto_free(goods_stats_goods_dto_t *goods_stats_goods_dto) {
    if(NULL == goods_stats_goods_dto){
        return ;
    }
    listEntry_t *listEntry;
    if (goods_stats_goods_dto->shop_sku) {
        free(goods_stats_goods_dto->shop_sku);
        goods_stats_goods_dto->shop_sku = NULL;
    }
    if (goods_stats_goods_dto->name) {
        free(goods_stats_goods_dto->name);
        goods_stats_goods_dto->name = NULL;
    }
    if (goods_stats_goods_dto->category_name) {
        free(goods_stats_goods_dto->category_name);
        goods_stats_goods_dto->category_name = NULL;
    }
    if (goods_stats_goods_dto->weight_dimensions) {
        goods_stats_weight_dimensions_dto_free(goods_stats_goods_dto->weight_dimensions);
        goods_stats_goods_dto->weight_dimensions = NULL;
    }
    if (goods_stats_goods_dto->warehouses) {
        list_ForEach(listEntry, goods_stats_goods_dto->warehouses) {
            goods_stats_warehouse_dto_free(listEntry->data);
        }
        list_freeList(goods_stats_goods_dto->warehouses);
        goods_stats_goods_dto->warehouses = NULL;
    }
    if (goods_stats_goods_dto->tariffs) {
        list_ForEach(listEntry, goods_stats_goods_dto->tariffs) {
            tariff_dto_free(listEntry->data);
        }
        list_freeList(goods_stats_goods_dto->tariffs);
        goods_stats_goods_dto->tariffs = NULL;
    }
    if (goods_stats_goods_dto->pictures) {
        list_ForEach(listEntry, goods_stats_goods_dto->pictures) {
            free(listEntry->data);
        }
        list_freeList(goods_stats_goods_dto->pictures);
        goods_stats_goods_dto->pictures = NULL;
    }
    free(goods_stats_goods_dto);
}

cJSON *goods_stats_goods_dto_convertToJSON(goods_stats_goods_dto_t *goods_stats_goods_dto) {
    cJSON *item = cJSON_CreateObject();

    // goods_stats_goods_dto->shop_sku
    if(goods_stats_goods_dto->shop_sku) {
    if(cJSON_AddStringToObject(item, "shopSku", goods_stats_goods_dto->shop_sku) == NULL) {
    goto fail; //String
    }
    }


    // goods_stats_goods_dto->market_sku
    if(goods_stats_goods_dto->market_sku) {
    if(cJSON_AddNumberToObject(item, "marketSku", goods_stats_goods_dto->market_sku) == NULL) {
    goto fail; //Numeric
    }
    }


    // goods_stats_goods_dto->name
    if(goods_stats_goods_dto->name) {
    if(cJSON_AddStringToObject(item, "name", goods_stats_goods_dto->name) == NULL) {
    goto fail; //String
    }
    }


    // goods_stats_goods_dto->price
    if(goods_stats_goods_dto->price) {
    if(cJSON_AddNumberToObject(item, "price", goods_stats_goods_dto->price) == NULL) {
    goto fail; //Numeric
    }
    }


    // goods_stats_goods_dto->category_id
    if(goods_stats_goods_dto->category_id) {
    if(cJSON_AddNumberToObject(item, "categoryId", goods_stats_goods_dto->category_id) == NULL) {
    goto fail; //Numeric
    }
    }


    // goods_stats_goods_dto->category_name
    if(goods_stats_goods_dto->category_name) {
    if(cJSON_AddStringToObject(item, "categoryName", goods_stats_goods_dto->category_name) == NULL) {
    goto fail; //String
    }
    }


    // goods_stats_goods_dto->weight_dimensions
    if(goods_stats_goods_dto->weight_dimensions) {
    cJSON *weight_dimensions_local_JSON = goods_stats_weight_dimensions_dto_convertToJSON(goods_stats_goods_dto->weight_dimensions);
    if(weight_dimensions_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "weightDimensions", weight_dimensions_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // goods_stats_goods_dto->warehouses
    if(goods_stats_goods_dto->warehouses) {
    cJSON *warehouses = cJSON_AddArrayToObject(item, "warehouses");
    if(warehouses == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *warehousesListEntry;
    if (goods_stats_goods_dto->warehouses) {
    list_ForEach(warehousesListEntry, goods_stats_goods_dto->warehouses) {
    cJSON *itemLocal = goods_stats_warehouse_dto_convertToJSON(warehousesListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(warehouses, itemLocal);
    }
    }
    }


    // goods_stats_goods_dto->tariffs
    if(goods_stats_goods_dto->tariffs) {
    cJSON *tariffs = cJSON_AddArrayToObject(item, "tariffs");
    if(tariffs == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *tariffsListEntry;
    if (goods_stats_goods_dto->tariffs) {
    list_ForEach(tariffsListEntry, goods_stats_goods_dto->tariffs) {
    cJSON *itemLocal = tariff_dto_convertToJSON(tariffsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(tariffs, itemLocal);
    }
    }
    }


    // goods_stats_goods_dto->pictures
    if(goods_stats_goods_dto->pictures) {
    cJSON *pictures = cJSON_AddArrayToObject(item, "pictures");
    if(pictures == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *picturesListEntry;
    list_ForEach(picturesListEntry, goods_stats_goods_dto->pictures) {
    if(cJSON_AddStringToObject(pictures, "", (char*)picturesListEntry->data) == NULL)
    {
        goto fail;
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

goods_stats_goods_dto_t *goods_stats_goods_dto_parseFromJSON(cJSON *goods_stats_goods_dtoJSON){

    goods_stats_goods_dto_t *goods_stats_goods_dto_local_var = NULL;

    // define the local variable for goods_stats_goods_dto->weight_dimensions
    goods_stats_weight_dimensions_dto_t *weight_dimensions_local_nonprim = NULL;

    // define the local list for goods_stats_goods_dto->warehouses
    list_t *warehousesList = NULL;

    // define the local list for goods_stats_goods_dto->tariffs
    list_t *tariffsList = NULL;

    // define the local list for goods_stats_goods_dto->pictures
    list_t *picturesList = NULL;

    // goods_stats_goods_dto->shop_sku
    cJSON *shop_sku = cJSON_GetObjectItemCaseSensitive(goods_stats_goods_dtoJSON, "shopSku");
    if (shop_sku) { 
    if(!cJSON_IsString(shop_sku) && !cJSON_IsNull(shop_sku))
    {
    goto end; //String
    }
    }

    // goods_stats_goods_dto->market_sku
    cJSON *market_sku = cJSON_GetObjectItemCaseSensitive(goods_stats_goods_dtoJSON, "marketSku");
    if (market_sku) { 
    if(!cJSON_IsNumber(market_sku))
    {
    goto end; //Numeric
    }
    }

    // goods_stats_goods_dto->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(goods_stats_goods_dtoJSON, "name");
    if (name) { 
    if(!cJSON_IsString(name) && !cJSON_IsNull(name))
    {
    goto end; //String
    }
    }

    // goods_stats_goods_dto->price
    cJSON *price = cJSON_GetObjectItemCaseSensitive(goods_stats_goods_dtoJSON, "price");
    if (price) { 
    if(!cJSON_IsNumber(price))
    {
    goto end; //Numeric
    }
    }

    // goods_stats_goods_dto->category_id
    cJSON *category_id = cJSON_GetObjectItemCaseSensitive(goods_stats_goods_dtoJSON, "categoryId");
    if (category_id) { 
    if(!cJSON_IsNumber(category_id))
    {
    goto end; //Numeric
    }
    }

    // goods_stats_goods_dto->category_name
    cJSON *category_name = cJSON_GetObjectItemCaseSensitive(goods_stats_goods_dtoJSON, "categoryName");
    if (category_name) { 
    if(!cJSON_IsString(category_name) && !cJSON_IsNull(category_name))
    {
    goto end; //String
    }
    }

    // goods_stats_goods_dto->weight_dimensions
    cJSON *weight_dimensions = cJSON_GetObjectItemCaseSensitive(goods_stats_goods_dtoJSON, "weightDimensions");
    if (weight_dimensions) { 
    weight_dimensions_local_nonprim = goods_stats_weight_dimensions_dto_parseFromJSON(weight_dimensions); //nonprimitive
    }

    // goods_stats_goods_dto->warehouses
    cJSON *warehouses = cJSON_GetObjectItemCaseSensitive(goods_stats_goods_dtoJSON, "warehouses");
    if (warehouses) { 
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
        goods_stats_warehouse_dto_t *warehousesItem = goods_stats_warehouse_dto_parseFromJSON(warehouses_local_nonprimitive);

        list_addElement(warehousesList, warehousesItem);
    }
    }

    // goods_stats_goods_dto->tariffs
    cJSON *tariffs = cJSON_GetObjectItemCaseSensitive(goods_stats_goods_dtoJSON, "tariffs");
    if (tariffs) { 
    cJSON *tariffs_local_nonprimitive = NULL;
    if(!cJSON_IsArray(tariffs)){
        goto end; //nonprimitive container
    }

    tariffsList = list_createList();

    cJSON_ArrayForEach(tariffs_local_nonprimitive,tariffs )
    {
        if(!cJSON_IsObject(tariffs_local_nonprimitive)){
            goto end;
        }
        tariff_dto_t *tariffsItem = tariff_dto_parseFromJSON(tariffs_local_nonprimitive);

        list_addElement(tariffsList, tariffsItem);
    }
    }

    // goods_stats_goods_dto->pictures
    cJSON *pictures = cJSON_GetObjectItemCaseSensitive(goods_stats_goods_dtoJSON, "pictures");
    if (pictures) { 
    cJSON *pictures_local = NULL;
    if(!cJSON_IsArray(pictures)) {
        goto end;//primitive container
    }
    picturesList = list_createList();

    cJSON_ArrayForEach(pictures_local, pictures)
    {
        if(!cJSON_IsString(pictures_local))
        {
            goto end;
        }
        list_addElement(picturesList , strdup(pictures_local->valuestring));
    }
    }


    goods_stats_goods_dto_local_var = goods_stats_goods_dto_create (
        shop_sku && !cJSON_IsNull(shop_sku) ? strdup(shop_sku->valuestring) : NULL,
        market_sku ? market_sku->valuedouble : 0,
        name && !cJSON_IsNull(name) ? strdup(name->valuestring) : NULL,
        price ? price->valuedouble : 0,
        category_id ? category_id->valuedouble : 0,
        category_name && !cJSON_IsNull(category_name) ? strdup(category_name->valuestring) : NULL,
        weight_dimensions ? weight_dimensions_local_nonprim : NULL,
        warehouses ? warehousesList : NULL,
        tariffs ? tariffsList : NULL,
        pictures ? picturesList : NULL
        );

    return goods_stats_goods_dto_local_var;
end:
    if (weight_dimensions_local_nonprim) {
        goods_stats_weight_dimensions_dto_free(weight_dimensions_local_nonprim);
        weight_dimensions_local_nonprim = NULL;
    }
    if (warehousesList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, warehousesList) {
            goods_stats_warehouse_dto_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(warehousesList);
        warehousesList = NULL;
    }
    if (tariffsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, tariffsList) {
            tariff_dto_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(tariffsList);
        tariffsList = NULL;
    }
    if (picturesList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, picturesList) {
            free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(picturesList);
        picturesList = NULL;
    }
    return NULL;

}
