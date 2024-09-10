#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "offer_price_dto.h"



offer_price_dto_t *offer_price_dto_create(
    char *offer_id,
    price_dto_t *price
    ) {
    offer_price_dto_t *offer_price_dto_local_var = malloc(sizeof(offer_price_dto_t));
    if (!offer_price_dto_local_var) {
        return NULL;
    }
    offer_price_dto_local_var->offer_id = offer_id;
    offer_price_dto_local_var->price = price;

    return offer_price_dto_local_var;
}


void offer_price_dto_free(offer_price_dto_t *offer_price_dto) {
    if(NULL == offer_price_dto){
        return ;
    }
    listEntry_t *listEntry;
    if (offer_price_dto->offer_id) {
        free(offer_price_dto->offer_id);
        offer_price_dto->offer_id = NULL;
    }
    if (offer_price_dto->price) {
        price_dto_free(offer_price_dto->price);
        offer_price_dto->price = NULL;
    }
    free(offer_price_dto);
}

cJSON *offer_price_dto_convertToJSON(offer_price_dto_t *offer_price_dto) {
    cJSON *item = cJSON_CreateObject();

    // offer_price_dto->offer_id
    if(offer_price_dto->offer_id) {
    if(cJSON_AddStringToObject(item, "offerId", offer_price_dto->offer_id) == NULL) {
    goto fail; //String
    }
    }


    // offer_price_dto->price
    if(offer_price_dto->price) {
    cJSON *price_local_JSON = price_dto_convertToJSON(offer_price_dto->price);
    if(price_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "price", price_local_JSON);
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

offer_price_dto_t *offer_price_dto_parseFromJSON(cJSON *offer_price_dtoJSON){

    offer_price_dto_t *offer_price_dto_local_var = NULL;

    // define the local variable for offer_price_dto->price
    price_dto_t *price_local_nonprim = NULL;

    // offer_price_dto->offer_id
    cJSON *offer_id = cJSON_GetObjectItemCaseSensitive(offer_price_dtoJSON, "offerId");
    if (offer_id) { 
    if(!cJSON_IsString(offer_id) && !cJSON_IsNull(offer_id))
    {
    goto end; //String
    }
    }

    // offer_price_dto->price
    cJSON *price = cJSON_GetObjectItemCaseSensitive(offer_price_dtoJSON, "price");
    if (price) { 
    price_local_nonprim = price_dto_parseFromJSON(price); //nonprimitive
    }


    offer_price_dto_local_var = offer_price_dto_create (
        offer_id && !cJSON_IsNull(offer_id) ? strdup(offer_id->valuestring) : NULL,
        price ? price_local_nonprim : NULL
        );

    return offer_price_dto_local_var;
end:
    if (price_local_nonprim) {
        price_dto_free(price_local_nonprim);
        price_local_nonprim = NULL;
    }
    return NULL;

}
