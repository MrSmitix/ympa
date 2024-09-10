#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "price_quarantine_verdict_type.h"


char* price_quarantine_verdict_type_price_quarantine_verdict_type_ToString(_api__price_quarantine_verdict_type__e price_quarantine_verdict_type) {
    char *price_quarantine_verdict_typeArray[] =  { "NULL", "PRICE_CHANGE", "LOW_PRICE", "LOW_PRICE_PROMO" };
    return price_quarantine_verdict_typeArray[price_quarantine_verdict_type];
}

_api__price_quarantine_verdict_type__e price_quarantine_verdict_type_price_quarantine_verdict_type_FromString(char* price_quarantine_verdict_type) {
    int stringToReturn = 0;
    char *price_quarantine_verdict_typeArray[] =  { "NULL", "PRICE_CHANGE", "LOW_PRICE", "LOW_PRICE_PROMO" };
    size_t sizeofArray = sizeof(price_quarantine_verdict_typeArray) / sizeof(price_quarantine_verdict_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(price_quarantine_verdict_type, price_quarantine_verdict_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *price_quarantine_verdict_type_price_quarantine_verdict_type_convertToJSON(_api__price_quarantine_verdict_type__e price_quarantine_verdict_type) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "price_quarantine_verdict_type", price_quarantine_verdict_type_price_quarantine_verdict_type_ToString(price_quarantine_verdict_type)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

_api__price_quarantine_verdict_type__e price_quarantine_verdict_type_price_quarantine_verdict_type_parseFromJSON(cJSON *price_quarantine_verdict_typeJSON) {
    _api__price_quarantine_verdict_type__e *price_quarantine_verdict_type = NULL;
    _api__price_quarantine_verdict_type__e price_quarantine_verdict_typeVariable;
    cJSON *price_quarantine_verdict_typeVar = cJSON_GetObjectItemCaseSensitive(price_quarantine_verdict_typeJSON, "price_quarantine_verdict_type");
    if(!cJSON_IsString(price_quarantine_verdict_typeVar) || (price_quarantine_verdict_typeVar->valuestring == NULL)){
        goto end;
    }
    price_quarantine_verdict_typeVariable = price_quarantine_verdict_type_price_quarantine_verdict_type_FromString(price_quarantine_verdict_typeVar->valuestring);
    return price_quarantine_verdict_typeVariable;
end:
    return 0;
}
