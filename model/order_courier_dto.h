/*
 * order_courier_dto.h
 *
 * Информация о курьере.
 */

#ifndef _order_courier_dto_H_
#define _order_courier_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct order_courier_dto_t order_courier_dto_t;




typedef struct order_courier_dto_t {
    char *full_name; // string
    char *phone; // string
    char *phone_extension; // string
    char *vehicle_number; // string
    char *vehicle_description; // string

} order_courier_dto_t;

order_courier_dto_t *order_courier_dto_create(
    char *full_name,
    char *phone,
    char *phone_extension,
    char *vehicle_number,
    char *vehicle_description
);

void order_courier_dto_free(order_courier_dto_t *order_courier_dto);

order_courier_dto_t *order_courier_dto_parseFromJSON(cJSON *order_courier_dtoJSON);

cJSON *order_courier_dto_convertToJSON(order_courier_dto_t *order_courier_dto);

#endif /* _order_courier_dto_H_ */

