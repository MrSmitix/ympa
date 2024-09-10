#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "shipment_status_type.h"


char* shipment_status_type_shipment_status_type_ToString(_api__shipment_status_type__e shipment_status_type) {
    char *shipment_status_typeArray[] =  { "NULL", "OUTBOUND_CREATED", "OUTBOUND_READY_FOR_CONFIRMATION", "OUTBOUND_CONFIRMED", "OUTBOUND_SIGNED", "FINISHED", "ACCEPTED", "ACCEPTED_WITH_DISCREPANCIES", "ERROR" };
    return shipment_status_typeArray[shipment_status_type];
}

_api__shipment_status_type__e shipment_status_type_shipment_status_type_FromString(char* shipment_status_type) {
    int stringToReturn = 0;
    char *shipment_status_typeArray[] =  { "NULL", "OUTBOUND_CREATED", "OUTBOUND_READY_FOR_CONFIRMATION", "OUTBOUND_CONFIRMED", "OUTBOUND_SIGNED", "FINISHED", "ACCEPTED", "ACCEPTED_WITH_DISCREPANCIES", "ERROR" };
    size_t sizeofArray = sizeof(shipment_status_typeArray) / sizeof(shipment_status_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(shipment_status_type, shipment_status_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *shipment_status_type_shipment_status_type_convertToJSON(_api__shipment_status_type__e shipment_status_type) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "shipment_status_type", shipment_status_type_shipment_status_type_ToString(shipment_status_type)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

_api__shipment_status_type__e shipment_status_type_shipment_status_type_parseFromJSON(cJSON *shipment_status_typeJSON) {
    _api__shipment_status_type__e *shipment_status_type = NULL;
    _api__shipment_status_type__e shipment_status_typeVariable;
    cJSON *shipment_status_typeVar = cJSON_GetObjectItemCaseSensitive(shipment_status_typeJSON, "shipment_status_type");
    if(!cJSON_IsString(shipment_status_typeVar) || (shipment_status_typeVar->valuestring == NULL)){
        goto end;
    }
    shipment_status_typeVariable = shipment_status_type_shipment_status_type_FromString(shipment_status_typeVar->valuestring);
    return shipment_status_typeVariable;
end:
    return 0;
}
