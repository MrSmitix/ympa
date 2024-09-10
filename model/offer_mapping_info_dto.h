/*
 * offer_mapping_info_dto.h
 *
 * Информация о карточке товара.
 */

#ifndef _offer_mapping_info_dto_H_
#define _offer_mapping_info_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct offer_mapping_info_dto_t offer_mapping_info_dto_t;

#include "offer_mapping_dto.h"



typedef struct offer_mapping_info_dto_t {
    struct offer_mapping_dto_t *mapping; //model
    struct offer_mapping_dto_t *awaiting_moderation_mapping; //model
    struct offer_mapping_dto_t *rejected_mapping; //model

} offer_mapping_info_dto_t;

offer_mapping_info_dto_t *offer_mapping_info_dto_create(
    offer_mapping_dto_t *mapping,
    offer_mapping_dto_t *awaiting_moderation_mapping,
    offer_mapping_dto_t *rejected_mapping
);

void offer_mapping_info_dto_free(offer_mapping_info_dto_t *offer_mapping_info_dto);

offer_mapping_info_dto_t *offer_mapping_info_dto_parseFromJSON(cJSON *offer_mapping_info_dtoJSON);

cJSON *offer_mapping_info_dto_convertToJSON(offer_mapping_info_dto_t *offer_mapping_info_dto);

#endif /* _offer_mapping_info_dto_H_ */

