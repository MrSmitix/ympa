/*
 * add_offers_to_archive_dto.h
 *
 * Товары, которые не удалось поместить в архив.
 */

#ifndef _add_offers_to_archive_dto_H_
#define _add_offers_to_archive_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct add_offers_to_archive_dto_t add_offers_to_archive_dto_t;

#include "add_offers_to_archive_error_dto.h"



typedef struct add_offers_to_archive_dto_t {
    list_t *not_archived_offers; //nonprimitive container

} add_offers_to_archive_dto_t;

add_offers_to_archive_dto_t *add_offers_to_archive_dto_create(
    list_t *not_archived_offers
);

void add_offers_to_archive_dto_free(add_offers_to_archive_dto_t *add_offers_to_archive_dto);

add_offers_to_archive_dto_t *add_offers_to_archive_dto_parseFromJSON(cJSON *add_offers_to_archive_dtoJSON);

cJSON *add_offers_to_archive_dto_convertToJSON(add_offers_to_archive_dto_t *add_offers_to_archive_dto);

#endif /* _add_offers_to_archive_dto_H_ */

