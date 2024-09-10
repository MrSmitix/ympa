#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "api_error_dto.h"



api_error_dto_t *api_error_dto_create(
    char *code,
    char *message
    ) {
    api_error_dto_t *api_error_dto_local_var = malloc(sizeof(api_error_dto_t));
    if (!api_error_dto_local_var) {
        return NULL;
    }
    api_error_dto_local_var->code = code;
    api_error_dto_local_var->message = message;

    return api_error_dto_local_var;
}


void api_error_dto_free(api_error_dto_t *api_error_dto) {
    if(NULL == api_error_dto){
        return ;
    }
    listEntry_t *listEntry;
    if (api_error_dto->code) {
        free(api_error_dto->code);
        api_error_dto->code = NULL;
    }
    if (api_error_dto->message) {
        free(api_error_dto->message);
        api_error_dto->message = NULL;
    }
    free(api_error_dto);
}

cJSON *api_error_dto_convertToJSON(api_error_dto_t *api_error_dto) {
    cJSON *item = cJSON_CreateObject();

    // api_error_dto->code
    if (!api_error_dto->code) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "code", api_error_dto->code) == NULL) {
    goto fail; //String
    }


    // api_error_dto->message
    if(api_error_dto->message) {
    if(cJSON_AddStringToObject(item, "message", api_error_dto->message) == NULL) {
    goto fail; //String
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

api_error_dto_t *api_error_dto_parseFromJSON(cJSON *api_error_dtoJSON){

    api_error_dto_t *api_error_dto_local_var = NULL;

    // api_error_dto->code
    cJSON *code = cJSON_GetObjectItemCaseSensitive(api_error_dtoJSON, "code");
    if (!code) {
        goto end;
    }

    
    if(!cJSON_IsString(code))
    {
    goto end; //String
    }

    // api_error_dto->message
    cJSON *message = cJSON_GetObjectItemCaseSensitive(api_error_dtoJSON, "message");
    if (message) { 
    if(!cJSON_IsString(message) && !cJSON_IsNull(message))
    {
    goto end; //String
    }
    }


    api_error_dto_local_var = api_error_dto_create (
        strdup(code->valuestring),
        message && !cJSON_IsNull(message) ? strdup(message->valuestring) : NULL
        );

    return api_error_dto_local_var;
end:
    return NULL;

}
