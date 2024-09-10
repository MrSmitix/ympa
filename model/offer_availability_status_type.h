/*
 * offer_availability_status_type.h
 *
 * Планы по поставкам:  * &#x60;ACTIVE&#x60; — поставки будут. * &#x60;INACTIVE&#x60; — поставок не будет: товар есть на складе, но вы больше не планируете его поставлять. Через 60 дней после того, как товар закончится на складе, этот статус изменится на &#x60;DELISTED&#x60;. * &#x60;DELISTED&#x60; — архив: товар закончился на складе, и его поставок больше не будет. Если товар вернется на склад (например, покупатель вернет заказ), этот статус изменится на &#x60;INACTIVE&#x60;. 
 */

#ifndef _offer_availability_status_type_H_
#define _offer_availability_status_type_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct offer_availability_status_type_t offer_availability_status_type_t;


// Enum  for offer_availability_status_type

typedef enum { _api__offer_availability_status_type__NULL = 0, _api__offer_availability_status_type__ACTIVE, _api__offer_availability_status_type__INACTIVE, _api__offer_availability_status_type__DELISTED } _api__offer_availability_status_type__e;

char* offer_availability_status_type_offer_availability_status_type_ToString(_api__offer_availability_status_type__e offer_availability_status_type);

_api__offer_availability_status_type__e offer_availability_status_type_offer_availability_status_type_FromString(char* offer_availability_status_type);

//cJSON *offer_availability_status_type_offer_availability_status_type_convertToJSON(_api__offer_availability_status_type__e offer_availability_status_type);

//_api__offer_availability_status_type__e offer_availability_status_type_offer_availability_status_type_parseFromJSON(cJSON *offer_availability_status_typeJSON);

#endif /* _offer_availability_status_type_H_ */

