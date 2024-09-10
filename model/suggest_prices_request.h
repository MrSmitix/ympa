/*
 * suggest_prices_request.h
 *
 * Запрос на получение списка цен для продвижения.
 */

#ifndef _suggest_prices_request_H_
#define _suggest_prices_request_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct suggest_prices_request_t suggest_prices_request_t;

#include "suggest_offer_price_dto.h"



typedef struct suggest_prices_request_t {
    list_t *offers; //nonprimitive container

} suggest_prices_request_t;

suggest_prices_request_t *suggest_prices_request_create(
    list_t *offers
);

void suggest_prices_request_free(suggest_prices_request_t *suggest_prices_request);

suggest_prices_request_t *suggest_prices_request_parseFromJSON(cJSON *suggest_prices_requestJSON);

cJSON *suggest_prices_request_convertToJSON(suggest_prices_request_t *suggest_prices_request);

#endif /* _suggest_prices_request_H_ */

