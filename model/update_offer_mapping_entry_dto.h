/*
 * update_offer_mapping_entry_dto.h
 *
 * Список товаров.  В теле запроса можно передать от одного до 500 товаров.  Обязательный параметр. 
 */

#ifndef _update_offer_mapping_entry_dto_H_
#define _update_offer_mapping_entry_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct update_offer_mapping_entry_dto_t update_offer_mapping_entry_dto_t;

#include "offer_mapping_dto.h"
#include "update_mappings_offer_dto.h"



typedef struct update_offer_mapping_entry_dto_t {
    struct offer_mapping_dto_t *mapping; //model
    struct offer_mapping_dto_t *awaiting_moderation_mapping; //model
    struct offer_mapping_dto_t *rejected_mapping; //model
    struct update_mappings_offer_dto_t *offer; //model

} update_offer_mapping_entry_dto_t;

update_offer_mapping_entry_dto_t *update_offer_mapping_entry_dto_create(
    offer_mapping_dto_t *mapping,
    offer_mapping_dto_t *awaiting_moderation_mapping,
    offer_mapping_dto_t *rejected_mapping,
    update_mappings_offer_dto_t *offer
);

void update_offer_mapping_entry_dto_free(update_offer_mapping_entry_dto_t *update_offer_mapping_entry_dto);

update_offer_mapping_entry_dto_t *update_offer_mapping_entry_dto_parseFromJSON(cJSON *update_offer_mapping_entry_dtoJSON);

cJSON *update_offer_mapping_entry_dto_convertToJSON(update_offer_mapping_entry_dto_t *update_offer_mapping_entry_dto);

#endif /* _update_offer_mapping_entry_dto_H_ */

