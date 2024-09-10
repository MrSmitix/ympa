/*
 * orders_stats_payment_source_type.h
 *
 * Способ денежного перевода: - &#x60;BUYER&#x60; — оплата или возврат деньгами. - &#x60;CASHBACK&#x60; — оплата или возврат баллами Плюса. - &#x60;MARKETPLACE&#x60; — оплата или возврат купонами. - &#x60;SPLIT&#x60; — оплата картой по частям (Сплит). 
 */

#ifndef _orders_stats_payment_source_type_H_
#define _orders_stats_payment_source_type_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct orders_stats_payment_source_type_t orders_stats_payment_source_type_t;


// Enum  for orders_stats_payment_source_type

typedef enum { _api__orders_stats_payment_source_type__NULL = 0, _api__orders_stats_payment_source_type__BUYER, _api__orders_stats_payment_source_type__CASHBACK, _api__orders_stats_payment_source_type__MARKETPLACE, _api__orders_stats_payment_source_type__SPLIT } _api__orders_stats_payment_source_type__e;

char* orders_stats_payment_source_type_orders_stats_payment_source_type_ToString(_api__orders_stats_payment_source_type__e orders_stats_payment_source_type);

_api__orders_stats_payment_source_type__e orders_stats_payment_source_type_orders_stats_payment_source_type_FromString(char* orders_stats_payment_source_type);

//cJSON *orders_stats_payment_source_type_orders_stats_payment_source_type_convertToJSON(_api__orders_stats_payment_source_type__e orders_stats_payment_source_type);

//_api__orders_stats_payment_source_type__e orders_stats_payment_source_type_orders_stats_payment_source_type_parseFromJSON(cJSON *orders_stats_payment_source_typeJSON);

#endif /* _orders_stats_payment_source_type_H_ */

