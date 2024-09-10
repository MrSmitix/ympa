/*
 * update_stock_dto.h
 *
 * Информация об остатках одного товара на одном из складов.
 */

#ifndef _update_stock_dto_H_
#define _update_stock_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct update_stock_dto_t update_stock_dto_t;

#include "update_stock_item_dto.h"



typedef struct update_stock_dto_t {
    char *sku; // string
    list_t *items; //nonprimitive container

} update_stock_dto_t;

update_stock_dto_t *update_stock_dto_create(
    char *sku,
    list_t *items
);

void update_stock_dto_free(update_stock_dto_t *update_stock_dto);

update_stock_dto_t *update_stock_dto_parseFromJSON(cJSON *update_stock_dtoJSON);

cJSON *update_stock_dto_convertToJSON(update_stock_dto_t *update_stock_dto);

#endif /* _update_stock_dto_H_ */

