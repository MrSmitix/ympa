#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "license_type.h"


char* license_type_license_type_ToString(_api__license_type__e license_type) {
    char *license_typeArray[] =  { "NULL", "ALCOHOL", "UNKNOWN" };
    return license_typeArray[license_type];
}

_api__license_type__e license_type_license_type_FromString(char* license_type) {
    int stringToReturn = 0;
    char *license_typeArray[] =  { "NULL", "ALCOHOL", "UNKNOWN" };
    size_t sizeofArray = sizeof(license_typeArray) / sizeof(license_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(license_type, license_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *license_type_license_type_convertToJSON(_api__license_type__e license_type) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "license_type", license_type_license_type_ToString(license_type)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

_api__license_type__e license_type_license_type_parseFromJSON(cJSON *license_typeJSON) {
    _api__license_type__e *license_type = NULL;
    _api__license_type__e license_typeVariable;
    cJSON *license_typeVar = cJSON_GetObjectItemCaseSensitive(license_typeJSON, "license_type");
    if(!cJSON_IsString(license_typeVar) || (license_typeVar->valuestring == NULL)){
        goto end;
    }
    license_typeVariable = license_type_license_type_FromString(license_typeVar->valuestring);
    return license_typeVariable;
end:
    return 0;
}
