/*
 * return_decision_dto.h
 *
 * Решения по возвратам.
 */

#ifndef _return_decision_dto_H_
#define _return_decision_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct return_decision_dto_t return_decision_dto_t;

#include "return_decision_reason_type.h"
#include "return_decision_subreason_type.h"
#include "return_decision_type.h"

// Enum  for return_decision_dto

typedef enum  { _api__return_decision_dto__NULL = 0, _api__return_decision_dto__BAD_QUALITY, _api__return_decision_dto__DOES_NOT_FIT, _api__return_decision_dto__WRONG_ITEM, _api__return_decision_dto__DAMAGE_DELIVERY, _api__return_decision_dto__LOYALTY_FAIL, _api__return_decision_dto__CONTENT_FAIL, _api__return_decision_dto__UNKNOWN } _api__return_decision_dto__e;

char* return_decision_dto_reason_type_ToString(_api__return_decision_dto__e reason_type);

_api__return_decision_dto__e return_decision_dto_reason_type_FromString(char* reason_type);

// Enum  for return_decision_dto

typedef enum  { _api__return_decision_dto__NULL = 0, _api__return_decision_dto__USER_DID_NOT_LIKE, _api__return_decision_dto__USER_CHANGED_MIND, _api__return_decision_dto__DELIVERED_TOO_LONG, _api__return_decision_dto__BAD_PACKAGE, _api__return_decision_dto__DAMAGED, _api__return_decision_dto__NOT_WORKING, _api__return_decision_dto__INCOMPLETENESS, _api__return_decision_dto__WRONG_ITEM, _api__return_decision_dto__WRONG_COLOR, _api__return_decision_dto__DID_NOT_MATCH_DESCRIPTION, _api__return_decision_dto__UNKNOWN } _api__return_decision_dto__e;

char* return_decision_dto_subreason_type_ToString(_api__return_decision_dto__e subreason_type);

_api__return_decision_dto__e return_decision_dto_subreason_type_FromString(char* subreason_type);

// Enum  for return_decision_dto

typedef enum  { _api__return_decision_dto__NULL = 0, _api__return_decision_dto__REFUND_MONEY, _api__return_decision_dto__REFUND_MONEY_INCLUDING_SHIPMENT, _api__return_decision_dto__REPAIR, _api__return_decision_dto__REPLACE, _api__return_decision_dto__SEND_TO_EXAMINATION, _api__return_decision_dto__DECLINE_REFUND, _api__return_decision_dto__OTHER_DECISION, _api__return_decision_dto__UNKNOWN } _api__return_decision_dto__e;

char* return_decision_dto_decision_type_ToString(_api__return_decision_dto__e decision_type);

_api__return_decision_dto__e return_decision_dto_decision_type_FromString(char* decision_type);



typedef struct return_decision_dto_t {
    long return_item_id; //numeric
    int count; //numeric
    char *comment; // string
    return_decision_reason_type_t *reason_type; // custom
    return_decision_subreason_type_t *subreason_type; // custom
    return_decision_type_t *decision_type; // custom
    long refund_amount; //numeric
    long partner_compensation; //numeric
    list_t *images; //primitive container

} return_decision_dto_t;

return_decision_dto_t *return_decision_dto_create(
    long return_item_id,
    int count,
    char *comment,
    return_decision_reason_type_t *reason_type,
    return_decision_subreason_type_t *subreason_type,
    return_decision_type_t *decision_type,
    long refund_amount,
    long partner_compensation,
    list_t *images
);

void return_decision_dto_free(return_decision_dto_t *return_decision_dto);

return_decision_dto_t *return_decision_dto_parseFromJSON(cJSON *return_decision_dtoJSON);

cJSON *return_decision_dto_convertToJSON(return_decision_dto_t *return_decision_dto);

#endif /* _return_decision_dto_H_ */

