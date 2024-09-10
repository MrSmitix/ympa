#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "set_order_delivery_track_code_request.h"



set_order_delivery_track_code_request_t *set_order_delivery_track_code_request_create(
    char *track_code,
    long delivery_service_id
    ) {
    set_order_delivery_track_code_request_t *set_order_delivery_track_code_request_local_var = malloc(sizeof(set_order_delivery_track_code_request_t));
    if (!set_order_delivery_track_code_request_local_var) {
        return NULL;
    }
    set_order_delivery_track_code_request_local_var->track_code = track_code;
    set_order_delivery_track_code_request_local_var->delivery_service_id = delivery_service_id;

    return set_order_delivery_track_code_request_local_var;
}


void set_order_delivery_track_code_request_free(set_order_delivery_track_code_request_t *set_order_delivery_track_code_request) {
    if(NULL == set_order_delivery_track_code_request){
        return ;
    }
    listEntry_t *listEntry;
    if (set_order_delivery_track_code_request->track_code) {
        free(set_order_delivery_track_code_request->track_code);
        set_order_delivery_track_code_request->track_code = NULL;
    }
    free(set_order_delivery_track_code_request);
}

cJSON *set_order_delivery_track_code_request_convertToJSON(set_order_delivery_track_code_request_t *set_order_delivery_track_code_request) {
    cJSON *item = cJSON_CreateObject();

    // set_order_delivery_track_code_request->track_code
    if (!set_order_delivery_track_code_request->track_code) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "trackCode", set_order_delivery_track_code_request->track_code) == NULL) {
    goto fail; //String
    }


    // set_order_delivery_track_code_request->delivery_service_id
    if (!set_order_delivery_track_code_request->delivery_service_id) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "deliveryServiceId", set_order_delivery_track_code_request->delivery_service_id) == NULL) {
    goto fail; //Numeric
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

set_order_delivery_track_code_request_t *set_order_delivery_track_code_request_parseFromJSON(cJSON *set_order_delivery_track_code_requestJSON){

    set_order_delivery_track_code_request_t *set_order_delivery_track_code_request_local_var = NULL;

    // set_order_delivery_track_code_request->track_code
    cJSON *track_code = cJSON_GetObjectItemCaseSensitive(set_order_delivery_track_code_requestJSON, "trackCode");
    if (!track_code) {
        goto end;
    }

    
    if(!cJSON_IsString(track_code))
    {
    goto end; //String
    }

    // set_order_delivery_track_code_request->delivery_service_id
    cJSON *delivery_service_id = cJSON_GetObjectItemCaseSensitive(set_order_delivery_track_code_requestJSON, "deliveryServiceId");
    if (!delivery_service_id) {
        goto end;
    }

    
    if(!cJSON_IsNumber(delivery_service_id))
    {
    goto end; //Numeric
    }


    set_order_delivery_track_code_request_local_var = set_order_delivery_track_code_request_create (
        strdup(track_code->valuestring),
        delivery_service_id->valuedouble
        );

    return set_order_delivery_track_code_request_local_var;
end:
    return NULL;

}
