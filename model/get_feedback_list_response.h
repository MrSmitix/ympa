/*
 * get_feedback_list_response.h
 *
 * 
 */

#ifndef _get_feedback_list_response_H_
#define _get_feedback_list_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct get_feedback_list_response_t get_feedback_list_response_t;

#include "api_response_status_type.h"
#include "feedback_list_dto.h"

// Enum  for get_feedback_list_response

typedef enum  { _api__get_feedback_list_response__NULL = 0, _api__get_feedback_list_response__OK, _api__get_feedback_list_response__ERROR } _api__get_feedback_list_response__e;

char* get_feedback_list_response_status_ToString(_api__get_feedback_list_response__e status);

_api__get_feedback_list_response__e get_feedback_list_response_status_FromString(char* status);



typedef struct get_feedback_list_response_t {
    api_response_status_type_t *status; // custom
    struct feedback_list_dto_t *result; //model

} get_feedback_list_response_t;

get_feedback_list_response_t *get_feedback_list_response_create(
    api_response_status_type_t *status,
    feedback_list_dto_t *result
);

void get_feedback_list_response_free(get_feedback_list_response_t *get_feedback_list_response);

get_feedback_list_response_t *get_feedback_list_response_parseFromJSON(cJSON *get_feedback_list_responseJSON);

cJSON *get_feedback_list_response_convertToJSON(get_feedback_list_response_t *get_feedback_list_response);

#endif /* _get_feedback_list_response_H_ */

