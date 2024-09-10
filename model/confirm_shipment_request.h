/*
 * confirm_shipment_request.h
 *
 * Запрос для подтверждения отгрузки.
 */

#ifndef _confirm_shipment_request_H_
#define _confirm_shipment_request_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct confirm_shipment_request_t confirm_shipment_request_t;




typedef struct confirm_shipment_request_t {
    char *external_shipment_id; // string

} confirm_shipment_request_t;

confirm_shipment_request_t *confirm_shipment_request_create(
    char *external_shipment_id
);

void confirm_shipment_request_free(confirm_shipment_request_t *confirm_shipment_request);

confirm_shipment_request_t *confirm_shipment_request_parseFromJSON(cJSON *confirm_shipment_requestJSON);

cJSON *confirm_shipment_request_convertToJSON(confirm_shipment_request_t *confirm_shipment_request);

#endif /* _confirm_shipment_request_H_ */

