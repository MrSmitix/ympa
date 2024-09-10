/*
 * update_promo_offer_dto.h
 *
 * Описание товаров, которые участвуют в акции.
 */

#ifndef _update_promo_offer_dto_H_
#define _update_promo_offer_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct update_promo_offer_dto_t update_promo_offer_dto_t;

#include "update_promo_offer_params_dto.h"



typedef struct update_promo_offer_dto_t {
    char *offer_id; // string
    struct update_promo_offer_params_dto_t *params; //model

} update_promo_offer_dto_t;

update_promo_offer_dto_t *update_promo_offer_dto_create(
    char *offer_id,
    update_promo_offer_params_dto_t *params
);

void update_promo_offer_dto_free(update_promo_offer_dto_t *update_promo_offer_dto);

update_promo_offer_dto_t *update_promo_offer_dto_parseFromJSON(cJSON *update_promo_offer_dtoJSON);

cJSON *update_promo_offer_dto_convertToJSON(update_promo_offer_dto_t *update_promo_offer_dto);

#endif /* _update_promo_offer_dto_H_ */

