/*
 * price_competitiveness_thresholds_dto.h
 *
 * Максимальные значения цены, при которых она является привлекательной или умеренной.
 */

#ifndef _price_competitiveness_thresholds_dto_H_
#define _price_competitiveness_thresholds_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct price_competitiveness_thresholds_dto_t price_competitiveness_thresholds_dto_t;

#include "base_price_dto.h"



typedef struct price_competitiveness_thresholds_dto_t {
    struct base_price_dto_t *optimal_price; //model
    struct base_price_dto_t *average_price; //model

} price_competitiveness_thresholds_dto_t;

price_competitiveness_thresholds_dto_t *price_competitiveness_thresholds_dto_create(
    base_price_dto_t *optimal_price,
    base_price_dto_t *average_price
);

void price_competitiveness_thresholds_dto_free(price_competitiveness_thresholds_dto_t *price_competitiveness_thresholds_dto);

price_competitiveness_thresholds_dto_t *price_competitiveness_thresholds_dto_parseFromJSON(cJSON *price_competitiveness_thresholds_dtoJSON);

cJSON *price_competitiveness_thresholds_dto_convertToJSON(price_competitiveness_thresholds_dto_t *price_competitiveness_thresholds_dto);

#endif /* _price_competitiveness_thresholds_dto_H_ */

