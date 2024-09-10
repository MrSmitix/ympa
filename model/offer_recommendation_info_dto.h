/*
 * offer_recommendation_info_dto.h
 *
 * Рекомендации, касающиеся цены на товар.
 */

#ifndef _offer_recommendation_info_dto_H_
#define _offer_recommendation_info_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct offer_recommendation_info_dto_t offer_recommendation_info_dto_t;

#include "base_price_dto.h"
#include "price_competitiveness_thresholds_dto.h"



typedef struct offer_recommendation_info_dto_t {
    char *offer_id; // string
    struct base_price_dto_t *recommended_cofinance_price; //model
    struct price_competitiveness_thresholds_dto_t *competitiveness_thresholds; //model

} offer_recommendation_info_dto_t;

offer_recommendation_info_dto_t *offer_recommendation_info_dto_create(
    char *offer_id,
    base_price_dto_t *recommended_cofinance_price,
    price_competitiveness_thresholds_dto_t *competitiveness_thresholds
);

void offer_recommendation_info_dto_free(offer_recommendation_info_dto_t *offer_recommendation_info_dto);

offer_recommendation_info_dto_t *offer_recommendation_info_dto_parseFromJSON(cJSON *offer_recommendation_info_dtoJSON);

cJSON *offer_recommendation_info_dto_convertToJSON(offer_recommendation_info_dto_t *offer_recommendation_info_dto);

#endif /* _offer_recommendation_info_dto_H_ */

