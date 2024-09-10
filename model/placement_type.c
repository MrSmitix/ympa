#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "placement_type.h"


char* placement_type_placement_type_ToString(_api__placement_type__e placement_type) {
    char *placement_typeArray[] =  { "NULL", "FBS", "FBY", "DBS" };
    return placement_typeArray[placement_type];
}

_api__placement_type__e placement_type_placement_type_FromString(char* placement_type) {
    int stringToReturn = 0;
    char *placement_typeArray[] =  { "NULL", "FBS", "FBY", "DBS" };
    size_t sizeofArray = sizeof(placement_typeArray) / sizeof(placement_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(placement_type, placement_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *placement_type_placement_type_convertToJSON(_api__placement_type__e placement_type) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "placement_type", placement_type_placement_type_ToString(placement_type)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

_api__placement_type__e placement_type_placement_type_parseFromJSON(cJSON *placement_typeJSON) {
    _api__placement_type__e *placement_type = NULL;
    _api__placement_type__e placement_typeVariable;
    cJSON *placement_typeVar = cJSON_GetObjectItemCaseSensitive(placement_typeJSON, "placement_type");
    if(!cJSON_IsString(placement_typeVar) || (placement_typeVar->valuestring == NULL)){
        goto end;
    }
    placement_typeVariable = placement_type_placement_type_FromString(placement_typeVar->valuestring);
    return placement_typeVariable;
end:
    return 0;
}
