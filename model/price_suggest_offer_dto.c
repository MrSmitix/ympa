#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "price_suggest_offer_dto.h"



price_suggest_offer_dto_t *price_suggest_offer_dto_create(
    long market_sku,
    char *offer_id,
    list_t *price_suggestion
    ) {
    price_suggest_offer_dto_t *price_suggest_offer_dto_local_var = malloc(sizeof(price_suggest_offer_dto_t));
    if (!price_suggest_offer_dto_local_var) {
        return NULL;
    }
    price_suggest_offer_dto_local_var->market_sku = market_sku;
    price_suggest_offer_dto_local_var->offer_id = offer_id;
    price_suggest_offer_dto_local_var->price_suggestion = price_suggestion;

    return price_suggest_offer_dto_local_var;
}


void price_suggest_offer_dto_free(price_suggest_offer_dto_t *price_suggest_offer_dto) {
    if(NULL == price_suggest_offer_dto){
        return ;
    }
    listEntry_t *listEntry;
    if (price_suggest_offer_dto->offer_id) {
        free(price_suggest_offer_dto->offer_id);
        price_suggest_offer_dto->offer_id = NULL;
    }
    if (price_suggest_offer_dto->price_suggestion) {
        list_ForEach(listEntry, price_suggest_offer_dto->price_suggestion) {
            price_suggest_dto_free(listEntry->data);
        }
        list_freeList(price_suggest_offer_dto->price_suggestion);
        price_suggest_offer_dto->price_suggestion = NULL;
    }
    free(price_suggest_offer_dto);
}

cJSON *price_suggest_offer_dto_convertToJSON(price_suggest_offer_dto_t *price_suggest_offer_dto) {
    cJSON *item = cJSON_CreateObject();

    // price_suggest_offer_dto->market_sku
    if(price_suggest_offer_dto->market_sku) {
    if(cJSON_AddNumberToObject(item, "marketSku", price_suggest_offer_dto->market_sku) == NULL) {
    goto fail; //Numeric
    }
    }


    // price_suggest_offer_dto->offer_id
    if(price_suggest_offer_dto->offer_id) {
    if(cJSON_AddStringToObject(item, "offerId", price_suggest_offer_dto->offer_id) == NULL) {
    goto fail; //String
    }
    }


    // price_suggest_offer_dto->price_suggestion
    if(price_suggest_offer_dto->price_suggestion) {
    cJSON *price_suggestion = cJSON_AddArrayToObject(item, "priceSuggestion");
    if(price_suggestion == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *price_suggestionListEntry;
    if (price_suggest_offer_dto->price_suggestion) {
    list_ForEach(price_suggestionListEntry, price_suggest_offer_dto->price_suggestion) {
    cJSON *itemLocal = price_suggest_dto_convertToJSON(price_suggestionListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(price_suggestion, itemLocal);
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

price_suggest_offer_dto_t *price_suggest_offer_dto_parseFromJSON(cJSON *price_suggest_offer_dtoJSON){

    price_suggest_offer_dto_t *price_suggest_offer_dto_local_var = NULL;

    // define the local list for price_suggest_offer_dto->price_suggestion
    list_t *price_suggestionList = NULL;

    // price_suggest_offer_dto->market_sku
    cJSON *market_sku = cJSON_GetObjectItemCaseSensitive(price_suggest_offer_dtoJSON, "marketSku");
    if (market_sku) { 
    if(!cJSON_IsNumber(market_sku))
    {
    goto end; //Numeric
    }
    }

    // price_suggest_offer_dto->offer_id
    cJSON *offer_id = cJSON_GetObjectItemCaseSensitive(price_suggest_offer_dtoJSON, "offerId");
    if (offer_id) { 
    if(!cJSON_IsString(offer_id) && !cJSON_IsNull(offer_id))
    {
    goto end; //String
    }
    }

    // price_suggest_offer_dto->price_suggestion
    cJSON *price_suggestion = cJSON_GetObjectItemCaseSensitive(price_suggest_offer_dtoJSON, "priceSuggestion");
    if (price_suggestion) { 
    cJSON *price_suggestion_local_nonprimitive = NULL;
    if(!cJSON_IsArray(price_suggestion)){
        goto end; //nonprimitive container
    }

    price_suggestionList = list_createList();

    cJSON_ArrayForEach(price_suggestion_local_nonprimitive,price_suggestion )
    {
        if(!cJSON_IsObject(price_suggestion_local_nonprimitive)){
            goto end;
        }
        price_suggest_dto_t *price_suggestionItem = price_suggest_dto_parseFromJSON(price_suggestion_local_nonprimitive);

        list_addElement(price_suggestionList, price_suggestionItem);
    }
    }


    price_suggest_offer_dto_local_var = price_suggest_offer_dto_create (
        market_sku ? market_sku->valuedouble : 0,
        offer_id && !cJSON_IsNull(offer_id) ? strdup(offer_id->valuestring) : NULL,
        price_suggestion ? price_suggestionList : NULL
        );

    return price_suggest_offer_dto_local_var;
end:
    if (price_suggestionList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, price_suggestionList) {
            price_suggest_dto_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(price_suggestionList);
        price_suggestionList = NULL;
    }
    return NULL;

}
