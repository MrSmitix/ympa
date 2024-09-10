/*
 * offer_content_error_dto.h
 *
 * Текст ошибки.
 */

#ifndef _offer_content_error_dto_H_
#define _offer_content_error_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct offer_content_error_dto_t offer_content_error_dto_t;

#include "offer_content_error_type.h"

// Enum  for offer_content_error_dto

typedef enum  { _api__offer_content_error_dto__NULL = 0, _api__offer_content_error_dto__OFFER_NOT_FOUND, _api__offer_content_error_dto__UNKNOWN_CATEGORY, _api__offer_content_error_dto__CATEGORY_MISMATCH, _api__offer_content_error_dto__UNKNOWN_PARAMETER, _api__offer_content_error_dto__UNEXPECTED_BOOLEAN_VALUE, _api__offer_content_error_dto__NUMBER_FORMAT, _api__offer_content_error_dto__VALUE_BLANK, _api__offer_content_error_dto__INVALID_UNIT_ID, _api__offer_content_error_dto__INVALID_GROUP_ID_LENGTH, _api__offer_content_error_dto__INVALID_GROUP_ID_CHARACTERS } _api__offer_content_error_dto__e;

char* offer_content_error_dto_type_ToString(_api__offer_content_error_dto__e type);

_api__offer_content_error_dto__e offer_content_error_dto_type_FromString(char* type);



typedef struct offer_content_error_dto_t {
    offer_content_error_type_t *type; // custom
    long parameter_id; //numeric
    char *message; // string

} offer_content_error_dto_t;

offer_content_error_dto_t *offer_content_error_dto_create(
    offer_content_error_type_t *type,
    long parameter_id,
    char *message
);

void offer_content_error_dto_free(offer_content_error_dto_t *offer_content_error_dto);

offer_content_error_dto_t *offer_content_error_dto_parseFromJSON(cJSON *offer_content_error_dtoJSON);

cJSON *offer_content_error_dto_convertToJSON(offer_content_error_dto_t *offer_content_error_dto);

#endif /* _offer_content_error_dto_H_ */

