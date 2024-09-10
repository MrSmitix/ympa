#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "feedback_list_dto.h"



feedback_list_dto_t *feedback_list_dto_create(
    scrolling_pager_dto_t *paging,
    list_t *feedback_list
    ) {
    feedback_list_dto_t *feedback_list_dto_local_var = malloc(sizeof(feedback_list_dto_t));
    if (!feedback_list_dto_local_var) {
        return NULL;
    }
    feedback_list_dto_local_var->paging = paging;
    feedback_list_dto_local_var->feedback_list = feedback_list;

    return feedback_list_dto_local_var;
}


void feedback_list_dto_free(feedback_list_dto_t *feedback_list_dto) {
    if(NULL == feedback_list_dto){
        return ;
    }
    listEntry_t *listEntry;
    if (feedback_list_dto->paging) {
        scrolling_pager_dto_free(feedback_list_dto->paging);
        feedback_list_dto->paging = NULL;
    }
    if (feedback_list_dto->feedback_list) {
        list_ForEach(listEntry, feedback_list_dto->feedback_list) {
            feedback_dto_free(listEntry->data);
        }
        list_freeList(feedback_list_dto->feedback_list);
        feedback_list_dto->feedback_list = NULL;
    }
    free(feedback_list_dto);
}

cJSON *feedback_list_dto_convertToJSON(feedback_list_dto_t *feedback_list_dto) {
    cJSON *item = cJSON_CreateObject();

    // feedback_list_dto->paging
    if(feedback_list_dto->paging) {
    cJSON *paging_local_JSON = scrolling_pager_dto_convertToJSON(feedback_list_dto->paging);
    if(paging_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "paging", paging_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // feedback_list_dto->feedback_list
    if (!feedback_list_dto->feedback_list) {
        goto fail;
    }
    cJSON *feedback_list = cJSON_AddArrayToObject(item, "feedbackList");
    if(feedback_list == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *feedback_listListEntry;
    if (feedback_list_dto->feedback_list) {
    list_ForEach(feedback_listListEntry, feedback_list_dto->feedback_list) {
    cJSON *itemLocal = feedback_dto_convertToJSON(feedback_listListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(feedback_list, itemLocal);
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

feedback_list_dto_t *feedback_list_dto_parseFromJSON(cJSON *feedback_list_dtoJSON){

    feedback_list_dto_t *feedback_list_dto_local_var = NULL;

    // define the local variable for feedback_list_dto->paging
    scrolling_pager_dto_t *paging_local_nonprim = NULL;

    // define the local list for feedback_list_dto->feedback_list
    list_t *feedback_listList = NULL;

    // feedback_list_dto->paging
    cJSON *paging = cJSON_GetObjectItemCaseSensitive(feedback_list_dtoJSON, "paging");
    if (paging) { 
    paging_local_nonprim = scrolling_pager_dto_parseFromJSON(paging); //nonprimitive
    }

    // feedback_list_dto->feedback_list
    cJSON *feedback_list = cJSON_GetObjectItemCaseSensitive(feedback_list_dtoJSON, "feedbackList");
    if (!feedback_list) {
        goto end;
    }

    
    cJSON *feedback_list_local_nonprimitive = NULL;
    if(!cJSON_IsArray(feedback_list)){
        goto end; //nonprimitive container
    }

    feedback_listList = list_createList();

    cJSON_ArrayForEach(feedback_list_local_nonprimitive,feedback_list )
    {
        if(!cJSON_IsObject(feedback_list_local_nonprimitive)){
            goto end;
        }
        feedback_dto_t *feedback_listItem = feedback_dto_parseFromJSON(feedback_list_local_nonprimitive);

        list_addElement(feedback_listList, feedback_listItem);
    }


    feedback_list_dto_local_var = feedback_list_dto_create (
        paging ? paging_local_nonprim : NULL,
        feedback_listList
        );

    return feedback_list_dto_local_var;
end:
    if (paging_local_nonprim) {
        scrolling_pager_dto_free(paging_local_nonprim);
        paging_local_nonprim = NULL;
    }
    if (feedback_listList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, feedback_listList) {
            feedback_dto_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(feedback_listList);
        feedback_listList = NULL;
    }
    return NULL;

}
