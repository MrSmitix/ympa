/*
 * update_goods_feedback_comment_dto.h
 *
 * Комментарий к отзыву или другому комментарию.
 */

#ifndef _update_goods_feedback_comment_dto_H_
#define _update_goods_feedback_comment_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct update_goods_feedback_comment_dto_t update_goods_feedback_comment_dto_t;




typedef struct update_goods_feedback_comment_dto_t {
    long id; //numeric
    long parent_id; //numeric
    char *text; // string

} update_goods_feedback_comment_dto_t;

update_goods_feedback_comment_dto_t *update_goods_feedback_comment_dto_create(
    long id,
    long parent_id,
    char *text
);

void update_goods_feedback_comment_dto_free(update_goods_feedback_comment_dto_t *update_goods_feedback_comment_dto);

update_goods_feedback_comment_dto_t *update_goods_feedback_comment_dto_parseFromJSON(cJSON *update_goods_feedback_comment_dtoJSON);

cJSON *update_goods_feedback_comment_dto_convertToJSON(update_goods_feedback_comment_dto_t *update_goods_feedback_comment_dto);

#endif /* _update_goods_feedback_comment_dto_H_ */

