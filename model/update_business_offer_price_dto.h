/*
 * update_business_offer_price_dto.h
 *
 * Товар с новой ценой.
 */

#ifndef _update_business_offer_price_dto_H_
#define _update_business_offer_price_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct update_business_offer_price_dto_t update_business_offer_price_dto_t;

#include "update_price_with_discount_dto.h"



typedef struct update_business_offer_price_dto_t {
    char *offer_id; // string
    struct update_price_with_discount_dto_t *price; //model

} update_business_offer_price_dto_t;

update_business_offer_price_dto_t *update_business_offer_price_dto_create(
    char *offer_id,
    update_price_with_discount_dto_t *price
);

void update_business_offer_price_dto_free(update_business_offer_price_dto_t *update_business_offer_price_dto);

update_business_offer_price_dto_t *update_business_offer_price_dto_parseFromJSON(cJSON *update_business_offer_price_dtoJSON);

cJSON *update_business_offer_price_dto_convertToJSON(update_business_offer_price_dto_t *update_business_offer_price_dto);

#endif /* _update_business_offer_price_dto_H_ */

