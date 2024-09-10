#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "chat_messages_result_dto.h"



chat_messages_result_dto_t *chat_messages_result_dto_create(
    long order_id,
    list_t *messages,
    forward_scrolling_pager_dto_t *paging
    ) {
    chat_messages_result_dto_t *chat_messages_result_dto_local_var = malloc(sizeof(chat_messages_result_dto_t));
    if (!chat_messages_result_dto_local_var) {
        return NULL;
    }
    chat_messages_result_dto_local_var->order_id = order_id;
    chat_messages_result_dto_local_var->messages = messages;
    chat_messages_result_dto_local_var->paging = paging;

    return chat_messages_result_dto_local_var;
}


void chat_messages_result_dto_free(chat_messages_result_dto_t *chat_messages_result_dto) {
    if(NULL == chat_messages_result_dto){
        return ;
    }
    listEntry_t *listEntry;
    if (chat_messages_result_dto->messages) {
        list_ForEach(listEntry, chat_messages_result_dto->messages) {
            chat_message_dto_free(listEntry->data);
        }
        list_freeList(chat_messages_result_dto->messages);
        chat_messages_result_dto->messages = NULL;
    }
    if (chat_messages_result_dto->paging) {
        forward_scrolling_pager_dto_free(chat_messages_result_dto->paging);
        chat_messages_result_dto->paging = NULL;
    }
    free(chat_messages_result_dto);
}

cJSON *chat_messages_result_dto_convertToJSON(chat_messages_result_dto_t *chat_messages_result_dto) {
    cJSON *item = cJSON_CreateObject();

    // chat_messages_result_dto->order_id
    if (!chat_messages_result_dto->order_id) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "orderId", chat_messages_result_dto->order_id) == NULL) {
    goto fail; //Numeric
    }


    // chat_messages_result_dto->messages
    if (!chat_messages_result_dto->messages) {
        goto fail;
    }
    cJSON *messages = cJSON_AddArrayToObject(item, "messages");
    if(messages == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *messagesListEntry;
    if (chat_messages_result_dto->messages) {
    list_ForEach(messagesListEntry, chat_messages_result_dto->messages) {
    cJSON *itemLocal = chat_message_dto_convertToJSON(messagesListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(messages, itemLocal);
    }
    }


    // chat_messages_result_dto->paging
    if(chat_messages_result_dto->paging) {
    cJSON *paging_local_JSON = forward_scrolling_pager_dto_convertToJSON(chat_messages_result_dto->paging);
    if(paging_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "paging", paging_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

chat_messages_result_dto_t *chat_messages_result_dto_parseFromJSON(cJSON *chat_messages_result_dtoJSON){

    chat_messages_result_dto_t *chat_messages_result_dto_local_var = NULL;

    // define the local list for chat_messages_result_dto->messages
    list_t *messagesList = NULL;

    // define the local variable for chat_messages_result_dto->paging
    forward_scrolling_pager_dto_t *paging_local_nonprim = NULL;

    // chat_messages_result_dto->order_id
    cJSON *order_id = cJSON_GetObjectItemCaseSensitive(chat_messages_result_dtoJSON, "orderId");
    if (!order_id) {
        goto end;
    }

    
    if(!cJSON_IsNumber(order_id))
    {
    goto end; //Numeric
    }

    // chat_messages_result_dto->messages
    cJSON *messages = cJSON_GetObjectItemCaseSensitive(chat_messages_result_dtoJSON, "messages");
    if (!messages) {
        goto end;
    }

    
    cJSON *messages_local_nonprimitive = NULL;
    if(!cJSON_IsArray(messages)){
        goto end; //nonprimitive container
    }

    messagesList = list_createList();

    cJSON_ArrayForEach(messages_local_nonprimitive,messages )
    {
        if(!cJSON_IsObject(messages_local_nonprimitive)){
            goto end;
        }
        chat_message_dto_t *messagesItem = chat_message_dto_parseFromJSON(messages_local_nonprimitive);

        list_addElement(messagesList, messagesItem);
    }

    // chat_messages_result_dto->paging
    cJSON *paging = cJSON_GetObjectItemCaseSensitive(chat_messages_result_dtoJSON, "paging");
    if (paging) { 
    paging_local_nonprim = forward_scrolling_pager_dto_parseFromJSON(paging); //nonprimitive
    }


    chat_messages_result_dto_local_var = chat_messages_result_dto_create (
        order_id->valuedouble,
        messagesList,
        paging ? paging_local_nonprim : NULL
        );

    return chat_messages_result_dto_local_var;
end:
    if (messagesList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, messagesList) {
            chat_message_dto_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(messagesList);
        messagesList = NULL;
    }
    if (paging_local_nonprim) {
        forward_scrolling_pager_dto_free(paging_local_nonprim);
        paging_local_nonprim = NULL;
    }
    return NULL;

}
