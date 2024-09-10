/*
 * enriched_models_dto.h
 *
 * Список моделей товаров.
 */

#ifndef _enriched_models_dto_H_
#define _enriched_models_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct enriched_models_dto_t enriched_models_dto_t;

#include "enriched_model_dto.h"



typedef struct enriched_models_dto_t {
    list_t *models; //nonprimitive container

} enriched_models_dto_t;

enriched_models_dto_t *enriched_models_dto_create(
    list_t *models
);

void enriched_models_dto_free(enriched_models_dto_t *enriched_models_dto);

enriched_models_dto_t *enriched_models_dto_parseFromJSON(cJSON *enriched_models_dtoJSON);

cJSON *enriched_models_dto_convertToJSON(enriched_models_dto_t *enriched_models_dto);

#endif /* _enriched_models_dto_H_ */

