/*
 * category_dto.h
 *
 * Информация о категории.  Категория считается листовой, если у нее нет дочерних категорий. 
 */

#ifndef _category_dto_H_
#define _category_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct category_dto_t category_dto_t;




typedef struct category_dto_t {
    long id; //numeric
    char *name; // string
    list_t *children; //nonprimitive container

} category_dto_t;

category_dto_t *category_dto_create(
    long id,
    char *name,
    list_t *children
);

void category_dto_free(category_dto_t *category_dto);

category_dto_t *category_dto_parseFromJSON(cJSON *category_dtoJSON);

cJSON *category_dto_convertToJSON(category_dto_t *category_dto);

#endif /* _category_dto_H_ */

