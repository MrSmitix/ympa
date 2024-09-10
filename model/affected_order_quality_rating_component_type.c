#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "affected_order_quality_rating_component_type.h"


char* affected_order_quality_rating_component_type_affected_order_quality_rating_component_type_ToString(_api__affected_order_quality_rating_component_type__e affected_order_quality_rating_component_type) {
    char *affected_order_quality_rating_component_typeArray[] =  { "NULL", "DBS_CANCELLATION_RATE", "DBS_LATE_DELIVERY_RATE", "FBS_CANCELLATION_RATE", "FBS_LATE_SHIP_RATE" };
    return affected_order_quality_rating_component_typeArray[affected_order_quality_rating_component_type];
}

_api__affected_order_quality_rating_component_type__e affected_order_quality_rating_component_type_affected_order_quality_rating_component_type_FromString(char* affected_order_quality_rating_component_type) {
    int stringToReturn = 0;
    char *affected_order_quality_rating_component_typeArray[] =  { "NULL", "DBS_CANCELLATION_RATE", "DBS_LATE_DELIVERY_RATE", "FBS_CANCELLATION_RATE", "FBS_LATE_SHIP_RATE" };
    size_t sizeofArray = sizeof(affected_order_quality_rating_component_typeArray) / sizeof(affected_order_quality_rating_component_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(affected_order_quality_rating_component_type, affected_order_quality_rating_component_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *affected_order_quality_rating_component_type_affected_order_quality_rating_component_type_convertToJSON(_api__affected_order_quality_rating_component_type__e affected_order_quality_rating_component_type) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "affected_order_quality_rating_component_type", affected_order_quality_rating_component_type_affected_order_quality_rating_component_type_ToString(affected_order_quality_rating_component_type)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

_api__affected_order_quality_rating_component_type__e affected_order_quality_rating_component_type_affected_order_quality_rating_component_type_parseFromJSON(cJSON *affected_order_quality_rating_component_typeJSON) {
    _api__affected_order_quality_rating_component_type__e *affected_order_quality_rating_component_type = NULL;
    _api__affected_order_quality_rating_component_type__e affected_order_quality_rating_component_typeVariable;
    cJSON *affected_order_quality_rating_component_typeVar = cJSON_GetObjectItemCaseSensitive(affected_order_quality_rating_component_typeJSON, "affected_order_quality_rating_component_type");
    if(!cJSON_IsString(affected_order_quality_rating_component_typeVar) || (affected_order_quality_rating_component_typeVar->valuestring == NULL)){
        goto end;
    }
    affected_order_quality_rating_component_typeVariable = affected_order_quality_rating_component_type_affected_order_quality_rating_component_type_FromString(affected_order_quality_rating_component_typeVar->valuestring);
    return affected_order_quality_rating_component_typeVariable;
end:
    return 0;
}
