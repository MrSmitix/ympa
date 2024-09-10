/*
 * provide_order_item_identifiers_request.h
 *
 * 
 */

#ifndef _provide_order_item_identifiers_request_H_
#define _provide_order_item_identifiers_request_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct provide_order_item_identifiers_request_t provide_order_item_identifiers_request_t;

#include "order_item_instance_modification_dto.h"



typedef struct provide_order_item_identifiers_request_t {
    list_t *items; //nonprimitive container

} provide_order_item_identifiers_request_t;

provide_order_item_identifiers_request_t *provide_order_item_identifiers_request_create(
    list_t *items
);

void provide_order_item_identifiers_request_free(provide_order_item_identifiers_request_t *provide_order_item_identifiers_request);

provide_order_item_identifiers_request_t *provide_order_item_identifiers_request_parseFromJSON(cJSON *provide_order_item_identifiers_requestJSON);

cJSON *provide_order_item_identifiers_request_convertToJSON(provide_order_item_identifiers_request_t *provide_order_item_identifiers_request);

#endif /* _provide_order_item_identifiers_request_H_ */

