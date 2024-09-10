#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "skip_goods_feedback_reaction_request.h"



skip_goods_feedback_reaction_request_t *skip_goods_feedback_reaction_request_create(
    list_t *feedback_ids
    ) {
    skip_goods_feedback_reaction_request_t *skip_goods_feedback_reaction_request_local_var = malloc(sizeof(skip_goods_feedback_reaction_request_t));
    if (!skip_goods_feedback_reaction_request_local_var) {
        return NULL;
    }
    skip_goods_feedback_reaction_request_local_var->feedback_ids = feedback_ids;

    return skip_goods_feedback_reaction_request_local_var;
}


void skip_goods_feedback_reaction_request_free(skip_goods_feedback_reaction_request_t *skip_goods_feedback_reaction_request) {
    if(NULL == skip_goods_feedback_reaction_request){
        return ;
    }
    listEntry_t *listEntry;
    if (skip_goods_feedback_reaction_request->feedback_ids) {
        list_ForEach(listEntry, skip_goods_feedback_reaction_request->feedback_ids) {
            free(listEntry->data);
        }
        list_freeList(skip_goods_feedback_reaction_request->feedback_ids);
        skip_goods_feedback_reaction_request->feedback_ids = NULL;
    }
    free(skip_goods_feedback_reaction_request);
}

cJSON *skip_goods_feedback_reaction_request_convertToJSON(skip_goods_feedback_reaction_request_t *skip_goods_feedback_reaction_request) {
    cJSON *item = cJSON_CreateObject();

    // skip_goods_feedback_reaction_request->feedback_ids
    if (!skip_goods_feedback_reaction_request->feedback_ids) {
        goto fail;
    }
    cJSON *feedback_ids = cJSON_AddArrayToObject(item, "feedbackIds");
    if(feedback_ids == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *feedback_idsListEntry;
    list_ForEach(feedback_idsListEntry, skip_goods_feedback_reaction_request->feedback_ids) {
    if(cJSON_AddNumberToObject(feedback_ids, "", *(double *)feedback_idsListEntry->data) == NULL)
    {
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

skip_goods_feedback_reaction_request_t *skip_goods_feedback_reaction_request_parseFromJSON(cJSON *skip_goods_feedback_reaction_requestJSON){

    skip_goods_feedback_reaction_request_t *skip_goods_feedback_reaction_request_local_var = NULL;

    // define the local list for skip_goods_feedback_reaction_request->feedback_ids
    list_t *feedback_idsList = NULL;

    // skip_goods_feedback_reaction_request->feedback_ids
    cJSON *feedback_ids = cJSON_GetObjectItemCaseSensitive(skip_goods_feedback_reaction_requestJSON, "feedbackIds");
    if (!feedback_ids) {
        goto end;
    }

    
    cJSON *feedback_ids_local = NULL;
    if(!cJSON_IsArray(feedback_ids)) {
        goto end;//primitive container
    }
    feedback_idsList = list_createList();

    cJSON_ArrayForEach(feedback_ids_local, feedback_ids)
    {
        if(!cJSON_IsNumber(feedback_ids_local))
        {
            goto end;
        }
        double *feedback_ids_local_value = (double *)calloc(1, sizeof(double));
        if(!feedback_ids_local_value)
        {
            goto end;
        }
        *feedback_ids_local_value = feedback_ids_local->valuedouble;
        list_addElement(feedback_idsList , feedback_ids_local_value);
    }


    skip_goods_feedback_reaction_request_local_var = skip_goods_feedback_reaction_request_create (
        feedback_idsList
        );

    return skip_goods_feedback_reaction_request_local_var;
end:
    if (feedback_idsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, feedback_idsList) {
            free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(feedback_idsList);
        feedback_idsList = NULL;
    }
    return NULL;

}
