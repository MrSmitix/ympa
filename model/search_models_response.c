#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "search_models_response.h"


char* search_models_response_currency_ToString(_api__search_models_response__e currency) {
    char* currencyArray[] =  { "NULL", "RUR", "USD", "EUR", "UAH", "AUD", "GBP", "BYR", "BYN", "DKK", "ISK", "KZT", "CAD", "CNY", "NOK", "XDR", "SGD", "TRY", "SEK", "CHF", "JPY", "AZN", "ALL", "DZD", "AOA", "ARS", "AMD", "AFN", "BHD", "BGN", "BOB", "BWP", "BND", "BRL", "BIF", "HUF", "VEF", "KPW", "VND", "GMD", "GHS", "GNF", "HKD", "GEL", "AED", "EGP", "ZMK", "ILS", "INR", "IDR", "JOD", "IQD", "IRR", "YER", "QAR", "KES", "KGS", "COP", "CDF", "CRC", "KWD", "CUP", "LAK", "LVL", "SLL", "LBP", "LYD", "SZL", "LTL", "MUR", "MRO", "MKD", "MWK", "MGA", "MYR", "MAD", "MXN", "MZN", "MDL", "MNT", "NPR", "NGN", "NIO", "NZD", "OMR", "PKR", "PYG", "PEN", "PLN", "KHR", "SAR", "RON", "SCR", "SYP", "SKK", "SOS", "SDG", "SRD", "TJS", "THB", "TWD", "BDT", "TZS", "TND", "TMM", "UGX", "UZS", "UYU", "PHP", "DJF", "XAF", "XOF", "HRK", "CZK", "CLP", "LKR", "EEK", "ETB", "RSD", "ZAR", "KRW", "NAD", "TL", "UE" };
    return currencyArray[currency];
}

_api__search_models_response__e search_models_response_currency_FromString(char* currency){
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

search_models_response_t *search_models_response_create(
    list_t *models,
    currency_type_t *currency,
    long region_id,
    flipping_pager_dto_t *pager
    ) {
    search_models_response_t *search_models_response_local_var = malloc(sizeof(search_models_response_t));
    if (!search_models_response_local_var) {
        return NULL;
    }
    search_models_response_local_var->models = models;
    search_models_response_local_var->currency = currency;
    search_models_response_local_var->region_id = region_id;
    search_models_response_local_var->pager = pager;

    return search_models_response_local_var;
}


void search_models_response_free(search_models_response_t *search_models_response) {
    if(NULL == search_models_response){
        return ;
    }
    listEntry_t *listEntry;
    if (search_models_response->models) {
        list_ForEach(listEntry, search_models_response->models) {
            model_dto_free(listEntry->data);
        }
        list_freeList(search_models_response->models);
        search_models_response->models = NULL;
    }
    if (search_models_response->currency) {
        currency_type_free(search_models_response->currency);
        search_models_response->currency = NULL;
    }
    if (search_models_response->pager) {
        flipping_pager_dto_free(search_models_response->pager);
        search_models_response->pager = NULL;
    }
    free(search_models_response);
}

cJSON *search_models_response_convertToJSON(search_models_response_t *search_models_response) {
    cJSON *item = cJSON_CreateObject();

    // search_models_response->models
    if (!search_models_response->models) {
        goto fail;
    }
    cJSON *models = cJSON_AddArrayToObject(item, "models");
    if(models == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *modelsListEntry;
    if (search_models_response->models) {
    list_ForEach(modelsListEntry, search_models_response->models) {
    cJSON *itemLocal = model_dto_convertToJSON(modelsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(models, itemLocal);
    }
    }


    // search_models_response->currency
    if(search_models_response->currency != _api__search_models_response__NULL) {
    cJSON *currency_local_JSON = currency_type_convertToJSON(search_models_response->currency);
    if(currency_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "currency", currency_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // search_models_response->region_id
    if(search_models_response->region_id) {
    if(cJSON_AddNumberToObject(item, "regionId", search_models_response->region_id) == NULL) {
    goto fail; //Numeric
    }
    }


    // search_models_response->pager
    if(search_models_response->pager) {
    cJSON *pager_local_JSON = flipping_pager_dto_convertToJSON(search_models_response->pager);
    if(pager_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "pager", pager_local_JSON);
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

search_models_response_t *search_models_response_parseFromJSON(cJSON *search_models_responseJSON){

    search_models_response_t *search_models_response_local_var = NULL;

    // define the local list for search_models_response->models
    list_t *modelsList = NULL;

    // define the local variable for search_models_response->currency
    currency_type_t *currency_local_nonprim = NULL;

    // define the local variable for search_models_response->pager
    flipping_pager_dto_t *pager_local_nonprim = NULL;

    // search_models_response->models
    cJSON *models = cJSON_GetObjectItemCaseSensitive(search_models_responseJSON, "models");
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
        model_dto_t *modelsItem = model_dto_parseFromJSON(models_local_nonprimitive);

        list_addElement(modelsList, modelsItem);
    }

    // search_models_response->currency
    cJSON *currency = cJSON_GetObjectItemCaseSensitive(search_models_responseJSON, "currency");
    if (currency) { 
    currency_local_nonprim = currency_type_parseFromJSON(currency); //custom
    }

    // search_models_response->region_id
    cJSON *region_id = cJSON_GetObjectItemCaseSensitive(search_models_responseJSON, "regionId");
    if (region_id) { 
    if(!cJSON_IsNumber(region_id))
    {
    goto end; //Numeric
    }
    }

    // search_models_response->pager
    cJSON *pager = cJSON_GetObjectItemCaseSensitive(search_models_responseJSON, "pager");
    if (pager) { 
    pager_local_nonprim = flipping_pager_dto_parseFromJSON(pager); //nonprimitive
    }


    search_models_response_local_var = search_models_response_create (
        modelsList,
        currency ? currency_local_nonprim : NULL,
        region_id ? region_id->valuedouble : 0,
        pager ? pager_local_nonprim : NULL
        );

    return search_models_response_local_var;
end:
    if (modelsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, modelsList) {
            model_dto_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(modelsList);
        modelsList = NULL;
    }
    if (currency_local_nonprim) {
        currency_type_free(currency_local_nonprim);
        currency_local_nonprim = NULL;
    }
    if (pager_local_nonprim) {
        flipping_pager_dto_free(pager_local_nonprim);
        pager_local_nonprim = NULL;
    }
    return NULL;

}
