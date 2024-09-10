/*
 * shipment_action_type.h
 *
 * Действия с отгрузкой:  * &#x60;CONFIRM&#x60; — подтвердить отгрузку. * &#x60;DOWNLOAD_ACT&#x60; — скачать акт приема-передачи отгрузки. * &#x60;DOWNLOAD_INBOUND_ACT&#x60; — скачать список принятых заказов. * &#x60;DOWNLOAD_DISCREPANCY_ACT&#x60; — скачать акт расхождений. * &#x60;CHANGE_PALLETS_COUNT&#x60; — указать количество палет. 
 */

#ifndef _shipment_action_type_H_
#define _shipment_action_type_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct shipment_action_type_t shipment_action_type_t;


// Enum  for shipment_action_type

typedef enum { _api__shipment_action_type__NULL = 0, _api__shipment_action_type__CONFIRM, _api__shipment_action_type__DOWNLOAD_ACT, _api__shipment_action_type__DOWNLOAD_INBOUND_ACT, _api__shipment_action_type__DOWNLOAD_DISCREPANCY_ACT, _api__shipment_action_type__CHANGE_PALLETS_COUNT } _api__shipment_action_type__e;

char* shipment_action_type_shipment_action_type_ToString(_api__shipment_action_type__e shipment_action_type);

_api__shipment_action_type__e shipment_action_type_shipment_action_type_FromString(char* shipment_action_type);

//cJSON *shipment_action_type_shipment_action_type_convertToJSON(_api__shipment_action_type__e shipment_action_type);

//_api__shipment_action_type__e shipment_action_type_shipment_action_type_parseFromJSON(cJSON *shipment_action_typeJSON);

#endif /* _shipment_action_type_H_ */

