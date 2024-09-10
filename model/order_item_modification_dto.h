/*
 * order_item_modification_dto.h
 *
 * Список товаров в заказе.  Если магазин не передал информацию о товаре во входных данных, он будет удален из заказа.  Обязательный параметр. 
 */

#ifndef _order_item_modification_dto_H_
#define _order_item_modification_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct order_item_modification_dto_t order_item_modification_dto_t;

#include "brief_order_item_instance_dto.h"



typedef struct order_item_modification_dto_t {
    long id; //numeric
    int count; //numeric
    list_t *instances; //nonprimitive container

} order_item_modification_dto_t;

order_item_modification_dto_t *order_item_modification_dto_create(
    long id,
    int count,
    list_t *instances
);

void order_item_modification_dto_free(order_item_modification_dto_t *order_item_modification_dto);

order_item_modification_dto_t *order_item_modification_dto_parseFromJSON(cJSON *order_item_modification_dtoJSON);

cJSON *order_item_modification_dto_convertToJSON(order_item_modification_dto_t *order_item_modification_dto);

#endif /* _order_item_modification_dto_H_ */

