/*
 * offer_processing_note_dto.h
 *
 * Причины, по которым товар не прошел модерацию.
 */

#ifndef _offer_processing_note_dto_H_
#define _offer_processing_note_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct offer_processing_note_dto_t offer_processing_note_dto_t;

#include "offer_processing_note_type.h"

// Enum  for offer_processing_note_dto

typedef enum  { _api__offer_processing_note_dto__NULL = 0, _api__offer_processing_note_dto__ASSORTMENT, _api__offer_processing_note_dto__CANCELLED, _api__offer_processing_note_dto__CONFLICTING_INFORMATION, _api__offer_processing_note_dto__OTHER, _api__offer_processing_note_dto__DEPARTMENT_FROZEN, _api__offer_processing_note_dto__INCORRECT_INFORMATION, _api__offer_processing_note_dto__LEGAL_CONFLICT, _api__offer_processing_note_dto__NEED_CLASSIFICATION_INFORMATION, _api__offer_processing_note_dto__NEED_INFORMATION, _api__offer_processing_note_dto__NEED_PICTURES, _api__offer_processing_note_dto__NEED_VENDOR, _api__offer_processing_note_dto__NO_CATEGORY, _api__offer_processing_note_dto__NO_KNOWLEDGE, _api__offer_processing_note_dto__NO_PARAMETERS_IN_SHOP_TITLE, _api__offer_processing_note_dto__NO_SIZE_MEASURE, _api__offer_processing_note_dto__SAMPLE_LINE } _api__offer_processing_note_dto__e;

char* offer_processing_note_dto_type_ToString(_api__offer_processing_note_dto__e type);

_api__offer_processing_note_dto__e offer_processing_note_dto_type_FromString(char* type);



typedef struct offer_processing_note_dto_t {
    offer_processing_note_type_t *type; // custom
    char *payload; // string

} offer_processing_note_dto_t;

offer_processing_note_dto_t *offer_processing_note_dto_create(
    offer_processing_note_type_t *type,
    char *payload
);

void offer_processing_note_dto_free(offer_processing_note_dto_t *offer_processing_note_dto);

offer_processing_note_dto_t *offer_processing_note_dto_parseFromJSON(cJSON *offer_processing_note_dtoJSON);

cJSON *offer_processing_note_dto_convertToJSON(offer_processing_note_dto_t *offer_processing_note_dto);

#endif /* _offer_processing_note_dto_H_ */

