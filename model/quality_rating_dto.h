/*
 * quality_rating_dto.h
 *
 * Информация об индексе качества.
 */

#ifndef _quality_rating_dto_H_
#define _quality_rating_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct quality_rating_dto_t quality_rating_dto_t;

#include "quality_rating_component_dto.h"



typedef struct quality_rating_dto_t {
    long rating; //numeric
    char *calculation_date; //date
    list_t *components; //nonprimitive container

} quality_rating_dto_t;

quality_rating_dto_t *quality_rating_dto_create(
    long rating,
    char *calculation_date,
    list_t *components
);

void quality_rating_dto_free(quality_rating_dto_t *quality_rating_dto);

quality_rating_dto_t *quality_rating_dto_parseFromJSON(cJSON *quality_rating_dtoJSON);

cJSON *quality_rating_dto_convertToJSON(quality_rating_dto_t *quality_rating_dto);

#endif /* _quality_rating_dto_H_ */

