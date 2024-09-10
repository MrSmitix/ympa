#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "promo_offer_participation_status_type.h"


char* promo_offer_participation_status_type_promo_offer_participation_status_type_ToString(_api__promo_offer_participation_status_type__e promo_offer_participation_status_type) {
    char *promo_offer_participation_status_typeArray[] =  { "NULL", "AUTO", "PARTIALLY_AUTO", "MANUAL", "NOT_PARTICIPATING" };
    return promo_offer_participation_status_typeArray[promo_offer_participation_status_type];
}

_api__promo_offer_participation_status_type__e promo_offer_participation_status_type_promo_offer_participation_status_type_FromString(char* promo_offer_participation_status_type) {
    int stringToReturn = 0;
    char *promo_offer_participation_status_typeArray[] =  { "NULL", "AUTO", "PARTIALLY_AUTO", "MANUAL", "NOT_PARTICIPATING" };
    size_t sizeofArray = sizeof(promo_offer_participation_status_typeArray) / sizeof(promo_offer_participation_status_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(promo_offer_participation_status_type, promo_offer_participation_status_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *promo_offer_participation_status_type_promo_offer_participation_status_type_convertToJSON(_api__promo_offer_participation_status_type__e promo_offer_participation_status_type) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "promo_offer_participation_status_type", promo_offer_participation_status_type_promo_offer_participation_status_type_ToString(promo_offer_participation_status_type)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

_api__promo_offer_participation_status_type__e promo_offer_participation_status_type_promo_offer_participation_status_type_parseFromJSON(cJSON *promo_offer_participation_status_typeJSON) {
    _api__promo_offer_participation_status_type__e *promo_offer_participation_status_type = NULL;
    _api__promo_offer_participation_status_type__e promo_offer_participation_status_typeVariable;
    cJSON *promo_offer_participation_status_typeVar = cJSON_GetObjectItemCaseSensitive(promo_offer_participation_status_typeJSON, "promo_offer_participation_status_type");
    if(!cJSON_IsString(promo_offer_participation_status_typeVar) || (promo_offer_participation_status_typeVar->valuestring == NULL)){
        goto end;
    }
    promo_offer_participation_status_typeVariable = promo_offer_participation_status_type_promo_offer_participation_status_type_FromString(promo_offer_participation_status_typeVar->valuestring);
    return promo_offer_participation_status_typeVariable;
end:
    return 0;
}
