/*
 * get_categories_request.h
 *
 * Параметры запроса категорий. 
 */

#ifndef _get_categories_request_H_
#define _get_categories_request_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct get_categories_request_t get_categories_request_t;

#include "language_type.h"

// Enum  for get_categories_request

typedef enum  { _api__get_categories_request__NULL = 0, _api__get_categories_request__RU, _api__get_categories_request__EN } _api__get_categories_request__e;

char* get_categories_request_language_ToString(_api__get_categories_request__e language);

_api__get_categories_request__e get_categories_request_language_FromString(char* language);



typedef struct get_categories_request_t {
    language_type_t *language; // custom

} get_categories_request_t;

get_categories_request_t *get_categories_request_create(
    language_type_t *language
);

void get_categories_request_free(get_categories_request_t *get_categories_request);

get_categories_request_t *get_categories_request_parseFromJSON(cJSON *get_categories_requestJSON);

cJSON *get_categories_request_convertToJSON(get_categories_request_t *get_categories_request);

#endif /* _get_categories_request_H_ */

