#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "time_unit_type.h"


char* time_unit_type_time_unit_type_ToString(_api__time_unit_type__e time_unit_type) {
    char *time_unit_typeArray[] =  { "NULL", "HOUR", "DAY", "WEEK", "MONTH", "YEAR" };
    return time_unit_typeArray[time_unit_type];
}

_api__time_unit_type__e time_unit_type_time_unit_type_FromString(char* time_unit_type) {
    int stringToReturn = 0;
    char *time_unit_typeArray[] =  { "NULL", "HOUR", "DAY", "WEEK", "MONTH", "YEAR" };
    size_t sizeofArray = sizeof(time_unit_typeArray) / sizeof(time_unit_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(time_unit_type, time_unit_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *time_unit_type_time_unit_type_convertToJSON(_api__time_unit_type__e time_unit_type) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "time_unit_type", time_unit_type_time_unit_type_ToString(time_unit_type)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

_api__time_unit_type__e time_unit_type_time_unit_type_parseFromJSON(cJSON *time_unit_typeJSON) {
    _api__time_unit_type__e *time_unit_type = NULL;
    _api__time_unit_type__e time_unit_typeVariable;
    cJSON *time_unit_typeVar = cJSON_GetObjectItemCaseSensitive(time_unit_typeJSON, "time_unit_type");
    if(!cJSON_IsString(time_unit_typeVar) || (time_unit_typeVar->valuestring == NULL)){
        goto end;
    }
    time_unit_typeVariable = time_unit_type_time_unit_type_FromString(time_unit_typeVar->valuestring);
    return time_unit_typeVariable;
end:
    return 0;
}
