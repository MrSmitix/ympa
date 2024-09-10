/*
 * update_outlet_license_request.h
 *
 * Запрос на создание или изменение лицензий для точек продаж.
 */

#ifndef _update_outlet_license_request_H_
#define _update_outlet_license_request_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct update_outlet_license_request_t update_outlet_license_request_t;

#include "outlet_license_dto.h"



typedef struct update_outlet_license_request_t {
    list_t *licenses; //nonprimitive container

} update_outlet_license_request_t;

update_outlet_license_request_t *update_outlet_license_request_create(
    list_t *licenses
);

void update_outlet_license_request_free(update_outlet_license_request_t *update_outlet_license_request);

update_outlet_license_request_t *update_outlet_license_request_parseFromJSON(cJSON *update_outlet_license_requestJSON);

cJSON *update_outlet_license_request_convertToJSON(update_outlet_license_request_t *update_outlet_license_request);

#endif /* _update_outlet_license_request_H_ */

