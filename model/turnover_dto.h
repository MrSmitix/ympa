/*
 * turnover_dto.h
 *
 * Информация об оборачиваемости товара.
 */

#ifndef _turnover_dto_H_
#define _turnover_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct turnover_dto_t turnover_dto_t;

#include "turnover_type.h"

// Enum  for turnover_dto

typedef enum  { _api__turnover_dto__NULL = 0, _api__turnover_dto__LOW, _api__turnover_dto__ALMOST_LOW, _api__turnover_dto__HIGH, _api__turnover_dto__VERY_HIGH, _api__turnover_dto__NO_SALES, _api__turnover_dto__FREE_STORE } _api__turnover_dto__e;

char* turnover_dto_turnover_ToString(_api__turnover_dto__e turnover);

_api__turnover_dto__e turnover_dto_turnover_FromString(char* turnover);



typedef struct turnover_dto_t {
    turnover_type_t *turnover; // custom
    double turnover_days; //numeric

} turnover_dto_t;

turnover_dto_t *turnover_dto_create(
    turnover_type_t *turnover,
    double turnover_days
);

void turnover_dto_free(turnover_dto_t *turnover_dto);

turnover_dto_t *turnover_dto_parseFromJSON(cJSON *turnover_dtoJSON);

cJSON *turnover_dto_convertToJSON(turnover_dto_t *turnover_dto);

#endif /* _turnover_dto_H_ */

