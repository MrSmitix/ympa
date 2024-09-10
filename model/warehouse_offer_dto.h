/*
 * warehouse_offer_dto.h
 *
 * Информация об остатках товара.
 */

#ifndef _warehouse_offer_dto_H_
#define _warehouse_offer_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct warehouse_offer_dto_t warehouse_offer_dto_t;

#include "turnover_dto.h"
#include "warehouse_stock_dto.h"



typedef struct warehouse_offer_dto_t {
    char *offer_id; // string
    struct turnover_dto_t *turnover_summary; //model
    list_t *stocks; //nonprimitive container
    char *updated_at; //date time

} warehouse_offer_dto_t;

warehouse_offer_dto_t *warehouse_offer_dto_create(
    char *offer_id,
    turnover_dto_t *turnover_summary,
    list_t *stocks,
    char *updated_at
);

void warehouse_offer_dto_free(warehouse_offer_dto_t *warehouse_offer_dto);

warehouse_offer_dto_t *warehouse_offer_dto_parseFromJSON(cJSON *warehouse_offer_dtoJSON);

cJSON *warehouse_offer_dto_convertToJSON(warehouse_offer_dto_t *warehouse_offer_dto);

#endif /* _warehouse_offer_dto_H_ */

