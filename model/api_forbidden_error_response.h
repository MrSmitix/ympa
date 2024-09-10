/*
 * api_forbidden_error_response.h
 *
 * Неверны авторизационные данные, указанные в запросе, или запрещен доступ к запрашиваемому ресурсу.
 */

#ifndef _api_forbidden_error_response_H_
#define _api_forbidden_error_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct api_forbidden_error_response_t api_forbidden_error_response_t;

#include "api_error_dto.h"
#include "api_response_status_type.h"

// Enum  for api_forbidden_error_response

typedef enum  { _api__api_forbidden_error_response__NULL = 0, _api__api_forbidden_error_response__OK, _api__api_forbidden_error_response__ERROR } _api__api_forbidden_error_response__e;

char* api_forbidden_error_response_status_ToString(_api__api_forbidden_error_response__e status);

_api__api_forbidden_error_response__e api_forbidden_error_response_status_FromString(char* status);



typedef struct api_forbidden_error_response_t {
    api_response_status_type_t *status; // custom
    list_t *errors; //nonprimitive container

} api_forbidden_error_response_t;

api_forbidden_error_response_t *api_forbidden_error_response_create(
    api_response_status_type_t *status,
    list_t *errors
);

void api_forbidden_error_response_free(api_forbidden_error_response_t *api_forbidden_error_response);

api_forbidden_error_response_t *api_forbidden_error_response_parseFromJSON(cJSON *api_forbidden_error_responseJSON);

cJSON *api_forbidden_error_response_convertToJSON(api_forbidden_error_response_t *api_forbidden_error_response);

#endif /* _api_forbidden_error_response_H_ */

