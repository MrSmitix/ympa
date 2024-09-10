/*
 * goods_feedback_list_dto.h
 *
 * Список отзывов о товарах. 
 */

#ifndef _goods_feedback_list_dto_H_
#define _goods_feedback_list_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct goods_feedback_list_dto_t goods_feedback_list_dto_t;

#include "forward_scrolling_pager_dto.h"
#include "goods_feedback_dto.h"



typedef struct goods_feedback_list_dto_t {
    list_t *feedbacks; //nonprimitive container
    struct forward_scrolling_pager_dto_t *paging; //model

} goods_feedback_list_dto_t;

goods_feedback_list_dto_t *goods_feedback_list_dto_create(
    list_t *feedbacks,
    forward_scrolling_pager_dto_t *paging
);

void goods_feedback_list_dto_free(goods_feedback_list_dto_t *goods_feedback_list_dto);

goods_feedback_list_dto_t *goods_feedback_list_dto_parseFromJSON(cJSON *goods_feedback_list_dtoJSON);

cJSON *goods_feedback_list_dto_convertToJSON(goods_feedback_list_dto_t *goods_feedback_list_dto);

#endif /* _goods_feedback_list_dto_H_ */

