#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "orders_stats_commission_type.h"


char* orders_stats_commission_type_orders_stats_commission_type_ToString(_api__orders_stats_commission_type__e orders_stats_commission_type) {
    char *orders_stats_commission_typeArray[] =  { "NULL", "FEE", "FULFILLMENT", "LOYALTY_PARTICIPATION_FEE", "AUCTION_PROMOTION", "INSTALLMENT", "DELIVERY_TO_CUSTOMER", "EXPRESS_DELIVERY_TO_CUSTOMER", "AGENCY", "PAYMENT_TRANSFER", "RETURNED_ORDERS_STORAGE", "SORTING", "INTAKE_SORTING", "RETURN_PROCESSING", "ILLIQUID_GOODS_SALE" };
    return orders_stats_commission_typeArray[orders_stats_commission_type];
}

_api__orders_stats_commission_type__e orders_stats_commission_type_orders_stats_commission_type_FromString(char* orders_stats_commission_type) {
    int stringToReturn = 0;
    char *orders_stats_commission_typeArray[] =  { "NULL", "FEE", "FULFILLMENT", "LOYALTY_PARTICIPATION_FEE", "AUCTION_PROMOTION", "INSTALLMENT", "DELIVERY_TO_CUSTOMER", "EXPRESS_DELIVERY_TO_CUSTOMER", "AGENCY", "PAYMENT_TRANSFER", "RETURNED_ORDERS_STORAGE", "SORTING", "INTAKE_SORTING", "RETURN_PROCESSING", "ILLIQUID_GOODS_SALE" };
    size_t sizeofArray = sizeof(orders_stats_commission_typeArray) / sizeof(orders_stats_commission_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(orders_stats_commission_type, orders_stats_commission_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *orders_stats_commission_type_orders_stats_commission_type_convertToJSON(_api__orders_stats_commission_type__e orders_stats_commission_type) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "orders_stats_commission_type", orders_stats_commission_type_orders_stats_commission_type_ToString(orders_stats_commission_type)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

_api__orders_stats_commission_type__e orders_stats_commission_type_orders_stats_commission_type_parseFromJSON(cJSON *orders_stats_commission_typeJSON) {
    _api__orders_stats_commission_type__e *orders_stats_commission_type = NULL;
    _api__orders_stats_commission_type__e orders_stats_commission_typeVariable;
    cJSON *orders_stats_commission_typeVar = cJSON_GetObjectItemCaseSensitive(orders_stats_commission_typeJSON, "orders_stats_commission_type");
    if(!cJSON_IsString(orders_stats_commission_typeVar) || (orders_stats_commission_typeVar->valuestring == NULL)){
        goto end;
    }
    orders_stats_commission_typeVariable = orders_stats_commission_type_orders_stats_commission_type_FromString(orders_stats_commission_typeVar->valuestring);
    return orders_stats_commission_typeVariable;
end:
    return 0;
}
