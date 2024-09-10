/*
 * price_recommendation_item_dto.h
 *
 * Рекомендованная цена.
 */

#ifndef _price_recommendation_item_dto_H_
#define _price_recommendation_item_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct price_recommendation_item_dto_t price_recommendation_item_dto_t;




typedef struct price_recommendation_item_dto_t {
    long campaign_id; //numeric
    double price; //numeric

} price_recommendation_item_dto_t;

price_recommendation_item_dto_t *price_recommendation_item_dto_create(
    long campaign_id,
    double price
);

void price_recommendation_item_dto_free(price_recommendation_item_dto_t *price_recommendation_item_dto);

price_recommendation_item_dto_t *price_recommendation_item_dto_parseFromJSON(cJSON *price_recommendation_item_dtoJSON);

cJSON *price_recommendation_item_dto_convertToJSON(price_recommendation_item_dto_t *price_recommendation_item_dto);

#endif /* _price_recommendation_item_dto_H_ */

