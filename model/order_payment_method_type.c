#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "order_payment_method_type.h"


char* order_payment_method_type_order_payment_method_type_ToString(_api__order_payment_method_type__e order_payment_method_type) {
    char *order_payment_method_typeArray[] =  { "NULL", "CASH_ON_DELIVERY", "CARD_ON_DELIVERY", "BOUND_CARD_ON_DELIVERY", "YANDEX", "APPLE_PAY", "EXTERNAL_CERTIFICATE", "CREDIT", "GOOGLE_PAY", "TINKOFF_CREDIT", "SBP", "TINKOFF_INSTALLMENTS", "B2B_ACCOUNT_PREPAYMENT", "B2B_ACCOUNT_POSTPAYMENT", "UNKNOWN" };
    return order_payment_method_typeArray[order_payment_method_type];
}

_api__order_payment_method_type__e order_payment_method_type_order_payment_method_type_FromString(char* order_payment_method_type) {
    int stringToReturn = 0;
    char *order_payment_method_typeArray[] =  { "NULL", "CASH_ON_DELIVERY", "CARD_ON_DELIVERY", "BOUND_CARD_ON_DELIVERY", "YANDEX", "APPLE_PAY", "EXTERNAL_CERTIFICATE", "CREDIT", "GOOGLE_PAY", "TINKOFF_CREDIT", "SBP", "TINKOFF_INSTALLMENTS", "B2B_ACCOUNT_PREPAYMENT", "B2B_ACCOUNT_POSTPAYMENT", "UNKNOWN" };
    size_t sizeofArray = sizeof(order_payment_method_typeArray) / sizeof(order_payment_method_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(order_payment_method_type, order_payment_method_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *order_payment_method_type_order_payment_method_type_convertToJSON(_api__order_payment_method_type__e order_payment_method_type) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "order_payment_method_type", order_payment_method_type_order_payment_method_type_ToString(order_payment_method_type)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

_api__order_payment_method_type__e order_payment_method_type_order_payment_method_type_parseFromJSON(cJSON *order_payment_method_typeJSON) {
    _api__order_payment_method_type__e *order_payment_method_type = NULL;
    _api__order_payment_method_type__e order_payment_method_typeVariable;
    cJSON *order_payment_method_typeVar = cJSON_GetObjectItemCaseSensitive(order_payment_method_typeJSON, "order_payment_method_type");
    if(!cJSON_IsString(order_payment_method_typeVar) || (order_payment_method_typeVar->valuestring == NULL)){
        goto end;
    }
    order_payment_method_typeVariable = order_payment_method_type_order_payment_method_type_FromString(order_payment_method_typeVar->valuestring);
    return order_payment_method_typeVariable;
end:
    return 0;
}
