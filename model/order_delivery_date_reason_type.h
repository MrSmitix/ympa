/*
 * order_delivery_date_reason_type.h
 *
 * Причина переноса доставки заказа. Возможные причины изменения даты:   - &#x60;&#x60;&#x60;USER_MOVED_DELIVERY_DATES&#x60;&#x60;&#x60; — покупатель попросил изменить дату или вы договорились привезти ему заказ раньше изначальной даты. Кроме этого указывается для подтверждения даты доставки товаров на заказ с долгой (31-60 дней) доставкой.   - &#x60;&#x60;&#x60;PARTNER_MOVED_DELIVERY_DATES&#x60;&#x60;&#x60; — магазин не может доставить заказ в срок. 
 */

#ifndef _order_delivery_date_reason_type_H_
#define _order_delivery_date_reason_type_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct order_delivery_date_reason_type_t order_delivery_date_reason_type_t;


// Enum  for order_delivery_date_reason_type

typedef enum { _api__order_delivery_date_reason_type__NULL = 0, _api__order_delivery_date_reason_type__USER_MOVED_DELIVERY_DATES, _api__order_delivery_date_reason_type__PARTNER_MOVED_DELIVERY_DATES } _api__order_delivery_date_reason_type__e;

char* order_delivery_date_reason_type_order_delivery_date_reason_type_ToString(_api__order_delivery_date_reason_type__e order_delivery_date_reason_type);

_api__order_delivery_date_reason_type__e order_delivery_date_reason_type_order_delivery_date_reason_type_FromString(char* order_delivery_date_reason_type);

//cJSON *order_delivery_date_reason_type_order_delivery_date_reason_type_convertToJSON(_api__order_delivery_date_reason_type__e order_delivery_date_reason_type);

//_api__order_delivery_date_reason_type__e order_delivery_date_reason_type_order_delivery_date_reason_type_parseFromJSON(cJSON *order_delivery_date_reason_typeJSON);

#endif /* _order_delivery_date_reason_type_H_ */

