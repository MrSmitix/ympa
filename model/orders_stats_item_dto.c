#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "orders_stats_item_dto.h"



orders_stats_item_dto_t *orders_stats_item_dto_create(
    char *offer_name,
    long market_sku,
    char *shop_sku,
    int count,
    list_t *prices,
    orders_stats_warehouse_dto_t *warehouse,
    list_t *details,
    list_t *cis_list,
    int initial_count,
    int bid_fee,
    double cofinance_threshold,
    double cofinance_value
    ) {
    orders_stats_item_dto_t *orders_stats_item_dto_local_var = malloc(sizeof(orders_stats_item_dto_t));
    if (!orders_stats_item_dto_local_var) {
        return NULL;
    }
    orders_stats_item_dto_local_var->offer_name = offer_name;
    orders_stats_item_dto_local_var->market_sku = market_sku;
    orders_stats_item_dto_local_var->shop_sku = shop_sku;
    orders_stats_item_dto_local_var->count = count;
    orders_stats_item_dto_local_var->prices = prices;
    orders_stats_item_dto_local_var->warehouse = warehouse;
    orders_stats_item_dto_local_var->details = details;
    orders_stats_item_dto_local_var->cis_list = cis_list;
    orders_stats_item_dto_local_var->initial_count = initial_count;
    orders_stats_item_dto_local_var->bid_fee = bid_fee;
    orders_stats_item_dto_local_var->cofinance_threshold = cofinance_threshold;
    orders_stats_item_dto_local_var->cofinance_value = cofinance_value;

    return orders_stats_item_dto_local_var;
}


void orders_stats_item_dto_free(orders_stats_item_dto_t *orders_stats_item_dto) {
    if(NULL == orders_stats_item_dto){
        return ;
    }
    listEntry_t *listEntry;
    if (orders_stats_item_dto->offer_name) {
        free(orders_stats_item_dto->offer_name);
        orders_stats_item_dto->offer_name = NULL;
    }
    if (orders_stats_item_dto->shop_sku) {
        free(orders_stats_item_dto->shop_sku);
        orders_stats_item_dto->shop_sku = NULL;
    }
    if (orders_stats_item_dto->prices) {
        list_ForEach(listEntry, orders_stats_item_dto->prices) {
            orders_stats_price_dto_free(listEntry->data);
        }
        list_freeList(orders_stats_item_dto->prices);
        orders_stats_item_dto->prices = NULL;
    }
    if (orders_stats_item_dto->warehouse) {
        orders_stats_warehouse_dto_free(orders_stats_item_dto->warehouse);
        orders_stats_item_dto->warehouse = NULL;
    }
    if (orders_stats_item_dto->details) {
        list_ForEach(listEntry, orders_stats_item_dto->details) {
            orders_stats_details_dto_free(listEntry->data);
        }
        list_freeList(orders_stats_item_dto->details);
        orders_stats_item_dto->details = NULL;
    }
    if (orders_stats_item_dto->cis_list) {
        list_ForEach(listEntry, orders_stats_item_dto->cis_list) {
            free(listEntry->data);
        }
        list_freeList(orders_stats_item_dto->cis_list);
        orders_stats_item_dto->cis_list = NULL;
    }
    free(orders_stats_item_dto);
}

cJSON *orders_stats_item_dto_convertToJSON(orders_stats_item_dto_t *orders_stats_item_dto) {
    cJSON *item = cJSON_CreateObject();

    // orders_stats_item_dto->offer_name
    if(orders_stats_item_dto->offer_name) {
    if(cJSON_AddStringToObject(item, "offerName", orders_stats_item_dto->offer_name) == NULL) {
    goto fail; //String
    }
    }


    // orders_stats_item_dto->market_sku
    if(orders_stats_item_dto->market_sku) {
    if(cJSON_AddNumberToObject(item, "marketSku", orders_stats_item_dto->market_sku) == NULL) {
    goto fail; //Numeric
    }
    }


    // orders_stats_item_dto->shop_sku
    if(orders_stats_item_dto->shop_sku) {
    if(cJSON_AddStringToObject(item, "shopSku", orders_stats_item_dto->shop_sku) == NULL) {
    goto fail; //String
    }
    }


    // orders_stats_item_dto->count
    if(orders_stats_item_dto->count) {
    if(cJSON_AddNumberToObject(item, "count", orders_stats_item_dto->count) == NULL) {
    goto fail; //Numeric
    }
    }


    // orders_stats_item_dto->prices
    if(orders_stats_item_dto->prices) {
    cJSON *prices = cJSON_AddArrayToObject(item, "prices");
    if(prices == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *pricesListEntry;
    if (orders_stats_item_dto->prices) {
    list_ForEach(pricesListEntry, orders_stats_item_dto->prices) {
    cJSON *itemLocal = orders_stats_price_dto_convertToJSON(pricesListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(prices, itemLocal);
    }
    }
    }


    // orders_stats_item_dto->warehouse
    if(orders_stats_item_dto->warehouse) {
    cJSON *warehouse_local_JSON = orders_stats_warehouse_dto_convertToJSON(orders_stats_item_dto->warehouse);
    if(warehouse_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "warehouse", warehouse_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // orders_stats_item_dto->details
    if(orders_stats_item_dto->details) {
    cJSON *details = cJSON_AddArrayToObject(item, "details");
    if(details == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *detailsListEntry;
    if (orders_stats_item_dto->details) {
    list_ForEach(detailsListEntry, orders_stats_item_dto->details) {
    cJSON *itemLocal = orders_stats_details_dto_convertToJSON(detailsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(details, itemLocal);
    }
    }
    }


    // orders_stats_item_dto->cis_list
    if(orders_stats_item_dto->cis_list) {
    cJSON *cis_list = cJSON_AddArrayToObject(item, "cisList");
    if(cis_list == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *cis_listListEntry;
    list_ForEach(cis_listListEntry, orders_stats_item_dto->cis_list) {
    if(cJSON_AddStringToObject(cis_list, "", (char*)cis_listListEntry->data) == NULL)
    {
        goto fail;
    }
    }
    }


    // orders_stats_item_dto->initial_count
    if(orders_stats_item_dto->initial_count) {
    if(cJSON_AddNumberToObject(item, "initialCount", orders_stats_item_dto->initial_count) == NULL) {
    goto fail; //Numeric
    }
    }


    // orders_stats_item_dto->bid_fee
    if(orders_stats_item_dto->bid_fee) {
    if(cJSON_AddNumberToObject(item, "bidFee", orders_stats_item_dto->bid_fee) == NULL) {
    goto fail; //Numeric
    }
    }


    // orders_stats_item_dto->cofinance_threshold
    if(orders_stats_item_dto->cofinance_threshold) {
    if(cJSON_AddNumberToObject(item, "cofinanceThreshold", orders_stats_item_dto->cofinance_threshold) == NULL) {
    goto fail; //Numeric
    }
    }


    // orders_stats_item_dto->cofinance_value
    if(orders_stats_item_dto->cofinance_value) {
    if(cJSON_AddNumberToObject(item, "cofinanceValue", orders_stats_item_dto->cofinance_value) == NULL) {
    goto fail; //Numeric
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

orders_stats_item_dto_t *orders_stats_item_dto_parseFromJSON(cJSON *orders_stats_item_dtoJSON){

    orders_stats_item_dto_t *orders_stats_item_dto_local_var = NULL;

    // define the local list for orders_stats_item_dto->prices
    list_t *pricesList = NULL;

    // define the local variable for orders_stats_item_dto->warehouse
    orders_stats_warehouse_dto_t *warehouse_local_nonprim = NULL;

    // define the local list for orders_stats_item_dto->details
    list_t *detailsList = NULL;

    // define the local list for orders_stats_item_dto->cis_list
    list_t *cis_listList = NULL;

    // orders_stats_item_dto->offer_name
    cJSON *offer_name = cJSON_GetObjectItemCaseSensitive(orders_stats_item_dtoJSON, "offerName");
    if (offer_name) { 
    if(!cJSON_IsString(offer_name) && !cJSON_IsNull(offer_name))
    {
    goto end; //String
    }
    }

    // orders_stats_item_dto->market_sku
    cJSON *market_sku = cJSON_GetObjectItemCaseSensitive(orders_stats_item_dtoJSON, "marketSku");
    if (market_sku) { 
    if(!cJSON_IsNumber(market_sku))
    {
    goto end; //Numeric
    }
    }

    // orders_stats_item_dto->shop_sku
    cJSON *shop_sku = cJSON_GetObjectItemCaseSensitive(orders_stats_item_dtoJSON, "shopSku");
    if (shop_sku) { 
    if(!cJSON_IsString(shop_sku) && !cJSON_IsNull(shop_sku))
    {
    goto end; //String
    }
    }

    // orders_stats_item_dto->count
    cJSON *count = cJSON_GetObjectItemCaseSensitive(orders_stats_item_dtoJSON, "count");
    if (count) { 
    if(!cJSON_IsNumber(count))
    {
    goto end; //Numeric
    }
    }

    // orders_stats_item_dto->prices
    cJSON *prices = cJSON_GetObjectItemCaseSensitive(orders_stats_item_dtoJSON, "prices");
    if (prices) { 
    cJSON *prices_local_nonprimitive = NULL;
    if(!cJSON_IsArray(prices)){
        goto end; //nonprimitive container
    }

    pricesList = list_createList();

    cJSON_ArrayForEach(prices_local_nonprimitive,prices )
    {
        if(!cJSON_IsObject(prices_local_nonprimitive)){
            goto end;
        }
        orders_stats_price_dto_t *pricesItem = orders_stats_price_dto_parseFromJSON(prices_local_nonprimitive);

        list_addElement(pricesList, pricesItem);
    }
    }

    // orders_stats_item_dto->warehouse
    cJSON *warehouse = cJSON_GetObjectItemCaseSensitive(orders_stats_item_dtoJSON, "warehouse");
    if (warehouse) { 
    warehouse_local_nonprim = orders_stats_warehouse_dto_parseFromJSON(warehouse); //nonprimitive
    }

    // orders_stats_item_dto->details
    cJSON *details = cJSON_GetObjectItemCaseSensitive(orders_stats_item_dtoJSON, "details");
    if (details) { 
    cJSON *details_local_nonprimitive = NULL;
    if(!cJSON_IsArray(details)){
        goto end; //nonprimitive container
    }

    detailsList = list_createList();

    cJSON_ArrayForEach(details_local_nonprimitive,details )
    {
        if(!cJSON_IsObject(details_local_nonprimitive)){
            goto end;
        }
        orders_stats_details_dto_t *detailsItem = orders_stats_details_dto_parseFromJSON(details_local_nonprimitive);

        list_addElement(detailsList, detailsItem);
    }
    }

    // orders_stats_item_dto->cis_list
    cJSON *cis_list = cJSON_GetObjectItemCaseSensitive(orders_stats_item_dtoJSON, "cisList");
    if (cis_list) { 
    cJSON *cis_list_local = NULL;
    if(!cJSON_IsArray(cis_list)) {
        goto end;//primitive container
    }
    cis_listList = list_createList();

    cJSON_ArrayForEach(cis_list_local, cis_list)
    {
        if(!cJSON_IsString(cis_list_local))
        {
            goto end;
        }
        list_addElement(cis_listList , strdup(cis_list_local->valuestring));
    }
    }

    // orders_stats_item_dto->initial_count
    cJSON *initial_count = cJSON_GetObjectItemCaseSensitive(orders_stats_item_dtoJSON, "initialCount");
    if (initial_count) { 
    if(!cJSON_IsNumber(initial_count))
    {
    goto end; //Numeric
    }
    }

    // orders_stats_item_dto->bid_fee
    cJSON *bid_fee = cJSON_GetObjectItemCaseSensitive(orders_stats_item_dtoJSON, "bidFee");
    if (bid_fee) { 
    if(!cJSON_IsNumber(bid_fee))
    {
    goto end; //Numeric
    }
    }

    // orders_stats_item_dto->cofinance_threshold
    cJSON *cofinance_threshold = cJSON_GetObjectItemCaseSensitive(orders_stats_item_dtoJSON, "cofinanceThreshold");
    if (cofinance_threshold) { 
    if(!cJSON_IsNumber(cofinance_threshold))
    {
    goto end; //Numeric
    }
    }

    // orders_stats_item_dto->cofinance_value
    cJSON *cofinance_value = cJSON_GetObjectItemCaseSensitive(orders_stats_item_dtoJSON, "cofinanceValue");
    if (cofinance_value) { 
    if(!cJSON_IsNumber(cofinance_value))
    {
    goto end; //Numeric
    }
    }


    orders_stats_item_dto_local_var = orders_stats_item_dto_create (
        offer_name && !cJSON_IsNull(offer_name) ? strdup(offer_name->valuestring) : NULL,
        market_sku ? market_sku->valuedouble : 0,
        shop_sku && !cJSON_IsNull(shop_sku) ? strdup(shop_sku->valuestring) : NULL,
        count ? count->valuedouble : 0,
        prices ? pricesList : NULL,
        warehouse ? warehouse_local_nonprim : NULL,
        details ? detailsList : NULL,
        cis_list ? cis_listList : NULL,
        initial_count ? initial_count->valuedouble : 0,
        bid_fee ? bid_fee->valuedouble : 0,
        cofinance_threshold ? cofinance_threshold->valuedouble : 0,
        cofinance_value ? cofinance_value->valuedouble : 0
        );

    return orders_stats_item_dto_local_var;
end:
    if (pricesList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, pricesList) {
            orders_stats_price_dto_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(pricesList);
        pricesList = NULL;
    }
    if (warehouse_local_nonprim) {
        orders_stats_warehouse_dto_free(warehouse_local_nonprim);
        warehouse_local_nonprim = NULL;
    }
    if (detailsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, detailsList) {
            orders_stats_details_dto_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(detailsList);
        detailsList = NULL;
    }
    if (cis_listList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, cis_listList) {
            free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(cis_listList);
        cis_listList = NULL;
    }
    return NULL;

}
