/*
 * offer_recommendation_dto.h
 *
 * Информация о состоянии цен и рекомендации. 
 */

#ifndef _offer_recommendation_dto_H_
#define _offer_recommendation_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct offer_recommendation_dto_t offer_recommendation_dto_t;

#include "offer_for_recommendation_dto.h"
#include "offer_recommendation_info_dto.h"



typedef struct offer_recommendation_dto_t {
    struct offer_for_recommendation_dto_t *offer; //model
    struct offer_recommendation_info_dto_t *recommendation; //model

} offer_recommendation_dto_t;

offer_recommendation_dto_t *offer_recommendation_dto_create(
    offer_for_recommendation_dto_t *offer,
    offer_recommendation_info_dto_t *recommendation
);

void offer_recommendation_dto_free(offer_recommendation_dto_t *offer_recommendation_dto);

offer_recommendation_dto_t *offer_recommendation_dto_parseFromJSON(cJSON *offer_recommendation_dtoJSON);

cJSON *offer_recommendation_dto_convertToJSON(offer_recommendation_dto_t *offer_recommendation_dto);

#endif /* _offer_recommendation_dto_H_ */

