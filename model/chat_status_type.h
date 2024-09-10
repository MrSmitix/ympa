/*
 * chat_status_type.h
 *
 * Статус чата:  * &#x60;NEW&#x60; — новый чат. * &#x60;WAITING_FOR_CUSTOMER&#x60; — нужен ответ покупателя. * &#x60;WAITING_FOR_PARTNER&#x60; — нужен ответ магазина. * &#x60;WAITING_FOR_ARBITER&#x60; — нужен ответ арбитра. * &#x60;WAITING_FOR_MARKET&#x60; — нужен ответ Маркета. * &#x60;FINISHED&#x60; — чат завершен. 
 */

#ifndef _chat_status_type_H_
#define _chat_status_type_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct chat_status_type_t chat_status_type_t;


// Enum  for chat_status_type

typedef enum { _api__chat_status_type__NULL = 0, _api__chat_status_type___NEW, _api__chat_status_type__WAITING_FOR_CUSTOMER, _api__chat_status_type__WAITING_FOR_PARTNER, _api__chat_status_type__WAITING_FOR_ARBITER, _api__chat_status_type__WAITING_FOR_MARKET, _api__chat_status_type__FINISHED } _api__chat_status_type__e;

char* chat_status_type_chat_status_type_ToString(_api__chat_status_type__e chat_status_type);

_api__chat_status_type__e chat_status_type_chat_status_type_FromString(char* chat_status_type);

//cJSON *chat_status_type_chat_status_type_convertToJSON(_api__chat_status_type__e chat_status_type);

//_api__chat_status_type__e chat_status_type_chat_status_type_parseFromJSON(cJSON *chat_status_typeJSON);

#endif /* _chat_status_type_H_ */

