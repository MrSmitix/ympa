#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "promo_offer_params_dto.h"



promo_offer_params_dto_t *promo_offer_params_dto_create(
    promo_offer_discount_params_dto_t *discount_params,
    promo_offer_promocode_params_dto_t *promocode_params
    ) {
    promo_offer_params_dto_t *promo_offer_params_dto_local_var = malloc(sizeof(promo_offer_params_dto_t));
    if (!promo_offer_params_dto_local_var) {
        return NULL;
    }
    promo_offer_params_dto_local_var->discount_params = discount_params;
    promo_offer_params_dto_local_var->promocode_params = promocode_params;

    return promo_offer_params_dto_local_var;
}


void promo_offer_params_dto_free(promo_offer_params_dto_t *promo_offer_params_dto) {
    if(NULL == promo_offer_params_dto){
        return ;
    }
    listEntry_t *listEntry;
    if (promo_offer_params_dto->discount_params) {
        promo_offer_discount_params_dto_free(promo_offer_params_dto->discount_params);
        promo_offer_params_dto->discount_params = NULL;
    }
    if (promo_offer_params_dto->promocode_params) {
        promo_offer_promocode_params_dto_free(promo_offer_params_dto->promocode_params);
        promo_offer_params_dto->promocode_params = NULL;
    }
    free(promo_offer_params_dto);
}

cJSON *promo_offer_params_dto_convertToJSON(promo_offer_params_dto_t *promo_offer_params_dto) {
    cJSON *item = cJSON_CreateObject();

    // promo_offer_params_dto->discount_params
    if(promo_offer_params_dto->discount_params) {
    cJSON *discount_params_local_JSON = promo_offer_discount_params_dto_convertToJSON(promo_offer_params_dto->discount_params);
    if(discount_params_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "discountParams", discount_params_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // promo_offer_params_dto->promocode_params
    if(promo_offer_params_dto->promocode_params) {
    cJSON *promocode_params_local_JSON = promo_offer_promocode_params_dto_convertToJSON(promo_offer_params_dto->promocode_params);
    if(promocode_params_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "promocodeParams", promocode_params_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

promo_offer_params_dto_t *promo_offer_params_dto_parseFromJSON(cJSON *promo_offer_params_dtoJSON){

    promo_offer_params_dto_t *promo_offer_params_dto_local_var = NULL;

    // define the local variable for promo_offer_params_dto->discount_params
    promo_offer_discount_params_dto_t *discount_params_local_nonprim = NULL;

    // define the local variable for promo_offer_params_dto->promocode_params
    promo_offer_promocode_params_dto_t *promocode_params_local_nonprim = NULL;

    // promo_offer_params_dto->discount_params
    cJSON *discount_params = cJSON_GetObjectItemCaseSensitive(promo_offer_params_dtoJSON, "discountParams");
    if (discount_params) { 
    discount_params_local_nonprim = promo_offer_discount_params_dto_parseFromJSON(discount_params); //nonprimitive
    }

    // promo_offer_params_dto->promocode_params
    cJSON *promocode_params = cJSON_GetObjectItemCaseSensitive(promo_offer_params_dtoJSON, "promocodeParams");
    if (promocode_params) { 
    promocode_params_local_nonprim = promo_offer_promocode_params_dto_parseFromJSON(promocode_params); //nonprimitive
    }


    promo_offer_params_dto_local_var = promo_offer_params_dto_create (
        discount_params ? discount_params_local_nonprim : NULL,
        promocode_params ? promocode_params_local_nonprim : NULL
        );

    return promo_offer_params_dto_local_var;
end:
    if (discount_params_local_nonprim) {
        promo_offer_discount_params_dto_free(discount_params_local_nonprim);
        discount_params_local_nonprim = NULL;
    }
    if (promocode_params_local_nonprim) {
        promo_offer_promocode_params_dto_free(promocode_params_local_nonprim);
        promocode_params_local_nonprim = NULL;
    }
    return NULL;

}
