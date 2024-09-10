/*
 * offer_price_dto.h
 *
 * Товар с информацией о новой цене на него.
 */

#ifndef _offer_price_dto_H_
#define _offer_price_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct offer_price_dto_t offer_price_dto_t;

#include "price_dto.h"



typedef struct offer_price_dto_t {
    char *offer_id; // string
    struct price_dto_t *price; //model

} offer_price_dto_t;

offer_price_dto_t *offer_price_dto_create(
    char *offer_id,
    price_dto_t *price
);

void offer_price_dto_free(offer_price_dto_t *offer_price_dto);

offer_price_dto_t *offer_price_dto_parseFromJSON(cJSON *offer_price_dtoJSON);

cJSON *offer_price_dto_convertToJSON(offer_price_dto_t *offer_price_dto);

#endif /* _offer_price_dto_H_ */

