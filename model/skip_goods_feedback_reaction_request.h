/*
 * skip_goods_feedback_reaction_request.h
 *
 * Идентификаторы отзывов.
 */

#ifndef _skip_goods_feedback_reaction_request_H_
#define _skip_goods_feedback_reaction_request_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct skip_goods_feedback_reaction_request_t skip_goods_feedback_reaction_request_t;




typedef struct skip_goods_feedback_reaction_request_t {
    list_t *feedback_ids; //primitive container

} skip_goods_feedback_reaction_request_t;

skip_goods_feedback_reaction_request_t *skip_goods_feedback_reaction_request_create(
    list_t *feedback_ids
);

void skip_goods_feedback_reaction_request_free(skip_goods_feedback_reaction_request_t *skip_goods_feedback_reaction_request);

skip_goods_feedback_reaction_request_t *skip_goods_feedback_reaction_request_parseFromJSON(cJSON *skip_goods_feedback_reaction_requestJSON);

cJSON *skip_goods_feedback_reaction_request_convertToJSON(skip_goods_feedback_reaction_request_t *skip_goods_feedback_reaction_request);

#endif /* _skip_goods_feedback_reaction_request_H_ */

