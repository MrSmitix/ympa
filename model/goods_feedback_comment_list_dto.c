#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "goods_feedback_comment_list_dto.h"



goods_feedback_comment_list_dto_t *goods_feedback_comment_list_dto_create(
    list_t *comments,
    forward_scrolling_pager_dto_t *paging
    ) {
    goods_feedback_comment_list_dto_t *goods_feedback_comment_list_dto_local_var = malloc(sizeof(goods_feedback_comment_list_dto_t));
    if (!goods_feedback_comment_list_dto_local_var) {
        return NULL;
    }
    goods_feedback_comment_list_dto_local_var->comments = comments;
    goods_feedback_comment_list_dto_local_var->paging = paging;

    return goods_feedback_comment_list_dto_local_var;
}


void goods_feedback_comment_list_dto_free(goods_feedback_comment_list_dto_t *goods_feedback_comment_list_dto) {
    if(NULL == goods_feedback_comment_list_dto){
        return ;
    }
    listEntry_t *listEntry;
    if (goods_feedback_comment_list_dto->comments) {
        list_ForEach(listEntry, goods_feedback_comment_list_dto->comments) {
            goods_feedback_comment_dto_free(listEntry->data);
        }
        list_freeList(goods_feedback_comment_list_dto->comments);
        goods_feedback_comment_list_dto->comments = NULL;
    }
    if (goods_feedback_comment_list_dto->paging) {
        forward_scrolling_pager_dto_free(goods_feedback_comment_list_dto->paging);
        goods_feedback_comment_list_dto->paging = NULL;
    }
    free(goods_feedback_comment_list_dto);
}

cJSON *goods_feedback_comment_list_dto_convertToJSON(goods_feedback_comment_list_dto_t *goods_feedback_comment_list_dto) {
    cJSON *item = cJSON_CreateObject();

    // goods_feedback_comment_list_dto->comments
    if (!goods_feedback_comment_list_dto->comments) {
        goto fail;
    }
    cJSON *comments = cJSON_AddArrayToObject(item, "comments");
    if(comments == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *commentsListEntry;
    if (goods_feedback_comment_list_dto->comments) {
    list_ForEach(commentsListEntry, goods_feedback_comment_list_dto->comments) {
    cJSON *itemLocal = goods_feedback_comment_dto_convertToJSON(commentsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(comments, itemLocal);
    }
    }


    // goods_feedback_comment_list_dto->paging
    if(goods_feedback_comment_list_dto->paging) {
    cJSON *paging_local_JSON = forward_scrolling_pager_dto_convertToJSON(goods_feedback_comment_list_dto->paging);
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

goods_feedback_comment_list_dto_t *goods_feedback_comment_list_dto_parseFromJSON(cJSON *goods_feedback_comment_list_dtoJSON){

    goods_feedback_comment_list_dto_t *goods_feedback_comment_list_dto_local_var = NULL;

    // define the local list for goods_feedback_comment_list_dto->comments
    list_t *commentsList = NULL;

    // define the local variable for goods_feedback_comment_list_dto->paging
    forward_scrolling_pager_dto_t *paging_local_nonprim = NULL;

    // goods_feedback_comment_list_dto->comments
    cJSON *comments = cJSON_GetObjectItemCaseSensitive(goods_feedback_comment_list_dtoJSON, "comments");
    if (!comments) {
        goto end;
    }

    
    cJSON *comments_local_nonprimitive = NULL;
    if(!cJSON_IsArray(comments)){
        goto end; //nonprimitive container
    }

    commentsList = list_createList();

    cJSON_ArrayForEach(comments_local_nonprimitive,comments )
    {
        if(!cJSON_IsObject(comments_local_nonprimitive)){
            goto end;
        }
        goods_feedback_comment_dto_t *commentsItem = goods_feedback_comment_dto_parseFromJSON(comments_local_nonprimitive);

        list_addElement(commentsList, commentsItem);
    }

    // goods_feedback_comment_list_dto->paging
    cJSON *paging = cJSON_GetObjectItemCaseSensitive(goods_feedback_comment_list_dtoJSON, "paging");
    if (paging) { 
    paging_local_nonprim = forward_scrolling_pager_dto_parseFromJSON(paging); //nonprimitive
    }


    goods_feedback_comment_list_dto_local_var = goods_feedback_comment_list_dto_create (
        commentsList,
        paging ? paging_local_nonprim : NULL
        );

    return goods_feedback_comment_list_dto_local_var;
end:
    if (commentsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, commentsList) {
            goods_feedback_comment_dto_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(commentsList);
        commentsList = NULL;
    }
    if (paging_local_nonprim) {
        forward_scrolling_pager_dto_free(paging_local_nonprim);
        paging_local_nonprim = NULL;
    }
    return NULL;

}
