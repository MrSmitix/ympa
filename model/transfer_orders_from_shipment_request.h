/*
 * transfer_orders_from_shipment_request.h
 *
 * Запрос переноса заказов из отгрузки.
 */

#ifndef _transfer_orders_from_shipment_request_H_
#define _transfer_orders_from_shipment_request_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct transfer_orders_from_shipment_request_t transfer_orders_from_shipment_request_t;




typedef struct transfer_orders_from_shipment_request_t {
    list_t *order_ids; //primitive container

} transfer_orders_from_shipment_request_t;

transfer_orders_from_shipment_request_t *transfer_orders_from_shipment_request_create(
    list_t *order_ids
);

void transfer_orders_from_shipment_request_free(transfer_orders_from_shipment_request_t *transfer_orders_from_shipment_request);

transfer_orders_from_shipment_request_t *transfer_orders_from_shipment_request_parseFromJSON(cJSON *transfer_orders_from_shipment_requestJSON);

cJSON *transfer_orders_from_shipment_request_convertToJSON(transfer_orders_from_shipment_request_t *transfer_orders_from_shipment_request);

#endif /* _transfer_orders_from_shipment_request_H_ */

