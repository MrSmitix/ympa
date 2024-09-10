#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "get_goods_feedback_comments_request.h"



get_goods_feedback_comments_request_t *get_goods_feedback_comments_request_create(
    long feedback_id
    ) {
    get_goods_feedback_comments_request_t *get_goods_feedback_comments_request_local_var = malloc(sizeof(get_goods_feedback_comments_request_t));
    if (!get_goods_feedback_comments_request_local_var) {
        return NULL;
    }
    get_goods_feedback_comments_request_local_var->feedback_id = feedback_id;

    return get_goods_feedback_comments_request_local_var;
}


void get_goods_feedback_comments_request_free(get_goods_feedback_comments_request_t *get_goods_feedback_comments_request) {
    if(NULL == get_goods_feedback_comments_request){
        return ;
    }
    listEntry_t *listEntry;
    free(get_goods_feedback_comments_request);
}

cJSON *get_goods_feedback_comments_request_convertToJSON(get_goods_feedback_comments_request_t *get_goods_feedback_comments_request) {
    cJSON *item = cJSON_CreateObject();

    // get_goods_feedback_comments_request->feedback_id
    if (!get_goods_feedback_comments_request->feedback_id) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "feedbackId", get_goods_feedback_comments_request->feedback_id) == NULL) {
    goto fail; //Numeric
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

get_goods_feedback_comments_request_t *get_goods_feedback_comments_request_parseFromJSON(cJSON *get_goods_feedback_comments_requestJSON){

    get_goods_feedback_comments_request_t *get_goods_feedback_comments_request_local_var = NULL;

    // get_goods_feedback_comments_request->feedback_id
    cJSON *feedback_id = cJSON_GetObjectItemCaseSensitive(get_goods_feedback_comments_requestJSON, "feedbackId");
    if (!feedback_id) {
        goto end;
    }

    
    if(!cJSON_IsNumber(feedback_id))
    {
    goto end; //Numeric
    }


    get_goods_feedback_comments_request_local_var = get_goods_feedback_comments_request_create (
        feedback_id->valuedouble
        );

    return get_goods_feedback_comments_request_local_var;
end:
    return NULL;

}
