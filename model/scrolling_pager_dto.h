/*
 * scrolling_pager_dto.h
 *
 * Информация о страницах результатов.
 */

#ifndef _scrolling_pager_dto_H_
#define _scrolling_pager_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct scrolling_pager_dto_t scrolling_pager_dto_t;




typedef struct scrolling_pager_dto_t {
    char *next_page_token; // string
    char *prev_page_token; // string

} scrolling_pager_dto_t;

scrolling_pager_dto_t *scrolling_pager_dto_create(
    char *next_page_token,
    char *prev_page_token
);

void scrolling_pager_dto_free(scrolling_pager_dto_t *scrolling_pager_dto);

scrolling_pager_dto_t *scrolling_pager_dto_parseFromJSON(cJSON *scrolling_pager_dtoJSON);

cJSON *scrolling_pager_dto_convertToJSON(scrolling_pager_dto_t *scrolling_pager_dto);

#endif /* _scrolling_pager_dto_H_ */

