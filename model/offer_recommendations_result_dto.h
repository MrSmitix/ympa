/*
 * offer_recommendations_result_dto.h
 *
 * Список товаров с рекомендациями.
 */

#ifndef _offer_recommendations_result_dto_H_
#define _offer_recommendations_result_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct offer_recommendations_result_dto_t offer_recommendations_result_dto_t;

#include "offer_recommendation_dto.h"
#include "scrolling_pager_dto.h"



typedef struct offer_recommendations_result_dto_t {
    struct scrolling_pager_dto_t *paging; //model
    list_t *offer_recommendations; //nonprimitive container

} offer_recommendations_result_dto_t;

offer_recommendations_result_dto_t *offer_recommendations_result_dto_create(
    scrolling_pager_dto_t *paging,
    list_t *offer_recommendations
);

void offer_recommendations_result_dto_free(offer_recommendations_result_dto_t *offer_recommendations_result_dto);

offer_recommendations_result_dto_t *offer_recommendations_result_dto_parseFromJSON(cJSON *offer_recommendations_result_dtoJSON);

cJSON *offer_recommendations_result_dto_convertToJSON(offer_recommendations_result_dto_t *offer_recommendations_result_dto);

#endif /* _offer_recommendations_result_dto_H_ */

