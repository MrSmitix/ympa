/*
 * outlet_licenses_response_dto.h
 *
 * Ответ на запрос информации о лицензиях для точек продаж.
 */

#ifndef _outlet_licenses_response_dto_H_
#define _outlet_licenses_response_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct outlet_licenses_response_dto_t outlet_licenses_response_dto_t;

#include "full_outlet_license_dto.h"



typedef struct outlet_licenses_response_dto_t {
    list_t *licenses; //nonprimitive container

} outlet_licenses_response_dto_t;

outlet_licenses_response_dto_t *outlet_licenses_response_dto_create(
    list_t *licenses
);

void outlet_licenses_response_dto_free(outlet_licenses_response_dto_t *outlet_licenses_response_dto);

outlet_licenses_response_dto_t *outlet_licenses_response_dto_parseFromJSON(cJSON *outlet_licenses_response_dtoJSON);

cJSON *outlet_licenses_response_dto_convertToJSON(outlet_licenses_response_dto_t *outlet_licenses_response_dto);

#endif /* _outlet_licenses_response_dto_H_ */

