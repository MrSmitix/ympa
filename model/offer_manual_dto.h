/*
 * offer_manual_dto.h
 *
 * Инструкция по использованию товара. 
 */

#ifndef _offer_manual_dto_H_
#define _offer_manual_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct offer_manual_dto_t offer_manual_dto_t;




typedef struct offer_manual_dto_t {
    char *url; // string
    char *title; // string

} offer_manual_dto_t;

offer_manual_dto_t *offer_manual_dto_create(
    char *url,
    char *title
);

void offer_manual_dto_free(offer_manual_dto_t *offer_manual_dto);

offer_manual_dto_t *offer_manual_dto_parseFromJSON(cJSON *offer_manual_dtoJSON);

cJSON *offer_manual_dto_convertToJSON(offer_manual_dto_t *offer_manual_dto);

#endif /* _offer_manual_dto_H_ */

