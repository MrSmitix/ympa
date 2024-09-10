/*
 * unit_dto.h
 *
 * Единица измерения.
 */

#ifndef _unit_dto_H_
#define _unit_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct unit_dto_t unit_dto_t;




typedef struct unit_dto_t {
    long id; //numeric
    char *name; // string
    char *full_name; // string

} unit_dto_t;

unit_dto_t *unit_dto_create(
    long id,
    char *name,
    char *full_name
);

void unit_dto_free(unit_dto_t *unit_dto);

unit_dto_t *unit_dto_parseFromJSON(cJSON *unit_dtoJSON);

cJSON *unit_dto_convertToJSON(unit_dto_t *unit_dto);

#endif /* _unit_dto_H_ */

