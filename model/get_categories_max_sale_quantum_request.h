/*
 * get_categories_max_sale_quantum_request.h
 *
 * Список категорий, для которых нужно вернуть лимит на установку кванта и минимального количества товаров. 
 */

#ifndef _get_categories_max_sale_quantum_request_H_
#define _get_categories_max_sale_quantum_request_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct get_categories_max_sale_quantum_request_t get_categories_max_sale_quantum_request_t;




typedef struct get_categories_max_sale_quantum_request_t {
    list_t *market_category_ids; //primitive container

} get_categories_max_sale_quantum_request_t;

get_categories_max_sale_quantum_request_t *get_categories_max_sale_quantum_request_create(
    list_t *market_category_ids
);

void get_categories_max_sale_quantum_request_free(get_categories_max_sale_quantum_request_t *get_categories_max_sale_quantum_request);

get_categories_max_sale_quantum_request_t *get_categories_max_sale_quantum_request_parseFromJSON(cJSON *get_categories_max_sale_quantum_requestJSON);

cJSON *get_categories_max_sale_quantum_request_convertToJSON(get_categories_max_sale_quantum_request_t *get_categories_max_sale_quantum_request);

#endif /* _get_categories_max_sale_quantum_request_H_ */

