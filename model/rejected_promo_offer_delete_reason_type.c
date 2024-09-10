#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "rejected_promo_offer_delete_reason_type.h"


char* rejected_promo_offer_delete_reason_type_rejected_promo_offer_delete_reason_type_ToString(_api__rejected_promo_offer_delete_reason_type__e rejected_promo_offer_delete_reason_type) {
    char *rejected_promo_offer_delete_reason_typeArray[] =  { "NULL", "OFFER_DOES_NOT_EXIST" };
    return rejected_promo_offer_delete_reason_typeArray[rejected_promo_offer_delete_reason_type];
}

_api__rejected_promo_offer_delete_reason_type__e rejected_promo_offer_delete_reason_type_rejected_promo_offer_delete_reason_type_FromString(char* rejected_promo_offer_delete_reason_type) {
    int stringToReturn = 0;
    char *rejected_promo_offer_delete_reason_typeArray[] =  { "NULL", "OFFER_DOES_NOT_EXIST" };
    size_t sizeofArray = sizeof(rejected_promo_offer_delete_reason_typeArray) / sizeof(rejected_promo_offer_delete_reason_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(rejected_promo_offer_delete_reason_type, rejected_promo_offer_delete_reason_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *rejected_promo_offer_delete_reason_type_rejected_promo_offer_delete_reason_type_convertToJSON(_api__rejected_promo_offer_delete_reason_type__e rejected_promo_offer_delete_reason_type) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "rejected_promo_offer_delete_reason_type", rejected_promo_offer_delete_reason_type_rejected_promo_offer_delete_reason_type_ToString(rejected_promo_offer_delete_reason_type)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

_api__rejected_promo_offer_delete_reason_type__e rejected_promo_offer_delete_reason_type_rejected_promo_offer_delete_reason_type_parseFromJSON(cJSON *rejected_promo_offer_delete_reason_typeJSON) {
    _api__rejected_promo_offer_delete_reason_type__e *rejected_promo_offer_delete_reason_type = NULL;
    _api__rejected_promo_offer_delete_reason_type__e rejected_promo_offer_delete_reason_typeVariable;
    cJSON *rejected_promo_offer_delete_reason_typeVar = cJSON_GetObjectItemCaseSensitive(rejected_promo_offer_delete_reason_typeJSON, "rejected_promo_offer_delete_reason_type");
    if(!cJSON_IsString(rejected_promo_offer_delete_reason_typeVar) || (rejected_promo_offer_delete_reason_typeVar->valuestring == NULL)){
        goto end;
    }
    rejected_promo_offer_delete_reason_typeVariable = rejected_promo_offer_delete_reason_type_rejected_promo_offer_delete_reason_type_FromString(rejected_promo_offer_delete_reason_typeVar->valuestring);
    return rejected_promo_offer_delete_reason_typeVariable;
end:
    return 0;
}
