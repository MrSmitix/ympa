/*
 * region_dto.h
 *
 * Регион доставки.
 */

#ifndef _region_dto_H_
#define _region_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct region_dto_t region_dto_t;

#include "region_type.h"

// Enum  for region_dto

typedef enum  { _api__region_dto__NULL = 0, _api__region_dto__OTHER, _api__region_dto__CONTINENT, _api__region_dto__REGION, _api__region_dto__COUNTRY, _api__region_dto__COUNTRY_DISTRICT, _api__region_dto__REPUBLIC, _api__region_dto__CITY, _api__region_dto__VILLAGE, _api__region_dto__CITY_DISTRICT, _api__region_dto__SUBWAY_STATION, _api__region_dto__REPUBLIC_AREA } _api__region_dto__e;

char* region_dto_type_ToString(_api__region_dto__e type);

_api__region_dto__e region_dto_type_FromString(char* type);



typedef struct region_dto_t {
    long id; //numeric
    char *name; // string
    region_type_t *type; // custom
    struct region_dto_t *parent; //model
    list_t *children; //nonprimitive container

} region_dto_t;

region_dto_t *region_dto_create(
    long id,
    char *name,
    region_type_t *type,
    region_dto_t *parent,
    list_t *children
);

void region_dto_free(region_dto_t *region_dto);

region_dto_t *region_dto_parseFromJSON(cJSON *region_dtoJSON);

cJSON *region_dto_convertToJSON(region_dto_t *region_dto);

#endif /* _region_dto_H_ */

