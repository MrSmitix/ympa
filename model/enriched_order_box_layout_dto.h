/*
 * enriched_order_box_layout_dto.h
 *
 * Информация о коробке.
 */

#ifndef _enriched_order_box_layout_dto_H_
#define _enriched_order_box_layout_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct enriched_order_box_layout_dto_t enriched_order_box_layout_dto_t;

#include "order_box_layout_item_dto.h"



typedef struct enriched_order_box_layout_dto_t {
    list_t *items; //nonprimitive container
    long box_id; //numeric

} enriched_order_box_layout_dto_t;

enriched_order_box_layout_dto_t *enriched_order_box_layout_dto_create(
    list_t *items,
    long box_id
);

void enriched_order_box_layout_dto_free(enriched_order_box_layout_dto_t *enriched_order_box_layout_dto);

enriched_order_box_layout_dto_t *enriched_order_box_layout_dto_parseFromJSON(cJSON *enriched_order_box_layout_dtoJSON);

cJSON *enriched_order_box_layout_dto_convertToJSON(enriched_order_box_layout_dto_t *enriched_order_box_layout_dto);

#endif /* _enriched_order_box_layout_dto_H_ */

