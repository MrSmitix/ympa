/*
 * price_quarantine_verdict_dto.h
 *
 * Причина попадания товара в карантин.
 */

#ifndef _price_quarantine_verdict_dto_H_
#define _price_quarantine_verdict_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct price_quarantine_verdict_dto_t price_quarantine_verdict_dto_t;

#include "price_quarantine_verdict_parameter_dto.h"
#include "price_quarantine_verdict_type.h"

// Enum  for price_quarantine_verdict_dto

typedef enum  { _api__price_quarantine_verdict_dto__NULL = 0, _api__price_quarantine_verdict_dto__PRICE_CHANGE, _api__price_quarantine_verdict_dto__LOW_PRICE, _api__price_quarantine_verdict_dto__LOW_PRICE_PROMO } _api__price_quarantine_verdict_dto__e;

char* price_quarantine_verdict_dto_type_ToString(_api__price_quarantine_verdict_dto__e type);

_api__price_quarantine_verdict_dto__e price_quarantine_verdict_dto_type_FromString(char* type);



typedef struct price_quarantine_verdict_dto_t {
    price_quarantine_verdict_type_t *type; // custom
    list_t *params; //nonprimitive container

} price_quarantine_verdict_dto_t;

price_quarantine_verdict_dto_t *price_quarantine_verdict_dto_create(
    price_quarantine_verdict_type_t *type,
    list_t *params
);

void price_quarantine_verdict_dto_free(price_quarantine_verdict_dto_t *price_quarantine_verdict_dto);

price_quarantine_verdict_dto_t *price_quarantine_verdict_dto_parseFromJSON(cJSON *price_quarantine_verdict_dtoJSON);

cJSON *price_quarantine_verdict_dto_convertToJSON(price_quarantine_verdict_dto_t *price_quarantine_verdict_dto);

#endif /* _price_quarantine_verdict_dto_H_ */

