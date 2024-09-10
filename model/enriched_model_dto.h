/*
 * enriched_model_dto.h
 *
 * Модель товара.
 */

#ifndef _enriched_model_dto_H_
#define _enriched_model_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct enriched_model_dto_t enriched_model_dto_t;

#include "model_offer_dto.h"
#include "model_price_dto.h"



typedef struct enriched_model_dto_t {
    long id; //numeric
    char *name; // string
    struct model_price_dto_t *prices; //model
    list_t *offers; //nonprimitive container
    int offline_offers; //numeric
    int online_offers; //numeric

} enriched_model_dto_t;

enriched_model_dto_t *enriched_model_dto_create(
    long id,
    char *name,
    model_price_dto_t *prices,
    list_t *offers,
    int offline_offers,
    int online_offers
);

void enriched_model_dto_free(enriched_model_dto_t *enriched_model_dto);

enriched_model_dto_t *enriched_model_dto_parseFromJSON(cJSON *enriched_model_dtoJSON);

cJSON *enriched_model_dto_convertToJSON(enriched_model_dto_t *enriched_model_dto);

#endif /* _enriched_model_dto_H_ */

