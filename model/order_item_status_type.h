/*
 * order_item_status_type.h
 *
 * Возвращенный или невыкупленный товар:  * &#x60;REJECTED&#x60; — невыкупленный.  * &#x60;RETURNED&#x60; — возвращенный. 
 */

#ifndef _order_item_status_type_H_
#define _order_item_status_type_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct order_item_status_type_t order_item_status_type_t;


// Enum  for order_item_status_type

typedef enum { _api__order_item_status_type__NULL = 0, _api__order_item_status_type__REJECTED, _api__order_item_status_type__RETURNED } _api__order_item_status_type__e;

char* order_item_status_type_order_item_status_type_ToString(_api__order_item_status_type__e order_item_status_type);

_api__order_item_status_type__e order_item_status_type_order_item_status_type_FromString(char* order_item_status_type);

//cJSON *order_item_status_type_order_item_status_type_convertToJSON(_api__order_item_status_type__e order_item_status_type);

//_api__order_item_status_type__e order_item_status_type_order_item_status_type_parseFromJSON(cJSON *order_item_status_typeJSON);

#endif /* _order_item_status_type_H_ */

