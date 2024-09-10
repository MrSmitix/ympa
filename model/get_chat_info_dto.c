#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "get_chat_info_dto.h"


char* get_chat_info_dto_type_ToString(_api__get_chat_info_dto__e type) {
    char* typeArray[] =  { "NULL", "CHAT", "ARBITRAGE" };
    return typeArray[type];
}

_api__get_chat_info_dto__e get_chat_info_dto_type_FromString(char* type){
    int stringToReturn = 0;
    char *typeArray[] =  { "NULL", "CHAT", "ARBITRAGE" };
    size_t sizeofArray = sizeof(typeArray) / sizeof(typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(type, typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}
char* get_chat_info_dto_status_ToString(_api__get_chat_info_dto__e status) {
    char* statusArray[] =  { "NULL", "NEW", "WAITING_FOR_CUSTOMER", "WAITING_FOR_PARTNER", "WAITING_FOR_ARBITER", "WAITING_FOR_MARKET", "FINISHED" };
    return statusArray[status];
}

_api__get_chat_info_dto__e get_chat_info_dto_status_FromString(char* status){
    int stringToReturn = 0;
    char *statusArray[] =  { "NULL", "NEW", "WAITING_FOR_CUSTOMER", "WAITING_FOR_PARTNER", "WAITING_FOR_ARBITER", "WAITING_FOR_MARKET", "FINISHED" };
    size_t sizeofArray = sizeof(statusArray) / sizeof(statusArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(status, statusArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

get_chat_info_dto_t *get_chat_info_dto_create(
    long chat_id,
    long order_id,
    chat_type_t *type,
    chat_status_type_t *status,
    char *created_at,
    char *updated_at
    ) {
    get_chat_info_dto_t *get_chat_info_dto_local_var = malloc(sizeof(get_chat_info_dto_t));
    if (!get_chat_info_dto_local_var) {
        return NULL;
    }
    get_chat_info_dto_local_var->chat_id = chat_id;
    get_chat_info_dto_local_var->order_id = order_id;
    get_chat_info_dto_local_var->type = type;
    get_chat_info_dto_local_var->status = status;
    get_chat_info_dto_local_var->created_at = created_at;
    get_chat_info_dto_local_var->updated_at = updated_at;

    return get_chat_info_dto_local_var;
}


void get_chat_info_dto_free(get_chat_info_dto_t *get_chat_info_dto) {
    if(NULL == get_chat_info_dto){
        return ;
    }
    listEntry_t *listEntry;
    if (get_chat_info_dto->type) {
        chat_type_free(get_chat_info_dto->type);
        get_chat_info_dto->type = NULL;
    }
    if (get_chat_info_dto->status) {
        chat_status_type_free(get_chat_info_dto->status);
        get_chat_info_dto->status = NULL;
    }
    if (get_chat_info_dto->created_at) {
        free(get_chat_info_dto->created_at);
        get_chat_info_dto->created_at = NULL;
    }
    if (get_chat_info_dto->updated_at) {
        free(get_chat_info_dto->updated_at);
        get_chat_info_dto->updated_at = NULL;
    }
    free(get_chat_info_dto);
}

cJSON *get_chat_info_dto_convertToJSON(get_chat_info_dto_t *get_chat_info_dto) {
    cJSON *item = cJSON_CreateObject();

    // get_chat_info_dto->chat_id
    if (!get_chat_info_dto->chat_id) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "chatId", get_chat_info_dto->chat_id) == NULL) {
    goto fail; //Numeric
    }


    // get_chat_info_dto->order_id
    if (!get_chat_info_dto->order_id) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "orderId", get_chat_info_dto->order_id) == NULL) {
    goto fail; //Numeric
    }


    // get_chat_info_dto->type
    if (_api__get_chat_info_dto__NULL == get_chat_info_dto->type) {
        goto fail;
    }
    cJSON *type_local_JSON = chat_type_convertToJSON(get_chat_info_dto->type);
    if(type_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "type", type_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }


    // get_chat_info_dto->status
    if (_api__get_chat_info_dto__NULL == get_chat_info_dto->status) {
        goto fail;
    }
    cJSON *status_local_JSON = chat_status_type_convertToJSON(get_chat_info_dto->status);
    if(status_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "status", status_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }


    // get_chat_info_dto->created_at
    if (!get_chat_info_dto->created_at) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "createdAt", get_chat_info_dto->created_at) == NULL) {
    goto fail; //Date-Time
    }


    // get_chat_info_dto->updated_at
    if (!get_chat_info_dto->updated_at) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "updatedAt", get_chat_info_dto->updated_at) == NULL) {
    goto fail; //Date-Time
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

get_chat_info_dto_t *get_chat_info_dto_parseFromJSON(cJSON *get_chat_info_dtoJSON){

    get_chat_info_dto_t *get_chat_info_dto_local_var = NULL;

    // define the local variable for get_chat_info_dto->type
    chat_type_t *type_local_nonprim = NULL;

    // define the local variable for get_chat_info_dto->status
    chat_status_type_t *status_local_nonprim = NULL;

    // get_chat_info_dto->chat_id
    cJSON *chat_id = cJSON_GetObjectItemCaseSensitive(get_chat_info_dtoJSON, "chatId");
    if (!chat_id) {
        goto end;
    }

    
    if(!cJSON_IsNumber(chat_id))
    {
    goto end; //Numeric
    }

    // get_chat_info_dto->order_id
    cJSON *order_id = cJSON_GetObjectItemCaseSensitive(get_chat_info_dtoJSON, "orderId");
    if (!order_id) {
        goto end;
    }

    
    if(!cJSON_IsNumber(order_id))
    {
    goto end; //Numeric
    }

    // get_chat_info_dto->type
    cJSON *type = cJSON_GetObjectItemCaseSensitive(get_chat_info_dtoJSON, "type");
    if (!type) {
        goto end;
    }

    
    type_local_nonprim = chat_type_parseFromJSON(type); //custom

    // get_chat_info_dto->status
    cJSON *status = cJSON_GetObjectItemCaseSensitive(get_chat_info_dtoJSON, "status");
    if (!status) {
        goto end;
    }

    
    status_local_nonprim = chat_status_type_parseFromJSON(status); //custom

    // get_chat_info_dto->created_at
    cJSON *created_at = cJSON_GetObjectItemCaseSensitive(get_chat_info_dtoJSON, "createdAt");
    if (!created_at) {
        goto end;
    }

    
    if(!cJSON_IsString(created_at) && !cJSON_IsNull(created_at))
    {
    goto end; //DateTime
    }

    // get_chat_info_dto->updated_at
    cJSON *updated_at = cJSON_GetObjectItemCaseSensitive(get_chat_info_dtoJSON, "updatedAt");
    if (!updated_at) {
        goto end;
    }

    
    if(!cJSON_IsString(updated_at) && !cJSON_IsNull(updated_at))
    {
    goto end; //DateTime
    }


    get_chat_info_dto_local_var = get_chat_info_dto_create (
        chat_id->valuedouble,
        order_id->valuedouble,
        type_local_nonprim,
        status_local_nonprim,
        strdup(created_at->valuestring),
        strdup(updated_at->valuestring)
        );

    return get_chat_info_dto_local_var;
end:
    if (type_local_nonprim) {
        chat_type_free(type_local_nonprim);
        type_local_nonprim = NULL;
    }
    if (status_local_nonprim) {
        chat_status_type_free(status_local_nonprim);
        status_local_nonprim = NULL;
    }
    return NULL;

}
