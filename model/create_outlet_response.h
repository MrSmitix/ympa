/*
 * create_outlet_response.h
 *
 * Ответ на запрос о создании точки продаж.
 */

#ifndef _create_outlet_response_H_
#define _create_outlet_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct create_outlet_response_t create_outlet_response_t;

#include "api_response_status_type.h"
#include "outlet_response_dto.h"

// Enum  for create_outlet_response

typedef enum  { _api__create_outlet_response__NULL = 0, _api__create_outlet_response__OK, _api__create_outlet_response__ERROR } _api__create_outlet_response__e;

char* create_outlet_response_status_ToString(_api__create_outlet_response__e status);

_api__create_outlet_response__e create_outlet_response_status_FromString(char* status);



typedef struct create_outlet_response_t {
    api_response_status_type_t *status; // custom
    struct outlet_response_dto_t *result; //model

} create_outlet_response_t;

create_outlet_response_t *create_outlet_response_create(
    api_response_status_type_t *status,
    outlet_response_dto_t *result
);

void create_outlet_response_free(create_outlet_response_t *create_outlet_response);

create_outlet_response_t *create_outlet_response_parseFromJSON(cJSON *create_outlet_responseJSON);

cJSON *create_outlet_response_convertToJSON(create_outlet_response_t *create_outlet_response);

#endif /* _create_outlet_response_H_ */

