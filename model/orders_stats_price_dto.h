/*
 * orders_stats_price_dto.h
 *
 * Цена или скидки на товар.
 */

#ifndef _orders_stats_price_dto_H_
#define _orders_stats_price_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct orders_stats_price_dto_t orders_stats_price_dto_t;

#include "orders_stats_price_type.h"

// Enum  for orders_stats_price_dto

typedef enum  { _api__orders_stats_price_dto__NULL = 0, _api__orders_stats_price_dto__BUYER, _api__orders_stats_price_dto__CASHBACK, _api__orders_stats_price_dto__MARKETPLACE } _api__orders_stats_price_dto__e;

char* orders_stats_price_dto_type_ToString(_api__orders_stats_price_dto__e type);

_api__orders_stats_price_dto__e orders_stats_price_dto_type_FromString(char* type);



typedef struct orders_stats_price_dto_t {
    orders_stats_price_type_t *type; // custom
    double cost_per_item; //numeric
    double total; //numeric

} orders_stats_price_dto_t;

orders_stats_price_dto_t *orders_stats_price_dto_create(
    orders_stats_price_type_t *type,
    double cost_per_item,
    double total
);

void orders_stats_price_dto_free(orders_stats_price_dto_t *orders_stats_price_dto);

orders_stats_price_dto_t *orders_stats_price_dto_parseFromJSON(cJSON *orders_stats_price_dtoJSON);

cJSON *orders_stats_price_dto_convertToJSON(orders_stats_price_dto_t *orders_stats_price_dto);

#endif /* _orders_stats_price_dto_H_ */

