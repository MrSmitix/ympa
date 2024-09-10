/*
 * orders_stats_order_dto.h
 *
 * Информация о заказе.
 */

#ifndef _orders_stats_order_dto_H_
#define _orders_stats_order_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct orders_stats_order_dto_t orders_stats_order_dto_t;

#include "order_stats_status_type.h"
#include "orders_stats_commission_dto.h"
#include "orders_stats_delivery_region_dto.h"
#include "orders_stats_item_dto.h"
#include "orders_stats_order_payment_type.h"
#include "orders_stats_payment_dto.h"

// Enum  for orders_stats_order_dto

typedef enum  { _api__orders_stats_order_dto__NULL = 0, _api__orders_stats_order_dto__CANCELLED_BEFORE_PROCESSING, _api__orders_stats_order_dto__CANCELLED_IN_DELIVERY, _api__orders_stats_order_dto__CANCELLED_IN_PROCESSING, _api__orders_stats_order_dto__DELIVERY, _api__orders_stats_order_dto__DELIVERED, _api__orders_stats_order_dto__PARTIALLY_DELIVERED, _api__orders_stats_order_dto__PARTIALLY_RETURNED, _api__orders_stats_order_dto__PENDING, _api__orders_stats_order_dto__PICKUP, _api__orders_stats_order_dto__PROCESSING, _api__orders_stats_order_dto__RESERVED, _api__orders_stats_order_dto__RETURNED, _api__orders_stats_order_dto__UNKNOWN, _api__orders_stats_order_dto__UNPAID, _api__orders_stats_order_dto__LOST } _api__orders_stats_order_dto__e;

char* orders_stats_order_dto_status_ToString(_api__orders_stats_order_dto__e status);

_api__orders_stats_order_dto__e orders_stats_order_dto_status_FromString(char* status);

// Enum  for orders_stats_order_dto

typedef enum  { _api__orders_stats_order_dto__NULL = 0, _api__orders_stats_order_dto__CREDIT, _api__orders_stats_order_dto__POSTPAID, _api__orders_stats_order_dto__PREPAID, _api__orders_stats_order_dto__TINKOFF_CREDIT } _api__orders_stats_order_dto__e;

char* orders_stats_order_dto_payment_type_ToString(_api__orders_stats_order_dto__e payment_type);

_api__orders_stats_order_dto__e orders_stats_order_dto_payment_type_FromString(char* payment_type);



typedef struct orders_stats_order_dto_t {
    long id; //numeric
    char *creation_date; //date
    char *status_update_date; //date time
    order_stats_status_type_t *status; // custom
    char *partner_order_id; // string
    orders_stats_order_payment_type_t *payment_type; // custom
    int fake; //boolean
    struct orders_stats_delivery_region_dto_t *delivery_region; //model
    list_t *items; //nonprimitive container
    list_t *initial_items; //nonprimitive container
    list_t *payments; //nonprimitive container
    list_t *commissions; //nonprimitive container

} orders_stats_order_dto_t;

orders_stats_order_dto_t *orders_stats_order_dto_create(
    long id,
    char *creation_date,
    char *status_update_date,
    order_stats_status_type_t *status,
    char *partner_order_id,
    orders_stats_order_payment_type_t *payment_type,
    int fake,
    orders_stats_delivery_region_dto_t *delivery_region,
    list_t *items,
    list_t *initial_items,
    list_t *payments,
    list_t *commissions
);

void orders_stats_order_dto_free(orders_stats_order_dto_t *orders_stats_order_dto);

orders_stats_order_dto_t *orders_stats_order_dto_parseFromJSON(cJSON *orders_stats_order_dtoJSON);

cJSON *orders_stats_order_dto_convertToJSON(orders_stats_order_dto_t *orders_stats_order_dto);

#endif /* _orders_stats_order_dto_H_ */

