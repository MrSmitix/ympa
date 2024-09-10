#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "feedback_comment_author_dto.h"


char* feedback_comment_author_dto_type_ToString(_api__feedback_comment_author_dto__e type) {
    char* typeArray[] =  { "NULL", "USER", "SHOP" };
    return typeArray[type];
}

_api__feedback_comment_author_dto__e feedback_comment_author_dto_type_FromString(char* type){
    int stringToReturn = 0;
    char *typeArray[] =  { "NULL", "USER", "SHOP" };
    size_t sizeofArray = sizeof(typeArray) / sizeof(typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(type, typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

feedback_comment_author_dto_t *feedback_comment_author_dto_create(
    feedback_comment_author_type_t *type,
    char *name
    ) {
    feedback_comment_author_dto_t *feedback_comment_author_dto_local_var = malloc(sizeof(feedback_comment_author_dto_t));
    if (!feedback_comment_author_dto_local_var) {
        return NULL;
    }
    feedback_comment_author_dto_local_var->type = type;
    feedback_comment_author_dto_local_var->name = name;

    return feedback_comment_author_dto_local_var;
}


void feedback_comment_author_dto_free(feedback_comment_author_dto_t *feedback_comment_author_dto) {
    if(NULL == feedback_comment_author_dto){
        return ;
    }
    listEntry_t *listEntry;
    if (feedback_comment_author_dto->type) {
        feedback_comment_author_type_free(feedback_comment_author_dto->type);
        feedback_comment_author_dto->type = NULL;
    }
    if (feedback_comment_author_dto->name) {
        free(feedback_comment_author_dto->name);
        feedback_comment_author_dto->name = NULL;
    }
    free(feedback_comment_author_dto);
}

cJSON *feedback_comment_author_dto_convertToJSON(feedback_comment_author_dto_t *feedback_comment_author_dto) {
    cJSON *item = cJSON_CreateObject();

    // feedback_comment_author_dto->type
    if(feedback_comment_author_dto->type != _api__feedback_comment_author_dto__NULL) {
    cJSON *type_local_JSON = feedback_comment_author_type_convertToJSON(feedback_comment_author_dto->type);
    if(type_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "type", type_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // feedback_comment_author_dto->name
    if(feedback_comment_author_dto->name) {
    if(cJSON_AddStringToObject(item, "name", feedback_comment_author_dto->name) == NULL) {
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

feedback_comment_author_dto_t *feedback_comment_author_dto_parseFromJSON(cJSON *feedback_comment_author_dtoJSON){

    feedback_comment_author_dto_t *feedback_comment_author_dto_local_var = NULL;

    // define the local variable for feedback_comment_author_dto->type
    feedback_comment_author_type_t *type_local_nonprim = NULL;

    // feedback_comment_author_dto->type
    cJSON *type = cJSON_GetObjectItemCaseSensitive(feedback_comment_author_dtoJSON, "type");
    if (type) { 
    type_local_nonprim = feedback_comment_author_type_parseFromJSON(type); //custom
    }

    // feedback_comment_author_dto->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(feedback_comment_author_dtoJSON, "name");
    if (name) { 
    if(!cJSON_IsString(name) && !cJSON_IsNull(name))
    {
    goto end; //String
    }
    }


    feedback_comment_author_dto_local_var = feedback_comment_author_dto_create (
        type ? type_local_nonprim : NULL,
        name && !cJSON_IsNull(name) ? strdup(name->valuestring) : NULL
        );

    return feedback_comment_author_dto_local_var;
end:
    if (type_local_nonprim) {
        feedback_comment_author_type_free(type_local_nonprim);
        type_local_nonprim = NULL;
    }
    return NULL;

}
