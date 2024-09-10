/*
 * get_chat_info_dto.h
 *
 * Информация о чатах.
 */

#ifndef _get_chat_info_dto_H_
#define _get_chat_info_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct get_chat_info_dto_t get_chat_info_dto_t;

#include "chat_status_type.h"
#include "chat_type.h"

// Enum  for get_chat_info_dto

typedef enum  { _api__get_chat_info_dto__NULL = 0, _api__get_chat_info_dto__CHAT, _api__get_chat_info_dto__ARBITRAGE } _api__get_chat_info_dto__e;

char* get_chat_info_dto_type_ToString(_api__get_chat_info_dto__e type);

_api__get_chat_info_dto__e get_chat_info_dto_type_FromString(char* type);

// Enum  for get_chat_info_dto

typedef enum  { _api__get_chat_info_dto__NULL = 0, _api__get_chat_info_dto___NEW, _api__get_chat_info_dto__WAITING_FOR_CUSTOMER, _api__get_chat_info_dto__WAITING_FOR_PARTNER, _api__get_chat_info_dto__WAITING_FOR_ARBITER, _api__get_chat_info_dto__WAITING_FOR_MARKET, _api__get_chat_info_dto__FINISHED } _api__get_chat_info_dto__e;

char* get_chat_info_dto_status_ToString(_api__get_chat_info_dto__e status);

_api__get_chat_info_dto__e get_chat_info_dto_status_FromString(char* status);



typedef struct get_chat_info_dto_t {
    long chat_id; //numeric
    long order_id; //numeric
    chat_type_t *type; // custom
    chat_status_type_t *status; // custom
    char *created_at; //date time
    char *updated_at; //date time

} get_chat_info_dto_t;

get_chat_info_dto_t *get_chat_info_dto_create(
    long chat_id,
    long order_id,
    chat_type_t *type,
    chat_status_type_t *status,
    char *created_at,
    char *updated_at
);

void get_chat_info_dto_free(get_chat_info_dto_t *get_chat_info_dto);

get_chat_info_dto_t *get_chat_info_dto_parseFromJSON(cJSON *get_chat_info_dtoJSON);

cJSON *get_chat_info_dto_convertToJSON(get_chat_info_dto_t *get_chat_info_dto);

#endif /* _get_chat_info_dto_H_ */

