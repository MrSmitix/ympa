#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "update_order_status_request.h"



update_order_status_request_t *update_order_status_request_create(
    order_status_change_dto_t *order
    ) {
    update_order_status_request_t *update_order_status_request_local_var = malloc(sizeof(update_order_status_request_t));
    if (!update_order_status_request_local_var) {
        return NULL;
    }
    update_order_status_request_local_var->order = order;

    return update_order_status_request_local_var;
}


void update_order_status_request_free(update_order_status_request_t *update_order_status_request) {
    if(NULL == update_order_status_request){
        return ;
    }
    listEntry_t *listEntry;
    if (update_order_status_request->order) {
        order_status_change_dto_free(update_order_status_request->order);
        update_order_status_request->order = NULL;
    }
    free(update_order_status_request);
}

cJSON *update_order_status_request_convertToJSON(update_order_status_request_t *update_order_status_request) {
    cJSON *item = cJSON_CreateObject();

    // update_order_status_request->order
    if (!update_order_status_request->order) {
        goto fail;
    }
    cJSON *order_local_JSON = order_status_change_dto_convertToJSON(update_order_status_request->order);
    if(order_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "order", order_local_JSON);
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

update_order_status_request_t *update_order_status_request_parseFromJSON(cJSON *update_order_status_requestJSON){

    update_order_status_request_t *update_order_status_request_local_var = NULL;

    // define the local variable for update_order_status_request->order
    order_status_change_dto_t *order_local_nonprim = NULL;

    // update_order_status_request->order
    cJSON *order = cJSON_GetObjectItemCaseSensitive(update_order_status_requestJSON, "order");
    if (!order) {
        goto end;
    }

    
    order_local_nonprim = order_status_change_dto_parseFromJSON(order); //nonprimitive


    update_order_status_request_local_var = update_order_status_request_create (
        order_local_nonprim
        );

    return update_order_status_request_local_var;
end:
    if (order_local_nonprim) {
        order_status_change_dto_free(order_local_nonprim);
        order_local_nonprim = NULL;
    }
    return NULL;

}
