/*
 * track_dto.h
 *
 * Информация о трек-номерах.
 */

#ifndef _track_dto_H_
#define _track_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct track_dto_t track_dto_t;




typedef struct track_dto_t {
    char *track_code; // string

} track_dto_t;

track_dto_t *track_dto_create(
    char *track_code
);

void track_dto_free(track_dto_t *track_dto);

track_dto_t *track_dto_parseFromJSON(cJSON *track_dtoJSON);

cJSON *track_dto_convertToJSON(track_dto_t *track_dto);

#endif /* _track_dto_H_ */

