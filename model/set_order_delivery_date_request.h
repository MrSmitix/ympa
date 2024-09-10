/*
 * set_order_delivery_date_request.h
 *
 * 
 */

#ifndef _set_order_delivery_date_request_H_
#define _set_order_delivery_date_request_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct set_order_delivery_date_request_t set_order_delivery_date_request_t;

#include "order_delivery_date_dto.h"
#include "order_delivery_date_reason_type.h"

// Enum  for set_order_delivery_date_request

typedef enum  { _api__set_order_delivery_date_request__NULL = 0, _api__set_order_delivery_date_request__USER_MOVED_DELIVERY_DATES, _api__set_order_delivery_date_request__PARTNER_MOVED_DELIVERY_DATES } _api__set_order_delivery_date_request__e;

char* set_order_delivery_date_request_reason_ToString(_api__set_order_delivery_date_request__e reason);

_api__set_order_delivery_date_request__e set_order_delivery_date_request_reason_FromString(char* reason);



typedef struct set_order_delivery_date_request_t {
    struct order_delivery_date_dto_t *dates; //model
    order_delivery_date_reason_type_t *reason; // custom

} set_order_delivery_date_request_t;

set_order_delivery_date_request_t *set_order_delivery_date_request_create(
    order_delivery_date_dto_t *dates,
    order_delivery_date_reason_type_t *reason
);

void set_order_delivery_date_request_free(set_order_delivery_date_request_t *set_order_delivery_date_request);

set_order_delivery_date_request_t *set_order_delivery_date_request_parseFromJSON(cJSON *set_order_delivery_date_requestJSON);

cJSON *set_order_delivery_date_request_convertToJSON(set_order_delivery_date_request_t *set_order_delivery_date_request);

#endif /* _set_order_delivery_date_request_H_ */

