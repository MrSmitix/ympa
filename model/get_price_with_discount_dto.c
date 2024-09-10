#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "get_price_with_discount_dto.h"


char* get_price_with_discount_dto_currency_id_ToString(_api__get_price_with_discount_dto__e currency_id) {
    char* currency_idArray[] =  { "NULL", "RUR", "USD", "EUR", "UAH", "AUD", "GBP", "BYR", "BYN", "DKK", "ISK", "KZT", "CAD", "CNY", "NOK", "XDR", "SGD", "TRY", "SEK", "CHF", "JPY", "AZN", "ALL", "DZD", "AOA", "ARS", "AMD", "AFN", "BHD", "BGN", "BOB", "BWP", "BND", "BRL", "BIF", "HUF", "VEF", "KPW", "VND", "GMD", "GHS", "GNF", "HKD", "GEL", "AED", "EGP", "ZMK", "ILS", "INR", "IDR", "JOD", "IQD", "IRR", "YER", "QAR", "KES", "KGS", "COP", "CDF", "CRC", "KWD", "CUP", "LAK", "LVL", "SLL", "LBP", "LYD", "SZL", "LTL", "MUR", "MRO", "MKD", "MWK", "MGA", "MYR", "MAD", "MXN", "MZN", "MDL", "MNT", "NPR", "NGN", "NIO", "NZD", "OMR", "PKR", "PYG", "PEN", "PLN", "KHR", "SAR", "RON", "SCR", "SYP", "SKK", "SOS", "SDG", "SRD", "TJS", "THB", "TWD", "BDT", "TZS", "TND", "TMM", "UGX", "UZS", "UYU", "PHP", "DJF", "XAF", "XOF", "HRK", "CZK", "CLP", "LKR", "EEK", "ETB", "RSD", "ZAR", "KRW", "NAD", "TL", "UE" };
    return currency_idArray[currency_id];
}

_api__get_price_with_discount_dto__e get_price_with_discount_dto_currency_id_FromString(char* currency_id){
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

get_price_with_discount_dto_t *get_price_with_discount_dto_create(
    double value,
    currency_type_t *currency_id,
    double discount_base,
    char *updated_at
    ) {
    get_price_with_discount_dto_t *get_price_with_discount_dto_local_var = malloc(sizeof(get_price_with_discount_dto_t));
    if (!get_price_with_discount_dto_local_var) {
        return NULL;
    }
    get_price_with_discount_dto_local_var->value = value;
    get_price_with_discount_dto_local_var->currency_id = currency_id;
    get_price_with_discount_dto_local_var->discount_base = discount_base;
    get_price_with_discount_dto_local_var->updated_at = updated_at;

    return get_price_with_discount_dto_local_var;
}


void get_price_with_discount_dto_free(get_price_with_discount_dto_t *get_price_with_discount_dto) {
    if(NULL == get_price_with_discount_dto){
        return ;
    }
    listEntry_t *listEntry;
    if (get_price_with_discount_dto->currency_id) {
        currency_type_free(get_price_with_discount_dto->currency_id);
        get_price_with_discount_dto->currency_id = NULL;
    }
    if (get_price_with_discount_dto->updated_at) {
        free(get_price_with_discount_dto->updated_at);
        get_price_with_discount_dto->updated_at = NULL;
    }
    free(get_price_with_discount_dto);
}

cJSON *get_price_with_discount_dto_convertToJSON(get_price_with_discount_dto_t *get_price_with_discount_dto) {
    cJSON *item = cJSON_CreateObject();

    // get_price_with_discount_dto->value
    if (!get_price_with_discount_dto->value) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "value", get_price_with_discount_dto->value) == NULL) {
    goto fail; //Numeric
    }


    // get_price_with_discount_dto->currency_id
    if (_api__get_price_with_discount_dto__NULL == get_price_with_discount_dto->currency_id) {
        goto fail;
    }
    cJSON *currency_id_local_JSON = currency_type_convertToJSON(get_price_with_discount_dto->currency_id);
    if(currency_id_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "currencyId", currency_id_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }


    // get_price_with_discount_dto->discount_base
    if(get_price_with_discount_dto->discount_base) {
    if(cJSON_AddNumberToObject(item, "discountBase", get_price_with_discount_dto->discount_base) == NULL) {
    goto fail; //Numeric
    }
    }


    // get_price_with_discount_dto->updated_at
    if (!get_price_with_discount_dto->updated_at) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "updatedAt", get_price_with_discount_dto->updated_at) == NULL) {
    goto fail; //Date-Time
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

get_price_with_discount_dto_t *get_price_with_discount_dto_parseFromJSON(cJSON *get_price_with_discount_dtoJSON){

    get_price_with_discount_dto_t *get_price_with_discount_dto_local_var = NULL;

    // define the local variable for get_price_with_discount_dto->currency_id
    currency_type_t *currency_id_local_nonprim = NULL;

    // get_price_with_discount_dto->value
    cJSON *value = cJSON_GetObjectItemCaseSensitive(get_price_with_discount_dtoJSON, "value");
    if (!value) {
        goto end;
    }

    
    if(!cJSON_IsNumber(value))
    {
    goto end; //Numeric
    }

    // get_price_with_discount_dto->currency_id
    cJSON *currency_id = cJSON_GetObjectItemCaseSensitive(get_price_with_discount_dtoJSON, "currencyId");
    if (!currency_id) {
        goto end;
    }

    
    currency_id_local_nonprim = currency_type_parseFromJSON(currency_id); //custom

    // get_price_with_discount_dto->discount_base
    cJSON *discount_base = cJSON_GetObjectItemCaseSensitive(get_price_with_discount_dtoJSON, "discountBase");
    if (discount_base) { 
    if(!cJSON_IsNumber(discount_base))
    {
    goto end; //Numeric
    }
    }

    // get_price_with_discount_dto->updated_at
    cJSON *updated_at = cJSON_GetObjectItemCaseSensitive(get_price_with_discount_dtoJSON, "updatedAt");
    if (!updated_at) {
        goto end;
    }

    
    if(!cJSON_IsString(updated_at) && !cJSON_IsNull(updated_at))
    {
    goto end; //DateTime
    }


    get_price_with_discount_dto_local_var = get_price_with_discount_dto_create (
        value->valuedouble,
        currency_id_local_nonprim,
        discount_base ? discount_base->valuedouble : 0,
        strdup(updated_at->valuestring)
        );

    return get_price_with_discount_dto_local_var;
end:
    if (currency_id_local_nonprim) {
        currency_type_free(currency_id_local_nonprim);
        currency_id_local_nonprim = NULL;
    }
    return NULL;

}
