#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "return_shipment_status_type.h"


char* return_shipment_status_type_return_shipment_status_type_ToString(_api__return_shipment_status_type__e return_shipment_status_type) {
    char *return_shipment_status_typeArray[] =  { "NULL", "CREATED", "RECEIVED", "IN_TRANSIT", "READY_FOR_PICKUP", "PICKED", "LOST", "EXPIRED", "CANCELLED", "FULFILMENT_RECEIVED", "PREPARED_FOR_UTILIZATION", "NOT_IN_DEMAND", "UTILIZED", "READY_FOR_EXPROPRIATION", "RECEIVED_FOR_EXPROPRIATION" };
    return return_shipment_status_typeArray[return_shipment_status_type];
}

_api__return_shipment_status_type__e return_shipment_status_type_return_shipment_status_type_FromString(char* return_shipment_status_type) {
    int stringToReturn = 0;
    char *return_shipment_status_typeArray[] =  { "NULL", "CREATED", "RECEIVED", "IN_TRANSIT", "READY_FOR_PICKUP", "PICKED", "LOST", "EXPIRED", "CANCELLED", "FULFILMENT_RECEIVED", "PREPARED_FOR_UTILIZATION", "NOT_IN_DEMAND", "UTILIZED", "READY_FOR_EXPROPRIATION", "RECEIVED_FOR_EXPROPRIATION" };
    size_t sizeofArray = sizeof(return_shipment_status_typeArray) / sizeof(return_shipment_status_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(return_shipment_status_type, return_shipment_status_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *return_shipment_status_type_return_shipment_status_type_convertToJSON(_api__return_shipment_status_type__e return_shipment_status_type) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "return_shipment_status_type", return_shipment_status_type_return_shipment_status_type_ToString(return_shipment_status_type)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

_api__return_shipment_status_type__e return_shipment_status_type_return_shipment_status_type_parseFromJSON(cJSON *return_shipment_status_typeJSON) {
    _api__return_shipment_status_type__e *return_shipment_status_type = NULL;
    _api__return_shipment_status_type__e return_shipment_status_typeVariable;
    cJSON *return_shipment_status_typeVar = cJSON_GetObjectItemCaseSensitive(return_shipment_status_typeJSON, "return_shipment_status_type");
    if(!cJSON_IsString(return_shipment_status_typeVar) || (return_shipment_status_typeVar->valuestring == NULL)){
        goto end;
    }
    return_shipment_status_typeVariable = return_shipment_status_type_return_shipment_status_type_FromString(return_shipment_status_typeVar->valuestring);
    return return_shipment_status_typeVariable;
end:
    return 0;
}
