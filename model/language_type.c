#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "language_type.h"


char* language_type_language_type_ToString(_api__language_type__e language_type) {
    char *language_typeArray[] =  { "NULL", "RU", "EN" };
    return language_typeArray[language_type];
}

_api__language_type__e language_type_language_type_FromString(char* language_type) {
    int stringToReturn = 0;
    char *language_typeArray[] =  { "NULL", "RU", "EN" };
    size_t sizeofArray = sizeof(language_typeArray) / sizeof(language_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(language_type, language_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *language_type_language_type_convertToJSON(_api__language_type__e language_type) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "language_type", language_type_language_type_ToString(language_type)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

_api__language_type__e language_type_language_type_parseFromJSON(cJSON *language_typeJSON) {
    _api__language_type__e *language_type = NULL;
    _api__language_type__e language_typeVariable;
    cJSON *language_typeVar = cJSON_GetObjectItemCaseSensitive(language_typeJSON, "language_type");
    if(!cJSON_IsString(language_typeVar) || (language_typeVar->valuestring == NULL)){
        goto end;
    }
    language_typeVariable = language_type_language_type_FromString(language_typeVar->valuestring);
    return language_typeVariable;
end:
    return 0;
}
