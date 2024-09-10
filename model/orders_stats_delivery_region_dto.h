/*
 * orders_stats_delivery_region_dto.h
 *
 * Информация о регионе доставки.
 */

#ifndef _orders_stats_delivery_region_dto_H_
#define _orders_stats_delivery_region_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct orders_stats_delivery_region_dto_t orders_stats_delivery_region_dto_t;




typedef struct orders_stats_delivery_region_dto_t {
    long id; //numeric
    char *name; // string

} orders_stats_delivery_region_dto_t;

orders_stats_delivery_region_dto_t *orders_stats_delivery_region_dto_create(
    long id,
    char *name
);

void orders_stats_delivery_region_dto_free(orders_stats_delivery_region_dto_t *orders_stats_delivery_region_dto);

orders_stats_delivery_region_dto_t *orders_stats_delivery_region_dto_parseFromJSON(cJSON *orders_stats_delivery_region_dtoJSON);

cJSON *orders_stats_delivery_region_dto_convertToJSON(orders_stats_delivery_region_dto_t *orders_stats_delivery_region_dto);

#endif /* _orders_stats_delivery_region_dto_H_ */

