/*
 * option_values_limited_dto.h
 *
 * Значение ограничивающей характеристики и список допустимых значений ограничиваемой характеристики.
 */

#ifndef _option_values_limited_dto_H_
#define _option_values_limited_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct option_values_limited_dto_t option_values_limited_dto_t;




typedef struct option_values_limited_dto_t {
    long limiting_option_value_id; //numeric
    list_t *option_value_ids; //primitive container

} option_values_limited_dto_t;

option_values_limited_dto_t *option_values_limited_dto_create(
    long limiting_option_value_id,
    list_t *option_value_ids
);

void option_values_limited_dto_free(option_values_limited_dto_t *option_values_limited_dto);

option_values_limited_dto_t *option_values_limited_dto_parseFromJSON(cJSON *option_values_limited_dtoJSON);

cJSON *option_values_limited_dto_convertToJSON(option_values_limited_dto_t *option_values_limited_dto);

#endif /* _option_values_limited_dto_H_ */

