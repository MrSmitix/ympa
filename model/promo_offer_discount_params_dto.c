#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "promo_offer_discount_params_dto.h"



promo_offer_discount_params_dto_t *promo_offer_discount_params_dto_create(
    long price,
    long promo_price,
    long max_promo_price
    ) {
    promo_offer_discount_params_dto_t *promo_offer_discount_params_dto_local_var = malloc(sizeof(promo_offer_discount_params_dto_t));
    if (!promo_offer_discount_params_dto_local_var) {
        return NULL;
    }
    promo_offer_discount_params_dto_local_var->price = price;
    promo_offer_discount_params_dto_local_var->promo_price = promo_price;
    promo_offer_discount_params_dto_local_var->max_promo_price = max_promo_price;

    return promo_offer_discount_params_dto_local_var;
}


void promo_offer_discount_params_dto_free(promo_offer_discount_params_dto_t *promo_offer_discount_params_dto) {
    if(NULL == promo_offer_discount_params_dto){
        return ;
    }
    listEntry_t *listEntry;
    free(promo_offer_discount_params_dto);
}

cJSON *promo_offer_discount_params_dto_convertToJSON(promo_offer_discount_params_dto_t *promo_offer_discount_params_dto) {
    cJSON *item = cJSON_CreateObject();

    // promo_offer_discount_params_dto->price
    if(promo_offer_discount_params_dto->price) {
    if(cJSON_AddNumberToObject(item, "price", promo_offer_discount_params_dto->price) == NULL) {
    goto fail; //Numeric
    }
    }


    // promo_offer_discount_params_dto->promo_price
    if(promo_offer_discount_params_dto->promo_price) {
    if(cJSON_AddNumberToObject(item, "promoPrice", promo_offer_discount_params_dto->promo_price) == NULL) {
    goto fail; //Numeric
    }
    }


    // promo_offer_discount_params_dto->max_promo_price
    if (!promo_offer_discount_params_dto->max_promo_price) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "maxPromoPrice", promo_offer_discount_params_dto->max_promo_price) == NULL) {
    goto fail; //Numeric
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

promo_offer_discount_params_dto_t *promo_offer_discount_params_dto_parseFromJSON(cJSON *promo_offer_discount_params_dtoJSON){

    promo_offer_discount_params_dto_t *promo_offer_discount_params_dto_local_var = NULL;

    // promo_offer_discount_params_dto->price
    cJSON *price = cJSON_GetObjectItemCaseSensitive(promo_offer_discount_params_dtoJSON, "price");
    if (price) { 
    if(!cJSON_IsNumber(price))
    {
    goto end; //Numeric
    }
    }

    // promo_offer_discount_params_dto->promo_price
    cJSON *promo_price = cJSON_GetObjectItemCaseSensitive(promo_offer_discount_params_dtoJSON, "promoPrice");
    if (promo_price) { 
    if(!cJSON_IsNumber(promo_price))
    {
    goto end; //Numeric
    }
    }

    // promo_offer_discount_params_dto->max_promo_price
    cJSON *max_promo_price = cJSON_GetObjectItemCaseSensitive(promo_offer_discount_params_dtoJSON, "maxPromoPrice");
    if (!max_promo_price) {
        goto end;
    }

    
    if(!cJSON_IsNumber(max_promo_price))
    {
    goto end; //Numeric
    }


    promo_offer_discount_params_dto_local_var = promo_offer_discount_params_dto_create (
        price ? price->valuedouble : 0,
        promo_price ? promo_price->valuedouble : 0,
        max_promo_price->valuedouble
        );

    return promo_offer_discount_params_dto_local_var;
end:
    return NULL;

}
