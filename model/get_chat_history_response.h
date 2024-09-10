/*
 * get_chat_history_response.h
 *
 * 
 */

#ifndef _get_chat_history_response_H_
#define _get_chat_history_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct get_chat_history_response_t get_chat_history_response_t;

#include "api_response_status_type.h"
#include "chat_messages_result_dto.h"

// Enum  for get_chat_history_response

typedef enum  { _api__get_chat_history_response__NULL = 0, _api__get_chat_history_response__OK, _api__get_chat_history_response__ERROR } _api__get_chat_history_response__e;

char* get_chat_history_response_status_ToString(_api__get_chat_history_response__e status);

_api__get_chat_history_response__e get_chat_history_response_status_FromString(char* status);



typedef struct get_chat_history_response_t {
    api_response_status_type_t *status; // custom
    struct chat_messages_result_dto_t *result; //model

} get_chat_history_response_t;

get_chat_history_response_t *get_chat_history_response_create(
    api_response_status_type_t *status,
    chat_messages_result_dto_t *result
);

void get_chat_history_response_free(get_chat_history_response_t *get_chat_history_response);

get_chat_history_response_t *get_chat_history_response_parseFromJSON(cJSON *get_chat_history_responseJSON);

cJSON *get_chat_history_response_convertToJSON(get_chat_history_response_t *get_chat_history_response);

#endif /* _get_chat_history_response_H_ */

