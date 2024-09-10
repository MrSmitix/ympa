/*
 * offer_mapping_entries_dto.h
 *
 * Информация о товарах в каталоге.
 */

#ifndef _offer_mapping_entries_dto_H_
#define _offer_mapping_entries_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct offer_mapping_entries_dto_t offer_mapping_entries_dto_t;

#include "offer_mapping_entry_dto.h"
#include "scrolling_pager_dto.h"



typedef struct offer_mapping_entries_dto_t {
    struct scrolling_pager_dto_t *paging; //model
    list_t *offer_mapping_entries; //nonprimitive container

} offer_mapping_entries_dto_t;

offer_mapping_entries_dto_t *offer_mapping_entries_dto_create(
    scrolling_pager_dto_t *paging,
    list_t *offer_mapping_entries
);

void offer_mapping_entries_dto_free(offer_mapping_entries_dto_t *offer_mapping_entries_dto);

offer_mapping_entries_dto_t *offer_mapping_entries_dto_parseFromJSON(cJSON *offer_mapping_entries_dtoJSON);

cJSON *offer_mapping_entries_dto_convertToJSON(offer_mapping_entries_dto_t *offer_mapping_entries_dto);

#endif /* _offer_mapping_entries_dto_H_ */

