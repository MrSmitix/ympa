#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "logistic_point_type.h"


char* logistic_point_type_logistic_point_type_ToString(_api__logistic_point_type__e logistic_point_type) {
    char *logistic_point_typeArray[] =  { "NULL", "WAREHOUSE", "PICKUP_POINT", "PICKUP_TERMINAL", "PICKUP_POST_OFFICE", "PICKUP_MIXED", "PICKUP_RETAIL", "UNKNOWN" };
    return logistic_point_typeArray[logistic_point_type];
}

_api__logistic_point_type__e logistic_point_type_logistic_point_type_FromString(char* logistic_point_type) {
    int stringToReturn = 0;
    char *logistic_point_typeArray[] =  { "NULL", "WAREHOUSE", "PICKUP_POINT", "PICKUP_TERMINAL", "PICKUP_POST_OFFICE", "PICKUP_MIXED", "PICKUP_RETAIL", "UNKNOWN" };
    size_t sizeofArray = sizeof(logistic_point_typeArray) / sizeof(logistic_point_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(logistic_point_type, logistic_point_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *logistic_point_type_logistic_point_type_convertToJSON(_api__logistic_point_type__e logistic_point_type) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "logistic_point_type", logistic_point_type_logistic_point_type_ToString(logistic_point_type)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

_api__logistic_point_type__e logistic_point_type_logistic_point_type_parseFromJSON(cJSON *logistic_point_typeJSON) {
    _api__logistic_point_type__e *logistic_point_type = NULL;
    _api__logistic_point_type__e logistic_point_typeVariable;
    cJSON *logistic_point_typeVar = cJSON_GetObjectItemCaseSensitive(logistic_point_typeJSON, "logistic_point_type");
    if(!cJSON_IsString(logistic_point_typeVar) || (logistic_point_typeVar->valuestring == NULL)){
        goto end;
    }
    logistic_point_typeVariable = logistic_point_type_logistic_point_type_FromString(logistic_point_typeVar->valuestring);
    return logistic_point_typeVariable;
end:
    return 0;
}
