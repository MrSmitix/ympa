#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "parameter_type.h"


char* parameter_type_parameter_type_ToString(_api__parameter_type__e parameter_type) {
    char *parameter_typeArray[] =  { "NULL", "TEXT", "ENUM", "BOOLEAN", "NUMERIC" };
    return parameter_typeArray[parameter_type];
}

_api__parameter_type__e parameter_type_parameter_type_FromString(char* parameter_type) {
    int stringToReturn = 0;
    char *parameter_typeArray[] =  { "NULL", "TEXT", "ENUM", "BOOLEAN", "NUMERIC" };
    size_t sizeofArray = sizeof(parameter_typeArray) / sizeof(parameter_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(parameter_type, parameter_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *parameter_type_parameter_type_convertToJSON(_api__parameter_type__e parameter_type) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "parameter_type", parameter_type_parameter_type_ToString(parameter_type)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

_api__parameter_type__e parameter_type_parameter_type_parseFromJSON(cJSON *parameter_typeJSON) {
    _api__parameter_type__e *parameter_type = NULL;
    _api__parameter_type__e parameter_typeVariable;
    cJSON *parameter_typeVar = cJSON_GetObjectItemCaseSensitive(parameter_typeJSON, "parameter_type");
    if(!cJSON_IsString(parameter_typeVar) || (parameter_typeVar->valuestring == NULL)){
        goto end;
    }
    parameter_typeVariable = parameter_type_parameter_type_FromString(parameter_typeVar->valuestring);
    return parameter_typeVariable;
end:
    return 0;
}
