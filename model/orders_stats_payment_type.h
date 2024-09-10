/*
 * orders_stats_payment_type.h
 *
 * Тип денежного перевода: - &#x60;PAYMENT&#x60; — оплата. - &#x60;REFUND&#x60; — возврат. 
 */

#ifndef _orders_stats_payment_type_H_
#define _orders_stats_payment_type_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct orders_stats_payment_type_t orders_stats_payment_type_t;


// Enum  for orders_stats_payment_type

typedef enum { _api__orders_stats_payment_type__NULL = 0, _api__orders_stats_payment_type__PAYMENT, _api__orders_stats_payment_type__REFUND, _api__orders_stats_payment_type__UNKNOWN } _api__orders_stats_payment_type__e;

char* orders_stats_payment_type_orders_stats_payment_type_ToString(_api__orders_stats_payment_type__e orders_stats_payment_type);

_api__orders_stats_payment_type__e orders_stats_payment_type_orders_stats_payment_type_FromString(char* orders_stats_payment_type);

//cJSON *orders_stats_payment_type_orders_stats_payment_type_convertToJSON(_api__orders_stats_payment_type__e orders_stats_payment_type);

//_api__orders_stats_payment_type__e orders_stats_payment_type_orders_stats_payment_type_parseFromJSON(cJSON *orders_stats_payment_typeJSON);

#endif /* _orders_stats_payment_type_H_ */

