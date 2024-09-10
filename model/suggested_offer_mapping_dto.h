/*
 * suggested_offer_mapping_dto.h
 *
 * Товар с соответствующей карточкой на Маркете.
 */

#ifndef _suggested_offer_mapping_dto_H_
#define _suggested_offer_mapping_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct suggested_offer_mapping_dto_t suggested_offer_mapping_dto_t;

#include "get_mapping_dto.h"
#include "suggested_offer_dto.h"



typedef struct suggested_offer_mapping_dto_t {
    struct suggested_offer_dto_t *offer; //model
    struct get_mapping_dto_t *mapping; //model

} suggested_offer_mapping_dto_t;

suggested_offer_mapping_dto_t *suggested_offer_mapping_dto_create(
    suggested_offer_dto_t *offer,
    get_mapping_dto_t *mapping
);

void suggested_offer_mapping_dto_free(suggested_offer_mapping_dto_t *suggested_offer_mapping_dto);

suggested_offer_mapping_dto_t *suggested_offer_mapping_dto_parseFromJSON(cJSON *suggested_offer_mapping_dtoJSON);

cJSON *suggested_offer_mapping_dto_convertToJSON(suggested_offer_mapping_dto_t *suggested_offer_mapping_dto);

#endif /* _suggested_offer_mapping_dto_H_ */

