/*
 * get_category_content_parameters_response.h
 *
 * Ответ со списком характеристик для категории и их допустимыми значениями.
 */

#ifndef _get_category_content_parameters_response_H_
#define _get_category_content_parameters_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct get_category_content_parameters_response_t get_category_content_parameters_response_t;

#include "api_response_status_type.h"
#include "category_content_parameters_dto.h"

// Enum  for get_category_content_parameters_response

typedef enum  { _api__get_category_content_parameters_response__NULL = 0, _api__get_category_content_parameters_response__OK, _api__get_category_content_parameters_response__ERROR } _api__get_category_content_parameters_response__e;

char* get_category_content_parameters_response_status_ToString(_api__get_category_content_parameters_response__e status);

_api__get_category_content_parameters_response__e get_category_content_parameters_response_status_FromString(char* status);



typedef struct get_category_content_parameters_response_t {
    api_response_status_type_t *status; // custom
    struct category_content_parameters_dto_t *result; //model

} get_category_content_parameters_response_t;

get_category_content_parameters_response_t *get_category_content_parameters_response_create(
    api_response_status_type_t *status,
    category_content_parameters_dto_t *result
);

void get_category_content_parameters_response_free(get_category_content_parameters_response_t *get_category_content_parameters_response);

get_category_content_parameters_response_t *get_category_content_parameters_response_parseFromJSON(cJSON *get_category_content_parameters_responseJSON);

cJSON *get_category_content_parameters_response_convertToJSON(get_category_content_parameters_response_t *get_category_content_parameters_response);

#endif /* _get_category_content_parameters_response_H_ */

