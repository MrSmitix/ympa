/*
 * category_content_parameters_dto.h
 *
 * Информация о параметрах категории.
 */

#ifndef _category_content_parameters_dto_H_
#define _category_content_parameters_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct category_content_parameters_dto_t category_content_parameters_dto_t;

#include "category_parameter_dto.h"



typedef struct category_content_parameters_dto_t {
    int category_id; //numeric
    list_t *parameters; //nonprimitive container

} category_content_parameters_dto_t;

category_content_parameters_dto_t *category_content_parameters_dto_create(
    int category_id,
    list_t *parameters
);

void category_content_parameters_dto_free(category_content_parameters_dto_t *category_content_parameters_dto);

category_content_parameters_dto_t *category_content_parameters_dto_parseFromJSON(cJSON *category_content_parameters_dtoJSON);

cJSON *category_content_parameters_dto_convertToJSON(category_content_parameters_dto_t *category_content_parameters_dto);

#endif /* _category_content_parameters_dto_H_ */

