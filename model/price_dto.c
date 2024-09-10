#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "price_dto.h"


char* price_dto_currency_id_ToString(_api__price_dto__e currency_id) {
    char* currency_idArray[] =  { "NULL", "RUR", "USD", "EUR", "UAH", "AUD", "GBP", "BYR", "BYN", "DKK", "ISK", "KZT", "CAD", "CNY", "NOK", "XDR", "SGD", "TRY", "SEK", "CHF", "JPY", "AZN", "ALL", "DZD", "AOA", "ARS", "AMD", "AFN", "BHD", "BGN", "BOB", "BWP", "BND", "BRL", "BIF", "HUF", "VEF", "KPW", "VND", "GMD", "GHS", "GNF", "HKD", "GEL", "AED", "EGP", "ZMK", "ILS", "INR", "IDR", "JOD", "IQD", "IRR", "YER", "QAR", "KES", "KGS", "COP", "CDF", "CRC", "KWD", "CUP", "LAK", "LVL", "SLL", "LBP", "LYD", "SZL", "LTL", "MUR", "MRO", "MKD", "MWK", "MGA", "MYR", "MAD", "MXN", "MZN", "MDL", "MNT", "NPR", "NGN", "NIO", "NZD", "OMR", "PKR", "PYG", "PEN", "PLN", "KHR", "SAR", "RON", "SCR", "SYP", "SKK", "SOS", "SDG", "SRD", "TJS", "THB", "TWD", "BDT", "TZS", "TND", "TMM", "UGX", "UZS", "UYU", "PHP", "DJF", "XAF", "XOF", "HRK", "CZK", "CLP", "LKR", "EEK", "ETB", "RSD", "ZAR", "KRW", "NAD", "TL", "UE" };
    return currency_idArray[currency_id];
}

_api__price_dto__e price_dto_currency_id_FromString(char* currency_id){
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

price_dto_t *price_dto_create(
    double value,
    double discount_base,
    currency_type_t *currency_id,
    int vat
    ) {
    price_dto_t *price_dto_local_var = malloc(sizeof(price_dto_t));
    if (!price_dto_local_var) {
        return NULL;
    }
    price_dto_local_var->value = value;
    price_dto_local_var->discount_base = discount_base;
    price_dto_local_var->currency_id = currency_id;
    price_dto_local_var->vat = vat;

    return price_dto_local_var;
}


void price_dto_free(price_dto_t *price_dto) {
    if(NULL == price_dto){
        return ;
    }
    listEntry_t *listEntry;
    if (price_dto->currency_id) {
        currency_type_free(price_dto->currency_id);
        price_dto->currency_id = NULL;
    }
    free(price_dto);
}

cJSON *price_dto_convertToJSON(price_dto_t *price_dto) {
    cJSON *item = cJSON_CreateObject();

    // price_dto->value
    if(price_dto->value) {
    if(cJSON_AddNumberToObject(item, "value", price_dto->value) == NULL) {
    goto fail; //Numeric
    }
    }


    // price_dto->discount_base
    if(price_dto->discount_base) {
    if(cJSON_AddNumberToObject(item, "discountBase", price_dto->discount_base) == NULL) {
    goto fail; //Numeric
    }
    }


    // price_dto->currency_id
    if(price_dto->currency_id != _api__price_dto__NULL) {
    cJSON *currency_id_local_JSON = currency_type_convertToJSON(price_dto->currency_id);
    if(currency_id_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "currencyId", currency_id_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // price_dto->vat
    if(price_dto->vat) {
    if(cJSON_AddNumberToObject(item, "vat", price_dto->vat) == NULL) {
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

price_dto_t *price_dto_parseFromJSON(cJSON *price_dtoJSON){

    price_dto_t *price_dto_local_var = NULL;

    // define the local variable for price_dto->currency_id
    currency_type_t *currency_id_local_nonprim = NULL;

    // price_dto->value
    cJSON *value = cJSON_GetObjectItemCaseSensitive(price_dtoJSON, "value");
    if (value) { 
    if(!cJSON_IsNumber(value))
    {
    goto end; //Numeric
    }
    }

    // price_dto->discount_base
    cJSON *discount_base = cJSON_GetObjectItemCaseSensitive(price_dtoJSON, "discountBase");
    if (discount_base) { 
    if(!cJSON_IsNumber(discount_base))
    {
    goto end; //Numeric
    }
    }

    // price_dto->currency_id
    cJSON *currency_id = cJSON_GetObjectItemCaseSensitive(price_dtoJSON, "currencyId");
    if (currency_id) { 
    currency_id_local_nonprim = currency_type_parseFromJSON(currency_id); //custom
    }

    // price_dto->vat
    cJSON *vat = cJSON_GetObjectItemCaseSensitive(price_dtoJSON, "vat");
    if (vat) { 
    if(!cJSON_IsNumber(vat))
    {
    goto end; //Numeric
    }
    }


    price_dto_local_var = price_dto_create (
        value ? value->valuedouble : 0,
        discount_base ? discount_base->valuedouble : 0,
        currency_id ? currency_id_local_nonprim : NULL,
        vat ? vat->valuedouble : 0
        );

    return price_dto_local_var;
end:
    if (currency_id_local_nonprim) {
        currency_type_free(currency_id_local_nonprim);
        currency_id_local_nonprim = NULL;
    }
    return NULL;

}
