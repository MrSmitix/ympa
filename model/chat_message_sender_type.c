#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "chat_message_sender_type.h"


char* chat_message_sender_type_chat_message_sender_type_ToString(_api__chat_message_sender_type__e chat_message_sender_type) {
    char *chat_message_sender_typeArray[] =  { "NULL", "PARTNER", "CUSTOMER", "MARKET", "SUPPORT" };
    return chat_message_sender_typeArray[chat_message_sender_type];
}

_api__chat_message_sender_type__e chat_message_sender_type_chat_message_sender_type_FromString(char* chat_message_sender_type) {
    int stringToReturn = 0;
    char *chat_message_sender_typeArray[] =  { "NULL", "PARTNER", "CUSTOMER", "MARKET", "SUPPORT" };
    size_t sizeofArray = sizeof(chat_message_sender_typeArray) / sizeof(chat_message_sender_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(chat_message_sender_type, chat_message_sender_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *chat_message_sender_type_chat_message_sender_type_convertToJSON(_api__chat_message_sender_type__e chat_message_sender_type) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "chat_message_sender_type", chat_message_sender_type_chat_message_sender_type_ToString(chat_message_sender_type)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

_api__chat_message_sender_type__e chat_message_sender_type_chat_message_sender_type_parseFromJSON(cJSON *chat_message_sender_typeJSON) {
    _api__chat_message_sender_type__e *chat_message_sender_type = NULL;
    _api__chat_message_sender_type__e chat_message_sender_typeVariable;
    cJSON *chat_message_sender_typeVar = cJSON_GetObjectItemCaseSensitive(chat_message_sender_typeJSON, "chat_message_sender_type");
    if(!cJSON_IsString(chat_message_sender_typeVar) || (chat_message_sender_typeVar->valuestring == NULL)){
        goto end;
    }
    chat_message_sender_typeVariable = chat_message_sender_type_chat_message_sender_type_FromString(chat_message_sender_typeVar->valuestring);
    return chat_message_sender_typeVariable;
end:
    return 0;
}
