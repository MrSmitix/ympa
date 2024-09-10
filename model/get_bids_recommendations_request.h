/*
 * get_bids_recommendations_request.h
 *
 * description.
 */

#ifndef _get_bids_recommendations_request_H_
#define _get_bids_recommendations_request_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct get_bids_recommendations_request_t get_bids_recommendations_request_t;




typedef struct get_bids_recommendations_request_t {
    list_t *skus; //primitive container

} get_bids_recommendations_request_t;

get_bids_recommendations_request_t *get_bids_recommendations_request_create(
    list_t *skus
);

void get_bids_recommendations_request_free(get_bids_recommendations_request_t *get_bids_recommendations_request);

get_bids_recommendations_request_t *get_bids_recommendations_request_parseFromJSON(cJSON *get_bids_recommendations_requestJSON);

cJSON *get_bids_recommendations_request_convertToJSON(get_bids_recommendations_request_t *get_bids_recommendations_request);

#endif /* _get_bids_recommendations_request_H_ */

