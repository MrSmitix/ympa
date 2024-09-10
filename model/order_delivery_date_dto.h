/*
 * order_delivery_date_dto.h
 *
 * Информация о новой дате доставки заказа.
 */

#ifndef _order_delivery_date_dto_H_
#define _order_delivery_date_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct order_delivery_date_dto_t order_delivery_date_dto_t;




typedef struct order_delivery_date_dto_t {
    char *to_date; //date

} order_delivery_date_dto_t;

order_delivery_date_dto_t *order_delivery_date_dto_create(
    char *to_date
);

void order_delivery_date_dto_free(order_delivery_date_dto_t *order_delivery_date_dto);

order_delivery_date_dto_t *order_delivery_date_dto_parseFromJSON(cJSON *order_delivery_date_dtoJSON);

cJSON *order_delivery_date_dto_convertToJSON(order_delivery_date_dto_t *order_delivery_date_dto);

#endif /* _order_delivery_date_dto_H_ */

