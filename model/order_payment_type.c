#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "order_payment_type.h"


char* order_payment_type_order_payment_type_ToString(_api__order_payment_type__e order_payment_type) {
    char *order_payment_typeArray[] =  { "NULL", "PREPAID", "POSTPAID", "UNKNOWN" };
    return order_payment_typeArray[order_payment_type];
}

_api__order_payment_type__e order_payment_type_order_payment_type_FromString(char* order_payment_type) {
    int stringToReturn = 0;
    char *order_payment_typeArray[] =  { "NULL", "PREPAID", "POSTPAID", "UNKNOWN" };
    size_t sizeofArray = sizeof(order_payment_typeArray) / sizeof(order_payment_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(order_payment_type, order_payment_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *order_payment_type_order_payment_type_convertToJSON(_api__order_payment_type__e order_payment_type) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "order_payment_type", order_payment_type_order_payment_type_ToString(order_payment_type)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

_api__order_payment_type__e order_payment_type_order_payment_type_parseFromJSON(cJSON *order_payment_typeJSON) {
    _api__order_payment_type__e *order_payment_type = NULL;
    _api__order_payment_type__e order_payment_typeVariable;
    cJSON *order_payment_typeVar = cJSON_GetObjectItemCaseSensitive(order_payment_typeJSON, "order_payment_type");
    if(!cJSON_IsString(order_payment_typeVar) || (order_payment_typeVar->valuestring == NULL)){
        goto end;
    }
    order_payment_typeVariable = order_payment_type_order_payment_type_FromString(order_payment_typeVar->valuestring);
    return order_payment_typeVariable;
end:
    return 0;
}
