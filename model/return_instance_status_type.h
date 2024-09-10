/*
 * return_instance_status_type.h
 *
 * Логистический статус конкретного товара.
 */

#ifndef _return_instance_status_type_H_
#define _return_instance_status_type_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct return_instance_status_type_t return_instance_status_type_t;


// Enum  for return_instance_status_type

typedef enum { _api__return_instance_status_type__NULL = 0, _api__return_instance_status_type__CREATED, _api__return_instance_status_type__RECEIVED, _api__return_instance_status_type__IN_TRANSIT, _api__return_instance_status_type__READY_FOR_PICKUP, _api__return_instance_status_type__PICKED, _api__return_instance_status_type__RECEIVED_ON_FULFILLMENT, _api__return_instance_status_type__CANCELLED, _api__return_instance_status_type__LOST, _api__return_instance_status_type__UTILIZED, _api__return_instance_status_type__PREPARED_FOR_UTILIZATION, _api__return_instance_status_type__EXPROPRIATED, _api__return_instance_status_type__NOT_IN_DEMAND } _api__return_instance_status_type__e;

char* return_instance_status_type_return_instance_status_type_ToString(_api__return_instance_status_type__e return_instance_status_type);

_api__return_instance_status_type__e return_instance_status_type_return_instance_status_type_FromString(char* return_instance_status_type);

//cJSON *return_instance_status_type_return_instance_status_type_convertToJSON(_api__return_instance_status_type__e return_instance_status_type);

//_api__return_instance_status_type__e return_instance_status_type_return_instance_status_type_parseFromJSON(cJSON *return_instance_status_typeJSON);

#endif /* _return_instance_status_type_H_ */

