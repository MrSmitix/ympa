/*
 * price_quarantine_verdict_parameter_dto.h
 *
 * Параметр карантина.
 */

#ifndef _price_quarantine_verdict_parameter_dto_H_
#define _price_quarantine_verdict_parameter_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct price_quarantine_verdict_parameter_dto_t price_quarantine_verdict_parameter_dto_t;

#include "price_quarantine_verdict_param_name_type.h"

// Enum  for price_quarantine_verdict_parameter_dto

typedef enum  { _api__price_quarantine_verdict_parameter_dto__NULL = 0, _api__price_quarantine_verdict_parameter_dto__CURRENT_PRICE, _api__price_quarantine_verdict_parameter_dto__LAST_VALID_PRICE, _api__price_quarantine_verdict_parameter_dto__MIN_PRICE, _api__price_quarantine_verdict_parameter_dto__CURRENCY } _api__price_quarantine_verdict_parameter_dto__e;

char* price_quarantine_verdict_parameter_dto_name_ToString(_api__price_quarantine_verdict_parameter_dto__e name);

_api__price_quarantine_verdict_parameter_dto__e price_quarantine_verdict_parameter_dto_name_FromString(char* name);



typedef struct price_quarantine_verdict_parameter_dto_t {
    price_quarantine_verdict_param_name_type_t *name; // custom
    char *value; // string

} price_quarantine_verdict_parameter_dto_t;

price_quarantine_verdict_parameter_dto_t *price_quarantine_verdict_parameter_dto_create(
    price_quarantine_verdict_param_name_type_t *name,
    char *value
);

void price_quarantine_verdict_parameter_dto_free(price_quarantine_verdict_parameter_dto_t *price_quarantine_verdict_parameter_dto);

price_quarantine_verdict_parameter_dto_t *price_quarantine_verdict_parameter_dto_parseFromJSON(cJSON *price_quarantine_verdict_parameter_dtoJSON);

cJSON *price_quarantine_verdict_parameter_dto_convertToJSON(price_quarantine_verdict_parameter_dto_t *price_quarantine_verdict_parameter_dto);

#endif /* _price_quarantine_verdict_parameter_dto_H_ */

