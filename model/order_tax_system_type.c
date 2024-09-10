#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "order_tax_system_type.h"


char* order_tax_system_type_order_tax_system_type_ToString(_api__order_tax_system_type__e order_tax_system_type) {
    char *order_tax_system_typeArray[] =  { "NULL", "OSN", "USN", "USN_MINUS_COST", "ENVD", "ECHN", "PSN", "NPD", "UNKNOWN_VALUE" };
    return order_tax_system_typeArray[order_tax_system_type];
}

_api__order_tax_system_type__e order_tax_system_type_order_tax_system_type_FromString(char* order_tax_system_type) {
    int stringToReturn = 0;
    char *order_tax_system_typeArray[] =  { "NULL", "OSN", "USN", "USN_MINUS_COST", "ENVD", "ECHN", "PSN", "NPD", "UNKNOWN_VALUE" };
    size_t sizeofArray = sizeof(order_tax_system_typeArray) / sizeof(order_tax_system_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(order_tax_system_type, order_tax_system_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *order_tax_system_type_order_tax_system_type_convertToJSON(_api__order_tax_system_type__e order_tax_system_type) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "order_tax_system_type", order_tax_system_type_order_tax_system_type_ToString(order_tax_system_type)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

_api__order_tax_system_type__e order_tax_system_type_order_tax_system_type_parseFromJSON(cJSON *order_tax_system_typeJSON) {
    _api__order_tax_system_type__e *order_tax_system_type = NULL;
    _api__order_tax_system_type__e order_tax_system_typeVariable;
    cJSON *order_tax_system_typeVar = cJSON_GetObjectItemCaseSensitive(order_tax_system_typeJSON, "order_tax_system_type");
    if(!cJSON_IsString(order_tax_system_typeVar) || (order_tax_system_typeVar->valuestring == NULL)){
        goto end;
    }
    order_tax_system_typeVariable = order_tax_system_type_order_tax_system_type_FromString(order_tax_system_typeVar->valuestring);
    return order_tax_system_typeVariable;
end:
    return 0;
}
