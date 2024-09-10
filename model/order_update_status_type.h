/*
 * order_update_status_type.h
 *
 * Изменился ли статус заказа:  * &#x60;OK&#x60; — статус изменен.  * &#x60;ERROR&#x60; — статус не изменен. В этом случае появится сообщение об ошибке в параметре &#x60;errorDetails&#x60;. 
 */

#ifndef _order_update_status_type_H_
#define _order_update_status_type_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct order_update_status_type_t order_update_status_type_t;


// Enum  for order_update_status_type

typedef enum { _api__order_update_status_type__NULL = 0, _api__order_update_status_type__OK, _api__order_update_status_type__ERROR } _api__order_update_status_type__e;

char* order_update_status_type_order_update_status_type_ToString(_api__order_update_status_type__e order_update_status_type);

_api__order_update_status_type__e order_update_status_type_order_update_status_type_FromString(char* order_update_status_type);

//cJSON *order_update_status_type_order_update_status_type_convertToJSON(_api__order_update_status_type__e order_update_status_type);

//_api__order_update_status_type__e order_update_status_type_order_update_status_type_parseFromJSON(cJSON *order_update_status_typeJSON);

#endif /* _order_update_status_type_H_ */

