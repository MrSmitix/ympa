/*
 * send_message_to_chat_request.h
 *
 * В какой чат нужно отправить сообщение и текст сообщения.
 */

#ifndef _send_message_to_chat_request_H_
#define _send_message_to_chat_request_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct send_message_to_chat_request_t send_message_to_chat_request_t;




typedef struct send_message_to_chat_request_t {
    char *message; // string

} send_message_to_chat_request_t;

send_message_to_chat_request_t *send_message_to_chat_request_create(
    char *message
);

void send_message_to_chat_request_free(send_message_to_chat_request_t *send_message_to_chat_request);

send_message_to_chat_request_t *send_message_to_chat_request_parseFromJSON(cJSON *send_message_to_chat_requestJSON);

cJSON *send_message_to_chat_request_convertToJSON(send_message_to_chat_request_t *send_message_to_chat_request);

#endif /* _send_message_to_chat_request_H_ */

