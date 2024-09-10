/*
 * order_delivery_type.h
 *
 * Способ доставки заказа:  * &#x60;DELIVERY&#x60; — курьерская доставка.  * &#x60;PICKUP&#x60; — самовывоз.  * &#x60;POST&#x60; — почта.  * &#x60;DIGITAL&#x60; — для цифровых товаров.  * &#x60;UNKNOWN&#x60; — неизвестный тип. 
 */

#ifndef _order_delivery_type_H_
#define _order_delivery_type_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct order_delivery_type_t order_delivery_type_t;


// Enum  for order_delivery_type

typedef enum { _api__order_delivery_type__NULL = 0, _api__order_delivery_type__DELIVERY, _api__order_delivery_type__PICKUP, _api__order_delivery_type__POST, _api__order_delivery_type__DIGITAL, _api__order_delivery_type__UNKNOWN } _api__order_delivery_type__e;

char* order_delivery_type_order_delivery_type_ToString(_api__order_delivery_type__e order_delivery_type);

_api__order_delivery_type__e order_delivery_type_order_delivery_type_FromString(char* order_delivery_type);

//cJSON *order_delivery_type_order_delivery_type_convertToJSON(_api__order_delivery_type__e order_delivery_type);

//_api__order_delivery_type__e order_delivery_type_order_delivery_type_parseFromJSON(cJSON *order_delivery_typeJSON);

#endif /* _order_delivery_type_H_ */

