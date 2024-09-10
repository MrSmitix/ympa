#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "outlet_visibility_type.h"


char* outlet_visibility_type_outlet_visibility_type_ToString(_api__outlet_visibility_type__e outlet_visibility_type) {
    char *outlet_visibility_typeArray[] =  { "NULL", "HIDDEN", "VISIBLE", "UNKNOWN" };
    return outlet_visibility_typeArray[outlet_visibility_type];
}

_api__outlet_visibility_type__e outlet_visibility_type_outlet_visibility_type_FromString(char* outlet_visibility_type) {
    int stringToReturn = 0;
    char *outlet_visibility_typeArray[] =  { "NULL", "HIDDEN", "VISIBLE", "UNKNOWN" };
    size_t sizeofArray = sizeof(outlet_visibility_typeArray) / sizeof(outlet_visibility_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(outlet_visibility_type, outlet_visibility_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *outlet_visibility_type_outlet_visibility_type_convertToJSON(_api__outlet_visibility_type__e outlet_visibility_type) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "outlet_visibility_type", outlet_visibility_type_outlet_visibility_type_ToString(outlet_visibility_type)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

_api__outlet_visibility_type__e outlet_visibility_type_outlet_visibility_type_parseFromJSON(cJSON *outlet_visibility_typeJSON) {
    _api__outlet_visibility_type__e *outlet_visibility_type = NULL;
    _api__outlet_visibility_type__e outlet_visibility_typeVariable;
    cJSON *outlet_visibility_typeVar = cJSON_GetObjectItemCaseSensitive(outlet_visibility_typeJSON, "outlet_visibility_type");
    if(!cJSON_IsString(outlet_visibility_typeVar) || (outlet_visibility_typeVar->valuestring == NULL)){
        goto end;
    }
    outlet_visibility_typeVariable = outlet_visibility_type_outlet_visibility_type_FromString(outlet_visibility_typeVar->valuestring);
    return outlet_visibility_typeVariable;
end:
    return 0;
}
