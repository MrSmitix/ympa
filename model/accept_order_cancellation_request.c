#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "accept_order_cancellation_request.h"


char* accept_order_cancellation_request_reason_ToString(_api__accept_order_cancellation_request__e reason) {
    char* reasonArray[] =  { "NULL", "ORDER_DELIVERED", "ORDER_IN_DELIVERY" };
    return reasonArray[reason];
}

_api__accept_order_cancellation_request__e accept_order_cancellation_request_reason_FromString(char* reason){
    int stringToReturn = 0;
    char *reasonArray[] =  { "NULL", "ORDER_DELIVERED", "ORDER_IN_DELIVERY" };
    size_t sizeofArray = sizeof(reasonArray) / sizeof(reasonArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(reason, reasonArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

accept_order_cancellation_request_t *accept_order_cancellation_request_create(
    int accepted,
    order_cancellation_reason_type_t *reason
    ) {
    accept_order_cancellation_request_t *accept_order_cancellation_request_local_var = malloc(sizeof(accept_order_cancellation_request_t));
    if (!accept_order_cancellation_request_local_var) {
        return NULL;
    }
    accept_order_cancellation_request_local_var->accepted = accepted;
    accept_order_cancellation_request_local_var->reason = reason;

    return accept_order_cancellation_request_local_var;
}


void accept_order_cancellation_request_free(accept_order_cancellation_request_t *accept_order_cancellation_request) {
    if(NULL == accept_order_cancellation_request){
        return ;
    }
    listEntry_t *listEntry;
    if (accept_order_cancellation_request->reason) {
        order_cancellation_reason_type_free(accept_order_cancellation_request->reason);
        accept_order_cancellation_request->reason = NULL;
    }
    free(accept_order_cancellation_request);
}

cJSON *accept_order_cancellation_request_convertToJSON(accept_order_cancellation_request_t *accept_order_cancellation_request) {
    cJSON *item = cJSON_CreateObject();

    // accept_order_cancellation_request->accepted
    if (!accept_order_cancellation_request->accepted) {
        goto fail;
    }
    if(cJSON_AddBoolToObject(item, "accepted", accept_order_cancellation_request->accepted) == NULL) {
    goto fail; //Bool
    }


    // accept_order_cancellation_request->reason
    if(accept_order_cancellation_request->reason != _api__accept_order_cancellation_request__NULL) {
    cJSON *reason_local_JSON = order_cancellation_reason_type_convertToJSON(accept_order_cancellation_request->reason);
    if(reason_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "reason", reason_local_JSON);
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

accept_order_cancellation_request_t *accept_order_cancellation_request_parseFromJSON(cJSON *accept_order_cancellation_requestJSON){

    accept_order_cancellation_request_t *accept_order_cancellation_request_local_var = NULL;

    // define the local variable for accept_order_cancellation_request->reason
    order_cancellation_reason_type_t *reason_local_nonprim = NULL;

    // accept_order_cancellation_request->accepted
    cJSON *accepted = cJSON_GetObjectItemCaseSensitive(accept_order_cancellation_requestJSON, "accepted");
    if (!accepted) {
        goto end;
    }

    
    if(!cJSON_IsBool(accepted))
    {
    goto end; //Bool
    }

    // accept_order_cancellation_request->reason
    cJSON *reason = cJSON_GetObjectItemCaseSensitive(accept_order_cancellation_requestJSON, "reason");
    if (reason) { 
    reason_local_nonprim = order_cancellation_reason_type_parseFromJSON(reason); //custom
    }


    accept_order_cancellation_request_local_var = accept_order_cancellation_request_create (
        accepted->valueint,
        reason ? reason_local_nonprim : NULL
        );

    return accept_order_cancellation_request_local_var;
end:
    if (reason_local_nonprim) {
        order_cancellation_reason_type_free(reason_local_nonprim);
        reason_local_nonprim = NULL;
    }
    return NULL;

}
