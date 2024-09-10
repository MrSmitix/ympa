#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "offer_processing_note_type.h"


char* offer_processing_note_type_offer_processing_note_type_ToString(_api__offer_processing_note_type__e offer_processing_note_type) {
    char *offer_processing_note_typeArray[] =  { "NULL", "ASSORTMENT", "CANCELLED", "CONFLICTING_INFORMATION", "OTHER", "DEPARTMENT_FROZEN", "INCORRECT_INFORMATION", "LEGAL_CONFLICT", "NEED_CLASSIFICATION_INFORMATION", "NEED_INFORMATION", "NEED_PICTURES", "NEED_VENDOR", "NO_CATEGORY", "NO_KNOWLEDGE", "NO_PARAMETERS_IN_SHOP_TITLE", "NO_SIZE_MEASURE", "SAMPLE_LINE" };
    return offer_processing_note_typeArray[offer_processing_note_type];
}

_api__offer_processing_note_type__e offer_processing_note_type_offer_processing_note_type_FromString(char* offer_processing_note_type) {
    int stringToReturn = 0;
    char *offer_processing_note_typeArray[] =  { "NULL", "ASSORTMENT", "CANCELLED", "CONFLICTING_INFORMATION", "OTHER", "DEPARTMENT_FROZEN", "INCORRECT_INFORMATION", "LEGAL_CONFLICT", "NEED_CLASSIFICATION_INFORMATION", "NEED_INFORMATION", "NEED_PICTURES", "NEED_VENDOR", "NO_CATEGORY", "NO_KNOWLEDGE", "NO_PARAMETERS_IN_SHOP_TITLE", "NO_SIZE_MEASURE", "SAMPLE_LINE" };
    size_t sizeofArray = sizeof(offer_processing_note_typeArray) / sizeof(offer_processing_note_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(offer_processing_note_type, offer_processing_note_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *offer_processing_note_type_offer_processing_note_type_convertToJSON(_api__offer_processing_note_type__e offer_processing_note_type) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "offer_processing_note_type", offer_processing_note_type_offer_processing_note_type_ToString(offer_processing_note_type)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

_api__offer_processing_note_type__e offer_processing_note_type_offer_processing_note_type_parseFromJSON(cJSON *offer_processing_note_typeJSON) {
    _api__offer_processing_note_type__e *offer_processing_note_type = NULL;
    _api__offer_processing_note_type__e offer_processing_note_typeVariable;
    cJSON *offer_processing_note_typeVar = cJSON_GetObjectItemCaseSensitive(offer_processing_note_typeJSON, "offer_processing_note_type");
    if(!cJSON_IsString(offer_processing_note_typeVar) || (offer_processing_note_typeVar->valuestring == NULL)){
        goto end;
    }
    offer_processing_note_typeVariable = offer_processing_note_type_offer_processing_note_type_FromString(offer_processing_note_typeVar->valuestring);
    return offer_processing_note_typeVariable;
end:
    return 0;
}
