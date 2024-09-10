#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "order_state_dto.h"


char* order_state_dto_status_ToString(_api__order_state_dto__e status) {
    char* statusArray[] =  { "NULL", "PLACING", "RESERVED", "UNPAID", "PROCESSING", "DELIVERY", "PICKUP", "DELIVERED", "CANCELLED", "PENDING", "PARTIALLY_RETURNED", "RETURNED", "UNKNOWN" };
    return statusArray[status];
}

_api__order_state_dto__e order_state_dto_status_FromString(char* status){
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
char* order_state_dto_substatus_ToString(_api__order_state_dto__e substatus) {
    char* substatusArray[] =  { "NULL", "RESERVATION_EXPIRED", "USER_NOT_PAID", "USER_UNREACHABLE", "USER_CHANGED_MIND", "USER_REFUSED_DELIVERY", "USER_REFUSED_PRODUCT", "SHOP_FAILED", "USER_REFUSED_QUALITY", "REPLACING_ORDER", "PROCESSING_EXPIRED", "PENDING_EXPIRED", "SHOP_PENDING_CANCELLED", "PENDING_CANCELLED", "USER_FRAUD", "RESERVATION_FAILED", "USER_PLACED_OTHER_ORDER", "USER_BOUGHT_CHEAPER", "MISSING_ITEM", "BROKEN_ITEM", "WRONG_ITEM", "PICKUP_EXPIRED", "DELIVERY_PROBLEMS", "LATE_CONTACT", "CUSTOM", "DELIVERY_SERVICE_FAILED", "WAREHOUSE_FAILED_TO_SHIP", "DELIVERY_SERIVCE_UNDELIVERED", "DELIVERY_SERVICE_UNDELIVERED", "PREORDER", "AWAIT_CONFIRMATION", "STARTED", "PACKAGING", "READY_TO_SHIP", "SHIPPED", "ASYNC_PROCESSING", "USER_REFUSED_TO_PROVIDE_PERSONAL_DATA", "WAITING_USER_INPUT", "WAITING_BANK_DECISION", "BANK_REJECT_CREDIT_OFFER", "CUSTOMER_REJECT_CREDIT_OFFER", "CREDIT_OFFER_FAILED", "AWAIT_DELIVERY_DATES_CONFIRMATION", "SERVICE_FAULT", "DELIVERY_SERVICE_RECEIVED", "USER_RECEIVED", "WAITING_FOR_STOCKS", "AS_PART_OF_MULTI_ORDER", "READY_FOR_LAST_MILE", "LAST_MILE_STARTED", "ANTIFRAUD", "DELIVERY_USER_NOT_RECEIVED", "DELIVERY_SERVICE_DELIVERED", "DELIVERED_USER_NOT_RECEIVED", "USER_WANTED_ANOTHER_PAYMENT_METHOD", "USER_RECEIVED_TECHNICAL_ERROR", "USER_FORGOT_TO_USE_BONUS", "RECEIVED_ON_DISTRIBUTION_CENTER", "DELIVERY_SERVICE_NOT_RECEIVED", "DELIVERY_SERVICE_LOST", "SHIPPED_TO_WRONG_DELIVERY_SERVICE", "DELIVERED_USER_RECEIVED", "WAITING_TINKOFF_DECISION", "COURIER_SEARCH", "COURIER_FOUND", "COURIER_IN_TRANSIT_TO_SENDER", "COURIER_ARRIVED_TO_SENDER", "COURIER_RECEIVED", "COURIER_NOT_FOUND", "COURIER_NOT_DELIVER_ORDER", "COURIER_RETURNS_ORDER", "COURIER_RETURNED_ORDER", "WAITING_USER_DELIVERY_INPUT", "PICKUP_SERVICE_RECEIVED", "PICKUP_USER_RECEIVED", "CANCELLED_COURIER_NOT_FOUND", "COURIER_NOT_COME_FOR_ORDER", "DELIVERY_NOT_MANAGED_REGION", "INCOMPLETE_CONTACT_INFORMATION", "INCOMPLETE_MULTI_ORDER", "INAPPROPRIATE_WEIGHT_SIZE", "TECHNICAL_ERROR", "SORTING_CENTER_LOST", "COURIER_SEARCH_NOT_STARTED", "LOST", "AWAIT_PAYMENT", "AWAIT_LAVKA_RESERVATION", "USER_WANTS_TO_CHANGE_ADDRESS", "FULL_NOT_RANSOM", "PRESCRIPTION_MISMATCH", "DROPOFF_LOST", "DROPOFF_CLOSED", "DELIVERY_TO_STORE_STARTED", "USER_WANTS_TO_CHANGE_DELIVERY_DATE", "WRONG_ITEM_DELIVERED", "DAMAGED_BOX", "AWAIT_DELIVERY_DATES", "LAST_MILE_COURIER_SEARCH", "PICKUP_POINT_CLOSED", "LEGAL_INFO_CHANGED", "USER_HAS_NO_TIME_TO_PICKUP_ORDER", "DELIVERY_CUSTOMS_ARRIVED", "DELIVERY_CUSTOMS_CLEARED", "FIRST_MILE_DELIVERY_SERVICE_RECEIVED", "AWAIT_AUTO_DELIVERY_DATES", "AWAIT_USER_PERSONAL_DATA", "NO_PERSONAL_DATA_EXPIRED", "CUSTOMS_PROBLEMS", "AWAIT_CASHIER", "WAITING_POSTPAID_BUDGET_RESERVATION", "AWAIT_SERVICEABLE_CONFIRMATION", "POSTPAID_BUDGET_RESERVATION_FAILED", "AWAIT_CUSTOM_PRICE_CONFIRMATION", "READY_FOR_PICKUP", "UNKNOWN" };
    return substatusArray[substatus];
}

_api__order_state_dto__e order_state_dto_substatus_FromString(char* substatus){
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

order_state_dto_t *order_state_dto_create(
    long id,
    order_status_type_t *status,
    order_substatus_type_t *substatus
    ) {
    order_state_dto_t *order_state_dto_local_var = malloc(sizeof(order_state_dto_t));
    if (!order_state_dto_local_var) {
        return NULL;
    }
    order_state_dto_local_var->id = id;
    order_state_dto_local_var->status = status;
    order_state_dto_local_var->substatus = substatus;

    return order_state_dto_local_var;
}


void order_state_dto_free(order_state_dto_t *order_state_dto) {
    if(NULL == order_state_dto){
        return ;
    }
    listEntry_t *listEntry;
    if (order_state_dto->status) {
        order_status_type_free(order_state_dto->status);
        order_state_dto->status = NULL;
    }
    if (order_state_dto->substatus) {
        order_substatus_type_free(order_state_dto->substatus);
        order_state_dto->substatus = NULL;
    }
    free(order_state_dto);
}

cJSON *order_state_dto_convertToJSON(order_state_dto_t *order_state_dto) {
    cJSON *item = cJSON_CreateObject();

    // order_state_dto->id
    if (!order_state_dto->id) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "id", order_state_dto->id) == NULL) {
    goto fail; //Numeric
    }


    // order_state_dto->status
    if (_api__order_state_dto__NULL == order_state_dto->status) {
        goto fail;
    }
    cJSON *status_local_JSON = order_status_type_convertToJSON(order_state_dto->status);
    if(status_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "status", status_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }


    // order_state_dto->substatus
    if(order_state_dto->substatus != _api__order_state_dto__NULL) {
    cJSON *substatus_local_JSON = order_substatus_type_convertToJSON(order_state_dto->substatus);
    if(substatus_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "substatus", substatus_local_JSON);
    if(item->child == NULL) {
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

order_state_dto_t *order_state_dto_parseFromJSON(cJSON *order_state_dtoJSON){

    order_state_dto_t *order_state_dto_local_var = NULL;

    // define the local variable for order_state_dto->status
    order_status_type_t *status_local_nonprim = NULL;

    // define the local variable for order_state_dto->substatus
    order_substatus_type_t *substatus_local_nonprim = NULL;

    // order_state_dto->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(order_state_dtoJSON, "id");
    if (!id) {
        goto end;
    }

    
    if(!cJSON_IsNumber(id))
    {
    goto end; //Numeric
    }

    // order_state_dto->status
    cJSON *status = cJSON_GetObjectItemCaseSensitive(order_state_dtoJSON, "status");
    if (!status) {
        goto end;
    }

    
    status_local_nonprim = order_status_type_parseFromJSON(status); //custom

    // order_state_dto->substatus
    cJSON *substatus = cJSON_GetObjectItemCaseSensitive(order_state_dtoJSON, "substatus");
    if (substatus) { 
    substatus_local_nonprim = order_substatus_type_parseFromJSON(substatus); //custom
    }


    order_state_dto_local_var = order_state_dto_create (
        id->valuedouble,
        status_local_nonprim,
        substatus ? substatus_local_nonprim : NULL
        );

    return order_state_dto_local_var;
end:
    if (status_local_nonprim) {
        order_status_type_free(status_local_nonprim);
        status_local_nonprim = NULL;
    }
    if (substatus_local_nonprim) {
        order_substatus_type_free(substatus_local_nonprim);
        substatus_local_nonprim = NULL;
    }
    return NULL;

}
