/*
 * get_offer_mapping_dto.h
 *
 * Информация о товаре.
 */

#ifndef _get_offer_mapping_dto_H_
#define _get_offer_mapping_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct get_offer_mapping_dto_t get_offer_mapping_dto_t;

#include "get_mapping_dto.h"
#include "get_offer_dto.h"



typedef struct get_offer_mapping_dto_t {
    struct get_offer_dto_t *offer; //model
    struct get_mapping_dto_t *mapping; //model

} get_offer_mapping_dto_t;

get_offer_mapping_dto_t *get_offer_mapping_dto_create(
    get_offer_dto_t *offer,
    get_mapping_dto_t *mapping
);

void get_offer_mapping_dto_free(get_offer_mapping_dto_t *get_offer_mapping_dto);

get_offer_mapping_dto_t *get_offer_mapping_dto_parseFromJSON(cJSON *get_offer_mapping_dtoJSON);

cJSON *get_offer_mapping_dto_convertToJSON(get_offer_mapping_dto_t *get_offer_mapping_dto);

#endif /* _get_offer_mapping_dto_H_ */

