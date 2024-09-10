#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "offer_price_response_dto.h"



offer_price_response_dto_t *offer_price_response_dto_create(
    char *id,
    price_dto_t *price,
    long market_sku,
    char *updated_at
    ) {
    offer_price_response_dto_t *offer_price_response_dto_local_var = malloc(sizeof(offer_price_response_dto_t));
    if (!offer_price_response_dto_local_var) {
        return NULL;
    }
    offer_price_response_dto_local_var->id = id;
    offer_price_response_dto_local_var->price = price;
    offer_price_response_dto_local_var->market_sku = market_sku;
    offer_price_response_dto_local_var->updated_at = updated_at;

    return offer_price_response_dto_local_var;
}


void offer_price_response_dto_free(offer_price_response_dto_t *offer_price_response_dto) {
    if(NULL == offer_price_response_dto){
        return ;
    }
    listEntry_t *listEntry;
    if (offer_price_response_dto->id) {
        free(offer_price_response_dto->id);
        offer_price_response_dto->id = NULL;
    }
    if (offer_price_response_dto->price) {
        price_dto_free(offer_price_response_dto->price);
        offer_price_response_dto->price = NULL;
    }
    if (offer_price_response_dto->updated_at) {
        free(offer_price_response_dto->updated_at);
        offer_price_response_dto->updated_at = NULL;
    }
    free(offer_price_response_dto);
}

cJSON *offer_price_response_dto_convertToJSON(offer_price_response_dto_t *offer_price_response_dto) {
    cJSON *item = cJSON_CreateObject();

    // offer_price_response_dto->id
    if(offer_price_response_dto->id) {
    if(cJSON_AddStringToObject(item, "id", offer_price_response_dto->id) == NULL) {
    goto fail; //String
    }
    }


    // offer_price_response_dto->price
    if(offer_price_response_dto->price) {
    cJSON *price_local_JSON = price_dto_convertToJSON(offer_price_response_dto->price);
    if(price_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "price", price_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // offer_price_response_dto->market_sku
    if(offer_price_response_dto->market_sku) {
    if(cJSON_AddNumberToObject(item, "marketSku", offer_price_response_dto->market_sku) == NULL) {
    goto fail; //Numeric
    }
    }


    // offer_price_response_dto->updated_at
    if(offer_price_response_dto->updated_at) {
    if(cJSON_AddStringToObject(item, "updatedAt", offer_price_response_dto->updated_at) == NULL) {
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

offer_price_response_dto_t *offer_price_response_dto_parseFromJSON(cJSON *offer_price_response_dtoJSON){

    offer_price_response_dto_t *offer_price_response_dto_local_var = NULL;

    // define the local variable for offer_price_response_dto->price
    price_dto_t *price_local_nonprim = NULL;

    // offer_price_response_dto->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(offer_price_response_dtoJSON, "id");
    if (id) { 
    if(!cJSON_IsString(id) && !cJSON_IsNull(id))
    {
    goto end; //String
    }
    }

    // offer_price_response_dto->price
    cJSON *price = cJSON_GetObjectItemCaseSensitive(offer_price_response_dtoJSON, "price");
    if (price) { 
    price_local_nonprim = price_dto_parseFromJSON(price); //nonprimitive
    }

    // offer_price_response_dto->market_sku
    cJSON *market_sku = cJSON_GetObjectItemCaseSensitive(offer_price_response_dtoJSON, "marketSku");
    if (market_sku) { 
    if(!cJSON_IsNumber(market_sku))
    {
    goto end; //Numeric
    }
    }

    // offer_price_response_dto->updated_at
    cJSON *updated_at = cJSON_GetObjectItemCaseSensitive(offer_price_response_dtoJSON, "updatedAt");
    if (updated_at) { 
    if(!cJSON_IsString(updated_at) && !cJSON_IsNull(updated_at))
    {
    goto end; //DateTime
    }
    }


    offer_price_response_dto_local_var = offer_price_response_dto_create (
        id && !cJSON_IsNull(id) ? strdup(id->valuestring) : NULL,
        price ? price_local_nonprim : NULL,
        market_sku ? market_sku->valuedouble : 0,
        updated_at && !cJSON_IsNull(updated_at) ? strdup(updated_at->valuestring) : NULL
        );

    return offer_price_response_dto_local_var;
end:
    if (price_local_nonprim) {
        price_dto_free(price_local_nonprim);
        price_local_nonprim = NULL;
    }
    return NULL;

}
