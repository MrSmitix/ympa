#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "get_models_offers_response.h"


char* get_models_offers_response_currency_ToString(_api__get_models_offers_response__e currency) {
    char* currencyArray[] =  { "NULL", "RUR", "USD", "EUR", "UAH", "AUD", "GBP", "BYR", "BYN", "DKK", "ISK", "KZT", "CAD", "CNY", "NOK", "XDR", "SGD", "TRY", "SEK", "CHF", "JPY", "AZN", "ALL", "DZD", "AOA", "ARS", "AMD", "AFN", "BHD", "BGN", "BOB", "BWP", "BND", "BRL", "BIF", "HUF", "VEF", "KPW", "VND", "GMD", "GHS", "GNF", "HKD", "GEL", "AED", "EGP", "ZMK", "ILS", "INR", "IDR", "JOD", "IQD", "IRR", "YER", "QAR", "KES", "KGS", "COP", "CDF", "CRC", "KWD", "CUP", "LAK", "LVL", "SLL", "LBP", "LYD", "SZL", "LTL", "MUR", "MRO", "MKD", "MWK", "MGA", "MYR", "MAD", "MXN", "MZN", "MDL", "MNT", "NPR", "NGN", "NIO", "NZD", "OMR", "PKR", "PYG", "PEN", "PLN", "KHR", "SAR", "RON", "SCR", "SYP", "SKK", "SOS", "SDG", "SRD", "TJS", "THB", "TWD", "BDT", "TZS", "TND", "TMM", "UGX", "UZS", "UYU", "PHP", "DJF", "XAF", "XOF", "HRK", "CZK", "CLP", "LKR", "EEK", "ETB", "RSD", "ZAR", "KRW", "NAD", "TL", "UE" };
    return currencyArray[currency];
}

_api__get_models_offers_response__e get_models_offers_response_currency_FromString(char* currency){
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

get_models_offers_response_t *get_models_offers_response_create(
    list_t *models,
    currency_type_t *currency,
    long region_id
    ) {
    get_models_offers_response_t *get_models_offers_response_local_var = malloc(sizeof(get_models_offers_response_t));
    if (!get_models_offers_response_local_var) {
        return NULL;
    }
    get_models_offers_response_local_var->models = models;
    get_models_offers_response_local_var->currency = currency;
    get_models_offers_response_local_var->region_id = region_id;

    return get_models_offers_response_local_var;
}


void get_models_offers_response_free(get_models_offers_response_t *get_models_offers_response) {
    if(NULL == get_models_offers_response){
        return ;
    }
    listEntry_t *listEntry;
    if (get_models_offers_response->models) {
        list_ForEach(listEntry, get_models_offers_response->models) {
            enriched_model_dto_free(listEntry->data);
        }
        list_freeList(get_models_offers_response->models);
        get_models_offers_response->models = NULL;
    }
    if (get_models_offers_response->currency) {
        currency_type_free(get_models_offers_response->currency);
        get_models_offers_response->currency = NULL;
    }
    free(get_models_offers_response);
}

cJSON *get_models_offers_response_convertToJSON(get_models_offers_response_t *get_models_offers_response) {
    cJSON *item = cJSON_CreateObject();

    // get_models_offers_response->models
    if (!get_models_offers_response->models) {
        goto fail;
    }
    cJSON *models = cJSON_AddArrayToObject(item, "models");
    if(models == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *modelsListEntry;
    if (get_models_offers_response->models) {
    list_ForEach(modelsListEntry, get_models_offers_response->models) {
    cJSON *itemLocal = enriched_model_dto_convertToJSON(modelsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(models, itemLocal);
    }
    }


    // get_models_offers_response->currency
    if(get_models_offers_response->currency != _api__get_models_offers_response__NULL) {
    cJSON *currency_local_JSON = currency_type_convertToJSON(get_models_offers_response->currency);
    if(currency_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "currency", currency_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // get_models_offers_response->region_id
    if(get_models_offers_response->region_id) {
    if(cJSON_AddNumberToObject(item, "regionId", get_models_offers_response->region_id) == NULL) {
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

get_models_offers_response_t *get_models_offers_response_parseFromJSON(cJSON *get_models_offers_responseJSON){

    get_models_offers_response_t *get_models_offers_response_local_var = NULL;

    // define the local list for get_models_offers_response->models
    list_t *modelsList = NULL;

    // define the local variable for get_models_offers_response->currency
    currency_type_t *currency_local_nonprim = NULL;

    // get_models_offers_response->models
    cJSON *models = cJSON_GetObjectItemCaseSensitive(get_models_offers_responseJSON, "models");
    if (!models) {
        goto end;
    }

    
    cJSON *models_local_nonprimitive = NULL;
    if(!cJSON_IsArray(models)){
        goto end; //nonprimitive container
    }

    modelsList = list_createList();

    cJSON_ArrayForEach(models_local_nonprimitive,models )
    {
        if(!cJSON_IsObject(models_local_nonprimitive)){
            goto end;
        }
        enriched_model_dto_t *modelsItem = enriched_model_dto_parseFromJSON(models_local_nonprimitive);

        list_addElement(modelsList, modelsItem);
    }

    // get_models_offers_response->currency
    cJSON *currency = cJSON_GetObjectItemCaseSensitive(get_models_offers_responseJSON, "currency");
    if (currency) { 
    currency_local_nonprim = currency_type_parseFromJSON(currency); //custom
    }

    // get_models_offers_response->region_id
    cJSON *region_id = cJSON_GetObjectItemCaseSensitive(get_models_offers_responseJSON, "regionId");
    if (region_id) { 
    if(!cJSON_IsNumber(region_id))
    {
    goto end; //Numeric
    }
    }


    get_models_offers_response_local_var = get_models_offers_response_create (
        modelsList,
        currency ? currency_local_nonprim : NULL,
        region_id ? region_id->valuedouble : 0
        );

    return get_models_offers_response_local_var;
end:
    if (modelsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, modelsList) {
            enriched_model_dto_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(modelsList);
        modelsList = NULL;
    }
    if (currency_local_nonprim) {
        currency_type_free(currency_local_nonprim);
        currency_local_nonprim = NULL;
    }
    return NULL;

}
