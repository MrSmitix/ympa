/*
 * outlet_address_dto.h
 *
 * Адрес точки продаж. 
 */

#ifndef _outlet_address_dto_H_
#define _outlet_address_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct outlet_address_dto_t outlet_address_dto_t;




typedef struct outlet_address_dto_t {
    long region_id; //numeric
    char *street; // string
    char *number; // string
    char *building; // string
    char *estate; // string
    char *block; // string
    char *additional; // string
    int km; //numeric
    char *city; // string

} outlet_address_dto_t;

outlet_address_dto_t *outlet_address_dto_create(
    long region_id,
    char *street,
    char *number,
    char *building,
    char *estate,
    char *block,
    char *additional,
    int km,
    char *city
);

void outlet_address_dto_free(outlet_address_dto_t *outlet_address_dto);

outlet_address_dto_t *outlet_address_dto_parseFromJSON(cJSON *outlet_address_dtoJSON);

cJSON *outlet_address_dto_convertToJSON(outlet_address_dto_t *outlet_address_dto);

#endif /* _outlet_address_dto_H_ */

