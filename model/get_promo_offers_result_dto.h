/*
 * get_promo_offers_result_dto.h
 *
 * Список товаров, которые участвуют или могут участвовать в акции.
 */

#ifndef _get_promo_offers_result_dto_H_
#define _get_promo_offers_result_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct get_promo_offers_result_dto_t get_promo_offers_result_dto_t;

#include "forward_scrolling_pager_dto.h"
#include "get_promo_offer_dto.h"



typedef struct get_promo_offers_result_dto_t {
    list_t *offers; //nonprimitive container
    struct forward_scrolling_pager_dto_t *paging; //model

} get_promo_offers_result_dto_t;

get_promo_offers_result_dto_t *get_promo_offers_result_dto_create(
    list_t *offers,
    forward_scrolling_pager_dto_t *paging
);

void get_promo_offers_result_dto_free(get_promo_offers_result_dto_t *get_promo_offers_result_dto);

get_promo_offers_result_dto_t *get_promo_offers_result_dto_parseFromJSON(cJSON *get_promo_offers_result_dtoJSON);

cJSON *get_promo_offers_result_dto_convertToJSON(get_promo_offers_result_dto_t *get_promo_offers_result_dto);

#endif /* _get_promo_offers_result_dto_H_ */

