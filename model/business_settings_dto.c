#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "business_settings_dto.h"


char* business_settings_dto_currency_ToString(_api__business_settings_dto__e currency) {
    char* currencyArray[] =  { "NULL", "RUR", "USD", "EUR", "UAH", "AUD", "GBP", "BYR", "BYN", "DKK", "ISK", "KZT", "CAD", "CNY", "NOK", "XDR", "SGD", "TRY", "SEK", "CHF", "JPY", "AZN", "ALL", "DZD", "AOA", "ARS", "AMD", "AFN", "BHD", "BGN", "BOB", "BWP", "BND", "BRL", "BIF", "HUF", "VEF", "KPW", "VND", "GMD", "GHS", "GNF", "HKD", "GEL", "AED", "EGP", "ZMK", "ILS", "INR", "IDR", "JOD", "IQD", "IRR", "YER", "QAR", "KES", "KGS", "COP", "CDF", "CRC", "KWD", "CUP", "LAK", "LVL", "SLL", "LBP", "LYD", "SZL", "LTL", "MUR", "MRO", "MKD", "MWK", "MGA", "MYR", "MAD", "MXN", "MZN", "MDL", "MNT", "NPR", "NGN", "NIO", "NZD", "OMR", "PKR", "PYG", "PEN", "PLN", "KHR", "SAR", "RON", "SCR", "SYP", "SKK", "SOS", "SDG", "SRD", "TJS", "THB", "TWD", "BDT", "TZS", "TND", "TMM", "UGX", "UZS", "UYU", "PHP", "DJF", "XAF", "XOF", "HRK", "CZK", "CLP", "LKR", "EEK", "ETB", "RSD", "ZAR", "KRW", "NAD", "TL", "UE" };
    return currencyArray[currency];
}

_api__business_settings_dto__e business_settings_dto_currency_FromString(char* currency){
    int stringToReturn = 0;
    char *currencyArray[] =  { "NULL", "RUR", "USD", "EUR", "UAH", "AUD", "GBP", "BYR", "BYN", "DKK", "ISK", "KZT", "CAD", "CNY", "NOK", "XDR", "SGD", "TRY", "SEK", "CHF", "JPY", "AZN", "ALL", "DZD", "AOA", "ARS", "AMD", "AFN", "BHD", "BGN", "BOB", "BWP", "BND", "BRL", "BIF", "HUF", "VEF", "KPW", "VND", "GMD", "GHS", "GNF", "HKD", "GEL", "AED", "EGP", "ZMK", "ILS", "INR", "IDR", "JOD", "IQD", "IRR", "YER", "QAR", "KES", "KGS", "COP", "CDF", "CRC", "KWD", "CUP", "LAK", "LVL", "SLL", "LBP", "LYD", "SZL", "LTL", "MUR", "MRO", "MKD", "MWK", "MGA", "MYR", "MAD", "MXN", "MZN", "MDL", "MNT", "NPR", "NGN", "NIO", "NZD", "OMR", "PKR", "PYG", "PEN", "PLN", "KHR", "SAR", "RON", "SCR", "SYP", "SKK", "SOS", "SDG", "SRD", "TJS", "THB", "TWD", "BDT", "TZS", "TND", "TMM", "UGX", "UZS", "UYU", "PHP", "DJF", "XAF", "XOF", "HRK", "CZK", "CLP", "LKR", "EEK", "ETB", "RSD", "ZAR", "KRW", "NAD", "TL", "UE" };
    size_t sizeofArray = sizeof(currencyArray) / sizeof(currencyArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(currency, currencyArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

business_settings_dto_t *business_settings_dto_create(
    int only_default_price,
    currency_type_t *currency
    ) {
    business_settings_dto_t *business_settings_dto_local_var = malloc(sizeof(business_settings_dto_t));
    if (!business_settings_dto_local_var) {
        return NULL;
    }
    business_settings_dto_local_var->only_default_price = only_default_price;
    business_settings_dto_local_var->currency = currency;

    return business_settings_dto_local_var;
}


void business_settings_dto_free(business_settings_dto_t *business_settings_dto) {
    if(NULL == business_settings_dto){
        return ;
    }
    listEntry_t *listEntry;
    if (business_settings_dto->currency) {
        currency_type_free(business_settings_dto->currency);
        business_settings_dto->currency = NULL;
    }
    free(business_settings_dto);
}

cJSON *business_settings_dto_convertToJSON(business_settings_dto_t *business_settings_dto) {
    cJSON *item = cJSON_CreateObject();

    // business_settings_dto->only_default_price
    if(business_settings_dto->only_default_price) {
    if(cJSON_AddBoolToObject(item, "onlyDefaultPrice", business_settings_dto->only_default_price) == NULL) {
    goto fail; //Bool
    }
    }


    // business_settings_dto->currency
    if(business_settings_dto->currency != _api__business_settings_dto__NULL) {
    cJSON *currency_local_JSON = currency_type_convertToJSON(business_settings_dto->currency);
    if(currency_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "currency", currency_local_JSON);
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

business_settings_dto_t *business_settings_dto_parseFromJSON(cJSON *business_settings_dtoJSON){

    business_settings_dto_t *business_settings_dto_local_var = NULL;

    // define the local variable for business_settings_dto->currency
    currency_type_t *currency_local_nonprim = NULL;

    // business_settings_dto->only_default_price
    cJSON *only_default_price = cJSON_GetObjectItemCaseSensitive(business_settings_dtoJSON, "onlyDefaultPrice");
    if (only_default_price) { 
    if(!cJSON_IsBool(only_default_price))
    {
    goto end; //Bool
    }
    }

    // business_settings_dto->currency
    cJSON *currency = cJSON_GetObjectItemCaseSensitive(business_settings_dtoJSON, "currency");
    if (currency) { 
    currency_local_nonprim = currency_type_parseFromJSON(currency); //custom
    }


    business_settings_dto_local_var = business_settings_dto_create (
        only_default_price ? only_default_price->valueint : 0,
        currency ? currency_local_nonprim : NULL
        );

    return business_settings_dto_local_var;
end:
    if (currency_local_nonprim) {
        currency_type_free(currency_local_nonprim);
        currency_local_nonprim = NULL;
    }
    return NULL;

}
