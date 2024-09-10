#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "return_decision_type.h"


char* return_decision_type_return_decision_type_ToString(_api__return_decision_type__e return_decision_type) {
    char *return_decision_typeArray[] =  { "NULL", "REFUND_MONEY", "REFUND_MONEY_INCLUDING_SHIPMENT", "REPAIR", "REPLACE", "SEND_TO_EXAMINATION", "DECLINE_REFUND", "OTHER_DECISION", "UNKNOWN" };
    return return_decision_typeArray[return_decision_type];
}

_api__return_decision_type__e return_decision_type_return_decision_type_FromString(char* return_decision_type) {
    int stringToReturn = 0;
    char *return_decision_typeArray[] =  { "NULL", "REFUND_MONEY", "REFUND_MONEY_INCLUDING_SHIPMENT", "REPAIR", "REPLACE", "SEND_TO_EXAMINATION", "DECLINE_REFUND", "OTHER_DECISION", "UNKNOWN" };
    size_t sizeofArray = sizeof(return_decision_typeArray) / sizeof(return_decision_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(return_decision_type, return_decision_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *return_decision_type_return_decision_type_convertToJSON(_api__return_decision_type__e return_decision_type) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "return_decision_type", return_decision_type_return_decision_type_ToString(return_decision_type)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

_api__return_decision_type__e return_decision_type_return_decision_type_parseFromJSON(cJSON *return_decision_typeJSON) {
    _api__return_decision_type__e *return_decision_type = NULL;
    _api__return_decision_type__e return_decision_typeVariable;
    cJSON *return_decision_typeVar = cJSON_GetObjectItemCaseSensitive(return_decision_typeJSON, "return_decision_type");
    if(!cJSON_IsString(return_decision_typeVar) || (return_decision_typeVar->valuestring == NULL)){
        goto end;
    }
    return_decision_typeVariable = return_decision_type_return_decision_type_FromString(return_decision_typeVar->valuestring);
    return return_decision_typeVariable;
end:
    return 0;
}
