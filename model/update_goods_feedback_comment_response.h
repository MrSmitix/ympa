/*
 * update_goods_feedback_comment_response.h
 *
 * 
 */

#ifndef _update_goods_feedback_comment_response_H_
#define _update_goods_feedback_comment_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct update_goods_feedback_comment_response_t update_goods_feedback_comment_response_t;

#include "api_response_status_type.h"
#include "goods_feedback_comment_dto.h"

// Enum  for update_goods_feedback_comment_response

typedef enum  { _api__update_goods_feedback_comment_response__NULL = 0, _api__update_goods_feedback_comment_response__OK, _api__update_goods_feedback_comment_response__ERROR } _api__update_goods_feedback_comment_response__e;

char* update_goods_feedback_comment_response_status_ToString(_api__update_goods_feedback_comment_response__e status);

_api__update_goods_feedback_comment_response__e update_goods_feedback_comment_response_status_FromString(char* status);



typedef struct update_goods_feedback_comment_response_t {
    api_response_status_type_t *status; // custom
    struct goods_feedback_comment_dto_t *result; //model

} update_goods_feedback_comment_response_t;

update_goods_feedback_comment_response_t *update_goods_feedback_comment_response_create(
    api_response_status_type_t *status,
    goods_feedback_comment_dto_t *result
);

void update_goods_feedback_comment_response_free(update_goods_feedback_comment_response_t *update_goods_feedback_comment_response);

update_goods_feedback_comment_response_t *update_goods_feedback_comment_response_parseFromJSON(cJSON *update_goods_feedback_comment_responseJSON);

cJSON *update_goods_feedback_comment_response_convertToJSON(update_goods_feedback_comment_response_t *update_goods_feedback_comment_response);

#endif /* _update_goods_feedback_comment_response_H_ */

