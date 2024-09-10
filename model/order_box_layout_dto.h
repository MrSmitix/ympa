/*
 * order_box_layout_dto.h
 *
 * Информация о коробке.
 */

#ifndef _order_box_layout_dto_H_
#define _order_box_layout_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct order_box_layout_dto_t order_box_layout_dto_t;

#include "order_box_layout_item_dto.h"



typedef struct order_box_layout_dto_t {
    list_t *items; //nonprimitive container

} order_box_layout_dto_t;

order_box_layout_dto_t *order_box_layout_dto_create(
    list_t *items
);

void order_box_layout_dto_free(order_box_layout_dto_t *order_box_layout_dto);

order_box_layout_dto_t *order_box_layout_dto_parseFromJSON(cJSON *order_box_layout_dtoJSON);

cJSON *order_box_layout_dto_convertToJSON(order_box_layout_dto_t *order_box_layout_dto);

#endif /* _order_box_layout_dto_H_ */

