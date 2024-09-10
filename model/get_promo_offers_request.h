/*
 * get_promo_offers_request.h
 *
 * Получение списка товаров, которые участвуют или могут участвовать в акции.
 */

#ifndef _get_promo_offers_request_H_
#define _get_promo_offers_request_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct get_promo_offers_request_t get_promo_offers_request_t;

#include "promo_offer_participation_status_filter_type.h"

// Enum  for get_promo_offers_request

typedef enum  { _api__get_promo_offers_request__NULL = 0, _api__get_promo_offers_request__MANUALLY_ADDED, _api__get_promo_offers_request__NOT_MANUALLY_ADDED } _api__get_promo_offers_request__e;

char* get_promo_offers_request_status_type_ToString(_api__get_promo_offers_request__e status_type);

_api__get_promo_offers_request__e get_promo_offers_request_status_type_FromString(char* status_type);



typedef struct get_promo_offers_request_t {
    char *promo_id; // string
    promo_offer_participation_status_filter_type_t *status_type; // custom

} get_promo_offers_request_t;

get_promo_offers_request_t *get_promo_offers_request_create(
    char *promo_id,
    promo_offer_participation_status_filter_type_t *status_type
);

void get_promo_offers_request_free(get_promo_offers_request_t *get_promo_offers_request);

get_promo_offers_request_t *get_promo_offers_request_parseFromJSON(cJSON *get_promo_offers_requestJSON);

cJSON *get_promo_offers_request_convertToJSON(get_promo_offers_request_t *get_promo_offers_request);

#endif /* _get_promo_offers_request_H_ */

