/*
 * pickup_address_dto.h
 *
 * Адрес доставки.
 */

#ifndef _pickup_address_dto_H_
#define _pickup_address_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct pickup_address_dto_t pickup_address_dto_t;




typedef struct pickup_address_dto_t {
    char *country; // string
    char *city; // string
    char *street; // string
    char *house; // string
    char *postcode; // string

} pickup_address_dto_t;

pickup_address_dto_t *pickup_address_dto_create(
    char *country,
    char *city,
    char *street,
    char *house,
    char *postcode
);

void pickup_address_dto_free(pickup_address_dto_t *pickup_address_dto);

pickup_address_dto_t *pickup_address_dto_parseFromJSON(cJSON *pickup_address_dtoJSON);

cJSON *pickup_address_dto_convertToJSON(pickup_address_dto_t *pickup_address_dto);

#endif /* _pickup_address_dto_H_ */

