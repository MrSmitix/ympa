/*
 * orders_stats_details_dto.h
 *
 * Информация об удалении товара из заказа.
 */

#ifndef _orders_stats_details_dto_H_
#define _orders_stats_details_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct orders_stats_details_dto_t orders_stats_details_dto_t;

#include "orders_stats_item_status_type.h"
#include "orders_stats_stock_type.h"

// Enum  for orders_stats_details_dto

typedef enum  { _api__orders_stats_details_dto__NULL = 0, _api__orders_stats_details_dto__REJECTED, _api__orders_stats_details_dto__RETURNED } _api__orders_stats_details_dto__e;

char* orders_stats_details_dto_item_status_ToString(_api__orders_stats_details_dto__e item_status);

_api__orders_stats_details_dto__e orders_stats_details_dto_item_status_FromString(char* item_status);

// Enum  for orders_stats_details_dto

typedef enum  { _api__orders_stats_details_dto__NULL = 0, _api__orders_stats_details_dto__FIT, _api__orders_stats_details_dto__FREEZE, _api__orders_stats_details_dto__AVAILABLE, _api__orders_stats_details_dto__QUARANTINE, _api__orders_stats_details_dto__UTILIZATION, _api__orders_stats_details_dto__DEFECT, _api__orders_stats_details_dto__EXPIRED } _api__orders_stats_details_dto__e;

char* orders_stats_details_dto_stock_type_ToString(_api__orders_stats_details_dto__e stock_type);

_api__orders_stats_details_dto__e orders_stats_details_dto_stock_type_FromString(char* stock_type);



typedef struct orders_stats_details_dto_t {
    orders_stats_item_status_type_t *item_status; // custom
    long item_count; //numeric
    char *update_date; //date
    orders_stats_stock_type_t *stock_type; // custom

} orders_stats_details_dto_t;

orders_stats_details_dto_t *orders_stats_details_dto_create(
    orders_stats_item_status_type_t *item_status,
    long item_count,
    char *update_date,
    orders_stats_stock_type_t *stock_type
);

void orders_stats_details_dto_free(orders_stats_details_dto_t *orders_stats_details_dto);

orders_stats_details_dto_t *orders_stats_details_dto_parseFromJSON(cJSON *orders_stats_details_dtoJSON);

cJSON *orders_stats_details_dto_convertToJSON(orders_stats_details_dto_t *orders_stats_details_dto);

#endif /* _orders_stats_details_dto_H_ */

