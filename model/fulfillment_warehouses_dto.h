/*
 * fulfillment_warehouses_dto.h
 *
 * Список складов Маркета (FBY).
 */

#ifndef _fulfillment_warehouses_dto_H_
#define _fulfillment_warehouses_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct fulfillment_warehouses_dto_t fulfillment_warehouses_dto_t;

#include "fulfillment_warehouse_dto.h"



typedef struct fulfillment_warehouses_dto_t {
    list_t *warehouses; //nonprimitive container

} fulfillment_warehouses_dto_t;

fulfillment_warehouses_dto_t *fulfillment_warehouses_dto_create(
    list_t *warehouses
);

void fulfillment_warehouses_dto_free(fulfillment_warehouses_dto_t *fulfillment_warehouses_dto);

fulfillment_warehouses_dto_t *fulfillment_warehouses_dto_parseFromJSON(cJSON *fulfillment_warehouses_dtoJSON);

cJSON *fulfillment_warehouses_dto_convertToJSON(fulfillment_warehouses_dto_t *fulfillment_warehouses_dto);

#endif /* _fulfillment_warehouses_dto_H_ */

