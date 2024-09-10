#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "day_of_week_type.h"


char* day_of_week_type_day_of_week_type_ToString(_api__day_of_week_type__e day_of_week_type) {
    char *day_of_week_typeArray[] =  { "NULL", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY", "SUNDAY" };
    return day_of_week_typeArray[day_of_week_type];
}

_api__day_of_week_type__e day_of_week_type_day_of_week_type_FromString(char* day_of_week_type) {
    int stringToReturn = 0;
    char *day_of_week_typeArray[] =  { "NULL", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY", "SUNDAY" };
    size_t sizeofArray = sizeof(day_of_week_typeArray) / sizeof(day_of_week_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(day_of_week_type, day_of_week_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *day_of_week_type_day_of_week_type_convertToJSON(_api__day_of_week_type__e day_of_week_type) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "day_of_week_type", day_of_week_type_day_of_week_type_ToString(day_of_week_type)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

_api__day_of_week_type__e day_of_week_type_day_of_week_type_parseFromJSON(cJSON *day_of_week_typeJSON) {
    _api__day_of_week_type__e *day_of_week_type = NULL;
    _api__day_of_week_type__e day_of_week_typeVariable;
    cJSON *day_of_week_typeVar = cJSON_GetObjectItemCaseSensitive(day_of_week_typeJSON, "day_of_week_type");
    if(!cJSON_IsString(day_of_week_typeVar) || (day_of_week_typeVar->valuestring == NULL)){
        goto end;
    }
    day_of_week_typeVariable = day_of_week_type_day_of_week_type_FromString(day_of_week_typeVar->valuestring);
    return day_of_week_typeVariable;
end:
    return 0;
}
