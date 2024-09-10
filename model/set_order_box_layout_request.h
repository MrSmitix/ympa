/*
 * set_order_box_layout_request.h
 *
 * 
 */

#ifndef _set_order_box_layout_request_H_
#define _set_order_box_layout_request_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct set_order_box_layout_request_t set_order_box_layout_request_t;

#include "order_box_layout_dto.h"



typedef struct set_order_box_layout_request_t {
    list_t *boxes; //nonprimitive container
    int allow_remove; //boolean

} set_order_box_layout_request_t;

set_order_box_layout_request_t *set_order_box_layout_request_create(
    list_t *boxes,
    int allow_remove
);

void set_order_box_layout_request_free(set_order_box_layout_request_t *set_order_box_layout_request);

set_order_box_layout_request_t *set_order_box_layout_request_parseFromJSON(cJSON *set_order_box_layout_requestJSON);

cJSON *set_order_box_layout_request_convertToJSON(set_order_box_layout_request_t *set_order_box_layout_request);

#endif /* _set_order_box_layout_request_H_ */

