#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "goods_feedback_description_dto.h"



goods_feedback_description_dto_t *goods_feedback_description_dto_create(
    char *advantages,
    char *disadvantages,
    char *comment
    ) {
    goods_feedback_description_dto_t *goods_feedback_description_dto_local_var = malloc(sizeof(goods_feedback_description_dto_t));
    if (!goods_feedback_description_dto_local_var) {
        return NULL;
    }
    goods_feedback_description_dto_local_var->advantages = advantages;
    goods_feedback_description_dto_local_var->disadvantages = disadvantages;
    goods_feedback_description_dto_local_var->comment = comment;

    return goods_feedback_description_dto_local_var;
}


void goods_feedback_description_dto_free(goods_feedback_description_dto_t *goods_feedback_description_dto) {
    if(NULL == goods_feedback_description_dto){
        return ;
    }
    listEntry_t *listEntry;
    if (goods_feedback_description_dto->advantages) {
        free(goods_feedback_description_dto->advantages);
        goods_feedback_description_dto->advantages = NULL;
    }
    if (goods_feedback_description_dto->disadvantages) {
        free(goods_feedback_description_dto->disadvantages);
        goods_feedback_description_dto->disadvantages = NULL;
    }
    if (goods_feedback_description_dto->comment) {
        free(goods_feedback_description_dto->comment);
        goods_feedback_description_dto->comment = NULL;
    }
    free(goods_feedback_description_dto);
}

cJSON *goods_feedback_description_dto_convertToJSON(goods_feedback_description_dto_t *goods_feedback_description_dto) {
    cJSON *item = cJSON_CreateObject();

    // goods_feedback_description_dto->advantages
    if(goods_feedback_description_dto->advantages) {
    if(cJSON_AddStringToObject(item, "advantages", goods_feedback_description_dto->advantages) == NULL) {
    goto fail; //String
    }
    }


    // goods_feedback_description_dto->disadvantages
    if(goods_feedback_description_dto->disadvantages) {
    if(cJSON_AddStringToObject(item, "disadvantages", goods_feedback_description_dto->disadvantages) == NULL) {
    goto fail; //String
    }
    }


    // goods_feedback_description_dto->comment
    if(goods_feedback_description_dto->comment) {
    if(cJSON_AddStringToObject(item, "comment", goods_feedback_description_dto->comment) == NULL) {
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

goods_feedback_description_dto_t *goods_feedback_description_dto_parseFromJSON(cJSON *goods_feedback_description_dtoJSON){

    goods_feedback_description_dto_t *goods_feedback_description_dto_local_var = NULL;

    // goods_feedback_description_dto->advantages
    cJSON *advantages = cJSON_GetObjectItemCaseSensitive(goods_feedback_description_dtoJSON, "advantages");
    if (advantages) { 
    if(!cJSON_IsString(advantages) && !cJSON_IsNull(advantages))
    {
    goto end; //String
    }
    }

    // goods_feedback_description_dto->disadvantages
    cJSON *disadvantages = cJSON_GetObjectItemCaseSensitive(goods_feedback_description_dtoJSON, "disadvantages");
    if (disadvantages) { 
    if(!cJSON_IsString(disadvantages) && !cJSON_IsNull(disadvantages))
    {
    goto end; //String
    }
    }

    // goods_feedback_description_dto->comment
    cJSON *comment = cJSON_GetObjectItemCaseSensitive(goods_feedback_description_dtoJSON, "comment");
    if (comment) { 
    if(!cJSON_IsString(comment) && !cJSON_IsNull(comment))
    {
    goto end; //String
    }
    }


    goods_feedback_description_dto_local_var = goods_feedback_description_dto_create (
        advantages && !cJSON_IsNull(advantages) ? strdup(advantages->valuestring) : NULL,
        disadvantages && !cJSON_IsNull(disadvantages) ? strdup(disadvantages->valuestring) : NULL,
        comment && !cJSON_IsNull(comment) ? strdup(comment->valuestring) : NULL
        );

    return goods_feedback_description_dto_local_var;
end:
    return NULL;

}
