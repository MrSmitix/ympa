/*
 * update_order_storage_limit_request.h
 *
 * Запрос на обновление срока хранения заказа в ПВЗ.
 */

#ifndef _update_order_storage_limit_request_H_
#define _update_order_storage_limit_request_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct update_order_storage_limit_request_t update_order_storage_limit_request_t;




typedef struct update_order_storage_limit_request_t {
    char *new_date; //date

} update_order_storage_limit_request_t;

update_order_storage_limit_request_t *update_order_storage_limit_request_create(
    char *new_date
);

void update_order_storage_limit_request_free(update_order_storage_limit_request_t *update_order_storage_limit_request);

update_order_storage_limit_request_t *update_order_storage_limit_request_parseFromJSON(cJSON *update_order_storage_limit_requestJSON);

cJSON *update_order_storage_limit_request_convertToJSON(update_order_storage_limit_request_t *update_order_storage_limit_request);

#endif /* _update_order_storage_limit_request_H_ */

