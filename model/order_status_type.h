/*
 * order_status_type.h
 *
 * Статус заказа:  * &#x60;CANCELLED&#x60; — отменен.  * &#x60;DELIVERED&#x60; — получен покупателем.  * &#x60;DELIVERY&#x60; — передан в службу доставки.  * &#x60;PICKUP&#x60; — доставлен в пункт самовывоза.  * &#x60;PROCESSING&#x60; — находится в обработке.  * &#x60;PENDING&#x60; — ожидает обработки со стороны продавца.  * &#x60;UNPAID&#x60; — оформлен, но еще не оплачен (если выбрана оплата при оформлении).  * &#x60;PLACING&#x60; — оформляется, подготовка к резервированию.  * &#x60;RESERVED&#x60; — зарезервирован, но недооформлен.  * &#x60;PARTIALLY_RETURNED&#x60; — возвращен частично.  * &#x60;RETURNED&#x60; — возвращен полностью.  * &#x60;UNKNOWN&#x60; — неизвестный статус.  Также могут возвращаться другие значения. Обрабатывать их не требуется. 
 */

#ifndef _order_status_type_H_
#define _order_status_type_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct order_status_type_t order_status_type_t;


// Enum  for order_status_type

typedef enum { _api__order_status_type__NULL = 0, _api__order_status_type__PLACING, _api__order_status_type__RESERVED, _api__order_status_type__UNPAID, _api__order_status_type__PROCESSING, _api__order_status_type__DELIVERY, _api__order_status_type__PICKUP, _api__order_status_type__DELIVERED, _api__order_status_type__CANCELLED, _api__order_status_type__PENDING, _api__order_status_type__PARTIALLY_RETURNED, _api__order_status_type__RETURNED, _api__order_status_type__UNKNOWN } _api__order_status_type__e;

char* order_status_type_order_status_type_ToString(_api__order_status_type__e order_status_type);

_api__order_status_type__e order_status_type_order_status_type_FromString(char* order_status_type);

//cJSON *order_status_type_order_status_type_convertToJSON(_api__order_status_type__e order_status_type);

//_api__order_status_type__e order_status_type_order_status_type_parseFromJSON(cJSON *order_status_typeJSON);

#endif /* _order_status_type_H_ */

