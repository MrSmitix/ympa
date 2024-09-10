#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "category_error_type.h"


char* category_error_type_category_error_type_ToString(_api__category_error_type__e category_error_type) {
    char *category_error_typeArray[] =  { "NULL", "UNKNOWN_CATEGORY", "CATEGORY_IS_NOT_LEAF" };
    return category_error_typeArray[category_error_type];
}

_api__category_error_type__e category_error_type_category_error_type_FromString(char* category_error_type) {
    int stringToReturn = 0;
    char *category_error_typeArray[] =  { "NULL", "UNKNOWN_CATEGORY", "CATEGORY_IS_NOT_LEAF" };
    size_t sizeofArray = sizeof(category_error_typeArray) / sizeof(category_error_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(category_error_type, category_error_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *category_error_type_category_error_type_convertToJSON(_api__category_error_type__e category_error_type) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "category_error_type", category_error_type_category_error_type_ToString(category_error_type)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

_api__category_error_type__e category_error_type_category_error_type_parseFromJSON(cJSON *category_error_typeJSON) {
    _api__category_error_type__e *category_error_type = NULL;
    _api__category_error_type__e category_error_typeVariable;
    cJSON *category_error_typeVar = cJSON_GetObjectItemCaseSensitive(category_error_typeJSON, "category_error_type");
    if(!cJSON_IsString(category_error_typeVar) || (category_error_typeVar->valuestring == NULL)){
        goto end;
    }
    category_error_typeVariable = category_error_type_category_error_type_FromString(category_error_typeVar->valuestring);
    return category_error_typeVariable;
end:
    return 0;
}
