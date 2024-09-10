/*
 * get_categories_max_sale_quantum_dto.h
 *
 * Категории и лимит на установку кванта и минимального количества товаров.
 */

#ifndef _get_categories_max_sale_quantum_dto_H_
#define _get_categories_max_sale_quantum_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct get_categories_max_sale_quantum_dto_t get_categories_max_sale_quantum_dto_t;

#include "category_error_dto.h"
#include "max_sale_quantum_dto.h"



typedef struct get_categories_max_sale_quantum_dto_t {
    list_t *results; //nonprimitive container
    list_t *errors; //nonprimitive container

} get_categories_max_sale_quantum_dto_t;

get_categories_max_sale_quantum_dto_t *get_categories_max_sale_quantum_dto_create(
    list_t *results,
    list_t *errors
);

void get_categories_max_sale_quantum_dto_free(get_categories_max_sale_quantum_dto_t *get_categories_max_sale_quantum_dto);

get_categories_max_sale_quantum_dto_t *get_categories_max_sale_quantum_dto_parseFromJSON(cJSON *get_categories_max_sale_quantum_dtoJSON);

cJSON *get_categories_max_sale_quantum_dto_convertToJSON(get_categories_max_sale_quantum_dto_t *get_categories_max_sale_quantum_dto);

#endif /* _get_categories_max_sale_quantum_dto_H_ */

