/*
 * offer_price_by_offer_ids_response_dto.h
 *
 * Информация об установленной цене.
 */

#ifndef _offer_price_by_offer_ids_response_dto_H_
#define _offer_price_by_offer_ids_response_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct offer_price_by_offer_ids_response_dto_t offer_price_by_offer_ids_response_dto_t;

#include "price_dto.h"



typedef struct offer_price_by_offer_ids_response_dto_t {
    char *offer_id; // string
    struct price_dto_t *price; //model
    char *updated_at; //date time

} offer_price_by_offer_ids_response_dto_t;

offer_price_by_offer_ids_response_dto_t *offer_price_by_offer_ids_response_dto_create(
    char *offer_id,
    price_dto_t *price,
    char *updated_at
);

void offer_price_by_offer_ids_response_dto_free(offer_price_by_offer_ids_response_dto_t *offer_price_by_offer_ids_response_dto);

offer_price_by_offer_ids_response_dto_t *offer_price_by_offer_ids_response_dto_parseFromJSON(cJSON *offer_price_by_offer_ids_response_dtoJSON);

cJSON *offer_price_by_offer_ids_response_dto_convertToJSON(offer_price_by_offer_ids_response_dto_t *offer_price_by_offer_ids_response_dto);

#endif /* _offer_price_by_offer_ids_response_dto_H_ */

