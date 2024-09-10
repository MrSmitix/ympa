#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "base_shipment_dto.h"


char* base_shipment_dto_shipment_type_ToString(_api__base_shipment_dto__e shipment_type) {
    char* shipment_typeArray[] =  { "NULL", "IMPORT", "WITHDRAW" };
    return shipment_typeArray[shipment_type];
}

_api__base_shipment_dto__e base_shipment_dto_shipment_type_FromString(char* shipment_type){
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

base_shipment_dto_t *base_shipment_dto_create(
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
    int fact_count
    ) {
    base_shipment_dto_t *base_shipment_dto_local_var = malloc(sizeof(base_shipment_dto_t));
    if (!base_shipment_dto_local_var) {
        return NULL;
    }
    base_shipment_dto_local_var->id = id;
    base_shipment_dto_local_var->plan_interval_from = plan_interval_from;
    base_shipment_dto_local_var->plan_interval_to = plan_interval_to;
    base_shipment_dto_local_var->shipment_type = shipment_type;
    base_shipment_dto_local_var->warehouse = warehouse;
    base_shipment_dto_local_var->warehouse_to = warehouse_to;
    base_shipment_dto_local_var->external_id = external_id;
    base_shipment_dto_local_var->delivery_service = delivery_service;
    base_shipment_dto_local_var->pallets_count = pallets_count;
    base_shipment_dto_local_var->order_ids = order_ids;
    base_shipment_dto_local_var->draft_count = draft_count;
    base_shipment_dto_local_var->planned_count = planned_count;
    base_shipment_dto_local_var->fact_count = fact_count;

    return base_shipment_dto_local_var;
}


void base_shipment_dto_free(base_shipment_dto_t *base_shipment_dto) {
    if(NULL == base_shipment_dto){
        return ;
    }
    listEntry_t *listEntry;
    if (base_shipment_dto->plan_interval_from) {
        free(base_shipment_dto->plan_interval_from);
        base_shipment_dto->plan_interval_from = NULL;
    }
    if (base_shipment_dto->plan_interval_to) {
        free(base_shipment_dto->plan_interval_to);
        base_shipment_dto->plan_interval_to = NULL;
    }
    if (base_shipment_dto->shipment_type) {
        shipment_type_free(base_shipment_dto->shipment_type);
        base_shipment_dto->shipment_type = NULL;
    }
    if (base_shipment_dto->warehouse) {
        partner_shipment_warehouse_dto_free(base_shipment_dto->warehouse);
        base_shipment_dto->warehouse = NULL;
    }
    if (base_shipment_dto->warehouse_to) {
        partner_shipment_warehouse_dto_free(base_shipment_dto->warehouse_to);
        base_shipment_dto->warehouse_to = NULL;
    }
    if (base_shipment_dto->external_id) {
        free(base_shipment_dto->external_id);
        base_shipment_dto->external_id = NULL;
    }
    if (base_shipment_dto->delivery_service) {
        delivery_service_dto_free(base_shipment_dto->delivery_service);
        base_shipment_dto->delivery_service = NULL;
    }
    if (base_shipment_dto->pallets_count) {
        pallets_count_dto_free(base_shipment_dto->pallets_count);
        base_shipment_dto->pallets_count = NULL;
    }
    if (base_shipment_dto->order_ids) {
        list_ForEach(listEntry, base_shipment_dto->order_ids) {
            free(listEntry->data);
        }
        list_freeList(base_shipment_dto->order_ids);
        base_shipment_dto->order_ids = NULL;
    }
    free(base_shipment_dto);
}

cJSON *base_shipment_dto_convertToJSON(base_shipment_dto_t *base_shipment_dto) {
    cJSON *item = cJSON_CreateObject();

    // base_shipment_dto->id
    if(base_shipment_dto->id) {
    if(cJSON_AddNumberToObject(item, "id", base_shipment_dto->id) == NULL) {
    goto fail; //Numeric
    }
    }


    // base_shipment_dto->plan_interval_from
    if(base_shipment_dto->plan_interval_from) {
    if(cJSON_AddStringToObject(item, "planIntervalFrom", base_shipment_dto->plan_interval_from) == NULL) {
    goto fail; //Date-Time
    }
    }


    // base_shipment_dto->plan_interval_to
    if(base_shipment_dto->plan_interval_to) {
    if(cJSON_AddStringToObject(item, "planIntervalTo", base_shipment_dto->plan_interval_to) == NULL) {
    goto fail; //Date-Time
    }
    }


    // base_shipment_dto->shipment_type
    if(base_shipment_dto->shipment_type != _api__base_shipment_dto__NULL) {
    cJSON *shipment_type_local_JSON = shipment_type_convertToJSON(base_shipment_dto->shipment_type);
    if(shipment_type_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "shipmentType", shipment_type_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // base_shipment_dto->warehouse
    if(base_shipment_dto->warehouse) {
    cJSON *warehouse_local_JSON = partner_shipment_warehouse_dto_convertToJSON(base_shipment_dto->warehouse);
    if(warehouse_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "warehouse", warehouse_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // base_shipment_dto->warehouse_to
    if(base_shipment_dto->warehouse_to) {
    cJSON *warehouse_to_local_JSON = partner_shipment_warehouse_dto_convertToJSON(base_shipment_dto->warehouse_to);
    if(warehouse_to_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "warehouseTo", warehouse_to_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // base_shipment_dto->external_id
    if(base_shipment_dto->external_id) {
    if(cJSON_AddStringToObject(item, "externalId", base_shipment_dto->external_id) == NULL) {
    goto fail; //String
    }
    }


    // base_shipment_dto->delivery_service
    if(base_shipment_dto->delivery_service) {
    cJSON *delivery_service_local_JSON = delivery_service_dto_convertToJSON(base_shipment_dto->delivery_service);
    if(delivery_service_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "deliveryService", delivery_service_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // base_shipment_dto->pallets_count
    if(base_shipment_dto->pallets_count) {
    cJSON *pallets_count_local_JSON = pallets_count_dto_convertToJSON(base_shipment_dto->pallets_count);
    if(pallets_count_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "palletsCount", pallets_count_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // base_shipment_dto->order_ids
    if (!base_shipment_dto->order_ids) {
        goto fail;
    }
    cJSON *order_ids = cJSON_AddArrayToObject(item, "orderIds");
    if(order_ids == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *order_idsListEntry;
    list_ForEach(order_idsListEntry, base_shipment_dto->order_ids) {
    if(cJSON_AddNumberToObject(order_ids, "", *(double *)order_idsListEntry->data) == NULL)
    {
        goto fail;
    }
    }


    // base_shipment_dto->draft_count
    if(base_shipment_dto->draft_count) {
    if(cJSON_AddNumberToObject(item, "draftCount", base_shipment_dto->draft_count) == NULL) {
    goto fail; //Numeric
    }
    }


    // base_shipment_dto->planned_count
    if(base_shipment_dto->planned_count) {
    if(cJSON_AddNumberToObject(item, "plannedCount", base_shipment_dto->planned_count) == NULL) {
    goto fail; //Numeric
    }
    }


    // base_shipment_dto->fact_count
    if(base_shipment_dto->fact_count) {
    if(cJSON_AddNumberToObject(item, "factCount", base_shipment_dto->fact_count) == NULL) {
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

base_shipment_dto_t *base_shipment_dto_parseFromJSON(cJSON *base_shipment_dtoJSON){

    base_shipment_dto_t *base_shipment_dto_local_var = NULL;

    // define the local variable for base_shipment_dto->shipment_type
    shipment_type_t *shipment_type_local_nonprim = NULL;

    // define the local variable for base_shipment_dto->warehouse
    partner_shipment_warehouse_dto_t *warehouse_local_nonprim = NULL;

    // define the local variable for base_shipment_dto->warehouse_to
    partner_shipment_warehouse_dto_t *warehouse_to_local_nonprim = NULL;

    // define the local variable for base_shipment_dto->delivery_service
    delivery_service_dto_t *delivery_service_local_nonprim = NULL;

    // define the local variable for base_shipment_dto->pallets_count
    pallets_count_dto_t *pallets_count_local_nonprim = NULL;

    // define the local list for base_shipment_dto->order_ids
    list_t *order_idsList = NULL;

    // base_shipment_dto->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(base_shipment_dtoJSON, "id");
    if (id) { 
    if(!cJSON_IsNumber(id))
    {
    goto end; //Numeric
    }
    }

    // base_shipment_dto->plan_interval_from
    cJSON *plan_interval_from = cJSON_GetObjectItemCaseSensitive(base_shipment_dtoJSON, "planIntervalFrom");
    if (plan_interval_from) { 
    if(!cJSON_IsString(plan_interval_from) && !cJSON_IsNull(plan_interval_from))
    {
    goto end; //DateTime
    }
    }

    // base_shipment_dto->plan_interval_to
    cJSON *plan_interval_to = cJSON_GetObjectItemCaseSensitive(base_shipment_dtoJSON, "planIntervalTo");
    if (plan_interval_to) { 
    if(!cJSON_IsString(plan_interval_to) && !cJSON_IsNull(plan_interval_to))
    {
    goto end; //DateTime
    }
    }

    // base_shipment_dto->shipment_type
    cJSON *shipment_type = cJSON_GetObjectItemCaseSensitive(base_shipment_dtoJSON, "shipmentType");
    if (shipment_type) { 
    shipment_type_local_nonprim = shipment_type_parseFromJSON(shipment_type); //custom
    }

    // base_shipment_dto->warehouse
    cJSON *warehouse = cJSON_GetObjectItemCaseSensitive(base_shipment_dtoJSON, "warehouse");
    if (warehouse) { 
    warehouse_local_nonprim = partner_shipment_warehouse_dto_parseFromJSON(warehouse); //nonprimitive
    }

    // base_shipment_dto->warehouse_to
    cJSON *warehouse_to = cJSON_GetObjectItemCaseSensitive(base_shipment_dtoJSON, "warehouseTo");
    if (warehouse_to) { 
    warehouse_to_local_nonprim = partner_shipment_warehouse_dto_parseFromJSON(warehouse_to); //nonprimitive
    }

    // base_shipment_dto->external_id
    cJSON *external_id = cJSON_GetObjectItemCaseSensitive(base_shipment_dtoJSON, "externalId");
    if (external_id) { 
    if(!cJSON_IsString(external_id) && !cJSON_IsNull(external_id))
    {
    goto end; //String
    }
    }

    // base_shipment_dto->delivery_service
    cJSON *delivery_service = cJSON_GetObjectItemCaseSensitive(base_shipment_dtoJSON, "deliveryService");
    if (delivery_service) { 
    delivery_service_local_nonprim = delivery_service_dto_parseFromJSON(delivery_service); //nonprimitive
    }

    // base_shipment_dto->pallets_count
    cJSON *pallets_count = cJSON_GetObjectItemCaseSensitive(base_shipment_dtoJSON, "palletsCount");
    if (pallets_count) { 
    pallets_count_local_nonprim = pallets_count_dto_parseFromJSON(pallets_count); //nonprimitive
    }

    // base_shipment_dto->order_ids
    cJSON *order_ids = cJSON_GetObjectItemCaseSensitive(base_shipment_dtoJSON, "orderIds");
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

    // base_shipment_dto->draft_count
    cJSON *draft_count = cJSON_GetObjectItemCaseSensitive(base_shipment_dtoJSON, "draftCount");
    if (draft_count) { 
    if(!cJSON_IsNumber(draft_count))
    {
    goto end; //Numeric
    }
    }

    // base_shipment_dto->planned_count
    cJSON *planned_count = cJSON_GetObjectItemCaseSensitive(base_shipment_dtoJSON, "plannedCount");
    if (planned_count) { 
    if(!cJSON_IsNumber(planned_count))
    {
    goto end; //Numeric
    }
    }

    // base_shipment_dto->fact_count
    cJSON *fact_count = cJSON_GetObjectItemCaseSensitive(base_shipment_dtoJSON, "factCount");
    if (fact_count) { 
    if(!cJSON_IsNumber(fact_count))
    {
    goto end; //Numeric
    }
    }


    base_shipment_dto_local_var = base_shipment_dto_create (
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
        fact_count ? fact_count->valuedouble : 0
        );

    return base_shipment_dto_local_var;
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
    return NULL;

}
