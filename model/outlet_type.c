#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "outlet_type.h"


char* outlet_type_outlet_type_ToString(_api__outlet_type__e outlet_type) {
    char *outlet_typeArray[] =  { "NULL", "DEPOT", "MIXED", "RETAIL", "NOT_DEFINED" };
    return outlet_typeArray[outlet_type];
}

_api__outlet_type__e outlet_type_outlet_type_FromString(char* outlet_type) {
    int stringToReturn = 0;
    char *outlet_typeArray[] =  { "NULL", "DEPOT", "MIXED", "RETAIL", "NOT_DEFINED" };
    size_t sizeofArray = sizeof(outlet_typeArray) / sizeof(outlet_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(outlet_type, outlet_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *outlet_type_outlet_type_convertToJSON(_api__outlet_type__e outlet_type) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "outlet_type", outlet_type_outlet_type_ToString(outlet_type)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

_api__outlet_type__e outlet_type_outlet_type_parseFromJSON(cJSON *outlet_typeJSON) {
    _api__outlet_type__e *outlet_type = NULL;
    _api__outlet_type__e outlet_typeVariable;
    cJSON *outlet_typeVar = cJSON_GetObjectItemCaseSensitive(outlet_typeJSON, "outlet_type");
    if(!cJSON_IsString(outlet_typeVar) || (outlet_typeVar->valuestring == NULL)){
        goto end;
    }
    outlet_typeVariable = outlet_type_outlet_type_FromString(outlet_typeVar->valuestring);
    return outlet_typeVariable;
end:
    return 0;
}
