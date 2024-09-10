#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "shipment_type.h"


char* shipment_type_shipment_type_ToString(_api__shipment_type__e shipment_type) {
    char *shipment_typeArray[] =  { "NULL", "IMPORT", "WITHDRAW" };
    return shipment_typeArray[shipment_type];
}

_api__shipment_type__e shipment_type_shipment_type_FromString(char* shipment_type) {
    int stringToReturn = 0;
    char *shipment_typeArray[] =  { "NULL", "IMPORT", "WITHDRAW" };
    size_t sizeofArray = sizeof(shipment_typeArray) / sizeof(shipment_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(shipment_type, shipment_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *shipment_type_shipment_type_convertToJSON(_api__shipment_type__e shipment_type) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "shipment_type", shipment_type_shipment_type_ToString(shipment_type)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

_api__shipment_type__e shipment_type_shipment_type_parseFromJSON(cJSON *shipment_typeJSON) {
    _api__shipment_type__e *shipment_type = NULL;
    _api__shipment_type__e shipment_typeVariable;
    cJSON *shipment_typeVar = cJSON_GetObjectItemCaseSensitive(shipment_typeJSON, "shipment_type");
    if(!cJSON_IsString(shipment_typeVar) || (shipment_typeVar->valuestring == NULL)){
        goto end;
    }
    shipment_typeVariable = shipment_type_shipment_type_FromString(shipment_typeVar->valuestring);
    return shipment_typeVariable;
end:
    return 0;
}
