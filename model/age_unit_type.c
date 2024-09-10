#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "age_unit_type.h"


char* age_unit_type_age_unit_type_ToString(_api__age_unit_type__e age_unit_type) {
    char *age_unit_typeArray[] =  { "NULL", "YEAR", "MONTH" };
    return age_unit_typeArray[age_unit_type];
}

_api__age_unit_type__e age_unit_type_age_unit_type_FromString(char* age_unit_type) {
    int stringToReturn = 0;
    char *age_unit_typeArray[] =  { "NULL", "YEAR", "MONTH" };
    size_t sizeofArray = sizeof(age_unit_typeArray) / sizeof(age_unit_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(age_unit_type, age_unit_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *age_unit_type_age_unit_type_convertToJSON(_api__age_unit_type__e age_unit_type) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "age_unit_type", age_unit_type_age_unit_type_ToString(age_unit_type)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

_api__age_unit_type__e age_unit_type_age_unit_type_parseFromJSON(cJSON *age_unit_typeJSON) {
    _api__age_unit_type__e *age_unit_type = NULL;
    _api__age_unit_type__e age_unit_typeVariable;
    cJSON *age_unit_typeVar = cJSON_GetObjectItemCaseSensitive(age_unit_typeJSON, "age_unit_type");
    if(!cJSON_IsString(age_unit_typeVar) || (age_unit_typeVar->valuestring == NULL)){
        goto end;
    }
    age_unit_typeVariable = age_unit_type_age_unit_type_FromString(age_unit_typeVar->valuestring);
    return age_unit_typeVariable;
end:
    return 0;
}
