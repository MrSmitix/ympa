#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "chat_message_payload_dto.h"



chat_message_payload_dto_t *chat_message_payload_dto_create(
    char *name,
    char *url,
    int size
    ) {
    chat_message_payload_dto_t *chat_message_payload_dto_local_var = malloc(sizeof(chat_message_payload_dto_t));
    if (!chat_message_payload_dto_local_var) {
        return NULL;
    }
    chat_message_payload_dto_local_var->name = name;
    chat_message_payload_dto_local_var->url = url;
    chat_message_payload_dto_local_var->size = size;

    return chat_message_payload_dto_local_var;
}


void chat_message_payload_dto_free(chat_message_payload_dto_t *chat_message_payload_dto) {
    if(NULL == chat_message_payload_dto){
        return ;
    }
    listEntry_t *listEntry;
    if (chat_message_payload_dto->name) {
        free(chat_message_payload_dto->name);
        chat_message_payload_dto->name = NULL;
    }
    if (chat_message_payload_dto->url) {
        free(chat_message_payload_dto->url);
        chat_message_payload_dto->url = NULL;
    }
    free(chat_message_payload_dto);
}

cJSON *chat_message_payload_dto_convertToJSON(chat_message_payload_dto_t *chat_message_payload_dto) {
    cJSON *item = cJSON_CreateObject();

    // chat_message_payload_dto->name
    if (!chat_message_payload_dto->name) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "name", chat_message_payload_dto->name) == NULL) {
    goto fail; //String
    }


    // chat_message_payload_dto->url
    if (!chat_message_payload_dto->url) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "url", chat_message_payload_dto->url) == NULL) {
    goto fail; //String
    }


    // chat_message_payload_dto->size
    if (!chat_message_payload_dto->size) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "size", chat_message_payload_dto->size) == NULL) {
    goto fail; //Numeric
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

chat_message_payload_dto_t *chat_message_payload_dto_parseFromJSON(cJSON *chat_message_payload_dtoJSON){

    chat_message_payload_dto_t *chat_message_payload_dto_local_var = NULL;

    // chat_message_payload_dto->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(chat_message_payload_dtoJSON, "name");
    if (!name) {
        goto end;
    }

    
    if(!cJSON_IsString(name))
    {
    goto end; //String
    }

    // chat_message_payload_dto->url
    cJSON *url = cJSON_GetObjectItemCaseSensitive(chat_message_payload_dtoJSON, "url");
    if (!url) {
        goto end;
    }

    
    if(!cJSON_IsString(url))
    {
    goto end; //String
    }

    // chat_message_payload_dto->size
    cJSON *size = cJSON_GetObjectItemCaseSensitive(chat_message_payload_dtoJSON, "size");
    if (!size) {
        goto end;
    }

    
    if(!cJSON_IsNumber(size))
    {
    goto end; //Numeric
    }


    chat_message_payload_dto_local_var = chat_message_payload_dto_create (
        strdup(name->valuestring),
        strdup(url->valuestring),
        size->valuedouble
        );

    return chat_message_payload_dto_local_var;
end:
    return NULL;

}
