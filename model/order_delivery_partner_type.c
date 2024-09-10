#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "order_delivery_partner_type.h"


char* order_delivery_partner_type_order_delivery_partner_type_ToString(_api__order_delivery_partner_type__e order_delivery_partner_type) {
    char *order_delivery_partner_typeArray[] =  { "NULL", "SHOP", "YANDEX_MARKET", "UNKNOWN" };
    return order_delivery_partner_typeArray[order_delivery_partner_type];
}

_api__order_delivery_partner_type__e order_delivery_partner_type_order_delivery_partner_type_FromString(char* order_delivery_partner_type) {
    int stringToReturn = 0;
    char *order_delivery_partner_typeArray[] =  { "NULL", "SHOP", "YANDEX_MARKET", "UNKNOWN" };
    size_t sizeofArray = sizeof(order_delivery_partner_typeArray) / sizeof(order_delivery_partner_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(order_delivery_partner_type, order_delivery_partner_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *order_delivery_partner_type_order_delivery_partner_type_convertToJSON(_api__order_delivery_partner_type__e order_delivery_partner_type) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "order_delivery_partner_type", order_delivery_partner_type_order_delivery_partner_type_ToString(order_delivery_partner_type)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

_api__order_delivery_partner_type__e order_delivery_partner_type_order_delivery_partner_type_parseFromJSON(cJSON *order_delivery_partner_typeJSON) {
    _api__order_delivery_partner_type__e *order_delivery_partner_type = NULL;
    _api__order_delivery_partner_type__e order_delivery_partner_typeVariable;
    cJSON *order_delivery_partner_typeVar = cJSON_GetObjectItemCaseSensitive(order_delivery_partner_typeJSON, "order_delivery_partner_type");
    if(!cJSON_IsString(order_delivery_partner_typeVar) || (order_delivery_partner_typeVar->valuestring == NULL)){
        goto end;
    }
    order_delivery_partner_typeVariable = order_delivery_partner_type_order_delivery_partner_type_FromString(order_delivery_partner_typeVar->valuestring);
    return order_delivery_partner_typeVariable;
end:
    return 0;
}
