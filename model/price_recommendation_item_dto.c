#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "price_recommendation_item_dto.h"



price_recommendation_item_dto_t *price_recommendation_item_dto_create(
    long campaign_id,
    double price
    ) {
    price_recommendation_item_dto_t *price_recommendation_item_dto_local_var = malloc(sizeof(price_recommendation_item_dto_t));
    if (!price_recommendation_item_dto_local_var) {
        return NULL;
    }
    price_recommendation_item_dto_local_var->campaign_id = campaign_id;
    price_recommendation_item_dto_local_var->price = price;

    return price_recommendation_item_dto_local_var;
}


void price_recommendation_item_dto_free(price_recommendation_item_dto_t *price_recommendation_item_dto) {
    if(NULL == price_recommendation_item_dto){
        return ;
    }
    listEntry_t *listEntry;
    free(price_recommendation_item_dto);
}

cJSON *price_recommendation_item_dto_convertToJSON(price_recommendation_item_dto_t *price_recommendation_item_dto) {
    cJSON *item = cJSON_CreateObject();

    // price_recommendation_item_dto->campaign_id
    if (!price_recommendation_item_dto->campaign_id) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "campaignId", price_recommendation_item_dto->campaign_id) == NULL) {
    goto fail; //Numeric
    }


    // price_recommendation_item_dto->price
    if (!price_recommendation_item_dto->price) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "price", price_recommendation_item_dto->price) == NULL) {
    goto fail; //Numeric
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

price_recommendation_item_dto_t *price_recommendation_item_dto_parseFromJSON(cJSON *price_recommendation_item_dtoJSON){

    price_recommendation_item_dto_t *price_recommendation_item_dto_local_var = NULL;

    // price_recommendation_item_dto->campaign_id
    cJSON *campaign_id = cJSON_GetObjectItemCaseSensitive(price_recommendation_item_dtoJSON, "campaignId");
    if (!campaign_id) {
        goto end;
    }

    
    if(!cJSON_IsNumber(campaign_id))
    {
    goto end; //Numeric
    }

    // price_recommendation_item_dto->price
    cJSON *price = cJSON_GetObjectItemCaseSensitive(price_recommendation_item_dtoJSON, "price");
    if (!price) {
        goto end;
    }

    
    if(!cJSON_IsNumber(price))
    {
    goto end; //Numeric
    }


    price_recommendation_item_dto_local_var = price_recommendation_item_dto_create (
        campaign_id->valuedouble,
        price->valuedouble
        );

    return price_recommendation_item_dto_local_var;
end:
    return NULL;

}
