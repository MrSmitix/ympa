#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "get_goods_feedback_response.h"


char* get_goods_feedback_response_status_ToString(_api__get_goods_feedback_response__e status) {
    char* statusArray[] =  { "NULL", "OK", "ERROR" };
    return statusArray[status];
}

_api__get_goods_feedback_response__e get_goods_feedback_response_status_FromString(char* status){
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

get_goods_feedback_response_t *get_goods_feedback_response_create(
    api_response_status_type_t *status,
    goods_feedback_list_dto_t *result
    ) {
    get_goods_feedback_response_t *get_goods_feedback_response_local_var = malloc(sizeof(get_goods_feedback_response_t));
    if (!get_goods_feedback_response_local_var) {
        return NULL;
    }
    get_goods_feedback_response_local_var->status = status;
    get_goods_feedback_response_local_var->result = result;

    return get_goods_feedback_response_local_var;
}


void get_goods_feedback_response_free(get_goods_feedback_response_t *get_goods_feedback_response) {
    if(NULL == get_goods_feedback_response){
        return ;
    }
    listEntry_t *listEntry;
    if (get_goods_feedback_response->status) {
        api_response_status_type_free(get_goods_feedback_response->status);
        get_goods_feedback_response->status = NULL;
    }
    if (get_goods_feedback_response->result) {
        goods_feedback_list_dto_free(get_goods_feedback_response->result);
        get_goods_feedback_response->result = NULL;
    }
    free(get_goods_feedback_response);
}

cJSON *get_goods_feedback_response_convertToJSON(get_goods_feedback_response_t *get_goods_feedback_response) {
    cJSON *item = cJSON_CreateObject();

    // get_goods_feedback_response->status
    if(get_goods_feedback_response->status != _api__get_goods_feedback_response__NULL) {
    cJSON *status_local_JSON = api_response_status_type_convertToJSON(get_goods_feedback_response->status);
    if(status_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "status", status_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // get_goods_feedback_response->result
    if(get_goods_feedback_response->result) {
    cJSON *result_local_JSON = goods_feedback_list_dto_convertToJSON(get_goods_feedback_response->result);
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

get_goods_feedback_response_t *get_goods_feedback_response_parseFromJSON(cJSON *get_goods_feedback_responseJSON){

    get_goods_feedback_response_t *get_goods_feedback_response_local_var = NULL;

    // define the local variable for get_goods_feedback_response->status
    api_response_status_type_t *status_local_nonprim = NULL;

    // define the local variable for get_goods_feedback_response->result
    goods_feedback_list_dto_t *result_local_nonprim = NULL;

    // get_goods_feedback_response->status
    cJSON *status = cJSON_GetObjectItemCaseSensitive(get_goods_feedback_responseJSON, "status");
    if (status) { 
    status_local_nonprim = api_response_status_type_parseFromJSON(status); //custom
    }

    // get_goods_feedback_response->result
    cJSON *result = cJSON_GetObjectItemCaseSensitive(get_goods_feedback_responseJSON, "result");
    if (result) { 
    result_local_nonprim = goods_feedback_list_dto_parseFromJSON(result); //nonprimitive
    }


    get_goods_feedback_response_local_var = get_goods_feedback_response_create (
        status ? status_local_nonprim : NULL,
        result ? result_local_nonprim : NULL
        );

    return get_goods_feedback_response_local_var;
end:
    if (status_local_nonprim) {
        api_response_status_type_free(status_local_nonprim);
        status_local_nonprim = NULL;
    }
    if (result_local_nonprim) {
        goods_feedback_list_dto_free(result_local_nonprim);
        result_local_nonprim = NULL;
    }
    return NULL;

}
