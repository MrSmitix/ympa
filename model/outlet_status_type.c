#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "outlet_status_type.h"


char* outlet_status_type_outlet_status_type_ToString(_api__outlet_status_type__e outlet_status_type) {
    char *outlet_status_typeArray[] =  { "NULL", "AT_MODERATION", "FAILED", "MODERATED", "NONMODERATED", "UNKNOWN" };
    return outlet_status_typeArray[outlet_status_type];
}

_api__outlet_status_type__e outlet_status_type_outlet_status_type_FromString(char* outlet_status_type) {
    int stringToReturn = 0;
    char *outlet_status_typeArray[] =  { "NULL", "AT_MODERATION", "FAILED", "MODERATED", "NONMODERATED", "UNKNOWN" };
    size_t sizeofArray = sizeof(outlet_status_typeArray) / sizeof(outlet_status_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(outlet_status_type, outlet_status_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *outlet_status_type_outlet_status_type_convertToJSON(_api__outlet_status_type__e outlet_status_type) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "outlet_status_type", outlet_status_type_outlet_status_type_ToString(outlet_status_type)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

_api__outlet_status_type__e outlet_status_type_outlet_status_type_parseFromJSON(cJSON *outlet_status_typeJSON) {
    _api__outlet_status_type__e *outlet_status_type = NULL;
    _api__outlet_status_type__e outlet_status_typeVariable;
    cJSON *outlet_status_typeVar = cJSON_GetObjectItemCaseSensitive(outlet_status_typeJSON, "outlet_status_type");
    if(!cJSON_IsString(outlet_status_typeVar) || (outlet_status_typeVar->valuestring == NULL)){
        goto end;
    }
    outlet_status_typeVariable = outlet_status_type_outlet_status_type_FromString(outlet_status_typeVar->valuestring);
    return outlet_status_typeVariable;
end:
    return 0;
}
