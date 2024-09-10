/*
 * get_outlet_licenses_response.h
 *
 * 
 */

#ifndef _get_outlet_licenses_response_H_
#define _get_outlet_licenses_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct get_outlet_licenses_response_t get_outlet_licenses_response_t;

#include "api_response_status_type.h"
#include "outlet_licenses_response_dto.h"

// Enum  for get_outlet_licenses_response

typedef enum  { _api__get_outlet_licenses_response__NULL = 0, _api__get_outlet_licenses_response__OK, _api__get_outlet_licenses_response__ERROR } _api__get_outlet_licenses_response__e;

char* get_outlet_licenses_response_status_ToString(_api__get_outlet_licenses_response__e status);

_api__get_outlet_licenses_response__e get_outlet_licenses_response_status_FromString(char* status);



typedef struct get_outlet_licenses_response_t {
    api_response_status_type_t *status; // custom
    struct outlet_licenses_response_dto_t *result; //model

} get_outlet_licenses_response_t;

get_outlet_licenses_response_t *get_outlet_licenses_response_create(
    api_response_status_type_t *status,
    outlet_licenses_response_dto_t *result
);

void get_outlet_licenses_response_free(get_outlet_licenses_response_t *get_outlet_licenses_response);

get_outlet_licenses_response_t *get_outlet_licenses_response_parseFromJSON(cJSON *get_outlet_licenses_responseJSON);

cJSON *get_outlet_licenses_response_convertToJSON(get_outlet_licenses_response_t *get_outlet_licenses_response);

#endif /* _get_outlet_licenses_response_H_ */

