/*
 * chat_message_dto.h
 *
 * Информация о сообщениях.
 */

#ifndef _chat_message_dto_H_
#define _chat_message_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct chat_message_dto_t chat_message_dto_t;

#include "chat_message_payload_dto.h"
#include "chat_message_sender_type.h"

// Enum  for chat_message_dto

typedef enum  { _api__chat_message_dto__NULL = 0, _api__chat_message_dto__PARTNER, _api__chat_message_dto__CUSTOMER, _api__chat_message_dto__MARKET, _api__chat_message_dto__SUPPORT } _api__chat_message_dto__e;

char* chat_message_dto_sender_ToString(_api__chat_message_dto__e sender);

_api__chat_message_dto__e chat_message_dto_sender_FromString(char* sender);



typedef struct chat_message_dto_t {
    long message_id; //numeric
    char *created_at; //date time
    chat_message_sender_type_t *sender; // custom
    char *message; // string
    list_t *payload; //nonprimitive container

} chat_message_dto_t;

chat_message_dto_t *chat_message_dto_create(
    long message_id,
    char *created_at,
    chat_message_sender_type_t *sender,
    char *message,
    list_t *payload
);

void chat_message_dto_free(chat_message_dto_t *chat_message_dto);

chat_message_dto_t *chat_message_dto_parseFromJSON(cJSON *chat_message_dtoJSON);

cJSON *chat_message_dto_convertToJSON(chat_message_dto_t *chat_message_dto);

#endif /* _chat_message_dto_H_ */

