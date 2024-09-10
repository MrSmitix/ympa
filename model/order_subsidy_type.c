#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "order_subsidy_type.h"


char* order_subsidy_type_order_subsidy_type_ToString(_api__order_subsidy_type__e order_subsidy_type) {
    char *order_subsidy_typeArray[] =  { "NULL", "YANDEX_CASHBACK", "SUBSIDY", "DELIVERY" };
    return order_subsidy_typeArray[order_subsidy_type];
}

_api__order_subsidy_type__e order_subsidy_type_order_subsidy_type_FromString(char* order_subsidy_type) {
    int stringToReturn = 0;
    char *order_subsidy_typeArray[] =  { "NULL", "YANDEX_CASHBACK", "SUBSIDY", "DELIVERY" };
    size_t sizeofArray = sizeof(order_subsidy_typeArray) / sizeof(order_subsidy_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(order_subsidy_type, order_subsidy_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *order_subsidy_type_order_subsidy_type_convertToJSON(_api__order_subsidy_type__e order_subsidy_type) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "order_subsidy_type", order_subsidy_type_order_subsidy_type_ToString(order_subsidy_type)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

_api__order_subsidy_type__e order_subsidy_type_order_subsidy_type_parseFromJSON(cJSON *order_subsidy_typeJSON) {
    _api__order_subsidy_type__e *order_subsidy_type = NULL;
    _api__order_subsidy_type__e order_subsidy_typeVariable;
    cJSON *order_subsidy_typeVar = cJSON_GetObjectItemCaseSensitive(order_subsidy_typeJSON, "order_subsidy_type");
    if(!cJSON_IsString(order_subsidy_typeVar) || (order_subsidy_typeVar->valuestring == NULL)){
        goto end;
    }
    order_subsidy_typeVariable = order_subsidy_type_order_subsidy_type_FromString(order_subsidy_typeVar->valuestring);
    return order_subsidy_typeVariable;
end:
    return 0;
}
