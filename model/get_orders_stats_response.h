/*
 * get_orders_stats_response.h
 *
 * Ответ на запрос информации по заказам.
 */

#ifndef _get_orders_stats_response_H_
#define _get_orders_stats_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct get_orders_stats_response_t get_orders_stats_response_t;

#include "api_response_status_type.h"
#include "orders_stats_dto.h"

// Enum  for get_orders_stats_response

typedef enum  { _api__get_orders_stats_response__NULL = 0, _api__get_orders_stats_response__OK, _api__get_orders_stats_response__ERROR } _api__get_orders_stats_response__e;

char* get_orders_stats_response_status_ToString(_api__get_orders_stats_response__e status);

_api__get_orders_stats_response__e get_orders_stats_response_status_FromString(char* status);



typedef struct get_orders_stats_response_t {
    api_response_status_type_t *status; // custom
    struct orders_stats_dto_t *result; //model

} get_orders_stats_response_t;

get_orders_stats_response_t *get_orders_stats_response_create(
    api_response_status_type_t *status,
    orders_stats_dto_t *result
);

void get_orders_stats_response_free(get_orders_stats_response_t *get_orders_stats_response);

get_orders_stats_response_t *get_orders_stats_response_parseFromJSON(cJSON *get_orders_stats_responseJSON);

cJSON *get_orders_stats_response_convertToJSON(get_orders_stats_response_t *get_orders_stats_response);

#endif /* _get_orders_stats_response_H_ */

