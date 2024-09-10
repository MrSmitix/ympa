#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "get_promo_assortment_info_dto.h"



get_promo_assortment_info_dto_t *get_promo_assortment_info_dto_create(
    int active_offers,
    int potential_offers,
    int processing
    ) {
    get_promo_assortment_info_dto_t *get_promo_assortment_info_dto_local_var = malloc(sizeof(get_promo_assortment_info_dto_t));
    if (!get_promo_assortment_info_dto_local_var) {
        return NULL;
    }
    get_promo_assortment_info_dto_local_var->active_offers = active_offers;
    get_promo_assortment_info_dto_local_var->potential_offers = potential_offers;
    get_promo_assortment_info_dto_local_var->processing = processing;

    return get_promo_assortment_info_dto_local_var;
}


void get_promo_assortment_info_dto_free(get_promo_assortment_info_dto_t *get_promo_assortment_info_dto) {
    if(NULL == get_promo_assortment_info_dto){
        return ;
    }
    listEntry_t *listEntry;
    free(get_promo_assortment_info_dto);
}

cJSON *get_promo_assortment_info_dto_convertToJSON(get_promo_assortment_info_dto_t *get_promo_assortment_info_dto) {
    cJSON *item = cJSON_CreateObject();

    // get_promo_assortment_info_dto->active_offers
    if (!get_promo_assortment_info_dto->active_offers) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "activeOffers", get_promo_assortment_info_dto->active_offers) == NULL) {
    goto fail; //Numeric
    }


    // get_promo_assortment_info_dto->potential_offers
    if(get_promo_assortment_info_dto->potential_offers) {
    if(cJSON_AddNumberToObject(item, "potentialOffers", get_promo_assortment_info_dto->potential_offers) == NULL) {
    goto fail; //Numeric
    }
    }


    // get_promo_assortment_info_dto->processing
    if(get_promo_assortment_info_dto->processing) {
    if(cJSON_AddBoolToObject(item, "processing", get_promo_assortment_info_dto->processing) == NULL) {
    goto fail; //Bool
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

get_promo_assortment_info_dto_t *get_promo_assortment_info_dto_parseFromJSON(cJSON *get_promo_assortment_info_dtoJSON){

    get_promo_assortment_info_dto_t *get_promo_assortment_info_dto_local_var = NULL;

    // get_promo_assortment_info_dto->active_offers
    cJSON *active_offers = cJSON_GetObjectItemCaseSensitive(get_promo_assortment_info_dtoJSON, "activeOffers");
    if (!active_offers) {
        goto end;
    }

    
    if(!cJSON_IsNumber(active_offers))
    {
    goto end; //Numeric
    }

    // get_promo_assortment_info_dto->potential_offers
    cJSON *potential_offers = cJSON_GetObjectItemCaseSensitive(get_promo_assortment_info_dtoJSON, "potentialOffers");
    if (potential_offers) { 
    if(!cJSON_IsNumber(potential_offers))
    {
    goto end; //Numeric
    }
    }

    // get_promo_assortment_info_dto->processing
    cJSON *processing = cJSON_GetObjectItemCaseSensitive(get_promo_assortment_info_dtoJSON, "processing");
    if (processing) { 
    if(!cJSON_IsBool(processing))
    {
    goto end; //Bool
    }
    }


    get_promo_assortment_info_dto_local_var = get_promo_assortment_info_dto_create (
        active_offers->valuedouble,
        potential_offers ? potential_offers->valuedouble : 0,
        processing ? processing->valueint : 0
        );

    return get_promo_assortment_info_dto_local_var;
end:
    return NULL;

}
