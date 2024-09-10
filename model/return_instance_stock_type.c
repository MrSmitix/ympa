#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "return_instance_stock_type.h"


char* return_instance_stock_type_return_instance_stock_type_ToString(_api__return_instance_stock_type__e return_instance_stock_type) {
    char *return_instance_stock_typeArray[] =  { "NULL", "FIT", "DEFECT", "ANOMALY", "SURPLUS", "EXPIRED", "MISGRADING", "UNDEFINED", "INCORRECT_IMEI", "INCORRECT_SERIAL_NUMBER", "INCORRECT_CIS", "PART_MISSING", "NON_COMPLIENT", "NOT_ACCEPTABLE", "SERVICE", "MARKDOWN", "DEMO", "REPAIR", "FIRMWARE", "UNKNOWN" };
    return return_instance_stock_typeArray[return_instance_stock_type];
}

_api__return_instance_stock_type__e return_instance_stock_type_return_instance_stock_type_FromString(char* return_instance_stock_type) {
    int stringToReturn = 0;
    char *return_instance_stock_typeArray[] =  { "NULL", "FIT", "DEFECT", "ANOMALY", "SURPLUS", "EXPIRED", "MISGRADING", "UNDEFINED", "INCORRECT_IMEI", "INCORRECT_SERIAL_NUMBER", "INCORRECT_CIS", "PART_MISSING", "NON_COMPLIENT", "NOT_ACCEPTABLE", "SERVICE", "MARKDOWN", "DEMO", "REPAIR", "FIRMWARE", "UNKNOWN" };
    size_t sizeofArray = sizeof(return_instance_stock_typeArray) / sizeof(return_instance_stock_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(return_instance_stock_type, return_instance_stock_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *return_instance_stock_type_return_instance_stock_type_convertToJSON(_api__return_instance_stock_type__e return_instance_stock_type) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "return_instance_stock_type", return_instance_stock_type_return_instance_stock_type_ToString(return_instance_stock_type)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

_api__return_instance_stock_type__e return_instance_stock_type_return_instance_stock_type_parseFromJSON(cJSON *return_instance_stock_typeJSON) {
    _api__return_instance_stock_type__e *return_instance_stock_type = NULL;
    _api__return_instance_stock_type__e return_instance_stock_typeVariable;
    cJSON *return_instance_stock_typeVar = cJSON_GetObjectItemCaseSensitive(return_instance_stock_typeJSON, "return_instance_stock_type");
    if(!cJSON_IsString(return_instance_stock_typeVar) || (return_instance_stock_typeVar->valuestring == NULL)){
        goto end;
    }
    return_instance_stock_typeVariable = return_instance_stock_type_return_instance_stock_type_FromString(return_instance_stock_typeVar->valuestring);
    return return_instance_stock_typeVariable;
end:
    return 0;
}
