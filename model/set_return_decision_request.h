/*
 * set_return_decision_request.h
 *
 * Решения по позиции в возврате.
 */

#ifndef _set_return_decision_request_H_
#define _set_return_decision_request_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct set_return_decision_request_t set_return_decision_request_t;

#include "return_request_decision_type.h"

// Enum  for set_return_decision_request

typedef enum  { _api__set_return_decision_request__NULL = 0, _api__set_return_decision_request__REFUND_MONEY, _api__set_return_decision_request__REFUND_MONEY_INCLUDING_SHIPMENT, _api__set_return_decision_request__REPAIR, _api__set_return_decision_request__REPLACE, _api__set_return_decision_request__SEND_TO_EXAMINATION, _api__set_return_decision_request__DECLINE_REFUND, _api__set_return_decision_request__OTHER_DECISION } _api__set_return_decision_request__e;

char* set_return_decision_request_decision_type_ToString(_api__set_return_decision_request__e decision_type);

_api__set_return_decision_request__e set_return_decision_request_decision_type_FromString(char* decision_type);



typedef struct set_return_decision_request_t {
    long return_item_id; //numeric
    return_request_decision_type_t *decision_type; // custom
    char *comment; // string

} set_return_decision_request_t;

set_return_decision_request_t *set_return_decision_request_create(
    long return_item_id,
    return_request_decision_type_t *decision_type,
    char *comment
);

void set_return_decision_request_free(set_return_decision_request_t *set_return_decision_request);

set_return_decision_request_t *set_return_decision_request_parseFromJSON(cJSON *set_return_decision_requestJSON);

cJSON *set_return_decision_request_convertToJSON(set_return_decision_request_t *set_return_decision_request);

#endif /* _set_return_decision_request_H_ */

