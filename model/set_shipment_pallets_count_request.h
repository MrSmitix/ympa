/*
 * set_shipment_pallets_count_request.h
 *
 * Запрос на передачу количества упаковок в отгрузке.
 */

#ifndef _set_shipment_pallets_count_request_H_
#define _set_shipment_pallets_count_request_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct set_shipment_pallets_count_request_t set_shipment_pallets_count_request_t;




typedef struct set_shipment_pallets_count_request_t {
    int places_count; //numeric

} set_shipment_pallets_count_request_t;

set_shipment_pallets_count_request_t *set_shipment_pallets_count_request_create(
    int places_count
);

void set_shipment_pallets_count_request_free(set_shipment_pallets_count_request_t *set_shipment_pallets_count_request);

set_shipment_pallets_count_request_t *set_shipment_pallets_count_request_parseFromJSON(cJSON *set_shipment_pallets_count_requestJSON);

cJSON *set_shipment_pallets_count_request_convertToJSON(set_shipment_pallets_count_request_t *set_shipment_pallets_count_request);

#endif /* _set_shipment_pallets_count_request_H_ */

