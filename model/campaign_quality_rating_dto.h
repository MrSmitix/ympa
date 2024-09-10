/*
 * campaign_quality_rating_dto.h
 *
 * Информация об индексе качества магазина.
 */

#ifndef _campaign_quality_rating_dto_H_
#define _campaign_quality_rating_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct campaign_quality_rating_dto_t campaign_quality_rating_dto_t;

#include "quality_rating_dto.h"



typedef struct campaign_quality_rating_dto_t {
    long campaign_id; //numeric
    list_t *ratings; //nonprimitive container

} campaign_quality_rating_dto_t;

campaign_quality_rating_dto_t *campaign_quality_rating_dto_create(
    long campaign_id,
    list_t *ratings
);

void campaign_quality_rating_dto_free(campaign_quality_rating_dto_t *campaign_quality_rating_dto);

campaign_quality_rating_dto_t *campaign_quality_rating_dto_parseFromJSON(cJSON *campaign_quality_rating_dtoJSON);

cJSON *campaign_quality_rating_dto_convertToJSON(campaign_quality_rating_dto_t *campaign_quality_rating_dto);

#endif /* _campaign_quality_rating_dto_H_ */

