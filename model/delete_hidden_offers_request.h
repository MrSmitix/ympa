/*
 * delete_hidden_offers_request.h
 *
 * Запрос на возобновление показа оферов.
 */

#ifndef _delete_hidden_offers_request_H_
#define _delete_hidden_offers_request_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct delete_hidden_offers_request_t delete_hidden_offers_request_t;

#include "hidden_offer_dto.h"



typedef struct delete_hidden_offers_request_t {
    list_t *hidden_offers; //nonprimitive container

} delete_hidden_offers_request_t;

delete_hidden_offers_request_t *delete_hidden_offers_request_create(
    list_t *hidden_offers
);

void delete_hidden_offers_request_free(delete_hidden_offers_request_t *delete_hidden_offers_request);

delete_hidden_offers_request_t *delete_hidden_offers_request_parseFromJSON(cJSON *delete_hidden_offers_requestJSON);

cJSON *delete_hidden_offers_request_convertToJSON(delete_hidden_offers_request_t *delete_hidden_offers_request);

#endif /* _delete_hidden_offers_request_H_ */

