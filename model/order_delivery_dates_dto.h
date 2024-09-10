/*
 * order_delivery_dates_dto.h
 *
 * Диапазон дат доставки.
 */

#ifndef _order_delivery_dates_dto_H_
#define _order_delivery_dates_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct order_delivery_dates_dto_t order_delivery_dates_dto_t;




typedef struct order_delivery_dates_dto_t {
    char *from_date; // string
    char *to_date; // string
    char *from_time; // string
    char *to_time; // string
    char *real_delivery_date; // string

} order_delivery_dates_dto_t;

order_delivery_dates_dto_t *order_delivery_dates_dto_create(
    char *from_date,
    char *to_date,
    char *from_time,
    char *to_time,
    char *real_delivery_date
);

void order_delivery_dates_dto_free(order_delivery_dates_dto_t *order_delivery_dates_dto);

order_delivery_dates_dto_t *order_delivery_dates_dto_parseFromJSON(cJSON *order_delivery_dates_dtoJSON);

cJSON *order_delivery_dates_dto_convertToJSON(order_delivery_dates_dto_t *order_delivery_dates_dto);

#endif /* _order_delivery_dates_dto_H_ */

