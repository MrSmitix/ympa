/*
 * offer_mapping_suggestions_list_dto.h
 *
 * Список рекомендованных карточек товара.
 */

#ifndef _offer_mapping_suggestions_list_dto_H_
#define _offer_mapping_suggestions_list_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct offer_mapping_suggestions_list_dto_t offer_mapping_suggestions_list_dto_t;

#include "enriched_mappings_offer_dto.h"



typedef struct offer_mapping_suggestions_list_dto_t {
    list_t *offers; //nonprimitive container

} offer_mapping_suggestions_list_dto_t;

offer_mapping_suggestions_list_dto_t *offer_mapping_suggestions_list_dto_create(
    list_t *offers
);

void offer_mapping_suggestions_list_dto_free(offer_mapping_suggestions_list_dto_t *offer_mapping_suggestions_list_dto);

offer_mapping_suggestions_list_dto_t *offer_mapping_suggestions_list_dto_parseFromJSON(cJSON *offer_mapping_suggestions_list_dtoJSON);

cJSON *offer_mapping_suggestions_list_dto_convertToJSON(offer_mapping_suggestions_list_dto_t *offer_mapping_suggestions_list_dto);

#endif /* _offer_mapping_suggestions_list_dto_H_ */

