#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "order_vat_type.h"


char* order_vat_type_order_vat_type_ToString(_api__order_vat_type__e order_vat_type) {
    char *order_vat_typeArray[] =  { "NULL", "NO_VAT", "VAT_0", "VAT_10", "VAT_10_110", "VAT_20", "VAT_20_120", "VAT_18", "VAT_18_118", "UNKNOWN_VALUE" };
    return order_vat_typeArray[order_vat_type];
}

_api__order_vat_type__e order_vat_type_order_vat_type_FromString(char* order_vat_type) {
    int stringToReturn = 0;
    char *order_vat_typeArray[] =  { "NULL", "NO_VAT", "VAT_0", "VAT_10", "VAT_10_110", "VAT_20", "VAT_20_120", "VAT_18", "VAT_18_118", "UNKNOWN_VALUE" };
    size_t sizeofArray = sizeof(order_vat_typeArray) / sizeof(order_vat_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(order_vat_type, order_vat_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *order_vat_type_order_vat_type_convertToJSON(_api__order_vat_type__e order_vat_type) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "order_vat_type", order_vat_type_order_vat_type_ToString(order_vat_type)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

_api__order_vat_type__e order_vat_type_order_vat_type_parseFromJSON(cJSON *order_vat_typeJSON) {
    _api__order_vat_type__e *order_vat_type = NULL;
    _api__order_vat_type__e order_vat_typeVariable;
    cJSON *order_vat_typeVar = cJSON_GetObjectItemCaseSensitive(order_vat_typeJSON, "order_vat_type");
    if(!cJSON_IsString(order_vat_typeVar) || (order_vat_typeVar->valuestring == NULL)){
        goto end;
    }
    order_vat_typeVariable = order_vat_type_order_vat_type_FromString(order_vat_typeVar->valuestring);
    return order_vat_typeVariable;
end:
    return 0;
}
