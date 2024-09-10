/*
 * model_dto.h
 *
 * Модель товара.
 */

#ifndef _model_dto_H_
#define _model_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct model_dto_t model_dto_t;

#include "model_price_dto.h"



typedef struct model_dto_t {
    long id; //numeric
    char *name; // string
    struct model_price_dto_t *prices; //model

} model_dto_t;

model_dto_t *model_dto_create(
    long id,
    char *name,
    model_price_dto_t *prices
);

void model_dto_free(model_dto_t *model_dto);

model_dto_t *model_dto_parseFromJSON(cJSON *model_dtoJSON);

cJSON *model_dto_convertToJSON(model_dto_t *model_dto);

#endif /* _model_dto_H_ */

