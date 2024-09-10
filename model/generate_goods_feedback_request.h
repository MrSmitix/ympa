/*
 * generate_goods_feedback_request.h
 *
 * Данные, необходимые для генерации отчета. 
 */

#ifndef _generate_goods_feedback_request_H_
#define _generate_goods_feedback_request_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct generate_goods_feedback_request_t generate_goods_feedback_request_t;




typedef struct generate_goods_feedback_request_t {
    long business_id; //numeric

} generate_goods_feedback_request_t;

generate_goods_feedback_request_t *generate_goods_feedback_request_create(
    long business_id
);

void generate_goods_feedback_request_free(generate_goods_feedback_request_t *generate_goods_feedback_request);

generate_goods_feedback_request_t *generate_goods_feedback_request_parseFromJSON(cJSON *generate_goods_feedback_requestJSON);

cJSON *generate_goods_feedback_request_convertToJSON(generate_goods_feedback_request_t *generate_goods_feedback_request);

#endif /* _generate_goods_feedback_request_H_ */

