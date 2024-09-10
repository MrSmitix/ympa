/*
 * feed_parameter_dto.h
 *
 * Параметр прайс-листа.
 */

#ifndef _feed_parameter_dto_H_
#define _feed_parameter_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct feed_parameter_dto_t feed_parameter_dto_t;




typedef struct feed_parameter_dto_t {
    int deleted; //boolean
    char *name; // string
    list_t *values; //primitive container

} feed_parameter_dto_t;

feed_parameter_dto_t *feed_parameter_dto_create(
    int deleted,
    char *name,
    list_t *values
);

void feed_parameter_dto_free(feed_parameter_dto_t *feed_parameter_dto);

feed_parameter_dto_t *feed_parameter_dto_parseFromJSON(cJSON *feed_parameter_dtoJSON);

cJSON *feed_parameter_dto_convertToJSON(feed_parameter_dto_t *feed_parameter_dto);

#endif /* _feed_parameter_dto_H_ */

