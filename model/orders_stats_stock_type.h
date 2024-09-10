/*
 * orders_stats_stock_type.h
 *
 * Тип товара:  * &#x60;DEFECT&#x60; — товар бракованный.  * &#x60;FIT&#x60; — товар надлежащего качества. 
 */

#ifndef _orders_stats_stock_type_H_
#define _orders_stats_stock_type_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct orders_stats_stock_type_t orders_stats_stock_type_t;


// Enum  for orders_stats_stock_type

typedef enum { _api__orders_stats_stock_type__NULL = 0, _api__orders_stats_stock_type__FIT, _api__orders_stats_stock_type__FREEZE, _api__orders_stats_stock_type__AVAILABLE, _api__orders_stats_stock_type__QUARANTINE, _api__orders_stats_stock_type__UTILIZATION, _api__orders_stats_stock_type__DEFECT, _api__orders_stats_stock_type__EXPIRED } _api__orders_stats_stock_type__e;

char* orders_stats_stock_type_orders_stats_stock_type_ToString(_api__orders_stats_stock_type__e orders_stats_stock_type);

_api__orders_stats_stock_type__e orders_stats_stock_type_orders_stats_stock_type_FromString(char* orders_stats_stock_type);

//cJSON *orders_stats_stock_type_orders_stats_stock_type_convertToJSON(_api__orders_stats_stock_type__e orders_stats_stock_type);

//_api__orders_stats_stock_type__e orders_stats_stock_type_orders_stats_stock_type_parseFromJSON(cJSON *orders_stats_stock_typeJSON);

#endif /* _orders_stats_stock_type_H_ */

