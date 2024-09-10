#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "regional_model_info_dto.h"


char* regional_model_info_dto_currency_ToString(_api__regional_model_info_dto__e currency) {
    char* currencyArray[] =  { "NULL", "RUR", "USD", "EUR", "UAH", "AUD", "GBP", "BYR", "BYN", "DKK", "ISK", "KZT", "CAD", "CNY", "NOK", "XDR", "SGD", "TRY", "SEK", "CHF", "JPY", "AZN", "ALL", "DZD", "AOA", "ARS", "AMD", "AFN", "BHD", "BGN", "BOB", "BWP", "BND", "BRL", "BIF", "HUF", "VEF", "KPW", "VND", "GMD", "GHS", "GNF", "HKD", "GEL", "AED", "EGP", "ZMK", "ILS", "INR", "IDR", "JOD", "IQD", "IRR", "YER", "QAR", "KES", "KGS", "COP", "CDF", "CRC", "KWD", "CUP", "LAK", "LVL", "SLL", "LBP", "LYD", "SZL", "LTL", "MUR", "MRO", "MKD", "MWK", "MGA", "MYR", "MAD", "MXN", "MZN", "MDL", "MNT", "NPR", "NGN", "NIO", "NZD", "OMR", "PKR", "PYG", "PEN", "PLN", "KHR", "SAR", "RON", "SCR", "SYP", "SKK", "SOS", "SDG", "SRD", "TJS", "THB", "TWD", "BDT", "TZS", "TND", "TMM", "UGX", "UZS", "UYU", "PHP", "DJF", "XAF", "XOF", "HRK", "CZK", "CLP", "LKR", "EEK", "ETB", "RSD", "ZAR", "KRW", "NAD", "TL", "UE" };
    return currencyArray[currency];
}

_api__regional_model_info_dto__e regional_model_info_dto_currency_FromString(char* currency){
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

regional_model_info_dto_t *regional_model_info_dto_create(
    currency_type_t *currency,
    long region_id
    ) {
    regional_model_info_dto_t *regional_model_info_dto_local_var = malloc(sizeof(regional_model_info_dto_t));
    if (!regional_model_info_dto_local_var) {
        return NULL;
    }
    regional_model_info_dto_local_var->currency = currency;
    regional_model_info_dto_local_var->region_id = region_id;

    return regional_model_info_dto_local_var;
}


void regional_model_info_dto_free(regional_model_info_dto_t *regional_model_info_dto) {
    if(NULL == regional_model_info_dto){
        return ;
    }
    listEntry_t *listEntry;
    if (regional_model_info_dto->currency) {
        currency_type_free(regional_model_info_dto->currency);
        regional_model_info_dto->currency = NULL;
    }
    free(regional_model_info_dto);
}

cJSON *regional_model_info_dto_convertToJSON(regional_model_info_dto_t *regional_model_info_dto) {
    cJSON *item = cJSON_CreateObject();

    // regional_model_info_dto->currency
    if(regional_model_info_dto->currency != _api__regional_model_info_dto__NULL) {
    cJSON *currency_local_JSON = currency_type_convertToJSON(regional_model_info_dto->currency);
    if(currency_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "currency", currency_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // regional_model_info_dto->region_id
    if(regional_model_info_dto->region_id) {
    if(cJSON_AddNumberToObject(item, "regionId", regional_model_info_dto->region_id) == NULL) {
    goto fail; //Numeric
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

regional_model_info_dto_t *regional_model_info_dto_parseFromJSON(cJSON *regional_model_info_dtoJSON){

    regional_model_info_dto_t *regional_model_info_dto_local_var = NULL;

    // define the local variable for regional_model_info_dto->currency
    currency_type_t *currency_local_nonprim = NULL;

    // regional_model_info_dto->currency
    cJSON *currency = cJSON_GetObjectItemCaseSensitive(regional_model_info_dtoJSON, "currency");
    if (currency) { 
    currency_local_nonprim = currency_type_parseFromJSON(currency); //custom
    }

    // regional_model_info_dto->region_id
    cJSON *region_id = cJSON_GetObjectItemCaseSensitive(regional_model_info_dtoJSON, "regionId");
    if (region_id) { 
    if(!cJSON_IsNumber(region_id))
    {
    goto end; //Numeric
    }
    }


    regional_model_info_dto_local_var = regional_model_info_dto_create (
        currency ? currency_local_nonprim : NULL,
        region_id ? region_id->valuedouble : 0
        );

    return regional_model_info_dto_local_var;
end:
    if (currency_local_nonprim) {
        currency_type_free(currency_local_nonprim);
        currency_local_nonprim = NULL;
    }
    return NULL;

}
