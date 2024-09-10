/*
 * order_status_change_delivery_dates_dto.h
 *
 * Диапазон дат доставки.
 */

#ifndef _order_status_change_delivery_dates_dto_H_
#define _order_status_change_delivery_dates_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct order_status_change_delivery_dates_dto_t order_status_change_delivery_dates_dto_t;




typedef struct order_status_change_delivery_dates_dto_t {
    char *real_delivery_date; //date

} order_status_change_delivery_dates_dto_t;

order_status_change_delivery_dates_dto_t *order_status_change_delivery_dates_dto_create(
    char *real_delivery_date
);

void order_status_change_delivery_dates_dto_free(order_status_change_delivery_dates_dto_t *order_status_change_delivery_dates_dto);

order_status_change_delivery_dates_dto_t *order_status_change_delivery_dates_dto_parseFromJSON(cJSON *order_status_change_delivery_dates_dtoJSON);

cJSON *order_status_change_delivery_dates_dto_convertToJSON(order_status_change_delivery_dates_dto_t *order_status_change_delivery_dates_dto);

#endif /* _order_status_change_delivery_dates_dto_H_ */

