/*
 * create_chat_result_dto.h
 *
 * Информация о созданном чате.
 */

#ifndef _create_chat_result_dto_H_
#define _create_chat_result_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct create_chat_result_dto_t create_chat_result_dto_t;




typedef struct create_chat_result_dto_t {
    long chat_id; //numeric

} create_chat_result_dto_t;

create_chat_result_dto_t *create_chat_result_dto_create(
    long chat_id
);

void create_chat_result_dto_free(create_chat_result_dto_t *create_chat_result_dto);

create_chat_result_dto_t *create_chat_result_dto_parseFromJSON(cJSON *create_chat_result_dtoJSON);

cJSON *create_chat_result_dto_convertToJSON(create_chat_result_dto_t *create_chat_result_dto);

#endif /* _create_chat_result_dto_H_ */

