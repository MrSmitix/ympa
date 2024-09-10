/*
 * get_chat_history_request.h
 *
 * Историю какого чата нужно получить — и начиная с какого сообщения. 
 */

#ifndef _get_chat_history_request_H_
#define _get_chat_history_request_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct get_chat_history_request_t get_chat_history_request_t;




typedef struct get_chat_history_request_t {
    long message_id_from; //numeric

} get_chat_history_request_t;

get_chat_history_request_t *get_chat_history_request_create(
    long message_id_from
);

void get_chat_history_request_free(get_chat_history_request_t *get_chat_history_request);

get_chat_history_request_t *get_chat_history_request_parseFromJSON(cJSON *get_chat_history_requestJSON);

cJSON *get_chat_history_request_convertToJSON(get_chat_history_request_t *get_chat_history_request);

#endif /* _get_chat_history_request_H_ */

