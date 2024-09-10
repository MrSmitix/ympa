/*
 * warehouse_group_dto.h
 *
 * Информация о группе складов.
 */

#ifndef _warehouse_group_dto_H_
#define _warehouse_group_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct warehouse_group_dto_t warehouse_group_dto_t;

#include "warehouse_dto.h"



typedef struct warehouse_group_dto_t {
    char *name; // string
    struct warehouse_dto_t *main_warehouse; //model
    list_t *warehouses; //nonprimitive container

} warehouse_group_dto_t;

warehouse_group_dto_t *warehouse_group_dto_create(
    char *name,
    warehouse_dto_t *main_warehouse,
    list_t *warehouses
);

void warehouse_group_dto_free(warehouse_group_dto_t *warehouse_group_dto);

warehouse_group_dto_t *warehouse_group_dto_parseFromJSON(cJSON *warehouse_group_dtoJSON);

cJSON *warehouse_group_dto_convertToJSON(warehouse_group_dto_t *warehouse_group_dto);

#endif /* _warehouse_group_dto_H_ */

