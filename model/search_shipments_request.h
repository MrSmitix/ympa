/*
 * search_shipments_request.h
 *
 * Запрос информации об отгрузках.
 */

#ifndef _search_shipments_request_H_
#define _search_shipments_request_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct search_shipments_request_t search_shipments_request_t;

#include "shipment_status_type.h"

// Enum  for search_shipments_request

typedef enum  { _api__search_shipments_request__NULL = 0, _api__search_shipments_request__OUTBOUND_CREATED, _api__search_shipments_request__OUTBOUND_READY_FOR_CONFIRMATION, _api__search_shipments_request__OUTBOUND_CONFIRMED, _api__search_shipments_request__OUTBOUND_SIGNED, _api__search_shipments_request__FINISHED, _api__search_shipments_request__ACCEPTED, _api__search_shipments_request__ACCEPTED_WITH_DISCREPANCIES, _api__search_shipments_request__ERROR } _api__search_shipments_request__e;

char* search_shipments_request_statuses_ToString(_api__search_shipments_request__e statuses);

_api__search_shipments_request__e search_shipments_request_statuses_FromString(char* statuses);



typedef struct search_shipments_request_t {
    char *date_from; //date
    char *date_to; //date
    list_t *statuses; //nonprimitive container
    list_t *order_ids; //primitive container
    int cancelled_orders; //boolean

} search_shipments_request_t;

search_shipments_request_t *search_shipments_request_create(
    char *date_from,
    char *date_to,
    list_t *statuses,
    list_t *order_ids,
    int cancelled_orders
);

void search_shipments_request_free(search_shipments_request_t *search_shipments_request);

search_shipments_request_t *search_shipments_request_parseFromJSON(cJSON *search_shipments_requestJSON);

cJSON *search_shipments_request_convertToJSON(search_shipments_request_t *search_shipments_request);

#endif /* _search_shipments_request_H_ */

