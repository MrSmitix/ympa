#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "delete_goods_feedback_comment_request.h"



delete_goods_feedback_comment_request_t *delete_goods_feedback_comment_request_create(
    long id
    ) {
    delete_goods_feedback_comment_request_t *delete_goods_feedback_comment_request_local_var = malloc(sizeof(delete_goods_feedback_comment_request_t));
    if (!delete_goods_feedback_comment_request_local_var) {
        return NULL;
    }
    delete_goods_feedback_comment_request_local_var->id = id;

    return delete_goods_feedback_comment_request_local_var;
}


void delete_goods_feedback_comment_request_free(delete_goods_feedback_comment_request_t *delete_goods_feedback_comment_request) {
    if(NULL == delete_goods_feedback_comment_request){
        return ;
    }
    listEntry_t *listEntry;
    free(delete_goods_feedback_comment_request);
}

cJSON *delete_goods_feedback_comment_request_convertToJSON(delete_goods_feedback_comment_request_t *delete_goods_feedback_comment_request) {
    cJSON *item = cJSON_CreateObject();

    // delete_goods_feedback_comment_request->id
    if (!delete_goods_feedback_comment_request->id) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "id", delete_goods_feedback_comment_request->id) == NULL) {
    goto fail; //Numeric
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

delete_goods_feedback_comment_request_t *delete_goods_feedback_comment_request_parseFromJSON(cJSON *delete_goods_feedback_comment_requestJSON){

    delete_goods_feedback_comment_request_t *delete_goods_feedback_comment_request_local_var = NULL;

    // delete_goods_feedback_comment_request->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(delete_goods_feedback_comment_requestJSON, "id");
    if (!id) {
        goto end;
    }

    
    if(!cJSON_IsNumber(id))
    {
    goto end; //Numeric
    }


    delete_goods_feedback_comment_request_local_var = delete_goods_feedback_comment_request_create (
        id->valuedouble
        );

    return delete_goods_feedback_comment_request_local_var;
end:
    return NULL;

}
