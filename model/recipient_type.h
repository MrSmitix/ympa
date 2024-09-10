/*
 * recipient_type.h
 *
 * Способ возврата товара покупателем:  * &#x60;SHOP&#x60; — в точку возврата магазина.  * &#x60;DELIVERY_SERVICE&#x60; — отправить курьером.  * &#x60;POST&#x60; — почта. 
 */

#ifndef _recipient_type_H_
#define _recipient_type_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct recipient_type_t recipient_type_t;


// Enum  for recipient_type

typedef enum { _api__recipient_type__NULL = 0, _api__recipient_type__SHOP, _api__recipient_type__DELIVERY_SERVICE, _api__recipient_type__POST } _api__recipient_type__e;

char* recipient_type_recipient_type_ToString(_api__recipient_type__e recipient_type);

_api__recipient_type__e recipient_type_recipient_type_FromString(char* recipient_type);

//cJSON *recipient_type_recipient_type_convertToJSON(_api__recipient_type__e recipient_type);

//_api__recipient_type__e recipient_type_recipient_type_parseFromJSON(cJSON *recipient_typeJSON);

#endif /* _recipient_type_H_ */

