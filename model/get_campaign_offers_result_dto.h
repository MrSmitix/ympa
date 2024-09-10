/*
 * get_campaign_offers_result_dto.h
 *
 * Список товаров в заданном магазине.
 */

#ifndef _get_campaign_offers_result_dto_H_
#define _get_campaign_offers_result_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct get_campaign_offers_result_dto_t get_campaign_offers_result_dto_t;

#include "get_campaign_offer_dto.h"
#include "scrolling_pager_dto.h"



typedef struct get_campaign_offers_result_dto_t {
    struct scrolling_pager_dto_t *paging; //model
    list_t *offers; //nonprimitive container

} get_campaign_offers_result_dto_t;

get_campaign_offers_result_dto_t *get_campaign_offers_result_dto_create(
    scrolling_pager_dto_t *paging,
    list_t *offers
);

void get_campaign_offers_result_dto_free(get_campaign_offers_result_dto_t *get_campaign_offers_result_dto);

get_campaign_offers_result_dto_t *get_campaign_offers_result_dto_parseFromJSON(cJSON *get_campaign_offers_result_dtoJSON);

cJSON *get_campaign_offers_result_dto_convertToJSON(get_campaign_offers_result_dto_t *get_campaign_offers_result_dto);

#endif /* _get_campaign_offers_result_dto_H_ */

