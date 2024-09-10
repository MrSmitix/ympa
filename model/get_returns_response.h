/*
 * get_returns_response.h
 *
 * 
 */

#ifndef _get_returns_response_H_
#define _get_returns_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct get_returns_response_t get_returns_response_t;

#include "api_response_status_type.h"
#include "paged_returns_dto.h"

// Enum  for get_returns_response

typedef enum  { _api__get_returns_response__NULL = 0, _api__get_returns_response__OK, _api__get_returns_response__ERROR } _api__get_returns_response__e;

char* get_returns_response_status_ToString(_api__get_returns_response__e status);

_api__get_returns_response__e get_returns_response_status_FromString(char* status);



typedef struct get_returns_response_t {
    api_response_status_type_t *status; // custom
    struct paged_returns_dto_t *result; //model

} get_returns_response_t;

get_returns_response_t *get_returns_response_create(
    api_response_status_type_t *status,
    paged_returns_dto_t *result
);

void get_returns_response_free(get_returns_response_t *get_returns_response);

get_returns_response_t *get_returns_response_parseFromJSON(cJSON *get_returns_responseJSON);

cJSON *get_returns_response_convertToJSON(get_returns_response_t *get_returns_response);

#endif /* _get_returns_response_H_ */

