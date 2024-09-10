/*
 * update_time_dto.h
 *
 * Время последнего обновления.
 */

#ifndef _update_time_dto_H_
#define _update_time_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct update_time_dto_t update_time_dto_t;




typedef struct update_time_dto_t {
    char *updated_at; //date time

} update_time_dto_t;

update_time_dto_t *update_time_dto_create(
    char *updated_at
);

void update_time_dto_free(update_time_dto_t *update_time_dto);

update_time_dto_t *update_time_dto_parseFromJSON(cJSON *update_time_dtoJSON);

cJSON *update_time_dto_convertToJSON(update_time_dto_t *update_time_dto);

#endif /* _update_time_dto_H_ */

