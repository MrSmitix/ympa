#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "promo_offer_promocode_params_dto.h"



promo_offer_promocode_params_dto_t *promo_offer_promocode_params_dto_create(
    long max_price
    ) {
    promo_offer_promocode_params_dto_t *promo_offer_promocode_params_dto_local_var = malloc(sizeof(promo_offer_promocode_params_dto_t));
    if (!promo_offer_promocode_params_dto_local_var) {
        return NULL;
    }
    promo_offer_promocode_params_dto_local_var->max_price = max_price;

    return promo_offer_promocode_params_dto_local_var;
}


void promo_offer_promocode_params_dto_free(promo_offer_promocode_params_dto_t *promo_offer_promocode_params_dto) {
    if(NULL == promo_offer_promocode_params_dto){
        return ;
    }
    listEntry_t *listEntry;
    free(promo_offer_promocode_params_dto);
}

cJSON *promo_offer_promocode_params_dto_convertToJSON(promo_offer_promocode_params_dto_t *promo_offer_promocode_params_dto) {
    cJSON *item = cJSON_CreateObject();

    // promo_offer_promocode_params_dto->max_price
    if (!promo_offer_promocode_params_dto->max_price) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "maxPrice", promo_offer_promocode_params_dto->max_price) == NULL) {
    goto fail; //Numeric
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

promo_offer_promocode_params_dto_t *promo_offer_promocode_params_dto_parseFromJSON(cJSON *promo_offer_promocode_params_dtoJSON){

    promo_offer_promocode_params_dto_t *promo_offer_promocode_params_dto_local_var = NULL;

    // promo_offer_promocode_params_dto->max_price
    cJSON *max_price = cJSON_GetObjectItemCaseSensitive(promo_offer_promocode_params_dtoJSON, "maxPrice");
    if (!max_price) {
        goto end;
    }

    
    if(!cJSON_IsNumber(max_price))
    {
    goto end; //Numeric
    }


    promo_offer_promocode_params_dto_local_var = promo_offer_promocode_params_dto_create (
        max_price->valuedouble
        );

    return promo_offer_promocode_params_dto_local_var;
end:
    return NULL;

}
