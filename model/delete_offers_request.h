/*
 * delete_offers_request.h
 *
 * Фильтрации удаляемых товаров по offerIds. 
 */

#ifndef _delete_offers_request_H_
#define _delete_offers_request_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct delete_offers_request_t delete_offers_request_t;




typedef struct delete_offers_request_t {
    list_t *offer_ids; //primitive container

} delete_offers_request_t;

delete_offers_request_t *delete_offers_request_create(
    list_t *offer_ids
);

void delete_offers_request_free(delete_offers_request_t *delete_offers_request);

delete_offers_request_t *delete_offers_request_parseFromJSON(cJSON *delete_offers_requestJSON);

cJSON *delete_offers_request_convertToJSON(delete_offers_request_t *delete_offers_request);

#endif /* _delete_offers_request_H_ */

