/*
 * add_offers_to_archive_response.h
 *
 * Результат архивации товаров.
 */

#ifndef _add_offers_to_archive_response_H_
#define _add_offers_to_archive_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct add_offers_to_archive_response_t add_offers_to_archive_response_t;

#include "add_offers_to_archive_dto.h"
#include "api_response_status_type.h"

// Enum  for add_offers_to_archive_response

typedef enum  { _api__add_offers_to_archive_response__NULL = 0, _api__add_offers_to_archive_response__OK, _api__add_offers_to_archive_response__ERROR } _api__add_offers_to_archive_response__e;

char* add_offers_to_archive_response_status_ToString(_api__add_offers_to_archive_response__e status);

_api__add_offers_to_archive_response__e add_offers_to_archive_response_status_FromString(char* status);



typedef struct add_offers_to_archive_response_t {
    api_response_status_type_t *status; // custom
    struct add_offers_to_archive_dto_t *result; //model

} add_offers_to_archive_response_t;

add_offers_to_archive_response_t *add_offers_to_archive_response_create(
    api_response_status_type_t *status,
    add_offers_to_archive_dto_t *result
);

void add_offers_to_archive_response_free(add_offers_to_archive_response_t *add_offers_to_archive_response);

add_offers_to_archive_response_t *add_offers_to_archive_response_parseFromJSON(cJSON *add_offers_to_archive_responseJSON);

cJSON *add_offers_to_archive_response_convertToJSON(add_offers_to_archive_response_t *add_offers_to_archive_response);

#endif /* _add_offers_to_archive_response_H_ */

