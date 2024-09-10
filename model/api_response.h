/*
 * api_response.h
 *
 * Стандартная обертка для ответов сервера.
 */

#ifndef _api_response_H_
#define _api_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct api_response_t api_response_t;

#include "api_response_status_type.h"

// Enum  for api_response

typedef enum  { _api__api_response__NULL = 0, _api__api_response__OK, _api__api_response__ERROR } _api__api_response__e;

char* api_response_status_ToString(_api__api_response__e status);

_api__api_response__e api_response_status_FromString(char* status);



typedef struct api_response_t {
    api_response_status_type_t *status; // custom

} api_response_t;

api_response_t *api_response_create(
    api_response_status_type_t *status
);

void api_response_free(api_response_t *api_response);

api_response_t *api_response_parseFromJSON(cJSON *api_responseJSON);

cJSON *api_response_convertToJSON(api_response_t *api_response);

#endif /* _api_response_H_ */

