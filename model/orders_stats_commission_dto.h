/*
 * orders_stats_commission_dto.h
 *
 * Информация о стоимости услуг.
 */

#ifndef _orders_stats_commission_dto_H_
#define _orders_stats_commission_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct orders_stats_commission_dto_t orders_stats_commission_dto_t;

#include "orders_stats_commission_type.h"

// Enum  for orders_stats_commission_dto

typedef enum  { _api__orders_stats_commission_dto__NULL = 0, _api__orders_stats_commission_dto__FEE, _api__orders_stats_commission_dto__FULFILLMENT, _api__orders_stats_commission_dto__LOYALTY_PARTICIPATION_FEE, _api__orders_stats_commission_dto__AUCTION_PROMOTION, _api__orders_stats_commission_dto__INSTALLMENT, _api__orders_stats_commission_dto__DELIVERY_TO_CUSTOMER, _api__orders_stats_commission_dto__EXPRESS_DELIVERY_TO_CUSTOMER, _api__orders_stats_commission_dto__AGENCY, _api__orders_stats_commission_dto__PAYMENT_TRANSFER, _api__orders_stats_commission_dto__RETURNED_ORDERS_STORAGE, _api__orders_stats_commission_dto__SORTING, _api__orders_stats_commission_dto__INTAKE_SORTING, _api__orders_stats_commission_dto__RETURN_PROCESSING, _api__orders_stats_commission_dto__ILLIQUID_GOODS_SALE } _api__orders_stats_commission_dto__e;

char* orders_stats_commission_dto_type_ToString(_api__orders_stats_commission_dto__e type);

_api__orders_stats_commission_dto__e orders_stats_commission_dto_type_FromString(char* type);



typedef struct orders_stats_commission_dto_t {
    orders_stats_commission_type_t *type; // custom
    double actual; //numeric

} orders_stats_commission_dto_t;

orders_stats_commission_dto_t *orders_stats_commission_dto_create(
    orders_stats_commission_type_t *type,
    double actual
);

void orders_stats_commission_dto_free(orders_stats_commission_dto_t *orders_stats_commission_dto);

orders_stats_commission_dto_t *orders_stats_commission_dto_parseFromJSON(cJSON *orders_stats_commission_dtoJSON);

cJSON *orders_stats_commission_dto_convertToJSON(orders_stats_commission_dto_t *orders_stats_commission_dto);

#endif /* _orders_stats_commission_dto_H_ */

