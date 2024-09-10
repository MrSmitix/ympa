/*
 * create_chat_request.h
 *
 * Заказ, для которого нужно создать чат. 
 */

#ifndef _create_chat_request_H_
#define _create_chat_request_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct create_chat_request_t create_chat_request_t;




typedef struct create_chat_request_t {
    long order_id; //numeric

} create_chat_request_t;

create_chat_request_t *create_chat_request_create(
    long order_id
);

void create_chat_request_free(create_chat_request_t *create_chat_request);

create_chat_request_t *create_chat_request_parseFromJSON(cJSON *create_chat_requestJSON);

cJSON *create_chat_request_convertToJSON(create_chat_request_t *create_chat_request);

#endif /* _create_chat_request_H_ */

