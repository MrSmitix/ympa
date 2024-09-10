/*
 * update_promo_offers_result_dto.h
 *
 * Ошибки и предупреждения, которые появились при добавлении товаров в акцию.
 */

#ifndef _update_promo_offers_result_dto_H_
#define _update_promo_offers_result_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct update_promo_offers_result_dto_t update_promo_offers_result_dto_t;

#include "rejected_promo_offer_update_dto.h"
#include "warning_promo_offer_update_dto.h"



typedef struct update_promo_offers_result_dto_t {
    list_t *rejected_offers; //nonprimitive container
    list_t *warning_offers; //nonprimitive container

} update_promo_offers_result_dto_t;

update_promo_offers_result_dto_t *update_promo_offers_result_dto_create(
    list_t *rejected_offers,
    list_t *warning_offers
);

void update_promo_offers_result_dto_free(update_promo_offers_result_dto_t *update_promo_offers_result_dto);

update_promo_offers_result_dto_t *update_promo_offers_result_dto_parseFromJSON(cJSON *update_promo_offers_result_dtoJSON);

cJSON *update_promo_offers_result_dto_convertToJSON(update_promo_offers_result_dto_t *update_promo_offers_result_dto);

#endif /* _update_promo_offers_result_dto_H_ */

