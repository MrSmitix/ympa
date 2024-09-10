/*
 * offer_cards_content_status_dto.h
 *
 * Список товаров с информацией о состоянии карточек.
 */

#ifndef _offer_cards_content_status_dto_H_
#define _offer_cards_content_status_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct offer_cards_content_status_dto_t offer_cards_content_status_dto_t;

#include "forward_scrolling_pager_dto.h"
#include "offer_card_dto.h"



typedef struct offer_cards_content_status_dto_t {
    list_t *offer_cards; //nonprimitive container
    struct forward_scrolling_pager_dto_t *paging; //model

} offer_cards_content_status_dto_t;

offer_cards_content_status_dto_t *offer_cards_content_status_dto_create(
    list_t *offer_cards,
    forward_scrolling_pager_dto_t *paging
);

void offer_cards_content_status_dto_free(offer_cards_content_status_dto_t *offer_cards_content_status_dto);

offer_cards_content_status_dto_t *offer_cards_content_status_dto_parseFromJSON(cJSON *offer_cards_content_status_dtoJSON);

cJSON *offer_cards_content_status_dto_convertToJSON(offer_cards_content_status_dto_t *offer_cards_content_status_dto);

#endif /* _offer_cards_content_status_dto_H_ */

