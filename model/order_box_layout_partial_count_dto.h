/*
 * order_box_layout_partial_count_dto.h
 *
 * Информация о части товара в коробке.
 */

#ifndef _order_box_layout_partial_count_dto_H_
#define _order_box_layout_partial_count_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct order_box_layout_partial_count_dto_t order_box_layout_partial_count_dto_t;




typedef struct order_box_layout_partial_count_dto_t {
    int current; //numeric
    int total; //numeric

} order_box_layout_partial_count_dto_t;

order_box_layout_partial_count_dto_t *order_box_layout_partial_count_dto_create(
    int current,
    int total
);

void order_box_layout_partial_count_dto_free(order_box_layout_partial_count_dto_t *order_box_layout_partial_count_dto);

order_box_layout_partial_count_dto_t *order_box_layout_partial_count_dto_parseFromJSON(cJSON *order_box_layout_partial_count_dtoJSON);

cJSON *order_box_layout_partial_count_dto_convertToJSON(order_box_layout_partial_count_dto_t *order_box_layout_partial_count_dto);

#endif /* _order_box_layout_partial_count_dto_H_ */

