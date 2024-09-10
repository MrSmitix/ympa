/*
 * return_request_decision_type.h
 *
 * Решение по возврату.
 */

#ifndef _return_request_decision_type_H_
#define _return_request_decision_type_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct return_request_decision_type_t return_request_decision_type_t;


// Enum  for return_request_decision_type

typedef enum { _api__return_request_decision_type__NULL = 0, _api__return_request_decision_type__REFUND_MONEY, _api__return_request_decision_type__REFUND_MONEY_INCLUDING_SHIPMENT, _api__return_request_decision_type__REPAIR, _api__return_request_decision_type__REPLACE, _api__return_request_decision_type__SEND_TO_EXAMINATION, _api__return_request_decision_type__DECLINE_REFUND, _api__return_request_decision_type__OTHER_DECISION } _api__return_request_decision_type__e;

char* return_request_decision_type_return_request_decision_type_ToString(_api__return_request_decision_type__e return_request_decision_type);

_api__return_request_decision_type__e return_request_decision_type_return_request_decision_type_FromString(char* return_request_decision_type);

//cJSON *return_request_decision_type_return_request_decision_type_convertToJSON(_api__return_request_decision_type__e return_request_decision_type);

//_api__return_request_decision_type__e return_request_decision_type_return_request_decision_type_parseFromJSON(cJSON *return_request_decision_typeJSON);

#endif /* _return_request_decision_type_H_ */

