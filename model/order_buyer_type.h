/*
 * order_buyer_type.h
 *
 * Тип покупателя:  * &#x60;PERSON&#x60; — физическое лицо.  * &#x60;BUSINESS&#x60; — организация. 
 */

#ifndef _order_buyer_type_H_
#define _order_buyer_type_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct order_buyer_type_t order_buyer_type_t;


// Enum  for order_buyer_type

typedef enum { _api__order_buyer_type__NULL = 0, _api__order_buyer_type__PERSON, _api__order_buyer_type__BUSINESS } _api__order_buyer_type__e;

char* order_buyer_type_order_buyer_type_ToString(_api__order_buyer_type__e order_buyer_type);

_api__order_buyer_type__e order_buyer_type_order_buyer_type_FromString(char* order_buyer_type);

//cJSON *order_buyer_type_order_buyer_type_convertToJSON(_api__order_buyer_type__e order_buyer_type);

//_api__order_buyer_type__e order_buyer_type_order_buyer_type_parseFromJSON(cJSON *order_buyer_typeJSON);

#endif /* _order_buyer_type_H_ */

