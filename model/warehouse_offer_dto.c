#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "warehouse_offer_dto.h"



warehouse_offer_dto_t *warehouse_offer_dto_create(
    char *offer_id,
    turnover_dto_t *turnover_summary,
    list_t *stocks,
    char *updated_at
    ) {
    warehouse_offer_dto_t *warehouse_offer_dto_local_var = malloc(sizeof(warehouse_offer_dto_t));
    if (!warehouse_offer_dto_local_var) {
        return NULL;
    }
    warehouse_offer_dto_local_var->offer_id = offer_id;
    warehouse_offer_dto_local_var->turnover_summary = turnover_summary;
    warehouse_offer_dto_local_var->stocks = stocks;
    warehouse_offer_dto_local_var->updated_at = updated_at;

    return warehouse_offer_dto_local_var;
}


void warehouse_offer_dto_free(warehouse_offer_dto_t *warehouse_offer_dto) {
    if(NULL == warehouse_offer_dto){
        return ;
    }
    listEntry_t *listEntry;
    if (warehouse_offer_dto->offer_id) {
        free(warehouse_offer_dto->offer_id);
        warehouse_offer_dto->offer_id = NULL;
    }
    if (warehouse_offer_dto->turnover_summary) {
        turnover_dto_free(warehouse_offer_dto->turnover_summary);
        warehouse_offer_dto->turnover_summary = NULL;
    }
    if (warehouse_offer_dto->stocks) {
        list_ForEach(listEntry, warehouse_offer_dto->stocks) {
            warehouse_stock_dto_free(listEntry->data);
        }
        list_freeList(warehouse_offer_dto->stocks);
        warehouse_offer_dto->stocks = NULL;
    }
    if (warehouse_offer_dto->updated_at) {
        free(warehouse_offer_dto->updated_at);
        warehouse_offer_dto->updated_at = NULL;
    }
    free(warehouse_offer_dto);
}

cJSON *warehouse_offer_dto_convertToJSON(warehouse_offer_dto_t *warehouse_offer_dto) {
    cJSON *item = cJSON_CreateObject();

    // warehouse_offer_dto->offer_id
    if (!warehouse_offer_dto->offer_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "offerId", warehouse_offer_dto->offer_id) == NULL) {
    goto fail; //String
    }


    // warehouse_offer_dto->turnover_summary
    if(warehouse_offer_dto->turnover_summary) {
    cJSON *turnover_summary_local_JSON = turnover_dto_convertToJSON(warehouse_offer_dto->turnover_summary);
    if(turnover_summary_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "turnoverSummary", turnover_summary_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // warehouse_offer_dto->stocks
    if (!warehouse_offer_dto->stocks) {
        goto fail;
    }
    cJSON *stocks = cJSON_AddArrayToObject(item, "stocks");
    if(stocks == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *stocksListEntry;
    if (warehouse_offer_dto->stocks) {
    list_ForEach(stocksListEntry, warehouse_offer_dto->stocks) {
    cJSON *itemLocal = warehouse_stock_dto_convertToJSON(stocksListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(stocks, itemLocal);
    }
    }


    // warehouse_offer_dto->updated_at
    if(warehouse_offer_dto->updated_at) {
    if(cJSON_AddStringToObject(item, "updatedAt", warehouse_offer_dto->updated_at) == NULL) {
    goto fail; //Date-Time
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

warehouse_offer_dto_t *warehouse_offer_dto_parseFromJSON(cJSON *warehouse_offer_dtoJSON){

    warehouse_offer_dto_t *warehouse_offer_dto_local_var = NULL;

    // define the local variable for warehouse_offer_dto->turnover_summary
    turnover_dto_t *turnover_summary_local_nonprim = NULL;

    // define the local list for warehouse_offer_dto->stocks
    list_t *stocksList = NULL;

    // warehouse_offer_dto->offer_id
    cJSON *offer_id = cJSON_GetObjectItemCaseSensitive(warehouse_offer_dtoJSON, "offerId");
    if (!offer_id) {
        goto end;
    }

    
    if(!cJSON_IsString(offer_id))
    {
    goto end; //String
    }

    // warehouse_offer_dto->turnover_summary
    cJSON *turnover_summary = cJSON_GetObjectItemCaseSensitive(warehouse_offer_dtoJSON, "turnoverSummary");
    if (turnover_summary) { 
    turnover_summary_local_nonprim = turnover_dto_parseFromJSON(turnover_summary); //nonprimitive
    }

    // warehouse_offer_dto->stocks
    cJSON *stocks = cJSON_GetObjectItemCaseSensitive(warehouse_offer_dtoJSON, "stocks");
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

    // warehouse_offer_dto->updated_at
    cJSON *updated_at = cJSON_GetObjectItemCaseSensitive(warehouse_offer_dtoJSON, "updatedAt");
    if (updated_at) { 
    if(!cJSON_IsString(updated_at) && !cJSON_IsNull(updated_at))
    {
    goto end; //DateTime
    }
    }


    warehouse_offer_dto_local_var = warehouse_offer_dto_create (
        strdup(offer_id->valuestring),
        turnover_summary ? turnover_summary_local_nonprim : NULL,
        stocksList,
        updated_at && !cJSON_IsNull(updated_at) ? strdup(updated_at->valuestring) : NULL
        );

    return warehouse_offer_dto_local_var;
end:
    if (turnover_summary_local_nonprim) {
        turnover_dto_free(turnover_summary_local_nonprim);
        turnover_summary_local_nonprim = NULL;
    }
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
