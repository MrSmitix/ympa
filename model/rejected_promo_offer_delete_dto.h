/*
 * rejected_promo_offer_delete_dto.h
 *
 * Информация о товаре и ошибки, которые появились при его удалении.
 */

#ifndef _rejected_promo_offer_delete_dto_H_
#define _rejected_promo_offer_delete_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct rejected_promo_offer_delete_dto_t rejected_promo_offer_delete_dto_t;

#include "rejected_promo_offer_delete_reason_type.h"

// Enum  for rejected_promo_offer_delete_dto

typedef enum  { _api__rejected_promo_offer_delete_dto__NULL = 0, _api__rejected_promo_offer_delete_dto__OFFER_DOES_NOT_EXIST } _api__rejected_promo_offer_delete_dto__e;

char* rejected_promo_offer_delete_dto_reason_ToString(_api__rejected_promo_offer_delete_dto__e reason);

_api__rejected_promo_offer_delete_dto__e rejected_promo_offer_delete_dto_reason_FromString(char* reason);



typedef struct rejected_promo_offer_delete_dto_t {
    char *offer_id; // string
    rejected_promo_offer_delete_reason_type_t *reason; // custom

} rejected_promo_offer_delete_dto_t;

rejected_promo_offer_delete_dto_t *rejected_promo_offer_delete_dto_create(
    char *offer_id,
    rejected_promo_offer_delete_reason_type_t *reason
);

void rejected_promo_offer_delete_dto_free(rejected_promo_offer_delete_dto_t *rejected_promo_offer_delete_dto);

rejected_promo_offer_delete_dto_t *rejected_promo_offer_delete_dto_parseFromJSON(cJSON *rejected_promo_offer_delete_dtoJSON);

cJSON *rejected_promo_offer_delete_dto_convertToJSON(rejected_promo_offer_delete_dto_t *rejected_promo_offer_delete_dto);

#endif /* _rejected_promo_offer_delete_dto_H_ */

