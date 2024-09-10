#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "price_competitiveness_type.h"


char* price_competitiveness_type_price_competitiveness_type_ToString(_api__price_competitiveness_type__e price_competitiveness_type) {
    char *price_competitiveness_typeArray[] =  { "NULL", "OPTIMAL", "AVERAGE", "LOW" };
    return price_competitiveness_typeArray[price_competitiveness_type];
}

_api__price_competitiveness_type__e price_competitiveness_type_price_competitiveness_type_FromString(char* price_competitiveness_type) {
    int stringToReturn = 0;
    char *price_competitiveness_typeArray[] =  { "NULL", "OPTIMAL", "AVERAGE", "LOW" };
    size_t sizeofArray = sizeof(price_competitiveness_typeArray) / sizeof(price_competitiveness_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(price_competitiveness_type, price_competitiveness_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *price_competitiveness_type_price_competitiveness_type_convertToJSON(_api__price_competitiveness_type__e price_competitiveness_type) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "price_competitiveness_type", price_competitiveness_type_price_competitiveness_type_ToString(price_competitiveness_type)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

_api__price_competitiveness_type__e price_competitiveness_type_price_competitiveness_type_parseFromJSON(cJSON *price_competitiveness_typeJSON) {
    _api__price_competitiveness_type__e *price_competitiveness_type = NULL;
    _api__price_competitiveness_type__e price_competitiveness_typeVariable;
    cJSON *price_competitiveness_typeVar = cJSON_GetObjectItemCaseSensitive(price_competitiveness_typeJSON, "price_competitiveness_type");
    if(!cJSON_IsString(price_competitiveness_typeVar) || (price_competitiveness_typeVar->valuestring == NULL)){
        goto end;
    }
    price_competitiveness_typeVariable = price_competitiveness_type_price_competitiveness_type_FromString(price_competitiveness_typeVar->valuestring);
    return price_competitiveness_typeVariable;
end:
    return 0;
}
