/*
 * time_period_dto.h
 *
 * Временной отрезок с комментарием. Требования к содержанию комментария зависят от контекста использования параметра и указаны в описании поля, которое его содержит.
 */

#ifndef _time_period_dto_H_
#define _time_period_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct time_period_dto_t time_period_dto_t;

#include "time_unit_type.h"

// Enum  for time_period_dto

typedef enum  { _api__time_period_dto__NULL = 0, _api__time_period_dto__HOUR, _api__time_period_dto__DAY, _api__time_period_dto__WEEK, _api__time_period_dto__MONTH, _api__time_period_dto__YEAR } _api__time_period_dto__e;

char* time_period_dto_time_unit_ToString(_api__time_period_dto__e time_unit);

_api__time_period_dto__e time_period_dto_time_unit_FromString(char* time_unit);



typedef struct time_period_dto_t {
    int time_period; //numeric
    time_unit_type_t *time_unit; // custom
    char *comment; // string

} time_period_dto_t;

time_period_dto_t *time_period_dto_create(
    int time_period,
    time_unit_type_t *time_unit,
    char *comment
);

void time_period_dto_free(time_period_dto_t *time_period_dto);

time_period_dto_t *time_period_dto_parseFromJSON(cJSON *time_period_dtoJSON);

cJSON *time_period_dto_convertToJSON(time_period_dto_t *time_period_dto);

#endif /* _time_period_dto_H_ */

