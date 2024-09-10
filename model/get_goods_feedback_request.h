/*
 * get_goods_feedback_request.h
 *
 * Фильтр запроса отзывов в кабинете. 
 */

#ifndef _get_goods_feedback_request_H_
#define _get_goods_feedback_request_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct get_goods_feedback_request_t get_goods_feedback_request_t;

#include "feedback_reaction_status_type.h"

// Enum  for get_goods_feedback_request

typedef enum  { _api__get_goods_feedback_request__NULL = 0, _api__get_goods_feedback_request__ALL, _api__get_goods_feedback_request__NEED_REACTION } _api__get_goods_feedback_request__e;

char* get_goods_feedback_request_reaction_status_ToString(_api__get_goods_feedback_request__e reaction_status);

_api__get_goods_feedback_request__e get_goods_feedback_request_reaction_status_FromString(char* reaction_status);



typedef struct get_goods_feedback_request_t {
    char *date_time_from; //date time
    char *date_time_to; //date time
    feedback_reaction_status_type_t *reaction_status; // custom
    list_t *rating_values; //primitive container
    list_t *model_ids; //primitive container
    int paid; //boolean

} get_goods_feedback_request_t;

get_goods_feedback_request_t *get_goods_feedback_request_create(
    char *date_time_from,
    char *date_time_to,
    feedback_reaction_status_type_t *reaction_status,
    list_t *rating_values,
    list_t *model_ids,
    int paid
);

void get_goods_feedback_request_free(get_goods_feedback_request_t *get_goods_feedback_request);

get_goods_feedback_request_t *get_goods_feedback_request_parseFromJSON(cJSON *get_goods_feedback_requestJSON);

cJSON *get_goods_feedback_request_convertToJSON(get_goods_feedback_request_t *get_goods_feedback_request);

#endif /* _get_goods_feedback_request_H_ */

