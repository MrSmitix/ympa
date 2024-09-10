/*
 * empty_api_response.h
 *
 * Пустой ответ сервера.
 */

#ifndef _empty_api_response_H_
#define _empty_api_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct empty_api_response_t empty_api_response_t;

#include "api_response_status_type.h"

// Enum  for empty_api_response

typedef enum  { _api__empty_api_response__NULL = 0, _api__empty_api_response__OK, _api__empty_api_response__ERROR } _api__empty_api_response__e;

char* empty_api_response_status_ToString(_api__empty_api_response__e status);

_api__empty_api_response__e empty_api_response_status_FromString(char* status);



typedef struct empty_api_response_t {
    api_response_status_type_t *status; // custom

} empty_api_response_t;

empty_api_response_t *empty_api_response_create(
    api_response_status_type_t *status
);

void empty_api_response_free(empty_api_response_t *empty_api_response);

empty_api_response_t *empty_api_response_parseFromJSON(cJSON *empty_api_responseJSON);

cJSON *empty_api_response_convertToJSON(empty_api_response_t *empty_api_response);

#endif /* _empty_api_response_H_ */

