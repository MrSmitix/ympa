#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "goods_stats_weight_dimensions_dto.h"



goods_stats_weight_dimensions_dto_t *goods_stats_weight_dimensions_dto_create(
    double length,
    double width,
    double height,
    double weight
    ) {
    goods_stats_weight_dimensions_dto_t *goods_stats_weight_dimensions_dto_local_var = malloc(sizeof(goods_stats_weight_dimensions_dto_t));
    if (!goods_stats_weight_dimensions_dto_local_var) {
        return NULL;
    }
    goods_stats_weight_dimensions_dto_local_var->length = length;
    goods_stats_weight_dimensions_dto_local_var->width = width;
    goods_stats_weight_dimensions_dto_local_var->height = height;
    goods_stats_weight_dimensions_dto_local_var->weight = weight;

    return goods_stats_weight_dimensions_dto_local_var;
}


void goods_stats_weight_dimensions_dto_free(goods_stats_weight_dimensions_dto_t *goods_stats_weight_dimensions_dto) {
    if(NULL == goods_stats_weight_dimensions_dto){
        return ;
    }
    listEntry_t *listEntry;
    free(goods_stats_weight_dimensions_dto);
}

cJSON *goods_stats_weight_dimensions_dto_convertToJSON(goods_stats_weight_dimensions_dto_t *goods_stats_weight_dimensions_dto) {
    cJSON *item = cJSON_CreateObject();

    // goods_stats_weight_dimensions_dto->length
    if(goods_stats_weight_dimensions_dto->length) {
    if(cJSON_AddNumberToObject(item, "length", goods_stats_weight_dimensions_dto->length) == NULL) {
    goto fail; //Numeric
    }
    }


    // goods_stats_weight_dimensions_dto->width
    if(goods_stats_weight_dimensions_dto->width) {
    if(cJSON_AddNumberToObject(item, "width", goods_stats_weight_dimensions_dto->width) == NULL) {
    goto fail; //Numeric
    }
    }


    // goods_stats_weight_dimensions_dto->height
    if(goods_stats_weight_dimensions_dto->height) {
    if(cJSON_AddNumberToObject(item, "height", goods_stats_weight_dimensions_dto->height) == NULL) {
    goto fail; //Numeric
    }
    }


    // goods_stats_weight_dimensions_dto->weight
    if(goods_stats_weight_dimensions_dto->weight) {
    if(cJSON_AddNumberToObject(item, "weight", goods_stats_weight_dimensions_dto->weight) == NULL) {
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

goods_stats_weight_dimensions_dto_t *goods_stats_weight_dimensions_dto_parseFromJSON(cJSON *goods_stats_weight_dimensions_dtoJSON){

    goods_stats_weight_dimensions_dto_t *goods_stats_weight_dimensions_dto_local_var = NULL;

    // goods_stats_weight_dimensions_dto->length
    cJSON *length = cJSON_GetObjectItemCaseSensitive(goods_stats_weight_dimensions_dtoJSON, "length");
    if (length) { 
    if(!cJSON_IsNumber(length))
    {
    goto end; //Numeric
    }
    }

    // goods_stats_weight_dimensions_dto->width
    cJSON *width = cJSON_GetObjectItemCaseSensitive(goods_stats_weight_dimensions_dtoJSON, "width");
    if (width) { 
    if(!cJSON_IsNumber(width))
    {
    goto end; //Numeric
    }
    }

    // goods_stats_weight_dimensions_dto->height
    cJSON *height = cJSON_GetObjectItemCaseSensitive(goods_stats_weight_dimensions_dtoJSON, "height");
    if (height) { 
    if(!cJSON_IsNumber(height))
    {
    goto end; //Numeric
    }
    }

    // goods_stats_weight_dimensions_dto->weight
    cJSON *weight = cJSON_GetObjectItemCaseSensitive(goods_stats_weight_dimensions_dtoJSON, "weight");
    if (weight) { 
    if(!cJSON_IsNumber(weight))
    {
    goto end; //Numeric
    }
    }


    goods_stats_weight_dimensions_dto_local_var = goods_stats_weight_dimensions_dto_create (
        length ? length->valuedouble : 0,
        width ? width->valuedouble : 0,
        height ? height->valuedouble : 0,
        weight ? weight->valuedouble : 0
        );

    return goods_stats_weight_dimensions_dto_local_var;
end:
    return NULL;

}
