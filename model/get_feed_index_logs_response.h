/*
 * get_feed_index_logs_response.h
 *
 * 
 */

#ifndef _get_feed_index_logs_response_H_
#define _get_feed_index_logs_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct get_feed_index_logs_response_t get_feed_index_logs_response_t;

#include "api_response_status_type.h"
#include "feed_index_logs_result_dto.h"

// Enum  for get_feed_index_logs_response

typedef enum  { _api__get_feed_index_logs_response__NULL = 0, _api__get_feed_index_logs_response__OK, _api__get_feed_index_logs_response__ERROR } _api__get_feed_index_logs_response__e;

char* get_feed_index_logs_response_status_ToString(_api__get_feed_index_logs_response__e status);

_api__get_feed_index_logs_response__e get_feed_index_logs_response_status_FromString(char* status);



typedef struct get_feed_index_logs_response_t {
    api_response_status_type_t *status; // custom
    struct feed_index_logs_result_dto_t *result; //model

} get_feed_index_logs_response_t;

get_feed_index_logs_response_t *get_feed_index_logs_response_create(
    api_response_status_type_t *status,
    feed_index_logs_result_dto_t *result
);

void get_feed_index_logs_response_free(get_feed_index_logs_response_t *get_feed_index_logs_response);

get_feed_index_logs_response_t *get_feed_index_logs_response_parseFromJSON(cJSON *get_feed_index_logs_responseJSON);

cJSON *get_feed_index_logs_response_convertToJSON(get_feed_index_logs_response_t *get_feed_index_logs_response);

#endif /* _get_feed_index_logs_response_H_ */

