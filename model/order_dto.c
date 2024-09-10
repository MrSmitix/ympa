#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "order_dto.h"


char* order_dto_status_ToString(_api__order_dto__e status) {
    char* statusArray[] =  { "NULL", "PLACING", "RESERVED", "UNPAID", "PROCESSING", "DELIVERY", "PICKUP", "DELIVERED", "CANCELLED", "PENDING", "PARTIALLY_RETURNED", "RETURNED", "UNKNOWN" };
    return statusArray[status];
}

_api__order_dto__e order_dto_status_FromString(char* status){
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
char* order_dto_substatus_ToString(_api__order_dto__e substatus) {
    char* substatusArray[] =  { "NULL", "RESERVATION_EXPIRED", "USER_NOT_PAID", "USER_UNREACHABLE", "USER_CHANGED_MIND", "USER_REFUSED_DELIVERY", "USER_REFUSED_PRODUCT", "SHOP_FAILED", "USER_REFUSED_QUALITY", "REPLACING_ORDER", "PROCESSING_EXPIRED", "PENDING_EXPIRED", "SHOP_PENDING_CANCELLED", "PENDING_CANCELLED", "USER_FRAUD", "RESERVATION_FAILED", "USER_PLACED_OTHER_ORDER", "USER_BOUGHT_CHEAPER", "MISSING_ITEM", "BROKEN_ITEM", "WRONG_ITEM", "PICKUP_EXPIRED", "DELIVERY_PROBLEMS", "LATE_CONTACT", "CUSTOM", "DELIVERY_SERVICE_FAILED", "WAREHOUSE_FAILED_TO_SHIP", "DELIVERY_SERIVCE_UNDELIVERED", "DELIVERY_SERVICE_UNDELIVERED", "PREORDER", "AWAIT_CONFIRMATION", "STARTED", "PACKAGING", "READY_TO_SHIP", "SHIPPED", "ASYNC_PROCESSING", "USER_REFUSED_TO_PROVIDE_PERSONAL_DATA", "WAITING_USER_INPUT", "WAITING_BANK_DECISION", "BANK_REJECT_CREDIT_OFFER", "CUSTOMER_REJECT_CREDIT_OFFER", "CREDIT_OFFER_FAILED", "AWAIT_DELIVERY_DATES_CONFIRMATION", "SERVICE_FAULT", "DELIVERY_SERVICE_RECEIVED", "USER_RECEIVED", "WAITING_FOR_STOCKS", "AS_PART_OF_MULTI_ORDER", "READY_FOR_LAST_MILE", "LAST_MILE_STARTED", "ANTIFRAUD", "DELIVERY_USER_NOT_RECEIVED", "DELIVERY_SERVICE_DELIVERED", "DELIVERED_USER_NOT_RECEIVED", "USER_WANTED_ANOTHER_PAYMENT_METHOD", "USER_RECEIVED_TECHNICAL_ERROR", "USER_FORGOT_TO_USE_BONUS", "RECEIVED_ON_DISTRIBUTION_CENTER", "DELIVERY_SERVICE_NOT_RECEIVED", "DELIVERY_SERVICE_LOST", "SHIPPED_TO_WRONG_DELIVERY_SERVICE", "DELIVERED_USER_RECEIVED", "WAITING_TINKOFF_DECISION", "COURIER_SEARCH", "COURIER_FOUND", "COURIER_IN_TRANSIT_TO_SENDER", "COURIER_ARRIVED_TO_SENDER", "COURIER_RECEIVED", "COURIER_NOT_FOUND", "COURIER_NOT_DELIVER_ORDER", "COURIER_RETURNS_ORDER", "COURIER_RETURNED_ORDER", "WAITING_USER_DELIVERY_INPUT", "PICKUP_SERVICE_RECEIVED", "PICKUP_USER_RECEIVED", "CANCELLED_COURIER_NOT_FOUND", "COURIER_NOT_COME_FOR_ORDER", "DELIVERY_NOT_MANAGED_REGION", "INCOMPLETE_CONTACT_INFORMATION", "INCOMPLETE_MULTI_ORDER", "INAPPROPRIATE_WEIGHT_SIZE", "TECHNICAL_ERROR", "SORTING_CENTER_LOST", "COURIER_SEARCH_NOT_STARTED", "LOST", "AWAIT_PAYMENT", "AWAIT_LAVKA_RESERVATION", "USER_WANTS_TO_CHANGE_ADDRESS", "FULL_NOT_RANSOM", "PRESCRIPTION_MISMATCH", "DROPOFF_LOST", "DROPOFF_CLOSED", "DELIVERY_TO_STORE_STARTED", "USER_WANTS_TO_CHANGE_DELIVERY_DATE", "WRONG_ITEM_DELIVERED", "DAMAGED_BOX", "AWAIT_DELIVERY_DATES", "LAST_MILE_COURIER_SEARCH", "PICKUP_POINT_CLOSED", "LEGAL_INFO_CHANGED", "USER_HAS_NO_TIME_TO_PICKUP_ORDER", "DELIVERY_CUSTOMS_ARRIVED", "DELIVERY_CUSTOMS_CLEARED", "FIRST_MILE_DELIVERY_SERVICE_RECEIVED", "AWAIT_AUTO_DELIVERY_DATES", "AWAIT_USER_PERSONAL_DATA", "NO_PERSONAL_DATA_EXPIRED", "CUSTOMS_PROBLEMS", "AWAIT_CASHIER", "WAITING_POSTPAID_BUDGET_RESERVATION", "AWAIT_SERVICEABLE_CONFIRMATION", "POSTPAID_BUDGET_RESERVATION_FAILED", "AWAIT_CUSTOM_PRICE_CONFIRMATION", "READY_FOR_PICKUP", "UNKNOWN" };
    return substatusArray[substatus];
}

_api__order_dto__e order_dto_substatus_FromString(char* substatus){
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
char* order_dto_currency_ToString(_api__order_dto__e currency) {
    char* currencyArray[] =  { "NULL", "RUR", "USD", "EUR", "UAH", "AUD", "GBP", "BYR", "BYN", "DKK", "ISK", "KZT", "CAD", "CNY", "NOK", "XDR", "SGD", "TRY", "SEK", "CHF", "JPY", "AZN", "ALL", "DZD", "AOA", "ARS", "AMD", "AFN", "BHD", "BGN", "BOB", "BWP", "BND", "BRL", "BIF", "HUF", "VEF", "KPW", "VND", "GMD", "GHS", "GNF", "HKD", "GEL", "AED", "EGP", "ZMK", "ILS", "INR", "IDR", "JOD", "IQD", "IRR", "YER", "QAR", "KES", "KGS", "COP", "CDF", "CRC", "KWD", "CUP", "LAK", "LVL", "SLL", "LBP", "LYD", "SZL", "LTL", "MUR", "MRO", "MKD", "MWK", "MGA", "MYR", "MAD", "MXN", "MZN", "MDL", "MNT", "NPR", "NGN", "NIO", "NZD", "OMR", "PKR", "PYG", "PEN", "PLN", "KHR", "SAR", "RON", "SCR", "SYP", "SKK", "SOS", "SDG", "SRD", "TJS", "THB", "TWD", "BDT", "TZS", "TND", "TMM", "UGX", "UZS", "UYU", "PHP", "DJF", "XAF", "XOF", "HRK", "CZK", "CLP", "LKR", "EEK", "ETB", "RSD", "ZAR", "KRW", "NAD", "TL", "UE" };
    return currencyArray[currency];
}

_api__order_dto__e order_dto_currency_FromString(char* currency){
    int stringToReturn = 0;
    char *currencyArray[] =  { "NULL", "RUR", "USD", "EUR", "UAH", "AUD", "GBP", "BYR", "BYN", "DKK", "ISK", "KZT", "CAD", "CNY", "NOK", "XDR", "SGD", "TRY", "SEK", "CHF", "JPY", "AZN", "ALL", "DZD", "AOA", "ARS", "AMD", "AFN", "BHD", "BGN", "BOB", "BWP", "BND", "BRL", "BIF", "HUF", "VEF", "KPW", "VND", "GMD", "GHS", "GNF", "HKD", "GEL", "AED", "EGP", "ZMK", "ILS", "INR", "IDR", "JOD", "IQD", "IRR", "YER", "QAR", "KES", "KGS", "COP", "CDF", "CRC", "KWD", "CUP", "LAK", "LVL", "SLL", "LBP", "LYD", "SZL", "LTL", "MUR", "MRO", "MKD", "MWK", "MGA", "MYR", "MAD", "MXN", "MZN", "MDL", "MNT", "NPR", "NGN", "NIO", "NZD", "OMR", "PKR", "PYG", "PEN", "PLN", "KHR", "SAR", "RON", "SCR", "SYP", "SKK", "SOS", "SDG", "SRD", "TJS", "THB", "TWD", "BDT", "TZS", "TND", "TMM", "UGX", "UZS", "UYU", "PHP", "DJF", "XAF", "XOF", "HRK", "CZK", "CLP", "LKR", "EEK", "ETB", "RSD", "ZAR", "KRW", "NAD", "TL", "UE" };
    size_t sizeofArray = sizeof(currencyArray) / sizeof(currencyArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(currency, currencyArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}
char* order_dto_payment_type_ToString(_api__order_dto__e payment_type) {
    char* payment_typeArray[] =  { "NULL", "PREPAID", "POSTPAID", "UNKNOWN" };
    return payment_typeArray[payment_type];
}

_api__order_dto__e order_dto_payment_type_FromString(char* payment_type){
    int stringToReturn = 0;
    char *payment_typeArray[] =  { "NULL", "PREPAID", "POSTPAID", "UNKNOWN" };
    size_t sizeofArray = sizeof(payment_typeArray) / sizeof(payment_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(payment_type, payment_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}
char* order_dto_payment_method_ToString(_api__order_dto__e payment_method) {
    char* payment_methodArray[] =  { "NULL", "CASH_ON_DELIVERY", "CARD_ON_DELIVERY", "BOUND_CARD_ON_DELIVERY", "YANDEX", "APPLE_PAY", "EXTERNAL_CERTIFICATE", "CREDIT", "GOOGLE_PAY", "TINKOFF_CREDIT", "SBP", "TINKOFF_INSTALLMENTS", "B2B_ACCOUNT_PREPAYMENT", "B2B_ACCOUNT_POSTPAYMENT", "UNKNOWN" };
    return payment_methodArray[payment_method];
}

_api__order_dto__e order_dto_payment_method_FromString(char* payment_method){
    int stringToReturn = 0;
    char *payment_methodArray[] =  { "NULL", "CASH_ON_DELIVERY", "CARD_ON_DELIVERY", "BOUND_CARD_ON_DELIVERY", "YANDEX", "APPLE_PAY", "EXTERNAL_CERTIFICATE", "CREDIT", "GOOGLE_PAY", "TINKOFF_CREDIT", "SBP", "TINKOFF_INSTALLMENTS", "B2B_ACCOUNT_PREPAYMENT", "B2B_ACCOUNT_POSTPAYMENT", "UNKNOWN" };
    size_t sizeofArray = sizeof(payment_methodArray) / sizeof(payment_methodArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(payment_method, payment_methodArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}
char* order_dto_tax_system_ToString(_api__order_dto__e tax_system) {
    char* tax_systemArray[] =  { "NULL", "OSN", "USN", "USN_MINUS_COST", "ENVD", "ECHN", "PSN", "NPD", "UNKNOWN_VALUE" };
    return tax_systemArray[tax_system];
}

_api__order_dto__e order_dto_tax_system_FromString(char* tax_system){
    int stringToReturn = 0;
    char *tax_systemArray[] =  { "NULL", "OSN", "USN", "USN_MINUS_COST", "ENVD", "ECHN", "PSN", "NPD", "UNKNOWN_VALUE" };
    size_t sizeofArray = sizeof(tax_systemArray) / sizeof(tax_systemArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(tax_system, tax_systemArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

order_dto_t *order_dto_create(
    long id,
    order_status_type_t *status,
    order_substatus_type_t *substatus,
    char *creation_date,
    char *updated_at,
    currency_type_t *currency,
    double items_total,
    double delivery_total,
    double buyer_items_total,
    double buyer_total,
    double buyer_items_total_before_discount,
    double buyer_total_before_discount,
    order_payment_type_t *payment_type,
    order_payment_method_type_t *payment_method,
    int fake,
    list_t *items,
    list_t *subsidies,
    order_delivery_dto_t *delivery,
    order_buyer_dto_t *buyer,
    char *notes,
    order_tax_system_type_t *tax_system,
    int cancel_requested,
    char *expiry_date
    ) {
    order_dto_t *order_dto_local_var = malloc(sizeof(order_dto_t));
    if (!order_dto_local_var) {
        return NULL;
    }
    order_dto_local_var->id = id;
    order_dto_local_var->status = status;
    order_dto_local_var->substatus = substatus;
    order_dto_local_var->creation_date = creation_date;
    order_dto_local_var->updated_at = updated_at;
    order_dto_local_var->currency = currency;
    order_dto_local_var->items_total = items_total;
    order_dto_local_var->delivery_total = delivery_total;
    order_dto_local_var->buyer_items_total = buyer_items_total;
    order_dto_local_var->buyer_total = buyer_total;
    order_dto_local_var->buyer_items_total_before_discount = buyer_items_total_before_discount;
    order_dto_local_var->buyer_total_before_discount = buyer_total_before_discount;
    order_dto_local_var->payment_type = payment_type;
    order_dto_local_var->payment_method = payment_method;
    order_dto_local_var->fake = fake;
    order_dto_local_var->items = items;
    order_dto_local_var->subsidies = subsidies;
    order_dto_local_var->delivery = delivery;
    order_dto_local_var->buyer = buyer;
    order_dto_local_var->notes = notes;
    order_dto_local_var->tax_system = tax_system;
    order_dto_local_var->cancel_requested = cancel_requested;
    order_dto_local_var->expiry_date = expiry_date;

    return order_dto_local_var;
}


void order_dto_free(order_dto_t *order_dto) {
    if(NULL == order_dto){
        return ;
    }
    listEntry_t *listEntry;
    if (order_dto->status) {
        order_status_type_free(order_dto->status);
        order_dto->status = NULL;
    }
    if (order_dto->substatus) {
        order_substatus_type_free(order_dto->substatus);
        order_dto->substatus = NULL;
    }
    if (order_dto->creation_date) {
        free(order_dto->creation_date);
        order_dto->creation_date = NULL;
    }
    if (order_dto->updated_at) {
        free(order_dto->updated_at);
        order_dto->updated_at = NULL;
    }
    if (order_dto->currency) {
        currency_type_free(order_dto->currency);
        order_dto->currency = NULL;
    }
    if (order_dto->payment_type) {
        order_payment_type_free(order_dto->payment_type);
        order_dto->payment_type = NULL;
    }
    if (order_dto->payment_method) {
        order_payment_method_type_free(order_dto->payment_method);
        order_dto->payment_method = NULL;
    }
    if (order_dto->items) {
        list_ForEach(listEntry, order_dto->items) {
            order_item_dto_free(listEntry->data);
        }
        list_freeList(order_dto->items);
        order_dto->items = NULL;
    }
    if (order_dto->subsidies) {
        list_ForEach(listEntry, order_dto->subsidies) {
            order_subsidy_dto_free(listEntry->data);
        }
        list_freeList(order_dto->subsidies);
        order_dto->subsidies = NULL;
    }
    if (order_dto->delivery) {
        order_delivery_dto_free(order_dto->delivery);
        order_dto->delivery = NULL;
    }
    if (order_dto->buyer) {
        order_buyer_dto_free(order_dto->buyer);
        order_dto->buyer = NULL;
    }
    if (order_dto->notes) {
        free(order_dto->notes);
        order_dto->notes = NULL;
    }
    if (order_dto->tax_system) {
        order_tax_system_type_free(order_dto->tax_system);
        order_dto->tax_system = NULL;
    }
    if (order_dto->expiry_date) {
        free(order_dto->expiry_date);
        order_dto->expiry_date = NULL;
    }
    free(order_dto);
}

cJSON *order_dto_convertToJSON(order_dto_t *order_dto) {
    cJSON *item = cJSON_CreateObject();

    // order_dto->id
    if(order_dto->id) {
    if(cJSON_AddNumberToObject(item, "id", order_dto->id) == NULL) {
    goto fail; //Numeric
    }
    }


    // order_dto->status
    if(order_dto->status != _api__order_dto__NULL) {
    cJSON *status_local_JSON = order_status_type_convertToJSON(order_dto->status);
    if(status_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "status", status_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // order_dto->substatus
    if(order_dto->substatus != _api__order_dto__NULL) {
    cJSON *substatus_local_JSON = order_substatus_type_convertToJSON(order_dto->substatus);
    if(substatus_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "substatus", substatus_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // order_dto->creation_date
    if(order_dto->creation_date) {
    if(cJSON_AddStringToObject(item, "creationDate", order_dto->creation_date) == NULL) {
    goto fail; //String
    }
    }


    // order_dto->updated_at
    if(order_dto->updated_at) {
    if(cJSON_AddStringToObject(item, "updatedAt", order_dto->updated_at) == NULL) {
    goto fail; //String
    }
    }


    // order_dto->currency
    if(order_dto->currency != _api__order_dto__NULL) {
    cJSON *currency_local_JSON = currency_type_convertToJSON(order_dto->currency);
    if(currency_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "currency", currency_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // order_dto->items_total
    if(order_dto->items_total) {
    if(cJSON_AddNumberToObject(item, "itemsTotal", order_dto->items_total) == NULL) {
    goto fail; //Numeric
    }
    }


    // order_dto->delivery_total
    if(order_dto->delivery_total) {
    if(cJSON_AddNumberToObject(item, "deliveryTotal", order_dto->delivery_total) == NULL) {
    goto fail; //Numeric
    }
    }


    // order_dto->buyer_items_total
    if(order_dto->buyer_items_total) {
    if(cJSON_AddNumberToObject(item, "buyerItemsTotal", order_dto->buyer_items_total) == NULL) {
    goto fail; //Numeric
    }
    }


    // order_dto->buyer_total
    if(order_dto->buyer_total) {
    if(cJSON_AddNumberToObject(item, "buyerTotal", order_dto->buyer_total) == NULL) {
    goto fail; //Numeric
    }
    }


    // order_dto->buyer_items_total_before_discount
    if(order_dto->buyer_items_total_before_discount) {
    if(cJSON_AddNumberToObject(item, "buyerItemsTotalBeforeDiscount", order_dto->buyer_items_total_before_discount) == NULL) {
    goto fail; //Numeric
    }
    }


    // order_dto->buyer_total_before_discount
    if(order_dto->buyer_total_before_discount) {
    if(cJSON_AddNumberToObject(item, "buyerTotalBeforeDiscount", order_dto->buyer_total_before_discount) == NULL) {
    goto fail; //Numeric
    }
    }


    // order_dto->payment_type
    if(order_dto->payment_type != _api__order_dto__NULL) {
    cJSON *payment_type_local_JSON = order_payment_type_convertToJSON(order_dto->payment_type);
    if(payment_type_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "paymentType", payment_type_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // order_dto->payment_method
    if(order_dto->payment_method != _api__order_dto__NULL) {
    cJSON *payment_method_local_JSON = order_payment_method_type_convertToJSON(order_dto->payment_method);
    if(payment_method_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "paymentMethod", payment_method_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // order_dto->fake
    if(order_dto->fake) {
    if(cJSON_AddBoolToObject(item, "fake", order_dto->fake) == NULL) {
    goto fail; //Bool
    }
    }


    // order_dto->items
    if (!order_dto->items) {
        goto fail;
    }
    cJSON *items = cJSON_AddArrayToObject(item, "items");
    if(items == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *itemsListEntry;
    if (order_dto->items) {
    list_ForEach(itemsListEntry, order_dto->items) {
    cJSON *itemLocal = order_item_dto_convertToJSON(itemsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(items, itemLocal);
    }
    }


    // order_dto->subsidies
    if(order_dto->subsidies) {
    cJSON *subsidies = cJSON_AddArrayToObject(item, "subsidies");
    if(subsidies == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *subsidiesListEntry;
    if (order_dto->subsidies) {
    list_ForEach(subsidiesListEntry, order_dto->subsidies) {
    cJSON *itemLocal = order_subsidy_dto_convertToJSON(subsidiesListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(subsidies, itemLocal);
    }
    }
    }


    // order_dto->delivery
    if(order_dto->delivery) {
    cJSON *delivery_local_JSON = order_delivery_dto_convertToJSON(order_dto->delivery);
    if(delivery_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "delivery", delivery_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // order_dto->buyer
    if(order_dto->buyer) {
    cJSON *buyer_local_JSON = order_buyer_dto_convertToJSON(order_dto->buyer);
    if(buyer_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "buyer", buyer_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // order_dto->notes
    if(order_dto->notes) {
    if(cJSON_AddStringToObject(item, "notes", order_dto->notes) == NULL) {
    goto fail; //String
    }
    }


    // order_dto->tax_system
    if(order_dto->tax_system != _api__order_dto__NULL) {
    cJSON *tax_system_local_JSON = order_tax_system_type_convertToJSON(order_dto->tax_system);
    if(tax_system_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "taxSystem", tax_system_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // order_dto->cancel_requested
    if(order_dto->cancel_requested) {
    if(cJSON_AddBoolToObject(item, "cancelRequested", order_dto->cancel_requested) == NULL) {
    goto fail; //Bool
    }
    }


    // order_dto->expiry_date
    if(order_dto->expiry_date) {
    if(cJSON_AddStringToObject(item, "expiryDate", order_dto->expiry_date) == NULL) {
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

order_dto_t *order_dto_parseFromJSON(cJSON *order_dtoJSON){

    order_dto_t *order_dto_local_var = NULL;

    // define the local variable for order_dto->status
    order_status_type_t *status_local_nonprim = NULL;

    // define the local variable for order_dto->substatus
    order_substatus_type_t *substatus_local_nonprim = NULL;

    // define the local variable for order_dto->currency
    currency_type_t *currency_local_nonprim = NULL;

    // define the local variable for order_dto->payment_type
    order_payment_type_t *payment_type_local_nonprim = NULL;

    // define the local variable for order_dto->payment_method
    order_payment_method_type_t *payment_method_local_nonprim = NULL;

    // define the local list for order_dto->items
    list_t *itemsList = NULL;

    // define the local list for order_dto->subsidies
    list_t *subsidiesList = NULL;

    // define the local variable for order_dto->delivery
    order_delivery_dto_t *delivery_local_nonprim = NULL;

    // define the local variable for order_dto->buyer
    order_buyer_dto_t *buyer_local_nonprim = NULL;

    // define the local variable for order_dto->tax_system
    order_tax_system_type_t *tax_system_local_nonprim = NULL;

    // order_dto->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(order_dtoJSON, "id");
    if (id) { 
    if(!cJSON_IsNumber(id))
    {
    goto end; //Numeric
    }
    }

    // order_dto->status
    cJSON *status = cJSON_GetObjectItemCaseSensitive(order_dtoJSON, "status");
    if (status) { 
    status_local_nonprim = order_status_type_parseFromJSON(status); //custom
    }

    // order_dto->substatus
    cJSON *substatus = cJSON_GetObjectItemCaseSensitive(order_dtoJSON, "substatus");
    if (substatus) { 
    substatus_local_nonprim = order_substatus_type_parseFromJSON(substatus); //custom
    }

    // order_dto->creation_date
    cJSON *creation_date = cJSON_GetObjectItemCaseSensitive(order_dtoJSON, "creationDate");
    if (creation_date) { 
    if(!cJSON_IsString(creation_date) && !cJSON_IsNull(creation_date))
    {
    goto end; //String
    }
    }

    // order_dto->updated_at
    cJSON *updated_at = cJSON_GetObjectItemCaseSensitive(order_dtoJSON, "updatedAt");
    if (updated_at) { 
    if(!cJSON_IsString(updated_at) && !cJSON_IsNull(updated_at))
    {
    goto end; //String
    }
    }

    // order_dto->currency
    cJSON *currency = cJSON_GetObjectItemCaseSensitive(order_dtoJSON, "currency");
    if (currency) { 
    currency_local_nonprim = currency_type_parseFromJSON(currency); //custom
    }

    // order_dto->items_total
    cJSON *items_total = cJSON_GetObjectItemCaseSensitive(order_dtoJSON, "itemsTotal");
    if (items_total) { 
    if(!cJSON_IsNumber(items_total))
    {
    goto end; //Numeric
    }
    }

    // order_dto->delivery_total
    cJSON *delivery_total = cJSON_GetObjectItemCaseSensitive(order_dtoJSON, "deliveryTotal");
    if (delivery_total) { 
    if(!cJSON_IsNumber(delivery_total))
    {
    goto end; //Numeric
    }
    }

    // order_dto->buyer_items_total
    cJSON *buyer_items_total = cJSON_GetObjectItemCaseSensitive(order_dtoJSON, "buyerItemsTotal");
    if (buyer_items_total) { 
    if(!cJSON_IsNumber(buyer_items_total))
    {
    goto end; //Numeric
    }
    }

    // order_dto->buyer_total
    cJSON *buyer_total = cJSON_GetObjectItemCaseSensitive(order_dtoJSON, "buyerTotal");
    if (buyer_total) { 
    if(!cJSON_IsNumber(buyer_total))
    {
    goto end; //Numeric
    }
    }

    // order_dto->buyer_items_total_before_discount
    cJSON *buyer_items_total_before_discount = cJSON_GetObjectItemCaseSensitive(order_dtoJSON, "buyerItemsTotalBeforeDiscount");
    if (buyer_items_total_before_discount) { 
    if(!cJSON_IsNumber(buyer_items_total_before_discount))
    {
    goto end; //Numeric
    }
    }

    // order_dto->buyer_total_before_discount
    cJSON *buyer_total_before_discount = cJSON_GetObjectItemCaseSensitive(order_dtoJSON, "buyerTotalBeforeDiscount");
    if (buyer_total_before_discount) { 
    if(!cJSON_IsNumber(buyer_total_before_discount))
    {
    goto end; //Numeric
    }
    }

    // order_dto->payment_type
    cJSON *payment_type = cJSON_GetObjectItemCaseSensitive(order_dtoJSON, "paymentType");
    if (payment_type) { 
    payment_type_local_nonprim = order_payment_type_parseFromJSON(payment_type); //custom
    }

    // order_dto->payment_method
    cJSON *payment_method = cJSON_GetObjectItemCaseSensitive(order_dtoJSON, "paymentMethod");
    if (payment_method) { 
    payment_method_local_nonprim = order_payment_method_type_parseFromJSON(payment_method); //custom
    }

    // order_dto->fake
    cJSON *fake = cJSON_GetObjectItemCaseSensitive(order_dtoJSON, "fake");
    if (fake) { 
    if(!cJSON_IsBool(fake))
    {
    goto end; //Bool
    }
    }

    // order_dto->items
    cJSON *items = cJSON_GetObjectItemCaseSensitive(order_dtoJSON, "items");
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
        order_item_dto_t *itemsItem = order_item_dto_parseFromJSON(items_local_nonprimitive);

        list_addElement(itemsList, itemsItem);
    }

    // order_dto->subsidies
    cJSON *subsidies = cJSON_GetObjectItemCaseSensitive(order_dtoJSON, "subsidies");
    if (subsidies) { 
    cJSON *subsidies_local_nonprimitive = NULL;
    if(!cJSON_IsArray(subsidies)){
        goto end; //nonprimitive container
    }

    subsidiesList = list_createList();

    cJSON_ArrayForEach(subsidies_local_nonprimitive,subsidies )
    {
        if(!cJSON_IsObject(subsidies_local_nonprimitive)){
            goto end;
        }
        order_subsidy_dto_t *subsidiesItem = order_subsidy_dto_parseFromJSON(subsidies_local_nonprimitive);

        list_addElement(subsidiesList, subsidiesItem);
    }
    }

    // order_dto->delivery
    cJSON *delivery = cJSON_GetObjectItemCaseSensitive(order_dtoJSON, "delivery");
    if (delivery) { 
    delivery_local_nonprim = order_delivery_dto_parseFromJSON(delivery); //nonprimitive
    }

    // order_dto->buyer
    cJSON *buyer = cJSON_GetObjectItemCaseSensitive(order_dtoJSON, "buyer");
    if (buyer) { 
    buyer_local_nonprim = order_buyer_dto_parseFromJSON(buyer); //nonprimitive
    }

    // order_dto->notes
    cJSON *notes = cJSON_GetObjectItemCaseSensitive(order_dtoJSON, "notes");
    if (notes) { 
    if(!cJSON_IsString(notes) && !cJSON_IsNull(notes))
    {
    goto end; //String
    }
    }

    // order_dto->tax_system
    cJSON *tax_system = cJSON_GetObjectItemCaseSensitive(order_dtoJSON, "taxSystem");
    if (tax_system) { 
    tax_system_local_nonprim = order_tax_system_type_parseFromJSON(tax_system); //custom
    }

    // order_dto->cancel_requested
    cJSON *cancel_requested = cJSON_GetObjectItemCaseSensitive(order_dtoJSON, "cancelRequested");
    if (cancel_requested) { 
    if(!cJSON_IsBool(cancel_requested))
    {
    goto end; //Bool
    }
    }

    // order_dto->expiry_date
    cJSON *expiry_date = cJSON_GetObjectItemCaseSensitive(order_dtoJSON, "expiryDate");
    if (expiry_date) { 
    if(!cJSON_IsString(expiry_date) && !cJSON_IsNull(expiry_date))
    {
    goto end; //String
    }
    }


    order_dto_local_var = order_dto_create (
        id ? id->valuedouble : 0,
        status ? status_local_nonprim : NULL,
        substatus ? substatus_local_nonprim : NULL,
        creation_date && !cJSON_IsNull(creation_date) ? strdup(creation_date->valuestring) : NULL,
        updated_at && !cJSON_IsNull(updated_at) ? strdup(updated_at->valuestring) : NULL,
        currency ? currency_local_nonprim : NULL,
        items_total ? items_total->valuedouble : 0,
        delivery_total ? delivery_total->valuedouble : 0,
        buyer_items_total ? buyer_items_total->valuedouble : 0,
        buyer_total ? buyer_total->valuedouble : 0,
        buyer_items_total_before_discount ? buyer_items_total_before_discount->valuedouble : 0,
        buyer_total_before_discount ? buyer_total_before_discount->valuedouble : 0,
        payment_type ? payment_type_local_nonprim : NULL,
        payment_method ? payment_method_local_nonprim : NULL,
        fake ? fake->valueint : 0,
        itemsList,
        subsidies ? subsidiesList : NULL,
        delivery ? delivery_local_nonprim : NULL,
        buyer ? buyer_local_nonprim : NULL,
        notes && !cJSON_IsNull(notes) ? strdup(notes->valuestring) : NULL,
        tax_system ? tax_system_local_nonprim : NULL,
        cancel_requested ? cancel_requested->valueint : 0,
        expiry_date && !cJSON_IsNull(expiry_date) ? strdup(expiry_date->valuestring) : NULL
        );

    return order_dto_local_var;
end:
    if (status_local_nonprim) {
        order_status_type_free(status_local_nonprim);
        status_local_nonprim = NULL;
    }
    if (substatus_local_nonprim) {
        order_substatus_type_free(substatus_local_nonprim);
        substatus_local_nonprim = NULL;
    }
    if (currency_local_nonprim) {
        currency_type_free(currency_local_nonprim);
        currency_local_nonprim = NULL;
    }
    if (payment_type_local_nonprim) {
        order_payment_type_free(payment_type_local_nonprim);
        payment_type_local_nonprim = NULL;
    }
    if (payment_method_local_nonprim) {
        order_payment_method_type_free(payment_method_local_nonprim);
        payment_method_local_nonprim = NULL;
    }
    if (itemsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, itemsList) {
            order_item_dto_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(itemsList);
        itemsList = NULL;
    }
    if (subsidiesList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, subsidiesList) {
            order_subsidy_dto_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(subsidiesList);
        subsidiesList = NULL;
    }
    if (delivery_local_nonprim) {
        order_delivery_dto_free(delivery_local_nonprim);
        delivery_local_nonprim = NULL;
    }
    if (buyer_local_nonprim) {
        order_buyer_dto_free(buyer_local_nonprim);
        buyer_local_nonprim = NULL;
    }
    if (tax_system_local_nonprim) {
        order_tax_system_type_free(tax_system_local_nonprim);
        tax_system_local_nonprim = NULL;
    }
    return NULL;

}
