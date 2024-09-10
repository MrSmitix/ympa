/*
 * get_offer_mappings_result_dto.h
 *
 * Информация о товарах.
 */

#ifndef _get_offer_mappings_result_dto_H_
#define _get_offer_mappings_result_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct get_offer_mappings_result_dto_t get_offer_mappings_result_dto_t;

#include "get_offer_mapping_dto.h"
#include "scrolling_pager_dto.h"



typedef struct get_offer_mappings_result_dto_t {
    struct scrolling_pager_dto_t *paging; //model
    list_t *offer_mappings; //nonprimitive container

} get_offer_mappings_result_dto_t;

get_offer_mappings_result_dto_t *get_offer_mappings_result_dto_create(
    scrolling_pager_dto_t *paging,
    list_t *offer_mappings
);

void get_offer_mappings_result_dto_free(get_offer_mappings_result_dto_t *get_offer_mappings_result_dto);

get_offer_mappings_result_dto_t *get_offer_mappings_result_dto_parseFromJSON(cJSON *get_offer_mappings_result_dtoJSON);

cJSON *get_offer_mappings_result_dto_convertToJSON(get_offer_mappings_result_dto_t *get_offer_mappings_result_dto);

#endif /* _get_offer_mappings_result_dto_H_ */

