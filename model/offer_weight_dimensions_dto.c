#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "offer_weight_dimensions_dto.h"



offer_weight_dimensions_dto_t *offer_weight_dimensions_dto_create(
    double length,
    double width,
    double height,
    double weight
    ) {
    offer_weight_dimensions_dto_t *offer_weight_dimensions_dto_local_var = malloc(sizeof(offer_weight_dimensions_dto_t));
    if (!offer_weight_dimensions_dto_local_var) {
        return NULL;
    }
    offer_weight_dimensions_dto_local_var->length = length;
    offer_weight_dimensions_dto_local_var->width = width;
    offer_weight_dimensions_dto_local_var->height = height;
    offer_weight_dimensions_dto_local_var->weight = weight;

    return offer_weight_dimensions_dto_local_var;
}


void offer_weight_dimensions_dto_free(offer_weight_dimensions_dto_t *offer_weight_dimensions_dto) {
    if(NULL == offer_weight_dimensions_dto){
        return ;
    }
    listEntry_t *listEntry;
    free(offer_weight_dimensions_dto);
}

cJSON *offer_weight_dimensions_dto_convertToJSON(offer_weight_dimensions_dto_t *offer_weight_dimensions_dto) {
    cJSON *item = cJSON_CreateObject();

    // offer_weight_dimensions_dto->length
    if (!offer_weight_dimensions_dto->length) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "length", offer_weight_dimensions_dto->length) == NULL) {
    goto fail; //Numeric
    }


    // offer_weight_dimensions_dto->width
    if (!offer_weight_dimensions_dto->width) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "width", offer_weight_dimensions_dto->width) == NULL) {
    goto fail; //Numeric
    }


    // offer_weight_dimensions_dto->height
    if (!offer_weight_dimensions_dto->height) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "height", offer_weight_dimensions_dto->height) == NULL) {
    goto fail; //Numeric
    }


    // offer_weight_dimensions_dto->weight
    if (!offer_weight_dimensions_dto->weight) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "weight", offer_weight_dimensions_dto->weight) == NULL) {
    goto fail; //Numeric
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

offer_weight_dimensions_dto_t *offer_weight_dimensions_dto_parseFromJSON(cJSON *offer_weight_dimensions_dtoJSON){

    offer_weight_dimensions_dto_t *offer_weight_dimensions_dto_local_var = NULL;

    // offer_weight_dimensions_dto->length
    cJSON *length = cJSON_GetObjectItemCaseSensitive(offer_weight_dimensions_dtoJSON, "length");
    if (!length) {
        goto end;
    }

    
    if(!cJSON_IsNumber(length))
    {
    goto end; //Numeric
    }

    // offer_weight_dimensions_dto->width
    cJSON *width = cJSON_GetObjectItemCaseSensitive(offer_weight_dimensions_dtoJSON, "width");
    if (!width) {
        goto end;
    }

    
    if(!cJSON_IsNumber(width))
    {
    goto end; //Numeric
    }

    // offer_weight_dimensions_dto->height
    cJSON *height = cJSON_GetObjectItemCaseSensitive(offer_weight_dimensions_dtoJSON, "height");
    if (!height) {
        goto end;
    }

    
    if(!cJSON_IsNumber(height))
    {
    goto end; //Numeric
    }

    // offer_weight_dimensions_dto->weight
    cJSON *weight = cJSON_GetObjectItemCaseSensitive(offer_weight_dimensions_dtoJSON, "weight");
    if (!weight) {
        goto end;
    }

    
    if(!cJSON_IsNumber(weight))
    {
    goto end; //Numeric
    }


    offer_weight_dimensions_dto_local_var = offer_weight_dimensions_dto_create (
        length->valuedouble,
        width->valuedouble,
        height->valuedouble,
        weight->valuedouble
        );

    return offer_weight_dimensions_dto_local_var;
end:
    return NULL;

}
