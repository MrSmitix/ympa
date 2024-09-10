/*
 * return_shipment_status_type.h
 *
 * Статус передачи возврата:  * &#x60;CREATED&#x60; — возврат создан.  * &#x60;RECEIVED&#x60; — принят у покупателя.  * &#x60;IN_TRANSIT&#x60; — возврат в пути.  * &#x60;READY_FOR_PICKUP&#x60; — возврат готов к выдаче магазину.  * &#x60;PICKED&#x60; — возврат выдан магазину.  * &#x60;LOST&#x60; — возврат утерян при транспортировке.  * &#x60;CANCELLED&#x60; — возврат отменен.  * &#x60;FULFILMENT_RECEIVED&#x60; — возврат принят на складе Маркета.  * &#x60;PREPARED_FOR_UTILIZATION&#x60; — возврат передан в утилизацию.  * &#x60;UTILIZED&#x60; — возврат утилизирован. 
 */

#ifndef _return_shipment_status_type_H_
#define _return_shipment_status_type_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct return_shipment_status_type_t return_shipment_status_type_t;


// Enum  for return_shipment_status_type

typedef enum { _api__return_shipment_status_type__NULL = 0, _api__return_shipment_status_type__CREATED, _api__return_shipment_status_type__RECEIVED, _api__return_shipment_status_type__IN_TRANSIT, _api__return_shipment_status_type__READY_FOR_PICKUP, _api__return_shipment_status_type__PICKED, _api__return_shipment_status_type__LOST, _api__return_shipment_status_type__EXPIRED, _api__return_shipment_status_type__CANCELLED, _api__return_shipment_status_type__FULFILMENT_RECEIVED, _api__return_shipment_status_type__PREPARED_FOR_UTILIZATION, _api__return_shipment_status_type__NOT_IN_DEMAND, _api__return_shipment_status_type__UTILIZED, _api__return_shipment_status_type__READY_FOR_EXPROPRIATION, _api__return_shipment_status_type__RECEIVED_FOR_EXPROPRIATION } _api__return_shipment_status_type__e;

char* return_shipment_status_type_return_shipment_status_type_ToString(_api__return_shipment_status_type__e return_shipment_status_type);

_api__return_shipment_status_type__e return_shipment_status_type_return_shipment_status_type_FromString(char* return_shipment_status_type);

//cJSON *return_shipment_status_type_return_shipment_status_type_convertToJSON(_api__return_shipment_status_type__e return_shipment_status_type);

//_api__return_shipment_status_type__e return_shipment_status_type_return_shipment_status_type_parseFromJSON(cJSON *return_shipment_status_typeJSON);

#endif /* _return_shipment_status_type_H_ */

