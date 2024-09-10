#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "order_status_type.h"


char* order_status_type_order_status_type_ToString(_api__order_status_type__e order_status_type) {
    char *order_status_typeArray[] =  { "NULL", "PLACING", "RESERVED", "UNPAID", "PROCESSING", "DELIVERY", "PICKUP", "DELIVERED", "CANCELLED", "PENDING", "PARTIALLY_RETURNED", "RETURNED", "UNKNOWN" };
    return order_status_typeArray[order_status_type];
}

_api__order_status_type__e order_status_type_order_status_type_FromString(char* order_status_type) {
    int stringToReturn = 0;
    char *order_status_typeArray[] =  { "NULL", "PLACING", "RESERVED", "UNPAID", "PROCESSING", "DELIVERY", "PICKUP", "DELIVERED", "CANCELLED", "PENDING", "PARTIALLY_RETURNED", "RETURNED", "UNKNOWN" };
    size_t sizeofArray = sizeof(order_status_typeArray) / sizeof(order_status_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(order_status_type, order_status_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *order_status_type_order_status_type_convertToJSON(_api__order_status_type__e order_status_type) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "order_status_type", order_status_type_order_status_type_ToString(order_status_type)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

_api__order_status_type__e order_status_type_order_status_type_parseFromJSON(cJSON *order_status_typeJSON) {
    _api__order_status_type__e *order_status_type = NULL;
    _api__order_status_type__e order_status_typeVariable;
    cJSON *order_status_typeVar = cJSON_GetObjectItemCaseSensitive(order_status_typeJSON, "order_status_type");
    if(!cJSON_IsString(order_status_typeVar) || (order_status_typeVar->valuestring == NULL)){
        goto end;
    }
    order_status_typeVariable = order_status_type_order_status_type_FromString(order_status_typeVar->valuestring);
    return order_status_typeVariable;
end:
    return 0;
}
