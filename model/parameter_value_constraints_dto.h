/*
 * parameter_value_constraints_dto.h
 *
 * Ограничения на значения характеристик.
 */

#ifndef _parameter_value_constraints_dto_H_
#define _parameter_value_constraints_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct parameter_value_constraints_dto_t parameter_value_constraints_dto_t;




typedef struct parameter_value_constraints_dto_t {
    double min_value; //numeric
    double max_value; //numeric
    int max_length; //numeric

} parameter_value_constraints_dto_t;

parameter_value_constraints_dto_t *parameter_value_constraints_dto_create(
    double min_value,
    double max_value,
    int max_length
);

void parameter_value_constraints_dto_free(parameter_value_constraints_dto_t *parameter_value_constraints_dto);

parameter_value_constraints_dto_t *parameter_value_constraints_dto_parseFromJSON(cJSON *parameter_value_constraints_dtoJSON);

cJSON *parameter_value_constraints_dto_convertToJSON(parameter_value_constraints_dto_t *parameter_value_constraints_dto);

#endif /* _parameter_value_constraints_dto_H_ */

