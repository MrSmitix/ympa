/*
 * get_campaign_offer_dto.h
 *
 * Параметры размещения товара в магазине.
 */

#ifndef _get_campaign_offer_dto_H_
#define _get_campaign_offer_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct get_campaign_offer_dto_t get_campaign_offer_dto_t;

#include "get_price_with_discount_dto.h"
#include "get_price_with_vat_dto.h"
#include "offer_campaign_status_type.h"
#include "offer_error_dto.h"
#include "quantum_dto.h"

// Enum  for get_campaign_offer_dto

typedef enum  { _api__get_campaign_offer_dto__NULL = 0, _api__get_campaign_offer_dto__PUBLISHED, _api__get_campaign_offer_dto__CHECKING, _api__get_campaign_offer_dto__DISABLED_BY_PARTNER, _api__get_campaign_offer_dto__DISABLED_AUTOMATICALLY, _api__get_campaign_offer_dto__REJECTED_BY_MARKET, _api__get_campaign_offer_dto__CREATING_CARD, _api__get_campaign_offer_dto__NO_CARD, _api__get_campaign_offer_dto__NO_STOCKS, _api__get_campaign_offer_dto__ARCHIVED } _api__get_campaign_offer_dto__e;

char* get_campaign_offer_dto_status_ToString(_api__get_campaign_offer_dto__e status);

_api__get_campaign_offer_dto__e get_campaign_offer_dto_status_FromString(char* status);



typedef struct get_campaign_offer_dto_t {
    char *offer_id; // string
    struct quantum_dto_t *quantum; //model
    int available; //boolean
    struct get_price_with_discount_dto_t *basic_price; //model
    struct get_price_with_vat_dto_t *campaign_price; //model
    offer_campaign_status_type_t *status; // custom
    list_t *errors; //nonprimitive container
    list_t *warnings; //nonprimitive container

} get_campaign_offer_dto_t;

get_campaign_offer_dto_t *get_campaign_offer_dto_create(
    char *offer_id,
    quantum_dto_t *quantum,
    int available,
    get_price_with_discount_dto_t *basic_price,
    get_price_with_vat_dto_t *campaign_price,
    offer_campaign_status_type_t *status,
    list_t *errors,
    list_t *warnings
);

void get_campaign_offer_dto_free(get_campaign_offer_dto_t *get_campaign_offer_dto);

get_campaign_offer_dto_t *get_campaign_offer_dto_parseFromJSON(cJSON *get_campaign_offer_dtoJSON);

cJSON *get_campaign_offer_dto_convertToJSON(get_campaign_offer_dto_t *get_campaign_offer_dto);

#endif /* _get_campaign_offer_dto_H_ */

