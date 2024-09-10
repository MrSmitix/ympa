#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "promo_offer_update_warning_dto.h"


char* promo_offer_update_warning_dto_code_ToString(_api__promo_offer_update_warning_dto__e code) {
    char* codeArray[] =  { "NULL", "DEEP_DISCOUNT_OFFER", "CATALOG_PRICE_IS_LOWER_THAN_PROMO", "SHOP_PRICES_ARE_LOWER_THAN_PROMO", "PROMOCODE_PRICE_MORE_THAN_MAX_FAIR_PRICE", "SHOP_OFFER_NOT_ELIGIBLE_FOR_PROMO" };
    return codeArray[code];
}

_api__promo_offer_update_warning_dto__e promo_offer_update_warning_dto_code_FromString(char* code){
    int stringToReturn = 0;
    char *codeArray[] =  { "NULL", "DEEP_DISCOUNT_OFFER", "CATALOG_PRICE_IS_LOWER_THAN_PROMO", "SHOP_PRICES_ARE_LOWER_THAN_PROMO", "PROMOCODE_PRICE_MORE_THAN_MAX_FAIR_PRICE", "SHOP_OFFER_NOT_ELIGIBLE_FOR_PROMO" };
    size_t sizeofArray = sizeof(codeArray) / sizeof(codeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(code, codeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

promo_offer_update_warning_dto_t *promo_offer_update_warning_dto_create(
    promo_offer_update_warning_code_type_t *code,
    list_t *campaign_ids
    ) {
    promo_offer_update_warning_dto_t *promo_offer_update_warning_dto_local_var = malloc(sizeof(promo_offer_update_warning_dto_t));
    if (!promo_offer_update_warning_dto_local_var) {
        return NULL;
    }
    promo_offer_update_warning_dto_local_var->code = code;
    promo_offer_update_warning_dto_local_var->campaign_ids = campaign_ids;

    return promo_offer_update_warning_dto_local_var;
}


void promo_offer_update_warning_dto_free(promo_offer_update_warning_dto_t *promo_offer_update_warning_dto) {
    if(NULL == promo_offer_update_warning_dto){
        return ;
    }
    listEntry_t *listEntry;
    if (promo_offer_update_warning_dto->code) {
        promo_offer_update_warning_code_type_free(promo_offer_update_warning_dto->code);
        promo_offer_update_warning_dto->code = NULL;
    }
    if (promo_offer_update_warning_dto->campaign_ids) {
        list_ForEach(listEntry, promo_offer_update_warning_dto->campaign_ids) {
            free(listEntry->data);
        }
        list_freeList(promo_offer_update_warning_dto->campaign_ids);
        promo_offer_update_warning_dto->campaign_ids = NULL;
    }
    free(promo_offer_update_warning_dto);
}

cJSON *promo_offer_update_warning_dto_convertToJSON(promo_offer_update_warning_dto_t *promo_offer_update_warning_dto) {
    cJSON *item = cJSON_CreateObject();

    // promo_offer_update_warning_dto->code
    if (_api__promo_offer_update_warning_dto__NULL == promo_offer_update_warning_dto->code) {
        goto fail;
    }
    cJSON *code_local_JSON = promo_offer_update_warning_code_type_convertToJSON(promo_offer_update_warning_dto->code);
    if(code_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "code", code_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }


    // promo_offer_update_warning_dto->campaign_ids
    if(promo_offer_update_warning_dto->campaign_ids) {
    cJSON *campaign_ids = cJSON_AddArrayToObject(item, "campaignIds");
    if(campaign_ids == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *campaign_idsListEntry;
    list_ForEach(campaign_idsListEntry, promo_offer_update_warning_dto->campaign_ids) {
    if(cJSON_AddNumberToObject(campaign_ids, "", *(double *)campaign_idsListEntry->data) == NULL)
    {
        goto fail;
    }
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

promo_offer_update_warning_dto_t *promo_offer_update_warning_dto_parseFromJSON(cJSON *promo_offer_update_warning_dtoJSON){

    promo_offer_update_warning_dto_t *promo_offer_update_warning_dto_local_var = NULL;

    // define the local variable for promo_offer_update_warning_dto->code
    promo_offer_update_warning_code_type_t *code_local_nonprim = NULL;

    // define the local list for promo_offer_update_warning_dto->campaign_ids
    list_t *campaign_idsList = NULL;

    // promo_offer_update_warning_dto->code
    cJSON *code = cJSON_GetObjectItemCaseSensitive(promo_offer_update_warning_dtoJSON, "code");
    if (!code) {
        goto end;
    }

    
    code_local_nonprim = promo_offer_update_warning_code_type_parseFromJSON(code); //custom

    // promo_offer_update_warning_dto->campaign_ids
    cJSON *campaign_ids = cJSON_GetObjectItemCaseSensitive(promo_offer_update_warning_dtoJSON, "campaignIds");
    if (campaign_ids) { 
    cJSON *campaign_ids_local = NULL;
    if(!cJSON_IsArray(campaign_ids)) {
        goto end;//primitive container
    }
    campaign_idsList = list_createList();

    cJSON_ArrayForEach(campaign_ids_local, campaign_ids)
    {
        if(!cJSON_IsNumber(campaign_ids_local))
        {
            goto end;
        }
        double *campaign_ids_local_value = (double *)calloc(1, sizeof(double));
        if(!campaign_ids_local_value)
        {
            goto end;
        }
        *campaign_ids_local_value = campaign_ids_local->valuedouble;
        list_addElement(campaign_idsList , campaign_ids_local_value);
    }
    }


    promo_offer_update_warning_dto_local_var = promo_offer_update_warning_dto_create (
        code_local_nonprim,
        campaign_ids ? campaign_idsList : NULL
        );

    return promo_offer_update_warning_dto_local_var;
end:
    if (code_local_nonprim) {
        promo_offer_update_warning_code_type_free(code_local_nonprim);
        code_local_nonprim = NULL;
    }
    if (campaign_idsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, campaign_idsList) {
            free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(campaign_idsList);
        campaign_idsList = NULL;
    }
    return NULL;

}
