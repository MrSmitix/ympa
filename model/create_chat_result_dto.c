#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "create_chat_result_dto.h"



create_chat_result_dto_t *create_chat_result_dto_create(
    long chat_id
    ) {
    create_chat_result_dto_t *create_chat_result_dto_local_var = malloc(sizeof(create_chat_result_dto_t));
    if (!create_chat_result_dto_local_var) {
        return NULL;
    }
    create_chat_result_dto_local_var->chat_id = chat_id;

    return create_chat_result_dto_local_var;
}


void create_chat_result_dto_free(create_chat_result_dto_t *create_chat_result_dto) {
    if(NULL == create_chat_result_dto){
        return ;
    }
    listEntry_t *listEntry;
    free(create_chat_result_dto);
}

cJSON *create_chat_result_dto_convertToJSON(create_chat_result_dto_t *create_chat_result_dto) {
    cJSON *item = cJSON_CreateObject();

    // create_chat_result_dto->chat_id
    if (!create_chat_result_dto->chat_id) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "chatId", create_chat_result_dto->chat_id) == NULL) {
    goto fail; //Numeric
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

create_chat_result_dto_t *create_chat_result_dto_parseFromJSON(cJSON *create_chat_result_dtoJSON){

    create_chat_result_dto_t *create_chat_result_dto_local_var = NULL;

    // create_chat_result_dto->chat_id
    cJSON *chat_id = cJSON_GetObjectItemCaseSensitive(create_chat_result_dtoJSON, "chatId");
    if (!chat_id) {
        goto end;
    }

    
    if(!cJSON_IsNumber(chat_id))
    {
    goto end; //Numeric
    }


    create_chat_result_dto_local_var = create_chat_result_dto_create (
        chat_id->valuedouble
        );

    return create_chat_result_dto_local_var;
end:
    return NULL;

}
