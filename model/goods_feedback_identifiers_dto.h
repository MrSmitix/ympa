/*
 * goods_feedback_identifiers_dto.h
 *
 * Идентификаторы, которые связаны с отзывом.
 */

#ifndef _goods_feedback_identifiers_dto_H_
#define _goods_feedback_identifiers_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct goods_feedback_identifiers_dto_t goods_feedback_identifiers_dto_t;




typedef struct goods_feedback_identifiers_dto_t {
    long order_id; //numeric
    long model_id; //numeric

} goods_feedback_identifiers_dto_t;

goods_feedback_identifiers_dto_t *goods_feedback_identifiers_dto_create(
    long order_id,
    long model_id
);

void goods_feedback_identifiers_dto_free(goods_feedback_identifiers_dto_t *goods_feedback_identifiers_dto);

goods_feedback_identifiers_dto_t *goods_feedback_identifiers_dto_parseFromJSON(cJSON *goods_feedback_identifiers_dtoJSON);

cJSON *goods_feedback_identifiers_dto_convertToJSON(goods_feedback_identifiers_dto_t *goods_feedback_identifiers_dto);

#endif /* _goods_feedback_identifiers_dto_H_ */

