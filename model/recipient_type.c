#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "recipient_type.h"


char* recipient_type_recipient_type_ToString(_api__recipient_type__e recipient_type) {
    char *recipient_typeArray[] =  { "NULL", "SHOP", "DELIVERY_SERVICE", "POST" };
    return recipient_typeArray[recipient_type];
}

_api__recipient_type__e recipient_type_recipient_type_FromString(char* recipient_type) {
    int stringToReturn = 0;
    char *recipient_typeArray[] =  { "NULL", "SHOP", "DELIVERY_SERVICE", "POST" };
    size_t sizeofArray = sizeof(recipient_typeArray) / sizeof(recipient_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(recipient_type, recipient_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *recipient_type_recipient_type_convertToJSON(_api__recipient_type__e recipient_type) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "recipient_type", recipient_type_recipient_type_ToString(recipient_type)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

_api__recipient_type__e recipient_type_recipient_type_parseFromJSON(cJSON *recipient_typeJSON) {
    _api__recipient_type__e *recipient_type = NULL;
    _api__recipient_type__e recipient_typeVariable;
    cJSON *recipient_typeVar = cJSON_GetObjectItemCaseSensitive(recipient_typeJSON, "recipient_type");
    if(!cJSON_IsString(recipient_typeVar) || (recipient_typeVar->valuestring == NULL)){
        goto end;
    }
    recipient_typeVariable = recipient_type_recipient_type_FromString(recipient_typeVar->valuestring);
    return recipient_typeVariable;
end:
    return 0;
}
