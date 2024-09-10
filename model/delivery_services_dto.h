/*
 * delivery_services_dto.h
 *
 * Информация о службах доставки.
 */

#ifndef _delivery_services_dto_H_
#define _delivery_services_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct delivery_services_dto_t delivery_services_dto_t;

#include "delivery_service_info_dto.h"



typedef struct delivery_services_dto_t {
    list_t *delivery_service; //nonprimitive container

} delivery_services_dto_t;

delivery_services_dto_t *delivery_services_dto_create(
    list_t *delivery_service
);

void delivery_services_dto_free(delivery_services_dto_t *delivery_services_dto);

delivery_services_dto_t *delivery_services_dto_parseFromJSON(cJSON *delivery_services_dtoJSON);

cJSON *delivery_services_dto_convertToJSON(delivery_services_dto_t *delivery_services_dto);

#endif /* _delivery_services_dto_H_ */

