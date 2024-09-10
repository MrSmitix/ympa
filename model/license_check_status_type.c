#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "license_check_status_type.h"


char* license_check_status_type_license_check_status_type_ToString(_api__license_check_status_type__e license_check_status_type) {
    char *license_check_status_typeArray[] =  { "NULL", "NEW", "SUCCESS", "FAIL", "REVOKE", "DONT_WANT", "FAIL_MANUAL" };
    return license_check_status_typeArray[license_check_status_type];
}

_api__license_check_status_type__e license_check_status_type_license_check_status_type_FromString(char* license_check_status_type) {
    int stringToReturn = 0;
    char *license_check_status_typeArray[] =  { "NULL", "NEW", "SUCCESS", "FAIL", "REVOKE", "DONT_WANT", "FAIL_MANUAL" };
    size_t sizeofArray = sizeof(license_check_status_typeArray) / sizeof(license_check_status_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(license_check_status_type, license_check_status_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *license_check_status_type_license_check_status_type_convertToJSON(_api__license_check_status_type__e license_check_status_type) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "license_check_status_type", license_check_status_type_license_check_status_type_ToString(license_check_status_type)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

_api__license_check_status_type__e license_check_status_type_license_check_status_type_parseFromJSON(cJSON *license_check_status_typeJSON) {
    _api__license_check_status_type__e *license_check_status_type = NULL;
    _api__license_check_status_type__e license_check_status_typeVariable;
    cJSON *license_check_status_typeVar = cJSON_GetObjectItemCaseSensitive(license_check_status_typeJSON, "license_check_status_type");
    if(!cJSON_IsString(license_check_status_typeVar) || (license_check_status_typeVar->valuestring == NULL)){
        goto end;
    }
    license_check_status_typeVariable = license_check_status_type_license_check_status_type_FromString(license_check_status_typeVar->valuestring);
    return license_check_status_typeVariable;
end:
    return 0;
}
