/*
 * confirm_prices_request.h
 *
 * Запрос на подтверждение цены. 
 */

#ifndef _confirm_prices_request_H_
#define _confirm_prices_request_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct confirm_prices_request_t confirm_prices_request_t;




typedef struct confirm_prices_request_t {
    list_t *offer_ids; //primitive container

} confirm_prices_request_t;

confirm_prices_request_t *confirm_prices_request_create(
    list_t *offer_ids
);

void confirm_prices_request_free(confirm_prices_request_t *confirm_prices_request);

confirm_prices_request_t *confirm_prices_request_parseFromJSON(cJSON *confirm_prices_requestJSON);

cJSON *confirm_prices_request_convertToJSON(confirm_prices_request_t *confirm_prices_request);

#endif /* _confirm_prices_request_H_ */

