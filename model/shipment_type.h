/*
 * shipment_type.h
 *
 * Способ отгрузки заказов:  * &#x60;IMPORT&#x60; — вы самостоятельно привозите заказы в выбранный сортировочный центр или пункт приема заказов. * &#x60;WITHDRAW&#x60; — вы отгружаете заказы со своего склада курьерам Яндекс Маркета. 
 */

#ifndef _shipment_type_H_
#define _shipment_type_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct shipment_type_t shipment_type_t;


// Enum  for shipment_type

typedef enum { _api__shipment_type__NULL = 0, _api__shipment_type__IMPORT, _api__shipment_type__WITHDRAW } _api__shipment_type__e;

char* shipment_type_shipment_type_ToString(_api__shipment_type__e shipment_type);

_api__shipment_type__e shipment_type_shipment_type_FromString(char* shipment_type);

//cJSON *shipment_type_shipment_type_convertToJSON(_api__shipment_type__e shipment_type);

//_api__shipment_type__e shipment_type_shipment_type_parseFromJSON(cJSON *shipment_typeJSON);

#endif /* _shipment_type_H_ */

