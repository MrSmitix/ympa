#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "order_buyer_type.h"


char* order_buyer_type_order_buyer_type_ToString(_api__order_buyer_type__e order_buyer_type) {
    char *order_buyer_typeArray[] =  { "NULL", "PERSON", "BUSINESS" };
    return order_buyer_typeArray[order_buyer_type];
}

_api__order_buyer_type__e order_buyer_type_order_buyer_type_FromString(char* order_buyer_type) {
    int stringToReturn = 0;
    char *order_buyer_typeArray[] =  { "NULL", "PERSON", "BUSINESS" };
    size_t sizeofArray = sizeof(order_buyer_typeArray) / sizeof(order_buyer_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(order_buyer_type, order_buyer_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *order_buyer_type_order_buyer_type_convertToJSON(_api__order_buyer_type__e order_buyer_type) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "order_buyer_type", order_buyer_type_order_buyer_type_ToString(order_buyer_type)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

_api__order_buyer_type__e order_buyer_type_order_buyer_type_parseFromJSON(cJSON *order_buyer_typeJSON) {
    _api__order_buyer_type__e *order_buyer_type = NULL;
    _api__order_buyer_type__e order_buyer_typeVariable;
    cJSON *order_buyer_typeVar = cJSON_GetObjectItemCaseSensitive(order_buyer_typeJSON, "order_buyer_type");
    if(!cJSON_IsString(order_buyer_typeVar) || (order_buyer_typeVar->valuestring == NULL)){
        goto end;
    }
    order_buyer_typeVariable = order_buyer_type_order_buyer_type_FromString(order_buyer_typeVar->valuestring);
    return order_buyer_typeVariable;
end:
    return 0;
}
