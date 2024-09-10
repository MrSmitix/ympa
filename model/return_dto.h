/*
 * return_dto.h
 *
 * Возврат заказа.
 */

#ifndef _return_dto_H_
#define _return_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct return_dto_t return_dto_t;

#include "logistic_pickup_point_dto.h"
#include "recipient_type.h"
#include "refund_status_type.h"
#include "return_item_dto.h"
#include "return_shipment_status_type.h"
#include "return_type.h"

// Enum  for return_dto

typedef enum  { _api__return_dto__NULL = 0, _api__return_dto__STARTED_BY_USER, _api__return_dto__REFUND_IN_PROGRESS, _api__return_dto__REFUNDED, _api__return_dto__FAILED, _api__return_dto__WAITING_FOR_DECISION, _api__return_dto__DECISION_MADE, _api__return_dto__REFUNDED_WITH_BONUSES, _api__return_dto__REFUNDED_BY_SHOP, _api__return_dto__CANCELLED, _api__return_dto__COMPLETE_WITHOUT_REFUND, _api__return_dto__UNKNOWN } _api__return_dto__e;

char* return_dto_refund_status_ToString(_api__return_dto__e refund_status);

_api__return_dto__e return_dto_refund_status_FromString(char* refund_status);

// Enum  for return_dto

typedef enum  { _api__return_dto__NULL = 0, _api__return_dto__SHOP, _api__return_dto__DELIVERY_SERVICE, _api__return_dto__POST } _api__return_dto__e;

char* return_dto_shipment_recipient_type_ToString(_api__return_dto__e shipment_recipient_type);

_api__return_dto__e return_dto_shipment_recipient_type_FromString(char* shipment_recipient_type);

// Enum  for return_dto

typedef enum  { _api__return_dto__NULL = 0, _api__return_dto__CREATED, _api__return_dto__RECEIVED, _api__return_dto__IN_TRANSIT, _api__return_dto__READY_FOR_PICKUP, _api__return_dto__PICKED, _api__return_dto__LOST, _api__return_dto__EXPIRED, _api__return_dto__CANCELLED, _api__return_dto__FULFILMENT_RECEIVED, _api__return_dto__PREPARED_FOR_UTILIZATION, _api__return_dto__NOT_IN_DEMAND, _api__return_dto__UTILIZED, _api__return_dto__READY_FOR_EXPROPRIATION, _api__return_dto__RECEIVED_FOR_EXPROPRIATION } _api__return_dto__e;

char* return_dto_shipment_status_ToString(_api__return_dto__e shipment_status);

_api__return_dto__e return_dto_shipment_status_FromString(char* shipment_status);

// Enum  for return_dto

typedef enum  { _api__return_dto__NULL = 0, _api__return_dto__UNREDEEMED, _api__return_dto___RETURN } _api__return_dto__e;

char* return_dto_return_type_ToString(_api__return_dto__e return_type);

_api__return_dto__e return_dto_return_type_FromString(char* return_type);



typedef struct return_dto_t {
    long id; //numeric
    long order_id; //numeric
    char *creation_date; //date time
    char *update_date; //date time
    refund_status_type_t *refund_status; // custom
    struct logistic_pickup_point_dto_t *logistic_pickup_point; //model
    recipient_type_t *shipment_recipient_type; // custom
    return_shipment_status_type_t *shipment_status; // custom
    long refund_amount; //numeric
    list_t *items; //nonprimitive container
    return_type_t *return_type; // custom
    int fast_return; //boolean

} return_dto_t;

return_dto_t *return_dto_create(
    long id,
    long order_id,
    char *creation_date,
    char *update_date,
    refund_status_type_t *refund_status,
    logistic_pickup_point_dto_t *logistic_pickup_point,
    recipient_type_t *shipment_recipient_type,
    return_shipment_status_type_t *shipment_status,
    long refund_amount,
    list_t *items,
    return_type_t *return_type,
    int fast_return
);

void return_dto_free(return_dto_t *return_dto);

return_dto_t *return_dto_parseFromJSON(cJSON *return_dtoJSON);

cJSON *return_dto_convertToJSON(return_dto_t *return_dto);

#endif /* _return_dto_H_ */

