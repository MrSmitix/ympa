/*
 * verify_order_eac_response.h
 *
 * 
 */

#ifndef _verify_order_eac_response_H_
#define _verify_order_eac_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct verify_order_eac_response_t verify_order_eac_response_t;

#include "api_response_status_type.h"
#include "eac_verification_result_dto.h"

// Enum  for verify_order_eac_response

typedef enum  { _api__verify_order_eac_response__NULL = 0, _api__verify_order_eac_response__OK, _api__verify_order_eac_response__ERROR } _api__verify_order_eac_response__e;

char* verify_order_eac_response_status_ToString(_api__verify_order_eac_response__e status);

_api__verify_order_eac_response__e verify_order_eac_response_status_FromString(char* status);



typedef struct verify_order_eac_response_t {
    api_response_status_type_t *status; // custom
    struct eac_verification_result_dto_t *result; //model

} verify_order_eac_response_t;

verify_order_eac_response_t *verify_order_eac_response_create(
    api_response_status_type_t *status,
    eac_verification_result_dto_t *result
);

void verify_order_eac_response_free(verify_order_eac_response_t *verify_order_eac_response);

verify_order_eac_response_t *verify_order_eac_response_parseFromJSON(cJSON *verify_order_eac_responseJSON);

cJSON *verify_order_eac_response_convertToJSON(verify_order_eac_response_t *verify_order_eac_response);

#endif /* _verify_order_eac_response_H_ */

