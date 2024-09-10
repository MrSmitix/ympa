/*
 * api_client_data_error_response.h
 *
 * Ошибка в данных переданных от клиента.
 */

#ifndef _api_client_data_error_response_H_
#define _api_client_data_error_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct api_client_data_error_response_t api_client_data_error_response_t;

#include "api_error_dto.h"
#include "api_response_status_type.h"

// Enum  for api_client_data_error_response

typedef enum  { _api__api_client_data_error_response__NULL = 0, _api__api_client_data_error_response__OK, _api__api_client_data_error_response__ERROR } _api__api_client_data_error_response__e;

char* api_client_data_error_response_status_ToString(_api__api_client_data_error_response__e status);

_api__api_client_data_error_response__e api_client_data_error_response_status_FromString(char* status);



typedef struct api_client_data_error_response_t {
    api_response_status_type_t *status; // custom
    list_t *errors; //nonprimitive container

} api_client_data_error_response_t;

api_client_data_error_response_t *api_client_data_error_response_create(
    api_response_status_type_t *status,
    list_t *errors
);

void api_client_data_error_response_free(api_client_data_error_response_t *api_client_data_error_response);

api_client_data_error_response_t *api_client_data_error_response_parseFromJSON(cJSON *api_client_data_error_responseJSON);

cJSON *api_client_data_error_response_convertToJSON(api_client_data_error_response_t *api_client_data_error_response);

#endif /* _api_client_data_error_response_H_ */

