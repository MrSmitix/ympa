/*
 * offer_condition_dto.h
 *
 * Состояние уцененного товара. 
 */

#ifndef _offer_condition_dto_H_
#define _offer_condition_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct offer_condition_dto_t offer_condition_dto_t;

#include "offer_condition_quality_type.h"
#include "offer_condition_type.h"

// Enum  for offer_condition_dto

typedef enum  { _api__offer_condition_dto__NULL = 0, _api__offer_condition_dto__PREOWNED, _api__offer_condition_dto__SHOWCASESAMPLE, _api__offer_condition_dto__REFURBISHED, _api__offer_condition_dto__REDUCTION, _api__offer_condition_dto__RENOVATED, _api__offer_condition_dto__NOT_SPECIFIED } _api__offer_condition_dto__e;

char* offer_condition_dto_type_ToString(_api__offer_condition_dto__e type);

_api__offer_condition_dto__e offer_condition_dto_type_FromString(char* type);

// Enum  for offer_condition_dto

typedef enum  { _api__offer_condition_dto__NULL = 0, _api__offer_condition_dto__PERFECT, _api__offer_condition_dto__EXCELLENT, _api__offer_condition_dto__GOOD, _api__offer_condition_dto__NOT_SPECIFIED } _api__offer_condition_dto__e;

char* offer_condition_dto_quality_ToString(_api__offer_condition_dto__e quality);

_api__offer_condition_dto__e offer_condition_dto_quality_FromString(char* quality);



typedef struct offer_condition_dto_t {
    offer_condition_type_t *type; // custom
    offer_condition_quality_type_t *quality; // custom
    char *reason; // string

} offer_condition_dto_t;

offer_condition_dto_t *offer_condition_dto_create(
    offer_condition_type_t *type,
    offer_condition_quality_type_t *quality,
    char *reason
);

void offer_condition_dto_free(offer_condition_dto_t *offer_condition_dto);

offer_condition_dto_t *offer_condition_dto_parseFromJSON(cJSON *offer_condition_dtoJSON);

cJSON *offer_condition_dto_convertToJSON(offer_condition_dto_t *offer_condition_dto);

#endif /* _offer_condition_dto_H_ */

