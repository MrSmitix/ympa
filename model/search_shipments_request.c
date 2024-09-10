#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "search_shipments_request.h"


char* search_shipments_request_statuses_ToString(_api__search_shipments_request__e statuses) {
    char *statusesArray[] =  { "NULL", "OUTBOUND_CREATED", "OUTBOUND_READY_FOR_CONFIRMATION", "OUTBOUND_CONFIRMED", "OUTBOUND_SIGNED", "FINISHED", "ACCEPTED", "ACCEPTED_WITH_DISCREPANCIES", "ERROR" };
    return statusesArray[statuses - 1];
}

_api__search_shipments_request__e search_shipments_request_statuses_FromString(char* statuses) {
    int stringToReturn = 0;
    char *statusesArray[] =  { "NULL", "OUTBOUND_CREATED", "OUTBOUND_READY_FOR_CONFIRMATION", "OUTBOUND_CONFIRMED", "OUTBOUND_SIGNED", "FINISHED", "ACCEPTED", "ACCEPTED_WITH_DISCREPANCIES", "ERROR" };
    size_t sizeofArray = sizeof(statusesArray) / sizeof(statusesArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(statuses, statusesArray[stringToReturn]) == 0) {
            return stringToReturn + 1;
        }
        stringToReturn++;
    }
    return 0;
}

search_shipments_request_t *search_shipments_request_create(
    char *date_from,
    char *date_to,
    list_t *statuses,
    list_t *order_ids,
    int cancelled_orders
    ) {
    search_shipments_request_t *search_shipments_request_local_var = malloc(sizeof(search_shipments_request_t));
    if (!search_shipments_request_local_var) {
        return NULL;
    }
    search_shipments_request_local_var->date_from = date_from;
    search_shipments_request_local_var->date_to = date_to;
    search_shipments_request_local_var->statuses = statuses;
    search_shipments_request_local_var->order_ids = order_ids;
    search_shipments_request_local_var->cancelled_orders = cancelled_orders;

    return search_shipments_request_local_var;
}


void search_shipments_request_free(search_shipments_request_t *search_shipments_request) {
    if(NULL == search_shipments_request){
        return ;
    }
    listEntry_t *listEntry;
    if (search_shipments_request->date_from) {
        free(search_shipments_request->date_from);
        search_shipments_request->date_from = NULL;
    }
    if (search_shipments_request->date_to) {
        free(search_shipments_request->date_to);
        search_shipments_request->date_to = NULL;
    }
    if (search_shipments_request->statuses) {
        list_ForEach(listEntry, search_shipments_request->statuses) {
            shipment_status_type_free(listEntry->data);
        }
        list_freeList(search_shipments_request->statuses);
        search_shipments_request->statuses = NULL;
    }
    if (search_shipments_request->order_ids) {
        list_ForEach(listEntry, search_shipments_request->order_ids) {
            free(listEntry->data);
        }
        list_freeList(search_shipments_request->order_ids);
        search_shipments_request->order_ids = NULL;
    }
    free(search_shipments_request);
}

cJSON *search_shipments_request_convertToJSON(search_shipments_request_t *search_shipments_request) {
    cJSON *item = cJSON_CreateObject();

    // search_shipments_request->date_from
    if (!search_shipments_request->date_from) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "dateFrom", search_shipments_request->date_from) == NULL) {
    goto fail; //Date
    }


    // search_shipments_request->date_to
    if (!search_shipments_request->date_to) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "dateTo", search_shipments_request->date_to) == NULL) {
    goto fail; //Date
    }


    // search_shipments_request->statuses
    if(search_shipments_request->statuses != _api__search_shipments_request_STATUSES_NULL) {
    cJSON *statuses = cJSON_AddArrayToObject(item, "statuses");
    if(statuses == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *statusesListEntry;
    if (search_shipments_request->statuses) {
    list_ForEach(statusesListEntry, search_shipments_request->statuses) {
    cJSON *itemLocal = shipment_status_type_convertToJSON((_api__search_shipments_request__e)statusesListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(statuses, itemLocal);
    }
    }
    }


    // search_shipments_request->order_ids
    if(search_shipments_request->order_ids) {
    cJSON *order_ids = cJSON_AddArrayToObject(item, "orderIds");
    if(order_ids == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *order_idsListEntry;
    list_ForEach(order_idsListEntry, search_shipments_request->order_ids) {
    if(cJSON_AddNumberToObject(order_ids, "", *(double *)order_idsListEntry->data) == NULL)
    {
        goto fail;
    }
    }
    }


    // search_shipments_request->cancelled_orders
    if(search_shipments_request->cancelled_orders) {
    if(cJSON_AddBoolToObject(item, "cancelledOrders", search_shipments_request->cancelled_orders) == NULL) {
    goto fail; //Bool
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

search_shipments_request_t *search_shipments_request_parseFromJSON(cJSON *search_shipments_requestJSON){

    search_shipments_request_t *search_shipments_request_local_var = NULL;

    // define the local list for search_shipments_request->statuses
    list_t *statusesList = NULL;

    // define the local list for search_shipments_request->order_ids
    list_t *order_idsList = NULL;

    // search_shipments_request->date_from
    cJSON *date_from = cJSON_GetObjectItemCaseSensitive(search_shipments_requestJSON, "dateFrom");
    if (!date_from) {
        goto end;
    }

    
    if(!cJSON_IsString(date_from))
    {
    goto end; //Date
    }

    // search_shipments_request->date_to
    cJSON *date_to = cJSON_GetObjectItemCaseSensitive(search_shipments_requestJSON, "dateTo");
    if (!date_to) {
        goto end;
    }

    
    if(!cJSON_IsString(date_to))
    {
    goto end; //Date
    }

    // search_shipments_request->statuses
    cJSON *statuses = cJSON_GetObjectItemCaseSensitive(search_shipments_requestJSON, "statuses");
    if (statuses) { 
    cJSON *statuses_local_nonprimitive = NULL;
    if(!cJSON_IsArray(statuses)){
        goto end; //nonprimitive container
    }

    statusesList = list_createList();

    cJSON_ArrayForEach(statuses_local_nonprimitive,statuses )
    {
        if(!cJSON_IsObject(statuses_local_nonprimitive)){
            goto end;
        }
        search_shipments_request_shipment_status_type_e statusesItem = shipment_status_type_parseFromJSON(statuses_local_nonprimitive);

        list_addElement(statusesList, (void *)statusesItem);
    }
    }

    // search_shipments_request->order_ids
    cJSON *order_ids = cJSON_GetObjectItemCaseSensitive(search_shipments_requestJSON, "orderIds");
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

    // search_shipments_request->cancelled_orders
    cJSON *cancelled_orders = cJSON_GetObjectItemCaseSensitive(search_shipments_requestJSON, "cancelledOrders");
    if (cancelled_orders) { 
    if(!cJSON_IsBool(cancelled_orders))
    {
    goto end; //Bool
    }
    }


    search_shipments_request_local_var = search_shipments_request_create (
        strdup(date_from->valuestring),
        strdup(date_to->valuestring),
        statuses ? statusesList : NULL,
        order_ids ? order_idsList : NULL,
        cancelled_orders ? cancelled_orders->valueint : 0
        );

    return search_shipments_request_local_var;
end:
    if (statusesList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, statusesList) {
            shipment_status_type_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(statusesList);
        statusesList = NULL;
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
