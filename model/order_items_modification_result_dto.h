/*
 * order_items_modification_result_dto.h
 *
 * Краткие сведения о промаркированных товарах. Параметр возвращается, если ответ &#x60;OK&#x60;. 
 */

#ifndef _order_items_modification_result_dto_H_
#define _order_items_modification_result_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct order_items_modification_result_dto_t order_items_modification_result_dto_t;

#include "brief_order_item_dto.h"



typedef struct order_items_modification_result_dto_t {
    list_t *items; //nonprimitive container

} order_items_modification_result_dto_t;

order_items_modification_result_dto_t *order_items_modification_result_dto_create(
    list_t *items
);

void order_items_modification_result_dto_free(order_items_modification_result_dto_t *order_items_modification_result_dto);

order_items_modification_result_dto_t *order_items_modification_result_dto_parseFromJSON(cJSON *order_items_modification_result_dtoJSON);

cJSON *order_items_modification_result_dto_convertToJSON(order_items_modification_result_dto_t *order_items_modification_result_dto);

#endif /* _order_items_modification_result_dto_H_ */

