#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "model_offer_dto.h"



model_offer_dto_t *model_offer_dto_create(
    int discount,
    char *name,
    int pos,
    double pre_discount_price,
    double price,
    long region_id,
    double shipping_cost,
    char *shop_name,
    int shop_rating,
    int in_stock
    ) {
    model_offer_dto_t *model_offer_dto_local_var = malloc(sizeof(model_offer_dto_t));
    if (!model_offer_dto_local_var) {
        return NULL;
    }
    model_offer_dto_local_var->discount = discount;
    model_offer_dto_local_var->name = name;
    model_offer_dto_local_var->pos = pos;
    model_offer_dto_local_var->pre_discount_price = pre_discount_price;
    model_offer_dto_local_var->price = price;
    model_offer_dto_local_var->region_id = region_id;
    model_offer_dto_local_var->shipping_cost = shipping_cost;
    model_offer_dto_local_var->shop_name = shop_name;
    model_offer_dto_local_var->shop_rating = shop_rating;
    model_offer_dto_local_var->in_stock = in_stock;

    return model_offer_dto_local_var;
}


void model_offer_dto_free(model_offer_dto_t *model_offer_dto) {
    if(NULL == model_offer_dto){
        return ;
    }
    listEntry_t *listEntry;
    if (model_offer_dto->name) {
        free(model_offer_dto->name);
        model_offer_dto->name = NULL;
    }
    if (model_offer_dto->shop_name) {
        free(model_offer_dto->shop_name);
        model_offer_dto->shop_name = NULL;
    }
    free(model_offer_dto);
}

cJSON *model_offer_dto_convertToJSON(model_offer_dto_t *model_offer_dto) {
    cJSON *item = cJSON_CreateObject();

    // model_offer_dto->discount
    if(model_offer_dto->discount) {
    if(cJSON_AddNumberToObject(item, "discount", model_offer_dto->discount) == NULL) {
    goto fail; //Numeric
    }
    }


    // model_offer_dto->name
    if(model_offer_dto->name) {
    if(cJSON_AddStringToObject(item, "name", model_offer_dto->name) == NULL) {
    goto fail; //String
    }
    }


    // model_offer_dto->pos
    if(model_offer_dto->pos) {
    if(cJSON_AddNumberToObject(item, "pos", model_offer_dto->pos) == NULL) {
    goto fail; //Numeric
    }
    }


    // model_offer_dto->pre_discount_price
    if(model_offer_dto->pre_discount_price) {
    if(cJSON_AddNumberToObject(item, "preDiscountPrice", model_offer_dto->pre_discount_price) == NULL) {
    goto fail; //Numeric
    }
    }


    // model_offer_dto->price
    if(model_offer_dto->price) {
    if(cJSON_AddNumberToObject(item, "price", model_offer_dto->price) == NULL) {
    goto fail; //Numeric
    }
    }


    // model_offer_dto->region_id
    if(model_offer_dto->region_id) {
    if(cJSON_AddNumberToObject(item, "regionId", model_offer_dto->region_id) == NULL) {
    goto fail; //Numeric
    }
    }


    // model_offer_dto->shipping_cost
    if(model_offer_dto->shipping_cost) {
    if(cJSON_AddNumberToObject(item, "shippingCost", model_offer_dto->shipping_cost) == NULL) {
    goto fail; //Numeric
    }
    }


    // model_offer_dto->shop_name
    if(model_offer_dto->shop_name) {
    if(cJSON_AddStringToObject(item, "shopName", model_offer_dto->shop_name) == NULL) {
    goto fail; //String
    }
    }


    // model_offer_dto->shop_rating
    if(model_offer_dto->shop_rating) {
    if(cJSON_AddNumberToObject(item, "shopRating", model_offer_dto->shop_rating) == NULL) {
    goto fail; //Numeric
    }
    }


    // model_offer_dto->in_stock
    if(model_offer_dto->in_stock) {
    if(cJSON_AddNumberToObject(item, "inStock", model_offer_dto->in_stock) == NULL) {
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

model_offer_dto_t *model_offer_dto_parseFromJSON(cJSON *model_offer_dtoJSON){

    model_offer_dto_t *model_offer_dto_local_var = NULL;

    // model_offer_dto->discount
    cJSON *discount = cJSON_GetObjectItemCaseSensitive(model_offer_dtoJSON, "discount");
    if (discount) { 
    if(!cJSON_IsNumber(discount))
    {
    goto end; //Numeric
    }
    }

    // model_offer_dto->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(model_offer_dtoJSON, "name");
    if (name) { 
    if(!cJSON_IsString(name) && !cJSON_IsNull(name))
    {
    goto end; //String
    }
    }

    // model_offer_dto->pos
    cJSON *pos = cJSON_GetObjectItemCaseSensitive(model_offer_dtoJSON, "pos");
    if (pos) { 
    if(!cJSON_IsNumber(pos))
    {
    goto end; //Numeric
    }
    }

    // model_offer_dto->pre_discount_price
    cJSON *pre_discount_price = cJSON_GetObjectItemCaseSensitive(model_offer_dtoJSON, "preDiscountPrice");
    if (pre_discount_price) { 
    if(!cJSON_IsNumber(pre_discount_price))
    {
    goto end; //Numeric
    }
    }

    // model_offer_dto->price
    cJSON *price = cJSON_GetObjectItemCaseSensitive(model_offer_dtoJSON, "price");
    if (price) { 
    if(!cJSON_IsNumber(price))
    {
    goto end; //Numeric
    }
    }

    // model_offer_dto->region_id
    cJSON *region_id = cJSON_GetObjectItemCaseSensitive(model_offer_dtoJSON, "regionId");
    if (region_id) { 
    if(!cJSON_IsNumber(region_id))
    {
    goto end; //Numeric
    }
    }

    // model_offer_dto->shipping_cost
    cJSON *shipping_cost = cJSON_GetObjectItemCaseSensitive(model_offer_dtoJSON, "shippingCost");
    if (shipping_cost) { 
    if(!cJSON_IsNumber(shipping_cost))
    {
    goto end; //Numeric
    }
    }

    // model_offer_dto->shop_name
    cJSON *shop_name = cJSON_GetObjectItemCaseSensitive(model_offer_dtoJSON, "shopName");
    if (shop_name) { 
    if(!cJSON_IsString(shop_name) && !cJSON_IsNull(shop_name))
    {
    goto end; //String
    }
    }

    // model_offer_dto->shop_rating
    cJSON *shop_rating = cJSON_GetObjectItemCaseSensitive(model_offer_dtoJSON, "shopRating");
    if (shop_rating) { 
    if(!cJSON_IsNumber(shop_rating))
    {
    goto end; //Numeric
    }
    }

    // model_offer_dto->in_stock
    cJSON *in_stock = cJSON_GetObjectItemCaseSensitive(model_offer_dtoJSON, "inStock");
    if (in_stock) { 
    if(!cJSON_IsNumber(in_stock))
    {
    goto end; //Numeric
    }
    }


    model_offer_dto_local_var = model_offer_dto_create (
        discount ? discount->valuedouble : 0,
        name && !cJSON_IsNull(name) ? strdup(name->valuestring) : NULL,
        pos ? pos->valuedouble : 0,
        pre_discount_price ? pre_discount_price->valuedouble : 0,
        price ? price->valuedouble : 0,
        region_id ? region_id->valuedouble : 0,
        shipping_cost ? shipping_cost->valuedouble : 0,
        shop_name && !cJSON_IsNull(shop_name) ? strdup(shop_name->valuestring) : NULL,
        shop_rating ? shop_rating->valuedouble : 0,
        in_stock ? in_stock->valuedouble : 0
        );

    return model_offer_dto_local_var;
end:
    return NULL;

}
