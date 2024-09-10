/*
 * age_dto.h
 *
 * Возраст в заданных единицах измерения.
 */

#ifndef _age_dto_H_
#define _age_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct age_dto_t age_dto_t;

#include "age_unit_type.h"

// Enum  for age_dto

typedef enum  { _api__age_dto__NULL = 0, _api__age_dto__YEAR, _api__age_dto__MONTH } _api__age_dto__e;

char* age_dto_age_unit_ToString(_api__age_dto__e age_unit);

_api__age_dto__e age_dto_age_unit_FromString(char* age_unit);



typedef struct age_dto_t {
    double value; //numeric
    age_unit_type_t *age_unit; // custom

} age_dto_t;

age_dto_t *age_dto_create(
    double value,
    age_unit_type_t *age_unit
);

void age_dto_free(age_dto_t *age_dto);

age_dto_t *age_dto_parseFromJSON(cJSON *age_dtoJSON);

cJSON *age_dto_convertToJSON(age_dto_t *age_dto);

#endif /* _age_dto_H_ */

