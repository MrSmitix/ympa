/*
 * logistic_pickup_point_dto.h
 *
 * Описание пункта вывоза для возврата.
 */

#ifndef _logistic_pickup_point_dto_H_
#define _logistic_pickup_point_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct logistic_pickup_point_dto_t logistic_pickup_point_dto_t;

#include "logistic_point_type.h"
#include "pickup_address_dto.h"

// Enum  for logistic_pickup_point_dto

typedef enum  { _api__logistic_pickup_point_dto__NULL = 0, _api__logistic_pickup_point_dto__WAREHOUSE, _api__logistic_pickup_point_dto__PICKUP_POINT, _api__logistic_pickup_point_dto__PICKUP_TERMINAL, _api__logistic_pickup_point_dto__PICKUP_POST_OFFICE, _api__logistic_pickup_point_dto__PICKUP_MIXED, _api__logistic_pickup_point_dto__PICKUP_RETAIL, _api__logistic_pickup_point_dto__UNKNOWN } _api__logistic_pickup_point_dto__e;

char* logistic_pickup_point_dto_type_ToString(_api__logistic_pickup_point_dto__e type);

_api__logistic_pickup_point_dto__e logistic_pickup_point_dto_type_FromString(char* type);



typedef struct logistic_pickup_point_dto_t {
    long id; //numeric
    char *name; // string
    struct pickup_address_dto_t *address; //model
    char *instruction; // string
    logistic_point_type_t *type; // custom
    long logistic_partner_id; //numeric

} logistic_pickup_point_dto_t;

logistic_pickup_point_dto_t *logistic_pickup_point_dto_create(
    long id,
    char *name,
    pickup_address_dto_t *address,
    char *instruction,
    logistic_point_type_t *type,
    long logistic_partner_id
);

void logistic_pickup_point_dto_free(logistic_pickup_point_dto_t *logistic_pickup_point_dto);

logistic_pickup_point_dto_t *logistic_pickup_point_dto_parseFromJSON(cJSON *logistic_pickup_point_dtoJSON);

cJSON *logistic_pickup_point_dto_convertToJSON(logistic_pickup_point_dto_t *logistic_pickup_point_dto);

#endif /* _logistic_pickup_point_dto_H_ */

