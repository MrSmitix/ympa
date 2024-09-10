/*
 * paged_returns_dto.h
 *
 * Возвраты.
 */

#ifndef _paged_returns_dto_H_
#define _paged_returns_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct paged_returns_dto_t paged_returns_dto_t;

#include "forward_scrolling_pager_dto.h"
#include "return_dto.h"



typedef struct paged_returns_dto_t {
    struct forward_scrolling_pager_dto_t *paging; //model
    list_t *returns; //nonprimitive container

} paged_returns_dto_t;

paged_returns_dto_t *paged_returns_dto_create(
    forward_scrolling_pager_dto_t *paging,
    list_t *returns
);

void paged_returns_dto_free(paged_returns_dto_t *paged_returns_dto);

paged_returns_dto_t *paged_returns_dto_parseFromJSON(cJSON *paged_returns_dtoJSON);

cJSON *paged_returns_dto_convertToJSON(paged_returns_dto_t *paged_returns_dto);

#endif /* _paged_returns_dto_H_ */

