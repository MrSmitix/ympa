/*
 * order_boxes_layout_dto.h
 *
 * Распределение товаров по коробкам.
 */

#ifndef _order_boxes_layout_dto_H_
#define _order_boxes_layout_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct order_boxes_layout_dto_t order_boxes_layout_dto_t;

#include "enriched_order_box_layout_dto.h"



typedef struct order_boxes_layout_dto_t {
    list_t *boxes; //nonprimitive container

} order_boxes_layout_dto_t;

order_boxes_layout_dto_t *order_boxes_layout_dto_create(
    list_t *boxes
);

void order_boxes_layout_dto_free(order_boxes_layout_dto_t *order_boxes_layout_dto);

order_boxes_layout_dto_t *order_boxes_layout_dto_parseFromJSON(cJSON *order_boxes_layout_dtoJSON);

cJSON *order_boxes_layout_dto_convertToJSON(order_boxes_layout_dto_t *order_boxes_layout_dto);

#endif /* _order_boxes_layout_dto_H_ */

