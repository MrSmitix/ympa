/*
 * get_offer_recommendations_request.h
 *
 * 
 */

#ifndef _get_offer_recommendations_request_H_
#define _get_offer_recommendations_request_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct get_offer_recommendations_request_t get_offer_recommendations_request_t;

#include "field_state_type.h"
#include "price_competitiveness_type.h"

// Enum  for get_offer_recommendations_request

typedef enum  { _api__get_offer_recommendations_request__NULL = 0, _api__get_offer_recommendations_request__SPECIFIED, _api__get_offer_recommendations_request__EMPTY } _api__get_offer_recommendations_request__e;

char* get_offer_recommendations_request_cofinance_price_filter_ToString(_api__get_offer_recommendations_request__e cofinance_price_filter);

_api__get_offer_recommendations_request__e get_offer_recommendations_request_cofinance_price_filter_FromString(char* cofinance_price_filter);

// Enum  for get_offer_recommendations_request

typedef enum  { _api__get_offer_recommendations_request__NULL = 0, _api__get_offer_recommendations_request__SPECIFIED, _api__get_offer_recommendations_request__EMPTY } _api__get_offer_recommendations_request__e;

char* get_offer_recommendations_request_recommended_cofinance_price_filter_ToString(_api__get_offer_recommendations_request__e recommended_cofinance_price_filter);

_api__get_offer_recommendations_request__e get_offer_recommendations_request_recommended_cofinance_price_filter_FromString(char* recommended_cofinance_price_filter);

// Enum  for get_offer_recommendations_request

typedef enum  { _api__get_offer_recommendations_request__NULL = 0, _api__get_offer_recommendations_request__OPTIMAL, _api__get_offer_recommendations_request__AVERAGE, _api__get_offer_recommendations_request__LOW } _api__get_offer_recommendations_request__e;

char* get_offer_recommendations_request_competitiveness_filter_ToString(_api__get_offer_recommendations_request__e competitiveness_filter);

_api__get_offer_recommendations_request__e get_offer_recommendations_request_competitiveness_filter_FromString(char* competitiveness_filter);



typedef struct get_offer_recommendations_request_t {
    list_t *offer_ids; //primitive container
    field_state_type_t *cofinance_price_filter; // custom
    field_state_type_t *recommended_cofinance_price_filter; // custom
    price_competitiveness_type_t *competitiveness_filter; // custom

} get_offer_recommendations_request_t;

get_offer_recommendations_request_t *get_offer_recommendations_request_create(
    list_t *offer_ids,
    field_state_type_t *cofinance_price_filter,
    field_state_type_t *recommended_cofinance_price_filter,
    price_competitiveness_type_t *competitiveness_filter
);

void get_offer_recommendations_request_free(get_offer_recommendations_request_t *get_offer_recommendations_request);

get_offer_recommendations_request_t *get_offer_recommendations_request_parseFromJSON(cJSON *get_offer_recommendations_requestJSON);

cJSON *get_offer_recommendations_request_convertToJSON(get_offer_recommendations_request_t *get_offer_recommendations_request);

#endif /* _get_offer_recommendations_request_H_ */

