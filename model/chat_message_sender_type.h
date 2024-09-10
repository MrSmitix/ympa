/*
 * chat_message_sender_type.h
 *
 * Кто отправил сообщение:  * &#x60;PARTNER&#x60; — магазин. * &#x60;CUSTOMER&#x60; — покупатель. * &#x60;MARKET&#x60; — Маркет. * &#x60;SUPPORT&#x60; — сотрудник службы поддержки Маркета. 
 */

#ifndef _chat_message_sender_type_H_
#define _chat_message_sender_type_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct chat_message_sender_type_t chat_message_sender_type_t;


// Enum  for chat_message_sender_type

typedef enum { _api__chat_message_sender_type__NULL = 0, _api__chat_message_sender_type__PARTNER, _api__chat_message_sender_type__CUSTOMER, _api__chat_message_sender_type__MARKET, _api__chat_message_sender_type__SUPPORT } _api__chat_message_sender_type__e;

char* chat_message_sender_type_chat_message_sender_type_ToString(_api__chat_message_sender_type__e chat_message_sender_type);

_api__chat_message_sender_type__e chat_message_sender_type_chat_message_sender_type_FromString(char* chat_message_sender_type);

//cJSON *chat_message_sender_type_chat_message_sender_type_convertToJSON(_api__chat_message_sender_type__e chat_message_sender_type);

//_api__chat_message_sender_type__e chat_message_sender_type_chat_message_sender_type_parseFromJSON(cJSON *chat_message_sender_typeJSON);

#endif /* _chat_message_sender_type_H_ */

