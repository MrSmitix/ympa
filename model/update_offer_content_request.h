/*
 * update_offer_content_request.h
 *
 * Запрос на установку новых значений для параметров.
 */

#ifndef _update_offer_content_request_H_
#define _update_offer_content_request_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct update_offer_content_request_t update_offer_content_request_t;

#include "offer_content_dto.h"



typedef struct update_offer_content_request_t {
    list_t *offers_content; //nonprimitive container

} update_offer_content_request_t;

update_offer_content_request_t *update_offer_content_request_create(
    list_t *offers_content
);

void update_offer_content_request_free(update_offer_content_request_t *update_offer_content_request);

update_offer_content_request_t *update_offer_content_request_parseFromJSON(cJSON *update_offer_content_requestJSON);

cJSON *update_offer_content_request_convertToJSON(update_offer_content_request_t *update_offer_content_request);

#endif /* _update_offer_content_request_H_ */

