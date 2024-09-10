/*
 * update_order_item_request.h
 *
 * Запрос на обновление состава заказа.
 */

#ifndef _update_order_item_request_H_
#define _update_order_item_request_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct update_order_item_request_t update_order_item_request_t;

#include "order_item_modification_dto.h"
#include "order_items_modification_request_reason_type.h"

// Enum  for update_order_item_request

typedef enum  { _api__update_order_item_request__NULL = 0, _api__update_order_item_request__PARTNER_REQUESTED_REMOVE, _api__update_order_item_request__USER_REQUESTED_REMOVE } _api__update_order_item_request__e;

char* update_order_item_request_reason_ToString(_api__update_order_item_request__e reason);

_api__update_order_item_request__e update_order_item_request_reason_FromString(char* reason);



typedef struct update_order_item_request_t {
    list_t *items; //nonprimitive container
    order_items_modification_request_reason_type_t *reason; // custom

} update_order_item_request_t;

update_order_item_request_t *update_order_item_request_create(
    list_t *items,
    order_items_modification_request_reason_type_t *reason
);

void update_order_item_request_free(update_order_item_request_t *update_order_item_request);

update_order_item_request_t *update_order_item_request_parseFromJSON(cJSON *update_order_item_requestJSON);

cJSON *update_order_item_request_convertToJSON(update_order_item_request_t *update_order_item_request);

#endif /* _update_order_item_request_H_ */

