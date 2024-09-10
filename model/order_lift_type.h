/*
 * order_lift_type.h
 *
 * Тип подъема заказа на этаж:  * &#x60;NOT_NEEDED&#x60; — не требуется.  * &#x60;MANUAL&#x60; — ручной.  * &#x60;ELEVATOR&#x60; — лифт.  * &#x60;CARGO_ELEVATOR&#x60; — грузовой лифт.  * &#x60;FREE&#x60; — любой из перечисленных выше, если включена опция бесплатного подъема.  * &#x60;UNKNOWN&#x60; — неизвестный тип. 
 */

#ifndef _order_lift_type_H_
#define _order_lift_type_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct order_lift_type_t order_lift_type_t;


// Enum  for order_lift_type

typedef enum { _api__order_lift_type__NULL = 0, _api__order_lift_type__NOT_NEEDED, _api__order_lift_type__MANUAL, _api__order_lift_type__ELEVATOR, _api__order_lift_type__CARGO_ELEVATOR, _api__order_lift_type__FREE, _api__order_lift_type__UNKNOWN } _api__order_lift_type__e;

char* order_lift_type_order_lift_type_ToString(_api__order_lift_type__e order_lift_type);

_api__order_lift_type__e order_lift_type_order_lift_type_FromString(char* order_lift_type);

//cJSON *order_lift_type_order_lift_type_convertToJSON(_api__order_lift_type__e order_lift_type);

//_api__order_lift_type__e order_lift_type_order_lift_type_parseFromJSON(cJSON *order_lift_typeJSON);

#endif /* _order_lift_type_H_ */

