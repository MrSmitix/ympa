/*
 * goods_feedback_media_dto.h
 *
 * Фото и видео.
 */

#ifndef _goods_feedback_media_dto_H_
#define _goods_feedback_media_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct goods_feedback_media_dto_t goods_feedback_media_dto_t;




typedef struct goods_feedback_media_dto_t {
    list_t *photos; //primitive container
    list_t *videos; //primitive container

} goods_feedback_media_dto_t;

goods_feedback_media_dto_t *goods_feedback_media_dto_create(
    list_t *photos,
    list_t *videos
);

void goods_feedback_media_dto_free(goods_feedback_media_dto_t *goods_feedback_media_dto);

goods_feedback_media_dto_t *goods_feedback_media_dto_parseFromJSON(cJSON *goods_feedback_media_dtoJSON);

cJSON *goods_feedback_media_dto_convertToJSON(goods_feedback_media_dto_t *goods_feedback_media_dto);

#endif /* _goods_feedback_media_dto_H_ */

