#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "order_cancellation_reason_type.h"


char* order_cancellation_reason_type_order_cancellation_reason_type_ToString(_api__order_cancellation_reason_type__e order_cancellation_reason_type) {
    char *order_cancellation_reason_typeArray[] =  { "NULL", "ORDER_DELIVERED", "ORDER_IN_DELIVERY" };
    return order_cancellation_reason_typeArray[order_cancellation_reason_type];
}

_api__order_cancellation_reason_type__e order_cancellation_reason_type_order_cancellation_reason_type_FromString(char* order_cancellation_reason_type) {
    int stringToReturn = 0;
    char *order_cancellation_reason_typeArray[] =  { "NULL", "ORDER_DELIVERED", "ORDER_IN_DELIVERY" };
    size_t sizeofArray = sizeof(order_cancellation_reason_typeArray) / sizeof(order_cancellation_reason_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(order_cancellation_reason_type, order_cancellation_reason_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *order_cancellation_reason_type_order_cancellation_reason_type_convertToJSON(_api__order_cancellation_reason_type__e order_cancellation_reason_type) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "order_cancellation_reason_type", order_cancellation_reason_type_order_cancellation_reason_type_ToString(order_cancellation_reason_type)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

_api__order_cancellation_reason_type__e order_cancellation_reason_type_order_cancellation_reason_type_parseFromJSON(cJSON *order_cancellation_reason_typeJSON) {
    _api__order_cancellation_reason_type__e *order_cancellation_reason_type = NULL;
    _api__order_cancellation_reason_type__e order_cancellation_reason_typeVariable;
    cJSON *order_cancellation_reason_typeVar = cJSON_GetObjectItemCaseSensitive(order_cancellation_reason_typeJSON, "order_cancellation_reason_type");
    if(!cJSON_IsString(order_cancellation_reason_typeVar) || (order_cancellation_reason_typeVar->valuestring == NULL)){
        goto end;
    }
    order_cancellation_reason_typeVariable = order_cancellation_reason_type_order_cancellation_reason_type_FromString(order_cancellation_reason_typeVar->valuestring);
    return order_cancellation_reason_typeVariable;
end:
    return 0;
}
