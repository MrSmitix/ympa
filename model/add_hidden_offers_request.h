/*
 * add_hidden_offers_request.h
 *
 * Запрос на скрытие оферов.
 */

#ifndef _add_hidden_offers_request_H_
#define _add_hidden_offers_request_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct add_hidden_offers_request_t add_hidden_offers_request_t;

#include "hidden_offer_dto.h"



typedef struct add_hidden_offers_request_t {
    list_t *hidden_offers; //nonprimitive container

} add_hidden_offers_request_t;

add_hidden_offers_request_t *add_hidden_offers_request_create(
    list_t *hidden_offers
);

void add_hidden_offers_request_free(add_hidden_offers_request_t *add_hidden_offers_request);

add_hidden_offers_request_t *add_hidden_offers_request_parseFromJSON(cJSON *add_hidden_offers_requestJSON);

cJSON *add_hidden_offers_request_convertToJSON(add_hidden_offers_request_t *add_hidden_offers_request);

#endif /* _add_hidden_offers_request_H_ */

