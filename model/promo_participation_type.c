#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "promo_participation_type.h"


char* promo_participation_type_promo_participation_type_ToString(_api__promo_participation_type__e promo_participation_type) {
    char *promo_participation_typeArray[] =  { "NULL", "PARTICIPATING_NOW", "PARTICIPATED" };
    return promo_participation_typeArray[promo_participation_type];
}

_api__promo_participation_type__e promo_participation_type_promo_participation_type_FromString(char* promo_participation_type) {
    int stringToReturn = 0;
    char *promo_participation_typeArray[] =  { "NULL", "PARTICIPATING_NOW", "PARTICIPATED" };
    size_t sizeofArray = sizeof(promo_participation_typeArray) / sizeof(promo_participation_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(promo_participation_type, promo_participation_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *promo_participation_type_promo_participation_type_convertToJSON(_api__promo_participation_type__e promo_participation_type) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "promo_participation_type", promo_participation_type_promo_participation_type_ToString(promo_participation_type)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

_api__promo_participation_type__e promo_participation_type_promo_participation_type_parseFromJSON(cJSON *promo_participation_typeJSON) {
    _api__promo_participation_type__e *promo_participation_type = NULL;
    _api__promo_participation_type__e promo_participation_typeVariable;
    cJSON *promo_participation_typeVar = cJSON_GetObjectItemCaseSensitive(promo_participation_typeJSON, "promo_participation_type");
    if(!cJSON_IsString(promo_participation_typeVar) || (promo_participation_typeVar->valuestring == NULL)){
        goto end;
    }
    promo_participation_typeVariable = promo_participation_type_promo_participation_type_FromString(promo_participation_typeVar->valuestring);
    return promo_participation_typeVariable;
end:
    return 0;
}
