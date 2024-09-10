#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "order_items_modification_request_reason_type.h"


char* order_items_modification_request_reason_type_order_items_modification_request_reason_type_ToString(_api__order_items_modification_request_reason_type__e order_items_modification_request_reason_type) {
    char *order_items_modification_request_reason_typeArray[] =  { "NULL", "PARTNER_REQUESTED_REMOVE", "USER_REQUESTED_REMOVE" };
    return order_items_modification_request_reason_typeArray[order_items_modification_request_reason_type];
}

_api__order_items_modification_request_reason_type__e order_items_modification_request_reason_type_order_items_modification_request_reason_type_FromString(char* order_items_modification_request_reason_type) {
    int stringToReturn = 0;
    char *order_items_modification_request_reason_typeArray[] =  { "NULL", "PARTNER_REQUESTED_REMOVE", "USER_REQUESTED_REMOVE" };
    size_t sizeofArray = sizeof(order_items_modification_request_reason_typeArray) / sizeof(order_items_modification_request_reason_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(order_items_modification_request_reason_type, order_items_modification_request_reason_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *order_items_modification_request_reason_type_order_items_modification_request_reason_type_convertToJSON(_api__order_items_modification_request_reason_type__e order_items_modification_request_reason_type) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "order_items_modification_request_reason_type", order_items_modification_request_reason_type_order_items_modification_request_reason_type_ToString(order_items_modification_request_reason_type)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

_api__order_items_modification_request_reason_type__e order_items_modification_request_reason_type_order_items_modification_request_reason_type_parseFromJSON(cJSON *order_items_modification_request_reason_typeJSON) {
    _api__order_items_modification_request_reason_type__e *order_items_modification_request_reason_type = NULL;
    _api__order_items_modification_request_reason_type__e order_items_modification_request_reason_typeVariable;
    cJSON *order_items_modification_request_reason_typeVar = cJSON_GetObjectItemCaseSensitive(order_items_modification_request_reason_typeJSON, "order_items_modification_request_reason_type");
    if(!cJSON_IsString(order_items_modification_request_reason_typeVar) || (order_items_modification_request_reason_typeVar->valuestring == NULL)){
        goto end;
    }
    order_items_modification_request_reason_typeVariable = order_items_modification_request_reason_type_order_items_modification_request_reason_type_FromString(order_items_modification_request_reason_typeVar->valuestring);
    return order_items_modification_request_reason_typeVariable;
end:
    return 0;
}
