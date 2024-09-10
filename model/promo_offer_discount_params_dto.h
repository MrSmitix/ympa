/*
 * promo_offer_discount_params_dto.h
 *
 * Параметры товара в акции с типом &#x60;DIRECT_DISCOUNT&#x60; или &#x60;BLUE_FLASH&#x60;.
 */

#ifndef _promo_offer_discount_params_dto_H_
#define _promo_offer_discount_params_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct promo_offer_discount_params_dto_t promo_offer_discount_params_dto_t;




typedef struct promo_offer_discount_params_dto_t {
    long price; //numeric
    long promo_price; //numeric
    long max_promo_price; //numeric

} promo_offer_discount_params_dto_t;

promo_offer_discount_params_dto_t *promo_offer_discount_params_dto_create(
    long price,
    long promo_price,
    long max_promo_price
);

void promo_offer_discount_params_dto_free(promo_offer_discount_params_dto_t *promo_offer_discount_params_dto);

promo_offer_discount_params_dto_t *promo_offer_discount_params_dto_parseFromJSON(cJSON *promo_offer_discount_params_dtoJSON);

cJSON *promo_offer_discount_params_dto_convertToJSON(promo_offer_discount_params_dto_t *promo_offer_discount_params_dto);

#endif /* _promo_offer_discount_params_dto_H_ */

