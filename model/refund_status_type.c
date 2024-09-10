#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "refund_status_type.h"


char* refund_status_type_refund_status_type_ToString(_api__refund_status_type__e refund_status_type) {
    char *refund_status_typeArray[] =  { "NULL", "STARTED_BY_USER", "REFUND_IN_PROGRESS", "REFUNDED", "FAILED", "WAITING_FOR_DECISION", "DECISION_MADE", "REFUNDED_WITH_BONUSES", "REFUNDED_BY_SHOP", "CANCELLED", "COMPLETE_WITHOUT_REFUND", "UNKNOWN" };
    return refund_status_typeArray[refund_status_type];
}

_api__refund_status_type__e refund_status_type_refund_status_type_FromString(char* refund_status_type) {
    int stringToReturn = 0;
    char *refund_status_typeArray[] =  { "NULL", "STARTED_BY_USER", "REFUND_IN_PROGRESS", "REFUNDED", "FAILED", "WAITING_FOR_DECISION", "DECISION_MADE", "REFUNDED_WITH_BONUSES", "REFUNDED_BY_SHOP", "CANCELLED", "COMPLETE_WITHOUT_REFUND", "UNKNOWN" };
    size_t sizeofArray = sizeof(refund_status_typeArray) / sizeof(refund_status_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(refund_status_type, refund_status_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *refund_status_type_refund_status_type_convertToJSON(_api__refund_status_type__e refund_status_type) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "refund_status_type", refund_status_type_refund_status_type_ToString(refund_status_type)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

_api__refund_status_type__e refund_status_type_refund_status_type_parseFromJSON(cJSON *refund_status_typeJSON) {
    _api__refund_status_type__e *refund_status_type = NULL;
    _api__refund_status_type__e refund_status_typeVariable;
    cJSON *refund_status_typeVar = cJSON_GetObjectItemCaseSensitive(refund_status_typeJSON, "refund_status_type");
    if(!cJSON_IsString(refund_status_typeVar) || (refund_status_typeVar->valuestring == NULL)){
        goto end;
    }
    refund_status_typeVariable = refund_status_type_refund_status_type_FromString(refund_status_typeVar->valuestring);
    return refund_status_typeVariable;
end:
    return 0;
}
