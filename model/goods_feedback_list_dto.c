#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "goods_feedback_list_dto.h"



goods_feedback_list_dto_t *goods_feedback_list_dto_create(
    list_t *feedbacks,
    forward_scrolling_pager_dto_t *paging
    ) {
    goods_feedback_list_dto_t *goods_feedback_list_dto_local_var = malloc(sizeof(goods_feedback_list_dto_t));
    if (!goods_feedback_list_dto_local_var) {
        return NULL;
    }
    goods_feedback_list_dto_local_var->feedbacks = feedbacks;
    goods_feedback_list_dto_local_var->paging = paging;

    return goods_feedback_list_dto_local_var;
}


void goods_feedback_list_dto_free(goods_feedback_list_dto_t *goods_feedback_list_dto) {
    if(NULL == goods_feedback_list_dto){
        return ;
    }
    listEntry_t *listEntry;
    if (goods_feedback_list_dto->feedbacks) {
        list_ForEach(listEntry, goods_feedback_list_dto->feedbacks) {
            goods_feedback_dto_free(listEntry->data);
        }
        list_freeList(goods_feedback_list_dto->feedbacks);
        goods_feedback_list_dto->feedbacks = NULL;
    }
    if (goods_feedback_list_dto->paging) {
        forward_scrolling_pager_dto_free(goods_feedback_list_dto->paging);
        goods_feedback_list_dto->paging = NULL;
    }
    free(goods_feedback_list_dto);
}

cJSON *goods_feedback_list_dto_convertToJSON(goods_feedback_list_dto_t *goods_feedback_list_dto) {
    cJSON *item = cJSON_CreateObject();

    // goods_feedback_list_dto->feedbacks
    if (!goods_feedback_list_dto->feedbacks) {
        goto fail;
    }
    cJSON *feedbacks = cJSON_AddArrayToObject(item, "feedbacks");
    if(feedbacks == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *feedbacksListEntry;
    if (goods_feedback_list_dto->feedbacks) {
    list_ForEach(feedbacksListEntry, goods_feedback_list_dto->feedbacks) {
    cJSON *itemLocal = goods_feedback_dto_convertToJSON(feedbacksListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(feedbacks, itemLocal);
    }
    }


    // goods_feedback_list_dto->paging
    if(goods_feedback_list_dto->paging) {
    cJSON *paging_local_JSON = forward_scrolling_pager_dto_convertToJSON(goods_feedback_list_dto->paging);
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

goods_feedback_list_dto_t *goods_feedback_list_dto_parseFromJSON(cJSON *goods_feedback_list_dtoJSON){

    goods_feedback_list_dto_t *goods_feedback_list_dto_local_var = NULL;

    // define the local list for goods_feedback_list_dto->feedbacks
    list_t *feedbacksList = NULL;

    // define the local variable for goods_feedback_list_dto->paging
    forward_scrolling_pager_dto_t *paging_local_nonprim = NULL;

    // goods_feedback_list_dto->feedbacks
    cJSON *feedbacks = cJSON_GetObjectItemCaseSensitive(goods_feedback_list_dtoJSON, "feedbacks");
    if (!feedbacks) {
        goto end;
    }

    
    cJSON *feedbacks_local_nonprimitive = NULL;
    if(!cJSON_IsArray(feedbacks)){
        goto end; //nonprimitive container
    }

    feedbacksList = list_createList();

    cJSON_ArrayForEach(feedbacks_local_nonprimitive,feedbacks )
    {
        if(!cJSON_IsObject(feedbacks_local_nonprimitive)){
            goto end;
        }
        goods_feedback_dto_t *feedbacksItem = goods_feedback_dto_parseFromJSON(feedbacks_local_nonprimitive);

        list_addElement(feedbacksList, feedbacksItem);
    }

    // goods_feedback_list_dto->paging
    cJSON *paging = cJSON_GetObjectItemCaseSensitive(goods_feedback_list_dtoJSON, "paging");
    if (paging) { 
    paging_local_nonprim = forward_scrolling_pager_dto_parseFromJSON(paging); //nonprimitive
    }


    goods_feedback_list_dto_local_var = goods_feedback_list_dto_create (
        feedbacksList,
        paging ? paging_local_nonprim : NULL
        );

    return goods_feedback_list_dto_local_var;
end:
    if (feedbacksList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, feedbacksList) {
            goods_feedback_dto_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(feedbacksList);
        feedbacksList = NULL;
    }
    if (paging_local_nonprim) {
        forward_scrolling_pager_dto_free(paging_local_nonprim);
        paging_local_nonprim = NULL;
    }
    return NULL;

}
