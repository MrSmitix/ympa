/*
 * return_decision_reason_type.h
 *
 * Причины возврата:  * &#x60;BAD_QUALITY&#x60; — бракованный товар (есть недостатки).  * &#x60;DO_NOT_FIT&#x60; — товар не подошел.  * &#x60;WRONG_ITEM&#x60; — привезли не тот товар.  * &#x60;DAMAGE_DELIVERY&#x60; — товар поврежден при доставке.  * &#x60;LOYALTY_FAIL&#x60; — невозможно установить виновного в браке/пересорте.  * &#x60;CONTENT_FAIL&#x60; — ошибочное описание товара по вине Маркета.  * &#x60;UNKNOWN&#x60; — причина не известна. 
 */

#ifndef _return_decision_reason_type_H_
#define _return_decision_reason_type_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct return_decision_reason_type_t return_decision_reason_type_t;


// Enum  for return_decision_reason_type

typedef enum { _api__return_decision_reason_type__NULL = 0, _api__return_decision_reason_type__BAD_QUALITY, _api__return_decision_reason_type__DOES_NOT_FIT, _api__return_decision_reason_type__WRONG_ITEM, _api__return_decision_reason_type__DAMAGE_DELIVERY, _api__return_decision_reason_type__LOYALTY_FAIL, _api__return_decision_reason_type__CONTENT_FAIL, _api__return_decision_reason_type__UNKNOWN } _api__return_decision_reason_type__e;

char* return_decision_reason_type_return_decision_reason_type_ToString(_api__return_decision_reason_type__e return_decision_reason_type);

_api__return_decision_reason_type__e return_decision_reason_type_return_decision_reason_type_FromString(char* return_decision_reason_type);

//cJSON *return_decision_reason_type_return_decision_reason_type_convertToJSON(_api__return_decision_reason_type__e return_decision_reason_type);

//_api__return_decision_reason_type__e return_decision_reason_type_return_decision_reason_type_parseFromJSON(cJSON *return_decision_reason_typeJSON);

#endif /* _return_decision_reason_type_H_ */

