/*
 * quality_rating_affected_order_dto.h
 *
 * Информация о заказе, который повлиял на индекс качества.
 */

#ifndef _quality_rating_affected_order_dto_H_
#define _quality_rating_affected_order_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct quality_rating_affected_order_dto_t quality_rating_affected_order_dto_t;

#include "affected_order_quality_rating_component_type.h"

// Enum  for quality_rating_affected_order_dto

typedef enum  { _api__quality_rating_affected_order_dto__NULL = 0, _api__quality_rating_affected_order_dto__DBS_CANCELLATION_RATE, _api__quality_rating_affected_order_dto__DBS_LATE_DELIVERY_RATE, _api__quality_rating_affected_order_dto__FBS_CANCELLATION_RATE, _api__quality_rating_affected_order_dto__FBS_LATE_SHIP_RATE } _api__quality_rating_affected_order_dto__e;

char* quality_rating_affected_order_dto_component_type_ToString(_api__quality_rating_affected_order_dto__e component_type);

_api__quality_rating_affected_order_dto__e quality_rating_affected_order_dto_component_type_FromString(char* component_type);



typedef struct quality_rating_affected_order_dto_t {
    long order_id; //numeric
    char *description; // string
    affected_order_quality_rating_component_type_t *component_type; // custom

} quality_rating_affected_order_dto_t;

quality_rating_affected_order_dto_t *quality_rating_affected_order_dto_create(
    long order_id,
    char *description,
    affected_order_quality_rating_component_type_t *component_type
);

void quality_rating_affected_order_dto_free(quality_rating_affected_order_dto_t *quality_rating_affected_order_dto);

quality_rating_affected_order_dto_t *quality_rating_affected_order_dto_parseFromJSON(cJSON *quality_rating_affected_order_dtoJSON);

cJSON *quality_rating_affected_order_dto_convertToJSON(quality_rating_affected_order_dto_t *quality_rating_affected_order_dto);

#endif /* _quality_rating_affected_order_dto_H_ */

