/*
 * get_orders_stats_request.h
 *
 * Запрос информации по заказам.
 */

#ifndef _get_orders_stats_request_H_
#define _get_orders_stats_request_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct get_orders_stats_request_t get_orders_stats_request_t;

#include "order_stats_status_type.h"

// Enum  for get_orders_stats_request

typedef enum  { _api__get_orders_stats_request__NULL = 0, _api__get_orders_stats_request__CANCELLED_BEFORE_PROCESSING, _api__get_orders_stats_request__CANCELLED_IN_DELIVERY, _api__get_orders_stats_request__CANCELLED_IN_PROCESSING, _api__get_orders_stats_request__DELIVERY, _api__get_orders_stats_request__DELIVERED, _api__get_orders_stats_request__PARTIALLY_DELIVERED, _api__get_orders_stats_request__PARTIALLY_RETURNED, _api__get_orders_stats_request__PENDING, _api__get_orders_stats_request__PICKUP, _api__get_orders_stats_request__PROCESSING, _api__get_orders_stats_request__RESERVED, _api__get_orders_stats_request__RETURNED, _api__get_orders_stats_request__UNKNOWN, _api__get_orders_stats_request__UNPAID, _api__get_orders_stats_request__LOST } _api__get_orders_stats_request__e;

char* get_orders_stats_request_statuses_ToString(_api__get_orders_stats_request__e statuses);

_api__get_orders_stats_request__e get_orders_stats_request_statuses_FromString(char* statuses);



typedef struct get_orders_stats_request_t {
    char *date_from; //date
    char *date_to; //date
    char *update_from; //date
    char *update_to; //date
    list_t *orders; //primitive container
    list_t *statuses; //nonprimitive container
    int has_cis; //boolean

} get_orders_stats_request_t;

get_orders_stats_request_t *get_orders_stats_request_create(
    char *date_from,
    char *date_to,
    char *update_from,
    char *update_to,
    list_t *orders,
    list_t *statuses,
    int has_cis
);

void get_orders_stats_request_free(get_orders_stats_request_t *get_orders_stats_request);

get_orders_stats_request_t *get_orders_stats_request_parseFromJSON(cJSON *get_orders_stats_requestJSON);

cJSON *get_orders_stats_request_convertToJSON(get_orders_stats_request_t *get_orders_stats_request);

#endif /* _get_orders_stats_request_H_ */

