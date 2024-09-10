/*
 * parameter_value_option_dto.h
 *
 * Значение характеристики.
 */

#ifndef _parameter_value_option_dto_H_
#define _parameter_value_option_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct parameter_value_option_dto_t parameter_value_option_dto_t;




typedef struct parameter_value_option_dto_t {
    long id; //numeric
    char *value; // string
    char *description; // string

} parameter_value_option_dto_t;

parameter_value_option_dto_t *parameter_value_option_dto_create(
    long id,
    char *value,
    char *description
);

void parameter_value_option_dto_free(parameter_value_option_dto_t *parameter_value_option_dto);

parameter_value_option_dto_t *parameter_value_option_dto_parseFromJSON(cJSON *parameter_value_option_dtoJSON);

cJSON *parameter_value_option_dto_convertToJSON(parameter_value_option_dto_t *parameter_value_option_dto);

#endif /* _parameter_value_option_dto_H_ */

