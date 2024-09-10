/*
 * update_campaign_offers_request.h
 *
 * Запрос на обновление предложений товаров магазина.
 */

#ifndef _update_campaign_offers_request_H_
#define _update_campaign_offers_request_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct update_campaign_offers_request_t update_campaign_offers_request_t;

#include "update_campaign_offer_dto.h"



typedef struct update_campaign_offers_request_t {
    list_t *offers; //nonprimitive container

} update_campaign_offers_request_t;

update_campaign_offers_request_t *update_campaign_offers_request_create(
    list_t *offers
);

void update_campaign_offers_request_free(update_campaign_offers_request_t *update_campaign_offers_request);

update_campaign_offers_request_t *update_campaign_offers_request_parseFromJSON(cJSON *update_campaign_offers_requestJSON);

cJSON *update_campaign_offers_request_convertToJSON(update_campaign_offers_request_t *update_campaign_offers_request);

#endif /* _update_campaign_offers_request_H_ */

