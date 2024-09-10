/*
 * get_quarantine_offers_request.h
 *
 * Фильтрации товаров  В запросе можно указать либо фильтр offerIds, либо любые другие фильтры товаров. Совместное использование фильтра offerIds с другими фильтрациями приведет к ошибке. 
 */

#ifndef _get_quarantine_offers_request_H_
#define _get_quarantine_offers_request_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct get_quarantine_offers_request_t get_quarantine_offers_request_t;

#include "offer_card_status_type.h"

// Enum  for get_quarantine_offers_request

typedef enum  { _api__get_quarantine_offers_request__NULL = 0, _api__get_quarantine_offers_request__HAS_CARD_CAN_NOT_UPDATE, _api__get_quarantine_offers_request__HAS_CARD_CAN_UPDATE, _api__get_quarantine_offers_request__HAS_CARD_CAN_UPDATE_ERRORS, _api__get_quarantine_offers_request__HAS_CARD_CAN_UPDATE_PROCESSING, _api__get_quarantine_offers_request__NO_CARD_NEED_CONTENT, _api__get_quarantine_offers_request__NO_CARD_MARKET_WILL_CREATE, _api__get_quarantine_offers_request__NO_CARD_ERRORS, _api__get_quarantine_offers_request__NO_CARD_PROCESSING, _api__get_quarantine_offers_request__NO_CARD_ADD_TO_CAMPAIGN } _api__get_quarantine_offers_request__e;

char* get_quarantine_offers_request_card_statuses_ToString(_api__get_quarantine_offers_request__e card_statuses);

_api__get_quarantine_offers_request__e get_quarantine_offers_request_card_statuses_FromString(char* card_statuses);



typedef struct get_quarantine_offers_request_t {
    list_t *offer_ids; //primitive container
    list_t *card_statuses; //nonprimitive container
    list_t *category_ids; //primitive container
    list_t *vendor_names; //primitive container
    list_t *tags; //primitive container

} get_quarantine_offers_request_t;

get_quarantine_offers_request_t *get_quarantine_offers_request_create(
    list_t *offer_ids,
    list_t *card_statuses,
    list_t *category_ids,
    list_t *vendor_names,
    list_t *tags
);

void get_quarantine_offers_request_free(get_quarantine_offers_request_t *get_quarantine_offers_request);

get_quarantine_offers_request_t *get_quarantine_offers_request_parseFromJSON(cJSON *get_quarantine_offers_requestJSON);

cJSON *get_quarantine_offers_request_convertToJSON(get_quarantine_offers_request_t *get_quarantine_offers_request);

#endif /* _get_quarantine_offers_request_H_ */

