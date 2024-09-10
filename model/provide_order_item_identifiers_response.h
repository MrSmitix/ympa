/*
 * provide_order_item_identifiers_response.h
 *
 * 
 */

#ifndef _provide_order_item_identifiers_response_H_
#define _provide_order_item_identifiers_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct provide_order_item_identifiers_response_t provide_order_item_identifiers_response_t;

#include "api_response_status_type.h"
#include "order_items_modification_result_dto.h"

// Enum  for provide_order_item_identifiers_response

typedef enum  { _api__provide_order_item_identifiers_response__NULL = 0, _api__provide_order_item_identifiers_response__OK, _api__provide_order_item_identifiers_response__ERROR } _api__provide_order_item_identifiers_response__e;

char* provide_order_item_identifiers_response_status_ToString(_api__provide_order_item_identifiers_response__e status);

_api__provide_order_item_identifiers_response__e provide_order_item_identifiers_response_status_FromString(char* status);



typedef struct provide_order_item_identifiers_response_t {
    api_response_status_type_t *status; // custom
    struct order_items_modification_result_dto_t *result; //model

} provide_order_item_identifiers_response_t;

provide_order_item_identifiers_response_t *provide_order_item_identifiers_response_create(
    api_response_status_type_t *status,
    order_items_modification_result_dto_t *result
);

void provide_order_item_identifiers_response_free(provide_order_item_identifiers_response_t *provide_order_item_identifiers_response);

provide_order_item_identifiers_response_t *provide_order_item_identifiers_response_parseFromJSON(cJSON *provide_order_item_identifiers_responseJSON);

cJSON *provide_order_item_identifiers_response_convertToJSON(provide_order_item_identifiers_response_t *provide_order_item_identifiers_response);

#endif /* _provide_order_item_identifiers_response_H_ */

