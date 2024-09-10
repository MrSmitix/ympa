#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "suggest_offer_price_dto.h"



suggest_offer_price_dto_t *suggest_offer_price_dto_create(
    char *offer_id,
    long market_sku
    ) {
    suggest_offer_price_dto_t *suggest_offer_price_dto_local_var = malloc(sizeof(suggest_offer_price_dto_t));
    if (!suggest_offer_price_dto_local_var) {
        return NULL;
    }
    suggest_offer_price_dto_local_var->offer_id = offer_id;
    suggest_offer_price_dto_local_var->market_sku = market_sku;

    return suggest_offer_price_dto_local_var;
}


void suggest_offer_price_dto_free(suggest_offer_price_dto_t *suggest_offer_price_dto) {
    if(NULL == suggest_offer_price_dto){
        return ;
    }
    listEntry_t *listEntry;
    if (suggest_offer_price_dto->offer_id) {
        free(suggest_offer_price_dto->offer_id);
        suggest_offer_price_dto->offer_id = NULL;
    }
    free(suggest_offer_price_dto);
}

cJSON *suggest_offer_price_dto_convertToJSON(suggest_offer_price_dto_t *suggest_offer_price_dto) {
    cJSON *item = cJSON_CreateObject();

    // suggest_offer_price_dto->offer_id
    if(suggest_offer_price_dto->offer_id) {
    if(cJSON_AddStringToObject(item, "offerId", suggest_offer_price_dto->offer_id) == NULL) {
    goto fail; //String
    }
    }


    // suggest_offer_price_dto->market_sku
    if(suggest_offer_price_dto->market_sku) {
    if(cJSON_AddNumberToObject(item, "marketSku", suggest_offer_price_dto->market_sku) == NULL) {
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

suggest_offer_price_dto_t *suggest_offer_price_dto_parseFromJSON(cJSON *suggest_offer_price_dtoJSON){

    suggest_offer_price_dto_t *suggest_offer_price_dto_local_var = NULL;

    // suggest_offer_price_dto->offer_id
    cJSON *offer_id = cJSON_GetObjectItemCaseSensitive(suggest_offer_price_dtoJSON, "offerId");
    if (offer_id) { 
    if(!cJSON_IsString(offer_id) && !cJSON_IsNull(offer_id))
    {
    goto end; //String
    }
    }

    // suggest_offer_price_dto->market_sku
    cJSON *market_sku = cJSON_GetObjectItemCaseSensitive(suggest_offer_price_dtoJSON, "marketSku");
    if (market_sku) { 
    if(!cJSON_IsNumber(market_sku))
    {
    goto end; //Numeric
    }
    }


    suggest_offer_price_dto_local_var = suggest_offer_price_dto_create (
        offer_id && !cJSON_IsNull(offer_id) ? strdup(offer_id->valuestring) : NULL,
        market_sku ? market_sku->valuedouble : 0
        );

    return suggest_offer_price_dto_local_var;
end:
    return NULL;

}
