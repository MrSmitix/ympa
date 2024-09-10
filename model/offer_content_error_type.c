#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "offer_content_error_type.h"


char* offer_content_error_type_offer_content_error_type_ToString(_api__offer_content_error_type__e offer_content_error_type) {
    char *offer_content_error_typeArray[] =  { "NULL", "OFFER_NOT_FOUND", "UNKNOWN_CATEGORY", "CATEGORY_MISMATCH", "UNKNOWN_PARAMETER", "UNEXPECTED_BOOLEAN_VALUE", "NUMBER_FORMAT", "VALUE_BLANK", "INVALID_UNIT_ID", "INVALID_GROUP_ID_LENGTH", "INVALID_GROUP_ID_CHARACTERS" };
    return offer_content_error_typeArray[offer_content_error_type];
}

_api__offer_content_error_type__e offer_content_error_type_offer_content_error_type_FromString(char* offer_content_error_type) {
    int stringToReturn = 0;
    char *offer_content_error_typeArray[] =  { "NULL", "OFFER_NOT_FOUND", "UNKNOWN_CATEGORY", "CATEGORY_MISMATCH", "UNKNOWN_PARAMETER", "UNEXPECTED_BOOLEAN_VALUE", "NUMBER_FORMAT", "VALUE_BLANK", "INVALID_UNIT_ID", "INVALID_GROUP_ID_LENGTH", "INVALID_GROUP_ID_CHARACTERS" };
    size_t sizeofArray = sizeof(offer_content_error_typeArray) / sizeof(offer_content_error_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(offer_content_error_type, offer_content_error_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *offer_content_error_type_offer_content_error_type_convertToJSON(_api__offer_content_error_type__e offer_content_error_type) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "offer_content_error_type", offer_content_error_type_offer_content_error_type_ToString(offer_content_error_type)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

_api__offer_content_error_type__e offer_content_error_type_offer_content_error_type_parseFromJSON(cJSON *offer_content_error_typeJSON) {
    _api__offer_content_error_type__e *offer_content_error_type = NULL;
    _api__offer_content_error_type__e offer_content_error_typeVariable;
    cJSON *offer_content_error_typeVar = cJSON_GetObjectItemCaseSensitive(offer_content_error_typeJSON, "offer_content_error_type");
    if(!cJSON_IsString(offer_content_error_typeVar) || (offer_content_error_typeVar->valuestring == NULL)){
        goto end;
    }
    offer_content_error_typeVariable = offer_content_error_type_offer_content_error_type_FromString(offer_content_error_typeVar->valuestring);
    return offer_content_error_typeVariable;
end:
    return 0;
}
