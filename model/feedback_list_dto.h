/*
 * feedback_list_dto.h
 *
 * Отзывы пользователей Яндекс Маркета об указанном магазине.
 */

#ifndef _feedback_list_dto_H_
#define _feedback_list_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct feedback_list_dto_t feedback_list_dto_t;

#include "feedback_dto.h"
#include "scrolling_pager_dto.h"



typedef struct feedback_list_dto_t {
    struct scrolling_pager_dto_t *paging; //model
    list_t *feedback_list; //nonprimitive container

} feedback_list_dto_t;

feedback_list_dto_t *feedback_list_dto_create(
    scrolling_pager_dto_t *paging,
    list_t *feedback_list
);

void feedback_list_dto_free(feedback_list_dto_t *feedback_list_dto);

feedback_list_dto_t *feedback_list_dto_parseFromJSON(cJSON *feedback_list_dtoJSON);

cJSON *feedback_list_dto_convertToJSON(feedback_list_dto_t *feedback_list_dto);

#endif /* _feedback_list_dto_H_ */

