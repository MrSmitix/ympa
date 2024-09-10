#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "mechanics_type.h"


char* mechanics_type_mechanics_type_ToString(_api__mechanics_type__e mechanics_type) {
    char *mechanics_typeArray[] =  { "NULL", "DIRECT_DISCOUNT", "BLUE_FLASH", "MARKET_PROMOCODE" };
    return mechanics_typeArray[mechanics_type];
}

_api__mechanics_type__e mechanics_type_mechanics_type_FromString(char* mechanics_type) {
    int stringToReturn = 0;
    char *mechanics_typeArray[] =  { "NULL", "DIRECT_DISCOUNT", "BLUE_FLASH", "MARKET_PROMOCODE" };
    size_t sizeofArray = sizeof(mechanics_typeArray) / sizeof(mechanics_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(mechanics_type, mechanics_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *mechanics_type_mechanics_type_convertToJSON(_api__mechanics_type__e mechanics_type) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "mechanics_type", mechanics_type_mechanics_type_ToString(mechanics_type)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

_api__mechanics_type__e mechanics_type_mechanics_type_parseFromJSON(cJSON *mechanics_typeJSON) {
    _api__mechanics_type__e *mechanics_type = NULL;
    _api__mechanics_type__e mechanics_typeVariable;
    cJSON *mechanics_typeVar = cJSON_GetObjectItemCaseSensitive(mechanics_typeJSON, "mechanics_type");
    if(!cJSON_IsString(mechanics_typeVar) || (mechanics_typeVar->valuestring == NULL)){
        goto end;
    }
    mechanics_typeVariable = mechanics_type_mechanics_type_FromString(mechanics_typeVar->valuestring);
    return mechanics_typeVariable;
end:
    return 0;
}
