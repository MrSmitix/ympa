#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "orders_stats_stock_type.h"


char* orders_stats_stock_type_orders_stats_stock_type_ToString(_api__orders_stats_stock_type__e orders_stats_stock_type) {
    char *orders_stats_stock_typeArray[] =  { "NULL", "FIT", "FREEZE", "AVAILABLE", "QUARANTINE", "UTILIZATION", "DEFECT", "EXPIRED" };
    return orders_stats_stock_typeArray[orders_stats_stock_type];
}

_api__orders_stats_stock_type__e orders_stats_stock_type_orders_stats_stock_type_FromString(char* orders_stats_stock_type) {
    int stringToReturn = 0;
    char *orders_stats_stock_typeArray[] =  { "NULL", "FIT", "FREEZE", "AVAILABLE", "QUARANTINE", "UTILIZATION", "DEFECT", "EXPIRED" };
    size_t sizeofArray = sizeof(orders_stats_stock_typeArray) / sizeof(orders_stats_stock_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(orders_stats_stock_type, orders_stats_stock_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *orders_stats_stock_type_orders_stats_stock_type_convertToJSON(_api__orders_stats_stock_type__e orders_stats_stock_type) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "orders_stats_stock_type", orders_stats_stock_type_orders_stats_stock_type_ToString(orders_stats_stock_type)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

_api__orders_stats_stock_type__e orders_stats_stock_type_orders_stats_stock_type_parseFromJSON(cJSON *orders_stats_stock_typeJSON) {
    _api__orders_stats_stock_type__e *orders_stats_stock_type = NULL;
    _api__orders_stats_stock_type__e orders_stats_stock_typeVariable;
    cJSON *orders_stats_stock_typeVar = cJSON_GetObjectItemCaseSensitive(orders_stats_stock_typeJSON, "orders_stats_stock_type");
    if(!cJSON_IsString(orders_stats_stock_typeVar) || (orders_stats_stock_typeVar->valuestring == NULL)){
        goto end;
    }
    orders_stats_stock_typeVariable = orders_stats_stock_type_orders_stats_stock_type_FromString(orders_stats_stock_typeVar->valuestring);
    return orders_stats_stock_typeVariable;
end:
    return 0;
}
