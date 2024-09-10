/*
 * calculate_tariffs_offer_info_dto.h
 *
 * Стоимость услуг.
 */

#ifndef _calculate_tariffs_offer_info_dto_H_
#define _calculate_tariffs_offer_info_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct calculate_tariffs_offer_info_dto_t calculate_tariffs_offer_info_dto_t;

#include "calculate_tariffs_offer_dto.h"
#include "calculated_tariff_dto.h"



typedef struct calculate_tariffs_offer_info_dto_t {
    struct calculate_tariffs_offer_dto_t *offer; //model
    list_t *tariffs; //nonprimitive container

} calculate_tariffs_offer_info_dto_t;

calculate_tariffs_offer_info_dto_t *calculate_tariffs_offer_info_dto_create(
    calculate_tariffs_offer_dto_t *offer,
    list_t *tariffs
);

void calculate_tariffs_offer_info_dto_free(calculate_tariffs_offer_info_dto_t *calculate_tariffs_offer_info_dto);

calculate_tariffs_offer_info_dto_t *calculate_tariffs_offer_info_dto_parseFromJSON(cJSON *calculate_tariffs_offer_info_dtoJSON);

cJSON *calculate_tariffs_offer_info_dto_convertToJSON(calculate_tariffs_offer_info_dto_t *calculate_tariffs_offer_info_dto);

#endif /* _calculate_tariffs_offer_info_dto_H_ */

