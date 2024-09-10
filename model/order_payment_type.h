/*
 * order_payment_type.h
 *
 * Тип оплаты заказа:  * &#x60;PREPAID&#x60; — оплата при оформлении заказа.  * &#x60;POSTPAID&#x60; — оплата при получении заказа.  * &#x60;UNKNOWN&#x60; — неизвестный тип.  Если параметр отсутствует, заказ будет оплачен при получении. 
 */

#ifndef _order_payment_type_H_
#define _order_payment_type_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct order_payment_type_t order_payment_type_t;


// Enum  for order_payment_type

typedef enum { _api__order_payment_type__NULL = 0, _api__order_payment_type__PREPAID, _api__order_payment_type__POSTPAID, _api__order_payment_type__UNKNOWN } _api__order_payment_type__e;

char* order_payment_type_order_payment_type_ToString(_api__order_payment_type__e order_payment_type);

_api__order_payment_type__e order_payment_type_order_payment_type_FromString(char* order_payment_type);

//cJSON *order_payment_type_order_payment_type_convertToJSON(_api__order_payment_type__e order_payment_type);

//_api__order_payment_type__e order_payment_type_order_payment_type_parseFromJSON(cJSON *order_payment_typeJSON);

#endif /* _order_payment_type_H_ */

