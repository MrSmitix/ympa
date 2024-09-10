/*
 * order_delivery_eac_type.h
 *
 * Тип кода подтверждения ЭАПП:  * &#x60;MERCHANT_TO_COURIER&#x60; — продавец передает код курьеру.  * &#x60;COURIER_TO_MERCHANT&#x60; — курьер передает код продавцу.  * &#x60;CHECKING_BY_MERCHANT&#x60; — продавец проверяет код на своей стороне. 
 */

#ifndef _order_delivery_eac_type_H_
#define _order_delivery_eac_type_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct order_delivery_eac_type_t order_delivery_eac_type_t;


// Enum  for order_delivery_eac_type

typedef enum { _api__order_delivery_eac_type__NULL = 0, _api__order_delivery_eac_type__MERCHANT_TO_COURIER, _api__order_delivery_eac_type__COURIER_TO_MERCHANT, _api__order_delivery_eac_type__CHECKING_BY_MERCHANT } _api__order_delivery_eac_type__e;

char* order_delivery_eac_type_order_delivery_eac_type_ToString(_api__order_delivery_eac_type__e order_delivery_eac_type);

_api__order_delivery_eac_type__e order_delivery_eac_type_order_delivery_eac_type_FromString(char* order_delivery_eac_type);

//cJSON *order_delivery_eac_type_order_delivery_eac_type_convertToJSON(_api__order_delivery_eac_type__e order_delivery_eac_type);

//_api__order_delivery_eac_type__e order_delivery_eac_type_order_delivery_eac_type_parseFromJSON(cJSON *order_delivery_eac_typeJSON);

#endif /* _order_delivery_eac_type_H_ */

