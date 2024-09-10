#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "return_decision_subreason_type.h"


char* return_decision_subreason_type_return_decision_subreason_type_ToString(_api__return_decision_subreason_type__e return_decision_subreason_type) {
    char *return_decision_subreason_typeArray[] =  { "NULL", "USER_DID_NOT_LIKE", "USER_CHANGED_MIND", "DELIVERED_TOO_LONG", "BAD_PACKAGE", "DAMAGED", "NOT_WORKING", "INCOMPLETENESS", "WRONG_ITEM", "WRONG_COLOR", "DID_NOT_MATCH_DESCRIPTION", "UNKNOWN" };
    return return_decision_subreason_typeArray[return_decision_subreason_type];
}

_api__return_decision_subreason_type__e return_decision_subreason_type_return_decision_subreason_type_FromString(char* return_decision_subreason_type) {
    int stringToReturn = 0;
    char *return_decision_subreason_typeArray[] =  { "NULL", "USER_DID_NOT_LIKE", "USER_CHANGED_MIND", "DELIVERED_TOO_LONG", "BAD_PACKAGE", "DAMAGED", "NOT_WORKING", "INCOMPLETENESS", "WRONG_ITEM", "WRONG_COLOR", "DID_NOT_MATCH_DESCRIPTION", "UNKNOWN" };
    size_t sizeofArray = sizeof(return_decision_subreason_typeArray) / sizeof(return_decision_subreason_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(return_decision_subreason_type, return_decision_subreason_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *return_decision_subreason_type_return_decision_subreason_type_convertToJSON(_api__return_decision_subreason_type__e return_decision_subreason_type) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "return_decision_subreason_type", return_decision_subreason_type_return_decision_subreason_type_ToString(return_decision_subreason_type)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

_api__return_decision_subreason_type__e return_decision_subreason_type_return_decision_subreason_type_parseFromJSON(cJSON *return_decision_subreason_typeJSON) {
    _api__return_decision_subreason_type__e *return_decision_subreason_type = NULL;
    _api__return_decision_subreason_type__e return_decision_subreason_typeVariable;
    cJSON *return_decision_subreason_typeVar = cJSON_GetObjectItemCaseSensitive(return_decision_subreason_typeJSON, "return_decision_subreason_type");
    if(!cJSON_IsString(return_decision_subreason_typeVar) || (return_decision_subreason_typeVar->valuestring == NULL)){
        goto end;
    }
    return_decision_subreason_typeVariable = return_decision_subreason_type_return_decision_subreason_type_FromString(return_decision_subreason_typeVar->valuestring);
    return return_decision_subreason_typeVariable;
end:
    return 0;
}
