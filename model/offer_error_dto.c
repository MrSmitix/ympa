#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "offer_error_dto.h"



offer_error_dto_t *offer_error_dto_create(
    char *message,
    char *comment
    ) {
    offer_error_dto_t *offer_error_dto_local_var = malloc(sizeof(offer_error_dto_t));
    if (!offer_error_dto_local_var) {
        return NULL;
    }
    offer_error_dto_local_var->message = message;
    offer_error_dto_local_var->comment = comment;

    return offer_error_dto_local_var;
}


void offer_error_dto_free(offer_error_dto_t *offer_error_dto) {
    if(NULL == offer_error_dto){
        return ;
    }
    listEntry_t *listEntry;
    if (offer_error_dto->message) {
        free(offer_error_dto->message);
        offer_error_dto->message = NULL;
    }
    if (offer_error_dto->comment) {
        free(offer_error_dto->comment);
        offer_error_dto->comment = NULL;
    }
    free(offer_error_dto);
}

cJSON *offer_error_dto_convertToJSON(offer_error_dto_t *offer_error_dto) {
    cJSON *item = cJSON_CreateObject();

    // offer_error_dto->message
    if(offer_error_dto->message) {
    if(cJSON_AddStringToObject(item, "message", offer_error_dto->message) == NULL) {
    goto fail; //String
    }
    }


    // offer_error_dto->comment
    if(offer_error_dto->comment) {
    if(cJSON_AddStringToObject(item, "comment", offer_error_dto->comment) == NULL) {
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

offer_error_dto_t *offer_error_dto_parseFromJSON(cJSON *offer_error_dtoJSON){

    offer_error_dto_t *offer_error_dto_local_var = NULL;

    // offer_error_dto->message
    cJSON *message = cJSON_GetObjectItemCaseSensitive(offer_error_dtoJSON, "message");
    if (message) { 
    if(!cJSON_IsString(message) && !cJSON_IsNull(message))
    {
    goto end; //String
    }
    }

    // offer_error_dto->comment
    cJSON *comment = cJSON_GetObjectItemCaseSensitive(offer_error_dtoJSON, "comment");
    if (comment) { 
    if(!cJSON_IsString(comment) && !cJSON_IsNull(comment))
    {
    goto end; //String
    }
    }


    offer_error_dto_local_var = offer_error_dto_create (
        message && !cJSON_IsNull(message) ? strdup(message->valuestring) : NULL,
        comment && !cJSON_IsNull(comment) ? strdup(comment->valuestring) : NULL
        );

    return offer_error_dto_local_var;
end:
    return NULL;

}
