/*
 * flipping_pager_dto.h
 *
 * Модель для пагинации.
 */

#ifndef _flipping_pager_dto_H_
#define _flipping_pager_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct flipping_pager_dto_t flipping_pager_dto_t;




typedef struct flipping_pager_dto_t {
    int total; //numeric
    int from; //numeric
    int to; //numeric
    int current_page; //numeric
    int pages_count; //numeric
    int page_size; //numeric

} flipping_pager_dto_t;

flipping_pager_dto_t *flipping_pager_dto_create(
    int total,
    int from,
    int to,
    int current_page,
    int pages_count,
    int page_size
);

void flipping_pager_dto_free(flipping_pager_dto_t *flipping_pager_dto);

flipping_pager_dto_t *flipping_pager_dto_parseFromJSON(cJSON *flipping_pager_dtoJSON);

cJSON *flipping_pager_dto_convertToJSON(flipping_pager_dto_t *flipping_pager_dto);

#endif /* _flipping_pager_dto_H_ */

