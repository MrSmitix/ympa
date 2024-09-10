/*
 * update_offer_mapping_dto.h
 *
 * Информация о товаре.
 */

#ifndef _update_offer_mapping_dto_H_
#define _update_offer_mapping_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct update_offer_mapping_dto_t update_offer_mapping_dto_t;

#include "update_mapping_dto.h"
#include "update_offer_dto.h"



typedef struct update_offer_mapping_dto_t {
    struct update_offer_dto_t *offer; //model
    struct update_mapping_dto_t *mapping; //model

} update_offer_mapping_dto_t;

update_offer_mapping_dto_t *update_offer_mapping_dto_create(
    update_offer_dto_t *offer,
    update_mapping_dto_t *mapping
);

void update_offer_mapping_dto_free(update_offer_mapping_dto_t *update_offer_mapping_dto);

update_offer_mapping_dto_t *update_offer_mapping_dto_parseFromJSON(cJSON *update_offer_mapping_dtoJSON);

cJSON *update_offer_mapping_dto_convertToJSON(update_offer_mapping_dto_t *update_offer_mapping_dto);

#endif /* _update_offer_mapping_dto_H_ */

