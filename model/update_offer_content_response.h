/*
 * update_offer_content_response.h
 *
 * Описывает проблемы, которые появились при сохранении товара.
 */

#ifndef _update_offer_content_response_H_
#define _update_offer_content_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct update_offer_content_response_t update_offer_content_response_t;

#include "api_response_status_type.h"
#include "update_offer_content_result_dto.h"

// Enum  for update_offer_content_response

typedef enum  { _api__update_offer_content_response__NULL = 0, _api__update_offer_content_response__OK, _api__update_offer_content_response__ERROR } _api__update_offer_content_response__e;

char* update_offer_content_response_status_ToString(_api__update_offer_content_response__e status);

_api__update_offer_content_response__e update_offer_content_response_status_FromString(char* status);



typedef struct update_offer_content_response_t {
    api_response_status_type_t *status; // custom
    list_t *results; //nonprimitive container

} update_offer_content_response_t;

update_offer_content_response_t *update_offer_content_response_create(
    api_response_status_type_t *status,
    list_t *results
);

void update_offer_content_response_free(update_offer_content_response_t *update_offer_content_response);

update_offer_content_response_t *update_offer_content_response_parseFromJSON(cJSON *update_offer_content_responseJSON);

cJSON *update_offer_content_response_convertToJSON(update_offer_content_response_t *update_offer_content_response);

#endif /* _update_offer_content_response_H_ */

