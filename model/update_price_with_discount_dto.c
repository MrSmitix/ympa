#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "update_price_with_discount_dto.h"


char* update_price_with_discount_dto_currency_id_ToString(_api__update_price_with_discount_dto__e currency_id) {
    char* currency_idArray[] =  { "NULL", "RUR", "USD", "EUR", "UAH", "AUD", "GBP", "BYR", "BYN", "DKK", "ISK", "KZT", "CAD", "CNY", "NOK", "XDR", "SGD", "TRY", "SEK", "CHF", "JPY", "AZN", "ALL", "DZD", "AOA", "ARS", "AMD", "AFN", "BHD", "BGN", "BOB", "BWP", "BND", "BRL", "BIF", "HUF", "VEF", "KPW", "VND", "GMD", "GHS", "GNF", "HKD", "GEL", "AED", "EGP", "ZMK", "ILS", "INR", "IDR", "JOD", "IQD", "IRR", "YER", "QAR", "KES", "KGS", "COP", "CDF", "CRC", "KWD", "CUP", "LAK", "LVL", "SLL", "LBP", "LYD", "SZL", "LTL", "MUR", "MRO", "MKD", "MWK", "MGA", "MYR", "MAD", "MXN", "MZN", "MDL", "MNT", "NPR", "NGN", "NIO", "NZD", "OMR", "PKR", "PYG", "PEN", "PLN", "KHR", "SAR", "RON", "SCR", "SYP", "SKK", "SOS", "SDG", "SRD", "TJS", "THB", "TWD", "BDT", "TZS", "TND", "TMM", "UGX", "UZS", "UYU", "PHP", "DJF", "XAF", "XOF", "HRK", "CZK", "CLP", "LKR", "EEK", "ETB", "RSD", "ZAR", "KRW", "NAD", "TL", "UE" };
    return currency_idArray[currency_id];
}

_api__update_price_with_discount_dto__e update_price_with_discount_dto_currency_id_FromString(char* currency_id){
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

update_price_with_discount_dto_t *update_price_with_discount_dto_create(
    double value,
    currency_type_t *currency_id,
    double discount_base
    ) {
    update_price_with_discount_dto_t *update_price_with_discount_dto_local_var = malloc(sizeof(update_price_with_discount_dto_t));
    if (!update_price_with_discount_dto_local_var) {
        return NULL;
    }
    update_price_with_discount_dto_local_var->value = value;
    update_price_with_discount_dto_local_var->currency_id = currency_id;
    update_price_with_discount_dto_local_var->discount_base = discount_base;

    return update_price_with_discount_dto_local_var;
}


void update_price_with_discount_dto_free(update_price_with_discount_dto_t *update_price_with_discount_dto) {
    if(NULL == update_price_with_discount_dto){
        return ;
    }
    listEntry_t *listEntry;
    if (update_price_with_discount_dto->currency_id) {
        currency_type_free(update_price_with_discount_dto->currency_id);
        update_price_with_discount_dto->currency_id = NULL;
    }
    free(update_price_with_discount_dto);
}

cJSON *update_price_with_discount_dto_convertToJSON(update_price_with_discount_dto_t *update_price_with_discount_dto) {
    cJSON *item = cJSON_CreateObject();

    // update_price_with_discount_dto->value
    if (!update_price_with_discount_dto->value) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "value", update_price_with_discount_dto->value) == NULL) {
    goto fail; //Numeric
    }


    // update_price_with_discount_dto->currency_id
    if (_api__update_price_with_discount_dto__NULL == update_price_with_discount_dto->currency_id) {
        goto fail;
    }
    cJSON *currency_id_local_JSON = currency_type_convertToJSON(update_price_with_discount_dto->currency_id);
    if(currency_id_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "currencyId", currency_id_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }


    // update_price_with_discount_dto->discount_base
    if(update_price_with_discount_dto->discount_base) {
    if(cJSON_AddNumberToObject(item, "discountBase", update_price_with_discount_dto->discount_base) == NULL) {
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

update_price_with_discount_dto_t *update_price_with_discount_dto_parseFromJSON(cJSON *update_price_with_discount_dtoJSON){

    update_price_with_discount_dto_t *update_price_with_discount_dto_local_var = NULL;

    // define the local variable for update_price_with_discount_dto->currency_id
    currency_type_t *currency_id_local_nonprim = NULL;

    // update_price_with_discount_dto->value
    cJSON *value = cJSON_GetObjectItemCaseSensitive(update_price_with_discount_dtoJSON, "value");
    if (!value) {
        goto end;
    }

    
    if(!cJSON_IsNumber(value))
    {
    goto end; //Numeric
    }

    // update_price_with_discount_dto->currency_id
    cJSON *currency_id = cJSON_GetObjectItemCaseSensitive(update_price_with_discount_dtoJSON, "currencyId");
    if (!currency_id) {
        goto end;
    }

    
    currency_id_local_nonprim = currency_type_parseFromJSON(currency_id); //custom

    // update_price_with_discount_dto->discount_base
    cJSON *discount_base = cJSON_GetObjectItemCaseSensitive(update_price_with_discount_dtoJSON, "discountBase");
    if (discount_base) { 
    if(!cJSON_IsNumber(discount_base))
    {
    goto end; //Numeric
    }
    }


    update_price_with_discount_dto_local_var = update_price_with_discount_dto_create (
        value->valuedouble,
        currency_id_local_nonprim,
        discount_base ? discount_base->valuedouble : 0
        );

    return update_price_with_discount_dto_local_var;
end:
    if (currency_id_local_nonprim) {
        currency_type_free(currency_id_local_nonprim);
        currency_id_local_nonprim = NULL;
    }
    return NULL;

}
