#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "promo_offer_update_warning_code_type.h"


char* promo_offer_update_warning_code_type_promo_offer_update_warning_code_type_ToString(_api__promo_offer_update_warning_code_type__e promo_offer_update_warning_code_type) {
    char *promo_offer_update_warning_code_typeArray[] =  { "NULL", "DEEP_DISCOUNT_OFFER", "CATALOG_PRICE_IS_LOWER_THAN_PROMO", "SHOP_PRICES_ARE_LOWER_THAN_PROMO", "PROMOCODE_PRICE_MORE_THAN_MAX_FAIR_PRICE", "SHOP_OFFER_NOT_ELIGIBLE_FOR_PROMO" };
    return promo_offer_update_warning_code_typeArray[promo_offer_update_warning_code_type];
}

_api__promo_offer_update_warning_code_type__e promo_offer_update_warning_code_type_promo_offer_update_warning_code_type_FromString(char* promo_offer_update_warning_code_type) {
    int stringToReturn = 0;
    char *promo_offer_update_warning_code_typeArray[] =  { "NULL", "DEEP_DISCOUNT_OFFER", "CATALOG_PRICE_IS_LOWER_THAN_PROMO", "SHOP_PRICES_ARE_LOWER_THAN_PROMO", "PROMOCODE_PRICE_MORE_THAN_MAX_FAIR_PRICE", "SHOP_OFFER_NOT_ELIGIBLE_FOR_PROMO" };
    size_t sizeofArray = sizeof(promo_offer_update_warning_code_typeArray) / sizeof(promo_offer_update_warning_code_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(promo_offer_update_warning_code_type, promo_offer_update_warning_code_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *promo_offer_update_warning_code_type_promo_offer_update_warning_code_type_convertToJSON(_api__promo_offer_update_warning_code_type__e promo_offer_update_warning_code_type) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "promo_offer_update_warning_code_type", promo_offer_update_warning_code_type_promo_offer_update_warning_code_type_ToString(promo_offer_update_warning_code_type)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

_api__promo_offer_update_warning_code_type__e promo_offer_update_warning_code_type_promo_offer_update_warning_code_type_parseFromJSON(cJSON *promo_offer_update_warning_code_typeJSON) {
    _api__promo_offer_update_warning_code_type__e *promo_offer_update_warning_code_type = NULL;
    _api__promo_offer_update_warning_code_type__e promo_offer_update_warning_code_typeVariable;
    cJSON *promo_offer_update_warning_code_typeVar = cJSON_GetObjectItemCaseSensitive(promo_offer_update_warning_code_typeJSON, "promo_offer_update_warning_code_type");
    if(!cJSON_IsString(promo_offer_update_warning_code_typeVar) || (promo_offer_update_warning_code_typeVar->valuestring == NULL)){
        goto end;
    }
    promo_offer_update_warning_code_typeVariable = promo_offer_update_warning_code_type_promo_offer_update_warning_code_type_FromString(promo_offer_update_warning_code_typeVar->valuestring);
    return promo_offer_update_warning_code_typeVariable;
end:
    return 0;
}
