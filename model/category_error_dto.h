/*
 * category_error_dto.h
 *
 * Текст ошибки.
 */

#ifndef _category_error_dto_H_
#define _category_error_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct category_error_dto_t category_error_dto_t;

#include "category_error_type.h"

// Enum  for category_error_dto

typedef enum  { _api__category_error_dto__NULL = 0, _api__category_error_dto__UNKNOWN_CATEGORY, _api__category_error_dto__CATEGORY_IS_NOT_LEAF } _api__category_error_dto__e;

char* category_error_dto_type_ToString(_api__category_error_dto__e type);

_api__category_error_dto__e category_error_dto_type_FromString(char* type);



typedef struct category_error_dto_t {
    long category_id; //numeric
    category_error_type_t *type; // custom

} category_error_dto_t;

category_error_dto_t *category_error_dto_create(
    long category_id,
    category_error_type_t *type
);

void category_error_dto_free(category_error_dto_t *category_error_dto);

category_error_dto_t *category_error_dto_parseFromJSON(cJSON *category_error_dtoJSON);

cJSON *category_error_dto_convertToJSON(category_error_dto_t *category_error_dto);

#endif /* _category_error_dto_H_ */

