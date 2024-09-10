/*
 * get_bids_recommendations_response_dto.h
 *
 * Список товаров с рекомендованными ставками.
 */

#ifndef _get_bids_recommendations_response_dto_H_
#define _get_bids_recommendations_response_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct get_bids_recommendations_response_dto_t get_bids_recommendations_response_dto_t;

#include "sku_bid_recommendation_item_dto.h"



typedef struct get_bids_recommendations_response_dto_t {
    list_t *recommendations; //nonprimitive container

} get_bids_recommendations_response_dto_t;

get_bids_recommendations_response_dto_t *get_bids_recommendations_response_dto_create(
    list_t *recommendations
);

void get_bids_recommendations_response_dto_free(get_bids_recommendations_response_dto_t *get_bids_recommendations_response_dto);

get_bids_recommendations_response_dto_t *get_bids_recommendations_response_dto_parseFromJSON(cJSON *get_bids_recommendations_response_dtoJSON);

cJSON *get_bids_recommendations_response_dto_convertToJSON(get_bids_recommendations_response_dto_t *get_bids_recommendations_response_dto);

#endif /* _get_bids_recommendations_response_dto_H_ */

