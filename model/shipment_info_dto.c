#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "shipment_info_dto.h"


char* shipment_info_dto_shipment_type_ToString(_api__shipment_info_dto__e shipment_type) {
    char* shipment_typeArray[] =  { "NULL", "IMPORT", "WITHDRAW" };
    return shipment_typeArray[shipment_type];
}

_api__shipment_info_dto__e shipment_info_dto_shipment_type_FromString(char* shipment_type){
    int stringToReturn = 0;
    char *shipment_typeArray[] =  { "NULL", "IMPORT", "WITHDRAW" };
    size_t sizeofArray = sizeof(shipment_typeArray) / sizeof(shipment_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(shipment_type, shipment_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}
char* shipment_info_dto_status_ToString(_api__shipment_info_dto__e status) {
    char* statusArray[] =  { "NULL", "OUTBOUND_CREATED", "OUTBOUND_READY_FOR_CONFIRMATION", "OUTBOUND_CONFIRMED", "OUTBOUND_SIGNED", "FINISHED", "ACCEPTED", "ACCEPTED_WITH_DISCREPANCIES", "ERROR" };
    return statusArray[status];
}

_api__shipment_info_dto__e shipment_info_dto_status_FromString(char* status){
    int stringToReturn = 0;
    char *statusArray[] =  { "NULL", "OUTBOUND_CREATED", "OUTBOUND_READY_FOR_CONFIRMATION", "OUTBOUND_CONFIRMED", "OUTBOUND_SIGNED", "FINISHED", "ACCEPTED", "ACCEPTED_WITH_DISCREPANCIES", "ERROR" };
    size_t sizeofArray = sizeof(statusArray) / sizeof(statusArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(status, statusArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

shipment_info_dto_t *shipment_info_dto_create(
    long id,
    char *plan_interval_from,
    char *plan_interval_to,
    shipment_type_t *shipment_type,
    partner_shipment_warehouse_dto_t *warehouse,
    partner_shipment_warehouse_dto_t *warehouse_to,
    char *external_id,
    delivery_service_dto_t *delivery_service,
    pallets_count_dto_t *pallets_count,
    list_t *order_ids,
    int draft_count,
    int planned_count,
    int fact_count,
    shipment_status_type_t *status,
    char *status_description,
    char *status_update_time
    ) {
    shipment_info_dto_t *shipment_info_dto_local_var = malloc(sizeof(shipment_info_dto_t));
    if (!shipment_info_dto_local_var) {
        return NULL;
    }
    shipment_info_dto_local_var->id = id;
    shipment_info_dto_local_var->plan_interval_from = plan_interval_from;
    shipment_info_dto_local_var->plan_interval_to = plan_interval_to;
    shipment_info_dto_local_var->shipment_type = shipment_type;
    shipment_info_dto_local_var->warehouse = warehouse;
    shipment_info_dto_local_var->warehouse_to = warehouse_to;
    shipment_info_dto_local_var->external_id = external_id;
    shipment_info_dto_local_var->delivery_service = delivery_service;
    shipment_info_dto_local_var->pallets_count = pallets_count;
    shipment_info_dto_local_var->order_ids = order_ids;
    shipment_info_dto_local_var->draft_count = draft_count;
    shipment_info_dto_local_var->planned_count = planned_count;
    shipment_info_dto_local_var->fact_count = fact_count;
    shipment_info_dto_local_var->status = status;
    shipment_info_dto_local_var->status_description = status_description;
    shipment_info_dto_local_var->status_update_time = status_update_time;

    return shipment_info_dto_local_var;
}


void shipment_info_dto_free(shipment_info_dto_t *shipment_info_dto) {
    if(NULL == shipment_info_dto){
        return ;
    }
    listEntry_t *listEntry;
    if (shipment_info_dto->plan_interval_from) {
        free(shipment_info_dto->plan_interval_from);
        shipment_info_dto->plan_interval_from = NULL;
    }
    if (shipment_info_dto->plan_interval_to) {
        free(shipment_info_dto->plan_interval_to);
        shipment_info_dto->plan_interval_to = NULL;
    }
    if (shipment_info_dto->shipment_type) {
        shipment_type_free(shipment_info_dto->shipment_type);
        shipment_info_dto->shipment_type = NULL;
    }
    if (shipment_info_dto->warehouse) {
        partner_shipment_warehouse_dto_free(shipment_info_dto->warehouse);
        shipment_info_dto->warehouse = NULL;
    }
    if (shipment_info_dto->warehouse_to) {
        partner_shipment_warehouse_dto_free(shipment_info_dto->warehouse_to);
        shipment_info_dto->warehouse_to = NULL;
    }
    if (shipment_info_dto->external_id) {
        free(shipment_info_dto->external_id);
        shipment_info_dto->external_id = NULL;
    }
    if (shipment_info_dto->delivery_service) {
        delivery_service_dto_free(shipment_info_dto->delivery_service);
        shipment_info_dto->delivery_service = NULL;
    }
    if (shipment_info_dto->pallets_count) {
        pallets_count_dto_free(shipment_info_dto->pallets_count);
        shipment_info_dto->pallets_count = NULL;
    }
    if (shipment_info_dto->order_ids) {
        list_ForEach(listEntry, shipment_info_dto->order_ids) {
            free(listEntry->data);
        }
        list_freeList(shipment_info_dto->order_ids);
        shipment_info_dto->order_ids = NULL;
    }
    if (shipment_info_dto->status) {
        shipment_status_type_free(shipment_info_dto->status);
        shipment_info_dto->status = NULL;
    }
    if (shipment_info_dto->status_description) {
        free(shipment_info_dto->status_description);
        shipment_info_dto->status_description = NULL;
    }
    if (shipment_info_dto->status_update_time) {
        free(shipment_info_dto->status_update_time);
        shipment_info_dto->status_update_time = NULL;
    }
    free(shipment_info_dto);
}

cJSON *shipment_info_dto_convertToJSON(shipment_info_dto_t *shipment_info_dto) {
    cJSON *item = cJSON_CreateObject();

    // shipment_info_dto->id
    if(shipment_info_dto->id) {
    if(cJSON_AddNumberToObject(item, "id", shipment_info_dto->id) == NULL) {
    goto fail; //Numeric
    }
    }


    // shipment_info_dto->plan_interval_from
    if(shipment_info_dto->plan_interval_from) {
    if(cJSON_AddStringToObject(item, "planIntervalFrom", shipment_info_dto->plan_interval_from) == NULL) {
    goto fail; //Date-Time
    }
    }


    // shipment_info_dto->plan_interval_to
    if(shipment_info_dto->plan_interval_to) {
    if(cJSON_AddStringToObject(item, "planIntervalTo", shipment_info_dto->plan_interval_to) == NULL) {
    goto fail; //Date-Time
    }
    }


    // shipment_info_dto->shipment_type
    if(shipment_info_dto->shipment_type != _api__shipment_info_dto__NULL) {
    cJSON *shipment_type_local_JSON = shipment_type_convertToJSON(shipment_info_dto->shipment_type);
    if(shipment_type_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "shipmentType", shipment_type_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // shipment_info_dto->warehouse
    if(shipment_info_dto->warehouse) {
    cJSON *warehouse_local_JSON = partner_shipment_warehouse_dto_convertToJSON(shipment_info_dto->warehouse);
    if(warehouse_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "warehouse", warehouse_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // shipment_info_dto->warehouse_to
    if(shipment_info_dto->warehouse_to) {
    cJSON *warehouse_to_local_JSON = partner_shipment_warehouse_dto_convertToJSON(shipment_info_dto->warehouse_to);
    if(warehouse_to_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "warehouseTo", warehouse_to_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // shipment_info_dto->external_id
    if(shipment_info_dto->external_id) {
    if(cJSON_AddStringToObject(item, "externalId", shipment_info_dto->external_id) == NULL) {
    goto fail; //String
    }
    }


    // shipment_info_dto->delivery_service
    if(shipment_info_dto->delivery_service) {
    cJSON *delivery_service_local_JSON = delivery_service_dto_convertToJSON(shipment_info_dto->delivery_service);
    if(delivery_service_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "deliveryService", delivery_service_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // shipment_info_dto->pallets_count
    if(shipment_info_dto->pallets_count) {
    cJSON *pallets_count_local_JSON = pallets_count_dto_convertToJSON(shipment_info_dto->pallets_count);
    if(pallets_count_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "palletsCount", pallets_count_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // shipment_info_dto->order_ids
    if (!shipment_info_dto->order_ids) {
        goto fail;
    }
    cJSON *order_ids = cJSON_AddArrayToObject(item, "orderIds");
    if(order_ids == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *order_idsListEntry;
    list_ForEach(order_idsListEntry, shipment_info_dto->order_ids) {
    if(cJSON_AddNumberToObject(order_ids, "", *(double *)order_idsListEntry->data) == NULL)
    {
        goto fail;
    }
    }


    // shipment_info_dto->draft_count
    if(shipment_info_dto->draft_count) {
    if(cJSON_AddNumberToObject(item, "draftCount", shipment_info_dto->draft_count) == NULL) {
    goto fail; //Numeric
    }
    }


    // shipment_info_dto->planned_count
    if(shipment_info_dto->planned_count) {
    if(cJSON_AddNumberToObject(item, "plannedCount", shipment_info_dto->planned_count) == NULL) {
    goto fail; //Numeric
    }
    }


    // shipment_info_dto->fact_count
    if(shipment_info_dto->fact_count) {
    if(cJSON_AddNumberToObject(item, "factCount", shipment_info_dto->fact_count) == NULL) {
    goto fail; //Numeric
    }
    }


    // shipment_info_dto->status
    if(shipment_info_dto->status != _api__shipment_info_dto__NULL) {
    cJSON *status_local_JSON = shipment_status_type_convertToJSON(shipment_info_dto->status);
    if(status_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "status", status_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // shipment_info_dto->status_description
    if(shipment_info_dto->status_description) {
    if(cJSON_AddStringToObject(item, "statusDescription", shipment_info_dto->status_description) == NULL) {
    goto fail; //String
    }
    }


    // shipment_info_dto->status_update_time
    if(shipment_info_dto->status_update_time) {
    if(cJSON_AddStringToObject(item, "statusUpdateTime", shipment_info_dto->status_update_time) == NULL) {
    goto fail; //Date-Time
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

shipment_info_dto_t *shipment_info_dto_parseFromJSON(cJSON *shipment_info_dtoJSON){

    shipment_info_dto_t *shipment_info_dto_local_var = NULL;

    // define the local variable for shipment_info_dto->shipment_type
    shipment_type_t *shipment_type_local_nonprim = NULL;

    // define the local variable for shipment_info_dto->warehouse
    partner_shipment_warehouse_dto_t *warehouse_local_nonprim = NULL;

    // define the local variable for shipment_info_dto->warehouse_to
    partner_shipment_warehouse_dto_t *warehouse_to_local_nonprim = NULL;

    // define the local variable for shipment_info_dto->delivery_service
    delivery_service_dto_t *delivery_service_local_nonprim = NULL;

    // define the local variable for shipment_info_dto->pallets_count
    pallets_count_dto_t *pallets_count_local_nonprim = NULL;

    // define the local list for shipment_info_dto->order_ids
    list_t *order_idsList = NULL;

    // define the local variable for shipment_info_dto->status
    shipment_status_type_t *status_local_nonprim = NULL;

    // shipment_info_dto->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(shipment_info_dtoJSON, "id");
    if (id) { 
    if(!cJSON_IsNumber(id))
    {
    goto end; //Numeric
    }
    }

    // shipment_info_dto->plan_interval_from
    cJSON *plan_interval_from = cJSON_GetObjectItemCaseSensitive(shipment_info_dtoJSON, "planIntervalFrom");
    if (plan_interval_from) { 
    if(!cJSON_IsString(plan_interval_from) && !cJSON_IsNull(plan_interval_from))
    {
    goto end; //DateTime
    }
    }

    // shipment_info_dto->plan_interval_to
    cJSON *plan_interval_to = cJSON_GetObjectItemCaseSensitive(shipment_info_dtoJSON, "planIntervalTo");
    if (plan_interval_to) { 
    if(!cJSON_IsString(plan_interval_to) && !cJSON_IsNull(plan_interval_to))
    {
    goto end; //DateTime
    }
    }

    // shipment_info_dto->shipment_type
    cJSON *shipment_type = cJSON_GetObjectItemCaseSensitive(shipment_info_dtoJSON, "shipmentType");
    if (shipment_type) { 
    shipment_type_local_nonprim = shipment_type_parseFromJSON(shipment_type); //custom
    }

    // shipment_info_dto->warehouse
    cJSON *warehouse = cJSON_GetObjectItemCaseSensitive(shipment_info_dtoJSON, "warehouse");
    if (warehouse) { 
    warehouse_local_nonprim = partner_shipment_warehouse_dto_parseFromJSON(warehouse); //nonprimitive
    }

    // shipment_info_dto->warehouse_to
    cJSON *warehouse_to = cJSON_GetObjectItemCaseSensitive(shipment_info_dtoJSON, "warehouseTo");
    if (warehouse_to) { 
    warehouse_to_local_nonprim = partner_shipment_warehouse_dto_parseFromJSON(warehouse_to); //nonprimitive
    }

    // shipment_info_dto->external_id
    cJSON *external_id = cJSON_GetObjectItemCaseSensitive(shipment_info_dtoJSON, "externalId");
    if (external_id) { 
    if(!cJSON_IsString(external_id) && !cJSON_IsNull(external_id))
    {
    goto end; //String
    }
    }

    // shipment_info_dto->delivery_service
    cJSON *delivery_service = cJSON_GetObjectItemCaseSensitive(shipment_info_dtoJSON, "deliveryService");
    if (delivery_service) { 
    delivery_service_local_nonprim = delivery_service_dto_parseFromJSON(delivery_service); //nonprimitive
    }

    // shipment_info_dto->pallets_count
    cJSON *pallets_count = cJSON_GetObjectItemCaseSensitive(shipment_info_dtoJSON, "palletsCount");
    if (pallets_count) { 
    pallets_count_local_nonprim = pallets_count_dto_parseFromJSON(pallets_count); //nonprimitive
    }

    // shipment_info_dto->order_ids
    cJSON *order_ids = cJSON_GetObjectItemCaseSensitive(shipment_info_dtoJSON, "orderIds");
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

    // shipment_info_dto->draft_count
    cJSON *draft_count = cJSON_GetObjectItemCaseSensitive(shipment_info_dtoJSON, "draftCount");
    if (draft_count) { 
    if(!cJSON_IsNumber(draft_count))
    {
    goto end; //Numeric
    }
    }

    // shipment_info_dto->planned_count
    cJSON *planned_count = cJSON_GetObjectItemCaseSensitive(shipment_info_dtoJSON, "plannedCount");
    if (planned_count) { 
    if(!cJSON_IsNumber(planned_count))
    {
    goto end; //Numeric
    }
    }

    // shipment_info_dto->fact_count
    cJSON *fact_count = cJSON_GetObjectItemCaseSensitive(shipment_info_dtoJSON, "factCount");
    if (fact_count) { 
    if(!cJSON_IsNumber(fact_count))
    {
    goto end; //Numeric
    }
    }

    // shipment_info_dto->status
    cJSON *status = cJSON_GetObjectItemCaseSensitive(shipment_info_dtoJSON, "status");
    if (status) { 
    status_local_nonprim = shipment_status_type_parseFromJSON(status); //custom
    }

    // shipment_info_dto->status_description
    cJSON *status_description = cJSON_GetObjectItemCaseSensitive(shipment_info_dtoJSON, "statusDescription");
    if (status_description) { 
    if(!cJSON_IsString(status_description) && !cJSON_IsNull(status_description))
    {
    goto end; //String
    }
    }

    // shipment_info_dto->status_update_time
    cJSON *status_update_time = cJSON_GetObjectItemCaseSensitive(shipment_info_dtoJSON, "statusUpdateTime");
    if (status_update_time) { 
    if(!cJSON_IsString(status_update_time) && !cJSON_IsNull(status_update_time))
    {
    goto end; //DateTime
    }
    }


    shipment_info_dto_local_var = shipment_info_dto_create (
        id ? id->valuedouble : 0,
        plan_interval_from && !cJSON_IsNull(plan_interval_from) ? strdup(plan_interval_from->valuestring) : NULL,
        plan_interval_to && !cJSON_IsNull(plan_interval_to) ? strdup(plan_interval_to->valuestring) : NULL,
        shipment_type ? shipment_type_local_nonprim : NULL,
        warehouse ? warehouse_local_nonprim : NULL,
        warehouse_to ? warehouse_to_local_nonprim : NULL,
        external_id && !cJSON_IsNull(external_id) ? strdup(external_id->valuestring) : NULL,
        delivery_service ? delivery_service_local_nonprim : NULL,
        pallets_count ? pallets_count_local_nonprim : NULL,
        order_idsList,
        draft_count ? draft_count->valuedouble : 0,
        planned_count ? planned_count->valuedouble : 0,
        fact_count ? fact_count->valuedouble : 0,
        status ? status_local_nonprim : NULL,
        status_description && !cJSON_IsNull(status_description) ? strdup(status_description->valuestring) : NULL,
        status_update_time && !cJSON_IsNull(status_update_time) ? strdup(status_update_time->valuestring) : NULL
        );

    return shipment_info_dto_local_var;
end:
    if (shipment_type_local_nonprim) {
        shipment_type_free(shipment_type_local_nonprim);
        shipment_type_local_nonprim = NULL;
    }
    if (warehouse_local_nonprim) {
        partner_shipment_warehouse_dto_free(warehouse_local_nonprim);
        warehouse_local_nonprim = NULL;
    }
    if (warehouse_to_local_nonprim) {
        partner_shipment_warehouse_dto_free(warehouse_to_local_nonprim);
        warehouse_to_local_nonprim = NULL;
    }
    if (delivery_service_local_nonprim) {
        delivery_service_dto_free(delivery_service_local_nonprim);
        delivery_service_local_nonprim = NULL;
    }
    if (pallets_count_local_nonprim) {
        pallets_count_dto_free(pallets_count_local_nonprim);
        pallets_count_local_nonprim = NULL;
    }
    if (order_idsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, order_idsList) {
            free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(order_idsList);
        order_idsList = NULL;
    }
    if (status_local_nonprim) {
        shipment_status_type_free(status_local_nonprim);
        status_local_nonprim = NULL;
    }
    return NULL;

}
