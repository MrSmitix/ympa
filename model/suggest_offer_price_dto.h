/*
 * suggest_offer_price_dto.h
 *
 * Товар, для которого требуется получить цены для продвижения.
 */

#ifndef _suggest_offer_price_dto_H_
#define _suggest_offer_price_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct suggest_offer_price_dto_t suggest_offer_price_dto_t;




typedef struct suggest_offer_price_dto_t {
    char *offer_id; // string
    long market_sku; //numeric

} suggest_offer_price_dto_t;

suggest_offer_price_dto_t *suggest_offer_price_dto_create(
    char *offer_id,
    long market_sku
);

void suggest_offer_price_dto_free(suggest_offer_price_dto_t *suggest_offer_price_dto);

suggest_offer_price_dto_t *suggest_offer_price_dto_parseFromJSON(cJSON *suggest_offer_price_dtoJSON);

cJSON *suggest_offer_price_dto_convertToJSON(suggest_offer_price_dto_t *suggest_offer_price_dto);

#endif /* _suggest_offer_price_dto_H_ */

