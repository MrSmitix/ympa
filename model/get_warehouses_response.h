/*
 * get_warehouses_response.h
 *
 * 
 */

#ifndef _get_warehouses_response_H_
#define _get_warehouses_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct get_warehouses_response_t get_warehouses_response_t;

#include "api_response_status_type.h"
#include "warehouses_dto.h"

// Enum  for get_warehouses_response

typedef enum  { _api__get_warehouses_response__NULL = 0, _api__get_warehouses_response__OK, _api__get_warehouses_response__ERROR } _api__get_warehouses_response__e;

char* get_warehouses_response_status_ToString(_api__get_warehouses_response__e status);

_api__get_warehouses_response__e get_warehouses_response_status_FromString(char* status);



typedef struct get_warehouses_response_t {
    api_response_status_type_t *status; // custom
    struct warehouses_dto_t *result; //model

} get_warehouses_response_t;

get_warehouses_response_t *get_warehouses_response_create(
    api_response_status_type_t *status,
    warehouses_dto_t *result
);

void get_warehouses_response_free(get_warehouses_response_t *get_warehouses_response);

get_warehouses_response_t *get_warehouses_response_parseFromJSON(cJSON *get_warehouses_responseJSON);

cJSON *get_warehouses_response_convertToJSON(get_warehouses_response_t *get_warehouses_response);

#endif /* _get_warehouses_response_H_ */

