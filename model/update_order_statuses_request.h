/*
 * update_order_statuses_request.h
 *
 * Список заказов.
 */

#ifndef _update_order_statuses_request_H_
#define _update_order_statuses_request_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct update_order_statuses_request_t update_order_statuses_request_t;

#include "order_state_dto.h"



typedef struct update_order_statuses_request_t {
    list_t *orders; //nonprimitive container

} update_order_statuses_request_t;

update_order_statuses_request_t *update_order_statuses_request_create(
    list_t *orders
);

void update_order_statuses_request_free(update_order_statuses_request_t *update_order_statuses_request);

update_order_statuses_request_t *update_order_statuses_request_parseFromJSON(cJSON *update_order_statuses_requestJSON);

cJSON *update_order_statuses_request_convertToJSON(update_order_statuses_request_t *update_order_statuses_request);

#endif /* _update_order_statuses_request_H_ */

