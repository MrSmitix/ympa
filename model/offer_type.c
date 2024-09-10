#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "offer_type.h"


char* offer_type_offer_type_ToString(_api__offer_type__e offer_type) {
    char *offer_typeArray[] =  { "NULL", "DEFAULT", "MEDICINE", "BOOK", "AUDIOBOOK", "ARTIST_TITLE", "ON_DEMAND" };
    return offer_typeArray[offer_type];
}

_api__offer_type__e offer_type_offer_type_FromString(char* offer_type) {
    int stringToReturn = 0;
    char *offer_typeArray[] =  { "NULL", "DEFAULT", "MEDICINE", "BOOK", "AUDIOBOOK", "ARTIST_TITLE", "ON_DEMAND" };
    size_t sizeofArray = sizeof(offer_typeArray) / sizeof(offer_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(offer_type, offer_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *offer_type_offer_type_convertToJSON(_api__offer_type__e offer_type) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "offer_type", offer_type_offer_type_ToString(offer_type)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

_api__offer_type__e offer_type_offer_type_parseFromJSON(cJSON *offer_typeJSON) {
    _api__offer_type__e *offer_type = NULL;
    _api__offer_type__e offer_typeVariable;
    cJSON *offer_typeVar = cJSON_GetObjectItemCaseSensitive(offer_typeJSON, "offer_type");
    if(!cJSON_IsString(offer_typeVar) || (offer_typeVar->valuestring == NULL)){
        goto end;
    }
    offer_typeVariable = offer_type_offer_type_FromString(offer_typeVar->valuestring);
    return offer_typeVariable;
end:
    return 0;
}
