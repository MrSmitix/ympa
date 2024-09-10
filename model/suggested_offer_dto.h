/*
 * suggested_offer_dto.h
 *
 * Информация о товаре.
 */

#ifndef _suggested_offer_dto_H_
#define _suggested_offer_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct suggested_offer_dto_t suggested_offer_dto_t;

#include "base_price_dto.h"



typedef struct suggested_offer_dto_t {
    char *offer_id; // string
    char *name; // string
    char *category; // string
    char *vendor; // string
    list_t *barcodes; //primitive container
    char *description; // string
    char *vendor_code; // string
    struct base_price_dto_t *basic_price; //model

} suggested_offer_dto_t;

suggested_offer_dto_t *suggested_offer_dto_create(
    char *offer_id,
    char *name,
    char *category,
    char *vendor,
    list_t *barcodes,
    char *description,
    char *vendor_code,
    base_price_dto_t *basic_price
);

void suggested_offer_dto_free(suggested_offer_dto_t *suggested_offer_dto);

suggested_offer_dto_t *suggested_offer_dto_parseFromJSON(cJSON *suggested_offer_dtoJSON);

cJSON *suggested_offer_dto_convertToJSON(suggested_offer_dto_t *suggested_offer_dto);

#endif /* _suggested_offer_dto_H_ */

