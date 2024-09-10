/*
 * set_order_box_layout_response.h
 *
 * 
 */

#ifndef _set_order_box_layout_response_H_
#define _set_order_box_layout_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct set_order_box_layout_response_t set_order_box_layout_response_t;

#include "api_response_status_type.h"
#include "order_boxes_layout_dto.h"

// Enum  for set_order_box_layout_response

typedef enum  { _api__set_order_box_layout_response__NULL = 0, _api__set_order_box_layout_response__OK, _api__set_order_box_layout_response__ERROR } _api__set_order_box_layout_response__e;

char* set_order_box_layout_response_status_ToString(_api__set_order_box_layout_response__e status);

_api__set_order_box_layout_response__e set_order_box_layout_response_status_FromString(char* status);



typedef struct set_order_box_layout_response_t {
    api_response_status_type_t *status; // custom
    struct order_boxes_layout_dto_t *result; //model

} set_order_box_layout_response_t;

set_order_box_layout_response_t *set_order_box_layout_response_create(
    api_response_status_type_t *status,
    order_boxes_layout_dto_t *result
);

void set_order_box_layout_response_free(set_order_box_layout_response_t *set_order_box_layout_response);

set_order_box_layout_response_t *set_order_box_layout_response_parseFromJSON(cJSON *set_order_box_layout_responseJSON);

cJSON *set_order_box_layout_response_convertToJSON(set_order_box_layout_response_t *set_order_box_layout_response);

#endif /* _set_order_box_layout_response_H_ */

