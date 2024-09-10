#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "offer_card_recommendation_type.h"


char* offer_card_recommendation_type_offer_card_recommendation_type_ToString(_api__offer_card_recommendation_type__e offer_card_recommendation_type) {
    char *offer_card_recommendation_typeArray[] =  { "NULL", "HAS_VIDEO", "RECOGNIZED_VENDOR", "MAIN", "ADDITIONAL", "DISTINCTIVE", "FILTERABLE", "PICTURE_COUNT", "HAS_DESCRIPTION", "HAS_BARCODE", "FIRST_PICTURE_SIZE", "TITLE_LENGTH", "DESCRIPTION_LENGTH", "AVERAGE_PICTURE_SIZE", "FIRST_VIDEO_SIZE", "FIRST_VIDEO_LENGTH", "AVERAGE_VIDEO_SIZE", "VIDEO_COUNT" };
    return offer_card_recommendation_typeArray[offer_card_recommendation_type];
}

_api__offer_card_recommendation_type__e offer_card_recommendation_type_offer_card_recommendation_type_FromString(char* offer_card_recommendation_type) {
    int stringToReturn = 0;
    char *offer_card_recommendation_typeArray[] =  { "NULL", "HAS_VIDEO", "RECOGNIZED_VENDOR", "MAIN", "ADDITIONAL", "DISTINCTIVE", "FILTERABLE", "PICTURE_COUNT", "HAS_DESCRIPTION", "HAS_BARCODE", "FIRST_PICTURE_SIZE", "TITLE_LENGTH", "DESCRIPTION_LENGTH", "AVERAGE_PICTURE_SIZE", "FIRST_VIDEO_SIZE", "FIRST_VIDEO_LENGTH", "AVERAGE_VIDEO_SIZE", "VIDEO_COUNT" };
    size_t sizeofArray = sizeof(offer_card_recommendation_typeArray) / sizeof(offer_card_recommendation_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(offer_card_recommendation_type, offer_card_recommendation_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *offer_card_recommendation_type_offer_card_recommendation_type_convertToJSON(_api__offer_card_recommendation_type__e offer_card_recommendation_type) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "offer_card_recommendation_type", offer_card_recommendation_type_offer_card_recommendation_type_ToString(offer_card_recommendation_type)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

_api__offer_card_recommendation_type__e offer_card_recommendation_type_offer_card_recommendation_type_parseFromJSON(cJSON *offer_card_recommendation_typeJSON) {
    _api__offer_card_recommendation_type__e *offer_card_recommendation_type = NULL;
    _api__offer_card_recommendation_type__e offer_card_recommendation_typeVariable;
    cJSON *offer_card_recommendation_typeVar = cJSON_GetObjectItemCaseSensitive(offer_card_recommendation_typeJSON, "offer_card_recommendation_type");
    if(!cJSON_IsString(offer_card_recommendation_typeVar) || (offer_card_recommendation_typeVar->valuestring == NULL)){
        goto end;
    }
    offer_card_recommendation_typeVariable = offer_card_recommendation_type_offer_card_recommendation_type_FromString(offer_card_recommendation_typeVar->valuestring);
    return offer_card_recommendation_typeVariable;
end:
    return 0;
}
