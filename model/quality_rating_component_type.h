/*
 * quality_rating_component_type.h
 *
 * Составляющие индекса качества.  **Для модели DBS:** * &#x60;DBS_CANCELLATION_RATE&#x60; — доля отмененных товаров. * &#x60;DBS_LATE_DELIVERY_RATE&#x60; — доля заказов, доставленных после плановой даты.  **Для моделей FBS и Экспресс:** * &#x60;FBS_CANCELLATION_RATE&#x60; — доля отмененных товаров. * &#x60;FBS_LATE_SHIP_RATE&#x60; — доля не вовремя отгруженных заказов.  **Для модели FBY:** * &#x60;FBY_LATE_DELIVERY_RATE&#x60; — доля товаров, которые приехали на склад с опозданием. * &#x60;FBY_CANCELLATION_RATE&#x60; — доля отмененных или недоставленных товаров. * &#x60;FBY_DELIVERY_DIFF_RATE&#x60; — доля товаров, которые не прибыли вместе с поставкой или которые не приняли. * &#x60;FBY_LATE_EDITING_RATE&#x60; — доля товаров, которые поздно убрали из заявки. 
 */

#ifndef _quality_rating_component_type_H_
#define _quality_rating_component_type_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct quality_rating_component_type_t quality_rating_component_type_t;


// Enum  for quality_rating_component_type

typedef enum { _api__quality_rating_component_type__NULL = 0, _api__quality_rating_component_type__DBS_CANCELLATION_RATE, _api__quality_rating_component_type__DBS_LATE_DELIVERY_RATE, _api__quality_rating_component_type__FBS_CANCELLATION_RATE, _api__quality_rating_component_type__FBS_LATE_SHIP_RATE, _api__quality_rating_component_type__FBY_LATE_DELIVERY_RATE, _api__quality_rating_component_type__FBY_CANCELLATION_RATE, _api__quality_rating_component_type__FBY_DELIVERY_DIFF_RATE, _api__quality_rating_component_type__FBY_LATE_EDITING_RATE } _api__quality_rating_component_type__e;

char* quality_rating_component_type_quality_rating_component_type_ToString(_api__quality_rating_component_type__e quality_rating_component_type);

_api__quality_rating_component_type__e quality_rating_component_type_quality_rating_component_type_FromString(char* quality_rating_component_type);

//cJSON *quality_rating_component_type_quality_rating_component_type_convertToJSON(_api__quality_rating_component_type__e quality_rating_component_type);

//_api__quality_rating_component_type__e quality_rating_component_type_quality_rating_component_type_parseFromJSON(cJSON *quality_rating_component_typeJSON);

#endif /* _quality_rating_component_type_H_ */

