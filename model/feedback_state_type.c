#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "feedback_state_type.h"


char* feedback_state_type_feedback_state_type_ToString(_api__feedback_state_type__e feedback_state_type) {
    char *feedback_state_typeArray[] =  { "NULL", "LAST", "PREVIOUS", "DELETED" };
    return feedback_state_typeArray[feedback_state_type];
}

_api__feedback_state_type__e feedback_state_type_feedback_state_type_FromString(char* feedback_state_type) {
    int stringToReturn = 0;
    char *feedback_state_typeArray[] =  { "NULL", "LAST", "PREVIOUS", "DELETED" };
    size_t sizeofArray = sizeof(feedback_state_typeArray) / sizeof(feedback_state_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(feedback_state_type, feedback_state_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *feedback_state_type_feedback_state_type_convertToJSON(_api__feedback_state_type__e feedback_state_type) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "feedback_state_type", feedback_state_type_feedback_state_type_ToString(feedback_state_type)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

_api__feedback_state_type__e feedback_state_type_feedback_state_type_parseFromJSON(cJSON *feedback_state_typeJSON) {
    _api__feedback_state_type__e *feedback_state_type = NULL;
    _api__feedback_state_type__e feedback_state_typeVariable;
    cJSON *feedback_state_typeVar = cJSON_GetObjectItemCaseSensitive(feedback_state_typeJSON, "feedback_state_type");
    if(!cJSON_IsString(feedback_state_typeVar) || (feedback_state_typeVar->valuestring == NULL)){
        goto end;
    }
    feedback_state_typeVariable = feedback_state_type_feedback_state_type_FromString(feedback_state_typeVar->valuestring);
    return feedback_state_typeVariable;
end:
    return 0;
}
