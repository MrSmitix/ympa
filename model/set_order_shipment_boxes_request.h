/*
 * set_order_shipment_boxes_request.h
 *
 * 
 */

#ifndef _set_order_shipment_boxes_request_H_
#define _set_order_shipment_boxes_request_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct set_order_shipment_boxes_request_t set_order_shipment_boxes_request_t;

#include "parcel_box_dto.h"



typedef struct set_order_shipment_boxes_request_t {
    list_t *boxes; //nonprimitive container

} set_order_shipment_boxes_request_t;

set_order_shipment_boxes_request_t *set_order_shipment_boxes_request_create(
    list_t *boxes
);

void set_order_shipment_boxes_request_free(set_order_shipment_boxes_request_t *set_order_shipment_boxes_request);

set_order_shipment_boxes_request_t *set_order_shipment_boxes_request_parseFromJSON(cJSON *set_order_shipment_boxes_requestJSON);

cJSON *set_order_shipment_boxes_request_convertToJSON(set_order_shipment_boxes_request_t *set_order_shipment_boxes_request);

#endif /* _set_order_shipment_boxes_request_H_ */

