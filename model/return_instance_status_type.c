#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "return_instance_status_type.h"


char* return_instance_status_type_return_instance_status_type_ToString(_api__return_instance_status_type__e return_instance_status_type) {
    char *return_instance_status_typeArray[] =  { "NULL", "CREATED", "RECEIVED", "IN_TRANSIT", "READY_FOR_PICKUP", "PICKED", "RECEIVED_ON_FULFILLMENT", "CANCELLED", "LOST", "UTILIZED", "PREPARED_FOR_UTILIZATION", "EXPROPRIATED", "NOT_IN_DEMAND" };
    return return_instance_status_typeArray[return_instance_status_type];
}

_api__return_instance_status_type__e return_instance_status_type_return_instance_status_type_FromString(char* return_instance_status_type) {
    int stringToReturn = 0;
    char *return_instance_status_typeArray[] =  { "NULL", "CREATED", "RECEIVED", "IN_TRANSIT", "READY_FOR_PICKUP", "PICKED", "RECEIVED_ON_FULFILLMENT", "CANCELLED", "LOST", "UTILIZED", "PREPARED_FOR_UTILIZATION", "EXPROPRIATED", "NOT_IN_DEMAND" };
    size_t sizeofArray = sizeof(return_instance_status_typeArray) / sizeof(return_instance_status_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(return_instance_status_type, return_instance_status_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *return_instance_status_type_return_instance_status_type_convertToJSON(_api__return_instance_status_type__e return_instance_status_type) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "return_instance_status_type", return_instance_status_type_return_instance_status_type_ToString(return_instance_status_type)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

_api__return_instance_status_type__e return_instance_status_type_return_instance_status_type_parseFromJSON(cJSON *return_instance_status_typeJSON) {
    _api__return_instance_status_type__e *return_instance_status_type = NULL;
    _api__return_instance_status_type__e return_instance_status_typeVariable;
    cJSON *return_instance_status_typeVar = cJSON_GetObjectItemCaseSensitive(return_instance_status_typeJSON, "return_instance_status_type");
    if(!cJSON_IsString(return_instance_status_typeVar) || (return_instance_status_typeVar->valuestring == NULL)){
        goto end;
    }
    return_instance_status_typeVariable = return_instance_status_type_return_instance_status_type_FromString(return_instance_status_typeVar->valuestring);
    return return_instance_status_typeVariable;
end:
    return 0;
}
