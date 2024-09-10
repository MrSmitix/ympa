/*
 * feedback_comment_dto.h
 *
 * Комментарий к отзыву на магазин.
 */

#ifndef _feedback_comment_dto_H_
#define _feedback_comment_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct feedback_comment_dto_t feedback_comment_dto_t;

#include "feedback_comment_author_dto.h"



typedef struct feedback_comment_dto_t {
    long id; //numeric
    long parent_id; //numeric
    char *body; // string
    char *created_at; //date time
    char *updated_at; //date time
    struct feedback_comment_author_dto_t *author; //model
    list_t *children; //nonprimitive container

} feedback_comment_dto_t;

feedback_comment_dto_t *feedback_comment_dto_create(
    long id,
    long parent_id,
    char *body,
    char *created_at,
    char *updated_at,
    feedback_comment_author_dto_t *author,
    list_t *children
);

void feedback_comment_dto_free(feedback_comment_dto_t *feedback_comment_dto);

feedback_comment_dto_t *feedback_comment_dto_parseFromJSON(cJSON *feedback_comment_dtoJSON);

cJSON *feedback_comment_dto_convertToJSON(feedback_comment_dto_t *feedback_comment_dto);

#endif /* _feedback_comment_dto_H_ */

