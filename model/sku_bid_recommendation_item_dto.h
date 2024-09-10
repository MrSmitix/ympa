/*
 * sku_bid_recommendation_item_dto.h
 *
 * Список товаров с рекомендованными ставками.
 */

#ifndef _sku_bid_recommendation_item_dto_H_
#define _sku_bid_recommendation_item_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct sku_bid_recommendation_item_dto_t sku_bid_recommendation_item_dto_t;

#include "bid_recommendation_item_dto.h"
#include "price_recommendation_item_dto.h"



typedef struct sku_bid_recommendation_item_dto_t {
    char *sku; // string
    int bid; //numeric
    list_t *bid_recommendations; //nonprimitive container
    list_t *price_recommendations; //nonprimitive container

} sku_bid_recommendation_item_dto_t;

sku_bid_recommendation_item_dto_t *sku_bid_recommendation_item_dto_create(
    char *sku,
    int bid,
    list_t *bid_recommendations,
    list_t *price_recommendations
);

void sku_bid_recommendation_item_dto_free(sku_bid_recommendation_item_dto_t *sku_bid_recommendation_item_dto);

sku_bid_recommendation_item_dto_t *sku_bid_recommendation_item_dto_parseFromJSON(cJSON *sku_bid_recommendation_item_dtoJSON);

cJSON *sku_bid_recommendation_item_dto_convertToJSON(sku_bid_recommendation_item_dto_t *sku_bid_recommendation_item_dto);

#endif /* _sku_bid_recommendation_item_dto_H_ */

