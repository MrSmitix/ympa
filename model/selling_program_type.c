#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "selling_program_type.h"


char* selling_program_type_selling_program_type_ToString(_api__selling_program_type__e selling_program_type) {
    char *selling_program_typeArray[] =  { "NULL", "FBY", "FBS", "DBS", "EXPRESS" };
    return selling_program_typeArray[selling_program_type];
}

_api__selling_program_type__e selling_program_type_selling_program_type_FromString(char* selling_program_type) {
    int stringToReturn = 0;
    char *selling_program_typeArray[] =  { "NULL", "FBY", "FBS", "DBS", "EXPRESS" };
    size_t sizeofArray = sizeof(selling_program_typeArray) / sizeof(selling_program_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(selling_program_type, selling_program_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *selling_program_type_selling_program_type_convertToJSON(_api__selling_program_type__e selling_program_type) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "selling_program_type", selling_program_type_selling_program_type_ToString(selling_program_type)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

_api__selling_program_type__e selling_program_type_selling_program_type_parseFromJSON(cJSON *selling_program_typeJSON) {
    _api__selling_program_type__e *selling_program_type = NULL;
    _api__selling_program_type__e selling_program_typeVariable;
    cJSON *selling_program_typeVar = cJSON_GetObjectItemCaseSensitive(selling_program_typeJSON, "selling_program_type");
    if(!cJSON_IsString(selling_program_typeVar) || (selling_program_typeVar->valuestring == NULL)){
        goto end;
    }
    selling_program_typeVariable = selling_program_type_selling_program_type_FromString(selling_program_typeVar->valuestring);
    return selling_program_typeVariable;
end:
    return 0;
}
