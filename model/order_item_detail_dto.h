/*
 * order_item_detail_dto.h
 *
 * Детали по товару в заказе.
 */

#ifndef _order_item_detail_dto_H_
#define _order_item_detail_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct order_item_detail_dto_t order_item_detail_dto_t;

#include "order_item_status_type.h"

// Enum  for order_item_detail_dto

typedef enum  { _api__order_item_detail_dto__NULL = 0, _api__order_item_detail_dto__REJECTED, _api__order_item_detail_dto__RETURNED } _api__order_item_detail_dto__e;

char* order_item_detail_dto_item_status_ToString(_api__order_item_detail_dto__e item_status);

_api__order_item_detail_dto__e order_item_detail_dto_item_status_FromString(char* item_status);



typedef struct order_item_detail_dto_t {
    long item_count; //numeric
    order_item_status_type_t *item_status; // custom
    char *update_date; // string

} order_item_detail_dto_t;

order_item_detail_dto_t *order_item_detail_dto_create(
    long item_count,
    order_item_status_type_t *item_status,
    char *update_date
);

void order_item_detail_dto_free(order_item_detail_dto_t *order_item_detail_dto);

order_item_detail_dto_t *order_item_detail_dto_parseFromJSON(cJSON *order_item_detail_dtoJSON);

cJSON *order_item_detail_dto_convertToJSON(order_item_detail_dto_t *order_item_detail_dto);

#endif /* _order_item_detail_dto_H_ */

