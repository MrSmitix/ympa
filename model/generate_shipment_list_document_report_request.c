#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "generate_shipment_list_document_report_request.h"



generate_shipment_list_document_report_request_t *generate_shipment_list_document_report_request_create(
    long campaign_id,
    long shipment_id,
    list_t *order_ids
    ) {
    generate_shipment_list_document_report_request_t *generate_shipment_list_document_report_request_local_var = malloc(sizeof(generate_shipment_list_document_report_request_t));
    if (!generate_shipment_list_document_report_request_local_var) {
        return NULL;
    }
    generate_shipment_list_document_report_request_local_var->campaign_id = campaign_id;
    generate_shipment_list_document_report_request_local_var->shipment_id = shipment_id;
    generate_shipment_list_document_report_request_local_var->order_ids = order_ids;

    return generate_shipment_list_document_report_request_local_var;
}


void generate_shipment_list_document_report_request_free(generate_shipment_list_document_report_request_t *generate_shipment_list_document_report_request) {
    if(NULL == generate_shipment_list_document_report_request){
        return ;
    }
    listEntry_t *listEntry;
    if (generate_shipment_list_document_report_request->order_ids) {
        list_ForEach(listEntry, generate_shipment_list_document_report_request->order_ids) {
            free(listEntry->data);
        }
        list_freeList(generate_shipment_list_document_report_request->order_ids);
        generate_shipment_list_document_report_request->order_ids = NULL;
    }
    free(generate_shipment_list_document_report_request);
}

cJSON *generate_shipment_list_document_report_request_convertToJSON(generate_shipment_list_document_report_request_t *generate_shipment_list_document_report_request) {
    cJSON *item = cJSON_CreateObject();

    // generate_shipment_list_document_report_request->campaign_id
    if (!generate_shipment_list_document_report_request->campaign_id) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "campaignId", generate_shipment_list_document_report_request->campaign_id) == NULL) {
    goto fail; //Numeric
    }


    // generate_shipment_list_document_report_request->shipment_id
    if(generate_shipment_list_document_report_request->shipment_id) {
    if(cJSON_AddNumberToObject(item, "shipmentId", generate_shipment_list_document_report_request->shipment_id) == NULL) {
    goto fail; //Numeric
    }
    }


    // generate_shipment_list_document_report_request->order_ids
    if(generate_shipment_list_document_report_request->order_ids) {
    cJSON *order_ids = cJSON_AddArrayToObject(item, "orderIds");
    if(order_ids == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *order_idsListEntry;
    list_ForEach(order_idsListEntry, generate_shipment_list_document_report_request->order_ids) {
    if(cJSON_AddNumberToObject(order_ids, "", *(double *)order_idsListEntry->data) == NULL)
    {
        goto fail;
    }
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

generate_shipment_list_document_report_request_t *generate_shipment_list_document_report_request_parseFromJSON(cJSON *generate_shipment_list_document_report_requestJSON){

    generate_shipment_list_document_report_request_t *generate_shipment_list_document_report_request_local_var = NULL;

    // define the local list for generate_shipment_list_document_report_request->order_ids
    list_t *order_idsList = NULL;

    // generate_shipment_list_document_report_request->campaign_id
    cJSON *campaign_id = cJSON_GetObjectItemCaseSensitive(generate_shipment_list_document_report_requestJSON, "campaignId");
    if (!campaign_id) {
        goto end;
    }

    
    if(!cJSON_IsNumber(campaign_id))
    {
    goto end; //Numeric
    }

    // generate_shipment_list_document_report_request->shipment_id
    cJSON *shipment_id = cJSON_GetObjectItemCaseSensitive(generate_shipment_list_document_report_requestJSON, "shipmentId");
    if (shipment_id) { 
    if(!cJSON_IsNumber(shipment_id))
    {
    goto end; //Numeric
    }
    }

    // generate_shipment_list_document_report_request->order_ids
    cJSON *order_ids = cJSON_GetObjectItemCaseSensitive(generate_shipment_list_document_report_requestJSON, "orderIds");
    if (order_ids) { 
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
    }


    generate_shipment_list_document_report_request_local_var = generate_shipment_list_document_report_request_create (
        campaign_id->valuedouble,
        shipment_id ? shipment_id->valuedouble : 0,
        order_ids ? order_idsList : NULL
        );

    return generate_shipment_list_document_report_request_local_var;
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
