/*
 * chat_messages_result_dto.h
 *
 * Информация о сообщениях.
 */

#ifndef _chat_messages_result_dto_H_
#define _chat_messages_result_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct chat_messages_result_dto_t chat_messages_result_dto_t;

#include "chat_message_dto.h"
#include "forward_scrolling_pager_dto.h"



typedef struct chat_messages_result_dto_t {
    long order_id; //numeric
    list_t *messages; //nonprimitive container
    struct forward_scrolling_pager_dto_t *paging; //model

} chat_messages_result_dto_t;

chat_messages_result_dto_t *chat_messages_result_dto_create(
    long order_id,
    list_t *messages,
    forward_scrolling_pager_dto_t *paging
);

void chat_messages_result_dto_free(chat_messages_result_dto_t *chat_messages_result_dto);

chat_messages_result_dto_t *chat_messages_result_dto_parseFromJSON(cJSON *chat_messages_result_dtoJSON);

cJSON *chat_messages_result_dto_convertToJSON(chat_messages_result_dto_t *chat_messages_result_dto);

#endif /* _chat_messages_result_dto_H_ */

