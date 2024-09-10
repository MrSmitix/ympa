#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "update_promo_offer_dto.h"



update_promo_offer_dto_t *update_promo_offer_dto_create(
    char *offer_id,
    update_promo_offer_params_dto_t *params
    ) {
    update_promo_offer_dto_t *update_promo_offer_dto_local_var = malloc(sizeof(update_promo_offer_dto_t));
    if (!update_promo_offer_dto_local_var) {
        return NULL;
    }
    update_promo_offer_dto_local_var->offer_id = offer_id;
    update_promo_offer_dto_local_var->params = params;

    return update_promo_offer_dto_local_var;
}


void update_promo_offer_dto_free(update_promo_offer_dto_t *update_promo_offer_dto) {
    if(NULL == update_promo_offer_dto){
        return ;
    }
    listEntry_t *listEntry;
    if (update_promo_offer_dto->offer_id) {
        free(update_promo_offer_dto->offer_id);
        update_promo_offer_dto->offer_id = NULL;
    }
    if (update_promo_offer_dto->params) {
        update_promo_offer_params_dto_free(update_promo_offer_dto->params);
        update_promo_offer_dto->params = NULL;
    }
    free(update_promo_offer_dto);
}

cJSON *update_promo_offer_dto_convertToJSON(update_promo_offer_dto_t *update_promo_offer_dto) {
    cJSON *item = cJSON_CreateObject();

    // update_promo_offer_dto->offer_id
    if (!update_promo_offer_dto->offer_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "offerId", update_promo_offer_dto->offer_id) == NULL) {
    goto fail; //String
    }


    // update_promo_offer_dto->params
    if(update_promo_offer_dto->params) {
    cJSON *params_local_JSON = update_promo_offer_params_dto_convertToJSON(update_promo_offer_dto->params);
    if(params_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "params", params_local_JSON);
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

update_promo_offer_dto_t *update_promo_offer_dto_parseFromJSON(cJSON *update_promo_offer_dtoJSON){

    update_promo_offer_dto_t *update_promo_offer_dto_local_var = NULL;

    // define the local variable for update_promo_offer_dto->params
    update_promo_offer_params_dto_t *params_local_nonprim = NULL;

    // update_promo_offer_dto->offer_id
    cJSON *offer_id = cJSON_GetObjectItemCaseSensitive(update_promo_offer_dtoJSON, "offerId");
    if (!offer_id) {
        goto end;
    }

    
    if(!cJSON_IsString(offer_id))
    {
    goto end; //String
    }

    // update_promo_offer_dto->params
    cJSON *params = cJSON_GetObjectItemCaseSensitive(update_promo_offer_dtoJSON, "params");
    if (params) { 
    params_local_nonprim = update_promo_offer_params_dto_parseFromJSON(params); //nonprimitive
    }


    update_promo_offer_dto_local_var = update_promo_offer_dto_create (
        strdup(offer_id->valuestring),
        params ? params_local_nonprim : NULL
        );

    return update_promo_offer_dto_local_var;
end:
    if (params_local_nonprim) {
        update_promo_offer_params_dto_free(params_local_nonprim);
        params_local_nonprim = NULL;
    }
    return NULL;

}
