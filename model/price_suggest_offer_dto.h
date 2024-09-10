/*
 * price_suggest_offer_dto.h
 *
 * Товар с ценами для продвижения.
 */

#ifndef _price_suggest_offer_dto_H_
#define _price_suggest_offer_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct price_suggest_offer_dto_t price_suggest_offer_dto_t;

#include "price_suggest_dto.h"



typedef struct price_suggest_offer_dto_t {
    long market_sku; //numeric
    char *offer_id; // string
    list_t *price_suggestion; //nonprimitive container

} price_suggest_offer_dto_t;

price_suggest_offer_dto_t *price_suggest_offer_dto_create(
    long market_sku,
    char *offer_id,
    list_t *price_suggestion
);

void price_suggest_offer_dto_free(price_suggest_offer_dto_t *price_suggest_offer_dto);

price_suggest_offer_dto_t *price_suggest_offer_dto_parseFromJSON(cJSON *price_suggest_offer_dtoJSON);

cJSON *price_suggest_offer_dto_convertToJSON(price_suggest_offer_dto_t *price_suggest_offer_dto);

#endif /* _price_suggest_offer_dto_H_ */

