#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "calculate_tariffs_offer_dto.h"



calculate_tariffs_offer_dto_t *calculate_tariffs_offer_dto_create(
    long category_id,
    double price,
    double length,
    double width,
    double height,
    double weight,
    int quantity
    ) {
    calculate_tariffs_offer_dto_t *calculate_tariffs_offer_dto_local_var = malloc(sizeof(calculate_tariffs_offer_dto_t));
    if (!calculate_tariffs_offer_dto_local_var) {
        return NULL;
    }
    calculate_tariffs_offer_dto_local_var->category_id = category_id;
    calculate_tariffs_offer_dto_local_var->price = price;
    calculate_tariffs_offer_dto_local_var->length = length;
    calculate_tariffs_offer_dto_local_var->width = width;
    calculate_tariffs_offer_dto_local_var->height = height;
    calculate_tariffs_offer_dto_local_var->weight = weight;
    calculate_tariffs_offer_dto_local_var->quantity = quantity;

    return calculate_tariffs_offer_dto_local_var;
}


void calculate_tariffs_offer_dto_free(calculate_tariffs_offer_dto_t *calculate_tariffs_offer_dto) {
    if(NULL == calculate_tariffs_offer_dto){
        return ;
    }
    listEntry_t *listEntry;
    free(calculate_tariffs_offer_dto);
}

cJSON *calculate_tariffs_offer_dto_convertToJSON(calculate_tariffs_offer_dto_t *calculate_tariffs_offer_dto) {
    cJSON *item = cJSON_CreateObject();

    // calculate_tariffs_offer_dto->category_id
    if (!calculate_tariffs_offer_dto->category_id) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "categoryId", calculate_tariffs_offer_dto->category_id) == NULL) {
    goto fail; //Numeric
    }


    // calculate_tariffs_offer_dto->price
    if (!calculate_tariffs_offer_dto->price) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "price", calculate_tariffs_offer_dto->price) == NULL) {
    goto fail; //Numeric
    }


    // calculate_tariffs_offer_dto->length
    if (!calculate_tariffs_offer_dto->length) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "length", calculate_tariffs_offer_dto->length) == NULL) {
    goto fail; //Numeric
    }


    // calculate_tariffs_offer_dto->width
    if (!calculate_tariffs_offer_dto->width) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "width", calculate_tariffs_offer_dto->width) == NULL) {
    goto fail; //Numeric
    }


    // calculate_tariffs_offer_dto->height
    if (!calculate_tariffs_offer_dto->height) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "height", calculate_tariffs_offer_dto->height) == NULL) {
    goto fail; //Numeric
    }


    // calculate_tariffs_offer_dto->weight
    if (!calculate_tariffs_offer_dto->weight) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "weight", calculate_tariffs_offer_dto->weight) == NULL) {
    goto fail; //Numeric
    }


    // calculate_tariffs_offer_dto->quantity
    if(calculate_tariffs_offer_dto->quantity) {
    if(cJSON_AddNumberToObject(item, "quantity", calculate_tariffs_offer_dto->quantity) == NULL) {
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

calculate_tariffs_offer_dto_t *calculate_tariffs_offer_dto_parseFromJSON(cJSON *calculate_tariffs_offer_dtoJSON){

    calculate_tariffs_offer_dto_t *calculate_tariffs_offer_dto_local_var = NULL;

    // calculate_tariffs_offer_dto->category_id
    cJSON *category_id = cJSON_GetObjectItemCaseSensitive(calculate_tariffs_offer_dtoJSON, "categoryId");
    if (!category_id) {
        goto end;
    }

    
    if(!cJSON_IsNumber(category_id))
    {
    goto end; //Numeric
    }

    // calculate_tariffs_offer_dto->price
    cJSON *price = cJSON_GetObjectItemCaseSensitive(calculate_tariffs_offer_dtoJSON, "price");
    if (!price) {
        goto end;
    }

    
    if(!cJSON_IsNumber(price))
    {
    goto end; //Numeric
    }

    // calculate_tariffs_offer_dto->length
    cJSON *length = cJSON_GetObjectItemCaseSensitive(calculate_tariffs_offer_dtoJSON, "length");
    if (!length) {
        goto end;
    }

    
    if(!cJSON_IsNumber(length))
    {
    goto end; //Numeric
    }

    // calculate_tariffs_offer_dto->width
    cJSON *width = cJSON_GetObjectItemCaseSensitive(calculate_tariffs_offer_dtoJSON, "width");
    if (!width) {
        goto end;
    }

    
    if(!cJSON_IsNumber(width))
    {
    goto end; //Numeric
    }

    // calculate_tariffs_offer_dto->height
    cJSON *height = cJSON_GetObjectItemCaseSensitive(calculate_tariffs_offer_dtoJSON, "height");
    if (!height) {
        goto end;
    }

    
    if(!cJSON_IsNumber(height))
    {
    goto end; //Numeric
    }

    // calculate_tariffs_offer_dto->weight
    cJSON *weight = cJSON_GetObjectItemCaseSensitive(calculate_tariffs_offer_dtoJSON, "weight");
    if (!weight) {
        goto end;
    }

    
    if(!cJSON_IsNumber(weight))
    {
    goto end; //Numeric
    }

    // calculate_tariffs_offer_dto->quantity
    cJSON *quantity = cJSON_GetObjectItemCaseSensitive(calculate_tariffs_offer_dtoJSON, "quantity");
    if (quantity) { 
    if(!cJSON_IsNumber(quantity))
    {
    goto end; //Numeric
    }
    }


    calculate_tariffs_offer_dto_local_var = calculate_tariffs_offer_dto_create (
        category_id->valuedouble,
        price->valuedouble,
        length->valuedouble,
        width->valuedouble,
        height->valuedouble,
        weight->valuedouble,
        quantity ? quantity->valuedouble : 0
        );

    return calculate_tariffs_offer_dto_local_var;
end:
    return NULL;

}
