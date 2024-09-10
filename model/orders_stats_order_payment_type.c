#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "orders_stats_order_payment_type.h"


char* orders_stats_order_payment_type_orders_stats_order_payment_type_ToString(_api__orders_stats_order_payment_type__e orders_stats_order_payment_type) {
    char *orders_stats_order_payment_typeArray[] =  { "NULL", "CREDIT", "POSTPAID", "PREPAID", "TINKOFF_CREDIT" };
    return orders_stats_order_payment_typeArray[orders_stats_order_payment_type];
}

_api__orders_stats_order_payment_type__e orders_stats_order_payment_type_orders_stats_order_payment_type_FromString(char* orders_stats_order_payment_type) {
    int stringToReturn = 0;
    char *orders_stats_order_payment_typeArray[] =  { "NULL", "CREDIT", "POSTPAID", "PREPAID", "TINKOFF_CREDIT" };
    size_t sizeofArray = sizeof(orders_stats_order_payment_typeArray) / sizeof(orders_stats_order_payment_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(orders_stats_order_payment_type, orders_stats_order_payment_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *orders_stats_order_payment_type_orders_stats_order_payment_type_convertToJSON(_api__orders_stats_order_payment_type__e orders_stats_order_payment_type) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "orders_stats_order_payment_type", orders_stats_order_payment_type_orders_stats_order_payment_type_ToString(orders_stats_order_payment_type)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

_api__orders_stats_order_payment_type__e orders_stats_order_payment_type_orders_stats_order_payment_type_parseFromJSON(cJSON *orders_stats_order_payment_typeJSON) {
    _api__orders_stats_order_payment_type__e *orders_stats_order_payment_type = NULL;
    _api__orders_stats_order_payment_type__e orders_stats_order_payment_typeVariable;
    cJSON *orders_stats_order_payment_typeVar = cJSON_GetObjectItemCaseSensitive(orders_stats_order_payment_typeJSON, "orders_stats_order_payment_type");
    if(!cJSON_IsString(orders_stats_order_payment_typeVar) || (orders_stats_order_payment_typeVar->valuestring == NULL)){
        goto end;
    }
    orders_stats_order_payment_typeVariable = orders_stats_order_payment_type_orders_stats_order_payment_type_FromString(orders_stats_order_payment_typeVar->valuestring);
    return orders_stats_order_payment_typeVariable;
end:
    return 0;
}
