/*
 * goods_feedback_description_dto.h
 *
 * Текстовая часть отзыва.
 */

#ifndef _goods_feedback_description_dto_H_
#define _goods_feedback_description_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct goods_feedback_description_dto_t goods_feedback_description_dto_t;




typedef struct goods_feedback_description_dto_t {
    char *advantages; // string
    char *disadvantages; // string
    char *comment; // string

} goods_feedback_description_dto_t;

goods_feedback_description_dto_t *goods_feedback_description_dto_create(
    char *advantages,
    char *disadvantages,
    char *comment
);

void goods_feedback_description_dto_free(goods_feedback_description_dto_t *goods_feedback_description_dto);

goods_feedback_description_dto_t *goods_feedback_description_dto_parseFromJSON(cJSON *goods_feedback_description_dtoJSON);

cJSON *goods_feedback_description_dto_convertToJSON(goods_feedback_description_dto_t *goods_feedback_description_dto);

#endif /* _goods_feedback_description_dto_H_ */

