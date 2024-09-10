/*
 * offer_campaign_status_dto.h
 *
 * Статус товара в магазине.
 */

#ifndef _offer_campaign_status_dto_H_
#define _offer_campaign_status_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct offer_campaign_status_dto_t offer_campaign_status_dto_t;

#include "offer_campaign_status_type.h"

// Enum  for offer_campaign_status_dto

typedef enum  { _api__offer_campaign_status_dto__NULL = 0, _api__offer_campaign_status_dto__PUBLISHED, _api__offer_campaign_status_dto__CHECKING, _api__offer_campaign_status_dto__DISABLED_BY_PARTNER, _api__offer_campaign_status_dto__DISABLED_AUTOMATICALLY, _api__offer_campaign_status_dto__REJECTED_BY_MARKET, _api__offer_campaign_status_dto__CREATING_CARD, _api__offer_campaign_status_dto__NO_CARD, _api__offer_campaign_status_dto__NO_STOCKS, _api__offer_campaign_status_dto__ARCHIVED } _api__offer_campaign_status_dto__e;

char* offer_campaign_status_dto_status_ToString(_api__offer_campaign_status_dto__e status);

_api__offer_campaign_status_dto__e offer_campaign_status_dto_status_FromString(char* status);



typedef struct offer_campaign_status_dto_t {
    long campaign_id; //numeric
    offer_campaign_status_type_t *status; // custom

} offer_campaign_status_dto_t;

offer_campaign_status_dto_t *offer_campaign_status_dto_create(
    long campaign_id,
    offer_campaign_status_type_t *status
);

void offer_campaign_status_dto_free(offer_campaign_status_dto_t *offer_campaign_status_dto);

offer_campaign_status_dto_t *offer_campaign_status_dto_parseFromJSON(cJSON *offer_campaign_status_dtoJSON);

cJSON *offer_campaign_status_dto_convertToJSON(offer_campaign_status_dto_t *offer_campaign_status_dto);

#endif /* _offer_campaign_status_dto_H_ */

