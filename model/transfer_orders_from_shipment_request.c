#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "transfer_orders_from_shipment_request.h"



transfer_orders_from_shipment_request_t *transfer_orders_from_shipment_request_create(
    list_t *order_ids
    ) {
    transfer_orders_from_shipment_request_t *transfer_orders_from_shipment_request_local_var = malloc(sizeof(transfer_orders_from_shipment_request_t));
    if (!transfer_orders_from_shipment_request_local_var) {
        return NULL;
    }
    transfer_orders_from_shipment_request_local_var->order_ids = order_ids;

    return transfer_orders_from_shipment_request_local_var;
}


void transfer_orders_from_shipment_request_free(transfer_orders_from_shipment_request_t *transfer_orders_from_shipment_request) {
    if(NULL == transfer_orders_from_shipment_request){
        return ;
    }
    listEntry_t *listEntry;
    if (transfer_orders_from_shipment_request->order_ids) {
        list_ForEach(listEntry, transfer_orders_from_shipment_request->order_ids) {
            free(listEntry->data);
        }
        list_freeList(transfer_orders_from_shipment_request->order_ids);
        transfer_orders_from_shipment_request->order_ids = NULL;
    }
    free(transfer_orders_from_shipment_request);
}

cJSON *transfer_orders_from_shipment_request_convertToJSON(transfer_orders_from_shipment_request_t *transfer_orders_from_shipment_request) {
    cJSON *item = cJSON_CreateObject();

    // transfer_orders_from_shipment_request->order_ids
    if (!transfer_orders_from_shipment_request->order_ids) {
        goto fail;
    }
    cJSON *order_ids = cJSON_AddArrayToObject(item, "orderIds");
    if(order_ids == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *order_idsListEntry;
    list_ForEach(order_idsListEntry, transfer_orders_from_shipment_request->order_ids) {
    if(cJSON_AddNumberToObject(order_ids, "", *(double *)order_idsListEntry->data) == NULL)
    {
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

transfer_orders_from_shipment_request_t *transfer_orders_from_shipment_request_parseFromJSON(cJSON *transfer_orders_from_shipment_requestJSON){

    transfer_orders_from_shipment_request_t *transfer_orders_from_shipment_request_local_var = NULL;

    // define the local list for transfer_orders_from_shipment_request->order_ids
    list_t *order_idsList = NULL;

    // transfer_orders_from_shipment_request->order_ids
    cJSON *order_ids = cJSON_GetObjectItemCaseSensitive(transfer_orders_from_shipment_requestJSON, "orderIds");
    if (!order_ids) {
        goto end;
    }

    
    cJSON *order_ids_local = NULL;
    if(!cJSON_IsArray(order_ids)) {
        goto end;//primitive container
    }
    order_idsList = list_createList();

    cJSON_ArrayForEach(order_ids_local, order_ids)
    {
        if(!cJSON_IsNumber(order_ids_local))
        {
            goto end;
        }
        double *order_ids_local_value = (double *)calloc(1, sizeof(double));
        if(!order_ids_local_value)
        {
            goto end;
        }
        *order_ids_local_value = order_ids_local->valuedouble;
        list_addElement(order_idsList , order_ids_local_value);
    }


    transfer_orders_from_shipment_request_local_var = transfer_orders_from_shipment_request_create (
        order_idsList
        );

    return transfer_orders_from_shipment_request_local_var;
end:
    if (order_idsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, order_idsList) {
            free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(order_idsList);
        order_idsList = NULL;
    }
    return NULL;

}
