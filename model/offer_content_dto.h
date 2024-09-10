/*
 * offer_content_dto.h
 *
 * Товар с указанными характеристиками.
 */

#ifndef _offer_content_dto_H_
#define _offer_content_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct offer_content_dto_t offer_content_dto_t;

#include "parameter_value_dto.h"



typedef struct offer_content_dto_t {
    char *offer_id; // string
    int category_id; //numeric
    list_t *parameter_values; //nonprimitive container

} offer_content_dto_t;

offer_content_dto_t *offer_content_dto_create(
    char *offer_id,
    int category_id,
    list_t *parameter_values
);

void offer_content_dto_free(offer_content_dto_t *offer_content_dto);

offer_content_dto_t *offer_content_dto_parseFromJSON(cJSON *offer_content_dtoJSON);

cJSON *offer_content_dto_convertToJSON(offer_content_dto_t *offer_content_dto);

#endif /* _offer_content_dto_H_ */

