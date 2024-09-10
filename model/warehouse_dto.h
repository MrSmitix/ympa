/*
 * warehouse_dto.h
 *
 * Информация о складе.
 */

#ifndef _warehouse_dto_H_
#define _warehouse_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct warehouse_dto_t warehouse_dto_t;

#include "warehouse_address_dto.h"



typedef struct warehouse_dto_t {
    long id; //numeric
    char *name; // string
    long campaign_id; //numeric
    int express; //boolean
    struct warehouse_address_dto_t *address; //model

} warehouse_dto_t;

warehouse_dto_t *warehouse_dto_create(
    long id,
    char *name,
    long campaign_id,
    int express,
    warehouse_address_dto_t *address
);

void warehouse_dto_free(warehouse_dto_t *warehouse_dto);

warehouse_dto_t *warehouse_dto_parseFromJSON(cJSON *warehouse_dtoJSON);

cJSON *warehouse_dto_convertToJSON(warehouse_dto_t *warehouse_dto);

#endif /* _warehouse_dto_H_ */

