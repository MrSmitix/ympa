/*
 * calculated_tariff_dto.h
 *
 * Информация об услугах Маркета.
 */

#ifndef _calculated_tariff_dto_H_
#define _calculated_tariff_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct calculated_tariff_dto_t calculated_tariff_dto_t;

#include "calculated_tariff_type.h"
#include "tariff_parameter_dto.h"

// Enum  for calculated_tariff_dto

typedef enum  { _api__calculated_tariff_dto__NULL = 0, _api__calculated_tariff_dto__AGENCY_COMMISSION, _api__calculated_tariff_dto__PAYMENT_TRANSFER, _api__calculated_tariff_dto__FEE, _api__calculated_tariff_dto__DELIVERY_TO_CUSTOMER, _api__calculated_tariff_dto__CROSSREGIONAL_DELIVERY, _api__calculated_tariff_dto__EXPRESS_DELIVERY, _api__calculated_tariff_dto__SORTING, _api__calculated_tariff_dto__MIDDLE_MILE } _api__calculated_tariff_dto__e;

char* calculated_tariff_dto_type_ToString(_api__calculated_tariff_dto__e type);

_api__calculated_tariff_dto__e calculated_tariff_dto_type_FromString(char* type);



typedef struct calculated_tariff_dto_t {
    calculated_tariff_type_t *type; // custom
    double amount; //numeric
    list_t *parameters; //nonprimitive container

} calculated_tariff_dto_t;

calculated_tariff_dto_t *calculated_tariff_dto_create(
    calculated_tariff_type_t *type,
    double amount,
    list_t *parameters
);

void calculated_tariff_dto_free(calculated_tariff_dto_t *calculated_tariff_dto);

calculated_tariff_dto_t *calculated_tariff_dto_parseFromJSON(cJSON *calculated_tariff_dtoJSON);

cJSON *calculated_tariff_dto_convertToJSON(calculated_tariff_dto_t *calculated_tariff_dto);

#endif /* _calculated_tariff_dto_H_ */

