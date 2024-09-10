#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "warehouse_stock_type.h"


char* warehouse_stock_type_warehouse_stock_type_ToString(_api__warehouse_stock_type__e warehouse_stock_type) {
    char *warehouse_stock_typeArray[] =  { "NULL", "FIT", "FREEZE", "AVAILABLE", "QUARANTINE", "UTILIZATION", "DEFECT", "EXPIRED" };
    return warehouse_stock_typeArray[warehouse_stock_type];
}

_api__warehouse_stock_type__e warehouse_stock_type_warehouse_stock_type_FromString(char* warehouse_stock_type) {
    int stringToReturn = 0;
    char *warehouse_stock_typeArray[] =  { "NULL", "FIT", "FREEZE", "AVAILABLE", "QUARANTINE", "UTILIZATION", "DEFECT", "EXPIRED" };
    size_t sizeofArray = sizeof(warehouse_stock_typeArray) / sizeof(warehouse_stock_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(warehouse_stock_type, warehouse_stock_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *warehouse_stock_type_warehouse_stock_type_convertToJSON(_api__warehouse_stock_type__e warehouse_stock_type) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "warehouse_stock_type", warehouse_stock_type_warehouse_stock_type_ToString(warehouse_stock_type)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

_api__warehouse_stock_type__e warehouse_stock_type_warehouse_stock_type_parseFromJSON(cJSON *warehouse_stock_typeJSON) {
    _api__warehouse_stock_type__e *warehouse_stock_type = NULL;
    _api__warehouse_stock_type__e warehouse_stock_typeVariable;
    cJSON *warehouse_stock_typeVar = cJSON_GetObjectItemCaseSensitive(warehouse_stock_typeJSON, "warehouse_stock_type");
    if(!cJSON_IsString(warehouse_stock_typeVar) || (warehouse_stock_typeVar->valuestring == NULL)){
        goto end;
    }
    warehouse_stock_typeVariable = warehouse_stock_type_warehouse_stock_type_FromString(warehouse_stock_typeVar->valuestring);
    return warehouse_stock_typeVariable;
end:
    return 0;
}
