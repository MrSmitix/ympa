#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "offer_card_status_type.h"


char* offer_card_status_type_offer_card_status_type_ToString(_api__offer_card_status_type__e offer_card_status_type) {
    char *offer_card_status_typeArray[] =  { "NULL", "HAS_CARD_CAN_NOT_UPDATE", "HAS_CARD_CAN_UPDATE", "HAS_CARD_CAN_UPDATE_ERRORS", "HAS_CARD_CAN_UPDATE_PROCESSING", "NO_CARD_NEED_CONTENT", "NO_CARD_MARKET_WILL_CREATE", "NO_CARD_ERRORS", "NO_CARD_PROCESSING", "NO_CARD_ADD_TO_CAMPAIGN" };
    return offer_card_status_typeArray[offer_card_status_type];
}

_api__offer_card_status_type__e offer_card_status_type_offer_card_status_type_FromString(char* offer_card_status_type) {
    int stringToReturn = 0;
    char *offer_card_status_typeArray[] =  { "NULL", "HAS_CARD_CAN_NOT_UPDATE", "HAS_CARD_CAN_UPDATE", "HAS_CARD_CAN_UPDATE_ERRORS", "HAS_CARD_CAN_UPDATE_PROCESSING", "NO_CARD_NEED_CONTENT", "NO_CARD_MARKET_WILL_CREATE", "NO_CARD_ERRORS", "NO_CARD_PROCESSING", "NO_CARD_ADD_TO_CAMPAIGN" };
    size_t sizeofArray = sizeof(offer_card_status_typeArray) / sizeof(offer_card_status_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(offer_card_status_type, offer_card_status_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *offer_card_status_type_offer_card_status_type_convertToJSON(_api__offer_card_status_type__e offer_card_status_type) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "offer_card_status_type", offer_card_status_type_offer_card_status_type_ToString(offer_card_status_type)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

_api__offer_card_status_type__e offer_card_status_type_offer_card_status_type_parseFromJSON(cJSON *offer_card_status_typeJSON) {
    _api__offer_card_status_type__e *offer_card_status_type = NULL;
    _api__offer_card_status_type__e offer_card_status_typeVariable;
    cJSON *offer_card_status_typeVar = cJSON_GetObjectItemCaseSensitive(offer_card_status_typeJSON, "offer_card_status_type");
    if(!cJSON_IsString(offer_card_status_typeVar) || (offer_card_status_typeVar->valuestring == NULL)){
        goto end;
    }
    offer_card_status_typeVariable = offer_card_status_type_offer_card_status_type_FromString(offer_card_status_typeVar->valuestring);
    return offer_card_status_typeVariable;
end:
    return 0;
}
