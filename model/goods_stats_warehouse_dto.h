/*
 * goods_stats_warehouse_dto.h
 *
 * Информация о складе.
 */

#ifndef _goods_stats_warehouse_dto_H_
#define _goods_stats_warehouse_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct goods_stats_warehouse_dto_t goods_stats_warehouse_dto_t;

#include "warehouse_stock_dto.h"



typedef struct goods_stats_warehouse_dto_t {
    long id; //numeric
    char *name; // string
    list_t *stocks; //nonprimitive container

} goods_stats_warehouse_dto_t;

goods_stats_warehouse_dto_t *goods_stats_warehouse_dto_create(
    long id,
    char *name,
    list_t *stocks
);

void goods_stats_warehouse_dto_free(goods_stats_warehouse_dto_t *goods_stats_warehouse_dto);

goods_stats_warehouse_dto_t *goods_stats_warehouse_dto_parseFromJSON(cJSON *goods_stats_warehouse_dtoJSON);

cJSON *goods_stats_warehouse_dto_convertToJSON(goods_stats_warehouse_dto_t *goods_stats_warehouse_dto);

#endif /* _goods_stats_warehouse_dto_H_ */

