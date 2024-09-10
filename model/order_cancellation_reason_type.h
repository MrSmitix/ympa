/*
 * order_cancellation_reason_type.h
 *
 * Варианты причин, по которым заказ не может быть отменен.  * &#x60;ORDER_DELIVERED&#x60; — заказ уже доставлен. * &#x60;ORDER_IN_DELIVERY&#x60; — заказ уже у курьера. 
 */

#ifndef _order_cancellation_reason_type_H_
#define _order_cancellation_reason_type_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct order_cancellation_reason_type_t order_cancellation_reason_type_t;


// Enum  for order_cancellation_reason_type

typedef enum { _api__order_cancellation_reason_type__NULL = 0, _api__order_cancellation_reason_type__ORDER_DELIVERED, _api__order_cancellation_reason_type__ORDER_IN_DELIVERY } _api__order_cancellation_reason_type__e;

char* order_cancellation_reason_type_order_cancellation_reason_type_ToString(_api__order_cancellation_reason_type__e order_cancellation_reason_type);

_api__order_cancellation_reason_type__e order_cancellation_reason_type_order_cancellation_reason_type_FromString(char* order_cancellation_reason_type);

//cJSON *order_cancellation_reason_type_order_cancellation_reason_type_convertToJSON(_api__order_cancellation_reason_type__e order_cancellation_reason_type);

//_api__order_cancellation_reason_type__e order_cancellation_reason_type_order_cancellation_reason_type_parseFromJSON(cJSON *order_cancellation_reason_typeJSON);

#endif /* _order_cancellation_reason_type_H_ */

