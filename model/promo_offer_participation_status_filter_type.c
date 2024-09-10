#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "promo_offer_participation_status_filter_type.h"


char* promo_offer_participation_status_filter_type_promo_offer_participation_status_filter_type_ToString(_api__promo_offer_participation_status_filter_type__e promo_offer_participation_status_filter_type) {
    char *promo_offer_participation_status_filter_typeArray[] =  { "NULL", "MANUALLY_ADDED", "NOT_MANUALLY_ADDED" };
    return promo_offer_participation_status_filter_typeArray[promo_offer_participation_status_filter_type];
}

_api__promo_offer_participation_status_filter_type__e promo_offer_participation_status_filter_type_promo_offer_participation_status_filter_type_FromString(char* promo_offer_participation_status_filter_type) {
    int stringToReturn = 0;
    char *promo_offer_participation_status_filter_typeArray[] =  { "NULL", "MANUALLY_ADDED", "NOT_MANUALLY_ADDED" };
    size_t sizeofArray = sizeof(promo_offer_participation_status_filter_typeArray) / sizeof(promo_offer_participation_status_filter_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(promo_offer_participation_status_filter_type, promo_offer_participation_status_filter_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *promo_offer_participation_status_filter_type_promo_offer_participation_status_filter_type_convertToJSON(_api__promo_offer_participation_status_filter_type__e promo_offer_participation_status_filter_type) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "promo_offer_participation_status_filter_type", promo_offer_participation_status_filter_type_promo_offer_participation_status_filter_type_ToString(promo_offer_participation_status_filter_type)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

_api__promo_offer_participation_status_filter_type__e promo_offer_participation_status_filter_type_promo_offer_participation_status_filter_type_parseFromJSON(cJSON *promo_offer_participation_status_filter_typeJSON) {
    _api__promo_offer_participation_status_filter_type__e *promo_offer_participation_status_filter_type = NULL;
    _api__promo_offer_participation_status_filter_type__e promo_offer_participation_status_filter_typeVariable;
    cJSON *promo_offer_participation_status_filter_typeVar = cJSON_GetObjectItemCaseSensitive(promo_offer_participation_status_filter_typeJSON, "promo_offer_participation_status_filter_type");
    if(!cJSON_IsString(promo_offer_participation_status_filter_typeVar) || (promo_offer_participation_status_filter_typeVar->valuestring == NULL)){
        goto end;
    }
    promo_offer_participation_status_filter_typeVariable = promo_offer_participation_status_filter_type_promo_offer_participation_status_filter_type_FromString(promo_offer_participation_status_filter_typeVar->valuestring);
    return promo_offer_participation_status_filter_typeVariable;
end:
    return 0;
}
