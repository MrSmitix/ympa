/*
 * feedback_dto.h
 *
 * Отзыв пользователя Яндекс Маркета об указанном магазине.
 */

#ifndef _feedback_dto_H_
#define _feedback_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct feedback_dto_t feedback_dto_t;

#include "feedback_author_dto.h"
#include "feedback_comment_dto.h"
#include "feedback_grades_dto.h"
#include "feedback_order_dto.h"
#include "feedback_shop_dto.h"
#include "feedback_state_type.h"

// Enum  for feedback_dto

typedef enum  { _api__feedback_dto__NULL = 0, _api__feedback_dto__LAST, _api__feedback_dto__PREVIOUS, _api__feedback_dto__DELETED } _api__feedback_dto__e;

char* feedback_dto_state_ToString(_api__feedback_dto__e state);

_api__feedback_dto__e feedback_dto_state_FromString(char* state);



typedef struct feedback_dto_t {
    long id; //numeric
    char *created_at; //date time
    char *text; // string
    feedback_state_type_t *state; // custom
    struct feedback_author_dto_t *author; //model
    char *pro; // string
    char *contra; // string
    list_t *comments; //nonprimitive container
    struct feedback_shop_dto_t *shop; //model
    int resolved; //boolean
    int verified; //boolean
    int recommend; //boolean
    struct feedback_grades_dto_t *grades; //model
    struct feedback_order_dto_t *order; //model

} feedback_dto_t;

feedback_dto_t *feedback_dto_create(
    long id,
    char *created_at,
    char *text,
    feedback_state_type_t *state,
    feedback_author_dto_t *author,
    char *pro,
    char *contra,
    list_t *comments,
    feedback_shop_dto_t *shop,
    int resolved,
    int verified,
    int recommend,
    feedback_grades_dto_t *grades,
    feedback_order_dto_t *order
);

void feedback_dto_free(feedback_dto_t *feedback_dto);

feedback_dto_t *feedback_dto_parseFromJSON(cJSON *feedback_dtoJSON);

cJSON *feedback_dto_convertToJSON(feedback_dto_t *feedback_dto);

#endif /* _feedback_dto_H_ */

