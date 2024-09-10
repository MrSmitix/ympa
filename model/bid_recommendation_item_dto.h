/*
 * bid_recommendation_item_dto.h
 *
 * Рекомендованная ставка и возможная доля показов.
 */

#ifndef _bid_recommendation_item_dto_H_
#define _bid_recommendation_item_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct bid_recommendation_item_dto_t bid_recommendation_item_dto_t;




typedef struct bid_recommendation_item_dto_t {
    int bid; //numeric
    long show_percent; //numeric

} bid_recommendation_item_dto_t;

bid_recommendation_item_dto_t *bid_recommendation_item_dto_create(
    int bid,
    long show_percent
);

void bid_recommendation_item_dto_free(bid_recommendation_item_dto_t *bid_recommendation_item_dto);

bid_recommendation_item_dto_t *bid_recommendation_item_dto_parseFromJSON(cJSON *bid_recommendation_item_dtoJSON);

cJSON *bid_recommendation_item_dto_convertToJSON(bid_recommendation_item_dto_t *bid_recommendation_item_dto);

#endif /* _bid_recommendation_item_dto_H_ */

