/*
 * goods_feedback_dto.h
 *
 * Отзыв о товаре.
 */

#ifndef _goods_feedback_dto_H_
#define _goods_feedback_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct goods_feedback_dto_t goods_feedback_dto_t;

#include "goods_feedback_description_dto.h"
#include "goods_feedback_identifiers_dto.h"
#include "goods_feedback_media_dto.h"
#include "goods_feedback_statistics_dto.h"



typedef struct goods_feedback_dto_t {
    long feedback_id; //numeric
    char *created_at; //date time
    int need_reaction; //boolean
    struct goods_feedback_identifiers_dto_t *identifiers; //model
    char *author; // string
    struct goods_feedback_description_dto_t *description; //model
    struct goods_feedback_media_dto_t *media; //model
    struct goods_feedback_statistics_dto_t *statistics; //model

} goods_feedback_dto_t;

goods_feedback_dto_t *goods_feedback_dto_create(
    long feedback_id,
    char *created_at,
    int need_reaction,
    goods_feedback_identifiers_dto_t *identifiers,
    char *author,
    goods_feedback_description_dto_t *description,
    goods_feedback_media_dto_t *media,
    goods_feedback_statistics_dto_t *statistics
);

void goods_feedback_dto_free(goods_feedback_dto_t *goods_feedback_dto);

goods_feedback_dto_t *goods_feedback_dto_parseFromJSON(cJSON *goods_feedback_dtoJSON);

cJSON *goods_feedback_dto_convertToJSON(goods_feedback_dto_t *goods_feedback_dto);

#endif /* _goods_feedback_dto_H_ */

