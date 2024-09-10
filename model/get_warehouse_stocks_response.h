/*
 * get_warehouse_stocks_response.h
 *
 * 
 */

#ifndef _get_warehouse_stocks_response_H_
#define _get_warehouse_stocks_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct get_warehouse_stocks_response_t get_warehouse_stocks_response_t;

#include "api_response_status_type.h"
#include "get_warehouse_stocks_dto.h"

// Enum  for get_warehouse_stocks_response

typedef enum  { _api__get_warehouse_stocks_response__NULL = 0, _api__get_warehouse_stocks_response__OK, _api__get_warehouse_stocks_response__ERROR } _api__get_warehouse_stocks_response__e;

char* get_warehouse_stocks_response_status_ToString(_api__get_warehouse_stocks_response__e status);

_api__get_warehouse_stocks_response__e get_warehouse_stocks_response_status_FromString(char* status);



typedef struct get_warehouse_stocks_response_t {
    api_response_status_type_t *status; // custom
    struct get_warehouse_stocks_dto_t *result; //model

} get_warehouse_stocks_response_t;

get_warehouse_stocks_response_t *get_warehouse_stocks_response_create(
    api_response_status_type_t *status,
    get_warehouse_stocks_dto_t *result
);

void get_warehouse_stocks_response_free(get_warehouse_stocks_response_t *get_warehouse_stocks_response);

get_warehouse_stocks_response_t *get_warehouse_stocks_response_parseFromJSON(cJSON *get_warehouse_stocks_responseJSON);

cJSON *get_warehouse_stocks_response_convertToJSON(get_warehouse_stocks_response_t *get_warehouse_stocks_response);

#endif /* _get_warehouse_stocks_response_H_ */

