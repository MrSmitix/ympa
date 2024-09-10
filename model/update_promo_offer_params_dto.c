#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "update_promo_offer_params_dto.h"



update_promo_offer_params_dto_t *update_promo_offer_params_dto_create(
    update_promo_offer_discount_params_dto_t *discount_params
    ) {
    update_promo_offer_params_dto_t *update_promo_offer_params_dto_local_var = malloc(sizeof(update_promo_offer_params_dto_t));
    if (!update_promo_offer_params_dto_local_var) {
        return NULL;
    }
    update_promo_offer_params_dto_local_var->discount_params = discount_params;

    return update_promo_offer_params_dto_local_var;
}


void update_promo_offer_params_dto_free(update_promo_offer_params_dto_t *update_promo_offer_params_dto) {
    if(NULL == update_promo_offer_params_dto){
        return ;
    }
    listEntry_t *listEntry;
    if (update_promo_offer_params_dto->discount_params) {
        update_promo_offer_discount_params_dto_free(update_promo_offer_params_dto->discount_params);
        update_promo_offer_params_dto->discount_params = NULL;
    }
    free(update_promo_offer_params_dto);
}

cJSON *update_promo_offer_params_dto_convertToJSON(update_promo_offer_params_dto_t *update_promo_offer_params_dto) {
    cJSON *item = cJSON_CreateObject();

    // update_promo_offer_params_dto->discount_params
    if(update_promo_offer_params_dto->discount_params) {
    cJSON *discount_params_local_JSON = update_promo_offer_discount_params_dto_convertToJSON(update_promo_offer_params_dto->discount_params);
    if(discount_params_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "discountParams", discount_params_local_JSON);
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

update_promo_offer_params_dto_t *update_promo_offer_params_dto_parseFromJSON(cJSON *update_promo_offer_params_dtoJSON){

    update_promo_offer_params_dto_t *update_promo_offer_params_dto_local_var = NULL;

    // define the local variable for update_promo_offer_params_dto->discount_params
    update_promo_offer_discount_params_dto_t *discount_params_local_nonprim = NULL;

    // update_promo_offer_params_dto->discount_params
    cJSON *discount_params = cJSON_GetObjectItemCaseSensitive(update_promo_offer_params_dtoJSON, "discountParams");
    if (discount_params) { 
    discount_params_local_nonprim = update_promo_offer_discount_params_dto_parseFromJSON(discount_params); //nonprimitive
    }


    update_promo_offer_params_dto_local_var = update_promo_offer_params_dto_create (
        discount_params ? discount_params_local_nonprim : NULL
        );

    return update_promo_offer_params_dto_local_var;
end:
    if (discount_params_local_nonprim) {
        update_promo_offer_discount_params_dto_free(discount_params_local_nonprim);
        discount_params_local_nonprim = NULL;
    }
    return NULL;

}
