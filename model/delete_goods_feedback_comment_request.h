/*
 * delete_goods_feedback_comment_request.h
 *
 * Фильтр запроса отзывов по бизнесу. 
 */

#ifndef _delete_goods_feedback_comment_request_H_
#define _delete_goods_feedback_comment_request_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct delete_goods_feedback_comment_request_t delete_goods_feedback_comment_request_t;




typedef struct delete_goods_feedback_comment_request_t {
    long id; //numeric

} delete_goods_feedback_comment_request_t;

delete_goods_feedback_comment_request_t *delete_goods_feedback_comment_request_create(
    long id
);

void delete_goods_feedback_comment_request_free(delete_goods_feedback_comment_request_t *delete_goods_feedback_comment_request);

delete_goods_feedback_comment_request_t *delete_goods_feedback_comment_request_parseFromJSON(cJSON *delete_goods_feedback_comment_requestJSON);

cJSON *delete_goods_feedback_comment_request_convertToJSON(delete_goods_feedback_comment_request_t *delete_goods_feedback_comment_request);

#endif /* _delete_goods_feedback_comment_request_H_ */

