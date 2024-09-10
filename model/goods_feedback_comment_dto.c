#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "goods_feedback_comment_dto.h"


char* goods_feedback_comment_dto_status_ToString(_api__goods_feedback_comment_dto__e status) {
    char* statusArray[] =  { "NULL", "PUBLISHED", "UNMODERATED", "BANNED", "DELETED" };
    return statusArray[status];
}

_api__goods_feedback_comment_dto__e goods_feedback_comment_dto_status_FromString(char* status){
    int stringToReturn = 0;
    char *statusArray[] =  { "NULL", "PUBLISHED", "UNMODERATED", "BANNED", "DELETED" };
    size_t sizeofArray = sizeof(statusArray) / sizeof(statusArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(status, statusArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

goods_feedback_comment_dto_t *goods_feedback_comment_dto_create(
    long id,
    char *text,
    int can_modify,
    long parent_id,
    goods_feedback_comment_author_dto_t *author,
    goods_feedback_comment_status_type_t *status
    ) {
    goods_feedback_comment_dto_t *goods_feedback_comment_dto_local_var = malloc(sizeof(goods_feedback_comment_dto_t));
    if (!goods_feedback_comment_dto_local_var) {
        return NULL;
    }
    goods_feedback_comment_dto_local_var->id = id;
    goods_feedback_comment_dto_local_var->text = text;
    goods_feedback_comment_dto_local_var->can_modify = can_modify;
    goods_feedback_comment_dto_local_var->parent_id = parent_id;
    goods_feedback_comment_dto_local_var->author = author;
    goods_feedback_comment_dto_local_var->status = status;

    return goods_feedback_comment_dto_local_var;
}


void goods_feedback_comment_dto_free(goods_feedback_comment_dto_t *goods_feedback_comment_dto) {
    if(NULL == goods_feedback_comment_dto){
        return ;
    }
    listEntry_t *listEntry;
    if (goods_feedback_comment_dto->text) {
        free(goods_feedback_comment_dto->text);
        goods_feedback_comment_dto->text = NULL;
    }
    if (goods_feedback_comment_dto->author) {
        goods_feedback_comment_author_dto_free(goods_feedback_comment_dto->author);
        goods_feedback_comment_dto->author = NULL;
    }
    if (goods_feedback_comment_dto->status) {
        goods_feedback_comment_status_type_free(goods_feedback_comment_dto->status);
        goods_feedback_comment_dto->status = NULL;
    }
    free(goods_feedback_comment_dto);
}

cJSON *goods_feedback_comment_dto_convertToJSON(goods_feedback_comment_dto_t *goods_feedback_comment_dto) {
    cJSON *item = cJSON_CreateObject();

    // goods_feedback_comment_dto->id
    if (!goods_feedback_comment_dto->id) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "id", goods_feedback_comment_dto->id) == NULL) {
    goto fail; //Numeric
    }


    // goods_feedback_comment_dto->text
    if (!goods_feedback_comment_dto->text) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "text", goods_feedback_comment_dto->text) == NULL) {
    goto fail; //String
    }


    // goods_feedback_comment_dto->can_modify
    if(goods_feedback_comment_dto->can_modify) {
    if(cJSON_AddBoolToObject(item, "canModify", goods_feedback_comment_dto->can_modify) == NULL) {
    goto fail; //Bool
    }
    }


    // goods_feedback_comment_dto->parent_id
    if(goods_feedback_comment_dto->parent_id) {
    if(cJSON_AddNumberToObject(item, "parentId", goods_feedback_comment_dto->parent_id) == NULL) {
    goto fail; //Numeric
    }
    }


    // goods_feedback_comment_dto->author
    if (!goods_feedback_comment_dto->author) {
        goto fail;
    }
    cJSON *author_local_JSON = goods_feedback_comment_author_dto_convertToJSON(goods_feedback_comment_dto->author);
    if(author_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "author", author_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }


    // goods_feedback_comment_dto->status
    if (_api__goods_feedback_comment_dto__NULL == goods_feedback_comment_dto->status) {
        goto fail;
    }
    cJSON *status_local_JSON = goods_feedback_comment_status_type_convertToJSON(goods_feedback_comment_dto->status);
    if(status_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "status", status_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

goods_feedback_comment_dto_t *goods_feedback_comment_dto_parseFromJSON(cJSON *goods_feedback_comment_dtoJSON){

    goods_feedback_comment_dto_t *goods_feedback_comment_dto_local_var = NULL;

    // define the local variable for goods_feedback_comment_dto->author
    goods_feedback_comment_author_dto_t *author_local_nonprim = NULL;

    // define the local variable for goods_feedback_comment_dto->status
    goods_feedback_comment_status_type_t *status_local_nonprim = NULL;

    // goods_feedback_comment_dto->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(goods_feedback_comment_dtoJSON, "id");
    if (!id) {
        goto end;
    }

    
    if(!cJSON_IsNumber(id))
    {
    goto end; //Numeric
    }

    // goods_feedback_comment_dto->text
    cJSON *text = cJSON_GetObjectItemCaseSensitive(goods_feedback_comment_dtoJSON, "text");
    if (!text) {
        goto end;
    }

    
    if(!cJSON_IsString(text))
    {
    goto end; //String
    }

    // goods_feedback_comment_dto->can_modify
    cJSON *can_modify = cJSON_GetObjectItemCaseSensitive(goods_feedback_comment_dtoJSON, "canModify");
    if (can_modify) { 
    if(!cJSON_IsBool(can_modify))
    {
    goto end; //Bool
    }
    }

    // goods_feedback_comment_dto->parent_id
    cJSON *parent_id = cJSON_GetObjectItemCaseSensitive(goods_feedback_comment_dtoJSON, "parentId");
    if (parent_id) { 
    if(!cJSON_IsNumber(parent_id))
    {
    goto end; //Numeric
    }
    }

    // goods_feedback_comment_dto->author
    cJSON *author = cJSON_GetObjectItemCaseSensitive(goods_feedback_comment_dtoJSON, "author");
    if (!author) {
        goto end;
    }

    
    author_local_nonprim = goods_feedback_comment_author_dto_parseFromJSON(author); //nonprimitive

    // goods_feedback_comment_dto->status
    cJSON *status = cJSON_GetObjectItemCaseSensitive(goods_feedback_comment_dtoJSON, "status");
    if (!status) {
        goto end;
    }

    
    status_local_nonprim = goods_feedback_comment_status_type_parseFromJSON(status); //custom


    goods_feedback_comment_dto_local_var = goods_feedback_comment_dto_create (
        id->valuedouble,
        strdup(text->valuestring),
        can_modify ? can_modify->valueint : 0,
        parent_id ? parent_id->valuedouble : 0,
        author_local_nonprim,
        status_local_nonprim
        );

    return goods_feedback_comment_dto_local_var;
end:
    if (author_local_nonprim) {
        goods_feedback_comment_author_dto_free(author_local_nonprim);
        author_local_nonprim = NULL;
    }
    if (status_local_nonprim) {
        goods_feedback_comment_status_type_free(status_local_nonprim);
        status_local_nonprim = NULL;
    }
    return NULL;

}
