/*
 * affected_order_quality_rating_component_type.h
 *
 * Составляющие индекса качества.  **Для модели DBS:** * &#x60;DBS_CANCELLATION_RATE&#x60; — доля отмененных товаров. * &#x60;DBS_LATE_DELIVERY_RATE&#x60; — доля заказов, доставленных после плановой даты.  **Для моделей FBS и Экспресс:** * &#x60;FBS_CANCELLATION_RATE&#x60; — доля отмененных товаров. * &#x60;FBS_LATE_SHIP_RATE&#x60; — доля не вовремя отгруженных заказов. 
 */

#ifndef _affected_order_quality_rating_component_type_H_
#define _affected_order_quality_rating_component_type_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct affected_order_quality_rating_component_type_t affected_order_quality_rating_component_type_t;


// Enum  for affected_order_quality_rating_component_type

typedef enum { _api__affected_order_quality_rating_component_type__NULL = 0, _api__affected_order_quality_rating_component_type__DBS_CANCELLATION_RATE, _api__affected_order_quality_rating_component_type__DBS_LATE_DELIVERY_RATE, _api__affected_order_quality_rating_component_type__FBS_CANCELLATION_RATE, _api__affected_order_quality_rating_component_type__FBS_LATE_SHIP_RATE } _api__affected_order_quality_rating_component_type__e;

char* affected_order_quality_rating_component_type_affected_order_quality_rating_component_type_ToString(_api__affected_order_quality_rating_component_type__e affected_order_quality_rating_component_type);

_api__affected_order_quality_rating_component_type__e affected_order_quality_rating_component_type_affected_order_quality_rating_component_type_FromString(char* affected_order_quality_rating_component_type);

//cJSON *affected_order_quality_rating_component_type_affected_order_quality_rating_component_type_convertToJSON(_api__affected_order_quality_rating_component_type__e affected_order_quality_rating_component_type);

//_api__affected_order_quality_rating_component_type__e affected_order_quality_rating_component_type_affected_order_quality_rating_component_type_parseFromJSON(cJSON *affected_order_quality_rating_component_typeJSON);

#endif /* _affected_order_quality_rating_component_type_H_ */

