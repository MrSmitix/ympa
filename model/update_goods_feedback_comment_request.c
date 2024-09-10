#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "update_goods_feedback_comment_request.h"



update_goods_feedback_comment_request_t *update_goods_feedback_comment_request_create(
    long feedback_id,
    update_goods_feedback_comment_dto_t *comment
    ) {
    update_goods_feedback_comment_request_t *update_goods_feedback_comment_request_local_var = malloc(sizeof(update_goods_feedback_comment_request_t));
    if (!update_goods_feedback_comment_request_local_var) {
        return NULL;
    }
    update_goods_feedback_comment_request_local_var->feedback_id = feedback_id;
    update_goods_feedback_comment_request_local_var->comment = comment;

    return update_goods_feedback_comment_request_local_var;
}


void update_goods_feedback_comment_request_free(update_goods_feedback_comment_request_t *update_goods_feedback_comment_request) {
    if(NULL == update_goods_feedback_comment_request){
        return ;
    }
    listEntry_t *listEntry;
    if (update_goods_feedback_comment_request->comment) {
        update_goods_feedback_comment_dto_free(update_goods_feedback_comment_request->comment);
        update_goods_feedback_comment_request->comment = NULL;
    }
    free(update_goods_feedback_comment_request);
}

cJSON *update_goods_feedback_comment_request_convertToJSON(update_goods_feedback_comment_request_t *update_goods_feedback_comment_request) {
    cJSON *item = cJSON_CreateObject();

    // update_goods_feedback_comment_request->feedback_id
    if (!update_goods_feedback_comment_request->feedback_id) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "feedbackId", update_goods_feedback_comment_request->feedback_id) == NULL) {
    goto fail; //Numeric
    }


    // update_goods_feedback_comment_request->comment
    if (!update_goods_feedback_comment_request->comment) {
        goto fail;
    }
    cJSON *comment_local_JSON = update_goods_feedback_comment_dto_convertToJSON(update_goods_feedback_comment_request->comment);
    if(comment_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "comment", comment_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

update_goods_feedback_comment_request_t *update_goods_feedback_comment_request_parseFromJSON(cJSON *update_goods_feedback_comment_requestJSON){

    update_goods_feedback_comment_request_t *update_goods_feedback_comment_request_local_var = NULL;

    // define the local variable for update_goods_feedback_comment_request->comment
    update_goods_feedback_comment_dto_t *comment_local_nonprim = NULL;

    // update_goods_feedback_comment_request->feedback_id
    cJSON *feedback_id = cJSON_GetObjectItemCaseSensitive(update_goods_feedback_comment_requestJSON, "feedbackId");
    if (!feedback_id) {
        goto end;
    }

    
    if(!cJSON_IsNumber(feedback_id))
    {
    goto end; //Numeric
    }

    // update_goods_feedback_comment_request->comment
    cJSON *comment = cJSON_GetObjectItemCaseSensitive(update_goods_feedback_comment_requestJSON, "comment");
    if (!comment) {
        goto end;
    }

    
    comment_local_nonprim = update_goods_feedback_comment_dto_parseFromJSON(comment); //nonprimitive


    update_goods_feedback_comment_request_local_var = update_goods_feedback_comment_request_create (
        feedback_id->valuedouble,
        comment_local_nonprim
        );

    return update_goods_feedback_comment_request_local_var;
end:
    if (comment_local_nonprim) {
        update_goods_feedback_comment_dto_free(comment_local_nonprim);
        comment_local_nonprim = NULL;
    }
    return NULL;

}
