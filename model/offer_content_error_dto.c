#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "offer_content_error_dto.h"


char* offer_content_error_dto_type_ToString(_api__offer_content_error_dto__e type) {
    char* typeArray[] =  { "NULL", "OFFER_NOT_FOUND", "UNKNOWN_CATEGORY", "CATEGORY_MISMATCH", "UNKNOWN_PARAMETER", "UNEXPECTED_BOOLEAN_VALUE", "NUMBER_FORMAT", "VALUE_BLANK", "INVALID_UNIT_ID", "INVALID_GROUP_ID_LENGTH", "INVALID_GROUP_ID_CHARACTERS" };
    return typeArray[type];
}

_api__offer_content_error_dto__e offer_content_error_dto_type_FromString(char* type){
    int stringToReturn = 0;
    char *typeArray[] =  { "NULL", "OFFER_NOT_FOUND", "UNKNOWN_CATEGORY", "CATEGORY_MISMATCH", "UNKNOWN_PARAMETER", "UNEXPECTED_BOOLEAN_VALUE", "NUMBER_FORMAT", "VALUE_BLANK", "INVALID_UNIT_ID", "INVALID_GROUP_ID_LENGTH", "INVALID_GROUP_ID_CHARACTERS" };
    size_t sizeofArray = sizeof(typeArray) / sizeof(typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(type, typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

offer_content_error_dto_t *offer_content_error_dto_create(
    offer_content_error_type_t *type,
    long parameter_id,
    char *message
    ) {
    offer_content_error_dto_t *offer_content_error_dto_local_var = malloc(sizeof(offer_content_error_dto_t));
    if (!offer_content_error_dto_local_var) {
        return NULL;
    }
    offer_content_error_dto_local_var->type = type;
    offer_content_error_dto_local_var->parameter_id = parameter_id;
    offer_content_error_dto_local_var->message = message;

    return offer_content_error_dto_local_var;
}


void offer_content_error_dto_free(offer_content_error_dto_t *offer_content_error_dto) {
    if(NULL == offer_content_error_dto){
        return ;
    }
    listEntry_t *listEntry;
    if (offer_content_error_dto->type) {
        offer_content_error_type_free(offer_content_error_dto->type);
        offer_content_error_dto->type = NULL;
    }
    if (offer_content_error_dto->message) {
        free(offer_content_error_dto->message);
        offer_content_error_dto->message = NULL;
    }
    free(offer_content_error_dto);
}

cJSON *offer_content_error_dto_convertToJSON(offer_content_error_dto_t *offer_content_error_dto) {
    cJSON *item = cJSON_CreateObject();

    // offer_content_error_dto->type
    if (_api__offer_content_error_dto__NULL == offer_content_error_dto->type) {
        goto fail;
    }
    cJSON *type_local_JSON = offer_content_error_type_convertToJSON(offer_content_error_dto->type);
    if(type_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "type", type_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }


    // offer_content_error_dto->parameter_id
    if(offer_content_error_dto->parameter_id) {
    if(cJSON_AddNumberToObject(item, "parameterId", offer_content_error_dto->parameter_id) == NULL) {
    goto fail; //Numeric
    }
    }


    // offer_content_error_dto->message
    if (!offer_content_error_dto->message) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "message", offer_content_error_dto->message) == NULL) {
    goto fail; //String
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

offer_content_error_dto_t *offer_content_error_dto_parseFromJSON(cJSON *offer_content_error_dtoJSON){

    offer_content_error_dto_t *offer_content_error_dto_local_var = NULL;

    // define the local variable for offer_content_error_dto->type
    offer_content_error_type_t *type_local_nonprim = NULL;

    // offer_content_error_dto->type
    cJSON *type = cJSON_GetObjectItemCaseSensitive(offer_content_error_dtoJSON, "type");
    if (!type) {
        goto end;
    }

    
    type_local_nonprim = offer_content_error_type_parseFromJSON(type); //custom

    // offer_content_error_dto->parameter_id
    cJSON *parameter_id = cJSON_GetObjectItemCaseSensitive(offer_content_error_dtoJSON, "parameterId");
    if (parameter_id) { 
    if(!cJSON_IsNumber(parameter_id))
    {
    goto end; //Numeric
    }
    }

    // offer_content_error_dto->message
    cJSON *message = cJSON_GetObjectItemCaseSensitive(offer_content_error_dtoJSON, "message");
    if (!message) {
        goto end;
    }

    
    if(!cJSON_IsString(message))
    {
    goto end; //String
    }


    offer_content_error_dto_local_var = offer_content_error_dto_create (
        type_local_nonprim,
        parameter_id ? parameter_id->valuedouble : 0,
        strdup(message->valuestring)
        );

    return offer_content_error_dto_local_var;
end:
    if (type_local_nonprim) {
        offer_content_error_type_free(type_local_nonprim);
        type_local_nonprim = NULL;
    }
    return NULL;

}
