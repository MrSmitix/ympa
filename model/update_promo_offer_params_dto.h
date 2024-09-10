/*
 * update_promo_offer_params_dto.h
 *
 * Параметры товара, который участвует в акции.
 */

#ifndef _update_promo_offer_params_dto_H_
#define _update_promo_offer_params_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct update_promo_offer_params_dto_t update_promo_offer_params_dto_t;

#include "update_promo_offer_discount_params_dto.h"



typedef struct update_promo_offer_params_dto_t {
    struct update_promo_offer_discount_params_dto_t *discount_params; //model

} update_promo_offer_params_dto_t;

update_promo_offer_params_dto_t *update_promo_offer_params_dto_create(
    update_promo_offer_discount_params_dto_t *discount_params
);

void update_promo_offer_params_dto_free(update_promo_offer_params_dto_t *update_promo_offer_params_dto);

update_promo_offer_params_dto_t *update_promo_offer_params_dto_parseFromJSON(cJSON *update_promo_offer_params_dtoJSON);

cJSON *update_promo_offer_params_dto_convertToJSON(update_promo_offer_params_dto_t *update_promo_offer_params_dto);

#endif /* _update_promo_offer_params_dto_H_ */

