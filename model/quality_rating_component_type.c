#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "quality_rating_component_type.h"


char* quality_rating_component_type_quality_rating_component_type_ToString(_api__quality_rating_component_type__e quality_rating_component_type) {
    char *quality_rating_component_typeArray[] =  { "NULL", "DBS_CANCELLATION_RATE", "DBS_LATE_DELIVERY_RATE", "FBS_CANCELLATION_RATE", "FBS_LATE_SHIP_RATE", "FBY_LATE_DELIVERY_RATE", "FBY_CANCELLATION_RATE", "FBY_DELIVERY_DIFF_RATE", "FBY_LATE_EDITING_RATE" };
    return quality_rating_component_typeArray[quality_rating_component_type];
}

_api__quality_rating_component_type__e quality_rating_component_type_quality_rating_component_type_FromString(char* quality_rating_component_type) {
    int stringToReturn = 0;
    char *quality_rating_component_typeArray[] =  { "NULL", "DBS_CANCELLATION_RATE", "DBS_LATE_DELIVERY_RATE", "FBS_CANCELLATION_RATE", "FBS_LATE_SHIP_RATE", "FBY_LATE_DELIVERY_RATE", "FBY_CANCELLATION_RATE", "FBY_DELIVERY_DIFF_RATE", "FBY_LATE_EDITING_RATE" };
    size_t sizeofArray = sizeof(quality_rating_component_typeArray) / sizeof(quality_rating_component_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(quality_rating_component_type, quality_rating_component_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *quality_rating_component_type_quality_rating_component_type_convertToJSON(_api__quality_rating_component_type__e quality_rating_component_type) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "quality_rating_component_type", quality_rating_component_type_quality_rating_component_type_ToString(quality_rating_component_type)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

_api__quality_rating_component_type__e quality_rating_component_type_quality_rating_component_type_parseFromJSON(cJSON *quality_rating_component_typeJSON) {
    _api__quality_rating_component_type__e *quality_rating_component_type = NULL;
    _api__quality_rating_component_type__e quality_rating_component_typeVariable;
    cJSON *quality_rating_component_typeVar = cJSON_GetObjectItemCaseSensitive(quality_rating_component_typeJSON, "quality_rating_component_type");
    if(!cJSON_IsString(quality_rating_component_typeVar) || (quality_rating_component_typeVar->valuestring == NULL)){
        goto end;
    }
    quality_rating_component_typeVariable = quality_rating_component_type_quality_rating_component_type_FromString(quality_rating_component_typeVar->valuestring);
    return quality_rating_component_typeVariable;
end:
    return 0;
}
