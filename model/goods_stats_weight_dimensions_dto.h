/*
 * goods_stats_weight_dimensions_dto.h
 *
 * Информация о весе и габаритах товара.  Если товар уже привязан к карточке (&#x60;marketSku&#x60;), в ответе вернутся габариты из карточки Маркета, а не размеры, которые вы передаете. 
 */

#ifndef _goods_stats_weight_dimensions_dto_H_
#define _goods_stats_weight_dimensions_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct goods_stats_weight_dimensions_dto_t goods_stats_weight_dimensions_dto_t;




typedef struct goods_stats_weight_dimensions_dto_t {
    double length; //numeric
    double width; //numeric
    double height; //numeric
    double weight; //numeric

} goods_stats_weight_dimensions_dto_t;

goods_stats_weight_dimensions_dto_t *goods_stats_weight_dimensions_dto_create(
    double length,
    double width,
    double height,
    double weight
);

void goods_stats_weight_dimensions_dto_free(goods_stats_weight_dimensions_dto_t *goods_stats_weight_dimensions_dto);

goods_stats_weight_dimensions_dto_t *goods_stats_weight_dimensions_dto_parseFromJSON(cJSON *goods_stats_weight_dimensions_dtoJSON);

cJSON *goods_stats_weight_dimensions_dto_convertToJSON(goods_stats_weight_dimensions_dto_t *goods_stats_weight_dimensions_dto);

#endif /* _goods_stats_weight_dimensions_dto_H_ */

