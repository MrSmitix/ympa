#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "shipment_action_type.h"


char* shipment_action_type_shipment_action_type_ToString(_api__shipment_action_type__e shipment_action_type) {
    char *shipment_action_typeArray[] =  { "NULL", "CONFIRM", "DOWNLOAD_ACT", "DOWNLOAD_INBOUND_ACT", "DOWNLOAD_DISCREPANCY_ACT", "CHANGE_PALLETS_COUNT" };
    return shipment_action_typeArray[shipment_action_type];
}

_api__shipment_action_type__e shipment_action_type_shipment_action_type_FromString(char* shipment_action_type) {
    int stringToReturn = 0;
    char *shipment_action_typeArray[] =  { "NULL", "CONFIRM", "DOWNLOAD_ACT", "DOWNLOAD_INBOUND_ACT", "DOWNLOAD_DISCREPANCY_ACT", "CHANGE_PALLETS_COUNT" };
    size_t sizeofArray = sizeof(shipment_action_typeArray) / sizeof(shipment_action_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(shipment_action_type, shipment_action_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *shipment_action_type_shipment_action_type_convertToJSON(_api__shipment_action_type__e shipment_action_type) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "shipment_action_type", shipment_action_type_shipment_action_type_ToString(shipment_action_type)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

_api__shipment_action_type__e shipment_action_type_shipment_action_type_parseFromJSON(cJSON *shipment_action_typeJSON) {
    _api__shipment_action_type__e *shipment_action_type = NULL;
    _api__shipment_action_type__e shipment_action_typeVariable;
    cJSON *shipment_action_typeVar = cJSON_GetObjectItemCaseSensitive(shipment_action_typeJSON, "shipment_action_type");
    if(!cJSON_IsString(shipment_action_typeVar) || (shipment_action_typeVar->valuestring == NULL)){
        goto end;
    }
    shipment_action_typeVariable = shipment_action_type_shipment_action_type_FromString(shipment_action_typeVar->valuestring);
    return shipment_action_typeVariable;
end:
    return 0;
}
