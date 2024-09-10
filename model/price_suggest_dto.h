/*
 * price_suggest_dto.h
 *
 * Тип цены.
 */

#ifndef _price_suggest_dto_H_
#define _price_suggest_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct price_suggest_dto_t price_suggest_dto_t;

#include "price_suggest_type.h"

// Enum  for price_suggest_dto

typedef enum  { _api__price_suggest_dto__NULL = 0, _api__price_suggest_dto__BUYBOX, _api__price_suggest_dto__DEFAULT_OFFER, _api__price_suggest_dto__MIN_PRICE_MARKET } _api__price_suggest_dto__e;

char* price_suggest_dto_type_ToString(_api__price_suggest_dto__e type);

_api__price_suggest_dto__e price_suggest_dto_type_FromString(char* type);



typedef struct price_suggest_dto_t {
    price_suggest_type_t *type; // custom
    double price; //numeric

} price_suggest_dto_t;

price_suggest_dto_t *price_suggest_dto_create(
    price_suggest_type_t *type,
    double price
);

void price_suggest_dto_free(price_suggest_dto_t *price_suggest_dto);

price_suggest_dto_t *price_suggest_dto_parseFromJSON(cJSON *price_suggest_dtoJSON);

cJSON *price_suggest_dto_convertToJSON(price_suggest_dto_t *price_suggest_dto);

#endif /* _price_suggest_dto_H_ */

