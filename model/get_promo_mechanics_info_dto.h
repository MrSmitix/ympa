/*
 * get_promo_mechanics_info_dto.h
 *
 * Информация о типе акции.
 */

#ifndef _get_promo_mechanics_info_dto_H_
#define _get_promo_mechanics_info_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct get_promo_mechanics_info_dto_t get_promo_mechanics_info_dto_t;

#include "get_promo_promocode_info_dto.h"
#include "mechanics_type.h"

// Enum  for get_promo_mechanics_info_dto

typedef enum  { _api__get_promo_mechanics_info_dto__NULL = 0, _api__get_promo_mechanics_info_dto__DIRECT_DISCOUNT, _api__get_promo_mechanics_info_dto__BLUE_FLASH, _api__get_promo_mechanics_info_dto__MARKET_PROMOCODE } _api__get_promo_mechanics_info_dto__e;

char* get_promo_mechanics_info_dto_type_ToString(_api__get_promo_mechanics_info_dto__e type);

_api__get_promo_mechanics_info_dto__e get_promo_mechanics_info_dto_type_FromString(char* type);



typedef struct get_promo_mechanics_info_dto_t {
    mechanics_type_t *type; // custom
    struct get_promo_promocode_info_dto_t *promocode_info; //model

} get_promo_mechanics_info_dto_t;

get_promo_mechanics_info_dto_t *get_promo_mechanics_info_dto_create(
    mechanics_type_t *type,
    get_promo_promocode_info_dto_t *promocode_info
);

void get_promo_mechanics_info_dto_free(get_promo_mechanics_info_dto_t *get_promo_mechanics_info_dto);

get_promo_mechanics_info_dto_t *get_promo_mechanics_info_dto_parseFromJSON(cJSON *get_promo_mechanics_info_dtoJSON);

cJSON *get_promo_mechanics_info_dto_convertToJSON(get_promo_mechanics_info_dto_t *get_promo_mechanics_info_dto);

#endif /* _get_promo_mechanics_info_dto_H_ */

