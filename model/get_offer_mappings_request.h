/*
 * get_offer_mappings_request.h
 *
 * 
 */

#ifndef _get_offer_mappings_request_H_
#define _get_offer_mappings_request_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct get_offer_mappings_request_t get_offer_mappings_request_t;

#include "offer_card_status_type.h"

// Enum  for get_offer_mappings_request

typedef enum  { _api__get_offer_mappings_request__NULL = 0, _api__get_offer_mappings_request__HAS_CARD_CAN_NOT_UPDATE, _api__get_offer_mappings_request__HAS_CARD_CAN_UPDATE, _api__get_offer_mappings_request__HAS_CARD_CAN_UPDATE_ERRORS, _api__get_offer_mappings_request__HAS_CARD_CAN_UPDATE_PROCESSING, _api__get_offer_mappings_request__NO_CARD_NEED_CONTENT, _api__get_offer_mappings_request__NO_CARD_MARKET_WILL_CREATE, _api__get_offer_mappings_request__NO_CARD_ERRORS, _api__get_offer_mappings_request__NO_CARD_PROCESSING, _api__get_offer_mappings_request__NO_CARD_ADD_TO_CAMPAIGN } _api__get_offer_mappings_request__e;

char* get_offer_mappings_request_card_statuses_ToString(_api__get_offer_mappings_request__e card_statuses);

_api__get_offer_mappings_request__e get_offer_mappings_request_card_statuses_FromString(char* card_statuses);



typedef struct get_offer_mappings_request_t {
    list_t *offer_ids; //primitive container
    list_t *card_statuses; //nonprimitive container
    list_t *category_ids; //primitive container
    list_t *vendor_names; //primitive container
    list_t *tags; //primitive container
    int archived; //boolean

} get_offer_mappings_request_t;

get_offer_mappings_request_t *get_offer_mappings_request_create(
    list_t *offer_ids,
    list_t *card_statuses,
    list_t *category_ids,
    list_t *vendor_names,
    list_t *tags,
    int archived
);

void get_offer_mappings_request_free(get_offer_mappings_request_t *get_offer_mappings_request);

get_offer_mappings_request_t *get_offer_mappings_request_parseFromJSON(cJSON *get_offer_mappings_requestJSON);

cJSON *get_offer_mappings_request_convertToJSON(get_offer_mappings_request_t *get_offer_mappings_request);

#endif /* _get_offer_mappings_request_H_ */

