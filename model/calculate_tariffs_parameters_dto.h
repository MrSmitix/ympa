/*
 * calculate_tariffs_parameters_dto.h
 *
 * Параметры для расчета стоимости услуг.
 */

#ifndef _calculate_tariffs_parameters_dto_H_
#define _calculate_tariffs_parameters_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct calculate_tariffs_parameters_dto_t calculate_tariffs_parameters_dto_t;

#include "payment_frequency_type.h"
#include "selling_program_type.h"

// Enum  for calculate_tariffs_parameters_dto

typedef enum  { _api__calculate_tariffs_parameters_dto__NULL = 0, _api__calculate_tariffs_parameters_dto__FBY, _api__calculate_tariffs_parameters_dto__FBS, _api__calculate_tariffs_parameters_dto__DBS, _api__calculate_tariffs_parameters_dto__EXPRESS } _api__calculate_tariffs_parameters_dto__e;

char* calculate_tariffs_parameters_dto_selling_program_ToString(_api__calculate_tariffs_parameters_dto__e selling_program);

_api__calculate_tariffs_parameters_dto__e calculate_tariffs_parameters_dto_selling_program_FromString(char* selling_program);

// Enum  for calculate_tariffs_parameters_dto

typedef enum  { _api__calculate_tariffs_parameters_dto__NULL = 0, _api__calculate_tariffs_parameters_dto__DAILY, _api__calculate_tariffs_parameters_dto__WEEKLY, _api__calculate_tariffs_parameters_dto__BIWEEKLY, _api__calculate_tariffs_parameters_dto__MONTHLY } _api__calculate_tariffs_parameters_dto__e;

char* calculate_tariffs_parameters_dto_frequency_ToString(_api__calculate_tariffs_parameters_dto__e frequency);

_api__calculate_tariffs_parameters_dto__e calculate_tariffs_parameters_dto_frequency_FromString(char* frequency);



typedef struct calculate_tariffs_parameters_dto_t {
    long campaign_id; //numeric
    selling_program_type_t *selling_program; // custom
    payment_frequency_type_t *frequency; // custom

} calculate_tariffs_parameters_dto_t;

calculate_tariffs_parameters_dto_t *calculate_tariffs_parameters_dto_create(
    long campaign_id,
    selling_program_type_t *selling_program,
    payment_frequency_type_t *frequency
);

void calculate_tariffs_parameters_dto_free(calculate_tariffs_parameters_dto_t *calculate_tariffs_parameters_dto);

calculate_tariffs_parameters_dto_t *calculate_tariffs_parameters_dto_parseFromJSON(cJSON *calculate_tariffs_parameters_dtoJSON);

cJSON *calculate_tariffs_parameters_dto_convertToJSON(calculate_tariffs_parameters_dto_t *calculate_tariffs_parameters_dto);

#endif /* _calculate_tariffs_parameters_dto_H_ */

