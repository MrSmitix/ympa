#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "price_suggest_type.h"


char* price_suggest_type_price_suggest_type_ToString(_api__price_suggest_type__e price_suggest_type) {
    char *price_suggest_typeArray[] =  { "NULL", "BUYBOX", "DEFAULT_OFFER", "MIN_PRICE_MARKET" };
    return price_suggest_typeArray[price_suggest_type];
}

_api__price_suggest_type__e price_suggest_type_price_suggest_type_FromString(char* price_suggest_type) {
    int stringToReturn = 0;
    char *price_suggest_typeArray[] =  { "NULL", "BUYBOX", "DEFAULT_OFFER", "MIN_PRICE_MARKET" };
    size_t sizeofArray = sizeof(price_suggest_typeArray) / sizeof(price_suggest_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(price_suggest_type, price_suggest_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *price_suggest_type_price_suggest_type_convertToJSON(_api__price_suggest_type__e price_suggest_type) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "price_suggest_type", price_suggest_type_price_suggest_type_ToString(price_suggest_type)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

_api__price_suggest_type__e price_suggest_type_price_suggest_type_parseFromJSON(cJSON *price_suggest_typeJSON) {
    _api__price_suggest_type__e *price_suggest_type = NULL;
    _api__price_suggest_type__e price_suggest_typeVariable;
    cJSON *price_suggest_typeVar = cJSON_GetObjectItemCaseSensitive(price_suggest_typeJSON, "price_suggest_type");
    if(!cJSON_IsString(price_suggest_typeVar) || (price_suggest_typeVar->valuestring == NULL)){
        goto end;
    }
    price_suggest_typeVariable = price_suggest_type_price_suggest_type_FromString(price_suggest_typeVar->valuestring);
    return price_suggest_typeVariable;
end:
    return 0;
}
