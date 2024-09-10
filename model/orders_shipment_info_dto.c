#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "orders_shipment_info_dto.h"



orders_shipment_info_dto_t *orders_shipment_info_dto_create(
    list_t *order_ids_with_labels,
    list_t *order_ids_without_labels
    ) {
    orders_shipment_info_dto_t *orders_shipment_info_dto_local_var = malloc(sizeof(orders_shipment_info_dto_t));
    if (!orders_shipment_info_dto_local_var) {
        return NULL;
    }
    orders_shipment_info_dto_local_var->order_ids_with_labels = order_ids_with_labels;
    orders_shipment_info_dto_local_var->order_ids_without_labels = order_ids_without_labels;

    return orders_shipment_info_dto_local_var;
}


void orders_shipment_info_dto_free(orders_shipment_info_dto_t *orders_shipment_info_dto) {
    if(NULL == orders_shipment_info_dto){
        return ;
    }
    listEntry_t *listEntry;
    if (orders_shipment_info_dto->order_ids_with_labels) {
        list_ForEach(listEntry, orders_shipment_info_dto->order_ids_with_labels) {
            free(listEntry->data);
        }
        list_freeList(orders_shipment_info_dto->order_ids_with_labels);
        orders_shipment_info_dto->order_ids_with_labels = NULL;
    }
    if (orders_shipment_info_dto->order_ids_without_labels) {
        list_ForEach(listEntry, orders_shipment_info_dto->order_ids_without_labels) {
            free(listEntry->data);
        }
        list_freeList(orders_shipment_info_dto->order_ids_without_labels);
        orders_shipment_info_dto->order_ids_without_labels = NULL;
    }
    free(orders_shipment_info_dto);
}

cJSON *orders_shipment_info_dto_convertToJSON(orders_shipment_info_dto_t *orders_shipment_info_dto) {
    cJSON *item = cJSON_CreateObject();

    // orders_shipment_info_dto->order_ids_with_labels
    if (!orders_shipment_info_dto->order_ids_with_labels) {
        goto fail;
    }
    cJSON *order_ids_with_labels = cJSON_AddArrayToObject(item, "orderIdsWithLabels");
    if(order_ids_with_labels == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *order_ids_with_labelsListEntry;
    list_ForEach(order_ids_with_labelsListEntry, orders_shipment_info_dto->order_ids_with_labels) {
    if(cJSON_AddNumberToObject(order_ids_with_labels, "", *(double *)order_ids_with_labelsListEntry->data) == NULL)
    {
        goto fail;
    }
    }


    // orders_shipment_info_dto->order_ids_without_labels
    if (!orders_shipment_info_dto->order_ids_without_labels) {
        goto fail;
    }
    cJSON *order_ids_without_labels = cJSON_AddArrayToObject(item, "orderIdsWithoutLabels");
    if(order_ids_without_labels == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *order_ids_without_labelsListEntry;
    list_ForEach(order_ids_without_labelsListEntry, orders_shipment_info_dto->order_ids_without_labels) {
    if(cJSON_AddNumberToObject(order_ids_without_labels, "", *(double *)order_ids_without_labelsListEntry->data) == NULL)
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

orders_shipment_info_dto_t *orders_shipment_info_dto_parseFromJSON(cJSON *orders_shipment_info_dtoJSON){

    orders_shipment_info_dto_t *orders_shipment_info_dto_local_var = NULL;

    // define the local list for orders_shipment_info_dto->order_ids_with_labels
    list_t *order_ids_with_labelsList = NULL;

    // define the local list for orders_shipment_info_dto->order_ids_without_labels
    list_t *order_ids_without_labelsList = NULL;

    // orders_shipment_info_dto->order_ids_with_labels
    cJSON *order_ids_with_labels = cJSON_GetObjectItemCaseSensitive(orders_shipment_info_dtoJSON, "orderIdsWithLabels");
    if (!order_ids_with_labels) {
        goto end;
    }

    
    cJSON *order_ids_with_labels_local = NULL;
    if(!cJSON_IsArray(order_ids_with_labels)) {
        goto end;//primitive container
    }
    order_ids_with_labelsList = list_createList();

    cJSON_ArrayForEach(order_ids_with_labels_local, order_ids_with_labels)
    {
        if(!cJSON_IsNumber(order_ids_with_labels_local))
        {
            goto end;
        }
        double *order_ids_with_labels_local_value = (double *)calloc(1, sizeof(double));
        if(!order_ids_with_labels_local_value)
        {
            goto end;
        }
        *order_ids_with_labels_local_value = order_ids_with_labels_local->valuedouble;
        list_addElement(order_ids_with_labelsList , order_ids_with_labels_local_value);
    }

    // orders_shipment_info_dto->order_ids_without_labels
    cJSON *order_ids_without_labels = cJSON_GetObjectItemCaseSensitive(orders_shipment_info_dtoJSON, "orderIdsWithoutLabels");
    if (!order_ids_without_labels) {
        goto end;
    }

    
    cJSON *order_ids_without_labels_local = NULL;
    if(!cJSON_IsArray(order_ids_without_labels)) {
        goto end;//primitive container
    }
    order_ids_without_labelsList = list_createList();

    cJSON_ArrayForEach(order_ids_without_labels_local, order_ids_without_labels)
    {
        if(!cJSON_IsNumber(order_ids_without_labels_local))
        {
            goto end;
        }
        double *order_ids_without_labels_local_value = (double *)calloc(1, sizeof(double));
        if(!order_ids_without_labels_local_value)
        {
            goto end;
        }
        *order_ids_without_labels_local_value = order_ids_without_labels_local->valuedouble;
        list_addElement(order_ids_without_labelsList , order_ids_without_labels_local_value);
    }


    orders_shipment_info_dto_local_var = orders_shipment_info_dto_create (
        order_ids_with_labelsList,
        order_ids_without_labelsList
        );

    return orders_shipment_info_dto_local_var;
end:
    if (order_ids_with_labelsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, order_ids_with_labelsList) {
            free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(order_ids_with_labelsList);
        order_ids_with_labelsList = NULL;
    }
    if (order_ids_without_labelsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, order_ids_without_labelsList) {
            free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(order_ids_without_labelsList);
        order_ids_without_labelsList = NULL;
    }
    return NULL;

}
