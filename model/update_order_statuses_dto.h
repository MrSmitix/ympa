/*
 * update_order_statuses_dto.h
 *
 * Список заказов, статус которых обновился.
 */

#ifndef _update_order_statuses_dto_H_
#define _update_order_statuses_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct update_order_statuses_dto_t update_order_statuses_dto_t;

#include "update_order_status_dto.h"



typedef struct update_order_statuses_dto_t {
    list_t *orders; //nonprimitive container

} update_order_statuses_dto_t;

update_order_statuses_dto_t *update_order_statuses_dto_create(
    list_t *orders
);

void update_order_statuses_dto_free(update_order_statuses_dto_t *update_order_statuses_dto);

update_order_statuses_dto_t *update_order_statuses_dto_parseFromJSON(cJSON *update_order_statuses_dtoJSON);

cJSON *update_order_statuses_dto_convertToJSON(update_order_statuses_dto_t *update_order_statuses_dto);

#endif /* _update_order_statuses_dto_H_ */

