/*
 * warehouse_address_dto.h
 *
 * Адрес склада.
 */

#ifndef _warehouse_address_dto_H_
#define _warehouse_address_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct warehouse_address_dto_t warehouse_address_dto_t;

#include "gps_dto.h"



typedef struct warehouse_address_dto_t {
    char *city; // string
    char *street; // string
    char *number; // string
    char *building; // string
    char *block; // string
    struct gps_dto_t *gps; //model

} warehouse_address_dto_t;

warehouse_address_dto_t *warehouse_address_dto_create(
    char *city,
    char *street,
    char *number,
    char *building,
    char *block,
    gps_dto_t *gps
);

void warehouse_address_dto_free(warehouse_address_dto_t *warehouse_address_dto);

warehouse_address_dto_t *warehouse_address_dto_parseFromJSON(cJSON *warehouse_address_dtoJSON);

cJSON *warehouse_address_dto_convertToJSON(warehouse_address_dto_t *warehouse_address_dto);

#endif /* _warehouse_address_dto_H_ */

