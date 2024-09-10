/*
 * goods_stats_goods_dto.h
 *
 * Информация о товаре.
 */

#ifndef _goods_stats_goods_dto_H_
#define _goods_stats_goods_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct goods_stats_goods_dto_t goods_stats_goods_dto_t;

#include "goods_stats_warehouse_dto.h"
#include "goods_stats_weight_dimensions_dto.h"
#include "tariff_dto.h"



typedef struct goods_stats_goods_dto_t {
    char *shop_sku; // string
    long market_sku; //numeric
    char *name; // string
    double price; //numeric
    long category_id; //numeric
    char *category_name; // string
    struct goods_stats_weight_dimensions_dto_t *weight_dimensions; //model
    list_t *warehouses; //nonprimitive container
    list_t *tariffs; //nonprimitive container
    list_t *pictures; //primitive container

} goods_stats_goods_dto_t;

goods_stats_goods_dto_t *goods_stats_goods_dto_create(
    char *shop_sku,
    long market_sku,
    char *name,
    double price,
    long category_id,
    char *category_name,
    goods_stats_weight_dimensions_dto_t *weight_dimensions,
    list_t *warehouses,
    list_t *tariffs,
    list_t *pictures
);

void goods_stats_goods_dto_free(goods_stats_goods_dto_t *goods_stats_goods_dto);

goods_stats_goods_dto_t *goods_stats_goods_dto_parseFromJSON(cJSON *goods_stats_goods_dtoJSON);

cJSON *goods_stats_goods_dto_convertToJSON(goods_stats_goods_dto_t *goods_stats_goods_dto);

#endif /* _goods_stats_goods_dto_H_ */

