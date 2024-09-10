/*
 * forward_scrolling_pager_dto.h
 *
 * Ссылка на следующую страницу. 
 */

#ifndef _forward_scrolling_pager_dto_H_
#define _forward_scrolling_pager_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct forward_scrolling_pager_dto_t forward_scrolling_pager_dto_t;




typedef struct forward_scrolling_pager_dto_t {
    char *next_page_token; // string

} forward_scrolling_pager_dto_t;

forward_scrolling_pager_dto_t *forward_scrolling_pager_dto_create(
    char *next_page_token
);

void forward_scrolling_pager_dto_free(forward_scrolling_pager_dto_t *forward_scrolling_pager_dto);

forward_scrolling_pager_dto_t *forward_scrolling_pager_dto_parseFromJSON(cJSON *forward_scrolling_pager_dtoJSON);

cJSON *forward_scrolling_pager_dto_convertToJSON(forward_scrolling_pager_dto_t *forward_scrolling_pager_dto);

#endif /* _forward_scrolling_pager_dto_H_ */

