/*
 * quarantine_offer_dto.h
 *
 * Товар в карантине.
 */

#ifndef _quarantine_offer_dto_H_
#define _quarantine_offer_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct quarantine_offer_dto_t quarantine_offer_dto_t;

#include "base_price_dto.h"
#include "price_quarantine_verdict_dto.h"



typedef struct quarantine_offer_dto_t {
    char *offer_id; // string
    struct base_price_dto_t *current_price; //model
    struct base_price_dto_t *last_valid_price; //model
    list_t *verdicts; //nonprimitive container

} quarantine_offer_dto_t;

quarantine_offer_dto_t *quarantine_offer_dto_create(
    char *offer_id,
    base_price_dto_t *current_price,
    base_price_dto_t *last_valid_price,
    list_t *verdicts
);

void quarantine_offer_dto_free(quarantine_offer_dto_t *quarantine_offer_dto);

quarantine_offer_dto_t *quarantine_offer_dto_parseFromJSON(cJSON *quarantine_offer_dtoJSON);

cJSON *quarantine_offer_dto_convertToJSON(quarantine_offer_dto_t *quarantine_offer_dto);

#endif /* _quarantine_offer_dto_H_ */

