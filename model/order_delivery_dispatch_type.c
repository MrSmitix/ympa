#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "order_delivery_dispatch_type.h"


char* order_delivery_dispatch_type_order_delivery_dispatch_type_ToString(_api__order_delivery_dispatch_type__e order_delivery_dispatch_type) {
    char *order_delivery_dispatch_typeArray[] =  { "NULL", "UNKNOWN", "BUYER", "MARKET_PARTNER_OUTLET", "MARKET_BRANDED_OUTLET", "SHOP_OUTLET", "DROPOFF" };
    return order_delivery_dispatch_typeArray[order_delivery_dispatch_type];
}

_api__order_delivery_dispatch_type__e order_delivery_dispatch_type_order_delivery_dispatch_type_FromString(char* order_delivery_dispatch_type) {
    int stringToReturn = 0;
    char *order_delivery_dispatch_typeArray[] =  { "NULL", "UNKNOWN", "BUYER", "MARKET_PARTNER_OUTLET", "MARKET_BRANDED_OUTLET", "SHOP_OUTLET", "DROPOFF" };
    size_t sizeofArray = sizeof(order_delivery_dispatch_typeArray) / sizeof(order_delivery_dispatch_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(order_delivery_dispatch_type, order_delivery_dispatch_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *order_delivery_dispatch_type_order_delivery_dispatch_type_convertToJSON(_api__order_delivery_dispatch_type__e order_delivery_dispatch_type) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "order_delivery_dispatch_type", order_delivery_dispatch_type_order_delivery_dispatch_type_ToString(order_delivery_dispatch_type)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

_api__order_delivery_dispatch_type__e order_delivery_dispatch_type_order_delivery_dispatch_type_parseFromJSON(cJSON *order_delivery_dispatch_typeJSON) {
    _api__order_delivery_dispatch_type__e *order_delivery_dispatch_type = NULL;
    _api__order_delivery_dispatch_type__e order_delivery_dispatch_typeVariable;
    cJSON *order_delivery_dispatch_typeVar = cJSON_GetObjectItemCaseSensitive(order_delivery_dispatch_typeJSON, "order_delivery_dispatch_type");
    if(!cJSON_IsString(order_delivery_dispatch_typeVar) || (order_delivery_dispatch_typeVar->valuestring == NULL)){
        goto end;
    }
    order_delivery_dispatch_typeVariable = order_delivery_dispatch_type_order_delivery_dispatch_type_FromString(order_delivery_dispatch_typeVar->valuestring);
    return order_delivery_dispatch_typeVariable;
end:
    return 0;
}
