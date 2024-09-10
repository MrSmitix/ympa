#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "eac_verification_status_type.h"


char* eac_verification_status_type_eac_verification_status_type_ToString(_api__eac_verification_status_type__e eac_verification_status_type) {
    char *eac_verification_status_typeArray[] =  { "NULL", "ACCEPTED", "REJECTED", "NEED_UPDATE" };
    return eac_verification_status_typeArray[eac_verification_status_type];
}

_api__eac_verification_status_type__e eac_verification_status_type_eac_verification_status_type_FromString(char* eac_verification_status_type) {
    int stringToReturn = 0;
    char *eac_verification_status_typeArray[] =  { "NULL", "ACCEPTED", "REJECTED", "NEED_UPDATE" };
    size_t sizeofArray = sizeof(eac_verification_status_typeArray) / sizeof(eac_verification_status_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(eac_verification_status_type, eac_verification_status_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *eac_verification_status_type_eac_verification_status_type_convertToJSON(_api__eac_verification_status_type__e eac_verification_status_type) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "eac_verification_status_type", eac_verification_status_type_eac_verification_status_type_ToString(eac_verification_status_type)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

_api__eac_verification_status_type__e eac_verification_status_type_eac_verification_status_type_parseFromJSON(cJSON *eac_verification_status_typeJSON) {
    _api__eac_verification_status_type__e *eac_verification_status_type = NULL;
    _api__eac_verification_status_type__e eac_verification_status_typeVariable;
    cJSON *eac_verification_status_typeVar = cJSON_GetObjectItemCaseSensitive(eac_verification_status_typeJSON, "eac_verification_status_type");
    if(!cJSON_IsString(eac_verification_status_typeVar) || (eac_verification_status_typeVar->valuestring == NULL)){
        goto end;
    }
    eac_verification_status_typeVariable = eac_verification_status_type_eac_verification_status_type_FromString(eac_verification_status_typeVar->valuestring);
    return eac_verification_status_typeVariable;
end:
    return 0;
}
