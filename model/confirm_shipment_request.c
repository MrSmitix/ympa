#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "confirm_shipment_request.h"



confirm_shipment_request_t *confirm_shipment_request_create(
    char *external_shipment_id
    ) {
    confirm_shipment_request_t *confirm_shipment_request_local_var = malloc(sizeof(confirm_shipment_request_t));
    if (!confirm_shipment_request_local_var) {
        return NULL;
    }
    confirm_shipment_request_local_var->external_shipment_id = external_shipment_id;

    return confirm_shipment_request_local_var;
}


void confirm_shipment_request_free(confirm_shipment_request_t *confirm_shipment_request) {
    if(NULL == confirm_shipment_request){
        return ;
    }
    listEntry_t *listEntry;
    if (confirm_shipment_request->external_shipment_id) {
        free(confirm_shipment_request->external_shipment_id);
        confirm_shipment_request->external_shipment_id = NULL;
    }
    free(confirm_shipment_request);
}

cJSON *confirm_shipment_request_convertToJSON(confirm_shipment_request_t *confirm_shipment_request) {
    cJSON *item = cJSON_CreateObject();

    // confirm_shipment_request->external_shipment_id
    if(confirm_shipment_request->external_shipment_id) {
    if(cJSON_AddStringToObject(item, "externalShipmentId", confirm_shipment_request->external_shipment_id) == NULL) {
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

confirm_shipment_request_t *confirm_shipment_request_parseFromJSON(cJSON *confirm_shipment_requestJSON){

    confirm_shipment_request_t *confirm_shipment_request_local_var = NULL;

    // confirm_shipment_request->external_shipment_id
    cJSON *external_shipment_id = cJSON_GetObjectItemCaseSensitive(confirm_shipment_requestJSON, "externalShipmentId");
    if (external_shipment_id) { 
    if(!cJSON_IsString(external_shipment_id) && !cJSON_IsNull(external_shipment_id))
    {
    goto end; //String
    }
    }


    confirm_shipment_request_local_var = confirm_shipment_request_create (
        external_shipment_id && !cJSON_IsNull(external_shipment_id) ? strdup(external_shipment_id->valuestring) : NULL
        );

    return confirm_shipment_request_local_var;
end:
    return NULL;

}
