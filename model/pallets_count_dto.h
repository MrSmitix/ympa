/*
 * pallets_count_dto.h
 *
 * Количество палет в отгрузке.
 */

#ifndef _pallets_count_dto_H_
#define _pallets_count_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct pallets_count_dto_t pallets_count_dto_t;




typedef struct pallets_count_dto_t {
    int planned; //numeric
    int fact; //numeric

} pallets_count_dto_t;

pallets_count_dto_t *pallets_count_dto_create(
    int planned,
    int fact
);

void pallets_count_dto_free(pallets_count_dto_t *pallets_count_dto);

pallets_count_dto_t *pallets_count_dto_parseFromJSON(cJSON *pallets_count_dtoJSON);

cJSON *pallets_count_dto_convertToJSON(pallets_count_dto_t *pallets_count_dto);

#endif /* _pallets_count_dto_H_ */

