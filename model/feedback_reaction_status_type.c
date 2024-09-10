#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "feedback_reaction_status_type.h"


char* feedback_reaction_status_type_feedback_reaction_status_type_ToString(_api__feedback_reaction_status_type__e feedback_reaction_status_type) {
    char *feedback_reaction_status_typeArray[] =  { "NULL", "ALL", "NEED_REACTION" };
    return feedback_reaction_status_typeArray[feedback_reaction_status_type];
}

_api__feedback_reaction_status_type__e feedback_reaction_status_type_feedback_reaction_status_type_FromString(char* feedback_reaction_status_type) {
    int stringToReturn = 0;
    char *feedback_reaction_status_typeArray[] =  { "NULL", "ALL", "NEED_REACTION" };
    size_t sizeofArray = sizeof(feedback_reaction_status_typeArray) / sizeof(feedback_reaction_status_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(feedback_reaction_status_type, feedback_reaction_status_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *feedback_reaction_status_type_feedback_reaction_status_type_convertToJSON(_api__feedback_reaction_status_type__e feedback_reaction_status_type) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "feedback_reaction_status_type", feedback_reaction_status_type_feedback_reaction_status_type_ToString(feedback_reaction_status_type)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

_api__feedback_reaction_status_type__e feedback_reaction_status_type_feedback_reaction_status_type_parseFromJSON(cJSON *feedback_reaction_status_typeJSON) {
    _api__feedback_reaction_status_type__e *feedback_reaction_status_type = NULL;
    _api__feedback_reaction_status_type__e feedback_reaction_status_typeVariable;
    cJSON *feedback_reaction_status_typeVar = cJSON_GetObjectItemCaseSensitive(feedback_reaction_status_typeJSON, "feedback_reaction_status_type");
    if(!cJSON_IsString(feedback_reaction_status_typeVar) || (feedback_reaction_status_typeVar->valuestring == NULL)){
        goto end;
    }
    feedback_reaction_status_typeVariable = feedback_reaction_status_type_feedback_reaction_status_type_FromString(feedback_reaction_status_typeVar->valuestring);
    return feedback_reaction_status_typeVariable;
end:
    return 0;
}
