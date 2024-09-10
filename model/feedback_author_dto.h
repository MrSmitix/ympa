/*
 * feedback_author_dto.h
 *
 * Информация об авторе отзыва.  Если отзыв оставлен анонимно, параметр не возвращается. 
 */

#ifndef _feedback_author_dto_H_
#define _feedback_author_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct feedback_author_dto_t feedback_author_dto_t;

#include "region_dto.h"



typedef struct feedback_author_dto_t {
    char *name; // string
    struct region_dto_t *region; //model

} feedback_author_dto_t;

feedback_author_dto_t *feedback_author_dto_create(
    char *name,
    region_dto_t *region
);

void feedback_author_dto_free(feedback_author_dto_t *feedback_author_dto);

feedback_author_dto_t *feedback_author_dto_parseFromJSON(cJSON *feedback_author_dtoJSON);

cJSON *feedback_author_dto_convertToJSON(feedback_author_dto_t *feedback_author_dto);

#endif /* _feedback_author_dto_H_ */

