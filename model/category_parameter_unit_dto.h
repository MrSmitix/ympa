/*
 * category_parameter_unit_dto.h
 *
 * Единицы измерения характеристики товара.
 */

#ifndef _category_parameter_unit_dto_H_
#define _category_parameter_unit_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct category_parameter_unit_dto_t category_parameter_unit_dto_t;

#include "unit_dto.h"



typedef struct category_parameter_unit_dto_t {
    long default_unit_id; //numeric
    list_t *units; //nonprimitive container

} category_parameter_unit_dto_t;

category_parameter_unit_dto_t *category_parameter_unit_dto_create(
    long default_unit_id,
    list_t *units
);

void category_parameter_unit_dto_free(category_parameter_unit_dto_t *category_parameter_unit_dto);

category_parameter_unit_dto_t *category_parameter_unit_dto_parseFromJSON(cJSON *category_parameter_unit_dtoJSON);

cJSON *category_parameter_unit_dto_convertToJSON(category_parameter_unit_dto_t *category_parameter_unit_dto);

#endif /* _category_parameter_unit_dto_H_ */

