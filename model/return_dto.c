#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "return_dto.h"


char* return_dto_refund_status_ToString(_api__return_dto__e refund_status) {
    char* refund_statusArray[] =  { "NULL", "STARTED_BY_USER", "REFUND_IN_PROGRESS", "REFUNDED", "FAILED", "WAITING_FOR_DECISION", "DECISION_MADE", "REFUNDED_WITH_BONUSES", "REFUNDED_BY_SHOP", "CANCELLED", "COMPLETE_WITHOUT_REFUND", "UNKNOWN" };
    return refund_statusArray[refund_status];
}

_api__return_dto__e return_dto_refund_status_FromString(char* refund_status){
    int stringToReturn = 0;
    char *refund_statusArray[] =  { "NULL", "STARTED_BY_USER", "REFUND_IN_PROGRESS", "REFUNDED", "FAILED", "WAITING_FOR_DECISION", "DECISION_MADE", "REFUNDED_WITH_BONUSES", "REFUNDED_BY_SHOP", "CANCELLED", "COMPLETE_WITHOUT_REFUND", "UNKNOWN" };
    size_t sizeofArray = sizeof(refund_statusArray) / sizeof(refund_statusArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(refund_status, refund_statusArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}
char* return_dto_shipment_recipient_type_ToString(_api__return_dto__e shipment_recipient_type) {
    char* shipment_recipient_typeArray[] =  { "NULL", "SHOP", "DELIVERY_SERVICE", "POST" };
    return shipment_recipient_typeArray[shipment_recipient_type];
}

_api__return_dto__e return_dto_shipment_recipient_type_FromString(char* shipment_recipient_type){
    int stringToReturn = 0;
    char *shipment_recipient_typeArray[] =  { "NULL", "SHOP", "DELIVERY_SERVICE", "POST" };
    size_t sizeofArray = sizeof(shipment_recipient_typeArray) / sizeof(shipment_recipient_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(shipment_recipient_type, shipment_recipient_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}
char* return_dto_shipment_status_ToString(_api__return_dto__e shipment_status) {
    char* shipment_statusArray[] =  { "NULL", "CREATED", "RECEIVED", "IN_TRANSIT", "READY_FOR_PICKUP", "PICKED", "LOST", "EXPIRED", "CANCELLED", "FULFILMENT_RECEIVED", "PREPARED_FOR_UTILIZATION", "NOT_IN_DEMAND", "UTILIZED", "READY_FOR_EXPROPRIATION", "RECEIVED_FOR_EXPROPRIATION" };
    return shipment_statusArray[shipment_status];
}

_api__return_dto__e return_dto_shipment_status_FromString(char* shipment_status){
    int stringToReturn = 0;
    char *shipment_statusArray[] =  { "NULL", "CREATED", "RECEIVED", "IN_TRANSIT", "READY_FOR_PICKUP", "PICKED", "LOST", "EXPIRED", "CANCELLED", "FULFILMENT_RECEIVED", "PREPARED_FOR_UTILIZATION", "NOT_IN_DEMAND", "UTILIZED", "READY_FOR_EXPROPRIATION", "RECEIVED_FOR_EXPROPRIATION" };
    size_t sizeofArray = sizeof(shipment_statusArray) / sizeof(shipment_statusArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(shipment_status, shipment_statusArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}
char* return_dto_return_type_ToString(_api__return_dto__e return_type) {
    char* return_typeArray[] =  { "NULL", "UNREDEEMED", "RETURN" };
    return return_typeArray[return_type];
}

_api__return_dto__e return_dto_return_type_FromString(char* return_type){
    int stringToReturn = 0;
    char *return_typeArray[] =  { "NULL", "UNREDEEMED", "RETURN" };
    size_t sizeofArray = sizeof(return_typeArray) / sizeof(return_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(return_type, return_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

return_dto_t *return_dto_create(
    long id,
    long order_id,
    char *creation_date,
    char *update_date,
    refund_status_type_t *refund_status,
    logistic_pickup_point_dto_t *logistic_pickup_point,
    recipient_type_t *shipment_recipient_type,
    return_shipment_status_type_t *shipment_status,
    long refund_amount,
    list_t *items,
    return_type_t *return_type,
    int fast_return
    ) {
    return_dto_t *return_dto_local_var = malloc(sizeof(return_dto_t));
    if (!return_dto_local_var) {
        return NULL;
    }
    return_dto_local_var->id = id;
    return_dto_local_var->order_id = order_id;
    return_dto_local_var->creation_date = creation_date;
    return_dto_local_var->update_date = update_date;
    return_dto_local_var->refund_status = refund_status;
    return_dto_local_var->logistic_pickup_point = logistic_pickup_point;
    return_dto_local_var->shipment_recipient_type = shipment_recipient_type;
    return_dto_local_var->shipment_status = shipment_status;
    return_dto_local_var->refund_amount = refund_amount;
    return_dto_local_var->items = items;
    return_dto_local_var->return_type = return_type;
    return_dto_local_var->fast_return = fast_return;

    return return_dto_local_var;
}


void return_dto_free(return_dto_t *return_dto) {
    if(NULL == return_dto){
        return ;
    }
    listEntry_t *listEntry;
    if (return_dto->creation_date) {
        free(return_dto->creation_date);
        return_dto->creation_date = NULL;
    }
    if (return_dto->update_date) {
        free(return_dto->update_date);
        return_dto->update_date = NULL;
    }
    if (return_dto->refund_status) {
        refund_status_type_free(return_dto->refund_status);
        return_dto->refund_status = NULL;
    }
    if (return_dto->logistic_pickup_point) {
        logistic_pickup_point_dto_free(return_dto->logistic_pickup_point);
        return_dto->logistic_pickup_point = NULL;
    }
    if (return_dto->shipment_recipient_type) {
        recipient_type_free(return_dto->shipment_recipient_type);
        return_dto->shipment_recipient_type = NULL;
    }
    if (return_dto->shipment_status) {
        return_shipment_status_type_free(return_dto->shipment_status);
        return_dto->shipment_status = NULL;
    }
    if (return_dto->items) {
        list_ForEach(listEntry, return_dto->items) {
            return_item_dto_free(listEntry->data);
        }
        list_freeList(return_dto->items);
        return_dto->items = NULL;
    }
    if (return_dto->return_type) {
        return_type_free(return_dto->return_type);
        return_dto->return_type = NULL;
    }
    free(return_dto);
}

cJSON *return_dto_convertToJSON(return_dto_t *return_dto) {
    cJSON *item = cJSON_CreateObject();

    // return_dto->id
    if(return_dto->id) {
    if(cJSON_AddNumberToObject(item, "id", return_dto->id) == NULL) {
    goto fail; //Numeric
    }
    }


    // return_dto->order_id
    if(return_dto->order_id) {
    if(cJSON_AddNumberToObject(item, "orderId", return_dto->order_id) == NULL) {
    goto fail; //Numeric
    }
    }


    // return_dto->creation_date
    if(return_dto->creation_date) {
    if(cJSON_AddStringToObject(item, "creationDate", return_dto->creation_date) == NULL) {
    goto fail; //Date-Time
    }
    }


    // return_dto->update_date
    if(return_dto->update_date) {
    if(cJSON_AddStringToObject(item, "updateDate", return_dto->update_date) == NULL) {
    goto fail; //Date-Time
    }
    }


    // return_dto->refund_status
    if(return_dto->refund_status != _api__return_dto__NULL) {
    cJSON *refund_status_local_JSON = refund_status_type_convertToJSON(return_dto->refund_status);
    if(refund_status_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "refundStatus", refund_status_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // return_dto->logistic_pickup_point
    if(return_dto->logistic_pickup_point) {
    cJSON *logistic_pickup_point_local_JSON = logistic_pickup_point_dto_convertToJSON(return_dto->logistic_pickup_point);
    if(logistic_pickup_point_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "logisticPickupPoint", logistic_pickup_point_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // return_dto->shipment_recipient_type
    if(return_dto->shipment_recipient_type != _api__return_dto__NULL) {
    cJSON *shipment_recipient_type_local_JSON = recipient_type_convertToJSON(return_dto->shipment_recipient_type);
    if(shipment_recipient_type_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "shipmentRecipientType", shipment_recipient_type_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // return_dto->shipment_status
    if(return_dto->shipment_status != _api__return_dto__NULL) {
    cJSON *shipment_status_local_JSON = return_shipment_status_type_convertToJSON(return_dto->shipment_status);
    if(shipment_status_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "shipmentStatus", shipment_status_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // return_dto->refund_amount
    if(return_dto->refund_amount) {
    if(cJSON_AddNumberToObject(item, "refundAmount", return_dto->refund_amount) == NULL) {
    goto fail; //Numeric
    }
    }


    // return_dto->items
    if (!return_dto->items) {
        goto fail;
    }
    cJSON *items = cJSON_AddArrayToObject(item, "items");
    if(items == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *itemsListEntry;
    if (return_dto->items) {
    list_ForEach(itemsListEntry, return_dto->items) {
    cJSON *itemLocal = return_item_dto_convertToJSON(itemsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(items, itemLocal);
    }
    }


    // return_dto->return_type
    if(return_dto->return_type != _api__return_dto__NULL) {
    cJSON *return_type_local_JSON = return_type_convertToJSON(return_dto->return_type);
    if(return_type_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "returnType", return_type_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // return_dto->fast_return
    if(return_dto->fast_return) {
    if(cJSON_AddBoolToObject(item, "fastReturn", return_dto->fast_return) == NULL) {
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

return_dto_t *return_dto_parseFromJSON(cJSON *return_dtoJSON){

    return_dto_t *return_dto_local_var = NULL;

    // define the local variable for return_dto->refund_status
    refund_status_type_t *refund_status_local_nonprim = NULL;

    // define the local variable for return_dto->logistic_pickup_point
    logistic_pickup_point_dto_t *logistic_pickup_point_local_nonprim = NULL;

    // define the local variable for return_dto->shipment_recipient_type
    recipient_type_t *shipment_recipient_type_local_nonprim = NULL;

    // define the local variable for return_dto->shipment_status
    return_shipment_status_type_t *shipment_status_local_nonprim = NULL;

    // define the local list for return_dto->items
    list_t *itemsList = NULL;

    // define the local variable for return_dto->return_type
    return_type_t *return_type_local_nonprim = NULL;

    // return_dto->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(return_dtoJSON, "id");
    if (id) { 
    if(!cJSON_IsNumber(id))
    {
    goto end; //Numeric
    }
    }

    // return_dto->order_id
    cJSON *order_id = cJSON_GetObjectItemCaseSensitive(return_dtoJSON, "orderId");
    if (order_id) { 
    if(!cJSON_IsNumber(order_id))
    {
    goto end; //Numeric
    }
    }

    // return_dto->creation_date
    cJSON *creation_date = cJSON_GetObjectItemCaseSensitive(return_dtoJSON, "creationDate");
    if (creation_date) { 
    if(!cJSON_IsString(creation_date) && !cJSON_IsNull(creation_date))
    {
    goto end; //DateTime
    }
    }

    // return_dto->update_date
    cJSON *update_date = cJSON_GetObjectItemCaseSensitive(return_dtoJSON, "updateDate");
    if (update_date) { 
    if(!cJSON_IsString(update_date) && !cJSON_IsNull(update_date))
    {
    goto end; //DateTime
    }
    }

    // return_dto->refund_status
    cJSON *refund_status = cJSON_GetObjectItemCaseSensitive(return_dtoJSON, "refundStatus");
    if (refund_status) { 
    refund_status_local_nonprim = refund_status_type_parseFromJSON(refund_status); //custom
    }

    // return_dto->logistic_pickup_point
    cJSON *logistic_pickup_point = cJSON_GetObjectItemCaseSensitive(return_dtoJSON, "logisticPickupPoint");
    if (logistic_pickup_point) { 
    logistic_pickup_point_local_nonprim = logistic_pickup_point_dto_parseFromJSON(logistic_pickup_point); //nonprimitive
    }

    // return_dto->shipment_recipient_type
    cJSON *shipment_recipient_type = cJSON_GetObjectItemCaseSensitive(return_dtoJSON, "shipmentRecipientType");
    if (shipment_recipient_type) { 
    shipment_recipient_type_local_nonprim = recipient_type_parseFromJSON(shipment_recipient_type); //custom
    }

    // return_dto->shipment_status
    cJSON *shipment_status = cJSON_GetObjectItemCaseSensitive(return_dtoJSON, "shipmentStatus");
    if (shipment_status) { 
    shipment_status_local_nonprim = return_shipment_status_type_parseFromJSON(shipment_status); //custom
    }

    // return_dto->refund_amount
    cJSON *refund_amount = cJSON_GetObjectItemCaseSensitive(return_dtoJSON, "refundAmount");
    if (refund_amount) { 
    if(!cJSON_IsNumber(refund_amount))
    {
    goto end; //Numeric
    }
    }

    // return_dto->items
    cJSON *items = cJSON_GetObjectItemCaseSensitive(return_dtoJSON, "items");
    if (!items) {
        goto end;
    }

    
    cJSON *items_local_nonprimitive = NULL;
    if(!cJSON_IsArray(items)){
        goto end; //nonprimitive container
    }

    itemsList = list_createList();

    cJSON_ArrayForEach(items_local_nonprimitive,items )
    {
        if(!cJSON_IsObject(items_local_nonprimitive)){
            goto end;
        }
        return_item_dto_t *itemsItem = return_item_dto_parseFromJSON(items_local_nonprimitive);

        list_addElement(itemsList, itemsItem);
    }

    // return_dto->return_type
    cJSON *return_type = cJSON_GetObjectItemCaseSensitive(return_dtoJSON, "returnType");
    if (return_type) { 
    return_type_local_nonprim = return_type_parseFromJSON(return_type); //custom
    }

    // return_dto->fast_return
    cJSON *fast_return = cJSON_GetObjectItemCaseSensitive(return_dtoJSON, "fastReturn");
    if (fast_return) { 
    if(!cJSON_IsBool(fast_return))
    {
    goto end; //Bool
    }
    }


    return_dto_local_var = return_dto_create (
        id ? id->valuedouble : 0,
        order_id ? order_id->valuedouble : 0,
        creation_date && !cJSON_IsNull(creation_date) ? strdup(creation_date->valuestring) : NULL,
        update_date && !cJSON_IsNull(update_date) ? strdup(update_date->valuestring) : NULL,
        refund_status ? refund_status_local_nonprim : NULL,
        logistic_pickup_point ? logistic_pickup_point_local_nonprim : NULL,
        shipment_recipient_type ? shipment_recipient_type_local_nonprim : NULL,
        shipment_status ? shipment_status_local_nonprim : NULL,
        refund_amount ? refund_amount->valuedouble : 0,
        itemsList,
        return_type ? return_type_local_nonprim : NULL,
        fast_return ? fast_return->valueint : 0
        );

    return return_dto_local_var;
end:
    if (refund_status_local_nonprim) {
        refund_status_type_free(refund_status_local_nonprim);
        refund_status_local_nonprim = NULL;
    }
    if (logistic_pickup_point_local_nonprim) {
        logistic_pickup_point_dto_free(logistic_pickup_point_local_nonprim);
        logistic_pickup_point_local_nonprim = NULL;
    }
    if (shipment_recipient_type_local_nonprim) {
        recipient_type_free(shipment_recipient_type_local_nonprim);
        shipment_recipient_type_local_nonprim = NULL;
    }
    if (shipment_status_local_nonprim) {
        return_shipment_status_type_free(shipment_status_local_nonprim);
        shipment_status_local_nonprim = NULL;
    }
    if (itemsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, itemsList) {
            return_item_dto_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(itemsList);
        itemsList = NULL;
    }
    if (return_type_local_nonprim) {
        return_type_free(return_type_local_nonprim);
        return_type_local_nonprim = NULL;
    }
    return NULL;

}
