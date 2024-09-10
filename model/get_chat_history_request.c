#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "get_chat_history_request.h"



get_chat_history_request_t *get_chat_history_request_create(
    long message_id_from
    ) {
    get_chat_history_request_t *get_chat_history_request_local_var = malloc(sizeof(get_chat_history_request_t));
    if (!get_chat_history_request_local_var) {
        return NULL;
    }
    get_chat_history_request_local_var->message_id_from = message_id_from;

    return get_chat_history_request_local_var;
}


void get_chat_history_request_free(get_chat_history_request_t *get_chat_history_request) {
    if(NULL == get_chat_history_request){
        return ;
    }
    listEntry_t *listEntry;
    free(get_chat_history_request);
}

cJSON *get_chat_history_request_convertToJSON(get_chat_history_request_t *get_chat_history_request) {
    cJSON *item = cJSON_CreateObject();

    // get_chat_history_request->message_id_from
    if(get_chat_history_request->message_id_from) {
    if(cJSON_AddNumberToObject(item, "messageIdFrom", get_chat_history_request->message_id_from) == NULL) {
    goto fail; //Numeric
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

get_chat_history_request_t *get_chat_history_request_parseFromJSON(cJSON *get_chat_history_requestJSON){

    get_chat_history_request_t *get_chat_history_request_local_var = NULL;

    // get_chat_history_request->message_id_from
    cJSON *message_id_from = cJSON_GetObjectItemCaseSensitive(get_chat_history_requestJSON, "messageIdFrom");
    if (message_id_from) { 
    if(!cJSON_IsNumber(message_id_from))
    {
    goto end; //Numeric
    }
    }


    get_chat_history_request_local_var = get_chat_history_request_create (
        message_id_from ? message_id_from->valuedouble : 0
        );

    return get_chat_history_request_local_var;
end:
    return NULL;

}
