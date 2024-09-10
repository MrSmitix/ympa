#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "update_promo_offer_discount_params_dto.h"



update_promo_offer_discount_params_dto_t *update_promo_offer_discount_params_dto_create(
    long price,
    long promo_price
    ) {
    update_promo_offer_discount_params_dto_t *update_promo_offer_discount_params_dto_local_var = malloc(sizeof(update_promo_offer_discount_params_dto_t));
    if (!update_promo_offer_discount_params_dto_local_var) {
        return NULL;
    }
    update_promo_offer_discount_params_dto_local_var->price = price;
    update_promo_offer_discount_params_dto_local_var->promo_price = promo_price;

    return update_promo_offer_discount_params_dto_local_var;
}


void update_promo_offer_discount_params_dto_free(update_promo_offer_discount_params_dto_t *update_promo_offer_discount_params_dto) {
    if(NULL == update_promo_offer_discount_params_dto){
        return ;
    }
    listEntry_t *listEntry;
    free(update_promo_offer_discount_params_dto);
}

cJSON *update_promo_offer_discount_params_dto_convertToJSON(update_promo_offer_discount_params_dto_t *update_promo_offer_discount_params_dto) {
    cJSON *item = cJSON_CreateObject();

    // update_promo_offer_discount_params_dto->price
    if(update_promo_offer_discount_params_dto->price) {
    if(cJSON_AddNumberToObject(item, "price", update_promo_offer_discount_params_dto->price) == NULL) {
    goto fail; //Numeric
    }
    }


    // update_promo_offer_discount_params_dto->promo_price
    if(update_promo_offer_discount_params_dto->promo_price) {
    if(cJSON_AddNumberToObject(item, "promoPrice", update_promo_offer_discount_params_dto->promo_price) == NULL) {
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

update_promo_offer_discount_params_dto_t *update_promo_offer_discount_params_dto_parseFromJSON(cJSON *update_promo_offer_discount_params_dtoJSON){

    update_promo_offer_discount_params_dto_t *update_promo_offer_discount_params_dto_local_var = NULL;

    // update_promo_offer_discount_params_dto->price
    cJSON *price = cJSON_GetObjectItemCaseSensitive(update_promo_offer_discount_params_dtoJSON, "price");
    if (price) { 
    if(!cJSON_IsNumber(price))
    {
    goto end; //Numeric
    }
    }

    // update_promo_offer_discount_params_dto->promo_price
    cJSON *promo_price = cJSON_GetObjectItemCaseSensitive(update_promo_offer_discount_params_dtoJSON, "promoPrice");
    if (promo_price) { 
    if(!cJSON_IsNumber(promo_price))
    {
    goto end; //Numeric
    }
    }


    update_promo_offer_discount_params_dto_local_var = update_promo_offer_discount_params_dto_create (
        price ? price->valuedouble : 0,
        promo_price ? promo_price->valuedouble : 0
        );

    return update_promo_offer_discount_params_dto_local_var;
end:
    return NULL;

}
