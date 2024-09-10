#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "return_type.h"


char* return_type_return_type_ToString(_api__return_type__e return_type) {
    char *return_typeArray[] =  { "NULL", "UNREDEEMED", "RETURN" };
    return return_typeArray[return_type];
}

_api__return_type__e return_type_return_type_FromString(char* return_type) {
    int stringToReturn = 0;
    char *return_typeArray[] =  { "NULL", "UNREDEEMED", "RETURN" };
    size_t sizeofArray = sizeof(return_typeArray) / sizeof(return_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(return_type, return_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *return_type_return_type_convertToJSON(_api__return_type__e return_type) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "return_type", return_type_return_type_ToString(return_type)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

_api__return_type__e return_type_return_type_parseFromJSON(cJSON *return_typeJSON) {
    _api__return_type__e *return_type = NULL;
    _api__return_type__e return_typeVariable;
    cJSON *return_typeVar = cJSON_GetObjectItemCaseSensitive(return_typeJSON, "return_type");
    if(!cJSON_IsString(return_typeVar) || (return_typeVar->valuestring == NULL)){
        goto end;
    }
    return_typeVariable = return_type_return_type_FromString(return_typeVar->valuestring);
    return return_typeVariable;
end:
    return 0;
}
