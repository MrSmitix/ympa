/*
 * verify_order_eac_request.h
 *
 * 
 */

#ifndef _verify_order_eac_request_H_
#define _verify_order_eac_request_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct verify_order_eac_request_t verify_order_eac_request_t;




typedef struct verify_order_eac_request_t {
    char *code; // string

} verify_order_eac_request_t;

verify_order_eac_request_t *verify_order_eac_request_create(
    char *code
);

void verify_order_eac_request_free(verify_order_eac_request_t *verify_order_eac_request);

verify_order_eac_request_t *verify_order_eac_request_parseFromJSON(cJSON *verify_order_eac_requestJSON);

cJSON *verify_order_eac_request_convertToJSON(verify_order_eac_request_t *verify_order_eac_request);

#endif /* _verify_order_eac_request_H_ */

