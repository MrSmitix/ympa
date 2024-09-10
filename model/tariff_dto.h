/*
 * tariff_dto.h
 *
 * Информация о тарифах, по которым нужно заплатить за услуги Маркета.
 */

#ifndef _tariff_dto_H_
#define _tariff_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct tariff_dto_t tariff_dto_t;

#include "tariff_parameter_dto.h"
#include "tariff_type.h"

// Enum  for tariff_dto

typedef enum  { _api__tariff_dto__NULL = 0, _api__tariff_dto__AGENCY_COMMISSION, _api__tariff_dto__PAYMENT_TRANSFER, _api__tariff_dto__STORAGE, _api__tariff_dto__WITHDRAW, _api__tariff_dto__SURPLUS, _api__tariff_dto__FEE, _api__tariff_dto__DELIVERY_TO_CUSTOMER, _api__tariff_dto__CROSSREGIONAL_DELIVERY, _api__tariff_dto__CROSSREGIONAL_DELIVERY_RETURN, _api__tariff_dto__DISPOSAL, _api__tariff_dto__SORTING_CENTER_STORAGE, _api__tariff_dto__EXPRESS_DELIVERY, _api__tariff_dto__FF_XDOC_SUPPLY_BOX, _api__tariff_dto__FF_XDOC_SUPPLY_PALLET, _api__tariff_dto__SORTING, _api__tariff_dto__MIDDLE_MILE, _api__tariff_dto__RETURN_PROCESSING, _api__tariff_dto__EXPRESS_CANCELLED_BY_PARTNER, _api__tariff_dto__DELIVERY_TO_CUSTOMER_RETURN, _api__tariff_dto__CROSSBORDER_DELIVERY, _api__tariff_dto__INTAKE_SORTING_BULKY_CARGO, _api__tariff_dto__INTAKE_SORTING_SMALL_GOODS, _api__tariff_dto__INTAKE_SORTING_DAILY, _api__tariff_dto__FF_STORAGE_BILLING, _api__tariff_dto__CANCELLED_ORDER_FEE_QI, _api__tariff_dto__LATE_ORDER_EXECUTION_FEE_QI } _api__tariff_dto__e;

char* tariff_dto_type_ToString(_api__tariff_dto__e type);

_api__tariff_dto__e tariff_dto_type_FromString(char* type);



typedef struct tariff_dto_t {
    tariff_type_t *type; // custom
    double percent; //numeric
    double amount; //numeric
    list_t *parameters; //nonprimitive container

} tariff_dto_t;

tariff_dto_t *tariff_dto_create(
    tariff_type_t *type,
    double percent,
    double amount,
    list_t *parameters
);

void tariff_dto_free(tariff_dto_t *tariff_dto);

tariff_dto_t *tariff_dto_parseFromJSON(cJSON *tariff_dtoJSON);

cJSON *tariff_dto_convertToJSON(tariff_dto_t *tariff_dto);

#endif /* _tariff_dto_H_ */

