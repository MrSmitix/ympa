#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "order_item_promo_dto.h"


char* order_item_promo_dto_type_ToString(_api__order_item_promo_dto__e type) {
    char* typeArray[] =  { "NULL", "DIRECT_DISCOUNT", "BLUE_SET", "BLUE_FLASH", "GENERIC_BUNDLE", "MARKET_COUPON", "MARKET_PROMOCODE", "MARKET_DEAL", "MARKET_BLUE", "MARKET_PRIME", "YANDEX_PLUS", "BERU_PLUS", "MARKET_COIN", "YANDEX_EMPLOYEE", "LIMITED_FREE_DELIVERY_PROMO", "FREE_DELIVERY_THRESHOLD", "MULTICART_DISCOUNT", "PRICE_DROP_AS_YOU_SHOP", "FREE_DELIVERY_FOR_LDI", "FREE_DELIVERY_FOR_LSC", "SECRET_SALE", "FREE_PICKUP", "CHEAPEST_AS_GIFT", "CASHBACK", "SUPPLIER_MULTICART_DISCOUNT", "SPREAD_DISCOUNT_COUNT", "SPREAD_DISCOUNT_RECEIPT", "ANNOUNCEMENT_PROMO", "DISCOUNT_BY_PAYMENT_TYPE", "PERCENT_DISCOUNT", "DCO_EXTRA_DISCOUNT", "EMPTY_PROMO", "BLOCKING_PROMO", "UNKNOWN" };
    return typeArray[type];
}

_api__order_item_promo_dto__e order_item_promo_dto_type_FromString(char* type){
    int stringToReturn = 0;
    char *typeArray[] =  { "NULL", "DIRECT_DISCOUNT", "BLUE_SET", "BLUE_FLASH", "GENERIC_BUNDLE", "MARKET_COUPON", "MARKET_PROMOCODE", "MARKET_DEAL", "MARKET_BLUE", "MARKET_PRIME", "YANDEX_PLUS", "BERU_PLUS", "MARKET_COIN", "YANDEX_EMPLOYEE", "LIMITED_FREE_DELIVERY_PROMO", "FREE_DELIVERY_THRESHOLD", "MULTICART_DISCOUNT", "PRICE_DROP_AS_YOU_SHOP", "FREE_DELIVERY_FOR_LDI", "FREE_DELIVERY_FOR_LSC", "SECRET_SALE", "FREE_PICKUP", "CHEAPEST_AS_GIFT", "CASHBACK", "SUPPLIER_MULTICART_DISCOUNT", "SPREAD_DISCOUNT_COUNT", "SPREAD_DISCOUNT_RECEIPT", "ANNOUNCEMENT_PROMO", "DISCOUNT_BY_PAYMENT_TYPE", "PERCENT_DISCOUNT", "DCO_EXTRA_DISCOUNT", "EMPTY_PROMO", "BLOCKING_PROMO", "UNKNOWN" };
    size_t sizeofArray = sizeof(typeArray) / sizeof(typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(type, typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

order_item_promo_dto_t *order_item_promo_dto_create(
    order_promo_type_t *type,
    double discount,
    double subsidy,
    char *shop_promo_id,
    char *market_promo_id
    ) {
    order_item_promo_dto_t *order_item_promo_dto_local_var = malloc(sizeof(order_item_promo_dto_t));
    if (!order_item_promo_dto_local_var) {
        return NULL;
    }
    order_item_promo_dto_local_var->type = type;
    order_item_promo_dto_local_var->discount = discount;
    order_item_promo_dto_local_var->subsidy = subsidy;
    order_item_promo_dto_local_var->shop_promo_id = shop_promo_id;
    order_item_promo_dto_local_var->market_promo_id = market_promo_id;

    return order_item_promo_dto_local_var;
}


void order_item_promo_dto_free(order_item_promo_dto_t *order_item_promo_dto) {
    if(NULL == order_item_promo_dto){
        return ;
    }
    listEntry_t *listEntry;
    if (order_item_promo_dto->type) {
        order_promo_type_free(order_item_promo_dto->type);
        order_item_promo_dto->type = NULL;
    }
    if (order_item_promo_dto->shop_promo_id) {
        free(order_item_promo_dto->shop_promo_id);
        order_item_promo_dto->shop_promo_id = NULL;
    }
    if (order_item_promo_dto->market_promo_id) {
        free(order_item_promo_dto->market_promo_id);
        order_item_promo_dto->market_promo_id = NULL;
    }
    free(order_item_promo_dto);
}

cJSON *order_item_promo_dto_convertToJSON(order_item_promo_dto_t *order_item_promo_dto) {
    cJSON *item = cJSON_CreateObject();

    // order_item_promo_dto->type
    if (_api__order_item_promo_dto__NULL == order_item_promo_dto->type) {
        goto fail;
    }
    cJSON *type_local_JSON = order_promo_type_convertToJSON(order_item_promo_dto->type);
    if(type_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "type", type_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }


    // order_item_promo_dto->discount
    if(order_item_promo_dto->discount) {
    if(cJSON_AddNumberToObject(item, "discount", order_item_promo_dto->discount) == NULL) {
    goto fail; //Numeric
    }
    }


    // order_item_promo_dto->subsidy
    if(order_item_promo_dto->subsidy) {
    if(cJSON_AddNumberToObject(item, "subsidy", order_item_promo_dto->subsidy) == NULL) {
    goto fail; //Numeric
    }
    }


    // order_item_promo_dto->shop_promo_id
    if(order_item_promo_dto->shop_promo_id) {
    if(cJSON_AddStringToObject(item, "shopPromoId", order_item_promo_dto->shop_promo_id) == NULL) {
    goto fail; //String
    }
    }


    // order_item_promo_dto->market_promo_id
    if(order_item_promo_dto->market_promo_id) {
    if(cJSON_AddStringToObject(item, "marketPromoId", order_item_promo_dto->market_promo_id) == NULL) {
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

order_item_promo_dto_t *order_item_promo_dto_parseFromJSON(cJSON *order_item_promo_dtoJSON){

    order_item_promo_dto_t *order_item_promo_dto_local_var = NULL;

    // define the local variable for order_item_promo_dto->type
    order_promo_type_t *type_local_nonprim = NULL;

    // order_item_promo_dto->type
    cJSON *type = cJSON_GetObjectItemCaseSensitive(order_item_promo_dtoJSON, "type");
    if (!type) {
        goto end;
    }

    
    type_local_nonprim = order_promo_type_parseFromJSON(type); //custom

    // order_item_promo_dto->discount
    cJSON *discount = cJSON_GetObjectItemCaseSensitive(order_item_promo_dtoJSON, "discount");
    if (discount) { 
    if(!cJSON_IsNumber(discount))
    {
    goto end; //Numeric
    }
    }

    // order_item_promo_dto->subsidy
    cJSON *subsidy = cJSON_GetObjectItemCaseSensitive(order_item_promo_dtoJSON, "subsidy");
    if (subsidy) { 
    if(!cJSON_IsNumber(subsidy))
    {
    goto end; //Numeric
    }
    }

    // order_item_promo_dto->shop_promo_id
    cJSON *shop_promo_id = cJSON_GetObjectItemCaseSensitive(order_item_promo_dtoJSON, "shopPromoId");
    if (shop_promo_id) { 
    if(!cJSON_IsString(shop_promo_id) && !cJSON_IsNull(shop_promo_id))
    {
    goto end; //String
    }
    }

    // order_item_promo_dto->market_promo_id
    cJSON *market_promo_id = cJSON_GetObjectItemCaseSensitive(order_item_promo_dtoJSON, "marketPromoId");
    if (market_promo_id) { 
    if(!cJSON_IsString(market_promo_id) && !cJSON_IsNull(market_promo_id))
    {
    goto end; //String
    }
    }


    order_item_promo_dto_local_var = order_item_promo_dto_create (
        type_local_nonprim,
        discount ? discount->valuedouble : 0,
        subsidy ? subsidy->valuedouble : 0,
        shop_promo_id && !cJSON_IsNull(shop_promo_id) ? strdup(shop_promo_id->valuestring) : NULL,
        market_promo_id && !cJSON_IsNull(market_promo_id) ? strdup(market_promo_id->valuestring) : NULL
        );

    return order_item_promo_dto_local_var;
end:
    if (type_local_nonprim) {
        order_promo_type_free(type_local_nonprim);
        type_local_nonprim = NULL;
    }
    return NULL;

}
