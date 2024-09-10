#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "offer_mapping_kind_type.h"


char* offer_mapping_kind_type_offer_mapping_kind_type_ToString(_api__offer_mapping_kind_type__e offer_mapping_kind_type) {
    char *offer_mapping_kind_typeArray[] =  { "NULL", "ACTIVE", "ALL" };
    return offer_mapping_kind_typeArray[offer_mapping_kind_type];
}

_api__offer_mapping_kind_type__e offer_mapping_kind_type_offer_mapping_kind_type_FromString(char* offer_mapping_kind_type) {
    int stringToReturn = 0;
    char *offer_mapping_kind_typeArray[] =  { "NULL", "ACTIVE", "ALL" };
    size_t sizeofArray = sizeof(offer_mapping_kind_typeArray) / sizeof(offer_mapping_kind_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(offer_mapping_kind_type, offer_mapping_kind_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *offer_mapping_kind_type_offer_mapping_kind_type_convertToJSON(_api__offer_mapping_kind_type__e offer_mapping_kind_type) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "offer_mapping_kind_type", offer_mapping_kind_type_offer_mapping_kind_type_ToString(offer_mapping_kind_type)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

_api__offer_mapping_kind_type__e offer_mapping_kind_type_offer_mapping_kind_type_parseFromJSON(cJSON *offer_mapping_kind_typeJSON) {
    _api__offer_mapping_kind_type__e *offer_mapping_kind_type = NULL;
    _api__offer_mapping_kind_type__e offer_mapping_kind_typeVariable;
    cJSON *offer_mapping_kind_typeVar = cJSON_GetObjectItemCaseSensitive(offer_mapping_kind_typeJSON, "offer_mapping_kind_type");
    if(!cJSON_IsString(offer_mapping_kind_typeVar) || (offer_mapping_kind_typeVar->valuestring == NULL)){
        goto end;
    }
    offer_mapping_kind_typeVariable = offer_mapping_kind_type_offer_mapping_kind_type_FromString(offer_mapping_kind_typeVar->valuestring);
    return offer_mapping_kind_typeVariable;
end:
    return 0;
}
