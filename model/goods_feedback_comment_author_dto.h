/*
 * goods_feedback_comment_author_dto.h
 *
 * Информация об авторе комментария.
 */

#ifndef _goods_feedback_comment_author_dto_H_
#define _goods_feedback_comment_author_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct goods_feedback_comment_author_dto_t goods_feedback_comment_author_dto_t;

#include "goods_feedback_comment_author_type.h"

// Enum  for goods_feedback_comment_author_dto

typedef enum  { _api__goods_feedback_comment_author_dto__NULL = 0, _api__goods_feedback_comment_author_dto__USER, _api__goods_feedback_comment_author_dto__BUSINESS } _api__goods_feedback_comment_author_dto__e;

char* goods_feedback_comment_author_dto_type_ToString(_api__goods_feedback_comment_author_dto__e type);

_api__goods_feedback_comment_author_dto__e goods_feedback_comment_author_dto_type_FromString(char* type);



typedef struct goods_feedback_comment_author_dto_t {
    goods_feedback_comment_author_type_t *type; // custom
    char *name; // string

} goods_feedback_comment_author_dto_t;

goods_feedback_comment_author_dto_t *goods_feedback_comment_author_dto_create(
    goods_feedback_comment_author_type_t *type,
    char *name
);

void goods_feedback_comment_author_dto_free(goods_feedback_comment_author_dto_t *goods_feedback_comment_author_dto);

goods_feedback_comment_author_dto_t *goods_feedback_comment_author_dto_parseFromJSON(cJSON *goods_feedback_comment_author_dtoJSON);

cJSON *goods_feedback_comment_author_dto_convertToJSON(goods_feedback_comment_author_dto_t *goods_feedback_comment_author_dto);

#endif /* _goods_feedback_comment_author_dto_H_ */

