/*
 * return_instance_dto.h
 *
 * Логистическая информация по возврату.
 */

#ifndef _return_instance_dto_H_
#define _return_instance_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct return_instance_dto_t return_instance_dto_t;

#include "return_instance_status_type.h"
#include "return_instance_stock_type.h"

// Enum  for return_instance_dto

typedef enum  { _api__return_instance_dto__NULL = 0, _api__return_instance_dto__FIT, _api__return_instance_dto__DEFECT, _api__return_instance_dto__ANOMALY, _api__return_instance_dto__SURPLUS, _api__return_instance_dto__EXPIRED, _api__return_instance_dto__MISGRADING, _api__return_instance_dto__UNDEFINED, _api__return_instance_dto__INCORRECT_IMEI, _api__return_instance_dto__INCORRECT_SERIAL_NUMBER, _api__return_instance_dto__INCORRECT_CIS, _api__return_instance_dto__PART_MISSING, _api__return_instance_dto__NON_COMPLIENT, _api__return_instance_dto__NOT_ACCEPTABLE, _api__return_instance_dto__SERVICE, _api__return_instance_dto__MARKDOWN, _api__return_instance_dto__DEMO, _api__return_instance_dto__REPAIR, _api__return_instance_dto__FIRMWARE, _api__return_instance_dto__UNKNOWN } _api__return_instance_dto__e;

char* return_instance_dto_stock_type_ToString(_api__return_instance_dto__e stock_type);

_api__return_instance_dto__e return_instance_dto_stock_type_FromString(char* stock_type);

// Enum  for return_instance_dto

typedef enum  { _api__return_instance_dto__NULL = 0, _api__return_instance_dto__CREATED, _api__return_instance_dto__RECEIVED, _api__return_instance_dto__IN_TRANSIT, _api__return_instance_dto__READY_FOR_PICKUP, _api__return_instance_dto__PICKED, _api__return_instance_dto__RECEIVED_ON_FULFILLMENT, _api__return_instance_dto__CANCELLED, _api__return_instance_dto__LOST, _api__return_instance_dto__UTILIZED, _api__return_instance_dto__PREPARED_FOR_UTILIZATION, _api__return_instance_dto__EXPROPRIATED, _api__return_instance_dto__NOT_IN_DEMAND } _api__return_instance_dto__e;

char* return_instance_dto_status_ToString(_api__return_instance_dto__e status);

_api__return_instance_dto__e return_instance_dto_status_FromString(char* status);



typedef struct return_instance_dto_t {
    return_instance_stock_type_t *stock_type; // custom
    return_instance_status_type_t *status; // custom
    char *cis; // string
    char *imei; // string

} return_instance_dto_t;

return_instance_dto_t *return_instance_dto_create(
    return_instance_stock_type_t *stock_type,
    return_instance_status_type_t *status,
    char *cis,
    char *imei
);

void return_instance_dto_free(return_instance_dto_t *return_instance_dto);

return_instance_dto_t *return_instance_dto_parseFromJSON(cJSON *return_instance_dtoJSON);

cJSON *return_instance_dto_convertToJSON(return_instance_dto_t *return_instance_dto);

#endif /* _return_instance_dto_H_ */

