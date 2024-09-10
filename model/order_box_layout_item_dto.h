/*
 * order_box_layout_item_dto.h
 *
 * Информация о товаре в коробке.
 */

#ifndef _order_box_layout_item_dto_H_
#define _order_box_layout_item_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct order_box_layout_item_dto_t order_box_layout_item_dto_t;

#include "brief_order_item_instance_dto.h"
#include "order_box_layout_partial_count_dto.h"



typedef struct order_box_layout_item_dto_t {
    long id; //numeric
    int full_count; //numeric
    struct order_box_layout_partial_count_dto_t *partial_count; //model
    list_t *instances; //nonprimitive container

} order_box_layout_item_dto_t;

order_box_layout_item_dto_t *order_box_layout_item_dto_create(
    long id,
    int full_count,
    order_box_layout_partial_count_dto_t *partial_count,
    list_t *instances
);

void order_box_layout_item_dto_free(order_box_layout_item_dto_t *order_box_layout_item_dto);

order_box_layout_item_dto_t *order_box_layout_item_dto_parseFromJSON(cJSON *order_box_layout_item_dtoJSON);

cJSON *order_box_layout_item_dto_convertToJSON(order_box_layout_item_dto_t *order_box_layout_item_dto);

#endif /* _order_box_layout_item_dto_H_ */

