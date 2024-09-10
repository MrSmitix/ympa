/*
 * tariff_parameter_dto.h
 *
 * Детали расчета конкретной услуги Маркета.
 */

#ifndef _tariff_parameter_dto_H_
#define _tariff_parameter_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct tariff_parameter_dto_t tariff_parameter_dto_t;




typedef struct tariff_parameter_dto_t {
    char *name; // string
    char *value; // string

} tariff_parameter_dto_t;

tariff_parameter_dto_t *tariff_parameter_dto_create(
    char *name,
    char *value
);

void tariff_parameter_dto_free(tariff_parameter_dto_t *tariff_parameter_dto);

tariff_parameter_dto_t *tariff_parameter_dto_parseFromJSON(cJSON *tariff_parameter_dtoJSON);

cJSON *tariff_parameter_dto_convertToJSON(tariff_parameter_dto_t *tariff_parameter_dto);

#endif /* _tariff_parameter_dto_H_ */

