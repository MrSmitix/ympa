#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "sku_bid_recommendation_item_dto.h"



sku_bid_recommendation_item_dto_t *sku_bid_recommendation_item_dto_create(
    char *sku,
    int bid,
    list_t *bid_recommendations,
    list_t *price_recommendations
    ) {
    sku_bid_recommendation_item_dto_t *sku_bid_recommendation_item_dto_local_var = malloc(sizeof(sku_bid_recommendation_item_dto_t));
    if (!sku_bid_recommendation_item_dto_local_var) {
        return NULL;
    }
    sku_bid_recommendation_item_dto_local_var->sku = sku;
    sku_bid_recommendation_item_dto_local_var->bid = bid;
    sku_bid_recommendation_item_dto_local_var->bid_recommendations = bid_recommendations;
    sku_bid_recommendation_item_dto_local_var->price_recommendations = price_recommendations;

    return sku_bid_recommendation_item_dto_local_var;
}


void sku_bid_recommendation_item_dto_free(sku_bid_recommendation_item_dto_t *sku_bid_recommendation_item_dto) {
    if(NULL == sku_bid_recommendation_item_dto){
        return ;
    }
    listEntry_t *listEntry;
    if (sku_bid_recommendation_item_dto->sku) {
        free(sku_bid_recommendation_item_dto->sku);
        sku_bid_recommendation_item_dto->sku = NULL;
    }
    if (sku_bid_recommendation_item_dto->bid_recommendations) {
        list_ForEach(listEntry, sku_bid_recommendation_item_dto->bid_recommendations) {
            bid_recommendation_item_dto_free(listEntry->data);
        }
        list_freeList(sku_bid_recommendation_item_dto->bid_recommendations);
        sku_bid_recommendation_item_dto->bid_recommendations = NULL;
    }
    if (sku_bid_recommendation_item_dto->price_recommendations) {
        list_ForEach(listEntry, sku_bid_recommendation_item_dto->price_recommendations) {
            price_recommendation_item_dto_free(listEntry->data);
        }
        list_freeList(sku_bid_recommendation_item_dto->price_recommendations);
        sku_bid_recommendation_item_dto->price_recommendations = NULL;
    }
    free(sku_bid_recommendation_item_dto);
}

cJSON *sku_bid_recommendation_item_dto_convertToJSON(sku_bid_recommendation_item_dto_t *sku_bid_recommendation_item_dto) {
    cJSON *item = cJSON_CreateObject();

    // sku_bid_recommendation_item_dto->sku
    if (!sku_bid_recommendation_item_dto->sku) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "sku", sku_bid_recommendation_item_dto->sku) == NULL) {
    goto fail; //String
    }


    // sku_bid_recommendation_item_dto->bid
    if (!sku_bid_recommendation_item_dto->bid) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "bid", sku_bid_recommendation_item_dto->bid) == NULL) {
    goto fail; //Numeric
    }


    // sku_bid_recommendation_item_dto->bid_recommendations
    if(sku_bid_recommendation_item_dto->bid_recommendations) {
    cJSON *bid_recommendations = cJSON_AddArrayToObject(item, "bidRecommendations");
    if(bid_recommendations == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *bid_recommendationsListEntry;
    if (sku_bid_recommendation_item_dto->bid_recommendations) {
    list_ForEach(bid_recommendationsListEntry, sku_bid_recommendation_item_dto->bid_recommendations) {
    cJSON *itemLocal = bid_recommendation_item_dto_convertToJSON(bid_recommendationsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(bid_recommendations, itemLocal);
    }
    }
    }


    // sku_bid_recommendation_item_dto->price_recommendations
    if(sku_bid_recommendation_item_dto->price_recommendations) {
    cJSON *price_recommendations = cJSON_AddArrayToObject(item, "priceRecommendations");
    if(price_recommendations == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *price_recommendationsListEntry;
    if (sku_bid_recommendation_item_dto->price_recommendations) {
    list_ForEach(price_recommendationsListEntry, sku_bid_recommendation_item_dto->price_recommendations) {
    cJSON *itemLocal = price_recommendation_item_dto_convertToJSON(price_recommendationsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(price_recommendations, itemLocal);
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

sku_bid_recommendation_item_dto_t *sku_bid_recommendation_item_dto_parseFromJSON(cJSON *sku_bid_recommendation_item_dtoJSON){

    sku_bid_recommendation_item_dto_t *sku_bid_recommendation_item_dto_local_var = NULL;

    // define the local list for sku_bid_recommendation_item_dto->bid_recommendations
    list_t *bid_recommendationsList = NULL;

    // define the local list for sku_bid_recommendation_item_dto->price_recommendations
    list_t *price_recommendationsList = NULL;

    // sku_bid_recommendation_item_dto->sku
    cJSON *sku = cJSON_GetObjectItemCaseSensitive(sku_bid_recommendation_item_dtoJSON, "sku");
    if (!sku) {
        goto end;
    }

    
    if(!cJSON_IsString(sku))
    {
    goto end; //String
    }

    // sku_bid_recommendation_item_dto->bid
    cJSON *bid = cJSON_GetObjectItemCaseSensitive(sku_bid_recommendation_item_dtoJSON, "bid");
    if (!bid) {
        goto end;
    }

    
    if(!cJSON_IsNumber(bid))
    {
    goto end; //Numeric
    }

    // sku_bid_recommendation_item_dto->bid_recommendations
    cJSON *bid_recommendations = cJSON_GetObjectItemCaseSensitive(sku_bid_recommendation_item_dtoJSON, "bidRecommendations");
    if (bid_recommendations) { 
    cJSON *bid_recommendations_local_nonprimitive = NULL;
    if(!cJSON_IsArray(bid_recommendations)){
        goto end; //nonprimitive container
    }

    bid_recommendationsList = list_createList();

    cJSON_ArrayForEach(bid_recommendations_local_nonprimitive,bid_recommendations )
    {
        if(!cJSON_IsObject(bid_recommendations_local_nonprimitive)){
            goto end;
        }
        bid_recommendation_item_dto_t *bid_recommendationsItem = bid_recommendation_item_dto_parseFromJSON(bid_recommendations_local_nonprimitive);

        list_addElement(bid_recommendationsList, bid_recommendationsItem);
    }
    }

    // sku_bid_recommendation_item_dto->price_recommendations
    cJSON *price_recommendations = cJSON_GetObjectItemCaseSensitive(sku_bid_recommendation_item_dtoJSON, "priceRecommendations");
    if (price_recommendations) { 
    cJSON *price_recommendations_local_nonprimitive = NULL;
    if(!cJSON_IsArray(price_recommendations)){
        goto end; //nonprimitive container
    }

    price_recommendationsList = list_createList();

    cJSON_ArrayForEach(price_recommendations_local_nonprimitive,price_recommendations )
    {
        if(!cJSON_IsObject(price_recommendations_local_nonprimitive)){
            goto end;
        }
        price_recommendation_item_dto_t *price_recommendationsItem = price_recommendation_item_dto_parseFromJSON(price_recommendations_local_nonprimitive);

        list_addElement(price_recommendationsList, price_recommendationsItem);
    }
    }


    sku_bid_recommendation_item_dto_local_var = sku_bid_recommendation_item_dto_create (
        strdup(sku->valuestring),
        bid->valuedouble,
        bid_recommendations ? bid_recommendationsList : NULL,
        price_recommendations ? price_recommendationsList : NULL
        );

    return sku_bid_recommendation_item_dto_local_var;
end:
    if (bid_recommendationsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, bid_recommendationsList) {
            bid_recommendation_item_dto_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(bid_recommendationsList);
        bid_recommendationsList = NULL;
    }
    if (price_recommendationsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, price_recommendationsList) {
            price_recommendation_item_dto_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(price_recommendationsList);
        price_recommendationsList = NULL;
    }
    return NULL;

}
