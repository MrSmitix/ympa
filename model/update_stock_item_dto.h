/*
 * update_stock_item_dto.h
 *
 * Информация об остатках товара. 
 */

#ifndef _update_stock_item_dto_H_
#define _update_stock_item_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct update_stock_item_dto_t update_stock_item_dto_t;




typedef struct update_stock_item_dto_t {
    long count; //numeric
    char *updated_at; //date time

} update_stock_item_dto_t;

update_stock_item_dto_t *update_stock_item_dto_create(
    long count,
    char *updated_at
);

void update_stock_item_dto_free(update_stock_item_dto_t *update_stock_item_dto);

update_stock_item_dto_t *update_stock_item_dto_parseFromJSON(cJSON *update_stock_item_dtoJSON);

cJSON *update_stock_item_dto_convertToJSON(update_stock_item_dto_t *update_stock_item_dto);

#endif /* _update_stock_item_dto_H_ */

