/*
 * chat_message_payload_dto.h
 *
 * Информация о приложенных к сообщению файлах.
 */

#ifndef _chat_message_payload_dto_H_
#define _chat_message_payload_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct chat_message_payload_dto_t chat_message_payload_dto_t;




typedef struct chat_message_payload_dto_t {
    char *name; // string
    char *url; // string
    int size; //numeric

} chat_message_payload_dto_t;

chat_message_payload_dto_t *chat_message_payload_dto_create(
    char *name,
    char *url,
    int size
);

void chat_message_payload_dto_free(chat_message_payload_dto_t *chat_message_payload_dto);

chat_message_payload_dto_t *chat_message_payload_dto_parseFromJSON(cJSON *chat_message_payload_dtoJSON);

cJSON *chat_message_payload_dto_convertToJSON(chat_message_payload_dto_t *chat_message_payload_dto);

#endif /* _chat_message_payload_dto_H_ */

