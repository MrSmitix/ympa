#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "return_decision_reason_type.h"


char* return_decision_reason_type_return_decision_reason_type_ToString(_api__return_decision_reason_type__e return_decision_reason_type) {
    char *return_decision_reason_typeArray[] =  { "NULL", "BAD_QUALITY", "DOES_NOT_FIT", "WRONG_ITEM", "DAMAGE_DELIVERY", "LOYALTY_FAIL", "CONTENT_FAIL", "UNKNOWN" };
    return return_decision_reason_typeArray[return_decision_reason_type];
}

_api__return_decision_reason_type__e return_decision_reason_type_return_decision_reason_type_FromString(char* return_decision_reason_type) {
    int stringToReturn = 0;
    char *return_decision_reason_typeArray[] =  { "NULL", "BAD_QUALITY", "DOES_NOT_FIT", "WRONG_ITEM", "DAMAGE_DELIVERY", "LOYALTY_FAIL", "CONTENT_FAIL", "UNKNOWN" };
    size_t sizeofArray = sizeof(return_decision_reason_typeArray) / sizeof(return_decision_reason_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(return_decision_reason_type, return_decision_reason_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *return_decision_reason_type_return_decision_reason_type_convertToJSON(_api__return_decision_reason_type__e return_decision_reason_type) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "return_decision_reason_type", return_decision_reason_type_return_decision_reason_type_ToString(return_decision_reason_type)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

_api__return_decision_reason_type__e return_decision_reason_type_return_decision_reason_type_parseFromJSON(cJSON *return_decision_reason_typeJSON) {
    _api__return_decision_reason_type__e *return_decision_reason_type = NULL;
    _api__return_decision_reason_type__e return_decision_reason_typeVariable;
    cJSON *return_decision_reason_typeVar = cJSON_GetObjectItemCaseSensitive(return_decision_reason_typeJSON, "return_decision_reason_type");
    if(!cJSON_IsString(return_decision_reason_typeVar) || (return_decision_reason_typeVar->valuestring == NULL)){
        goto end;
    }
    return_decision_reason_typeVariable = return_decision_reason_type_return_decision_reason_type_FromString(return_decision_reason_typeVar->valuestring);
    return return_decision_reason_typeVariable;
end:
    return 0;
}
