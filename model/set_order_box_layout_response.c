#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "set_order_box_layout_response.h"


char* set_order_box_layout_response_status_ToString(_api__set_order_box_layout_response__e status) {
    char* statusArray[] =  { "NULL", "OK", "ERROR" };
    return statusArray[status];
}

_api__set_order_box_layout_response__e set_order_box_layout_response_status_FromString(char* status){
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

set_order_box_layout_response_t *set_order_box_layout_response_create(
    api_response_status_type_t *status,
    order_boxes_layout_dto_t *result
    ) {
    set_order_box_layout_response_t *set_order_box_layout_response_local_var = malloc(sizeof(set_order_box_layout_response_t));
    if (!set_order_box_layout_response_local_var) {
        return NULL;
    }
    set_order_box_layout_response_local_var->status = status;
    set_order_box_layout_response_local_var->result = result;

    return set_order_box_layout_response_local_var;
}


void set_order_box_layout_response_free(set_order_box_layout_response_t *set_order_box_layout_response) {
    if(NULL == set_order_box_layout_response){
        return ;
    }
    listEntry_t *listEntry;
    if (set_order_box_layout_response->status) {
        api_response_status_type_free(set_order_box_layout_response->status);
        set_order_box_layout_response->status = NULL;
    }
    if (set_order_box_layout_response->result) {
        order_boxes_layout_dto_free(set_order_box_layout_response->result);
        set_order_box_layout_response->result = NULL;
    }
    free(set_order_box_layout_response);
}

cJSON *set_order_box_layout_response_convertToJSON(set_order_box_layout_response_t *set_order_box_layout_response) {
    cJSON *item = cJSON_CreateObject();

    // set_order_box_layout_response->status
    if(set_order_box_layout_response->status != _api__set_order_box_layout_response__NULL) {
    cJSON *status_local_JSON = api_response_status_type_convertToJSON(set_order_box_layout_response->status);
    if(status_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "status", status_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // set_order_box_layout_response->result
    if(set_order_box_layout_response->result) {
    cJSON *result_local_JSON = order_boxes_layout_dto_convertToJSON(set_order_box_layout_response->result);
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

set_order_box_layout_response_t *set_order_box_layout_response_parseFromJSON(cJSON *set_order_box_layout_responseJSON){

    set_order_box_layout_response_t *set_order_box_layout_response_local_var = NULL;

    // define the local variable for set_order_box_layout_response->status
    api_response_status_type_t *status_local_nonprim = NULL;

    // define the local variable for set_order_box_layout_response->result
    order_boxes_layout_dto_t *result_local_nonprim = NULL;

    // set_order_box_layout_response->status
    cJSON *status = cJSON_GetObjectItemCaseSensitive(set_order_box_layout_responseJSON, "status");
    if (status) { 
    status_local_nonprim = api_response_status_type_parseFromJSON(status); //custom
    }

    // set_order_box_layout_response->result
    cJSON *result = cJSON_GetObjectItemCaseSensitive(set_order_box_layout_responseJSON, "result");
    if (result) { 
    result_local_nonprim = order_boxes_layout_dto_parseFromJSON(result); //nonprimitive
    }


    set_order_box_layout_response_local_var = set_order_box_layout_response_create (
        status ? status_local_nonprim : NULL,
        result ? result_local_nonprim : NULL
        );

    return set_order_box_layout_response_local_var;
end:
    if (status_local_nonprim) {
        api_response_status_type_free(status_local_nonprim);
        status_local_nonprim = NULL;
    }
    if (result_local_nonprim) {
        order_boxes_layout_dto_free(result_local_nonprim);
        result_local_nonprim = NULL;
    }
    return NULL;

}
