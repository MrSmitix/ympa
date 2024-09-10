/*
 * update_prices_request.h
 *
 * Запрос на установку цен на товары.
 */

#ifndef _update_prices_request_H_
#define _update_prices_request_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct update_prices_request_t update_prices_request_t;

#include "offer_price_dto.h"



typedef struct update_prices_request_t {
    list_t *offers; //nonprimitive container

} update_prices_request_t;

update_prices_request_t *update_prices_request_create(
    list_t *offers
);

void update_prices_request_free(update_prices_request_t *update_prices_request);

update_prices_request_t *update_prices_request_parseFromJSON(cJSON *update_prices_requestJSON);

cJSON *update_prices_request_convertToJSON(update_prices_request_t *update_prices_request);

#endif /* _update_prices_request_H_ */

