#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "update_business_offer_price_dto.h"



update_business_offer_price_dto_t *update_business_offer_price_dto_create(
    char *offer_id,
    update_price_with_discount_dto_t *price
    ) {
    update_business_offer_price_dto_t *update_business_offer_price_dto_local_var = malloc(sizeof(update_business_offer_price_dto_t));
    if (!update_business_offer_price_dto_local_var) {
        return NULL;
    }
    update_business_offer_price_dto_local_var->offer_id = offer_id;
    update_business_offer_price_dto_local_var->price = price;

    return update_business_offer_price_dto_local_var;
}


void update_business_offer_price_dto_free(update_business_offer_price_dto_t *update_business_offer_price_dto) {
    if(NULL == update_business_offer_price_dto){
        return ;
    }
    listEntry_t *listEntry;
    if (update_business_offer_price_dto->offer_id) {
        free(update_business_offer_price_dto->offer_id);
        update_business_offer_price_dto->offer_id = NULL;
    }
    if (update_business_offer_price_dto->price) {
        update_price_with_discount_dto_free(update_business_offer_price_dto->price);
        update_business_offer_price_dto->price = NULL;
    }
    free(update_business_offer_price_dto);
}

cJSON *update_business_offer_price_dto_convertToJSON(update_business_offer_price_dto_t *update_business_offer_price_dto) {
    cJSON *item = cJSON_CreateObject();

    // update_business_offer_price_dto->offer_id
    if (!update_business_offer_price_dto->offer_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "offerId", update_business_offer_price_dto->offer_id) == NULL) {
    goto fail; //String
    }


    // update_business_offer_price_dto->price
    if (!update_business_offer_price_dto->price) {
        goto fail;
    }
    cJSON *price_local_JSON = update_price_with_discount_dto_convertToJSON(update_business_offer_price_dto->price);
    if(price_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "price", price_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

update_business_offer_price_dto_t *update_business_offer_price_dto_parseFromJSON(cJSON *update_business_offer_price_dtoJSON){

    update_business_offer_price_dto_t *update_business_offer_price_dto_local_var = NULL;

    // define the local variable for update_business_offer_price_dto->price
    update_price_with_discount_dto_t *price_local_nonprim = NULL;

    // update_business_offer_price_dto->offer_id
    cJSON *offer_id = cJSON_GetObjectItemCaseSensitive(update_business_offer_price_dtoJSON, "offerId");
    if (!offer_id) {
        goto end;
    }

    
    if(!cJSON_IsString(offer_id))
    {
    goto end; //String
    }

    // update_business_offer_price_dto->price
    cJSON *price = cJSON_GetObjectItemCaseSensitive(update_business_offer_price_dtoJSON, "price");
    if (!price) {
        goto end;
    }

    
    price_local_nonprim = update_price_with_discount_dto_parseFromJSON(price); //nonprimitive


    update_business_offer_price_dto_local_var = update_business_offer_price_dto_create (
        strdup(offer_id->valuestring),
        price_local_nonprim
        );

    return update_business_offer_price_dto_local_var;
end:
    if (price_local_nonprim) {
        update_price_with_discount_dto_free(price_local_nonprim);
        price_local_nonprim = NULL;
    }
    return NULL;

}
