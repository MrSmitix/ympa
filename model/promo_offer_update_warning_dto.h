/*
 * promo_offer_update_warning_dto.h
 *
 * Предупреждение, которое появилось при добавлении товара в акцию или изменении его цен.
 */

#ifndef _promo_offer_update_warning_dto_H_
#define _promo_offer_update_warning_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct promo_offer_update_warning_dto_t promo_offer_update_warning_dto_t;

#include "promo_offer_update_warning_code_type.h"

// Enum  for promo_offer_update_warning_dto

typedef enum  { _api__promo_offer_update_warning_dto__NULL = 0, _api__promo_offer_update_warning_dto__DEEP_DISCOUNT_OFFER, _api__promo_offer_update_warning_dto__CATALOG_PRICE_IS_LOWER_THAN_PROMO, _api__promo_offer_update_warning_dto__SHOP_PRICES_ARE_LOWER_THAN_PROMO, _api__promo_offer_update_warning_dto__PROMOCODE_PRICE_MORE_THAN_MAX_FAIR_PRICE, _api__promo_offer_update_warning_dto__SHOP_OFFER_NOT_ELIGIBLE_FOR_PROMO } _api__promo_offer_update_warning_dto__e;

char* promo_offer_update_warning_dto_code_ToString(_api__promo_offer_update_warning_dto__e code);

_api__promo_offer_update_warning_dto__e promo_offer_update_warning_dto_code_FromString(char* code);



typedef struct promo_offer_update_warning_dto_t {
    promo_offer_update_warning_code_type_t *code; // custom
    list_t *campaign_ids; //primitive container

} promo_offer_update_warning_dto_t;

promo_offer_update_warning_dto_t *promo_offer_update_warning_dto_create(
    promo_offer_update_warning_code_type_t *code,
    list_t *campaign_ids
);

void promo_offer_update_warning_dto_free(promo_offer_update_warning_dto_t *promo_offer_update_warning_dto);

promo_offer_update_warning_dto_t *promo_offer_update_warning_dto_parseFromJSON(cJSON *promo_offer_update_warning_dtoJSON);

cJSON *promo_offer_update_warning_dto_convertToJSON(promo_offer_update_warning_dto_t *promo_offer_update_warning_dto);

#endif /* _promo_offer_update_warning_dto_H_ */

