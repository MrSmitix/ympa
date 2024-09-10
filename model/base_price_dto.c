#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "base_price_dto.h"


char* base_price_dto_currency_id_ToString(_api__base_price_dto__e currency_id) {
    char* currency_idArray[] =  { "NULL", "RUR", "USD", "EUR", "UAH", "AUD", "GBP", "BYR", "BYN", "DKK", "ISK", "KZT", "CAD", "CNY", "NOK", "XDR", "SGD", "TRY", "SEK", "CHF", "JPY", "AZN", "ALL", "DZD", "AOA", "ARS", "AMD", "AFN", "BHD", "BGN", "BOB", "BWP", "BND", "BRL", "BIF", "HUF", "VEF", "KPW", "VND", "GMD", "GHS", "GNF", "HKD", "GEL", "AED", "EGP", "ZMK", "ILS", "INR", "IDR", "JOD", "IQD", "IRR", "YER", "QAR", "KES", "KGS", "COP", "CDF", "CRC", "KWD", "CUP", "LAK", "LVL", "SLL", "LBP", "LYD", "SZL", "LTL", "MUR", "MRO", "MKD", "MWK", "MGA", "MYR", "MAD", "MXN", "MZN", "MDL", "MNT", "NPR", "NGN", "NIO", "NZD", "OMR", "PKR", "PYG", "PEN", "PLN", "KHR", "SAR", "RON", "SCR", "SYP", "SKK", "SOS", "SDG", "SRD", "TJS", "THB", "TWD", "BDT", "TZS", "TND", "TMM", "UGX", "UZS", "UYU", "PHP", "DJF", "XAF", "XOF", "HRK", "CZK", "CLP", "LKR", "EEK", "ETB", "RSD", "ZAR", "KRW", "NAD", "TL", "UE" };
    return currency_idArray[currency_id];
}

_api__base_price_dto__e base_price_dto_currency_id_FromString(char* currency_id){
    int stringToReturn = 0;
    char *currency_idArray[] =  { "NULL", "RUR", "USD", "EUR", "UAH", "AUD", "GBP", "BYR", "BYN", "DKK", "ISK", "KZT", "CAD", "CNY", "NOK", "XDR", "SGD", "TRY", "SEK", "CHF", "JPY", "AZN", "ALL", "DZD", "AOA", "ARS", "AMD", "AFN", "BHD", "BGN", "BOB", "BWP", "BND", "BRL", "BIF", "HUF", "VEF", "KPW", "VND", "GMD", "GHS", "GNF", "HKD", "GEL", "AED", "EGP", "ZMK", "ILS", "INR", "IDR", "JOD", "IQD", "IRR", "YER", "QAR", "KES", "KGS", "COP", "CDF", "CRC", "KWD", "CUP", "LAK", "LVL", "SLL", "LBP", "LYD", "SZL", "LTL", "MUR", "MRO", "MKD", "MWK", "MGA", "MYR", "MAD", "MXN", "MZN", "MDL", "MNT", "NPR", "NGN", "NIO", "NZD", "OMR", "PKR", "PYG", "PEN", "PLN", "KHR", "SAR", "RON", "SCR", "SYP", "SKK", "SOS", "SDG", "SRD", "TJS", "THB", "TWD", "BDT", "TZS", "TND", "TMM", "UGX", "UZS", "UYU", "PHP", "DJF", "XAF", "XOF", "HRK", "CZK", "CLP", "LKR", "EEK", "ETB", "RSD", "ZAR", "KRW", "NAD", "TL", "UE" };
    size_t sizeofArray = sizeof(currency_idArray) / sizeof(currency_idArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(currency_id, currency_idArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

base_price_dto_t *base_price_dto_create(
    double value,
    currency_type_t *currency_id
    ) {
    base_price_dto_t *base_price_dto_local_var = malloc(sizeof(base_price_dto_t));
    if (!base_price_dto_local_var) {
        return NULL;
    }
    base_price_dto_local_var->value = value;
    base_price_dto_local_var->currency_id = currency_id;

    return base_price_dto_local_var;
}


void base_price_dto_free(base_price_dto_t *base_price_dto) {
    if(NULL == base_price_dto){
        return ;
    }
    listEntry_t *listEntry;
    if (base_price_dto->currency_id) {
        currency_type_free(base_price_dto->currency_id);
        base_price_dto->currency_id = NULL;
    }
    free(base_price_dto);
}

cJSON *base_price_dto_convertToJSON(base_price_dto_t *base_price_dto) {
    cJSON *item = cJSON_CreateObject();

    // base_price_dto->value
    if (!base_price_dto->value) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "value", base_price_dto->value) == NULL) {
    goto fail; //Numeric
    }


    // base_price_dto->currency_id
    if (_api__base_price_dto__NULL == base_price_dto->currency_id) {
        goto fail;
    }
    cJSON *currency_id_local_JSON = currency_type_convertToJSON(base_price_dto->currency_id);
    if(currency_id_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "currencyId", currency_id_local_JSON);
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

base_price_dto_t *base_price_dto_parseFromJSON(cJSON *base_price_dtoJSON){

    base_price_dto_t *base_price_dto_local_var = NULL;

    // define the local variable for base_price_dto->currency_id
    currency_type_t *currency_id_local_nonprim = NULL;

    // base_price_dto->value
    cJSON *value = cJSON_GetObjectItemCaseSensitive(base_price_dtoJSON, "value");
    if (!value) {
        goto end;
    }

    
    if(!cJSON_IsNumber(value))
    {
    goto end; //Numeric
    }

    // base_price_dto->currency_id
    cJSON *currency_id = cJSON_GetObjectItemCaseSensitive(base_price_dtoJSON, "currencyId");
    if (!currency_id) {
        goto end;
    }

    
    currency_id_local_nonprim = currency_type_parseFromJSON(currency_id); //custom


    base_price_dto_local_var = base_price_dto_create (
        value->valuedouble,
        currency_id_local_nonprim
        );

    return base_price_dto_local_var;
end:
    if (currency_id_local_nonprim) {
        currency_type_free(currency_id_local_nonprim);
        currency_id_local_nonprim = NULL;
    }
    return NULL;

}
