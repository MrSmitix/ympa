/*
 * offer_price_list_response_dto.h
 *
 * Список цен на товары.
 */

#ifndef _offer_price_list_response_dto_H_
#define _offer_price_list_response_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct offer_price_list_response_dto_t offer_price_list_response_dto_t;

#include "offer_price_response_dto.h"
#include "scrolling_pager_dto.h"



typedef struct offer_price_list_response_dto_t {
    list_t *offers; //nonprimitive container
    struct scrolling_pager_dto_t *paging; //model
    int total; //numeric

} offer_price_list_response_dto_t;

offer_price_list_response_dto_t *offer_price_list_response_dto_create(
    list_t *offers,
    scrolling_pager_dto_t *paging,
    int total
);

void offer_price_list_response_dto_free(offer_price_list_response_dto_t *offer_price_list_response_dto);

offer_price_list_response_dto_t *offer_price_list_response_dto_parseFromJSON(cJSON *offer_price_list_response_dtoJSON);

cJSON *offer_price_list_response_dto_convertToJSON(offer_price_list_response_dto_t *offer_price_list_response_dto);

#endif /* _offer_price_list_response_dto_H_ */

