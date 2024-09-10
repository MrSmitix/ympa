#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "feedback_delivery_type.h"


char* feedback_delivery_type_feedback_delivery_type_ToString(_api__feedback_delivery_type__e feedback_delivery_type) {
    char *feedback_delivery_typeArray[] =  { "NULL", "DELIVERY", "PICKUP", "INSTORE" };
    return feedback_delivery_typeArray[feedback_delivery_type];
}

_api__feedback_delivery_type__e feedback_delivery_type_feedback_delivery_type_FromString(char* feedback_delivery_type) {
    int stringToReturn = 0;
    char *feedback_delivery_typeArray[] =  { "NULL", "DELIVERY", "PICKUP", "INSTORE" };
    size_t sizeofArray = sizeof(feedback_delivery_typeArray) / sizeof(feedback_delivery_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(feedback_delivery_type, feedback_delivery_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *feedback_delivery_type_feedback_delivery_type_convertToJSON(_api__feedback_delivery_type__e feedback_delivery_type) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "feedback_delivery_type", feedback_delivery_type_feedback_delivery_type_ToString(feedback_delivery_type)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

_api__feedback_delivery_type__e feedback_delivery_type_feedback_delivery_type_parseFromJSON(cJSON *feedback_delivery_typeJSON) {
    _api__feedback_delivery_type__e *feedback_delivery_type = NULL;
    _api__feedback_delivery_type__e feedback_delivery_typeVariable;
    cJSON *feedback_delivery_typeVar = cJSON_GetObjectItemCaseSensitive(feedback_delivery_typeJSON, "feedback_delivery_type");
    if(!cJSON_IsString(feedback_delivery_typeVar) || (feedback_delivery_typeVar->valuestring == NULL)){
        goto end;
    }
    feedback_delivery_typeVariable = feedback_delivery_type_feedback_delivery_type_FromString(feedback_delivery_typeVar->valuestring);
    return feedback_delivery_typeVariable;
end:
    return 0;
}
