#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "update_goods_feedback_comment_dto.h"



update_goods_feedback_comment_dto_t *update_goods_feedback_comment_dto_create(
    long id,
    long parent_id,
    char *text
    ) {
    update_goods_feedback_comment_dto_t *update_goods_feedback_comment_dto_local_var = malloc(sizeof(update_goods_feedback_comment_dto_t));
    if (!update_goods_feedback_comment_dto_local_var) {
        return NULL;
    }
    update_goods_feedback_comment_dto_local_var->id = id;
    update_goods_feedback_comment_dto_local_var->parent_id = parent_id;
    update_goods_feedback_comment_dto_local_var->text = text;

    return update_goods_feedback_comment_dto_local_var;
}


void update_goods_feedback_comment_dto_free(update_goods_feedback_comment_dto_t *update_goods_feedback_comment_dto) {
    if(NULL == update_goods_feedback_comment_dto){
        return ;
    }
    listEntry_t *listEntry;
    if (update_goods_feedback_comment_dto->text) {
        free(update_goods_feedback_comment_dto->text);
        update_goods_feedback_comment_dto->text = NULL;
    }
    free(update_goods_feedback_comment_dto);
}

cJSON *update_goods_feedback_comment_dto_convertToJSON(update_goods_feedback_comment_dto_t *update_goods_feedback_comment_dto) {
    cJSON *item = cJSON_CreateObject();

    // update_goods_feedback_comment_dto->id
    if(update_goods_feedback_comment_dto->id) {
    if(cJSON_AddNumberToObject(item, "id", update_goods_feedback_comment_dto->id) == NULL) {
    goto fail; //Numeric
    }
    }


    // update_goods_feedback_comment_dto->parent_id
    if(update_goods_feedback_comment_dto->parent_id) {
    if(cJSON_AddNumberToObject(item, "parentId", update_goods_feedback_comment_dto->parent_id) == NULL) {
    goto fail; //Numeric
    }
    }


    // update_goods_feedback_comment_dto->text
    if (!update_goods_feedback_comment_dto->text) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "text", update_goods_feedback_comment_dto->text) == NULL) {
    goto fail; //String
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

update_goods_feedback_comment_dto_t *update_goods_feedback_comment_dto_parseFromJSON(cJSON *update_goods_feedback_comment_dtoJSON){

    update_goods_feedback_comment_dto_t *update_goods_feedback_comment_dto_local_var = NULL;

    // update_goods_feedback_comment_dto->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(update_goods_feedback_comment_dtoJSON, "id");
    if (id) { 
    if(!cJSON_IsNumber(id))
    {
    goto end; //Numeric
    }
    }

    // update_goods_feedback_comment_dto->parent_id
    cJSON *parent_id = cJSON_GetObjectItemCaseSensitive(update_goods_feedback_comment_dtoJSON, "parentId");
    if (parent_id) { 
    if(!cJSON_IsNumber(parent_id))
    {
    goto end; //Numeric
    }
    }

    // update_goods_feedback_comment_dto->text
    cJSON *text = cJSON_GetObjectItemCaseSensitive(update_goods_feedback_comment_dtoJSON, "text");
    if (!text) {
        goto end;
    }

    
    if(!cJSON_IsString(text))
    {
    goto end; //String
    }


    update_goods_feedback_comment_dto_local_var = update_goods_feedback_comment_dto_create (
        id ? id->valuedouble : 0,
        parent_id ? parent_id->valuedouble : 0,
        strdup(text->valuestring)
        );

    return update_goods_feedback_comment_dto_local_var;
end:
    return NULL;

}
