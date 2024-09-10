/*
 * offer_processing_state_dto.h
 *
 * Информация о статусе публикации товара на Маркете.
 */

#ifndef _offer_processing_state_dto_H_
#define _offer_processing_state_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct offer_processing_state_dto_t offer_processing_state_dto_t;

#include "offer_processing_note_dto.h"
#include "offer_processing_status_type.h"

// Enum  for offer_processing_state_dto

typedef enum  { _api__offer_processing_state_dto__NULL = 0, _api__offer_processing_state_dto__UNKNOWN, _api__offer_processing_state_dto__READY, _api__offer_processing_state_dto__IN_WORK, _api__offer_processing_state_dto__NEED_INFO, _api__offer_processing_state_dto__NEED_MAPPING, _api__offer_processing_state_dto__NEED_CONTENT, _api__offer_processing_state_dto__CONTENT_PROCESSING, _api__offer_processing_state_dto__SUSPENDED, _api__offer_processing_state_dto__REJECTED, _api__offer_processing_state_dto__REVIEW, _api__offer_processing_state_dto__CREATE_ERROR, _api__offer_processing_state_dto__UPDATE_ERROR } _api__offer_processing_state_dto__e;

char* offer_processing_state_dto_status_ToString(_api__offer_processing_state_dto__e status);

_api__offer_processing_state_dto__e offer_processing_state_dto_status_FromString(char* status);



typedef struct offer_processing_state_dto_t {
    offer_processing_status_type_t *status; // custom
    list_t *notes; //nonprimitive container

} offer_processing_state_dto_t;

offer_processing_state_dto_t *offer_processing_state_dto_create(
    offer_processing_status_type_t *status,
    list_t *notes
);

void offer_processing_state_dto_free(offer_processing_state_dto_t *offer_processing_state_dto);

offer_processing_state_dto_t *offer_processing_state_dto_parseFromJSON(cJSON *offer_processing_state_dtoJSON);

cJSON *offer_processing_state_dto_convertToJSON(offer_processing_state_dto_t *offer_processing_state_dto);

#endif /* _offer_processing_state_dto_H_ */

