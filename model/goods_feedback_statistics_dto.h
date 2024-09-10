/*
 * goods_feedback_statistics_dto.h
 *
 * Статистическая информация по отзыву.
 */

#ifndef _goods_feedback_statistics_dto_H_
#define _goods_feedback_statistics_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct goods_feedback_statistics_dto_t goods_feedback_statistics_dto_t;




typedef struct goods_feedback_statistics_dto_t {
    int rating; //numeric
    long comments_count; //numeric
    int recommended; //boolean
    long paid_amount; //numeric

} goods_feedback_statistics_dto_t;

goods_feedback_statistics_dto_t *goods_feedback_statistics_dto_create(
    int rating,
    long comments_count,
    int recommended,
    long paid_amount
);

void goods_feedback_statistics_dto_free(goods_feedback_statistics_dto_t *goods_feedback_statistics_dto);

goods_feedback_statistics_dto_t *goods_feedback_statistics_dto_parseFromJSON(cJSON *goods_feedback_statistics_dtoJSON);

cJSON *goods_feedback_statistics_dto_convertToJSON(goods_feedback_statistics_dto_t *goods_feedback_statistics_dto);

#endif /* _goods_feedback_statistics_dto_H_ */

