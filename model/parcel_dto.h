/*
 * parcel_dto.h
 *
 * Информация о грузовых местах в заказе.
 */

#ifndef _parcel_dto_H_
#define _parcel_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct parcel_dto_t parcel_dto_t;

#include "parcel_box_dto.h"



typedef struct parcel_dto_t {
    list_t *boxes; //nonprimitive container

} parcel_dto_t;

parcel_dto_t *parcel_dto_create(
    list_t *boxes
);

void parcel_dto_free(parcel_dto_t *parcel_dto);

parcel_dto_t *parcel_dto_parseFromJSON(cJSON *parcel_dtoJSON);

cJSON *parcel_dto_convertToJSON(parcel_dto_t *parcel_dto);

#endif /* _parcel_dto_H_ */

