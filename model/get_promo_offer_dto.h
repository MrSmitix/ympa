/*
 * get_promo_offer_dto.h
 *
 * Товар, который участвует или может участвовать в акции.
 */

#ifndef _get_promo_offer_dto_H_
#define _get_promo_offer_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct get_promo_offer_dto_t get_promo_offer_dto_t;

#include "promo_offer_auto_participating_details_dto.h"
#include "promo_offer_params_dto.h"
#include "promo_offer_participation_status_type.h"

// Enum  for get_promo_offer_dto

typedef enum  { _api__get_promo_offer_dto__NULL = 0, _api__get_promo_offer_dto___AUTO, _api__get_promo_offer_dto__PARTIALLY_AUTO, _api__get_promo_offer_dto__MANUAL, _api__get_promo_offer_dto__NOT_PARTICIPATING } _api__get_promo_offer_dto__e;

char* get_promo_offer_dto_status_ToString(_api__get_promo_offer_dto__e status);

_api__get_promo_offer_dto__e get_promo_offer_dto_status_FromString(char* status);



typedef struct get_promo_offer_dto_t {
    char *offer_id; // string
    promo_offer_participation_status_type_t *status; // custom
    struct promo_offer_params_dto_t *params; //model
    struct promo_offer_auto_participating_details_dto_t *auto_participating_details; //model

} get_promo_offer_dto_t;

get_promo_offer_dto_t *get_promo_offer_dto_create(
    char *offer_id,
    promo_offer_participation_status_type_t *status,
    promo_offer_params_dto_t *params,
    promo_offer_auto_participating_details_dto_t *auto_participating_details
);

void get_promo_offer_dto_free(get_promo_offer_dto_t *get_promo_offer_dto);

get_promo_offer_dto_t *get_promo_offer_dto_parseFromJSON(cJSON *get_promo_offer_dtoJSON);

cJSON *get_promo_offer_dto_convertToJSON(get_promo_offer_dto_t *get_promo_offer_dto);

#endif /* _get_promo_offer_dto_H_ */

