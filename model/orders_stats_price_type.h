/*
 * orders_stats_price_type.h
 *
 * Тип скидки или цена на товар: - &#x60;BUYER&#x60; — цена на товар с учетом скидок, в том числе купонов. - &#x60;CASHBACK&#x60; — баллы Плюса. - &#x60;MARKETPLACE&#x60; — купоны. 
 */

#ifndef _orders_stats_price_type_H_
#define _orders_stats_price_type_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct orders_stats_price_type_t orders_stats_price_type_t;


// Enum  for orders_stats_price_type

typedef enum { _api__orders_stats_price_type__NULL = 0, _api__orders_stats_price_type__BUYER, _api__orders_stats_price_type__CASHBACK, _api__orders_stats_price_type__MARKETPLACE } _api__orders_stats_price_type__e;

char* orders_stats_price_type_orders_stats_price_type_ToString(_api__orders_stats_price_type__e orders_stats_price_type);

_api__orders_stats_price_type__e orders_stats_price_type_orders_stats_price_type_FromString(char* orders_stats_price_type);

//cJSON *orders_stats_price_type_orders_stats_price_type_convertToJSON(_api__orders_stats_price_type__e orders_stats_price_type);

//_api__orders_stats_price_type__e orders_stats_price_type_orders_stats_price_type_parseFromJSON(cJSON *orders_stats_price_typeJSON);

#endif /* _orders_stats_price_type_H_ */

