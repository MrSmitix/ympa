/*
 * feedback_order_dto.h
 *
 * Информация о заказе, указанная в отзыве.
 */

#ifndef _feedback_order_dto_H_
#define _feedback_order_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct feedback_order_dto_t feedback_order_dto_t;

#include "feedback_delivery_type.h"

// Enum  for feedback_order_dto

typedef enum  { _api__feedback_order_dto__NULL = 0, _api__feedback_order_dto__DELIVERY, _api__feedback_order_dto__PICKUP, _api__feedback_order_dto__INSTORE } _api__feedback_order_dto__e;

char* feedback_order_dto_delivery_ToString(_api__feedback_order_dto__e delivery);

_api__feedback_order_dto__e feedback_order_dto_delivery_FromString(char* delivery);



typedef struct feedback_order_dto_t {
    char *shop_order_id; // string
    feedback_delivery_type_t *delivery; // custom

} feedback_order_dto_t;

feedback_order_dto_t *feedback_order_dto_create(
    char *shop_order_id,
    feedback_delivery_type_t *delivery
);

void feedback_order_dto_free(feedback_order_dto_t *feedback_order_dto);

feedback_order_dto_t *feedback_order_dto_parseFromJSON(cJSON *feedback_order_dtoJSON);

cJSON *feedback_order_dto_convertToJSON(feedback_order_dto_t *feedback_order_dto);

#endif /* _feedback_order_dto_H_ */

