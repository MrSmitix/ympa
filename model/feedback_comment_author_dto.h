/*
 * feedback_comment_author_dto.h
 *
 * Информация об авторе комментария.
 */

#ifndef _feedback_comment_author_dto_H_
#define _feedback_comment_author_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct feedback_comment_author_dto_t feedback_comment_author_dto_t;

#include "feedback_comment_author_type.h"

// Enum  for feedback_comment_author_dto

typedef enum  { _api__feedback_comment_author_dto__NULL = 0, _api__feedback_comment_author_dto__USER, _api__feedback_comment_author_dto__SHOP } _api__feedback_comment_author_dto__e;

char* feedback_comment_author_dto_type_ToString(_api__feedback_comment_author_dto__e type);

_api__feedback_comment_author_dto__e feedback_comment_author_dto_type_FromString(char* type);



typedef struct feedback_comment_author_dto_t {
    feedback_comment_author_type_t *type; // custom
    char *name; // string

} feedback_comment_author_dto_t;

feedback_comment_author_dto_t *feedback_comment_author_dto_create(
    feedback_comment_author_type_t *type,
    char *name
);

void feedback_comment_author_dto_free(feedback_comment_author_dto_t *feedback_comment_author_dto);

feedback_comment_author_dto_t *feedback_comment_author_dto_parseFromJSON(cJSON *feedback_comment_author_dtoJSON);

cJSON *feedback_comment_author_dto_convertToJSON(feedback_comment_author_dto_t *feedback_comment_author_dto);

#endif /* _feedback_comment_author_dto_H_ */

