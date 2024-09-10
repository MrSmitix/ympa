/*
 * update_order_status_response.h
 *
 * Информация об изменении статуса заказа.
 */

#ifndef _update_order_status_response_H_
#define _update_order_status_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct update_order_status_response_t update_order_status_response_t;

#include "order_dto.h"



typedef struct update_order_status_response_t {
    struct order_dto_t *order; //model

} update_order_status_response_t;

update_order_status_response_t *update_order_status_response_create(
    order_dto_t *order
);

void update_order_status_response_free(update_order_status_response_t *update_order_status_response);

update_order_status_response_t *update_order_status_response_parseFromJSON(cJSON *update_order_status_responseJSON);

cJSON *update_order_status_response_convertToJSON(update_order_status_response_t *update_order_status_response);

#endif /* _update_order_status_response_H_ */

