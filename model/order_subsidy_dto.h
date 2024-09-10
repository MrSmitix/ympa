/*
 * order_subsidy_dto.h
 *
 * Общее вознаграждение партнеру за DBS-доставку и все скидки на товар:  * по промокодам, купонам и акциям; * по баллам Плюса; * по доставке (DBS).  Передается в валюте заказа. 
 */

#ifndef _order_subsidy_dto_H_
#define _order_subsidy_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct order_subsidy_dto_t order_subsidy_dto_t;

#include "order_subsidy_type.h"

// Enum  for order_subsidy_dto

typedef enum  { _api__order_subsidy_dto__NULL = 0, _api__order_subsidy_dto__YANDEX_CASHBACK, _api__order_subsidy_dto__SUBSIDY, _api__order_subsidy_dto__DELIVERY } _api__order_subsidy_dto__e;

char* order_subsidy_dto_type_ToString(_api__order_subsidy_dto__e type);

_api__order_subsidy_dto__e order_subsidy_dto_type_FromString(char* type);



typedef struct order_subsidy_dto_t {
    order_subsidy_type_t *type; // custom
    double amount; //numeric

} order_subsidy_dto_t;

order_subsidy_dto_t *order_subsidy_dto_create(
    order_subsidy_type_t *type,
    double amount
);

void order_subsidy_dto_free(order_subsidy_dto_t *order_subsidy_dto);

order_subsidy_dto_t *order_subsidy_dto_parseFromJSON(cJSON *order_subsidy_dtoJSON);

cJSON *order_subsidy_dto_convertToJSON(order_subsidy_dto_t *order_subsidy_dto);

#endif /* _order_subsidy_dto_H_ */

