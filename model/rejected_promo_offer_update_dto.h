/*
 * rejected_promo_offer_update_dto.h
 *
 * Описание отклоненного изменения.
 */

#ifndef _rejected_promo_offer_update_dto_H_
#define _rejected_promo_offer_update_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct rejected_promo_offer_update_dto_t rejected_promo_offer_update_dto_t;

#include "rejected_promo_offer_update_reason_type.h"

// Enum  for rejected_promo_offer_update_dto

typedef enum  { _api__rejected_promo_offer_update_dto__NULL = 0, _api__rejected_promo_offer_update_dto__OFFER_DOES_NOT_EXIST, _api__rejected_promo_offer_update_dto__OFFER_DUPLICATION, _api__rejected_promo_offer_update_dto__OFFER_NOT_ELIGIBLE_FOR_PROMO, _api__rejected_promo_offer_update_dto__OFFER_PROMOS_MAX_BYTE_SIZE_EXCEEDED, _api__rejected_promo_offer_update_dto__DEADLINE_FOR_FOCUS_PROMOS_EXCEEDED, _api__rejected_promo_offer_update_dto__EMPTY_OLD_PRICE, _api__rejected_promo_offer_update_dto__EMPTY_PROMO_PRICE, _api__rejected_promo_offer_update_dto__MAX_PROMO_PRICE_EXCEEDED, _api__rejected_promo_offer_update_dto__PROMO_PRICE_BIGGER_THAN_MAX, _api__rejected_promo_offer_update_dto__PROMO_PRICE_SMALLER_THAN_MIN } _api__rejected_promo_offer_update_dto__e;

char* rejected_promo_offer_update_dto_reason_ToString(_api__rejected_promo_offer_update_dto__e reason);

_api__rejected_promo_offer_update_dto__e rejected_promo_offer_update_dto_reason_FromString(char* reason);



typedef struct rejected_promo_offer_update_dto_t {
    char *offer_id; // string
    rejected_promo_offer_update_reason_type_t *reason; // custom

} rejected_promo_offer_update_dto_t;

rejected_promo_offer_update_dto_t *rejected_promo_offer_update_dto_create(
    char *offer_id,
    rejected_promo_offer_update_reason_type_t *reason
);

void rejected_promo_offer_update_dto_free(rejected_promo_offer_update_dto_t *rejected_promo_offer_update_dto);

rejected_promo_offer_update_dto_t *rejected_promo_offer_update_dto_parseFromJSON(cJSON *rejected_promo_offer_update_dtoJSON);

cJSON *rejected_promo_offer_update_dto_convertToJSON(rejected_promo_offer_update_dto_t *rejected_promo_offer_update_dto);

#endif /* _rejected_promo_offer_update_dto_H_ */

