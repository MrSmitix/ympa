#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "scrolling_pager_dto.h"



scrolling_pager_dto_t *scrolling_pager_dto_create(
    char *next_page_token,
    char *prev_page_token
    ) {
    scrolling_pager_dto_t *scrolling_pager_dto_local_var = malloc(sizeof(scrolling_pager_dto_t));
    if (!scrolling_pager_dto_local_var) {
        return NULL;
    }
    scrolling_pager_dto_local_var->next_page_token = next_page_token;
    scrolling_pager_dto_local_var->prev_page_token = prev_page_token;

    return scrolling_pager_dto_local_var;
}


void scrolling_pager_dto_free(scrolling_pager_dto_t *scrolling_pager_dto) {
    if(NULL == scrolling_pager_dto){
        return ;
    }
    listEntry_t *listEntry;
    if (scrolling_pager_dto->next_page_token) {
        free(scrolling_pager_dto->next_page_token);
        scrolling_pager_dto->next_page_token = NULL;
    }
    if (scrolling_pager_dto->prev_page_token) {
        free(scrolling_pager_dto->prev_page_token);
        scrolling_pager_dto->prev_page_token = NULL;
    }
    free(scrolling_pager_dto);
}

cJSON *scrolling_pager_dto_convertToJSON(scrolling_pager_dto_t *scrolling_pager_dto) {
    cJSON *item = cJSON_CreateObject();

    // scrolling_pager_dto->next_page_token
    if(scrolling_pager_dto->next_page_token) {
    if(cJSON_AddStringToObject(item, "nextPageToken", scrolling_pager_dto->next_page_token) == NULL) {
    goto fail; //String
    }
    }


    // scrolling_pager_dto->prev_page_token
    if(scrolling_pager_dto->prev_page_token) {
    if(cJSON_AddStringToObject(item, "prevPageToken", scrolling_pager_dto->prev_page_token) == NULL) {
    goto fail; //String
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

scrolling_pager_dto_t *scrolling_pager_dto_parseFromJSON(cJSON *scrolling_pager_dtoJSON){

    scrolling_pager_dto_t *scrolling_pager_dto_local_var = NULL;

    // scrolling_pager_dto->next_page_token
    cJSON *next_page_token = cJSON_GetObjectItemCaseSensitive(scrolling_pager_dtoJSON, "nextPageToken");
    if (next_page_token) { 
    if(!cJSON_IsString(next_page_token) && !cJSON_IsNull(next_page_token))
    {
    goto end; //String
    }
    }

    // scrolling_pager_dto->prev_page_token
    cJSON *prev_page_token = cJSON_GetObjectItemCaseSensitive(scrolling_pager_dtoJSON, "prevPageToken");
    if (prev_page_token) { 
    if(!cJSON_IsString(prev_page_token) && !cJSON_IsNull(prev_page_token))
    {
    goto end; //String
    }
    }


    scrolling_pager_dto_local_var = scrolling_pager_dto_create (
        next_page_token && !cJSON_IsNull(next_page_token) ? strdup(next_page_token->valuestring) : NULL,
        prev_page_token && !cJSON_IsNull(prev_page_token) ? strdup(prev_page_token->valuestring) : NULL
        );

    return scrolling_pager_dto_local_var;
end:
    return NULL;

}
