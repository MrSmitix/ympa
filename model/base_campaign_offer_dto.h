/*
 * base_campaign_offer_dto.h
 *
 * Информация о новой цене на товар.
 */

#ifndef _base_campaign_offer_dto_H_
#define _base_campaign_offer_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct base_campaign_offer_dto_t base_campaign_offer_dto_t;

#include "quantum_dto.h"



typedef struct base_campaign_offer_dto_t {
    char *offer_id; // string
    struct quantum_dto_t *quantum; //model
    int available; //boolean

} base_campaign_offer_dto_t;

base_campaign_offer_dto_t *base_campaign_offer_dto_create(
    char *offer_id,
    quantum_dto_t *quantum,
    int available
);

void base_campaign_offer_dto_free(base_campaign_offer_dto_t *base_campaign_offer_dto);

base_campaign_offer_dto_t *base_campaign_offer_dto_parseFromJSON(cJSON *base_campaign_offer_dtoJSON);

cJSON *base_campaign_offer_dto_convertToJSON(base_campaign_offer_dto_t *base_campaign_offer_dto);

#endif /* _base_campaign_offer_dto_H_ */

