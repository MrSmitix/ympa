/*
 * get_chats_request.h
 *
 * Фильтры по чатам, которые нужно вернуть. 
 */

#ifndef _get_chats_request_H_
#define _get_chats_request_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct get_chats_request_t get_chats_request_t;

#include "chat_status_type.h"
#include "chat_type.h"

// Enum  for get_chats_request

typedef enum  { _api__get_chats_request__NULL = 0, _api__get_chats_request__CHAT, _api__get_chats_request__ARBITRAGE } _api__get_chats_request__e;

char* get_chats_request_types_ToString(_api__get_chats_request__e types);

_api__get_chats_request__e get_chats_request_types_FromString(char* types);

// Enum  for get_chats_request

typedef enum  { _api__get_chats_request__NULL = 0, _api__get_chats_request___NEW, _api__get_chats_request__WAITING_FOR_CUSTOMER, _api__get_chats_request__WAITING_FOR_PARTNER, _api__get_chats_request__WAITING_FOR_ARBITER, _api__get_chats_request__WAITING_FOR_MARKET, _api__get_chats_request__FINISHED } _api__get_chats_request__e;

char* get_chats_request_statuses_ToString(_api__get_chats_request__e statuses);

_api__get_chats_request__e get_chats_request_statuses_FromString(char* statuses);



typedef struct get_chats_request_t {
    list_t *order_ids; //primitive container
    list_t *types; //nonprimitive container
    list_t *statuses; //nonprimitive container

} get_chats_request_t;

get_chats_request_t *get_chats_request_create(
    list_t *order_ids,
    list_t *types,
    list_t *statuses
);

void get_chats_request_free(get_chats_request_t *get_chats_request);

get_chats_request_t *get_chats_request_parseFromJSON(cJSON *get_chats_requestJSON);

cJSON *get_chats_request_convertToJSON(get_chats_request_t *get_chats_request);

#endif /* _get_chats_request_H_ */

