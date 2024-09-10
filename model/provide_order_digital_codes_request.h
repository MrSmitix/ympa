/*
 * provide_order_digital_codes_request.h
 *
 * Запрос на передачу ключей цифровых товаров.
 */

#ifndef _provide_order_digital_codes_request_H_
#define _provide_order_digital_codes_request_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct provide_order_digital_codes_request_t provide_order_digital_codes_request_t;

#include "order_digital_item_dto.h"



typedef struct provide_order_digital_codes_request_t {
    list_t *items; //nonprimitive container

} provide_order_digital_codes_request_t;

provide_order_digital_codes_request_t *provide_order_digital_codes_request_create(
    list_t *items
);

void provide_order_digital_codes_request_free(provide_order_digital_codes_request_t *provide_order_digital_codes_request);

provide_order_digital_codes_request_t *provide_order_digital_codes_request_parseFromJSON(cJSON *provide_order_digital_codes_requestJSON);

cJSON *provide_order_digital_codes_request_convertToJSON(provide_order_digital_codes_request_t *provide_order_digital_codes_request);

#endif /* _provide_order_digital_codes_request_H_ */

