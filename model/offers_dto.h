/*
 * offers_dto.h
 *
 * Найденные предложения магазина.
 */

#ifndef _offers_dto_H_
#define _offers_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct offers_dto_t offers_dto_t;

#include "offer_dto.h"



typedef struct offers_dto_t {
    list_t *offers; //nonprimitive container

} offers_dto_t;

offers_dto_t *offers_dto_create(
    list_t *offers
);

void offers_dto_free(offers_dto_t *offers_dto);

offers_dto_t *offers_dto_parseFromJSON(cJSON *offers_dtoJSON);

cJSON *offers_dto_convertToJSON(offers_dto_t *offers_dto);

#endif /* _offers_dto_H_ */

