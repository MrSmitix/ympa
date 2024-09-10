/*
 * warehouse_offers_dto.h
 *
 * Информация об остатках товаров на складе.
 */

#ifndef _warehouse_offers_dto_H_
#define _warehouse_offers_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct warehouse_offers_dto_t warehouse_offers_dto_t;

#include "warehouse_offer_dto.h"



typedef struct warehouse_offers_dto_t {
    long warehouse_id; //numeric
    list_t *offers; //nonprimitive container

} warehouse_offers_dto_t;

warehouse_offers_dto_t *warehouse_offers_dto_create(
    long warehouse_id,
    list_t *offers
);

void warehouse_offers_dto_free(warehouse_offers_dto_t *warehouse_offers_dto);

warehouse_offers_dto_t *warehouse_offers_dto_parseFromJSON(cJSON *warehouse_offers_dtoJSON);

cJSON *warehouse_offers_dto_convertToJSON(warehouse_offers_dto_t *warehouse_offers_dto);

#endif /* _warehouse_offers_dto_H_ */

