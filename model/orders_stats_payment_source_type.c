#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "orders_stats_payment_source_type.h"


char* orders_stats_payment_source_type_orders_stats_payment_source_type_ToString(_api__orders_stats_payment_source_type__e orders_stats_payment_source_type) {
    char *orders_stats_payment_source_typeArray[] =  { "NULL", "BUYER", "CASHBACK", "MARKETPLACE", "SPLIT" };
    return orders_stats_payment_source_typeArray[orders_stats_payment_source_type];
}

_api__orders_stats_payment_source_type__e orders_stats_payment_source_type_orders_stats_payment_source_type_FromString(char* orders_stats_payment_source_type) {
    int stringToReturn = 0;
    char *orders_stats_payment_source_typeArray[] =  { "NULL", "BUYER", "CASHBACK", "MARKETPLACE", "SPLIT" };
    size_t sizeofArray = sizeof(orders_stats_payment_source_typeArray) / sizeof(orders_stats_payment_source_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(orders_stats_payment_source_type, orders_stats_payment_source_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *orders_stats_payment_source_type_orders_stats_payment_source_type_convertToJSON(_api__orders_stats_payment_source_type__e orders_stats_payment_source_type) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "orders_stats_payment_source_type", orders_stats_payment_source_type_orders_stats_payment_source_type_ToString(orders_stats_payment_source_type)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

_api__orders_stats_payment_source_type__e orders_stats_payment_source_type_orders_stats_payment_source_type_parseFromJSON(cJSON *orders_stats_payment_source_typeJSON) {
    _api__orders_stats_payment_source_type__e *orders_stats_payment_source_type = NULL;
    _api__orders_stats_payment_source_type__e orders_stats_payment_source_typeVariable;
    cJSON *orders_stats_payment_source_typeVar = cJSON_GetObjectItemCaseSensitive(orders_stats_payment_source_typeJSON, "orders_stats_payment_source_type");
    if(!cJSON_IsString(orders_stats_payment_source_typeVar) || (orders_stats_payment_source_typeVar->valuestring == NULL)){
        goto end;
    }
    orders_stats_payment_source_typeVariable = orders_stats_payment_source_type_orders_stats_payment_source_type_FromString(orders_stats_payment_source_typeVar->valuestring);
    return orders_stats_payment_source_typeVariable;
end:
    return 0;
}
