/*
 * get_shipment_response.h
 *
 * 
 */

#ifndef _get_shipment_response_H_
#define _get_shipment_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct get_shipment_response_t get_shipment_response_t;

#include "api_response_status_type.h"
#include "shipment_dto.h"

// Enum  for get_shipment_response

typedef enum  { _api__get_shipment_response__NULL = 0, _api__get_shipment_response__OK, _api__get_shipment_response__ERROR } _api__get_shipment_response__e;

char* get_shipment_response_status_ToString(_api__get_shipment_response__e status);

_api__get_shipment_response__e get_shipment_response_status_FromString(char* status);



typedef struct get_shipment_response_t {
    api_response_status_type_t *status; // custom
    struct shipment_dto_t *result; //model

} get_shipment_response_t;

get_shipment_response_t *get_shipment_response_create(
    api_response_status_type_t *status,
    shipment_dto_t *result
);

void get_shipment_response_free(get_shipment_response_t *get_shipment_response);

get_shipment_response_t *get_shipment_response_parseFromJSON(cJSON *get_shipment_responseJSON);

cJSON *get_shipment_response_convertToJSON(get_shipment_response_t *get_shipment_response);

#endif /* _get_shipment_response_H_ */

