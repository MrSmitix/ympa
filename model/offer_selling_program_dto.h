/*
 * offer_selling_program_dto.h
 *
 * Информация о том, по каким моделям можно продавать товар, а по каким нельзя.
 */

#ifndef _offer_selling_program_dto_H_
#define _offer_selling_program_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct offer_selling_program_dto_t offer_selling_program_dto_t;

#include "offer_selling_program_status_type.h"
#include "selling_program_type.h"

// Enum  for offer_selling_program_dto

typedef enum  { _api__offer_selling_program_dto__NULL = 0, _api__offer_selling_program_dto__FBY, _api__offer_selling_program_dto__FBS, _api__offer_selling_program_dto__DBS, _api__offer_selling_program_dto__EXPRESS } _api__offer_selling_program_dto__e;

char* offer_selling_program_dto_selling_program_ToString(_api__offer_selling_program_dto__e selling_program);

_api__offer_selling_program_dto__e offer_selling_program_dto_selling_program_FromString(char* selling_program);

// Enum  for offer_selling_program_dto

typedef enum  { _api__offer_selling_program_dto__NULL = 0, _api__offer_selling_program_dto__FINE, _api__offer_selling_program_dto__REJECT } _api__offer_selling_program_dto__e;

char* offer_selling_program_dto_status_ToString(_api__offer_selling_program_dto__e status);

_api__offer_selling_program_dto__e offer_selling_program_dto_status_FromString(char* status);



typedef struct offer_selling_program_dto_t {
    selling_program_type_t *selling_program; // custom
    offer_selling_program_status_type_t *status; // custom

} offer_selling_program_dto_t;

offer_selling_program_dto_t *offer_selling_program_dto_create(
    selling_program_type_t *selling_program,
    offer_selling_program_status_type_t *status
);

void offer_selling_program_dto_free(offer_selling_program_dto_t *offer_selling_program_dto);

offer_selling_program_dto_t *offer_selling_program_dto_parseFromJSON(cJSON *offer_selling_program_dtoJSON);

cJSON *offer_selling_program_dto_convertToJSON(offer_selling_program_dto_t *offer_selling_program_dto);

#endif /* _offer_selling_program_dto_H_ */

