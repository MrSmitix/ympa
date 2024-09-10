#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "chat_message_dto.h"


char* chat_message_dto_sender_ToString(_api__chat_message_dto__e sender) {
    char* senderArray[] =  { "NULL", "PARTNER", "CUSTOMER", "MARKET", "SUPPORT" };
    return senderArray[sender];
}

_api__chat_message_dto__e chat_message_dto_sender_FromString(char* sender){
    int stringToReturn = 0;
    char *senderArray[] =  { "NULL", "PARTNER", "CUSTOMER", "MARKET", "SUPPORT" };
    size_t sizeofArray = sizeof(senderArray) / sizeof(senderArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(sender, senderArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

chat_message_dto_t *chat_message_dto_create(
    long message_id,
    char *created_at,
    chat_message_sender_type_t *sender,
    char *message,
    list_t *payload
    ) {
    chat_message_dto_t *chat_message_dto_local_var = malloc(sizeof(chat_message_dto_t));
    if (!chat_message_dto_local_var) {
        return NULL;
    }
    chat_message_dto_local_var->message_id = message_id;
    chat_message_dto_local_var->created_at = created_at;
    chat_message_dto_local_var->sender = sender;
    chat_message_dto_local_var->message = message;
    chat_message_dto_local_var->payload = payload;

    return chat_message_dto_local_var;
}


void chat_message_dto_free(chat_message_dto_t *chat_message_dto) {
    if(NULL == chat_message_dto){
        return ;
    }
    listEntry_t *listEntry;
    if (chat_message_dto->created_at) {
        free(chat_message_dto->created_at);
        chat_message_dto->created_at = NULL;
    }
    if (chat_message_dto->sender) {
        chat_message_sender_type_free(chat_message_dto->sender);
        chat_message_dto->sender = NULL;
    }
    if (chat_message_dto->message) {
        free(chat_message_dto->message);
        chat_message_dto->message = NULL;
    }
    if (chat_message_dto->payload) {
        list_ForEach(listEntry, chat_message_dto->payload) {
            chat_message_payload_dto_free(listEntry->data);
        }
        list_freeList(chat_message_dto->payload);
        chat_message_dto->payload = NULL;
    }
    free(chat_message_dto);
}

cJSON *chat_message_dto_convertToJSON(chat_message_dto_t *chat_message_dto) {
    cJSON *item = cJSON_CreateObject();

    // chat_message_dto->message_id
    if (!chat_message_dto->message_id) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "messageId", chat_message_dto->message_id) == NULL) {
    goto fail; //Numeric
    }


    // chat_message_dto->created_at
    if (!chat_message_dto->created_at) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "createdAt", chat_message_dto->created_at) == NULL) {
    goto fail; //Date-Time
    }


    // chat_message_dto->sender
    if (_api__chat_message_dto__NULL == chat_message_dto->sender) {
        goto fail;
    }
    cJSON *sender_local_JSON = chat_message_sender_type_convertToJSON(chat_message_dto->sender);
    if(sender_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "sender", sender_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }


    // chat_message_dto->message
    if(chat_message_dto->message) {
    if(cJSON_AddStringToObject(item, "message", chat_message_dto->message) == NULL) {
    goto fail; //String
    }
    }


    // chat_message_dto->payload
    if(chat_message_dto->payload) {
    cJSON *payload = cJSON_AddArrayToObject(item, "payload");
    if(payload == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *payloadListEntry;
    if (chat_message_dto->payload) {
    list_ForEach(payloadListEntry, chat_message_dto->payload) {
    cJSON *itemLocal = chat_message_payload_dto_convertToJSON(payloadListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(payload, itemLocal);
    }
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

chat_message_dto_t *chat_message_dto_parseFromJSON(cJSON *chat_message_dtoJSON){

    chat_message_dto_t *chat_message_dto_local_var = NULL;

    // define the local variable for chat_message_dto->sender
    chat_message_sender_type_t *sender_local_nonprim = NULL;

    // define the local list for chat_message_dto->payload
    list_t *payloadList = NULL;

    // chat_message_dto->message_id
    cJSON *message_id = cJSON_GetObjectItemCaseSensitive(chat_message_dtoJSON, "messageId");
    if (!message_id) {
        goto end;
    }

    
    if(!cJSON_IsNumber(message_id))
    {
    goto end; //Numeric
    }

    // chat_message_dto->created_at
    cJSON *created_at = cJSON_GetObjectItemCaseSensitive(chat_message_dtoJSON, "createdAt");
    if (!created_at) {
        goto end;
    }

    
    if(!cJSON_IsString(created_at) && !cJSON_IsNull(created_at))
    {
    goto end; //DateTime
    }

    // chat_message_dto->sender
    cJSON *sender = cJSON_GetObjectItemCaseSensitive(chat_message_dtoJSON, "sender");
    if (!sender) {
        goto end;
    }

    
    sender_local_nonprim = chat_message_sender_type_parseFromJSON(sender); //custom

    // chat_message_dto->message
    cJSON *message = cJSON_GetObjectItemCaseSensitive(chat_message_dtoJSON, "message");
    if (message) { 
    if(!cJSON_IsString(message) && !cJSON_IsNull(message))
    {
    goto end; //String
    }
    }

    // chat_message_dto->payload
    cJSON *payload = cJSON_GetObjectItemCaseSensitive(chat_message_dtoJSON, "payload");
    if (payload) { 
    cJSON *payload_local_nonprimitive = NULL;
    if(!cJSON_IsArray(payload)){
        goto end; //nonprimitive container
    }

    payloadList = list_createList();

    cJSON_ArrayForEach(payload_local_nonprimitive,payload )
    {
        if(!cJSON_IsObject(payload_local_nonprimitive)){
            goto end;
        }
        chat_message_payload_dto_t *payloadItem = chat_message_payload_dto_parseFromJSON(payload_local_nonprimitive);

        list_addElement(payloadList, payloadItem);
    }
    }


    chat_message_dto_local_var = chat_message_dto_create (
        message_id->valuedouble,
        strdup(created_at->valuestring),
        sender_local_nonprim,
        message && !cJSON_IsNull(message) ? strdup(message->valuestring) : NULL,
        payload ? payloadList : NULL
        );

    return chat_message_dto_local_var;
end:
    if (sender_local_nonprim) {
        chat_message_sender_type_free(sender_local_nonprim);
        sender_local_nonprim = NULL;
    }
    if (payloadList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, payloadList) {
            chat_message_payload_dto_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(payloadList);
        payloadList = NULL;
    }
    return NULL;

}
