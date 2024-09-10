/*
 * get_warehouse_stocks_dto.h
 *
 * Список складов с информацией об остатках на каждом из них.
 */

#ifndef _get_warehouse_stocks_dto_H_
#define _get_warehouse_stocks_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct get_warehouse_stocks_dto_t get_warehouse_stocks_dto_t;

#include "scrolling_pager_dto.h"
#include "warehouse_offers_dto.h"



typedef struct get_warehouse_stocks_dto_t {
    struct scrolling_pager_dto_t *paging; //model
    list_t *warehouses; //nonprimitive container

} get_warehouse_stocks_dto_t;

get_warehouse_stocks_dto_t *get_warehouse_stocks_dto_create(
    scrolling_pager_dto_t *paging,
    list_t *warehouses
);

void get_warehouse_stocks_dto_free(get_warehouse_stocks_dto_t *get_warehouse_stocks_dto);

get_warehouse_stocks_dto_t *get_warehouse_stocks_dto_parseFromJSON(cJSON *get_warehouse_stocks_dtoJSON);

cJSON *get_warehouse_stocks_dto_convertToJSON(get_warehouse_stocks_dto_t *get_warehouse_stocks_dto);

#endif /* _get_warehouse_stocks_dto_H_ */

