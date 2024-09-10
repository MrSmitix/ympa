#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "order_box_layout_partial_count_dto.h"



order_box_layout_partial_count_dto_t *order_box_layout_partial_count_dto_create(
    int current,
    int total
    ) {
    order_box_layout_partial_count_dto_t *order_box_layout_partial_count_dto_local_var = malloc(sizeof(order_box_layout_partial_count_dto_t));
    if (!order_box_layout_partial_count_dto_local_var) {
        return NULL;
    }
    order_box_layout_partial_count_dto_local_var->current = current;
    order_box_layout_partial_count_dto_local_var->total = total;

    return order_box_layout_partial_count_dto_local_var;
}


void order_box_layout_partial_count_dto_free(order_box_layout_partial_count_dto_t *order_box_layout_partial_count_dto) {
    if(NULL == order_box_layout_partial_count_dto){
        return ;
    }
    listEntry_t *listEntry;
    free(order_box_layout_partial_count_dto);
}

cJSON *order_box_layout_partial_count_dto_convertToJSON(order_box_layout_partial_count_dto_t *order_box_layout_partial_count_dto) {
    cJSON *item = cJSON_CreateObject();

    // order_box_layout_partial_count_dto->current
    if (!order_box_layout_partial_count_dto->current) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "current", order_box_layout_partial_count_dto->current) == NULL) {
    goto fail; //Numeric
    }


    // order_box_layout_partial_count_dto->total
    if (!order_box_layout_partial_count_dto->total) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "total", order_box_layout_partial_count_dto->total) == NULL) {
    goto fail; //Numeric
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

order_box_layout_partial_count_dto_t *order_box_layout_partial_count_dto_parseFromJSON(cJSON *order_box_layout_partial_count_dtoJSON){

    order_box_layout_partial_count_dto_t *order_box_layout_partial_count_dto_local_var = NULL;

    // order_box_layout_partial_count_dto->current
    cJSON *current = cJSON_GetObjectItemCaseSensitive(order_box_layout_partial_count_dtoJSON, "current");
    if (!current) {
        goto end;
    }

    
    if(!cJSON_IsNumber(current))
    {
    goto end; //Numeric
    }

    // order_box_layout_partial_count_dto->total
    cJSON *total = cJSON_GetObjectItemCaseSensitive(order_box_layout_partial_count_dtoJSON, "total");
    if (!total) {
        goto end;
    }

    
    if(!cJSON_IsNumber(total))
    {
    goto end; //Numeric
    }


    order_box_layout_partial_count_dto_local_var = order_box_layout_partial_count_dto_create (
        current->valuedouble,
        total->valuedouble
        );

    return order_box_layout_partial_count_dto_local_var;
end:
    return NULL;

}
