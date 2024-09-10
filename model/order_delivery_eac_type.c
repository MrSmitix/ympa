#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "order_delivery_eac_type.h"


char* order_delivery_eac_type_order_delivery_eac_type_ToString(_api__order_delivery_eac_type__e order_delivery_eac_type) {
    char *order_delivery_eac_typeArray[] =  { "NULL", "MERCHANT_TO_COURIER", "COURIER_TO_MERCHANT", "CHECKING_BY_MERCHANT" };
    return order_delivery_eac_typeArray[order_delivery_eac_type];
}

_api__order_delivery_eac_type__e order_delivery_eac_type_order_delivery_eac_type_FromString(char* order_delivery_eac_type) {
    int stringToReturn = 0;
    char *order_delivery_eac_typeArray[] =  { "NULL", "MERCHANT_TO_COURIER", "COURIER_TO_MERCHANT", "CHECKING_BY_MERCHANT" };
    size_t sizeofArray = sizeof(order_delivery_eac_typeArray) / sizeof(order_delivery_eac_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(order_delivery_eac_type, order_delivery_eac_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *order_delivery_eac_type_order_delivery_eac_type_convertToJSON(_api__order_delivery_eac_type__e order_delivery_eac_type) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "order_delivery_eac_type", order_delivery_eac_type_order_delivery_eac_type_ToString(order_delivery_eac_type)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

_api__order_delivery_eac_type__e order_delivery_eac_type_order_delivery_eac_type_parseFromJSON(cJSON *order_delivery_eac_typeJSON) {
    _api__order_delivery_eac_type__e *order_delivery_eac_type = NULL;
    _api__order_delivery_eac_type__e order_delivery_eac_typeVariable;
    cJSON *order_delivery_eac_typeVar = cJSON_GetObjectItemCaseSensitive(order_delivery_eac_typeJSON, "order_delivery_eac_type");
    if(!cJSON_IsString(order_delivery_eac_typeVar) || (order_delivery_eac_typeVar->valuestring == NULL)){
        goto end;
    }
    order_delivery_eac_typeVariable = order_delivery_eac_type_order_delivery_eac_type_FromString(order_delivery_eac_typeVar->valuestring);
    return order_delivery_eac_typeVariable;
end:
    return 0;
}
