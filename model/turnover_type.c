#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "turnover_type.h"


char* turnover_type_turnover_type_ToString(_api__turnover_type__e turnover_type) {
    char *turnover_typeArray[] =  { "NULL", "LOW", "ALMOST_LOW", "HIGH", "VERY_HIGH", "NO_SALES", "FREE_STORE" };
    return turnover_typeArray[turnover_type];
}

_api__turnover_type__e turnover_type_turnover_type_FromString(char* turnover_type) {
    int stringToReturn = 0;
    char *turnover_typeArray[] =  { "NULL", "LOW", "ALMOST_LOW", "HIGH", "VERY_HIGH", "NO_SALES", "FREE_STORE" };
    size_t sizeofArray = sizeof(turnover_typeArray) / sizeof(turnover_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(turnover_type, turnover_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *turnover_type_turnover_type_convertToJSON(_api__turnover_type__e turnover_type) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "turnover_type", turnover_type_turnover_type_ToString(turnover_type)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

_api__turnover_type__e turnover_type_turnover_type_parseFromJSON(cJSON *turnover_typeJSON) {
    _api__turnover_type__e *turnover_type = NULL;
    _api__turnover_type__e turnover_typeVariable;
    cJSON *turnover_typeVar = cJSON_GetObjectItemCaseSensitive(turnover_typeJSON, "turnover_type");
    if(!cJSON_IsString(turnover_typeVar) || (turnover_typeVar->valuestring == NULL)){
        goto end;
    }
    turnover_typeVariable = turnover_type_turnover_type_FromString(turnover_typeVar->valuestring);
    return turnover_typeVariable;
end:
    return 0;
}
