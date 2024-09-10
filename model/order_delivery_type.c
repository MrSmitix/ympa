#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "order_delivery_type.h"


char* order_delivery_type_order_delivery_type_ToString(_api__order_delivery_type__e order_delivery_type) {
    char *order_delivery_typeArray[] =  { "NULL", "DELIVERY", "PICKUP", "POST", "DIGITAL", "UNKNOWN" };
    return order_delivery_typeArray[order_delivery_type];
}

_api__order_delivery_type__e order_delivery_type_order_delivery_type_FromString(char* order_delivery_type) {
    int stringToReturn = 0;
    char *order_delivery_typeArray[] =  { "NULL", "DELIVERY", "PICKUP", "POST", "DIGITAL", "UNKNOWN" };
    size_t sizeofArray = sizeof(order_delivery_typeArray) / sizeof(order_delivery_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(order_delivery_type, order_delivery_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *order_delivery_type_order_delivery_type_convertToJSON(_api__order_delivery_type__e order_delivery_type) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "order_delivery_type", order_delivery_type_order_delivery_type_ToString(order_delivery_type)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

_api__order_delivery_type__e order_delivery_type_order_delivery_type_parseFromJSON(cJSON *order_delivery_typeJSON) {
    _api__order_delivery_type__e *order_delivery_type = NULL;
    _api__order_delivery_type__e order_delivery_typeVariable;
    cJSON *order_delivery_typeVar = cJSON_GetObjectItemCaseSensitive(order_delivery_typeJSON, "order_delivery_type");
    if(!cJSON_IsString(order_delivery_typeVar) || (order_delivery_typeVar->valuestring == NULL)){
        goto end;
    }
    order_delivery_typeVariable = order_delivery_type_order_delivery_type_FromString(order_delivery_typeVar->valuestring);
    return order_delivery_typeVariable;
end:
    return 0;
}
