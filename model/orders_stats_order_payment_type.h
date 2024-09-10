/*
 * orders_stats_order_payment_type.h
 *
 * Тип оплаты заказа: - &#x60;CREDIT&#x60; — заказ оформлен в кредит. - &#x60;POSTPAID&#x60; — заказ оплачен после того, как был получен. - &#x60;PREPAID&#x60; — заказ оплачен до того, как был получен. 
 */

#ifndef _orders_stats_order_payment_type_H_
#define _orders_stats_order_payment_type_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct orders_stats_order_payment_type_t orders_stats_order_payment_type_t;


// Enum  for orders_stats_order_payment_type

typedef enum { _api__orders_stats_order_payment_type__NULL = 0, _api__orders_stats_order_payment_type__CREDIT, _api__orders_stats_order_payment_type__POSTPAID, _api__orders_stats_order_payment_type__PREPAID, _api__orders_stats_order_payment_type__TINKOFF_CREDIT } _api__orders_stats_order_payment_type__e;

char* orders_stats_order_payment_type_orders_stats_order_payment_type_ToString(_api__orders_stats_order_payment_type__e orders_stats_order_payment_type);

_api__orders_stats_order_payment_type__e orders_stats_order_payment_type_orders_stats_order_payment_type_FromString(char* orders_stats_order_payment_type);

//cJSON *orders_stats_order_payment_type_orders_stats_order_payment_type_convertToJSON(_api__orders_stats_order_payment_type__e orders_stats_order_payment_type);

//_api__orders_stats_order_payment_type__e orders_stats_order_payment_type_orders_stats_order_payment_type_parseFromJSON(cJSON *orders_stats_order_payment_typeJSON);

#endif /* _orders_stats_order_payment_type_H_ */

