#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "chat_status_type.h"


char* chat_status_type_chat_status_type_ToString(_api__chat_status_type__e chat_status_type) {
    char *chat_status_typeArray[] =  { "NULL", "NEW", "WAITING_FOR_CUSTOMER", "WAITING_FOR_PARTNER", "WAITING_FOR_ARBITER", "WAITING_FOR_MARKET", "FINISHED" };
    return chat_status_typeArray[chat_status_type];
}

_api__chat_status_type__e chat_status_type_chat_status_type_FromString(char* chat_status_type) {
    int stringToReturn = 0;
    char *chat_status_typeArray[] =  { "NULL", "NEW", "WAITING_FOR_CUSTOMER", "WAITING_FOR_PARTNER", "WAITING_FOR_ARBITER", "WAITING_FOR_MARKET", "FINISHED" };
    size_t sizeofArray = sizeof(chat_status_typeArray) / sizeof(chat_status_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(chat_status_type, chat_status_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *chat_status_type_chat_status_type_convertToJSON(_api__chat_status_type__e chat_status_type) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "chat_status_type", chat_status_type_chat_status_type_ToString(chat_status_type)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

_api__chat_status_type__e chat_status_type_chat_status_type_parseFromJSON(cJSON *chat_status_typeJSON) {
    _api__chat_status_type__e *chat_status_type = NULL;
    _api__chat_status_type__e chat_status_typeVariable;
    cJSON *chat_status_typeVar = cJSON_GetObjectItemCaseSensitive(chat_status_typeJSON, "chat_status_type");
    if(!cJSON_IsString(chat_status_typeVar) || (chat_status_typeVar->valuestring == NULL)){
        goto end;
    }
    chat_status_typeVariable = chat_status_type_chat_status_type_FromString(chat_status_typeVar->valuestring);
    return chat_status_typeVariable;
end:
    return 0;
}
