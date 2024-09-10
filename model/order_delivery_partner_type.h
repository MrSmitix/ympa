/*
 * order_delivery_partner_type.h
 *
 * Тип сотрудничества со службой доставки в рамках конкретного заказа:  * &#x60;SHOP&#x60; — магазин работает со службой доставки напрямую или доставляет заказы самостоятельно.  * &#x60;YANDEX_MARKET&#x60; — магазин работает со службой доставки через Маркет.  * &#x60;UNKNOWN&#x60; — неизвестный тип. 
 */

#ifndef _order_delivery_partner_type_H_
#define _order_delivery_partner_type_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct order_delivery_partner_type_t order_delivery_partner_type_t;


// Enum  for order_delivery_partner_type

typedef enum { _api__order_delivery_partner_type__NULL = 0, _api__order_delivery_partner_type__SHOP, _api__order_delivery_partner_type__YANDEX_MARKET, _api__order_delivery_partner_type__UNKNOWN } _api__order_delivery_partner_type__e;

char* order_delivery_partner_type_order_delivery_partner_type_ToString(_api__order_delivery_partner_type__e order_delivery_partner_type);

_api__order_delivery_partner_type__e order_delivery_partner_type_order_delivery_partner_type_FromString(char* order_delivery_partner_type);

//cJSON *order_delivery_partner_type_order_delivery_partner_type_convertToJSON(_api__order_delivery_partner_type__e order_delivery_partner_type);

//_api__order_delivery_partner_type__e order_delivery_partner_type_order_delivery_partner_type_parseFromJSON(cJSON *order_delivery_partner_typeJSON);

#endif /* _order_delivery_partner_type_H_ */

