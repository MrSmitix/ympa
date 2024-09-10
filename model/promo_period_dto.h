/*
 * promo_period_dto.h
 *
 * Время проведения акции.
 */

#ifndef _promo_period_dto_H_
#define _promo_period_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct promo_period_dto_t promo_period_dto_t;




typedef struct promo_period_dto_t {
    char *date_time_from; //date time
    char *date_time_to; //date time

} promo_period_dto_t;

promo_period_dto_t *promo_period_dto_create(
    char *date_time_from,
    char *date_time_to
);

void promo_period_dto_free(promo_period_dto_t *promo_period_dto);

promo_period_dto_t *promo_period_dto_parseFromJSON(cJSON *promo_period_dtoJSON);

cJSON *promo_period_dto_convertToJSON(promo_period_dto_t *promo_period_dto);

#endif /* _promo_period_dto_H_ */

