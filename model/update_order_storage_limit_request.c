#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "update_order_storage_limit_request.h"



update_order_storage_limit_request_t *update_order_storage_limit_request_create(
    char *new_date
    ) {
    update_order_storage_limit_request_t *update_order_storage_limit_request_local_var = malloc(sizeof(update_order_storage_limit_request_t));
    if (!update_order_storage_limit_request_local_var) {
        return NULL;
    }
    update_order_storage_limit_request_local_var->new_date = new_date;

    return update_order_storage_limit_request_local_var;
}


void update_order_storage_limit_request_free(update_order_storage_limit_request_t *update_order_storage_limit_request) {
    if(NULL == update_order_storage_limit_request){
        return ;
    }
    listEntry_t *listEntry;
    if (update_order_storage_limit_request->new_date) {
        free(update_order_storage_limit_request->new_date);
        update_order_storage_limit_request->new_date = NULL;
    }
    free(update_order_storage_limit_request);
}

cJSON *update_order_storage_limit_request_convertToJSON(update_order_storage_limit_request_t *update_order_storage_limit_request) {
    cJSON *item = cJSON_CreateObject();

    // update_order_storage_limit_request->new_date
    if (!update_order_storage_limit_request->new_date) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "newDate", update_order_storage_limit_request->new_date) == NULL) {
    goto fail; //Date
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

update_order_storage_limit_request_t *update_order_storage_limit_request_parseFromJSON(cJSON *update_order_storage_limit_requestJSON){

    update_order_storage_limit_request_t *update_order_storage_limit_request_local_var = NULL;

    // update_order_storage_limit_request->new_date
    cJSON *new_date = cJSON_GetObjectItemCaseSensitive(update_order_storage_limit_requestJSON, "newDate");
    if (!new_date) {
        goto end;
    }

    
    if(!cJSON_IsString(new_date))
    {
    goto end; //Date
    }


    update_order_storage_limit_request_local_var = update_order_storage_limit_request_create (
        strdup(new_date->valuestring)
        );

    return update_order_storage_limit_request_local_var;
end:
    return NULL;

}
