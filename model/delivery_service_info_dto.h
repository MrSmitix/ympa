/*
 * delivery_service_info_dto.h
 *
 * Информация о службе доставки.
 */

#ifndef _delivery_service_info_dto_H_
#define _delivery_service_info_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct delivery_service_info_dto_t delivery_service_info_dto_t;




typedef struct delivery_service_info_dto_t {
    long id; //numeric
    char *name; // string

} delivery_service_info_dto_t;

delivery_service_info_dto_t *delivery_service_info_dto_create(
    long id,
    char *name
);

void delivery_service_info_dto_free(delivery_service_info_dto_t *delivery_service_info_dto);

delivery_service_info_dto_t *delivery_service_info_dto_parseFromJSON(cJSON *delivery_service_info_dtoJSON);

cJSON *delivery_service_info_dto_convertToJSON(delivery_service_info_dto_t *delivery_service_info_dto);

#endif /* _delivery_service_info_dto_H_ */

