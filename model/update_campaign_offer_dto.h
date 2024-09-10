/*
 * update_campaign_offer_dto.h
 *
 * Параметры размещения товара в магазине.
 */

#ifndef _update_campaign_offer_dto_H_
#define _update_campaign_offer_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct update_campaign_offer_dto_t update_campaign_offer_dto_t;

#include "quantum_dto.h"



typedef struct update_campaign_offer_dto_t {
    char *offer_id; // string
    struct quantum_dto_t *quantum; //model
    int available; //boolean
    int vat; //numeric

} update_campaign_offer_dto_t;

update_campaign_offer_dto_t *update_campaign_offer_dto_create(
    char *offer_id,
    quantum_dto_t *quantum,
    int available,
    int vat
);

void update_campaign_offer_dto_free(update_campaign_offer_dto_t *update_campaign_offer_dto);

update_campaign_offer_dto_t *update_campaign_offer_dto_parseFromJSON(cJSON *update_campaign_offer_dtoJSON);

cJSON *update_campaign_offer_dto_convertToJSON(update_campaign_offer_dto_t *update_campaign_offer_dto);

#endif /* _update_campaign_offer_dto_H_ */

