#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "order_item_instance_type.h"


char* order_item_instance_type_order_item_instance_type_ToString(_api__order_item_instance_type__e order_item_instance_type) {
    char *order_item_instance_typeArray[] =  { "NULL", "CIS", "UIN", "RNPT", "GTD" };
    return order_item_instance_typeArray[order_item_instance_type];
}

_api__order_item_instance_type__e order_item_instance_type_order_item_instance_type_FromString(char* order_item_instance_type) {
    int stringToReturn = 0;
    char *order_item_instance_typeArray[] =  { "NULL", "CIS", "UIN", "RNPT", "GTD" };
    size_t sizeofArray = sizeof(order_item_instance_typeArray) / sizeof(order_item_instance_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(order_item_instance_type, order_item_instance_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *order_item_instance_type_order_item_instance_type_convertToJSON(_api__order_item_instance_type__e order_item_instance_type) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "order_item_instance_type", order_item_instance_type_order_item_instance_type_ToString(order_item_instance_type)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

_api__order_item_instance_type__e order_item_instance_type_order_item_instance_type_parseFromJSON(cJSON *order_item_instance_typeJSON) {
    _api__order_item_instance_type__e *order_item_instance_type = NULL;
    _api__order_item_instance_type__e order_item_instance_typeVariable;
    cJSON *order_item_instance_typeVar = cJSON_GetObjectItemCaseSensitive(order_item_instance_typeJSON, "order_item_instance_type");
    if(!cJSON_IsString(order_item_instance_typeVar) || (order_item_instance_typeVar->valuestring == NULL)){
        goto end;
    }
    order_item_instance_typeVariable = order_item_instance_type_order_item_instance_type_FromString(order_item_instance_typeVar->valuestring);
    return order_item_instance_typeVariable;
end:
    return 0;
}
