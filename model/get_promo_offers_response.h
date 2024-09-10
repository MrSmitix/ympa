/*
 * get_promo_offers_response.h
 *
 * 
 */

#ifndef _get_promo_offers_response_H_
#define _get_promo_offers_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct get_promo_offers_response_t get_promo_offers_response_t;

#include "api_response_status_type.h"
#include "get_promo_offers_result_dto.h"

// Enum  for get_promo_offers_response

typedef enum  { _api__get_promo_offers_response__NULL = 0, _api__get_promo_offers_response__OK, _api__get_promo_offers_response__ERROR } _api__get_promo_offers_response__e;

char* get_promo_offers_response_status_ToString(_api__get_promo_offers_response__e status);

_api__get_promo_offers_response__e get_promo_offers_response_status_FromString(char* status);



typedef struct get_promo_offers_response_t {
    api_response_status_type_t *status; // custom
    struct get_promo_offers_result_dto_t *result; //model

} get_promo_offers_response_t;

get_promo_offers_response_t *get_promo_offers_response_create(
    api_response_status_type_t *status,
    get_promo_offers_result_dto_t *result
);

void get_promo_offers_response_free(get_promo_offers_response_t *get_promo_offers_response);

get_promo_offers_response_t *get_promo_offers_response_parseFromJSON(cJSON *get_promo_offers_responseJSON);

cJSON *get_promo_offers_response_convertToJSON(get_promo_offers_response_t *get_promo_offers_response);

#endif /* _get_promo_offers_response_H_ */

