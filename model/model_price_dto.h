/*
 * model_price_dto.h
 *
 * Информация о ценах на модель товара.
 */

#ifndef _model_price_dto_H_
#define _model_price_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct model_price_dto_t model_price_dto_t;




typedef struct model_price_dto_t {
    double avg; //numeric
    double max; //numeric
    double min; //numeric

} model_price_dto_t;

model_price_dto_t *model_price_dto_create(
    double avg,
    double max,
    double min
);

void model_price_dto_free(model_price_dto_t *model_price_dto);

model_price_dto_t *model_price_dto_parseFromJSON(cJSON *model_price_dtoJSON);

cJSON *model_price_dto_convertToJSON(model_price_dto_t *model_price_dto);

#endif /* _model_price_dto_H_ */

