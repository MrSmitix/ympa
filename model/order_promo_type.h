/*
 * order_promo_type.h
 *
 * Тип скидки:  * &#x60;DIRECT_DISCOUNT&#x60; — прямая скидка, которую устанавливает продавец или Маркет.  * &#x60;BLUE_SET&#x60; — комплекты.  * &#x60;BLUE_FLASH&#x60; — флеш-акция.  * &#x60;MARKET_COUPON&#x60; — скидка по промокоду Маркета.  * &#x60;MARKET_PROMOCODE&#x60; — скидка по промокоду магазина.  * &#x60;MARKET_BLUE&#x60; — скидка на Маркете.  * &#x60;YANDEX_PLUS&#x60; — бесплатная доставка с подпиской Яндекс Плюс.  * &#x60;YANDEX_EMPLOYEE&#x60; — бесплатная доставка по определенным адресам.  * &#x60;LIMITED_FREE_DELIVERY_PROMO&#x60; — бесплатная доставка по ограниченному предложению.  * &#x60;FREE_DELIVERY_THRESHOLD&#x60; — бесплатная доставка при достижении определенной суммы заказа.  * &#x60;MULTICART_DISCOUNT&#x60; — скидка за то, что оформлена мультикорзина.  * &#x60;FREE_DELIVERY_FOR_LDI&#x60; — бесплатная доставка за то, что один из товаров крупногабаритный.  * &#x60;FREE_DELIVERY_FOR_LSC&#x60; — бесплатная доставка за то, что одна из корзин в мультикорзине крупногабаритная.  * &#x60;FREE_PICKUP&#x60; — бесплатная доставка в пункт выдачи заказов.  * &#x60;CHEAPEST_AS_GIFT&#x60; — самый дешевый товар в подарок.  * &#x60;CASHBACK&#x60; — кешбэк.  * &#x60;SUPPLIER_MULTICART_DISCOUNT&#x60; — скидка за доставку.  * &#x60;SPREAD_DISCOUNT_COUNT&#x60; — скидка за количество одинаковых товаров.  * &#x60;SPREAD_DISCOUNT_RECEIPT&#x60; — скидка от суммы чека.  * &#x60;ANNOUNCEMENT_PROMO&#x60; — информационная акция, скидка не применяется к товарам.  * &#x60;DISCOUNT_BY_PAYMENT_TYPE&#x60; — прямая скидка при оплате картой Плюса.  * &#x60;PERCENT_DISCOUNT&#x60; — прямая скидка в процентах.  * &#x60;DCO_EXTRA_DISCOUNT&#x60; — дополнительная скидка, необходимая для расчета субсидии от Маркета.  * &#x60;EMPTY_PROMO&#x60; — скрытые промокоды.  * &#x60;BLOCKING_PROMO&#x60; — блокирующее промо.  * &#x60;UNKNOWN&#x60; — неизвестный тип.  Устаревшие типы:  * &#x60;GENERIC_BUNDLE&#x60;.  * &#x60;MARKET_DEAL&#x60;.  * &#x60;MARKET_PRIME&#x60;.  * &#x60;MARKET_COIN&#x60;.  * &#x60;BERU_PLUS&#x60;.  * &#x60;PRICE_DROP_AS_YOU_SHOP&#x60;.  * &#x60;SECRET_SALE&#x60;. 
 */

#ifndef _order_promo_type_H_
#define _order_promo_type_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct order_promo_type_t order_promo_type_t;


// Enum  for order_promo_type

typedef enum { _api__order_promo_type__NULL = 0, _api__order_promo_type__DIRECT_DISCOUNT, _api__order_promo_type__BLUE_SET, _api__order_promo_type__BLUE_FLASH, _api__order_promo_type__GENERIC_BUNDLE, _api__order_promo_type__MARKET_COUPON, _api__order_promo_type__MARKET_PROMOCODE, _api__order_promo_type__MARKET_DEAL, _api__order_promo_type__MARKET_BLUE, _api__order_promo_type__MARKET_PRIME, _api__order_promo_type__YANDEX_PLUS, _api__order_promo_type__BERU_PLUS, _api__order_promo_type__MARKET_COIN, _api__order_promo_type__YANDEX_EMPLOYEE, _api__order_promo_type__LIMITED_FREE_DELIVERY_PROMO, _api__order_promo_type__FREE_DELIVERY_THRESHOLD, _api__order_promo_type__MULTICART_DISCOUNT, _api__order_promo_type__PRICE_DROP_AS_YOU_SHOP, _api__order_promo_type__FREE_DELIVERY_FOR_LDI, _api__order_promo_type__FREE_DELIVERY_FOR_LSC, _api__order_promo_type__SECRET_SALE, _api__order_promo_type__FREE_PICKUP, _api__order_promo_type__CHEAPEST_AS_GIFT, _api__order_promo_type__CASHBACK, _api__order_promo_type__SUPPLIER_MULTICART_DISCOUNT, _api__order_promo_type__SPREAD_DISCOUNT_COUNT, _api__order_promo_type__SPREAD_DISCOUNT_RECEIPT, _api__order_promo_type__ANNOUNCEMENT_PROMO, _api__order_promo_type__DISCOUNT_BY_PAYMENT_TYPE, _api__order_promo_type__PERCENT_DISCOUNT, _api__order_promo_type__DCO_EXTRA_DISCOUNT, _api__order_promo_type__EMPTY_PROMO, _api__order_promo_type__BLOCKING_PROMO, _api__order_promo_type__UNKNOWN } _api__order_promo_type__e;

char* order_promo_type_order_promo_type_ToString(_api__order_promo_type__e order_promo_type);

_api__order_promo_type__e order_promo_type_order_promo_type_FromString(char* order_promo_type);

//cJSON *order_promo_type_order_promo_type_convertToJSON(_api__order_promo_type__e order_promo_type);

//_api__order_promo_type__e order_promo_type_order_promo_type_parseFromJSON(cJSON *order_promo_typeJSON);

#endif /* _order_promo_type_H_ */

