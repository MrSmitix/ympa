/*
 * orders_stats_payment_dto.h
 *
 * Информация о денежных переводах по заказу.
 */

#ifndef _orders_stats_payment_dto_H_
#define _orders_stats_payment_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct orders_stats_payment_dto_t orders_stats_payment_dto_t;

#include "orders_stats_payment_order_dto.h"
#include "orders_stats_payment_source_type.h"
#include "orders_stats_payment_type.h"

// Enum  for orders_stats_payment_dto

typedef enum  { _api__orders_stats_payment_dto__NULL = 0, _api__orders_stats_payment_dto__PAYMENT, _api__orders_stats_payment_dto__REFUND, _api__orders_stats_payment_dto__UNKNOWN } _api__orders_stats_payment_dto__e;

char* orders_stats_payment_dto_type_ToString(_api__orders_stats_payment_dto__e type);

_api__orders_stats_payment_dto__e orders_stats_payment_dto_type_FromString(char* type);

// Enum  for orders_stats_payment_dto

typedef enum  { _api__orders_stats_payment_dto__NULL = 0, _api__orders_stats_payment_dto__BUYER, _api__orders_stats_payment_dto__CASHBACK, _api__orders_stats_payment_dto__MARKETPLACE, _api__orders_stats_payment_dto__SPLIT } _api__orders_stats_payment_dto__e;

char* orders_stats_payment_dto_source_ToString(_api__orders_stats_payment_dto__e source);

_api__orders_stats_payment_dto__e orders_stats_payment_dto_source_FromString(char* source);



typedef struct orders_stats_payment_dto_t {
    char *id; // string
    char *date; //date
    orders_stats_payment_type_t *type; // custom
    orders_stats_payment_source_type_t *source; // custom
    double total; //numeric
    struct orders_stats_payment_order_dto_t *payment_order; //model

} orders_stats_payment_dto_t;

orders_stats_payment_dto_t *orders_stats_payment_dto_create(
    char *id,
    char *date,
    orders_stats_payment_type_t *type,
    orders_stats_payment_source_type_t *source,
    double total,
    orders_stats_payment_order_dto_t *payment_order
);

void orders_stats_payment_dto_free(orders_stats_payment_dto_t *orders_stats_payment_dto);

orders_stats_payment_dto_t *orders_stats_payment_dto_parseFromJSON(cJSON *orders_stats_payment_dtoJSON);

cJSON *orders_stats_payment_dto_convertToJSON(orders_stats_payment_dto_t *orders_stats_payment_dto);

#endif /* _orders_stats_payment_dto_H_ */

