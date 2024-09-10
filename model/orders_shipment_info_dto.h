/*
 * orders_shipment_info_dto.h
 *
 * Годные/негодные ярлыки по заказам в отгрузке.
 */

#ifndef _orders_shipment_info_dto_H_
#define _orders_shipment_info_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct orders_shipment_info_dto_t orders_shipment_info_dto_t;




typedef struct orders_shipment_info_dto_t {
    list_t *order_ids_with_labels; //primitive container
    list_t *order_ids_without_labels; //primitive container

} orders_shipment_info_dto_t;

orders_shipment_info_dto_t *orders_shipment_info_dto_create(
    list_t *order_ids_with_labels,
    list_t *order_ids_without_labels
);

void orders_shipment_info_dto_free(orders_shipment_info_dto_t *orders_shipment_info_dto);

orders_shipment_info_dto_t *orders_shipment_info_dto_parseFromJSON(cJSON *orders_shipment_info_dtoJSON);

cJSON *orders_shipment_info_dto_convertToJSON(orders_shipment_info_dto_t *orders_shipment_info_dto);

#endif /* _orders_shipment_info_dto_H_ */

