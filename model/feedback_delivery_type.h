/*
 * feedback_delivery_type.h
 *
 * Способ покупки, указанный в отзыве:  * &#x60;DELIVERY&#x60; — доставка. * &#x60;PICKUP&#x60; — самовывоз. * &#x60;INSTORE&#x60; — в магазине. 
 */

#ifndef _feedback_delivery_type_H_
#define _feedback_delivery_type_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct feedback_delivery_type_t feedback_delivery_type_t;


// Enum  for feedback_delivery_type

typedef enum { _api__feedback_delivery_type__NULL = 0, _api__feedback_delivery_type__DELIVERY, _api__feedback_delivery_type__PICKUP, _api__feedback_delivery_type__INSTORE } _api__feedback_delivery_type__e;

char* feedback_delivery_type_feedback_delivery_type_ToString(_api__feedback_delivery_type__e feedback_delivery_type);

_api__feedback_delivery_type__e feedback_delivery_type_feedback_delivery_type_FromString(char* feedback_delivery_type);

//cJSON *feedback_delivery_type_feedback_delivery_type_convertToJSON(_api__feedback_delivery_type__e feedback_delivery_type);

//_api__feedback_delivery_type__e feedback_delivery_type_feedback_delivery_type_parseFromJSON(cJSON *feedback_delivery_typeJSON);

#endif /* _feedback_delivery_type_H_ */

