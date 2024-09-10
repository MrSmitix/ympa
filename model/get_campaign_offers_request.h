/*
 * get_campaign_offers_request.h
 *
 * Фильтрации товаров  В запросе можно указать либо фильтр offerIds, либо любые другие фильтры товаров. Совместное использование фильтра offerIds с другими фильтрациями приведет к ошибке. 
 */

#ifndef _get_campaign_offers_request_H_
#define _get_campaign_offers_request_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct get_campaign_offers_request_t get_campaign_offers_request_t;

#include "offer_campaign_status_type.h"

// Enum  for get_campaign_offers_request

typedef enum  { _api__get_campaign_offers_request__NULL = 0, _api__get_campaign_offers_request__PUBLISHED, _api__get_campaign_offers_request__CHECKING, _api__get_campaign_offers_request__DISABLED_BY_PARTNER, _api__get_campaign_offers_request__DISABLED_AUTOMATICALLY, _api__get_campaign_offers_request__REJECTED_BY_MARKET, _api__get_campaign_offers_request__CREATING_CARD, _api__get_campaign_offers_request__NO_CARD, _api__get_campaign_offers_request__NO_STOCKS, _api__get_campaign_offers_request__ARCHIVED } _api__get_campaign_offers_request__e;

char* get_campaign_offers_request_statuses_ToString(_api__get_campaign_offers_request__e statuses);

_api__get_campaign_offers_request__e get_campaign_offers_request_statuses_FromString(char* statuses);



typedef struct get_campaign_offers_request_t {
    list_t *offer_ids; //primitive container
    list_t *statuses; //nonprimitive container
    list_t *category_ids; //primitive container
    list_t *vendor_names; //primitive container
    list_t *tags; //primitive container

} get_campaign_offers_request_t;

get_campaign_offers_request_t *get_campaign_offers_request_create(
    list_t *offer_ids,
    list_t *statuses,
    list_t *category_ids,
    list_t *vendor_names,
    list_t *tags
);

void get_campaign_offers_request_free(get_campaign_offers_request_t *get_campaign_offers_request);

get_campaign_offers_request_t *get_campaign_offers_request_parseFromJSON(cJSON *get_campaign_offers_requestJSON);

cJSON *get_campaign_offers_request_convertToJSON(get_campaign_offers_request_t *get_campaign_offers_request);

#endif /* _get_campaign_offers_request_H_ */

