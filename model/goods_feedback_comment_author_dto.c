#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "goods_feedback_comment_author_dto.h"


char* goods_feedback_comment_author_dto_type_ToString(_api__goods_feedback_comment_author_dto__e type) {
    char* typeArray[] =  { "NULL", "USER", "BUSINESS" };
    return typeArray[type];
}

_api__goods_feedback_comment_author_dto__e goods_feedback_comment_author_dto_type_FromString(char* type){
    int stringToReturn = 0;
    char *typeArray[] =  { "NULL", "USER", "BUSINESS" };
    size_t sizeofArray = sizeof(typeArray) / sizeof(typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(type, typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

goods_feedback_comment_author_dto_t *goods_feedback_comment_author_dto_create(
    goods_feedback_comment_author_type_t *type,
    char *name
    ) {
    goods_feedback_comment_author_dto_t *goods_feedback_comment_author_dto_local_var = malloc(sizeof(goods_feedback_comment_author_dto_t));
    if (!goods_feedback_comment_author_dto_local_var) {
        return NULL;
    }
    goods_feedback_comment_author_dto_local_var->type = type;
    goods_feedback_comment_author_dto_local_var->name = name;

    return goods_feedback_comment_author_dto_local_var;
}


void goods_feedback_comment_author_dto_free(goods_feedback_comment_author_dto_t *goods_feedback_comment_author_dto) {
    if(NULL == goods_feedback_comment_author_dto){
        return ;
    }
    listEntry_t *listEntry;
    if (goods_feedback_comment_author_dto->type) {
        goods_feedback_comment_author_type_free(goods_feedback_comment_author_dto->type);
        goods_feedback_comment_author_dto->type = NULL;
    }
    if (goods_feedback_comment_author_dto->name) {
        free(goods_feedback_comment_author_dto->name);
        goods_feedback_comment_author_dto->name = NULL;
    }
    free(goods_feedback_comment_author_dto);
}

cJSON *goods_feedback_comment_author_dto_convertToJSON(goods_feedback_comment_author_dto_t *goods_feedback_comment_author_dto) {
    cJSON *item = cJSON_CreateObject();

    // goods_feedback_comment_author_dto->type
    if(goods_feedback_comment_author_dto->type != _api__goods_feedback_comment_author_dto__NULL) {
    cJSON *type_local_JSON = goods_feedback_comment_author_type_convertToJSON(goods_feedback_comment_author_dto->type);
    if(type_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "type", type_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // goods_feedback_comment_author_dto->name
    if(goods_feedback_comment_author_dto->name) {
    if(cJSON_AddStringToObject(item, "name", goods_feedback_comment_author_dto->name) == NULL) {
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

goods_feedback_comment_author_dto_t *goods_feedback_comment_author_dto_parseFromJSON(cJSON *goods_feedback_comment_author_dtoJSON){

    goods_feedback_comment_author_dto_t *goods_feedback_comment_author_dto_local_var = NULL;

    // define the local variable for goods_feedback_comment_author_dto->type
    goods_feedback_comment_author_type_t *type_local_nonprim = NULL;

    // goods_feedback_comment_author_dto->type
    cJSON *type = cJSON_GetObjectItemCaseSensitive(goods_feedback_comment_author_dtoJSON, "type");
    if (type) { 
    type_local_nonprim = goods_feedback_comment_author_type_parseFromJSON(type); //custom
    }

    // goods_feedback_comment_author_dto->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(goods_feedback_comment_author_dtoJSON, "name");
    if (name) { 
    if(!cJSON_IsString(name) && !cJSON_IsNull(name))
    {
    goto end; //String
    }
    }


    goods_feedback_comment_author_dto_local_var = goods_feedback_comment_author_dto_create (
        type ? type_local_nonprim : NULL,
        name && !cJSON_IsNull(name) ? strdup(name->valuestring) : NULL
        );

    return goods_feedback_comment_author_dto_local_var;
end:
    if (type_local_nonprim) {
        goods_feedback_comment_author_type_free(type_local_nonprim);
        type_local_nonprim = NULL;
    }
    return NULL;

}
