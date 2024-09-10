#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "shipment_status_change_dto.h"


char* shipment_status_change_dto_status_ToString(_api__shipment_status_change_dto__e status) {
    char* statusArray[] =  { "NULL", "OUTBOUND_CREATED", "OUTBOUND_READY_FOR_CONFIRMATION", "OUTBOUND_CONFIRMED", "OUTBOUND_SIGNED", "FINISHED", "ACCEPTED", "ACCEPTED_WITH_DISCREPANCIES", "ERROR" };
    return statusArray[status];
}

_api__shipment_status_change_dto__e shipment_status_change_dto_status_FromString(char* status){
    int stringToReturn = 0;
    char *statusArray[] =  { "NULL", "OUTBOUND_CREATED", "OUTBOUND_READY_FOR_CONFIRMATION", "OUTBOUND_CONFIRMED", "OUTBOUND_SIGNED", "FINISHED", "ACCEPTED", "ACCEPTED_WITH_DISCREPANCIES", "ERROR" };
    size_t sizeofArray = sizeof(statusArray) / sizeof(statusArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(status, statusArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

shipment_status_change_dto_t *shipment_status_change_dto_create(
    shipment_status_type_t *status,
    char *description,
    char *update_time
    ) {
    shipment_status_change_dto_t *shipment_status_change_dto_local_var = malloc(sizeof(shipment_status_change_dto_t));
    if (!shipment_status_change_dto_local_var) {
        return NULL;
    }
    shipment_status_change_dto_local_var->status = status;
    shipment_status_change_dto_local_var->description = description;
    shipment_status_change_dto_local_var->update_time = update_time;

    return shipment_status_change_dto_local_var;
}


void shipment_status_change_dto_free(shipment_status_change_dto_t *shipment_status_change_dto) {
    if(NULL == shipment_status_change_dto){
        return ;
    }
    listEntry_t *listEntry;
    if (shipment_status_change_dto->status) {
        shipment_status_type_free(shipment_status_change_dto->status);
        shipment_status_change_dto->status = NULL;
    }
    if (shipment_status_change_dto->description) {
        free(shipment_status_change_dto->description);
        shipment_status_change_dto->description = NULL;
    }
    if (shipment_status_change_dto->update_time) {
        free(shipment_status_change_dto->update_time);
        shipment_status_change_dto->update_time = NULL;
    }
    free(shipment_status_change_dto);
}

cJSON *shipment_status_change_dto_convertToJSON(shipment_status_change_dto_t *shipment_status_change_dto) {
    cJSON *item = cJSON_CreateObject();

    // shipment_status_change_dto->status
    if(shipment_status_change_dto->status != _api__shipment_status_change_dto__NULL) {
    cJSON *status_local_JSON = shipment_status_type_convertToJSON(shipment_status_change_dto->status);
    if(status_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "status", status_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // shipment_status_change_dto->description
    if(shipment_status_change_dto->description) {
    if(cJSON_AddStringToObject(item, "description", shipment_status_change_dto->description) == NULL) {
    goto fail; //String
    }
    }


    // shipment_status_change_dto->update_time
    if(shipment_status_change_dto->update_time) {
    if(cJSON_AddStringToObject(item, "updateTime", shipment_status_change_dto->update_time) == NULL) {
    goto fail; //Date-Time
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

shipment_status_change_dto_t *shipment_status_change_dto_parseFromJSON(cJSON *shipment_status_change_dtoJSON){

    shipment_status_change_dto_t *shipment_status_change_dto_local_var = NULL;

    // define the local variable for shipment_status_change_dto->status
    shipment_status_type_t *status_local_nonprim = NULL;

    // shipment_status_change_dto->status
    cJSON *status = cJSON_GetObjectItemCaseSensitive(shipment_status_change_dtoJSON, "status");
    if (status) { 
    status_local_nonprim = shipment_status_type_parseFromJSON(status); //custom
    }

    // shipment_status_change_dto->description
    cJSON *description = cJSON_GetObjectItemCaseSensitive(shipment_status_change_dtoJSON, "description");
    if (description) { 
    if(!cJSON_IsString(description) && !cJSON_IsNull(description))
    {
    goto end; //String
    }
    }

    // shipment_status_change_dto->update_time
    cJSON *update_time = cJSON_GetObjectItemCaseSensitive(shipment_status_change_dtoJSON, "updateTime");
    if (update_time) { 
    if(!cJSON_IsString(update_time) && !cJSON_IsNull(update_time))
    {
    goto end; //DateTime
    }
    }


    shipment_status_change_dto_local_var = shipment_status_change_dto_create (
        status ? status_local_nonprim : NULL,
        description && !cJSON_IsNull(description) ? strdup(description->valuestring) : NULL,
        update_time && !cJSON_IsNull(update_time) ? strdup(update_time->valuestring) : NULL
        );

    return shipment_status_change_dto_local_var;
end:
    if (status_local_nonprim) {
        shipment_status_type_free(status_local_nonprim);
        status_local_nonprim = NULL;
    }
    return NULL;

}
