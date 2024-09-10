/*
 * outlet_delivery_rule_dto.h
 *
 * Информация об условиях доставки для данной точки продаж.
 */

#ifndef _outlet_delivery_rule_dto_H_
#define _outlet_delivery_rule_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct outlet_delivery_rule_dto_t outlet_delivery_rule_dto_t;




typedef struct outlet_delivery_rule_dto_t {
    int min_delivery_days; //numeric
    int max_delivery_days; //numeric
    long delivery_service_id; //numeric
    int order_before; //numeric
    double price_free_pickup; //numeric
    int unspecified_delivery_interval; //boolean

} outlet_delivery_rule_dto_t;

outlet_delivery_rule_dto_t *outlet_delivery_rule_dto_create(
    int min_delivery_days,
    int max_delivery_days,
    long delivery_service_id,
    int order_before,
    double price_free_pickup,
    int unspecified_delivery_interval
);

void outlet_delivery_rule_dto_free(outlet_delivery_rule_dto_t *outlet_delivery_rule_dto);

outlet_delivery_rule_dto_t *outlet_delivery_rule_dto_parseFromJSON(cJSON *outlet_delivery_rule_dtoJSON);

cJSON *outlet_delivery_rule_dto_convertToJSON(outlet_delivery_rule_dto_t *outlet_delivery_rule_dto);

#endif /* _outlet_delivery_rule_dto_H_ */

