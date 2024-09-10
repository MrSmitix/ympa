#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "goods_feedback_statistics_dto.h"



goods_feedback_statistics_dto_t *goods_feedback_statistics_dto_create(
    int rating,
    long comments_count,
    int recommended,
    long paid_amount
    ) {
    goods_feedback_statistics_dto_t *goods_feedback_statistics_dto_local_var = malloc(sizeof(goods_feedback_statistics_dto_t));
    if (!goods_feedback_statistics_dto_local_var) {
        return NULL;
    }
    goods_feedback_statistics_dto_local_var->rating = rating;
    goods_feedback_statistics_dto_local_var->comments_count = comments_count;
    goods_feedback_statistics_dto_local_var->recommended = recommended;
    goods_feedback_statistics_dto_local_var->paid_amount = paid_amount;

    return goods_feedback_statistics_dto_local_var;
}


void goods_feedback_statistics_dto_free(goods_feedback_statistics_dto_t *goods_feedback_statistics_dto) {
    if(NULL == goods_feedback_statistics_dto){
        return ;
    }
    listEntry_t *listEntry;
    free(goods_feedback_statistics_dto);
}

cJSON *goods_feedback_statistics_dto_convertToJSON(goods_feedback_statistics_dto_t *goods_feedback_statistics_dto) {
    cJSON *item = cJSON_CreateObject();

    // goods_feedback_statistics_dto->rating
    if (!goods_feedback_statistics_dto->rating) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "rating", goods_feedback_statistics_dto->rating) == NULL) {
    goto fail; //Numeric
    }


    // goods_feedback_statistics_dto->comments_count
    if (!goods_feedback_statistics_dto->comments_count) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "commentsCount", goods_feedback_statistics_dto->comments_count) == NULL) {
    goto fail; //Numeric
    }


    // goods_feedback_statistics_dto->recommended
    if(goods_feedback_statistics_dto->recommended) {
    if(cJSON_AddBoolToObject(item, "recommended", goods_feedback_statistics_dto->recommended) == NULL) {
    goto fail; //Bool
    }
    }


    // goods_feedback_statistics_dto->paid_amount
    if(goods_feedback_statistics_dto->paid_amount) {
    if(cJSON_AddNumberToObject(item, "paidAmount", goods_feedback_statistics_dto->paid_amount) == NULL) {
    goto fail; //Numeric
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

goods_feedback_statistics_dto_t *goods_feedback_statistics_dto_parseFromJSON(cJSON *goods_feedback_statistics_dtoJSON){

    goods_feedback_statistics_dto_t *goods_feedback_statistics_dto_local_var = NULL;

    // goods_feedback_statistics_dto->rating
    cJSON *rating = cJSON_GetObjectItemCaseSensitive(goods_feedback_statistics_dtoJSON, "rating");
    if (!rating) {
        goto end;
    }

    
    if(!cJSON_IsNumber(rating))
    {
    goto end; //Numeric
    }

    // goods_feedback_statistics_dto->comments_count
    cJSON *comments_count = cJSON_GetObjectItemCaseSensitive(goods_feedback_statistics_dtoJSON, "commentsCount");
    if (!comments_count) {
        goto end;
    }

    
    if(!cJSON_IsNumber(comments_count))
    {
    goto end; //Numeric
    }

    // goods_feedback_statistics_dto->recommended
    cJSON *recommended = cJSON_GetObjectItemCaseSensitive(goods_feedback_statistics_dtoJSON, "recommended");
    if (recommended) { 
    if(!cJSON_IsBool(recommended))
    {
    goto end; //Bool
    }
    }

    // goods_feedback_statistics_dto->paid_amount
    cJSON *paid_amount = cJSON_GetObjectItemCaseSensitive(goods_feedback_statistics_dtoJSON, "paidAmount");
    if (paid_amount) { 
    if(!cJSON_IsNumber(paid_amount))
    {
    goto end; //Numeric
    }
    }


    goods_feedback_statistics_dto_local_var = goods_feedback_statistics_dto_create (
        rating->valuedouble,
        comments_count->valuedouble,
        recommended ? recommended->valueint : 0,
        paid_amount ? paid_amount->valuedouble : 0
        );

    return goods_feedback_statistics_dto_local_var;
end:
    return NULL;

}
