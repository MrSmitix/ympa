/*
 * get_prices_by_offer_ids_request.h
 *
 * Запрос списка цен.
 */

#ifndef _get_prices_by_offer_ids_request_H_
#define _get_prices_by_offer_ids_request_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct get_prices_by_offer_ids_request_t get_prices_by_offer_ids_request_t;




typedef struct get_prices_by_offer_ids_request_t {
    list_t *offer_ids; //primitive container

} get_prices_by_offer_ids_request_t;

get_prices_by_offer_ids_request_t *get_prices_by_offer_ids_request_create(
    list_t *offer_ids
);

void get_prices_by_offer_ids_request_free(get_prices_by_offer_ids_request_t *get_prices_by_offer_ids_request);

get_prices_by_offer_ids_request_t *get_prices_by_offer_ids_request_parseFromJSON(cJSON *get_prices_by_offer_ids_requestJSON);

cJSON *get_prices_by_offer_ids_request_convertToJSON(get_prices_by_offer_ids_request_t *get_prices_by_offer_ids_request);

#endif /* _get_prices_by_offer_ids_request_H_ */

