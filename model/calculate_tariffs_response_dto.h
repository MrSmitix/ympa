/*
 * calculate_tariffs_response_dto.h
 *
 * Расчет стоимости услуг.
 */

#ifndef _calculate_tariffs_response_dto_H_
#define _calculate_tariffs_response_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct calculate_tariffs_response_dto_t calculate_tariffs_response_dto_t;

#include "calculate_tariffs_offer_info_dto.h"



typedef struct calculate_tariffs_response_dto_t {
    list_t *offers; //nonprimitive container

} calculate_tariffs_response_dto_t;

calculate_tariffs_response_dto_t *calculate_tariffs_response_dto_create(
    list_t *offers
);

void calculate_tariffs_response_dto_free(calculate_tariffs_response_dto_t *calculate_tariffs_response_dto);

calculate_tariffs_response_dto_t *calculate_tariffs_response_dto_parseFromJSON(cJSON *calculate_tariffs_response_dtoJSON);

cJSON *calculate_tariffs_response_dto_convertToJSON(calculate_tariffs_response_dto_t *calculate_tariffs_response_dto);

#endif /* _calculate_tariffs_response_dto_H_ */

