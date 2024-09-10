/*
 * orders_stats_dto.h
 *
 * Информация по заказам.
 */

#ifndef _orders_stats_dto_H_
#define _orders_stats_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct orders_stats_dto_t orders_stats_dto_t;

#include "forward_scrolling_pager_dto.h"
#include "orders_stats_order_dto.h"



typedef struct orders_stats_dto_t {
    list_t *orders; //nonprimitive container
    struct forward_scrolling_pager_dto_t *paging; //model

} orders_stats_dto_t;

orders_stats_dto_t *orders_stats_dto_create(
    list_t *orders,
    forward_scrolling_pager_dto_t *paging
);

void orders_stats_dto_free(orders_stats_dto_t *orders_stats_dto);

orders_stats_dto_t *orders_stats_dto_parseFromJSON(cJSON *orders_stats_dtoJSON);

cJSON *orders_stats_dto_convertToJSON(orders_stats_dto_t *orders_stats_dto);

#endif /* _orders_stats_dto_H_ */

