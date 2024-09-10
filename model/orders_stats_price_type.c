#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "orders_stats_price_type.h"


char* orders_stats_price_type_orders_stats_price_type_ToString(_api__orders_stats_price_type__e orders_stats_price_type) {
    char *orders_stats_price_typeArray[] =  { "NULL", "BUYER", "CASHBACK", "MARKETPLACE" };
    return orders_stats_price_typeArray[orders_stats_price_type];
}

_api__orders_stats_price_type__e orders_stats_price_type_orders_stats_price_type_FromString(char* orders_stats_price_type) {
    int stringToReturn = 0;
    char *orders_stats_price_typeArray[] =  { "NULL", "BUYER", "CASHBACK", "MARKETPLACE" };
    size_t sizeofArray = sizeof(orders_stats_price_typeArray) / sizeof(orders_stats_price_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(orders_stats_price_type, orders_stats_price_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *orders_stats_price_type_orders_stats_price_type_convertToJSON(_api__orders_stats_price_type__e orders_stats_price_type) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "orders_stats_price_type", orders_stats_price_type_orders_stats_price_type_ToString(orders_stats_price_type)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

_api__orders_stats_price_type__e orders_stats_price_type_orders_stats_price_type_parseFromJSON(cJSON *orders_stats_price_typeJSON) {
    _api__orders_stats_price_type__e *orders_stats_price_type = NULL;
    _api__orders_stats_price_type__e orders_stats_price_typeVariable;
    cJSON *orders_stats_price_typeVar = cJSON_GetObjectItemCaseSensitive(orders_stats_price_typeJSON, "orders_stats_price_type");
    if(!cJSON_IsString(orders_stats_price_typeVar) || (orders_stats_price_typeVar->valuestring == NULL)){
        goto end;
    }
    orders_stats_price_typeVariable = orders_stats_price_type_orders_stats_price_type_FromString(orders_stats_price_typeVar->valuestring);
    return orders_stats_price_typeVariable;
end:
    return 0;
}
