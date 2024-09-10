/*
 * get_bids_info_response_dto.h
 *
 * Список товаров с указанными ставками.
 */

#ifndef _get_bids_info_response_dto_H_
#define _get_bids_info_response_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct get_bids_info_response_dto_t get_bids_info_response_dto_t;

#include "forward_scrolling_pager_dto.h"
#include "sku_bid_item_dto.h"



typedef struct get_bids_info_response_dto_t {
    list_t *bids; //nonprimitive container
    struct forward_scrolling_pager_dto_t *paging; //model

} get_bids_info_response_dto_t;

get_bids_info_response_dto_t *get_bids_info_response_dto_create(
    list_t *bids,
    forward_scrolling_pager_dto_t *paging
);

void get_bids_info_response_dto_free(get_bids_info_response_dto_t *get_bids_info_response_dto);

get_bids_info_response_dto_t *get_bids_info_response_dto_parseFromJSON(cJSON *get_bids_info_response_dtoJSON);

cJSON *get_bids_info_response_dto_convertToJSON(get_bids_info_response_dto_t *get_bids_info_response_dto);

#endif /* _get_bids_info_response_dto_H_ */

