#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "order_lift_type.h"


char* order_lift_type_order_lift_type_ToString(_api__order_lift_type__e order_lift_type) {
    char *order_lift_typeArray[] =  { "NULL", "NOT_NEEDED", "MANUAL", "ELEVATOR", "CARGO_ELEVATOR", "FREE", "UNKNOWN" };
    return order_lift_typeArray[order_lift_type];
}

_api__order_lift_type__e order_lift_type_order_lift_type_FromString(char* order_lift_type) {
    int stringToReturn = 0;
    char *order_lift_typeArray[] =  { "NULL", "NOT_NEEDED", "MANUAL", "ELEVATOR", "CARGO_ELEVATOR", "FREE", "UNKNOWN" };
    size_t sizeofArray = sizeof(order_lift_typeArray) / sizeof(order_lift_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(order_lift_type, order_lift_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *order_lift_type_order_lift_type_convertToJSON(_api__order_lift_type__e order_lift_type) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "order_lift_type", order_lift_type_order_lift_type_ToString(order_lift_type)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

_api__order_lift_type__e order_lift_type_order_lift_type_parseFromJSON(cJSON *order_lift_typeJSON) {
    _api__order_lift_type__e *order_lift_type = NULL;
    _api__order_lift_type__e order_lift_typeVariable;
    cJSON *order_lift_typeVar = cJSON_GetObjectItemCaseSensitive(order_lift_typeJSON, "order_lift_type");
    if(!cJSON_IsString(order_lift_typeVar) || (order_lift_typeVar->valuestring == NULL)){
        goto end;
    }
    order_lift_typeVariable = order_lift_type_order_lift_type_FromString(order_lift_typeVar->valuestring);
    return order_lift_typeVariable;
end:
    return 0;
}
