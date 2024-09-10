/*
 * get_goods_feedback_comments_request.h
 *
 * Фильтр запроса комментариев отзыва. 
 */

#ifndef _get_goods_feedback_comments_request_H_
#define _get_goods_feedback_comments_request_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct get_goods_feedback_comments_request_t get_goods_feedback_comments_request_t;




typedef struct get_goods_feedback_comments_request_t {
    long feedback_id; //numeric

} get_goods_feedback_comments_request_t;

get_goods_feedback_comments_request_t *get_goods_feedback_comments_request_create(
    long feedback_id
);

void get_goods_feedback_comments_request_free(get_goods_feedback_comments_request_t *get_goods_feedback_comments_request);

get_goods_feedback_comments_request_t *get_goods_feedback_comments_request_parseFromJSON(cJSON *get_goods_feedback_comments_requestJSON);

cJSON *get_goods_feedback_comments_request_convertToJSON(get_goods_feedback_comments_request_t *get_goods_feedback_comments_request);

#endif /* _get_goods_feedback_comments_request_H_ */

