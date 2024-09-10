/*
 * calculate_tariffs_response.h
 *
 * 
 */

#ifndef _calculate_tariffs_response_H_
#define _calculate_tariffs_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct calculate_tariffs_response_t calculate_tariffs_response_t;

#include "api_response_status_type.h"
#include "calculate_tariffs_response_dto.h"

// Enum  for calculate_tariffs_response

typedef enum  { _api__calculate_tariffs_response__NULL = 0, _api__calculate_tariffs_response__OK, _api__calculate_tariffs_response__ERROR } _api__calculate_tariffs_response__e;

char* calculate_tariffs_response_status_ToString(_api__calculate_tariffs_response__e status);

_api__calculate_tariffs_response__e calculate_tariffs_response_status_FromString(char* status);



typedef struct calculate_tariffs_response_t {
    api_response_status_type_t *status; // custom
    struct calculate_tariffs_response_dto_t *result; //model

} calculate_tariffs_response_t;

calculate_tariffs_response_t *calculate_tariffs_response_create(
    api_response_status_type_t *status,
    calculate_tariffs_response_dto_t *result
);

void calculate_tariffs_response_free(calculate_tariffs_response_t *calculate_tariffs_response);

calculate_tariffs_response_t *calculate_tariffs_response_parseFromJSON(cJSON *calculate_tariffs_responseJSON);

cJSON *calculate_tariffs_response_convertToJSON(calculate_tariffs_response_t *calculate_tariffs_response);

#endif /* _calculate_tariffs_response_H_ */

