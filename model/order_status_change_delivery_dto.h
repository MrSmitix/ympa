/*
 * order_status_change_delivery_dto.h
 *
 * Информация о доставке.
 */

#ifndef _order_status_change_delivery_dto_H_
#define _order_status_change_delivery_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct order_status_change_delivery_dto_t order_status_change_delivery_dto_t;

#include "order_status_change_delivery_dates_dto.h"



typedef struct order_status_change_delivery_dto_t {
    struct order_status_change_delivery_dates_dto_t *dates; //model

} order_status_change_delivery_dto_t;

order_status_change_delivery_dto_t *order_status_change_delivery_dto_create(
    order_status_change_delivery_dates_dto_t *dates
);

void order_status_change_delivery_dto_free(order_status_change_delivery_dto_t *order_status_change_delivery_dto);

order_status_change_delivery_dto_t *order_status_change_delivery_dto_parseFromJSON(cJSON *order_status_change_delivery_dtoJSON);

cJSON *order_status_change_delivery_dto_convertToJSON(order_status_change_delivery_dto_t *order_status_change_delivery_dto);

#endif /* _order_status_change_delivery_dto_H_ */

