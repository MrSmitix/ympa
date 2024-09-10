/*
 * update_goods_feedback_comment_request.h
 *
 * Комментарий к отзыву.
 */

#ifndef _update_goods_feedback_comment_request_H_
#define _update_goods_feedback_comment_request_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct update_goods_feedback_comment_request_t update_goods_feedback_comment_request_t;

#include "update_goods_feedback_comment_dto.h"



typedef struct update_goods_feedback_comment_request_t {
    long feedback_id; //numeric
    struct update_goods_feedback_comment_dto_t *comment; //model

} update_goods_feedback_comment_request_t;

update_goods_feedback_comment_request_t *update_goods_feedback_comment_request_create(
    long feedback_id,
    update_goods_feedback_comment_dto_t *comment
);

void update_goods_feedback_comment_request_free(update_goods_feedback_comment_request_t *update_goods_feedback_comment_request);

update_goods_feedback_comment_request_t *update_goods_feedback_comment_request_parseFromJSON(cJSON *update_goods_feedback_comment_requestJSON);

cJSON *update_goods_feedback_comment_request_convertToJSON(update_goods_feedback_comment_request_t *update_goods_feedback_comment_request);

#endif /* _update_goods_feedback_comment_request_H_ */

