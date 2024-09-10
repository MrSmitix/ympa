/*
 * order_subsidy_type.h
 *
 * Тип субсидии:  * &#x60;YANDEX_CASHBACK&#x60; — скидка по подписке Яндекс Плюс.  * &#x60;SUBSIDY&#x60; — скидка Маркета (по акциям, промокодам, купонам и т. д.)  * &#x60;DELIVERY&#x60; — скидка за доставку (DBS). 
 */

#ifndef _order_subsidy_type_H_
#define _order_subsidy_type_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct order_subsidy_type_t order_subsidy_type_t;


// Enum  for order_subsidy_type

typedef enum { _api__order_subsidy_type__NULL = 0, _api__order_subsidy_type__YANDEX_CASHBACK, _api__order_subsidy_type__SUBSIDY, _api__order_subsidy_type__DELIVERY } _api__order_subsidy_type__e;

char* order_subsidy_type_order_subsidy_type_ToString(_api__order_subsidy_type__e order_subsidy_type);

_api__order_subsidy_type__e order_subsidy_type_order_subsidy_type_FromString(char* order_subsidy_type);

//cJSON *order_subsidy_type_order_subsidy_type_convertToJSON(_api__order_subsidy_type__e order_subsidy_type);

//_api__order_subsidy_type__e order_subsidy_type_order_subsidy_type_parseFromJSON(cJSON *order_subsidy_typeJSON);

#endif /* _order_subsidy_type_H_ */

