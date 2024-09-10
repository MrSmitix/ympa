/*
 * api_error_dto.h
 *
 * Общий формат ошибки.
 */

#ifndef _api_error_dto_H_
#define _api_error_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct api_error_dto_t api_error_dto_t;




typedef struct api_error_dto_t {
    char *code; // string
    char *message; // string

} api_error_dto_t;

api_error_dto_t *api_error_dto_create(
    char *code,
    char *message
);

void api_error_dto_free(api_error_dto_t *api_error_dto);

api_error_dto_t *api_error_dto_parseFromJSON(cJSON *api_error_dtoJSON);

cJSON *api_error_dto_convertToJSON(api_error_dto_t *api_error_dto);

#endif /* _api_error_dto_H_ */

