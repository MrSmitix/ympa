#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "get_orders_stats_request.h"


char* get_orders_stats_request_statuses_ToString(_api__get_orders_stats_request__e statuses) {
    char *statusesArray[] =  { "NULL", "CANCELLED_BEFORE_PROCESSING", "CANCELLED_IN_DELIVERY", "CANCELLED_IN_PROCESSING", "DELIVERY", "DELIVERED", "PARTIALLY_DELIVERED", "PARTIALLY_RETURNED", "PENDING", "PICKUP", "PROCESSING", "RESERVED", "RETURNED", "UNKNOWN", "UNPAID", "LOST" };
    return statusesArray[statuses - 1];
}

_api__get_orders_stats_request__e get_orders_stats_request_statuses_FromString(char* statuses) {
    int stringToReturn = 0;
    char *statusesArray[] =  { "NULL", "CANCELLED_BEFORE_PROCESSING", "CANCELLED_IN_DELIVERY", "CANCELLED_IN_PROCESSING", "DELIVERY", "DELIVERED", "PARTIALLY_DELIVERED", "PARTIALLY_RETURNED", "PENDING", "PICKUP", "PROCESSING", "RESERVED", "RETURNED", "UNKNOWN", "UNPAID", "LOST" };
    size_t sizeofArray = sizeof(statusesArray) / sizeof(statusesArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(statuses, statusesArray[stringToReturn]) == 0) {
            return stringToReturn + 1;
        }
        stringToReturn++;
    }
    return 0;
}

get_orders_stats_request_t *get_orders_stats_request_create(
    char *date_from,
    char *date_to,
    char *update_from,
    char *update_to,
    list_t *orders,
    list_t *statuses,
    int has_cis
    ) {
    get_orders_stats_request_t *get_orders_stats_request_local_var = malloc(sizeof(get_orders_stats_request_t));
    if (!get_orders_stats_request_local_var) {
        return NULL;
    }
    get_orders_stats_request_local_var->date_from = date_from;
    get_orders_stats_request_local_var->date_to = date_to;
    get_orders_stats_request_local_var->update_from = update_from;
    get_orders_stats_request_local_var->update_to = update_to;
    get_orders_stats_request_local_var->orders = orders;
    get_orders_stats_request_local_var->statuses = statuses;
    get_orders_stats_request_local_var->has_cis = has_cis;

    return get_orders_stats_request_local_var;
}


void get_orders_stats_request_free(get_orders_stats_request_t *get_orders_stats_request) {
    if(NULL == get_orders_stats_request){
        return ;
    }
    listEntry_t *listEntry;
    if (get_orders_stats_request->date_from) {
        free(get_orders_stats_request->date_from);
        get_orders_stats_request->date_from = NULL;
    }
    if (get_orders_stats_request->date_to) {
        free(get_orders_stats_request->date_to);
        get_orders_stats_request->date_to = NULL;
    }
    if (get_orders_stats_request->update_from) {
        free(get_orders_stats_request->update_from);
        get_orders_stats_request->update_from = NULL;
    }
    if (get_orders_stats_request->update_to) {
        free(get_orders_stats_request->update_to);
        get_orders_stats_request->update_to = NULL;
    }
    if (get_orders_stats_request->orders) {
        list_ForEach(listEntry, get_orders_stats_request->orders) {
            free(listEntry->data);
        }
        list_freeList(get_orders_stats_request->orders);
        get_orders_stats_request->orders = NULL;
    }
    if (get_orders_stats_request->statuses) {
        list_ForEach(listEntry, get_orders_stats_request->statuses) {
            order_stats_status_type_free(listEntry->data);
        }
        list_freeList(get_orders_stats_request->statuses);
        get_orders_stats_request->statuses = NULL;
    }
    free(get_orders_stats_request);
}

cJSON *get_orders_stats_request_convertToJSON(get_orders_stats_request_t *get_orders_stats_request) {
    cJSON *item = cJSON_CreateObject();

    // get_orders_stats_request->date_from
    if(get_orders_stats_request->date_from) {
    if(cJSON_AddStringToObject(item, "dateFrom", get_orders_stats_request->date_from) == NULL) {
    goto fail; //Date
    }
    }


    // get_orders_stats_request->date_to
    if(get_orders_stats_request->date_to) {
    if(cJSON_AddStringToObject(item, "dateTo", get_orders_stats_request->date_to) == NULL) {
    goto fail; //Date
    }
    }


    // get_orders_stats_request->update_from
    if(get_orders_stats_request->update_from) {
    if(cJSON_AddStringToObject(item, "updateFrom", get_orders_stats_request->update_from) == NULL) {
    goto fail; //Date
    }
    }


    // get_orders_stats_request->update_to
    if(get_orders_stats_request->update_to) {
    if(cJSON_AddStringToObject(item, "updateTo", get_orders_stats_request->update_to) == NULL) {
    goto fail; //Date
    }
    }


    // get_orders_stats_request->orders
    if(get_orders_stats_request->orders) {
    cJSON *orders = cJSON_AddArrayToObject(item, "orders");
    if(orders == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *ordersListEntry;
    list_ForEach(ordersListEntry, get_orders_stats_request->orders) {
    if(cJSON_AddNumberToObject(orders, "", *(double *)ordersListEntry->data) == NULL)
    {
        goto fail;
    }
    }
    }


    // get_orders_stats_request->statuses
    if(get_orders_stats_request->statuses != _api__get_orders_stats_request_STATUSES_NULL) {
    cJSON *statuses = cJSON_AddArrayToObject(item, "statuses");
    if(statuses == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *statusesListEntry;
    if (get_orders_stats_request->statuses) {
    list_ForEach(statusesListEntry, get_orders_stats_request->statuses) {
    cJSON *itemLocal = order_stats_status_type_convertToJSON((_api__get_orders_stats_request__e)statusesListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(statuses, itemLocal);
    }
    }
    }


    // get_orders_stats_request->has_cis
    if(get_orders_stats_request->has_cis) {
    if(cJSON_AddBoolToObject(item, "hasCis", get_orders_stats_request->has_cis) == NULL) {
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

get_orders_stats_request_t *get_orders_stats_request_parseFromJSON(cJSON *get_orders_stats_requestJSON){

    get_orders_stats_request_t *get_orders_stats_request_local_var = NULL;

    // define the local list for get_orders_stats_request->orders
    list_t *ordersList = NULL;

    // define the local list for get_orders_stats_request->statuses
    list_t *statusesList = NULL;

    // get_orders_stats_request->date_from
    cJSON *date_from = cJSON_GetObjectItemCaseSensitive(get_orders_stats_requestJSON, "dateFrom");
    if (date_from) { 
    if(!cJSON_IsString(date_from))
    {
    goto end; //Date
    }
    }

    // get_orders_stats_request->date_to
    cJSON *date_to = cJSON_GetObjectItemCaseSensitive(get_orders_stats_requestJSON, "dateTo");
    if (date_to) { 
    if(!cJSON_IsString(date_to))
    {
    goto end; //Date
    }
    }

    // get_orders_stats_request->update_from
    cJSON *update_from = cJSON_GetObjectItemCaseSensitive(get_orders_stats_requestJSON, "updateFrom");
    if (update_from) { 
    if(!cJSON_IsString(update_from))
    {
    goto end; //Date
    }
    }

    // get_orders_stats_request->update_to
    cJSON *update_to = cJSON_GetObjectItemCaseSensitive(get_orders_stats_requestJSON, "updateTo");
    if (update_to) { 
    if(!cJSON_IsString(update_to))
    {
    goto end; //Date
    }
    }

    // get_orders_stats_request->orders
    cJSON *orders = cJSON_GetObjectItemCaseSensitive(get_orders_stats_requestJSON, "orders");
    if (orders) { 
    cJSON *orders_local = NULL;
    if(!cJSON_IsArray(orders)) {
        goto end;//primitive container
    }
    ordersList = list_createList();

    cJSON_ArrayForEach(orders_local, orders)
    {
        if(!cJSON_IsNumber(orders_local))
        {
            goto end;
        }
        double *orders_local_value = (double *)calloc(1, sizeof(double));
        if(!orders_local_value)
        {
            goto end;
        }
        *orders_local_value = orders_local->valuedouble;
        list_addElement(ordersList , orders_local_value);
    }
    }

    // get_orders_stats_request->statuses
    cJSON *statuses = cJSON_GetObjectItemCaseSensitive(get_orders_stats_requestJSON, "statuses");
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
        get_orders_stats_request_order_stats_status_type_e statusesItem = order_stats_status_type_parseFromJSON(statuses_local_nonprimitive);

        list_addElement(statusesList, (void *)statusesItem);
    }
    }

    // get_orders_stats_request->has_cis
    cJSON *has_cis = cJSON_GetObjectItemCaseSensitive(get_orders_stats_requestJSON, "hasCis");
    if (has_cis) { 
    if(!cJSON_IsBool(has_cis))
    {
    goto end; //Bool
    }
    }


    get_orders_stats_request_local_var = get_orders_stats_request_create (
        date_from ? strdup(date_from->valuestring) : NULL,
        date_to ? strdup(date_to->valuestring) : NULL,
        update_from ? strdup(update_from->valuestring) : NULL,
        update_to ? strdup(update_to->valuestring) : NULL,
        orders ? ordersList : NULL,
        statuses ? statusesList : NULL,
        has_cis ? has_cis->valueint : 0
        );

    return get_orders_stats_request_local_var;
end:
    if (ordersList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, ordersList) {
            free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(ordersList);
        ordersList = NULL;
    }
    if (statusesList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, statusesList) {
            order_stats_status_type_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(statusesList);
        statusesList = NULL;
    }
    return NULL;

}
