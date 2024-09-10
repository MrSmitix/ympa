#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "verify_order_eac_request.h"



verify_order_eac_request_t *verify_order_eac_request_create(
    char *code
    ) {
    verify_order_eac_request_t *verify_order_eac_request_local_var = malloc(sizeof(verify_order_eac_request_t));
    if (!verify_order_eac_request_local_var) {
        return NULL;
    }
    verify_order_eac_request_local_var->code = code;

    return verify_order_eac_request_local_var;
}


void verify_order_eac_request_free(verify_order_eac_request_t *verify_order_eac_request) {
    if(NULL == verify_order_eac_request){
        return ;
    }
    listEntry_t *listEntry;
    if (verify_order_eac_request->code) {
        free(verify_order_eac_request->code);
        verify_order_eac_request->code = NULL;
    }
    free(verify_order_eac_request);
}

cJSON *verify_order_eac_request_convertToJSON(verify_order_eac_request_t *verify_order_eac_request) {
    cJSON *item = cJSON_CreateObject();

    // verify_order_eac_request->code
    if(verify_order_eac_request->code) {
    if(cJSON_AddStringToObject(item, "code", verify_order_eac_request->code) == NULL) {
    goto fail; //String
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

verify_order_eac_request_t *verify_order_eac_request_parseFromJSON(cJSON *verify_order_eac_requestJSON){

    verify_order_eac_request_t *verify_order_eac_request_local_var = NULL;

    // verify_order_eac_request->code
    cJSON *code = cJSON_GetObjectItemCaseSensitive(verify_order_eac_requestJSON, "code");
    if (code) { 
    if(!cJSON_IsString(code) && !cJSON_IsNull(code))
    {
    goto end; //String
    }
    }


    verify_order_eac_request_local_var = verify_order_eac_request_create (
        code && !cJSON_IsNull(code) ? strdup(code->valuestring) : NULL
        );

    return verify_order_eac_request_local_var;
end:
    return NULL;

}
