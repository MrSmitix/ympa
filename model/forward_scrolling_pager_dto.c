#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "forward_scrolling_pager_dto.h"



forward_scrolling_pager_dto_t *forward_scrolling_pager_dto_create(
    char *next_page_token
    ) {
    forward_scrolling_pager_dto_t *forward_scrolling_pager_dto_local_var = malloc(sizeof(forward_scrolling_pager_dto_t));
    if (!forward_scrolling_pager_dto_local_var) {
        return NULL;
    }
    forward_scrolling_pager_dto_local_var->next_page_token = next_page_token;

    return forward_scrolling_pager_dto_local_var;
}


void forward_scrolling_pager_dto_free(forward_scrolling_pager_dto_t *forward_scrolling_pager_dto) {
    if(NULL == forward_scrolling_pager_dto){
        return ;
    }
    listEntry_t *listEntry;
    if (forward_scrolling_pager_dto->next_page_token) {
        free(forward_scrolling_pager_dto->next_page_token);
        forward_scrolling_pager_dto->next_page_token = NULL;
    }
    free(forward_scrolling_pager_dto);
}

cJSON *forward_scrolling_pager_dto_convertToJSON(forward_scrolling_pager_dto_t *forward_scrolling_pager_dto) {
    cJSON *item = cJSON_CreateObject();

    // forward_scrolling_pager_dto->next_page_token
    if(forward_scrolling_pager_dto->next_page_token) {
    if(cJSON_AddStringToObject(item, "nextPageToken", forward_scrolling_pager_dto->next_page_token) == NULL) {
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

forward_scrolling_pager_dto_t *forward_scrolling_pager_dto_parseFromJSON(cJSON *forward_scrolling_pager_dtoJSON){

    forward_scrolling_pager_dto_t *forward_scrolling_pager_dto_local_var = NULL;

    // forward_scrolling_pager_dto->next_page_token
    cJSON *next_page_token = cJSON_GetObjectItemCaseSensitive(forward_scrolling_pager_dtoJSON, "nextPageToken");
    if (next_page_token) { 
    if(!cJSON_IsString(next_page_token) && !cJSON_IsNull(next_page_token))
    {
    goto end; //String
    }
    }


    forward_scrolling_pager_dto_local_var = forward_scrolling_pager_dto_create (
        next_page_token && !cJSON_IsNull(next_page_token) ? strdup(next_page_token->valuestring) : NULL
        );

    return forward_scrolling_pager_dto_local_var;
end:
    return NULL;

}
