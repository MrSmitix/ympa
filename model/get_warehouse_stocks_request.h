/*
 * get_warehouse_stocks_request.h
 *
 * Фильтры для запроса остатков. 
 */

#ifndef _get_warehouse_stocks_request_H_
#define _get_warehouse_stocks_request_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct get_warehouse_stocks_request_t get_warehouse_stocks_request_t;




typedef struct get_warehouse_stocks_request_t {
    int with_turnover; //boolean
    int archived; //boolean
    list_t *offer_ids; //primitive container

} get_warehouse_stocks_request_t;

get_warehouse_stocks_request_t *get_warehouse_stocks_request_create(
    int with_turnover,
    int archived,
    list_t *offer_ids
);

void get_warehouse_stocks_request_free(get_warehouse_stocks_request_t *get_warehouse_stocks_request);

get_warehouse_stocks_request_t *get_warehouse_stocks_request_parseFromJSON(cJSON *get_warehouse_stocks_requestJSON);

cJSON *get_warehouse_stocks_request_convertToJSON(get_warehouse_stocks_request_t *get_warehouse_stocks_request);

#endif /* _get_warehouse_stocks_request_H_ */

