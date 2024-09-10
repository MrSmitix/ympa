/*
 * promo_offer_params_dto.h
 *
 * Параметры товара в акции.  Возвращается параметр, который соответствует типу акции. 
 */

#ifndef _promo_offer_params_dto_H_
#define _promo_offer_params_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct promo_offer_params_dto_t promo_offer_params_dto_t;

#include "promo_offer_discount_params_dto.h"
#include "promo_offer_promocode_params_dto.h"



typedef struct promo_offer_params_dto_t {
    struct promo_offer_discount_params_dto_t *discount_params; //model
    struct promo_offer_promocode_params_dto_t *promocode_params; //model

} promo_offer_params_dto_t;

promo_offer_params_dto_t *promo_offer_params_dto_create(
    promo_offer_discount_params_dto_t *discount_params,
    promo_offer_promocode_params_dto_t *promocode_params
);

void promo_offer_params_dto_free(promo_offer_params_dto_t *promo_offer_params_dto);

promo_offer_params_dto_t *promo_offer_params_dto_parseFromJSON(cJSON *promo_offer_params_dtoJSON);

cJSON *promo_offer_params_dto_convertToJSON(promo_offer_params_dto_t *promo_offer_params_dto);

#endif /* _promo_offer_params_dto_H_ */

