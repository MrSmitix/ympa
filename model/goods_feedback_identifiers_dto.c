#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "goods_feedback_identifiers_dto.h"



goods_feedback_identifiers_dto_t *goods_feedback_identifiers_dto_create(
    long order_id,
    long model_id
    ) {
    goods_feedback_identifiers_dto_t *goods_feedback_identifiers_dto_local_var = malloc(sizeof(goods_feedback_identifiers_dto_t));
    if (!goods_feedback_identifiers_dto_local_var) {
        return NULL;
    }
    goods_feedback_identifiers_dto_local_var->order_id = order_id;
    goods_feedback_identifiers_dto_local_var->model_id = model_id;

    return goods_feedback_identifiers_dto_local_var;
}


void goods_feedback_identifiers_dto_free(goods_feedback_identifiers_dto_t *goods_feedback_identifiers_dto) {
    if(NULL == goods_feedback_identifiers_dto){
        return ;
    }
    listEntry_t *listEntry;
    free(goods_feedback_identifiers_dto);
}

cJSON *goods_feedback_identifiers_dto_convertToJSON(goods_feedback_identifiers_dto_t *goods_feedback_identifiers_dto) {
    cJSON *item = cJSON_CreateObject();

    // goods_feedback_identifiers_dto->order_id
    if (!goods_feedback_identifiers_dto->order_id) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "orderId", goods_feedback_identifiers_dto->order_id) == NULL) {
    goto fail; //Numeric
    }


    // goods_feedback_identifiers_dto->model_id
    if (!goods_feedback_identifiers_dto->model_id) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "modelId", goods_feedback_identifiers_dto->model_id) == NULL) {
    goto fail; //Numeric
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

goods_feedback_identifiers_dto_t *goods_feedback_identifiers_dto_parseFromJSON(cJSON *goods_feedback_identifiers_dtoJSON){

    goods_feedback_identifiers_dto_t *goods_feedback_identifiers_dto_local_var = NULL;

    // goods_feedback_identifiers_dto->order_id
    cJSON *order_id = cJSON_GetObjectItemCaseSensitive(goods_feedback_identifiers_dtoJSON, "orderId");
    if (!order_id) {
        goto end;
    }

    
    if(!cJSON_IsNumber(order_id))
    {
    goto end; //Numeric
    }

    // goods_feedback_identifiers_dto->model_id
    cJSON *model_id = cJSON_GetObjectItemCaseSensitive(goods_feedback_identifiers_dtoJSON, "modelId");
    if (!model_id) {
        goto end;
    }

    
    if(!cJSON_IsNumber(model_id))
    {
    goto end; //Numeric
    }


    goods_feedback_identifiers_dto_local_var = goods_feedback_identifiers_dto_create (
        order_id->valuedouble,
        model_id->valuedouble
        );

    return goods_feedback_identifiers_dto_local_var;
end:
    return NULL;

}
