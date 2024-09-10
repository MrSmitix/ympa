/*
 * update_promo_offer_discount_params_dto.h
 *
 * Параметры товара в акции с типом &#x60;DIRECT_DISCOUNT&#x60; или &#x60;BLUE_FLASH&#x60;.  Обязательный параметр для акций с этими типами. 
 */

#ifndef _update_promo_offer_discount_params_dto_H_
#define _update_promo_offer_discount_params_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct update_promo_offer_discount_params_dto_t update_promo_offer_discount_params_dto_t;




typedef struct update_promo_offer_discount_params_dto_t {
    long price; //numeric
    long promo_price; //numeric

} update_promo_offer_discount_params_dto_t;

update_promo_offer_discount_params_dto_t *update_promo_offer_discount_params_dto_create(
    long price,
    long promo_price
);

void update_promo_offer_discount_params_dto_free(update_promo_offer_discount_params_dto_t *update_promo_offer_discount_params_dto);

update_promo_offer_discount_params_dto_t *update_promo_offer_discount_params_dto_parseFromJSON(cJSON *update_promo_offer_discount_params_dtoJSON);

cJSON *update_promo_offer_discount_params_dto_convertToJSON(update_promo_offer_discount_params_dto_t *update_promo_offer_discount_params_dto);

#endif /* _update_promo_offer_discount_params_dto_H_ */

