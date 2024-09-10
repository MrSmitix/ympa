/*
 * campaigns_quality_rating_dto.h
 *
 * Информация об индексе качества магазинов.
 */

#ifndef _campaigns_quality_rating_dto_H_
#define _campaigns_quality_rating_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct campaigns_quality_rating_dto_t campaigns_quality_rating_dto_t;

#include "campaign_quality_rating_dto.h"



typedef struct campaigns_quality_rating_dto_t {
    list_t *campaign_ratings; //nonprimitive container

} campaigns_quality_rating_dto_t;

campaigns_quality_rating_dto_t *campaigns_quality_rating_dto_create(
    list_t *campaign_ratings
);

void campaigns_quality_rating_dto_free(campaigns_quality_rating_dto_t *campaigns_quality_rating_dto);

campaigns_quality_rating_dto_t *campaigns_quality_rating_dto_parseFromJSON(cJSON *campaigns_quality_rating_dtoJSON);

cJSON *campaigns_quality_rating_dto_convertToJSON(campaigns_quality_rating_dto_t *campaigns_quality_rating_dto);

#endif /* _campaigns_quality_rating_dto_H_ */

