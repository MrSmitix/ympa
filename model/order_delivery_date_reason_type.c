#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "order_delivery_date_reason_type.h"


char* order_delivery_date_reason_type_order_delivery_date_reason_type_ToString(_api__order_delivery_date_reason_type__e order_delivery_date_reason_type) {
    char *order_delivery_date_reason_typeArray[] =  { "NULL", "USER_MOVED_DELIVERY_DATES", "PARTNER_MOVED_DELIVERY_DATES" };
    return order_delivery_date_reason_typeArray[order_delivery_date_reason_type];
}

_api__order_delivery_date_reason_type__e order_delivery_date_reason_type_order_delivery_date_reason_type_FromString(char* order_delivery_date_reason_type) {
    int stringToReturn = 0;
    char *order_delivery_date_reason_typeArray[] =  { "NULL", "USER_MOVED_DELIVERY_DATES", "PARTNER_MOVED_DELIVERY_DATES" };
    size_t sizeofArray = sizeof(order_delivery_date_reason_typeArray) / sizeof(order_delivery_date_reason_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(order_delivery_date_reason_type, order_delivery_date_reason_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *order_delivery_date_reason_type_order_delivery_date_reason_type_convertToJSON(_api__order_delivery_date_reason_type__e order_delivery_date_reason_type) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "order_delivery_date_reason_type", order_delivery_date_reason_type_order_delivery_date_reason_type_ToString(order_delivery_date_reason_type)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

_api__order_delivery_date_reason_type__e order_delivery_date_reason_type_order_delivery_date_reason_type_parseFromJSON(cJSON *order_delivery_date_reason_typeJSON) {
    _api__order_delivery_date_reason_type__e *order_delivery_date_reason_type = NULL;
    _api__order_delivery_date_reason_type__e order_delivery_date_reason_typeVariable;
    cJSON *order_delivery_date_reason_typeVar = cJSON_GetObjectItemCaseSensitive(order_delivery_date_reason_typeJSON, "order_delivery_date_reason_type");
    if(!cJSON_IsString(order_delivery_date_reason_typeVar) || (order_delivery_date_reason_typeVar->valuestring == NULL)){
        goto end;
    }
    order_delivery_date_reason_typeVariable = order_delivery_date_reason_type_order_delivery_date_reason_type_FromString(order_delivery_date_reason_typeVar->valuestring);
    return order_delivery_date_reason_typeVariable;
end:
    return 0;
}
