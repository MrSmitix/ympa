#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "feedback_comment_author_type.h"


char* feedback_comment_author_type_feedback_comment_author_type_ToString(_api__feedback_comment_author_type__e feedback_comment_author_type) {
    char *feedback_comment_author_typeArray[] =  { "NULL", "USER", "SHOP" };
    return feedback_comment_author_typeArray[feedback_comment_author_type];
}

_api__feedback_comment_author_type__e feedback_comment_author_type_feedback_comment_author_type_FromString(char* feedback_comment_author_type) {
    int stringToReturn = 0;
    char *feedback_comment_author_typeArray[] =  { "NULL", "USER", "SHOP" };
    size_t sizeofArray = sizeof(feedback_comment_author_typeArray) / sizeof(feedback_comment_author_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(feedback_comment_author_type, feedback_comment_author_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *feedback_comment_author_type_feedback_comment_author_type_convertToJSON(_api__feedback_comment_author_type__e feedback_comment_author_type) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "feedback_comment_author_type", feedback_comment_author_type_feedback_comment_author_type_ToString(feedback_comment_author_type)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

_api__feedback_comment_author_type__e feedback_comment_author_type_feedback_comment_author_type_parseFromJSON(cJSON *feedback_comment_author_typeJSON) {
    _api__feedback_comment_author_type__e *feedback_comment_author_type = NULL;
    _api__feedback_comment_author_type__e feedback_comment_author_typeVariable;
    cJSON *feedback_comment_author_typeVar = cJSON_GetObjectItemCaseSensitive(feedback_comment_author_typeJSON, "feedback_comment_author_type");
    if(!cJSON_IsString(feedback_comment_author_typeVar) || (feedback_comment_author_typeVar->valuestring == NULL)){
        goto end;
    }
    feedback_comment_author_typeVariable = feedback_comment_author_type_feedback_comment_author_type_FromString(feedback_comment_author_typeVar->valuestring);
    return feedback_comment_author_typeVariable;
end:
    return 0;
}
