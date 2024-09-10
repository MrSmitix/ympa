/*
 * order_delivery_dispatch_type.h
 *
 * Способ отгрузки:  * &#x60;BUYER&#x60; — доставка покупателю.  * &#x60;MARKET_PARTNER_OUTLET&#x60; — доставка в пункт выдачи партнера.  * &#x60;MARKET_BRANDED_OUTLET&#x60; — доставка в пункт выдачи заказов Маркета.  * &#x60;SHOP_OUTLET&#x60; — доставка в пункт выдачи заказов магазина.  * &#x60;DROPOFF&#x60; — доставка в пункт выдачи, который принимает заказы от продавцов и передает их курьерам.  * &#x60;UNKNOWN&#x60; — неизвестный тип. 
 */

#ifndef _order_delivery_dispatch_type_H_
#define _order_delivery_dispatch_type_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct order_delivery_dispatch_type_t order_delivery_dispatch_type_t;


// Enum  for order_delivery_dispatch_type

typedef enum { _api__order_delivery_dispatch_type__NULL = 0, _api__order_delivery_dispatch_type__UNKNOWN, _api__order_delivery_dispatch_type__BUYER, _api__order_delivery_dispatch_type__MARKET_PARTNER_OUTLET, _api__order_delivery_dispatch_type__MARKET_BRANDED_OUTLET, _api__order_delivery_dispatch_type__SHOP_OUTLET, _api__order_delivery_dispatch_type__DROPOFF } _api__order_delivery_dispatch_type__e;

char* order_delivery_dispatch_type_order_delivery_dispatch_type_ToString(_api__order_delivery_dispatch_type__e order_delivery_dispatch_type);

_api__order_delivery_dispatch_type__e order_delivery_dispatch_type_order_delivery_dispatch_type_FromString(char* order_delivery_dispatch_type);

//cJSON *order_delivery_dispatch_type_order_delivery_dispatch_type_convertToJSON(_api__order_delivery_dispatch_type__e order_delivery_dispatch_type);

//_api__order_delivery_dispatch_type__e order_delivery_dispatch_type_order_delivery_dispatch_type_parseFromJSON(cJSON *order_delivery_dispatch_typeJSON);

#endif /* _order_delivery_dispatch_type_H_ */

