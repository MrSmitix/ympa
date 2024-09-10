#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "api_response_status_type.h"


char* api_response_status_type_api_response_status_type_ToString(_api__api_response_status_type__e api_response_status_type) {
    char *api_response_status_typeArray[] =  { "NULL", "OK", "ERROR" };
    return api_response_status_typeArray[api_response_status_type];
}

_api__api_response_status_type__e api_response_status_type_api_response_status_type_FromString(char* api_response_status_type) {
    int stringToReturn = 0;
    char *api_response_status_typeArray[] =  { "NULL", "OK", "ERROR" };
    size_t sizeofArray = sizeof(api_response_status_typeArray) / sizeof(api_response_status_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(api_response_status_type, api_response_status_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *api_response_status_type_api_response_status_type_convertToJSON(_api__api_response_status_type__e api_response_status_type) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "api_response_status_type", api_response_status_type_api_response_status_type_ToString(api_response_status_type)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

_api__api_response_status_type__e api_response_status_type_api_response_status_type_parseFromJSON(cJSON *api_response_status_typeJSON) {
    _api__api_response_status_type__e *api_response_status_type = NULL;
    _api__api_response_status_type__e api_response_status_typeVariable;
    cJSON *api_response_status_typeVar = cJSON_GetObjectItemCaseSensitive(api_response_status_typeJSON, "api_response_status_type");
    if(!cJSON_IsString(api_response_status_typeVar) || (api_response_status_typeVar->valuestring == NULL)){
        goto end;
    }
    api_response_status_typeVariable = api_response_status_type_api_response_status_type_FromString(api_response_status_typeVar->valuestring);
    return api_response_status_typeVariable;
end:
    return 0;
}
