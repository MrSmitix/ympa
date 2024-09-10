/*
 * order_item_promo_dto.h
 *
 * Информация о вознаграждениях партнеру за скидки на товар по промокодам, купонам и акциям.
 */

#ifndef _order_item_promo_dto_H_
#define _order_item_promo_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct order_item_promo_dto_t order_item_promo_dto_t;

#include "order_promo_type.h"

// Enum  for order_item_promo_dto

typedef enum  { _api__order_item_promo_dto__NULL = 0, _api__order_item_promo_dto__DIRECT_DISCOUNT, _api__order_item_promo_dto__BLUE_SET, _api__order_item_promo_dto__BLUE_FLASH, _api__order_item_promo_dto__GENERIC_BUNDLE, _api__order_item_promo_dto__MARKET_COUPON, _api__order_item_promo_dto__MARKET_PROMOCODE, _api__order_item_promo_dto__MARKET_DEAL, _api__order_item_promo_dto__MARKET_BLUE, _api__order_item_promo_dto__MARKET_PRIME, _api__order_item_promo_dto__YANDEX_PLUS, _api__order_item_promo_dto__BERU_PLUS, _api__order_item_promo_dto__MARKET_COIN, _api__order_item_promo_dto__YANDEX_EMPLOYEE, _api__order_item_promo_dto__LIMITED_FREE_DELIVERY_PROMO, _api__order_item_promo_dto__FREE_DELIVERY_THRESHOLD, _api__order_item_promo_dto__MULTICART_DISCOUNT, _api__order_item_promo_dto__PRICE_DROP_AS_YOU_SHOP, _api__order_item_promo_dto__FREE_DELIVERY_FOR_LDI, _api__order_item_promo_dto__FREE_DELIVERY_FOR_LSC, _api__order_item_promo_dto__SECRET_SALE, _api__order_item_promo_dto__FREE_PICKUP, _api__order_item_promo_dto__CHEAPEST_AS_GIFT, _api__order_item_promo_dto__CASHBACK, _api__order_item_promo_dto__SUPPLIER_MULTICART_DISCOUNT, _api__order_item_promo_dto__SPREAD_DISCOUNT_COUNT, _api__order_item_promo_dto__SPREAD_DISCOUNT_RECEIPT, _api__order_item_promo_dto__ANNOUNCEMENT_PROMO, _api__order_item_promo_dto__DISCOUNT_BY_PAYMENT_TYPE, _api__order_item_promo_dto__PERCENT_DISCOUNT, _api__order_item_promo_dto__DCO_EXTRA_DISCOUNT, _api__order_item_promo_dto__EMPTY_PROMO, _api__order_item_promo_dto__BLOCKING_PROMO, _api__order_item_promo_dto__UNKNOWN } _api__order_item_promo_dto__e;

char* order_item_promo_dto_type_ToString(_api__order_item_promo_dto__e type);

_api__order_item_promo_dto__e order_item_promo_dto_type_FromString(char* type);



typedef struct order_item_promo_dto_t {
    order_promo_type_t *type; // custom
    double discount; //numeric
    double subsidy; //numeric
    char *shop_promo_id; // string
    char *market_promo_id; // string

} order_item_promo_dto_t;

order_item_promo_dto_t *order_item_promo_dto_create(
    order_promo_type_t *type,
    double discount,
    double subsidy,
    char *shop_promo_id,
    char *market_promo_id
);

void order_item_promo_dto_free(order_item_promo_dto_t *order_item_promo_dto);

order_item_promo_dto_t *order_item_promo_dto_parseFromJSON(cJSON *order_item_promo_dtoJSON);

cJSON *order_item_promo_dto_convertToJSON(order_item_promo_dto_t *order_item_promo_dto);

#endif /* _order_item_promo_dto_H_ */

