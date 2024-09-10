/*
 * chat_type.h
 *
 * Тип чата:  * &#x60;CHAT&#x60; — чат с покупателем. * &#x60;ARBITRAGE&#x60; — спор. 
 */

#ifndef _chat_type_H_
#define _chat_type_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct chat_type_t chat_type_t;


// Enum  for chat_type

typedef enum { _api__chat_type__NULL = 0, _api__chat_type__CHAT, _api__chat_type__ARBITRAGE } _api__chat_type__e;

char* chat_type_chat_type_ToString(_api__chat_type__e chat_type);

_api__chat_type__e chat_type_chat_type_FromString(char* chat_type);

//cJSON *chat_type_chat_type_convertToJSON(_api__chat_type__e chat_type);

//_api__chat_type__e chat_type_chat_type_parseFromJSON(cJSON *chat_typeJSON);

#endif /* _chat_type_H_ */

