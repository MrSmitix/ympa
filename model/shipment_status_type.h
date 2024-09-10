/*
 * shipment_status_type.h
 *
 * Статус отгрузки:  * &#x60;OUTBOUND_CREATED&#x60; — формируется. * &#x60;OUTBOUND_READY_FOR_CONFIRMATION&#x60; — можно обрабатывать. * &#x60;OUTBOUND_CONFIRMED&#x60; — подтверждена и готова к отправке. * &#x60;OUTBOUND_SIGNED&#x60; — по ней подписан электронный акт приема-передачи. * &#x60;ACCEPTED&#x60; — принята в сортировочном центре или пункте приема. * &#x60;ACCEPTED_WITH_DISCREPANCIES&#x60; — принята с расхождениями. * &#x60;FINISHED&#x60; — завершена. * &#x60;ERROR&#x60; — отменена из-за ошибки. 
 */

#ifndef _shipment_status_type_H_
#define _shipment_status_type_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct shipment_status_type_t shipment_status_type_t;


// Enum  for shipment_status_type

typedef enum { _api__shipment_status_type__NULL = 0, _api__shipment_status_type__OUTBOUND_CREATED, _api__shipment_status_type__OUTBOUND_READY_FOR_CONFIRMATION, _api__shipment_status_type__OUTBOUND_CONFIRMED, _api__shipment_status_type__OUTBOUND_SIGNED, _api__shipment_status_type__FINISHED, _api__shipment_status_type__ACCEPTED, _api__shipment_status_type__ACCEPTED_WITH_DISCREPANCIES, _api__shipment_status_type__ERROR } _api__shipment_status_type__e;

char* shipment_status_type_shipment_status_type_ToString(_api__shipment_status_type__e shipment_status_type);

_api__shipment_status_type__e shipment_status_type_shipment_status_type_FromString(char* shipment_status_type);

//cJSON *shipment_status_type_shipment_status_type_convertToJSON(_api__shipment_status_type__e shipment_status_type);

//_api__shipment_status_type__e shipment_status_type_shipment_status_type_parseFromJSON(cJSON *shipment_status_typeJSON);

#endif /* _shipment_status_type_H_ */

