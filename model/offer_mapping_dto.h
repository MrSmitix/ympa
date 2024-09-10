/*
 * offer_mapping_dto.h
 *
 * Информация о текущей карточке товара на Маркете.
 */

#ifndef _offer_mapping_dto_H_
#define _offer_mapping_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct offer_mapping_dto_t offer_mapping_dto_t;




typedef struct offer_mapping_dto_t {
    long market_sku; //numeric
    long model_id; //numeric
    long category_id; //numeric

} offer_mapping_dto_t;

offer_mapping_dto_t *offer_mapping_dto_create(
    long market_sku,
    long model_id,
    long category_id
);

void offer_mapping_dto_free(offer_mapping_dto_t *offer_mapping_dto);

offer_mapping_dto_t *offer_mapping_dto_parseFromJSON(cJSON *offer_mapping_dtoJSON);

cJSON *offer_mapping_dto_convertToJSON(offer_mapping_dto_t *offer_mapping_dto);

#endif /* _offer_mapping_dto_H_ */

