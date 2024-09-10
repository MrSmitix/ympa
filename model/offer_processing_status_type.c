#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "offer_processing_status_type.h"


char* offer_processing_status_type_offer_processing_status_type_ToString(_api__offer_processing_status_type__e offer_processing_status_type) {
    char *offer_processing_status_typeArray[] =  { "NULL", "UNKNOWN", "READY", "IN_WORK", "NEED_INFO", "NEED_MAPPING", "NEED_CONTENT", "CONTENT_PROCESSING", "SUSPENDED", "REJECTED", "REVIEW", "CREATE_ERROR", "UPDATE_ERROR" };
    return offer_processing_status_typeArray[offer_processing_status_type];
}

_api__offer_processing_status_type__e offer_processing_status_type_offer_processing_status_type_FromString(char* offer_processing_status_type) {
    int stringToReturn = 0;
    char *offer_processing_status_typeArray[] =  { "NULL", "UNKNOWN", "READY", "IN_WORK", "NEED_INFO", "NEED_MAPPING", "NEED_CONTENT", "CONTENT_PROCESSING", "SUSPENDED", "REJECTED", "REVIEW", "CREATE_ERROR", "UPDATE_ERROR" };
    size_t sizeofArray = sizeof(offer_processing_status_typeArray) / sizeof(offer_processing_status_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(offer_processing_status_type, offer_processing_status_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *offer_processing_status_type_offer_processing_status_type_convertToJSON(_api__offer_processing_status_type__e offer_processing_status_type) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "offer_processing_status_type", offer_processing_status_type_offer_processing_status_type_ToString(offer_processing_status_type)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

_api__offer_processing_status_type__e offer_processing_status_type_offer_processing_status_type_parseFromJSON(cJSON *offer_processing_status_typeJSON) {
    _api__offer_processing_status_type__e *offer_processing_status_type = NULL;
    _api__offer_processing_status_type__e offer_processing_status_typeVariable;
    cJSON *offer_processing_status_typeVar = cJSON_GetObjectItemCaseSensitive(offer_processing_status_typeJSON, "offer_processing_status_type");
    if(!cJSON_IsString(offer_processing_status_typeVar) || (offer_processing_status_typeVar->valuestring == NULL)){
        goto end;
    }
    offer_processing_status_typeVariable = offer_processing_status_type_offer_processing_status_type_FromString(offer_processing_status_typeVar->valuestring);
    return offer_processing_status_typeVariable;
end:
    return 0;
}
