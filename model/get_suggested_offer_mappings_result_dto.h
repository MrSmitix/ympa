/*
 * get_suggested_offer_mappings_result_dto.h
 *
 * Подобранные карточки на Маркете.
 */

#ifndef _get_suggested_offer_mappings_result_dto_H_
#define _get_suggested_offer_mappings_result_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct get_suggested_offer_mappings_result_dto_t get_suggested_offer_mappings_result_dto_t;

#include "suggested_offer_mapping_dto.h"



typedef struct get_suggested_offer_mappings_result_dto_t {
    list_t *offers; //nonprimitive container

} get_suggested_offer_mappings_result_dto_t;

get_suggested_offer_mappings_result_dto_t *get_suggested_offer_mappings_result_dto_create(
    list_t *offers
);

void get_suggested_offer_mappings_result_dto_free(get_suggested_offer_mappings_result_dto_t *get_suggested_offer_mappings_result_dto);

get_suggested_offer_mappings_result_dto_t *get_suggested_offer_mappings_result_dto_parseFromJSON(cJSON *get_suggested_offer_mappings_result_dtoJSON);

cJSON *get_suggested_offer_mappings_result_dto_convertToJSON(get_suggested_offer_mappings_result_dto_t *get_suggested_offer_mappings_result_dto);

#endif /* _get_suggested_offer_mappings_result_dto_H_ */

