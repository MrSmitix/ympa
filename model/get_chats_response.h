/*
 * get_chats_response.h
 *
 * 
 */

#ifndef _get_chats_response_H_
#define _get_chats_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct get_chats_response_t get_chats_response_t;

#include "api_response_status_type.h"
#include "get_chats_info_dto.h"

// Enum  for get_chats_response

typedef enum  { _api__get_chats_response__NULL = 0, _api__get_chats_response__OK, _api__get_chats_response__ERROR } _api__get_chats_response__e;

char* get_chats_response_status_ToString(_api__get_chats_response__e status);

_api__get_chats_response__e get_chats_response_status_FromString(char* status);



typedef struct get_chats_response_t {
    api_response_status_type_t *status; // custom
    struct get_chats_info_dto_t *result; //model

} get_chats_response_t;

get_chats_response_t *get_chats_response_create(
    api_response_status_type_t *status,
    get_chats_info_dto_t *result
);

void get_chats_response_free(get_chats_response_t *get_chats_response);

get_chats_response_t *get_chats_response_parseFromJSON(cJSON *get_chats_responseJSON);

cJSON *get_chats_response_convertToJSON(get_chats_response_t *get_chats_response);

#endif /* _get_chats_response_H_ */

