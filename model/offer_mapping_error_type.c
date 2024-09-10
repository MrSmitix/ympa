#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "offer_mapping_error_type.h"


char* offer_mapping_error_type_offer_mapping_error_type_ToString(_api__offer_mapping_error_type__e offer_mapping_error_type) {
    char *offer_mapping_error_typeArray[] =  { "NULL", "UNKNOWN_CATEGORY", "CATEGORY_MISMATCH", "EMPTY_MARKET_CATEGORY", "UNKNOWN_PARAMETER", "UNEXPECTED_BOOLEAN_VALUE", "NUMBER_FORMAT", "VALUE_BLANK", "INVALID_UNIT_ID", "INVALID_GROUP_ID_LENGTH", "INVALID_GROUP_ID_CHARACTERS", "INVALID_PICKER_URL" };
    return offer_mapping_error_typeArray[offer_mapping_error_type];
}

_api__offer_mapping_error_type__e offer_mapping_error_type_offer_mapping_error_type_FromString(char* offer_mapping_error_type) {
    int stringToReturn = 0;
    char *offer_mapping_error_typeArray[] =  { "NULL", "UNKNOWN_CATEGORY", "CATEGORY_MISMATCH", "EMPTY_MARKET_CATEGORY", "UNKNOWN_PARAMETER", "UNEXPECTED_BOOLEAN_VALUE", "NUMBER_FORMAT", "VALUE_BLANK", "INVALID_UNIT_ID", "INVALID_GROUP_ID_LENGTH", "INVALID_GROUP_ID_CHARACTERS", "INVALID_PICKER_URL" };
    size_t sizeofArray = sizeof(offer_mapping_error_typeArray) / sizeof(offer_mapping_error_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(offer_mapping_error_type, offer_mapping_error_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *offer_mapping_error_type_offer_mapping_error_type_convertToJSON(_api__offer_mapping_error_type__e offer_mapping_error_type) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "offer_mapping_error_type", offer_mapping_error_type_offer_mapping_error_type_ToString(offer_mapping_error_type)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

_api__offer_mapping_error_type__e offer_mapping_error_type_offer_mapping_error_type_parseFromJSON(cJSON *offer_mapping_error_typeJSON) {
    _api__offer_mapping_error_type__e *offer_mapping_error_type = NULL;
    _api__offer_mapping_error_type__e offer_mapping_error_typeVariable;
    cJSON *offer_mapping_error_typeVar = cJSON_GetObjectItemCaseSensitive(offer_mapping_error_typeJSON, "offer_mapping_error_type");
    if(!cJSON_IsString(offer_mapping_error_typeVar) || (offer_mapping_error_typeVar->valuestring == NULL)){
        goto end;
    }
    offer_mapping_error_typeVariable = offer_mapping_error_type_offer_mapping_error_type_FromString(offer_mapping_error_typeVar->valuestring);
    return offer_mapping_error_typeVariable;
end:
    return 0;
}
