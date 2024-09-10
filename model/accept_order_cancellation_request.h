/*
 * accept_order_cancellation_request.h
 *
 * 
 */

#ifndef _accept_order_cancellation_request_H_
#define _accept_order_cancellation_request_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct accept_order_cancellation_request_t accept_order_cancellation_request_t;

#include "order_cancellation_reason_type.h"

// Enum  for accept_order_cancellation_request

typedef enum  { _api__accept_order_cancellation_request__NULL = 0, _api__accept_order_cancellation_request__ORDER_DELIVERED, _api__accept_order_cancellation_request__ORDER_IN_DELIVERY } _api__accept_order_cancellation_request__e;

char* accept_order_cancellation_request_reason_ToString(_api__accept_order_cancellation_request__e reason);

_api__accept_order_cancellation_request__e accept_order_cancellation_request_reason_FromString(char* reason);



typedef struct accept_order_cancellation_request_t {
    int accepted; //boolean
    order_cancellation_reason_type_t *reason; // custom

} accept_order_cancellation_request_t;

accept_order_cancellation_request_t *accept_order_cancellation_request_create(
    int accepted,
    order_cancellation_reason_type_t *reason
);

void accept_order_cancellation_request_free(accept_order_cancellation_request_t *accept_order_cancellation_request);

accept_order_cancellation_request_t *accept_order_cancellation_request_parseFromJSON(cJSON *accept_order_cancellation_requestJSON);

cJSON *accept_order_cancellation_request_convertToJSON(accept_order_cancellation_request_t *accept_order_cancellation_request);

#endif /* _accept_order_cancellation_request_H_ */

