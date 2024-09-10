/*
 * get_bids_recommendations_response.h
 *
 * description.
 */

#ifndef _get_bids_recommendations_response_H_
#define _get_bids_recommendations_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct get_bids_recommendations_response_t get_bids_recommendations_response_t;

#include "api_response_status_type.h"
#include "get_bids_recommendations_response_dto.h"

// Enum  for get_bids_recommendations_response

typedef enum  { _api__get_bids_recommendations_response__NULL = 0, _api__get_bids_recommendations_response__OK, _api__get_bids_recommendations_response__ERROR } _api__get_bids_recommendations_response__e;

char* get_bids_recommendations_response_status_ToString(_api__get_bids_recommendations_response__e status);

_api__get_bids_recommendations_response__e get_bids_recommendations_response_status_FromString(char* status);



typedef struct get_bids_recommendations_response_t {
    api_response_status_type_t *status; // custom
    struct get_bids_recommendations_response_dto_t *result; //model

} get_bids_recommendations_response_t;

get_bids_recommendations_response_t *get_bids_recommendations_response_create(
    api_response_status_type_t *status,
    get_bids_recommendations_response_dto_t *result
);

void get_bids_recommendations_response_free(get_bids_recommendations_response_t *get_bids_recommendations_response);

get_bids_recommendations_response_t *get_bids_recommendations_response_parseFromJSON(cJSON *get_bids_recommendations_responseJSON);

cJSON *get_bids_recommendations_response_convertToJSON(get_bids_recommendations_response_t *get_bids_recommendations_response);

#endif /* _get_bids_recommendations_response_H_ */

