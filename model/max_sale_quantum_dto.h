/*
 * max_sale_quantum_dto.h
 *
 * Лимит на установку кванта и минимального количества товаров по категориям. 
 */

#ifndef _max_sale_quantum_dto_H_
#define _max_sale_quantum_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct max_sale_quantum_dto_t max_sale_quantum_dto_t;




typedef struct max_sale_quantum_dto_t {
    long id; //numeric
    char *name; // string
    int max_sale_quantum; //numeric

} max_sale_quantum_dto_t;

max_sale_quantum_dto_t *max_sale_quantum_dto_create(
    long id,
    char *name,
    int max_sale_quantum
);

void max_sale_quantum_dto_free(max_sale_quantum_dto_t *max_sale_quantum_dto);

max_sale_quantum_dto_t *max_sale_quantum_dto_parseFromJSON(cJSON *max_sale_quantum_dtoJSON);

cJSON *max_sale_quantum_dto_convertToJSON(max_sale_quantum_dto_t *max_sale_quantum_dto);

#endif /* _max_sale_quantum_dto_H_ */

