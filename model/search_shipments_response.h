/*
 * search_shipments_response.h
 *
 * Ответ на запрос информации об отгрузках.
 */

#ifndef _search_shipments_response_H_
#define _search_shipments_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct search_shipments_response_t search_shipments_response_t;

#include "api_response_status_type.h"
#include "search_shipments_response_dto.h"

// Enum  for search_shipments_response

typedef enum  { _api__search_shipments_response__NULL = 0, _api__search_shipments_response__OK, _api__search_shipments_response__ERROR } _api__search_shipments_response__e;

char* search_shipments_response_status_ToString(_api__search_shipments_response__e status);

_api__search_shipments_response__e search_shipments_response_status_FromString(char* status);



typedef struct search_shipments_response_t {
    api_response_status_type_t *status; // custom
    struct search_shipments_response_dto_t *result; //model

} search_shipments_response_t;

search_shipments_response_t *search_shipments_response_create(
    api_response_status_type_t *status,
    search_shipments_response_dto_t *result
);

void search_shipments_response_free(search_shipments_response_t *search_shipments_response);

search_shipments_response_t *search_shipments_response_parseFromJSON(cJSON *search_shipments_responseJSON);

cJSON *search_shipments_response_convertToJSON(search_shipments_response_t *search_shipments_response);

#endif /* _search_shipments_response_H_ */

