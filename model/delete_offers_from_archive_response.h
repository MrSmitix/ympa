/*
 * delete_offers_from_archive_response.h
 *
 * Результат разархивации товаров.
 */

#ifndef _delete_offers_from_archive_response_H_
#define _delete_offers_from_archive_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct delete_offers_from_archive_response_t delete_offers_from_archive_response_t;

#include "api_response_status_type.h"
#include "delete_offers_from_archive_dto.h"

// Enum  for delete_offers_from_archive_response

typedef enum  { _api__delete_offers_from_archive_response__NULL = 0, _api__delete_offers_from_archive_response__OK, _api__delete_offers_from_archive_response__ERROR } _api__delete_offers_from_archive_response__e;

char* delete_offers_from_archive_response_status_ToString(_api__delete_offers_from_archive_response__e status);

_api__delete_offers_from_archive_response__e delete_offers_from_archive_response_status_FromString(char* status);



typedef struct delete_offers_from_archive_response_t {
    api_response_status_type_t *status; // custom
    struct delete_offers_from_archive_dto_t *result; //model

} delete_offers_from_archive_response_t;

delete_offers_from_archive_response_t *delete_offers_from_archive_response_create(
    api_response_status_type_t *status,
    delete_offers_from_archive_dto_t *result
);

void delete_offers_from_archive_response_free(delete_offers_from_archive_response_t *delete_offers_from_archive_response);

delete_offers_from_archive_response_t *delete_offers_from_archive_response_parseFromJSON(cJSON *delete_offers_from_archive_responseJSON);

cJSON *delete_offers_from_archive_response_convertToJSON(delete_offers_from_archive_response_t *delete_offers_from_archive_response);

#endif /* _delete_offers_from_archive_response_H_ */

