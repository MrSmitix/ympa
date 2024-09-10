#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "shelfs_statistics_attribution_type.h"


char* shelfs_statistics_attribution_type_shelfs_statistics_attribution_type_ToString(_api__shelfs_statistics_attribution_type__e shelfs_statistics_attribution_type) {
    char *shelfs_statistics_attribution_typeArray[] =  { "NULL", "CLICKS", "SHOWS" };
    return shelfs_statistics_attribution_typeArray[shelfs_statistics_attribution_type];
}

_api__shelfs_statistics_attribution_type__e shelfs_statistics_attribution_type_shelfs_statistics_attribution_type_FromString(char* shelfs_statistics_attribution_type) {
    int stringToReturn = 0;
    char *shelfs_statistics_attribution_typeArray[] =  { "NULL", "CLICKS", "SHOWS" };
    size_t sizeofArray = sizeof(shelfs_statistics_attribution_typeArray) / sizeof(shelfs_statistics_attribution_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(shelfs_statistics_attribution_type, shelfs_statistics_attribution_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *shelfs_statistics_attribution_type_shelfs_statistics_attribution_type_convertToJSON(_api__shelfs_statistics_attribution_type__e shelfs_statistics_attribution_type) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "shelfs_statistics_attribution_type", shelfs_statistics_attribution_type_shelfs_statistics_attribution_type_ToString(shelfs_statistics_attribution_type)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

_api__shelfs_statistics_attribution_type__e shelfs_statistics_attribution_type_shelfs_statistics_attribution_type_parseFromJSON(cJSON *shelfs_statistics_attribution_typeJSON) {
    _api__shelfs_statistics_attribution_type__e *shelfs_statistics_attribution_type = NULL;
    _api__shelfs_statistics_attribution_type__e shelfs_statistics_attribution_typeVariable;
    cJSON *shelfs_statistics_attribution_typeVar = cJSON_GetObjectItemCaseSensitive(shelfs_statistics_attribution_typeJSON, "shelfs_statistics_attribution_type");
    if(!cJSON_IsString(shelfs_statistics_attribution_typeVar) || (shelfs_statistics_attribution_typeVar->valuestring == NULL)){
        goto end;
    }
    shelfs_statistics_attribution_typeVariable = shelfs_statistics_attribution_type_shelfs_statistics_attribution_type_FromString(shelfs_statistics_attribution_typeVar->valuestring);
    return shelfs_statistics_attribution_typeVariable;
end:
    return 0;
}
