/*
 * fulfillment_warehouse_dto.h
 *
 * Склад Маркета (FBY).
 */

#ifndef _fulfillment_warehouse_dto_H_
#define _fulfillment_warehouse_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct fulfillment_warehouse_dto_t fulfillment_warehouse_dto_t;

#include "warehouse_address_dto.h"



typedef struct fulfillment_warehouse_dto_t {
    long id; //numeric
    char *name; // string
    struct warehouse_address_dto_t *address; //model

} fulfillment_warehouse_dto_t;

fulfillment_warehouse_dto_t *fulfillment_warehouse_dto_create(
    long id,
    char *name,
    warehouse_address_dto_t *address
);

void fulfillment_warehouse_dto_free(fulfillment_warehouse_dto_t *fulfillment_warehouse_dto);

fulfillment_warehouse_dto_t *fulfillment_warehouse_dto_parseFromJSON(cJSON *fulfillment_warehouse_dtoJSON);

cJSON *fulfillment_warehouse_dto_convertToJSON(fulfillment_warehouse_dto_t *fulfillment_warehouse_dto);

#endif /* _fulfillment_warehouse_dto_H_ */

