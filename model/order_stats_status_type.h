/*
 * order_stats_status_type.h
 *
 * Текущий статус заказа:  * &#x60;CANCELLED_BEFORE_PROCESSING&#x60; — заказ отменен до начала его обработки.  * &#x60;CANCELLED_IN_DELIVERY&#x60; — заказ отменен во время его доставки.  * &#x60;CANCELLED_IN_PROCESSING&#x60; — заказ отменен во время его обработки.  * &#x60;DELIVERY&#x60; — заказ передан службе доставки.  * &#x60;DELIVERED&#x60; — заказ доставлен.  * &#x60;PARTIALLY_DELIVERED&#x60; — заказ частично доставлен.  * &#x60;PARTIALLY_RETURNED&#x60; — заказ частично возвращен покупателем.  * &#x60;PENDING&#x60; — заказ ожидает подтверждения.  * &#x60;PICKUP&#x60; — заказ доставлен в пункт выдачи.  * &#x60;PROCESSING&#x60; — заказ в обработке.  * &#x60;RESERVED&#x60; — товар зарезервирован на складе.  * &#x60;RETURNED&#x60; — заказ полностью возвращен покупателем.  * &#x60;UNKNOWN&#x60; — неизвестный статус заказа.  * &#x60;UNPAID&#x60; — заказ от юридического лица ожидает оплаты.  * &#x60;LOST&#x60; — заказ утерян. 
 */

#ifndef _order_stats_status_type_H_
#define _order_stats_status_type_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct order_stats_status_type_t order_stats_status_type_t;


// Enum  for order_stats_status_type

typedef enum { _api__order_stats_status_type__NULL = 0, _api__order_stats_status_type__CANCELLED_BEFORE_PROCESSING, _api__order_stats_status_type__CANCELLED_IN_DELIVERY, _api__order_stats_status_type__CANCELLED_IN_PROCESSING, _api__order_stats_status_type__DELIVERY, _api__order_stats_status_type__DELIVERED, _api__order_stats_status_type__PARTIALLY_DELIVERED, _api__order_stats_status_type__PARTIALLY_RETURNED, _api__order_stats_status_type__PENDING, _api__order_stats_status_type__PICKUP, _api__order_stats_status_type__PROCESSING, _api__order_stats_status_type__RESERVED, _api__order_stats_status_type__RETURNED, _api__order_stats_status_type__UNKNOWN, _api__order_stats_status_type__UNPAID, _api__order_stats_status_type__LOST } _api__order_stats_status_type__e;

char* order_stats_status_type_order_stats_status_type_ToString(_api__order_stats_status_type__e order_stats_status_type);

_api__order_stats_status_type__e order_stats_status_type_order_stats_status_type_FromString(char* order_stats_status_type);

//cJSON *order_stats_status_type_order_stats_status_type_convertToJSON(_api__order_stats_status_type__e order_stats_status_type);

//_api__order_stats_status_type__e order_stats_status_type_order_stats_status_type_parseFromJSON(cJSON *order_stats_status_typeJSON);

#endif /* _order_stats_status_type_H_ */

