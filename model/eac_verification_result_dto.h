/*
 * eac_verification_result_dto.h
 *
 * Результат выполнения запроса.
 */

#ifndef _eac_verification_result_dto_H_
#define _eac_verification_result_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct eac_verification_result_dto_t eac_verification_result_dto_t;

#include "eac_verification_status_type.h"

// Enum  for eac_verification_result_dto

typedef enum  { _api__eac_verification_result_dto__NULL = 0, _api__eac_verification_result_dto__ACCEPTED, _api__eac_verification_result_dto__REJECTED, _api__eac_verification_result_dto__NEED_UPDATE } _api__eac_verification_result_dto__e;

char* eac_verification_result_dto_verification_result_ToString(_api__eac_verification_result_dto__e verification_result);

_api__eac_verification_result_dto__e eac_verification_result_dto_verification_result_FromString(char* verification_result);



typedef struct eac_verification_result_dto_t {
    eac_verification_status_type_t *verification_result; // custom
    int attempts_left; //numeric

} eac_verification_result_dto_t;

eac_verification_result_dto_t *eac_verification_result_dto_create(
    eac_verification_status_type_t *verification_result,
    int attempts_left
);

void eac_verification_result_dto_free(eac_verification_result_dto_t *eac_verification_result_dto);

eac_verification_result_dto_t *eac_verification_result_dto_parseFromJSON(cJSON *eac_verification_result_dtoJSON);

cJSON *eac_verification_result_dto_convertToJSON(eac_verification_result_dto_t *eac_verification_result_dto);

#endif /* _eac_verification_result_dto_H_ */

