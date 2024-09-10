#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "update_order_status_dto.h"


char* update_order_status_dto_status_ToString(_api__update_order_status_dto__e status) {
    char* statusArray[] =  { "NULL", "PLACING", "RESERVED", "UNPAID", "PROCESSING", "DELIVERY", "PICKUP", "DELIVERED", "CANCELLED", "PENDING", "PARTIALLY_RETURNED", "RETURNED", "UNKNOWN" };
    return statusArray[status];
}

_api__update_order_status_dto__e update_order_status_dto_status_FromString(char* status){
    int stringToReturn = 0;
    char *statusArray[] =  { "NULL", "PLACING", "RESERVED", "UNPAID", "PROCESSING", "DELIVERY", "PICKUP", "DELIVERED", "CANCELLED", "PENDING", "PARTIALLY_RETURNED", "RETURNED", "UNKNOWN" };
    size_t sizeofArray = sizeof(statusArray) / sizeof(statusArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(status, statusArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}
char* update_order_status_dto_substatus_ToString(_api__update_order_status_dto__e substatus) {
    char* substatusArray[] =  { "NULL", "RESERVATION_EXPIRED", "USER_NOT_PAID", "USER_UNREACHABLE", "USER_CHANGED_MIND", "USER_REFUSED_DELIVERY", "USER_REFUSED_PRODUCT", "SHOP_FAILED", "USER_REFUSED_QUALITY", "REPLACING_ORDER", "PROCESSING_EXPIRED", "PENDING_EXPIRED", "SHOP_PENDING_CANCELLED", "PENDING_CANCELLED", "USER_FRAUD", "RESERVATION_FAILED", "USER_PLACED_OTHER_ORDER", "USER_BOUGHT_CHEAPER", "MISSING_ITEM", "BROKEN_ITEM", "WRONG_ITEM", "PICKUP_EXPIRED", "DELIVERY_PROBLEMS", "LATE_CONTACT", "CUSTOM", "DELIVERY_SERVICE_FAILED", "WAREHOUSE_FAILED_TO_SHIP", "DELIVERY_SERIVCE_UNDELIVERED", "DELIVERY_SERVICE_UNDELIVERED", "PREORDER", "AWAIT_CONFIRMATION", "STARTED", "PACKAGING", "READY_TO_SHIP", "SHIPPED", "ASYNC_PROCESSING", "USER_REFUSED_TO_PROVIDE_PERSONAL_DATA", "WAITING_USER_INPUT", "WAITING_BANK_DECISION", "BANK_REJECT_CREDIT_OFFER", "CUSTOMER_REJECT_CREDIT_OFFER", "CREDIT_OFFER_FAILED", "AWAIT_DELIVERY_DATES_CONFIRMATION", "SERVICE_FAULT", "DELIVERY_SERVICE_RECEIVED", "USER_RECEIVED", "WAITING_FOR_STOCKS", "AS_PART_OF_MULTI_ORDER", "READY_FOR_LAST_MILE", "LAST_MILE_STARTED", "ANTIFRAUD", "DELIVERY_USER_NOT_RECEIVED", "DELIVERY_SERVICE_DELIVERED", "DELIVERED_USER_NOT_RECEIVED", "USER_WANTED_ANOTHER_PAYMENT_METHOD", "USER_RECEIVED_TECHNICAL_ERROR", "USER_FORGOT_TO_USE_BONUS", "RECEIVED_ON_DISTRIBUTION_CENTER", "DELIVERY_SERVICE_NOT_RECEIVED", "DELIVERY_SERVICE_LOST", "SHIPPED_TO_WRONG_DELIVERY_SERVICE", "DELIVERED_USER_RECEIVED", "WAITING_TINKOFF_DECISION", "COURIER_SEARCH", "COURIER_FOUND", "COURIER_IN_TRANSIT_TO_SENDER", "COURIER_ARRIVED_TO_SENDER", "COURIER_RECEIVED", "COURIER_NOT_FOUND", "COURIER_NOT_DELIVER_ORDER", "COURIER_RETURNS_ORDER", "COURIER_RETURNED_ORDER", "WAITING_USER_DELIVERY_INPUT", "PICKUP_SERVICE_RECEIVED", "PICKUP_USER_RECEIVED", "CANCELLED_COURIER_NOT_FOUND", "COURIER_NOT_COME_FOR_ORDER", "DELIVERY_NOT_MANAGED_REGION", "INCOMPLETE_CONTACT_INFORMATION", "INCOMPLETE_MULTI_ORDER", "INAPPROPRIATE_WEIGHT_SIZE", "TECHNICAL_ERROR", "SORTING_CENTER_LOST", "COURIER_SEARCH_NOT_STARTED", "LOST", "AWAIT_PAYMENT", "AWAIT_LAVKA_RESERVATION", "USER_WANTS_TO_CHANGE_ADDRESS", "FULL_NOT_RANSOM", "PRESCRIPTION_MISMATCH", "DROPOFF_LOST", "DROPOFF_CLOSED", "DELIVERY_TO_STORE_STARTED", "USER_WANTS_TO_CHANGE_DELIVERY_DATE", "WRONG_ITEM_DELIVERED", "DAMAGED_BOX", "AWAIT_DELIVERY_DATES", "LAST_MILE_COURIER_SEARCH", "PICKUP_POINT_CLOSED", "LEGAL_INFO_CHANGED", "USER_HAS_NO_TIME_TO_PICKUP_ORDER", "DELIVERY_CUSTOMS_ARRIVED", "DELIVERY_CUSTOMS_CLEARED", "FIRST_MILE_DELIVERY_SERVICE_RECEIVED", "AWAIT_AUTO_DELIVERY_DATES", "AWAIT_USER_PERSONAL_DATA", "NO_PERSONAL_DATA_EXPIRED", "CUSTOMS_PROBLEMS", "AWAIT_CASHIER", "WAITING_POSTPAID_BUDGET_RESERVATION", "AWAIT_SERVICEABLE_CONFIRMATION", "POSTPAID_BUDGET_RESERVATION_FAILED", "AWAIT_CUSTOM_PRICE_CONFIRMATION", "READY_FOR_PICKUP", "UNKNOWN" };
    return substatusArray[substatus];
}

_api__update_order_status_dto__e update_order_status_dto_substatus_FromString(char* substatus){
    int stringToReturn = 0;
    char *substatusArray[] =  { "NULL", "RESERVATION_EXPIRED", "USER_NOT_PAID", "USER_UNREACHABLE", "USER_CHANGED_MIND", "USER_REFUSED_DELIVERY", "USER_REFUSED_PRODUCT", "SHOP_FAILED", "USER_REFUSED_QUALITY", "REPLACING_ORDER", "PROCESSING_EXPIRED", "PENDING_EXPIRED", "SHOP_PENDING_CANCELLED", "PENDING_CANCELLED", "USER_FRAUD", "RESERVATION_FAILED", "USER_PLACED_OTHER_ORDER", "USER_BOUGHT_CHEAPER", "MISSING_ITEM", "BROKEN_ITEM", "WRONG_ITEM", "PICKUP_EXPIRED", "DELIVERY_PROBLEMS", "LATE_CONTACT", "CUSTOM", "DELIVERY_SERVICE_FAILED", "WAREHOUSE_FAILED_TO_SHIP", "DELIVERY_SERIVCE_UNDELIVERED", "DELIVERY_SERVICE_UNDELIVERED", "PREORDER", "AWAIT_CONFIRMATION", "STARTED", "PACKAGING", "READY_TO_SHIP", "SHIPPED", "ASYNC_PROCESSING", "USER_REFUSED_TO_PROVIDE_PERSONAL_DATA", "WAITING_USER_INPUT", "WAITING_BANK_DECISION", "BANK_REJECT_CREDIT_OFFER", "CUSTOMER_REJECT_CREDIT_OFFER", "CREDIT_OFFER_FAILED", "AWAIT_DELIVERY_DATES_CONFIRMATION", "SERVICE_FAULT", "DELIVERY_SERVICE_RECEIVED", "USER_RECEIVED", "WAITING_FOR_STOCKS", "AS_PART_OF_MULTI_ORDER", "READY_FOR_LAST_MILE", "LAST_MILE_STARTED", "ANTIFRAUD", "DELIVERY_USER_NOT_RECEIVED", "DELIVERY_SERVICE_DELIVERED", "DELIVERED_USER_NOT_RECEIVED", "USER_WANTED_ANOTHER_PAYMENT_METHOD", "USER_RECEIVED_TECHNICAL_ERROR", "USER_FORGOT_TO_USE_BONUS", "RECEIVED_ON_DISTRIBUTION_CENTER", "DELIVERY_SERVICE_NOT_RECEIVED", "DELIVERY_SERVICE_LOST", "SHIPPED_TO_WRONG_DELIVERY_SERVICE", "DELIVERED_USER_RECEIVED", "WAITING_TINKOFF_DECISION", "COURIER_SEARCH", "COURIER_FOUND", "COURIER_IN_TRANSIT_TO_SENDER", "COURIER_ARRIVED_TO_SENDER", "COURIER_RECEIVED", "COURIER_NOT_FOUND", "COURIER_NOT_DELIVER_ORDER", "COURIER_RETURNS_ORDER", "COURIER_RETURNED_ORDER", "WAITING_USER_DELIVERY_INPUT", "PICKUP_SERVICE_RECEIVED", "PICKUP_USER_RECEIVED", "CANCELLED_COURIER_NOT_FOUND", "COURIER_NOT_COME_FOR_ORDER", "DELIVERY_NOT_MANAGED_REGION", "INCOMPLETE_CONTACT_INFORMATION", "INCOMPLETE_MULTI_ORDER", "INAPPROPRIATE_WEIGHT_SIZE", "TECHNICAL_ERROR", "SORTING_CENTER_LOST", "COURIER_SEARCH_NOT_STARTED", "LOST", "AWAIT_PAYMENT", "AWAIT_LAVKA_RESERVATION", "USER_WANTS_TO_CHANGE_ADDRESS", "FULL_NOT_RANSOM", "PRESCRIPTION_MISMATCH", "DROPOFF_LOST", "DROPOFF_CLOSED", "DELIVERY_TO_STORE_STARTED", "USER_WANTS_TO_CHANGE_DELIVERY_DATE", "WRONG_ITEM_DELIVERED", "DAMAGED_BOX", "AWAIT_DELIVERY_DATES", "LAST_MILE_COURIER_SEARCH", "PICKUP_POINT_CLOSED", "LEGAL_INFO_CHANGED", "USER_HAS_NO_TIME_TO_PICKUP_ORDER", "DELIVERY_CUSTOMS_ARRIVED", "DELIVERY_CUSTOMS_CLEARED", "FIRST_MILE_DELIVERY_SERVICE_RECEIVED", "AWAIT_AUTO_DELIVERY_DATES", "AWAIT_USER_PERSONAL_DATA", "NO_PERSONAL_DATA_EXPIRED", "CUSTOMS_PROBLEMS", "AWAIT_CASHIER", "WAITING_POSTPAID_BUDGET_RESERVATION", "AWAIT_SERVICEABLE_CONFIRMATION", "POSTPAID_BUDGET_RESERVATION_FAILED", "AWAIT_CUSTOM_PRICE_CONFIRMATION", "READY_FOR_PICKUP", "UNKNOWN" };
    size_t sizeofArray = sizeof(substatusArray) / sizeof(substatusArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(substatus, substatusArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}
char* update_order_status_dto_update_status_ToString(_api__update_order_status_dto__e update_status) {
    char* update_statusArray[] =  { "NULL", "OK", "ERROR" };
    return update_statusArray[update_status];
}

_api__update_order_status_dto__e update_order_status_dto_update_status_FromString(char* update_status){
    int stringToReturn = 0;
    char *update_statusArray[] =  { "NULL", "OK", "ERROR" };
    size_t sizeofArray = sizeof(update_statusArray) / sizeof(update_statusArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(update_status, update_statusArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

update_order_status_dto_t *update_order_status_dto_create(
    long id,
    order_status_type_t *status,
    order_substatus_type_t *substatus,
    order_update_status_type_t *update_status,
    char *error_details
    ) {
    update_order_status_dto_t *update_order_status_dto_local_var = malloc(sizeof(update_order_status_dto_t));
    if (!update_order_status_dto_local_var) {
        return NULL;
    }
    update_order_status_dto_local_var->id = id;
    update_order_status_dto_local_var->status = status;
    update_order_status_dto_local_var->substatus = substatus;
    update_order_status_dto_local_var->update_status = update_status;
    update_order_status_dto_local_var->error_details = error_details;

    return update_order_status_dto_local_var;
}


void update_order_status_dto_free(update_order_status_dto_t *update_order_status_dto) {
    if(NULL == update_order_status_dto){
        return ;
    }
    listEntry_t *listEntry;
    if (update_order_status_dto->status) {
        order_status_type_free(update_order_status_dto->status);
        update_order_status_dto->status = NULL;
    }
    if (update_order_status_dto->substatus) {
        order_substatus_type_free(update_order_status_dto->substatus);
        update_order_status_dto->substatus = NULL;
    }
    if (update_order_status_dto->update_status) {
        order_update_status_type_free(update_order_status_dto->update_status);
        update_order_status_dto->update_status = NULL;
    }
    if (update_order_status_dto->error_details) {
        free(update_order_status_dto->error_details);
        update_order_status_dto->error_details = NULL;
    }
    free(update_order_status_dto);
}

cJSON *update_order_status_dto_convertToJSON(update_order_status_dto_t *update_order_status_dto) {
    cJSON *item = cJSON_CreateObject();

    // update_order_status_dto->id
    if(update_order_status_dto->id) {
    if(cJSON_AddNumberToObject(item, "id", update_order_status_dto->id) == NULL) {
    goto fail; //Numeric
    }
    }


    // update_order_status_dto->status
    if(update_order_status_dto->status != _api__update_order_status_dto__NULL) {
    cJSON *status_local_JSON = order_status_type_convertToJSON(update_order_status_dto->status);
    if(status_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "status", status_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // update_order_status_dto->substatus
    if(update_order_status_dto->substatus != _api__update_order_status_dto__NULL) {
    cJSON *substatus_local_JSON = order_substatus_type_convertToJSON(update_order_status_dto->substatus);
    if(substatus_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "substatus", substatus_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // update_order_status_dto->update_status
    if(update_order_status_dto->update_status != _api__update_order_status_dto__NULL) {
    cJSON *update_status_local_JSON = order_update_status_type_convertToJSON(update_order_status_dto->update_status);
    if(update_status_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "updateStatus", update_status_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // update_order_status_dto->error_details
    if(update_order_status_dto->error_details) {
    if(cJSON_AddStringToObject(item, "errorDetails", update_order_status_dto->error_details) == NULL) {
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

update_order_status_dto_t *update_order_status_dto_parseFromJSON(cJSON *update_order_status_dtoJSON){

    update_order_status_dto_t *update_order_status_dto_local_var = NULL;

    // define the local variable for update_order_status_dto->status
    order_status_type_t *status_local_nonprim = NULL;

    // define the local variable for update_order_status_dto->substatus
    order_substatus_type_t *substatus_local_nonprim = NULL;

    // define the local variable for update_order_status_dto->update_status
    order_update_status_type_t *update_status_local_nonprim = NULL;

    // update_order_status_dto->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(update_order_status_dtoJSON, "id");
    if (id) { 
    if(!cJSON_IsNumber(id))
    {
    goto end; //Numeric
    }
    }

    // update_order_status_dto->status
    cJSON *status = cJSON_GetObjectItemCaseSensitive(update_order_status_dtoJSON, "status");
    if (status) { 
    status_local_nonprim = order_status_type_parseFromJSON(status); //custom
    }

    // update_order_status_dto->substatus
    cJSON *substatus = cJSON_GetObjectItemCaseSensitive(update_order_status_dtoJSON, "substatus");
    if (substatus) { 
    substatus_local_nonprim = order_substatus_type_parseFromJSON(substatus); //custom
    }

    // update_order_status_dto->update_status
    cJSON *update_status = cJSON_GetObjectItemCaseSensitive(update_order_status_dtoJSON, "updateStatus");
    if (update_status) { 
    update_status_local_nonprim = order_update_status_type_parseFromJSON(update_status); //custom
    }

    // update_order_status_dto->error_details
    cJSON *error_details = cJSON_GetObjectItemCaseSensitive(update_order_status_dtoJSON, "errorDetails");
    if (error_details) { 
    if(!cJSON_IsString(error_details) && !cJSON_IsNull(error_details))
    {
    goto end; //String
    }
    }


    update_order_status_dto_local_var = update_order_status_dto_create (
        id ? id->valuedouble : 0,
        status ? status_local_nonprim : NULL,
        substatus ? substatus_local_nonprim : NULL,
        update_status ? update_status_local_nonprim : NULL,
        error_details && !cJSON_IsNull(error_details) ? strdup(error_details->valuestring) : NULL
        );

    return update_order_status_dto_local_var;
end:
    if (status_local_nonprim) {
        order_status_type_free(status_local_nonprim);
        status_local_nonprim = NULL;
    }
    if (substatus_local_nonprim) {
        order_substatus_type_free(substatus_local_nonprim);
        substatus_local_nonprim = NULL;
    }
    if (update_status_local_nonprim) {
        order_update_status_type_free(update_status_local_nonprim);
        update_status_local_nonprim = NULL;
    }
    return NULL;

}
