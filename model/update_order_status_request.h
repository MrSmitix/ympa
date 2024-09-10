/*
 * update_order_status_request.h
 *
 * 
 */

#ifndef _update_order_status_request_H_
#define _update_order_status_request_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct update_order_status_request_t update_order_status_request_t;

#include "order_status_change_dto.h"



typedef struct update_order_status_request_t {
    struct order_status_change_dto_t *order; //model

} update_order_status_request_t;

update_order_status_request_t *update_order_status_request_create(
    order_status_change_dto_t *order
);

void update_order_status_request_free(update_order_status_request_t *update_order_status_request);

update_order_status_request_t *update_order_status_request_parseFromJSON(cJSON *update_order_status_requestJSON);

cJSON *update_order_status_request_convertToJSON(update_order_status_request_t *update_order_status_request);

#endif /* _update_order_status_request_H_ */

