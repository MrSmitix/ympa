#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "orders_stats_item_status_type.h"


char* orders_stats_item_status_type_orders_stats_item_status_type_ToString(_api__orders_stats_item_status_type__e orders_stats_item_status_type) {
    char *orders_stats_item_status_typeArray[] =  { "NULL", "REJECTED", "RETURNED" };
    return orders_stats_item_status_typeArray[orders_stats_item_status_type];
}

_api__orders_stats_item_status_type__e orders_stats_item_status_type_orders_stats_item_status_type_FromString(char* orders_stats_item_status_type) {
    int stringToReturn = 0;
    char *orders_stats_item_status_typeArray[] =  { "NULL", "REJECTED", "RETURNED" };
    size_t sizeofArray = sizeof(orders_stats_item_status_typeArray) / sizeof(orders_stats_item_status_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(orders_stats_item_status_type, orders_stats_item_status_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *orders_stats_item_status_type_orders_stats_item_status_type_convertToJSON(_api__orders_stats_item_status_type__e orders_stats_item_status_type) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "orders_stats_item_status_type", orders_stats_item_status_type_orders_stats_item_status_type_ToString(orders_stats_item_status_type)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

_api__orders_stats_item_status_type__e orders_stats_item_status_type_orders_stats_item_status_type_parseFromJSON(cJSON *orders_stats_item_status_typeJSON) {
    _api__orders_stats_item_status_type__e *orders_stats_item_status_type = NULL;
    _api__orders_stats_item_status_type__e orders_stats_item_status_typeVariable;
    cJSON *orders_stats_item_status_typeVar = cJSON_GetObjectItemCaseSensitive(orders_stats_item_status_typeJSON, "orders_stats_item_status_type");
    if(!cJSON_IsString(orders_stats_item_status_typeVar) || (orders_stats_item_status_typeVar->valuestring == NULL)){
        goto end;
    }
    orders_stats_item_status_typeVariable = orders_stats_item_status_type_orders_stats_item_status_type_FromString(orders_stats_item_status_typeVar->valuestring);
    return orders_stats_item_status_typeVariable;
end:
    return 0;
}
