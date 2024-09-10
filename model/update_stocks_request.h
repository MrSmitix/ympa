/*
 * update_stocks_request.h
 *
 * Запрос на изменение информации по остаткам товаров.
 */

#ifndef _update_stocks_request_H_
#define _update_stocks_request_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct update_stocks_request_t update_stocks_request_t;

#include "update_stock_dto.h"



typedef struct update_stocks_request_t {
    list_t *skus; //nonprimitive container

} update_stocks_request_t;

update_stocks_request_t *update_stocks_request_create(
    list_t *skus
);

void update_stocks_request_free(update_stocks_request_t *update_stocks_request);

update_stocks_request_t *update_stocks_request_parseFromJSON(cJSON *update_stocks_requestJSON);

cJSON *update_stocks_request_convertToJSON(update_stocks_request_t *update_stocks_request);

#endif /* _update_stocks_request_H_ */

