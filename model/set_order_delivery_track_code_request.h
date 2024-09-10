/*
 * set_order_delivery_track_code_request.h
 *
 * 
 */

#ifndef _set_order_delivery_track_code_request_H_
#define _set_order_delivery_track_code_request_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct set_order_delivery_track_code_request_t set_order_delivery_track_code_request_t;




typedef struct set_order_delivery_track_code_request_t {
    char *track_code; // string
    long delivery_service_id; //numeric

} set_order_delivery_track_code_request_t;

set_order_delivery_track_code_request_t *set_order_delivery_track_code_request_create(
    char *track_code,
    long delivery_service_id
);

void set_order_delivery_track_code_request_free(set_order_delivery_track_code_request_t *set_order_delivery_track_code_request);

set_order_delivery_track_code_request_t *set_order_delivery_track_code_request_parseFromJSON(cJSON *set_order_delivery_track_code_requestJSON);

cJSON *set_order_delivery_track_code_request_convertToJSON(set_order_delivery_track_code_request_t *set_order_delivery_track_code_request);

#endif /* _set_order_delivery_track_code_request_H_ */

