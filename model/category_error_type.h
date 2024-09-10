/*
 * category_error_type.h
 *
 * Типы ошибок:  * &#x60;UNKNOWN_CATEGORY&#x60; — указана неизвестная категория. * &#x60;CATEGORY_IS_NOT_LEAF&#x60; — указана нелистовая категория. Укажите ту, которая не имеет дочерних категорий. 
 */

#ifndef _category_error_type_H_
#define _category_error_type_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct category_error_type_t category_error_type_t;


// Enum  for category_error_type

typedef enum { _api__category_error_type__NULL = 0, _api__category_error_type__UNKNOWN_CATEGORY, _api__category_error_type__CATEGORY_IS_NOT_LEAF } _api__category_error_type__e;

char* category_error_type_category_error_type_ToString(_api__category_error_type__e category_error_type);

_api__category_error_type__e category_error_type_category_error_type_FromString(char* category_error_type);

//cJSON *category_error_type_category_error_type_convertToJSON(_api__category_error_type__e category_error_type);

//_api__category_error_type__e category_error_type_category_error_type_parseFromJSON(cJSON *category_error_typeJSON);

#endif /* _category_error_type_H_ */

