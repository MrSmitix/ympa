#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "offer_condition_quality_type.h"


char* offer_condition_quality_type_offer_condition_quality_type_ToString(_api__offer_condition_quality_type__e offer_condition_quality_type) {
    char *offer_condition_quality_typeArray[] =  { "NULL", "PERFECT", "EXCELLENT", "GOOD", "NOT_SPECIFIED" };
    return offer_condition_quality_typeArray[offer_condition_quality_type];
}

_api__offer_condition_quality_type__e offer_condition_quality_type_offer_condition_quality_type_FromString(char* offer_condition_quality_type) {
    int stringToReturn = 0;
    char *offer_condition_quality_typeArray[] =  { "NULL", "PERFECT", "EXCELLENT", "GOOD", "NOT_SPECIFIED" };
    size_t sizeofArray = sizeof(offer_condition_quality_typeArray) / sizeof(offer_condition_quality_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(offer_condition_quality_type, offer_condition_quality_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *offer_condition_quality_type_offer_condition_quality_type_convertToJSON(_api__offer_condition_quality_type__e offer_condition_quality_type) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "offer_condition_quality_type", offer_condition_quality_type_offer_condition_quality_type_ToString(offer_condition_quality_type)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

_api__offer_condition_quality_type__e offer_condition_quality_type_offer_condition_quality_type_parseFromJSON(cJSON *offer_condition_quality_typeJSON) {
    _api__offer_condition_quality_type__e *offer_condition_quality_type = NULL;
    _api__offer_condition_quality_type__e offer_condition_quality_typeVariable;
    cJSON *offer_condition_quality_typeVar = cJSON_GetObjectItemCaseSensitive(offer_condition_quality_typeJSON, "offer_condition_quality_type");
    if(!cJSON_IsString(offer_condition_quality_typeVar) || (offer_condition_quality_typeVar->valuestring == NULL)){
        goto end;
    }
    offer_condition_quality_typeVariable = offer_condition_quality_type_offer_condition_quality_type_FromString(offer_condition_quality_typeVar->valuestring);
    return offer_condition_quality_typeVariable;
end:
    return 0;
}
