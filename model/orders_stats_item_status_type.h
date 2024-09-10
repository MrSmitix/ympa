/*
 * orders_stats_item_status_type.h
 *
 * Статус товара:  * &#x60;REJECTED&#x60; — товар был добавлен в созданный заказ, но не был оплачен. * &#x60;RETURNED&#x60; — товар вернули. 
 */

#ifndef _orders_stats_item_status_type_H_
#define _orders_stats_item_status_type_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct orders_stats_item_status_type_t orders_stats_item_status_type_t;


// Enum  for orders_stats_item_status_type

typedef enum { _api__orders_stats_item_status_type__NULL = 0, _api__orders_stats_item_status_type__REJECTED, _api__orders_stats_item_status_type__RETURNED } _api__orders_stats_item_status_type__e;

char* orders_stats_item_status_type_orders_stats_item_status_type_ToString(_api__orders_stats_item_status_type__e orders_stats_item_status_type);

_api__orders_stats_item_status_type__e orders_stats_item_status_type_orders_stats_item_status_type_FromString(char* orders_stats_item_status_type);

//cJSON *orders_stats_item_status_type_orders_stats_item_status_type_convertToJSON(_api__orders_stats_item_status_type__e orders_stats_item_status_type);

//_api__orders_stats_item_status_type__e orders_stats_item_status_type_orders_stats_item_status_type_parseFromJSON(cJSON *orders_stats_item_status_typeJSON);

#endif /* _orders_stats_item_status_type_H_ */

