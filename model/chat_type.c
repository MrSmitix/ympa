#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "chat_type.h"


char* chat_type_chat_type_ToString(_api__chat_type__e chat_type) {
    char *chat_typeArray[] =  { "NULL", "CHAT", "ARBITRAGE" };
    return chat_typeArray[chat_type];
}

_api__chat_type__e chat_type_chat_type_FromString(char* chat_type) {
    int stringToReturn = 0;
    char *chat_typeArray[] =  { "NULL", "CHAT", "ARBITRAGE" };
    size_t sizeofArray = sizeof(chat_typeArray) / sizeof(chat_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(chat_type, chat_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *chat_type_chat_type_convertToJSON(_api__chat_type__e chat_type) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "chat_type", chat_type_chat_type_ToString(chat_type)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

_api__chat_type__e chat_type_chat_type_parseFromJSON(cJSON *chat_typeJSON) {
    _api__chat_type__e *chat_type = NULL;
    _api__chat_type__e chat_typeVariable;
    cJSON *chat_typeVar = cJSON_GetObjectItemCaseSensitive(chat_typeJSON, "chat_type");
    if(!cJSON_IsString(chat_typeVar) || (chat_typeVar->valuestring == NULL)){
        goto end;
    }
    chat_typeVariable = chat_type_chat_type_FromString(chat_typeVar->valuestring);
    return chat_typeVariable;
end:
    return 0;
}
