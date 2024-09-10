/*
 * get_chats_info_dto.h
 *
 * Список чатов.
 */

#ifndef _get_chats_info_dto_H_
#define _get_chats_info_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct get_chats_info_dto_t get_chats_info_dto_t;

#include "forward_scrolling_pager_dto.h"
#include "get_chat_info_dto.h"



typedef struct get_chats_info_dto_t {
    list_t *chats; //nonprimitive container
    struct forward_scrolling_pager_dto_t *paging; //model

} get_chats_info_dto_t;

get_chats_info_dto_t *get_chats_info_dto_create(
    list_t *chats,
    forward_scrolling_pager_dto_t *paging
);

void get_chats_info_dto_free(get_chats_info_dto_t *get_chats_info_dto);

get_chats_info_dto_t *get_chats_info_dto_parseFromJSON(cJSON *get_chats_info_dtoJSON);

cJSON *get_chats_info_dto_convertToJSON(get_chats_info_dto_t *get_chats_info_dto);

#endif /* _get_chats_info_dto_H_ */

