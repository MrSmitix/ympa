#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "send_message_to_chat_request.h"



send_message_to_chat_request_t *send_message_to_chat_request_create(
    char *message
    ) {
    send_message_to_chat_request_t *send_message_to_chat_request_local_var = malloc(sizeof(send_message_to_chat_request_t));
    if (!send_message_to_chat_request_local_var) {
        return NULL;
    }
    send_message_to_chat_request_local_var->message = message;

    return send_message_to_chat_request_local_var;
}


void send_message_to_chat_request_free(send_message_to_chat_request_t *send_message_to_chat_request) {
    if(NULL == send_message_to_chat_request){
        return ;
    }
    listEntry_t *listEntry;
    if (send_message_to_chat_request->message) {
        free(send_message_to_chat_request->message);
        send_message_to_chat_request->message = NULL;
    }
    free(send_message_to_chat_request);
}

cJSON *send_message_to_chat_request_convertToJSON(send_message_to_chat_request_t *send_message_to_chat_request) {
    cJSON *item = cJSON_CreateObject();

    // send_message_to_chat_request->message
    if (!send_message_to_chat_request->message) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "message", send_message_to_chat_request->message) == NULL) {
    goto fail; //String
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

send_message_to_chat_request_t *send_message_to_chat_request_parseFromJSON(cJSON *send_message_to_chat_requestJSON){

    send_message_to_chat_request_t *send_message_to_chat_request_local_var = NULL;

    // send_message_to_chat_request->message
    cJSON *message = cJSON_GetObjectItemCaseSensitive(send_message_to_chat_requestJSON, "message");
    if (!message) {
        goto end;
    }

    
    if(!cJSON_IsString(message))
    {
    goto end; //String
    }


    send_message_to_chat_request_local_var = send_message_to_chat_request_create (
        strdup(message->valuestring)
        );

    return send_message_to_chat_request_local_var;
end:
    return NULL;

}
