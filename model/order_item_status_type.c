#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "order_item_status_type.h"


char* order_item_status_type_order_item_status_type_ToString(_api__order_item_status_type__e order_item_status_type) {
    char *order_item_status_typeArray[] =  { "NULL", "REJECTED", "RETURNED" };
    return order_item_status_typeArray[order_item_status_type];
}

_api__order_item_status_type__e order_item_status_type_order_item_status_type_FromString(char* order_item_status_type) {
    int stringToReturn = 0;
    char *order_item_status_typeArray[] =  { "NULL", "REJECTED", "RETURNED" };
    size_t sizeofArray = sizeof(order_item_status_typeArray) / sizeof(order_item_status_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(order_item_status_type, order_item_status_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *order_item_status_type_order_item_status_type_convertToJSON(_api__order_item_status_type__e order_item_status_type) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "order_item_status_type", order_item_status_type_order_item_status_type_ToString(order_item_status_type)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

_api__order_item_status_type__e order_item_status_type_order_item_status_type_parseFromJSON(cJSON *order_item_status_typeJSON) {
    _api__order_item_status_type__e *order_item_status_type = NULL;
    _api__order_item_status_type__e order_item_status_typeVariable;
    cJSON *order_item_status_typeVar = cJSON_GetObjectItemCaseSensitive(order_item_status_typeJSON, "order_item_status_type");
    if(!cJSON_IsString(order_item_status_typeVar) || (order_item_status_typeVar->valuestring == NULL)){
        goto end;
    }
    order_item_status_typeVariable = order_item_status_type_order_item_status_type_FromString(order_item_status_typeVar->valuestring);
    return order_item_status_typeVariable;
end:
    return 0;
}
