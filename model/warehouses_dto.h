/*
 * warehouses_dto.h
 *
 * Информация о складах и группах складов.
 */

#ifndef _warehouses_dto_H_
#define _warehouses_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct warehouses_dto_t warehouses_dto_t;

#include "warehouse_dto.h"
#include "warehouse_group_dto.h"



typedef struct warehouses_dto_t {
    list_t *warehouses; //nonprimitive container
    list_t *warehouse_groups; //nonprimitive container

} warehouses_dto_t;

warehouses_dto_t *warehouses_dto_create(
    list_t *warehouses,
    list_t *warehouse_groups
);

void warehouses_dto_free(warehouses_dto_t *warehouses_dto);

warehouses_dto_t *warehouses_dto_parseFromJSON(cJSON *warehouses_dtoJSON);

cJSON *warehouses_dto_convertToJSON(warehouses_dto_t *warehouses_dto);

#endif /* _warehouses_dto_H_ */

