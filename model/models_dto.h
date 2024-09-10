/*
 * models_dto.h
 *
 * Список моделей товаров.
 */

#ifndef _models_dto_H_
#define _models_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct models_dto_t models_dto_t;

#include "model_dto.h"



typedef struct models_dto_t {
    list_t *models; //nonprimitive container

} models_dto_t;

models_dto_t *models_dto_create(
    list_t *models
);

void models_dto_free(models_dto_t *models_dto);

models_dto_t *models_dto_parseFromJSON(cJSON *models_dtoJSON);

cJSON *models_dto_convertToJSON(models_dto_t *models_dto);

#endif /* _models_dto_H_ */

