/*
 * get_prices_by_offer_ids_response.h
 *
 * Ответ на запрос списка цен.
 */

#ifndef _get_prices_by_offer_ids_response_H_
#define _get_prices_by_offer_ids_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct get_prices_by_offer_ids_response_t get_prices_by_offer_ids_response_t;

#include "api_response_status_type.h"
#include "offer_price_by_offer_ids_list_response_dto.h"

// Enum  for get_prices_by_offer_ids_response

typedef enum  { _api__get_prices_by_offer_ids_response__NULL = 0, _api__get_prices_by_offer_ids_response__OK, _api__get_prices_by_offer_ids_response__ERROR } _api__get_prices_by_offer_ids_response__e;

char* get_prices_by_offer_ids_response_status_ToString(_api__get_prices_by_offer_ids_response__e status);

_api__get_prices_by_offer_ids_response__e get_prices_by_offer_ids_response_status_FromString(char* status);



typedef struct get_prices_by_offer_ids_response_t {
    api_response_status_type_t *status; // custom
    struct offer_price_by_offer_ids_list_response_dto_t *result; //model

} get_prices_by_offer_ids_response_t;

get_prices_by_offer_ids_response_t *get_prices_by_offer_ids_response_create(
    api_response_status_type_t *status,
    offer_price_by_offer_ids_list_response_dto_t *result
);

void get_prices_by_offer_ids_response_free(get_prices_by_offer_ids_response_t *get_prices_by_offer_ids_response);

get_prices_by_offer_ids_response_t *get_prices_by_offer_ids_response_parseFromJSON(cJSON *get_prices_by_offer_ids_responseJSON);

cJSON *get_prices_by_offer_ids_response_convertToJSON(get_prices_by_offer_ids_response_t *get_prices_by_offer_ids_response);

#endif /* _get_prices_by_offer_ids_response_H_ */

