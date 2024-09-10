/*
 * goods_feedback_comment_dto.h
 *
 * Комментарий к отзыву.
 */

#ifndef _goods_feedback_comment_dto_H_
#define _goods_feedback_comment_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct goods_feedback_comment_dto_t goods_feedback_comment_dto_t;

#include "goods_feedback_comment_author_dto.h"
#include "goods_feedback_comment_status_type.h"

// Enum  for goods_feedback_comment_dto

typedef enum  { _api__goods_feedback_comment_dto__NULL = 0, _api__goods_feedback_comment_dto__PUBLISHED, _api__goods_feedback_comment_dto__UNMODERATED, _api__goods_feedback_comment_dto__BANNED, _api__goods_feedback_comment_dto__DELETED } _api__goods_feedback_comment_dto__e;

char* goods_feedback_comment_dto_status_ToString(_api__goods_feedback_comment_dto__e status);

_api__goods_feedback_comment_dto__e goods_feedback_comment_dto_status_FromString(char* status);



typedef struct goods_feedback_comment_dto_t {
    long id; //numeric
    char *text; // string
    int can_modify; //boolean
    long parent_id; //numeric
    struct goods_feedback_comment_author_dto_t *author; //model
    goods_feedback_comment_status_type_t *status; // custom

} goods_feedback_comment_dto_t;

goods_feedback_comment_dto_t *goods_feedback_comment_dto_create(
    long id,
    char *text,
    int can_modify,
    long parent_id,
    goods_feedback_comment_author_dto_t *author,
    goods_feedback_comment_status_type_t *status
);

void goods_feedback_comment_dto_free(goods_feedback_comment_dto_t *goods_feedback_comment_dto);

goods_feedback_comment_dto_t *goods_feedback_comment_dto_parseFromJSON(cJSON *goods_feedback_comment_dtoJSON);

cJSON *goods_feedback_comment_dto_convertToJSON(goods_feedback_comment_dto_t *goods_feedback_comment_dto);

#endif /* _goods_feedback_comment_dto_H_ */

