/*
 * gps_dto.h
 *
 * GPS-координаты широты и долготы. 
 */

#ifndef _gps_dto_H_
#define _gps_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct gps_dto_t gps_dto_t;




typedef struct gps_dto_t {
    double latitude; //numeric
    double longitude; //numeric

} gps_dto_t;

gps_dto_t *gps_dto_create(
    double latitude,
    double longitude
);

void gps_dto_free(gps_dto_t *gps_dto);

gps_dto_t *gps_dto_parseFromJSON(cJSON *gps_dtoJSON);

cJSON *gps_dto_convertToJSON(gps_dto_t *gps_dto);

#endif /* _gps_dto_H_ */

