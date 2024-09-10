/*
 * return_decision_type.h
 *
 * Решение по возврату:  * &#x60;REFUND_MONEY&#x60; — вернуть деньги покупателю.  * &#x60;REFUND_MONEY_INCLUDING_SHIPMENT&#x60; — вернуть деньги за товар и пересылку.  * &#x60;REPAIR&#x60; — отремонтировать товар.  * &#x60;REPLACE&#x60; — заменить товар.  * &#x60;SEND_TO_EXAMINATION&#x60; — взять товар на экспертизу.  * &#x60;DECLINE_REFUND&#x60; — отказать в возврате.  * &#x60;OTHER_DECISION&#x60; — другое решение. 
 */

#ifndef _return_decision_type_H_
#define _return_decision_type_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct return_decision_type_t return_decision_type_t;


// Enum  for return_decision_type

typedef enum { _api__return_decision_type__NULL = 0, _api__return_decision_type__REFUND_MONEY, _api__return_decision_type__REFUND_MONEY_INCLUDING_SHIPMENT, _api__return_decision_type__REPAIR, _api__return_decision_type__REPLACE, _api__return_decision_type__SEND_TO_EXAMINATION, _api__return_decision_type__DECLINE_REFUND, _api__return_decision_type__OTHER_DECISION, _api__return_decision_type__UNKNOWN } _api__return_decision_type__e;

char* return_decision_type_return_decision_type_ToString(_api__return_decision_type__e return_decision_type);

_api__return_decision_type__e return_decision_type_return_decision_type_FromString(char* return_decision_type);

//cJSON *return_decision_type_return_decision_type_convertToJSON(_api__return_decision_type__e return_decision_type);

//_api__return_decision_type__e return_decision_type_return_decision_type_parseFromJSON(cJSON *return_decision_typeJSON);

#endif /* _return_decision_type_H_ */

