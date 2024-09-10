/*
 * goods_stats_dto.h
 *
 * Отчет по товарам.
 */

#ifndef _goods_stats_dto_H_
#define _goods_stats_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct goods_stats_dto_t goods_stats_dto_t;

#include "goods_stats_goods_dto.h"



typedef struct goods_stats_dto_t {
    list_t *shop_skus; //nonprimitive container

} goods_stats_dto_t;

goods_stats_dto_t *goods_stats_dto_create(
    list_t *shop_skus
);

void goods_stats_dto_free(goods_stats_dto_t *goods_stats_dto);

goods_stats_dto_t *goods_stats_dto_parseFromJSON(cJSON *goods_stats_dtoJSON);

cJSON *goods_stats_dto_convertToJSON(goods_stats_dto_t *goods_stats_dto);

#endif /* _goods_stats_dto_H_ */

