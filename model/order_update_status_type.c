#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "order_update_status_type.h"


char* order_update_status_type_order_update_status_type_ToString(_api__order_update_status_type__e order_update_status_type) {
    char *order_update_status_typeArray[] =  { "NULL", "OK", "ERROR" };
    return order_update_status_typeArray[order_update_status_type];
}

_api__order_update_status_type__e order_update_status_type_order_update_status_type_FromString(char* order_update_status_type) {
    int stringToReturn = 0;
    char *order_update_status_typeArray[] =  { "NULL", "OK", "ERROR" };
    size_t sizeofArray = sizeof(order_update_status_typeArray) / sizeof(order_update_status_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(order_update_status_type, order_update_status_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *order_update_status_type_order_update_status_type_convertToJSON(_api__order_update_status_type__e order_update_status_type) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "order_update_status_type", order_update_status_type_order_update_status_type_ToString(order_update_status_type)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

_api__order_update_status_type__e order_update_status_type_order_update_status_type_parseFromJSON(cJSON *order_update_status_typeJSON) {
    _api__order_update_status_type__e *order_update_status_type = NULL;
    _api__order_update_status_type__e order_update_status_typeVariable;
    cJSON *order_update_status_typeVar = cJSON_GetObjectItemCaseSensitive(order_update_status_typeJSON, "order_update_status_type");
    if(!cJSON_IsString(order_update_status_typeVar) || (order_update_status_typeVar->valuestring == NULL)){
        goto end;
    }
    order_update_status_typeVariable = order_update_status_type_order_update_status_type_FromString(order_update_status_typeVar->valuestring);
    return order_update_status_typeVariable;
end:
    return 0;
}
