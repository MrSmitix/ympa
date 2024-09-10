/*
 * add_offers_to_archive_error_dto.h
 *
 * Товар, который не удалось поместить в архив.
 */

#ifndef _add_offers_to_archive_error_dto_H_
#define _add_offers_to_archive_error_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct add_offers_to_archive_error_dto_t add_offers_to_archive_error_dto_t;

#include "add_offers_to_archive_error_type.h"

// Enum  for add_offers_to_archive_error_dto

typedef enum  { _api__add_offers_to_archive_error_dto__NULL = 0, _api__add_offers_to_archive_error_dto__OFFER_HAS_STOCKS, _api__add_offers_to_archive_error_dto__UNKNOWN } _api__add_offers_to_archive_error_dto__e;

char* add_offers_to_archive_error_dto_error_ToString(_api__add_offers_to_archive_error_dto__e error);

_api__add_offers_to_archive_error_dto__e add_offers_to_archive_error_dto_error_FromString(char* error);



typedef struct add_offers_to_archive_error_dto_t {
    char *offer_id; // string
    add_offers_to_archive_error_type_t *error; // custom

} add_offers_to_archive_error_dto_t;

add_offers_to_archive_error_dto_t *add_offers_to_archive_error_dto_create(
    char *offer_id,
    add_offers_to_archive_error_type_t *error
);

void add_offers_to_archive_error_dto_free(add_offers_to_archive_error_dto_t *add_offers_to_archive_error_dto);

add_offers_to_archive_error_dto_t *add_offers_to_archive_error_dto_parseFromJSON(cJSON *add_offers_to_archive_error_dtoJSON);

cJSON *add_offers_to_archive_error_dto_convertToJSON(add_offers_to_archive_error_dto_t *add_offers_to_archive_error_dto);

#endif /* _add_offers_to_archive_error_dto_H_ */

