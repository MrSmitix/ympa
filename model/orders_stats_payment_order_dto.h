/*
 * orders_stats_payment_order_dto.h
 *
 * Информация о платежном получении.
 */

#ifndef _orders_stats_payment_order_dto_H_
#define _orders_stats_payment_order_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct orders_stats_payment_order_dto_t orders_stats_payment_order_dto_t;




typedef struct orders_stats_payment_order_dto_t {
    char *id; // string
    char *date; //date

} orders_stats_payment_order_dto_t;

orders_stats_payment_order_dto_t *orders_stats_payment_order_dto_create(
    char *id,
    char *date
);

void orders_stats_payment_order_dto_free(orders_stats_payment_order_dto_t *orders_stats_payment_order_dto);

orders_stats_payment_order_dto_t *orders_stats_payment_order_dto_parseFromJSON(cJSON *orders_stats_payment_order_dtoJSON);

cJSON *orders_stats_payment_order_dto_convertToJSON(orders_stats_payment_order_dto_t *orders_stats_payment_order_dto);

#endif /* _orders_stats_payment_order_dto_H_ */

