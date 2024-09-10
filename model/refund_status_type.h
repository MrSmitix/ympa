/*
 * refund_status_type.h
 *
 * Cтатус возврата денег:  * &#x60;STARTED_BY_USER&#x60; — создан клиентом из личного кабинета.  * &#x60;REFUND_IN_PROGRESS&#x60; — ждет решение о возврате денег.  * &#x60;REFUNDED&#x60; — по возврату проведены все возвратные денежные транзакции.  * &#x60;FAILED&#x60; — невозможно провести возврат покупателю.  * &#x60;WAITING_FOR_DECISION&#x60; — ожидает решения.  * &#x60;DECISION_MADE&#x60; — по возврату принято решение.  * &#x60;REFUNDED_WITH_BONUSES&#x60; — возврат осуществлен баллами Плюса или промокодом.  * &#x60;REFUNDED_BY_SHOP&#x60; — магазин сделал самостоятельно возврат денег.  * &#x60;COMPLETE_WITHOUT_REFUND&#x60; — возврат денег не требуется.  * &#x60;CANCELLED&#x60; — возврат отменен. 
 */

#ifndef _refund_status_type_H_
#define _refund_status_type_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct refund_status_type_t refund_status_type_t;


// Enum  for refund_status_type

typedef enum { _api__refund_status_type__NULL = 0, _api__refund_status_type__STARTED_BY_USER, _api__refund_status_type__REFUND_IN_PROGRESS, _api__refund_status_type__REFUNDED, _api__refund_status_type__FAILED, _api__refund_status_type__WAITING_FOR_DECISION, _api__refund_status_type__DECISION_MADE, _api__refund_status_type__REFUNDED_WITH_BONUSES, _api__refund_status_type__REFUNDED_BY_SHOP, _api__refund_status_type__CANCELLED, _api__refund_status_type__COMPLETE_WITHOUT_REFUND, _api__refund_status_type__UNKNOWN } _api__refund_status_type__e;

char* refund_status_type_refund_status_type_ToString(_api__refund_status_type__e refund_status_type);

_api__refund_status_type__e refund_status_type_refund_status_type_FromString(char* refund_status_type);

//cJSON *refund_status_type_refund_status_type_convertToJSON(_api__refund_status_type__e refund_status_type);

//_api__refund_status_type__e refund_status_type_refund_status_type_parseFromJSON(cJSON *refund_status_typeJSON);

#endif /* _refund_status_type_H_ */

