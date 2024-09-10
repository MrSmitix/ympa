#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "get_chats_info_dto.h"



get_chats_info_dto_t *get_chats_info_dto_create(
    list_t *chats,
    forward_scrolling_pager_dto_t *paging
    ) {
    get_chats_info_dto_t *get_chats_info_dto_local_var = malloc(sizeof(get_chats_info_dto_t));
    if (!get_chats_info_dto_local_var) {
        return NULL;
    }
    get_chats_info_dto_local_var->chats = chats;
    get_chats_info_dto_local_var->paging = paging;

    return get_chats_info_dto_local_var;
}


void get_chats_info_dto_free(get_chats_info_dto_t *get_chats_info_dto) {
    if(NULL == get_chats_info_dto){
        return ;
    }
    listEntry_t *listEntry;
    if (get_chats_info_dto->chats) {
        list_ForEach(listEntry, get_chats_info_dto->chats) {
            get_chat_info_dto_free(listEntry->data);
        }
        list_freeList(get_chats_info_dto->chats);
        get_chats_info_dto->chats = NULL;
    }
    if (get_chats_info_dto->paging) {
        forward_scrolling_pager_dto_free(get_chats_info_dto->paging);
        get_chats_info_dto->paging = NULL;
    }
    free(get_chats_info_dto);
}

cJSON *get_chats_info_dto_convertToJSON(get_chats_info_dto_t *get_chats_info_dto) {
    cJSON *item = cJSON_CreateObject();

    // get_chats_info_dto->chats
    if (!get_chats_info_dto->chats) {
        goto fail;
    }
    cJSON *chats = cJSON_AddArrayToObject(item, "chats");
    if(chats == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *chatsListEntry;
    if (get_chats_info_dto->chats) {
    list_ForEach(chatsListEntry, get_chats_info_dto->chats) {
    cJSON *itemLocal = get_chat_info_dto_convertToJSON(chatsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(chats, itemLocal);
    }
    }


    // get_chats_info_dto->paging
    if(get_chats_info_dto->paging) {
    cJSON *paging_local_JSON = forward_scrolling_pager_dto_convertToJSON(get_chats_info_dto->paging);
    if(paging_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "paging", paging_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

get_chats_info_dto_t *get_chats_info_dto_parseFromJSON(cJSON *get_chats_info_dtoJSON){

    get_chats_info_dto_t *get_chats_info_dto_local_var = NULL;

    // define the local list for get_chats_info_dto->chats
    list_t *chatsList = NULL;

    // define the local variable for get_chats_info_dto->paging
    forward_scrolling_pager_dto_t *paging_local_nonprim = NULL;

    // get_chats_info_dto->chats
    cJSON *chats = cJSON_GetObjectItemCaseSensitive(get_chats_info_dtoJSON, "chats");
    if (!chats) {
        goto end;
    }

    
    cJSON *chats_local_nonprimitive = NULL;
    if(!cJSON_IsArray(chats)){
        goto end; //nonprimitive container
    }

    chatsList = list_createList();

    cJSON_ArrayForEach(chats_local_nonprimitive,chats )
    {
        if(!cJSON_IsObject(chats_local_nonprimitive)){
            goto end;
        }
        get_chat_info_dto_t *chatsItem = get_chat_info_dto_parseFromJSON(chats_local_nonprimitive);

        list_addElement(chatsList, chatsItem);
    }

    // get_chats_info_dto->paging
    cJSON *paging = cJSON_GetObjectItemCaseSensitive(get_chats_info_dtoJSON, "paging");
    if (paging) { 
    paging_local_nonprim = forward_scrolling_pager_dto_parseFromJSON(paging); //nonprimitive
    }


    get_chats_info_dto_local_var = get_chats_info_dto_create (
        chatsList,
        paging ? paging_local_nonprim : NULL
        );

    return get_chats_info_dto_local_var;
end:
    if (chatsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, chatsList) {
            get_chat_info_dto_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(chatsList);
        chatsList = NULL;
    }
    if (paging_local_nonprim) {
        forward_scrolling_pager_dto_free(paging_local_nonprim);
        paging_local_nonprim = NULL;
    }
    return NULL;

}
