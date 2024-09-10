/*
 * get_orders_response.h
 *
 * Модель для ответа API списка информации по заказам.
 */

#ifndef _get_orders_response_H_
#define _get_orders_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct get_orders_response_t get_orders_response_t;

#include "flipping_pager_dto.h"
#include "forward_scrolling_pager_dto.h"
#include "order_dto.h"



typedef struct get_orders_response_t {
    struct flipping_pager_dto_t *pager; //model
    list_t *orders; //nonprimitive container
    struct forward_scrolling_pager_dto_t *paging; //model

} get_orders_response_t;

get_orders_response_t *get_orders_response_create(
    flipping_pager_dto_t *pager,
    list_t *orders,
    forward_scrolling_pager_dto_t *paging
);

void get_orders_response_free(get_orders_response_t *get_orders_response);

get_orders_response_t *get_orders_response_parseFromJSON(cJSON *get_orders_responseJSON);

cJSON *get_orders_response_convertToJSON(get_orders_response_t *get_orders_response);

#endif /* _get_orders_response_H_ */

