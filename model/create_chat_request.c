#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "create_chat_request.h"



create_chat_request_t *create_chat_request_create(
    long order_id
    ) {
    create_chat_request_t *create_chat_request_local_var = malloc(sizeof(create_chat_request_t));
    if (!create_chat_request_local_var) {
        return NULL;
    }
    create_chat_request_local_var->order_id = order_id;

    return create_chat_request_local_var;
}


void create_chat_request_free(create_chat_request_t *create_chat_request) {
    if(NULL == create_chat_request){
        return ;
    }
    listEntry_t *listEntry;
    free(create_chat_request);
}

cJSON *create_chat_request_convertToJSON(create_chat_request_t *create_chat_request) {
    cJSON *item = cJSON_CreateObject();

    // create_chat_request->order_id
    if (!create_chat_request->order_id) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "orderId", create_chat_request->order_id) == NULL) {
    goto fail; //Numeric
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

create_chat_request_t *create_chat_request_parseFromJSON(cJSON *create_chat_requestJSON){

    create_chat_request_t *create_chat_request_local_var = NULL;

    // create_chat_request->order_id
    cJSON *order_id = cJSON_GetObjectItemCaseSensitive(create_chat_requestJSON, "orderId");
    if (!order_id) {
        goto end;
    }

    
    if(!cJSON_IsNumber(order_id))
    {
    goto end; //Numeric
    }


    create_chat_request_local_var = create_chat_request_create (
        order_id->valuedouble
        );

    return create_chat_request_local_var;
end:
    return NULL;

}
