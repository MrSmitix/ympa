#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "update_goods_feedback_comment_response.h"


char* update_goods_feedback_comment_response_status_ToString(_api__update_goods_feedback_comment_response__e status) {
    char* statusArray[] =  { "NULL", "OK", "ERROR" };
    return statusArray[status];
}

_api__update_goods_feedback_comment_response__e update_goods_feedback_comment_response_status_FromString(char* status){
    int stringToReturn = 0;
    char *statusArray[] =  { "NULL", "OK", "ERROR" };
    size_t sizeofArray = sizeof(statusArray) / sizeof(statusArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(status, statusArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

update_goods_feedback_comment_response_t *update_goods_feedback_comment_response_create(
    api_response_status_type_t *status,
    goods_feedback_comment_dto_t *result
    ) {
    update_goods_feedback_comment_response_t *update_goods_feedback_comment_response_local_var = malloc(sizeof(update_goods_feedback_comment_response_t));
    if (!update_goods_feedback_comment_response_local_var) {
        return NULL;
    }
    update_goods_feedback_comment_response_local_var->status = status;
    update_goods_feedback_comment_response_local_var->result = result;

    return update_goods_feedback_comment_response_local_var;
}


void update_goods_feedback_comment_response_free(update_goods_feedback_comment_response_t *update_goods_feedback_comment_response) {
    if(NULL == update_goods_feedback_comment_response){
        return ;
    }
    listEntry_t *listEntry;
    if (update_goods_feedback_comment_response->status) {
        api_response_status_type_free(update_goods_feedback_comment_response->status);
        update_goods_feedback_comment_response->status = NULL;
    }
    if (update_goods_feedback_comment_response->result) {
        goods_feedback_comment_dto_free(update_goods_feedback_comment_response->result);
        update_goods_feedback_comment_response->result = NULL;
    }
    free(update_goods_feedback_comment_response);
}

cJSON *update_goods_feedback_comment_response_convertToJSON(update_goods_feedback_comment_response_t *update_goods_feedback_comment_response) {
    cJSON *item = cJSON_CreateObject();

    // update_goods_feedback_comment_response->status
    if(update_goods_feedback_comment_response->status != _api__update_goods_feedback_comment_response__NULL) {
    cJSON *status_local_JSON = api_response_status_type_convertToJSON(update_goods_feedback_comment_response->status);
    if(status_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "status", status_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // update_goods_feedback_comment_response->result
    if(update_goods_feedback_comment_response->result) {
    cJSON *result_local_JSON = goods_feedback_comment_dto_convertToJSON(update_goods_feedback_comment_response->result);
    if(result_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "result", result_local_JSON);
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

update_goods_feedback_comment_response_t *update_goods_feedback_comment_response_parseFromJSON(cJSON *update_goods_feedback_comment_responseJSON){

    update_goods_feedback_comment_response_t *update_goods_feedback_comment_response_local_var = NULL;

    // define the local variable for update_goods_feedback_comment_response->status
    api_response_status_type_t *status_local_nonprim = NULL;

    // define the local variable for update_goods_feedback_comment_response->result
    goods_feedback_comment_dto_t *result_local_nonprim = NULL;

    // update_goods_feedback_comment_response->status
    cJSON *status = cJSON_GetObjectItemCaseSensitive(update_goods_feedback_comment_responseJSON, "status");
    if (status) { 
    status_local_nonprim = api_response_status_type_parseFromJSON(status); //custom
    }

    // update_goods_feedback_comment_response->result
    cJSON *result = cJSON_GetObjectItemCaseSensitive(update_goods_feedback_comment_responseJSON, "result");
    if (result) { 
    result_local_nonprim = goods_feedback_comment_dto_parseFromJSON(result); //nonprimitive
    }


    update_goods_feedback_comment_response_local_var = update_goods_feedback_comment_response_create (
        status ? status_local_nonprim : NULL,
        result ? result_local_nonprim : NULL
        );

    return update_goods_feedback_comment_response_local_var;
end:
    if (status_local_nonprim) {
        api_response_status_type_free(status_local_nonprim);
        status_local_nonprim = NULL;
    }
    if (result_local_nonprim) {
        goods_feedback_comment_dto_free(result_local_nonprim);
        result_local_nonprim = NULL;
    }
    return NULL;

}
