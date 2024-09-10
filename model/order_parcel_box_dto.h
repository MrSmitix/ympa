/*
 * order_parcel_box_dto.h
 *
 * Информация о грузоместе.
 */

#ifndef _order_parcel_box_dto_H_
#define _order_parcel_box_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct order_parcel_box_dto_t order_parcel_box_dto_t;




typedef struct order_parcel_box_dto_t {
    long id; //numeric
    char *fulfilment_id; // string

} order_parcel_box_dto_t;

order_parcel_box_dto_t *order_parcel_box_dto_create(
    long id,
    char *fulfilment_id
);

void order_parcel_box_dto_free(order_parcel_box_dto_t *order_parcel_box_dto);

order_parcel_box_dto_t *order_parcel_box_dto_parseFromJSON(cJSON *order_parcel_box_dtoJSON);

cJSON *order_parcel_box_dto_convertToJSON(order_parcel_box_dto_t *order_parcel_box_dto);

#endif /* _order_parcel_box_dto_H_ */

