/*
 * return_item_dto.h
 *
 * Список товаров в возврате.
 */

#ifndef _return_item_dto_H_
#define _return_item_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct return_item_dto_t return_item_dto_t;

#include "return_decision_dto.h"
#include "return_instance_dto.h"
#include "track_dto.h"



typedef struct return_item_dto_t {
    long market_sku; //numeric
    char *shop_sku; // string
    long count; //numeric
    list_t *decisions; //nonprimitive container
    list_t *instances; //nonprimitive container
    list_t *tracks; //nonprimitive container

} return_item_dto_t;

return_item_dto_t *return_item_dto_create(
    long market_sku,
    char *shop_sku,
    long count,
    list_t *decisions,
    list_t *instances,
    list_t *tracks
);

void return_item_dto_free(return_item_dto_t *return_item_dto);

return_item_dto_t *return_item_dto_parseFromJSON(cJSON *return_item_dtoJSON);

cJSON *return_item_dto_convertToJSON(return_item_dto_t *return_item_dto);

#endif /* _return_item_dto_H_ */

