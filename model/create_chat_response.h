/*
 * create_chat_response.h
 *
 * Результат создания чата.
 */

#ifndef _create_chat_response_H_
#define _create_chat_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct create_chat_response_t create_chat_response_t;

#include "api_response_status_type.h"
#include "create_chat_result_dto.h"

// Enum  for create_chat_response

typedef enum  { _api__create_chat_response__NULL = 0, _api__create_chat_response__OK, _api__create_chat_response__ERROR } _api__create_chat_response__e;

char* create_chat_response_status_ToString(_api__create_chat_response__e status);

_api__create_chat_response__e create_chat_response_status_FromString(char* status);



typedef struct create_chat_response_t {
    api_response_status_type_t *status; // custom
    struct create_chat_result_dto_t *result; //model

} create_chat_response_t;

create_chat_response_t *create_chat_response_create(
    api_response_status_type_t *status,
    create_chat_result_dto_t *result
);

void create_chat_response_free(create_chat_response_t *create_chat_response);

create_chat_response_t *create_chat_response_parseFromJSON(cJSON *create_chat_responseJSON);

cJSON *create_chat_response_convertToJSON(create_chat_response_t *create_chat_response);

#endif /* _create_chat_response_H_ */

