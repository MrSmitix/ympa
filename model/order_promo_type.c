#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "order_promo_type.h"


char* order_promo_type_order_promo_type_ToString(_api__order_promo_type__e order_promo_type) {
    char *order_promo_typeArray[] =  { "NULL", "DIRECT_DISCOUNT", "BLUE_SET", "BLUE_FLASH", "GENERIC_BUNDLE", "MARKET_COUPON", "MARKET_PROMOCODE", "MARKET_DEAL", "MARKET_BLUE", "MARKET_PRIME", "YANDEX_PLUS", "BERU_PLUS", "MARKET_COIN", "YANDEX_EMPLOYEE", "LIMITED_FREE_DELIVERY_PROMO", "FREE_DELIVERY_THRESHOLD", "MULTICART_DISCOUNT", "PRICE_DROP_AS_YOU_SHOP", "FREE_DELIVERY_FOR_LDI", "FREE_DELIVERY_FOR_LSC", "SECRET_SALE", "FREE_PICKUP", "CHEAPEST_AS_GIFT", "CASHBACK", "SUPPLIER_MULTICART_DISCOUNT", "SPREAD_DISCOUNT_COUNT", "SPREAD_DISCOUNT_RECEIPT", "ANNOUNCEMENT_PROMO", "DISCOUNT_BY_PAYMENT_TYPE", "PERCENT_DISCOUNT", "DCO_EXTRA_DISCOUNT", "EMPTY_PROMO", "BLOCKING_PROMO", "UNKNOWN" };
    return order_promo_typeArray[order_promo_type];
}

_api__order_promo_type__e order_promo_type_order_promo_type_FromString(char* order_promo_type) {
    int stringToReturn = 0;
    char *order_promo_typeArray[] =  { "NULL", "DIRECT_DISCOUNT", "BLUE_SET", "BLUE_FLASH", "GENERIC_BUNDLE", "MARKET_COUPON", "MARKET_PROMOCODE", "MARKET_DEAL", "MARKET_BLUE", "MARKET_PRIME", "YANDEX_PLUS", "BERU_PLUS", "MARKET_COIN", "YANDEX_EMPLOYEE", "LIMITED_FREE_DELIVERY_PROMO", "FREE_DELIVERY_THRESHOLD", "MULTICART_DISCOUNT", "PRICE_DROP_AS_YOU_SHOP", "FREE_DELIVERY_FOR_LDI", "FREE_DELIVERY_FOR_LSC", "SECRET_SALE", "FREE_PICKUP", "CHEAPEST_AS_GIFT", "CASHBACK", "SUPPLIER_MULTICART_DISCOUNT", "SPREAD_DISCOUNT_COUNT", "SPREAD_DISCOUNT_RECEIPT", "ANNOUNCEMENT_PROMO", "DISCOUNT_BY_PAYMENT_TYPE", "PERCENT_DISCOUNT", "DCO_EXTRA_DISCOUNT", "EMPTY_PROMO", "BLOCKING_PROMO", "UNKNOWN" };
    size_t sizeofArray = sizeof(order_promo_typeArray) / sizeof(order_promo_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(order_promo_type, order_promo_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *order_promo_type_order_promo_type_convertToJSON(_api__order_promo_type__e order_promo_type) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "order_promo_type", order_promo_type_order_promo_type_ToString(order_promo_type)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

_api__order_promo_type__e order_promo_type_order_promo_type_parseFromJSON(cJSON *order_promo_typeJSON) {
    _api__order_promo_type__e *order_promo_type = NULL;
    _api__order_promo_type__e order_promo_typeVariable;
    cJSON *order_promo_typeVar = cJSON_GetObjectItemCaseSensitive(order_promo_typeJSON, "order_promo_type");
    if(!cJSON_IsString(order_promo_typeVar) || (order_promo_typeVar->valuestring == NULL)){
        goto end;
    }
    order_promo_typeVariable = order_promo_type_order_promo_type_FromString(order_promo_typeVar->valuestring);
    return order_promo_typeVariable;
end:
    return 0;
}
