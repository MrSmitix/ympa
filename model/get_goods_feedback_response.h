/*
 * get_goods_feedback_response.h
 *
 * 
 */

#ifndef _get_goods_feedback_response_H_
#define _get_goods_feedback_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct get_goods_feedback_response_t get_goods_feedback_response_t;

#include "api_response_status_type.h"
#include "goods_feedback_list_dto.h"

// Enum  for get_goods_feedback_response

typedef enum  { _api__get_goods_feedback_response__NULL = 0, _api__get_goods_feedback_response__OK, _api__get_goods_feedback_response__ERROR } _api__get_goods_feedback_response__e;

char* get_goods_feedback_response_status_ToString(_api__get_goods_feedback_response__e status);

_api__get_goods_feedback_response__e get_goods_feedback_response_status_FromString(char* status);



typedef struct get_goods_feedback_response_t {
    api_response_status_type_t *status; // custom
    struct goods_feedback_list_dto_t *result; //model

} get_goods_feedback_response_t;

get_goods_feedback_response_t *get_goods_feedback_response_create(
    api_response_status_type_t *status,
    goods_feedback_list_dto_t *result
);

void get_goods_feedback_response_free(get_goods_feedback_response_t *get_goods_feedback_response);

get_goods_feedback_response_t *get_goods_feedback_response_parseFromJSON(cJSON *get_goods_feedback_responseJSON);

cJSON *get_goods_feedback_response_convertToJSON(get_goods_feedback_response_t *get_goods_feedback_response);

#endif /* _get_goods_feedback_response_H_ */

