/*
 * offer_for_recommendation_dto.h
 *
 * Информация о состоянии цены на товар.
 */

#ifndef _offer_for_recommendation_dto_H_
#define _offer_for_recommendation_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct offer_for_recommendation_dto_t offer_for_recommendation_dto_t;

#include "base_price_dto.h"
#include "get_price_dto.h"
#include "price_competitiveness_type.h"

// Enum  for offer_for_recommendation_dto

typedef enum  { _api__offer_for_recommendation_dto__NULL = 0, _api__offer_for_recommendation_dto__OPTIMAL, _api__offer_for_recommendation_dto__AVERAGE, _api__offer_for_recommendation_dto__LOW } _api__offer_for_recommendation_dto__e;

char* offer_for_recommendation_dto_competitiveness_ToString(_api__offer_for_recommendation_dto__e competitiveness);

_api__offer_for_recommendation_dto__e offer_for_recommendation_dto_competitiveness_FromString(char* competitiveness);



typedef struct offer_for_recommendation_dto_t {
    char *offer_id; // string
    struct base_price_dto_t *price; //model
    struct get_price_dto_t *cofinance_price; //model
    price_competitiveness_type_t *competitiveness; // custom
    long shows; //numeric

} offer_for_recommendation_dto_t;

offer_for_recommendation_dto_t *offer_for_recommendation_dto_create(
    char *offer_id,
    base_price_dto_t *price,
    get_price_dto_t *cofinance_price,
    price_competitiveness_type_t *competitiveness,
    long shows
);

void offer_for_recommendation_dto_free(offer_for_recommendation_dto_t *offer_for_recommendation_dto);

offer_for_recommendation_dto_t *offer_for_recommendation_dto_parseFromJSON(cJSON *offer_for_recommendation_dtoJSON);

cJSON *offer_for_recommendation_dto_convertToJSON(offer_for_recommendation_dto_t *offer_for_recommendation_dto);

#endif /* _offer_for_recommendation_dto_H_ */

