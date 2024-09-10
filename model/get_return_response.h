/*
 * get_return_response.h
 *
 * 
 */

#ifndef _get_return_response_H_
#define _get_return_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct get_return_response_t get_return_response_t;

#include "api_response_status_type.h"
#include "return_dto.h"

// Enum  for get_return_response

typedef enum  { _api__get_return_response__NULL = 0, _api__get_return_response__OK, _api__get_return_response__ERROR } _api__get_return_response__e;

char* get_return_response_status_ToString(_api__get_return_response__e status);

_api__get_return_response__e get_return_response_status_FromString(char* status);



typedef struct get_return_response_t {
    api_response_status_type_t *status; // custom
    struct return_dto_t *result; //model

} get_return_response_t;

get_return_response_t *get_return_response_create(
    api_response_status_type_t *status,
    return_dto_t *result
);

void get_return_response_free(get_return_response_t *get_return_response);

get_return_response_t *get_return_response_parseFromJSON(cJSON *get_return_responseJSON);

cJSON *get_return_response_convertToJSON(get_return_response_t *get_return_response);

#endif /* _get_return_response_H_ */

