/*
 * put_sku_bids_request.h
 *
 * description.
 */

#ifndef _put_sku_bids_request_H_
#define _put_sku_bids_request_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct put_sku_bids_request_t put_sku_bids_request_t;

#include "sku_bid_item_dto.h"



typedef struct put_sku_bids_request_t {
    list_t *bids; //nonprimitive container

} put_sku_bids_request_t;

put_sku_bids_request_t *put_sku_bids_request_create(
    list_t *bids
);

void put_sku_bids_request_free(put_sku_bids_request_t *put_sku_bids_request);

put_sku_bids_request_t *put_sku_bids_request_parseFromJSON(cJSON *put_sku_bids_requestJSON);

cJSON *put_sku_bids_request_convertToJSON(put_sku_bids_request_t *put_sku_bids_request);

#endif /* _put_sku_bids_request_H_ */

