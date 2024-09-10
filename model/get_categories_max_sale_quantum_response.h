/*
 * get_categories_max_sale_quantum_response.h
 *
 * 
 */

#ifndef _get_categories_max_sale_quantum_response_H_
#define _get_categories_max_sale_quantum_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct get_categories_max_sale_quantum_response_t get_categories_max_sale_quantum_response_t;

#include "api_response_status_type.h"
#include "category_error_dto.h"
#include "max_sale_quantum_dto.h"

// Enum  for get_categories_max_sale_quantum_response

typedef enum  { _api__get_categories_max_sale_quantum_response__NULL = 0, _api__get_categories_max_sale_quantum_response__OK, _api__get_categories_max_sale_quantum_response__ERROR } _api__get_categories_max_sale_quantum_response__e;

char* get_categories_max_sale_quantum_response_status_ToString(_api__get_categories_max_sale_quantum_response__e status);

_api__get_categories_max_sale_quantum_response__e get_categories_max_sale_quantum_response_status_FromString(char* status);



typedef struct get_categories_max_sale_quantum_response_t {
    api_response_status_type_t *status; // custom
    list_t *results; //nonprimitive container
    list_t *errors; //nonprimitive container

} get_categories_max_sale_quantum_response_t;

get_categories_max_sale_quantum_response_t *get_categories_max_sale_quantum_response_create(
    api_response_status_type_t *status,
    list_t *results,
    list_t *errors
);

void get_categories_max_sale_quantum_response_free(get_categories_max_sale_quantum_response_t *get_categories_max_sale_quantum_response);

get_categories_max_sale_quantum_response_t *get_categories_max_sale_quantum_response_parseFromJSON(cJSON *get_categories_max_sale_quantum_responseJSON);

cJSON *get_categories_max_sale_quantum_response_convertToJSON(get_categories_max_sale_quantum_response_t *get_categories_max_sale_quantum_response);

#endif /* _get_categories_max_sale_quantum_response_H_ */

