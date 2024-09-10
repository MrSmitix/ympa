#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "extension_shipment_dto.h"


char* extension_shipment_dto_available_actions_ToString(_api__extension_shipment_dto__e available_actions) {
    char *available_actionsArray[] =  { "NULL", "CONFIRM", "DOWNLOAD_ACT", "DOWNLOAD_INBOUND_ACT", "DOWNLOAD_DISCREPANCY_ACT", "CHANGE_PALLETS_COUNT" };
    return available_actionsArray[available_actions - 1];
}

_api__extension_shipment_dto__e extension_shipment_dto_available_actions_FromString(char* available_actions) {
    int stringToReturn = 0;
    char *available_actionsArray[] =  { "NULL", "CONFIRM", "DOWNLOAD_ACT", "DOWNLOAD_INBOUND_ACT", "DOWNLOAD_DISCREPANCY_ACT", "CHANGE_PALLETS_COUNT" };
    size_t sizeofArray = sizeof(available_actionsArray) / sizeof(available_actionsArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(available_actions, available_actionsArray[stringToReturn]) == 0) {
            return stringToReturn + 1;
        }
        stringToReturn++;
    }
    return 0;
}

extension_shipment_dto_t *extension_shipment_dto_create(
    shipment_status_change_dto_t *current_status,
    list_t *available_actions
    ) {
    extension_shipment_dto_t *extension_shipment_dto_local_var = malloc(sizeof(extension_shipment_dto_t));
    if (!extension_shipment_dto_local_var) {
        return NULL;
    }
    extension_shipment_dto_local_var->current_status = current_status;
    extension_shipment_dto_local_var->available_actions = available_actions;

    return extension_shipment_dto_local_var;
}


void extension_shipment_dto_free(extension_shipment_dto_t *extension_shipment_dto) {
    if(NULL == extension_shipment_dto){
        return ;
    }
    listEntry_t *listEntry;
    if (extension_shipment_dto->current_status) {
        shipment_status_change_dto_free(extension_shipment_dto->current_status);
        extension_shipment_dto->current_status = NULL;
    }
    if (extension_shipment_dto->available_actions) {
        list_ForEach(listEntry, extension_shipment_dto->available_actions) {
            shipment_action_type_free(listEntry->data);
        }
        list_freeList(extension_shipment_dto->available_actions);
        extension_shipment_dto->available_actions = NULL;
    }
    free(extension_shipment_dto);
}

cJSON *extension_shipment_dto_convertToJSON(extension_shipment_dto_t *extension_shipment_dto) {
    cJSON *item = cJSON_CreateObject();

    // extension_shipment_dto->current_status
    if(extension_shipment_dto->current_status) {
    cJSON *current_status_local_JSON = shipment_status_change_dto_convertToJSON(extension_shipment_dto->current_status);
    if(current_status_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "currentStatus", current_status_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // extension_shipment_dto->available_actions
    if (_api__extension_shipment_dto_AVAILABLEACTIONS_NULL == extension_shipment_dto->available_actions) {
        goto fail;
    }
    cJSON *available_actions = cJSON_AddArrayToObject(item, "availableActions");
    if(available_actions == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *available_actionsListEntry;
    if (extension_shipment_dto->available_actions) {
    list_ForEach(available_actionsListEntry, extension_shipment_dto->available_actions) {
    cJSON *itemLocal = shipment_action_type_convertToJSON((_api__extension_shipment_dto__e)available_actionsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(available_actions, itemLocal);
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

extension_shipment_dto_t *extension_shipment_dto_parseFromJSON(cJSON *extension_shipment_dtoJSON){

    extension_shipment_dto_t *extension_shipment_dto_local_var = NULL;

    // define the local variable for extension_shipment_dto->current_status
    shipment_status_change_dto_t *current_status_local_nonprim = NULL;

    // define the local list for extension_shipment_dto->available_actions
    list_t *available_actionsList = NULL;

    // extension_shipment_dto->current_status
    cJSON *current_status = cJSON_GetObjectItemCaseSensitive(extension_shipment_dtoJSON, "currentStatus");
    if (current_status) { 
    current_status_local_nonprim = shipment_status_change_dto_parseFromJSON(current_status); //nonprimitive
    }

    // extension_shipment_dto->available_actions
    cJSON *available_actions = cJSON_GetObjectItemCaseSensitive(extension_shipment_dtoJSON, "availableActions");
    if (!available_actions) {
        goto end;
    }

    
    cJSON *available_actions_local_nonprimitive = NULL;
    if(!cJSON_IsArray(available_actions)){
        goto end; //nonprimitive container
    }

    available_actionsList = list_createList();

    cJSON_ArrayForEach(available_actions_local_nonprimitive,available_actions )
    {
        if(!cJSON_IsObject(available_actions_local_nonprimitive)){
            goto end;
        }
        extension_shipment_dto_shipment_action_type_e available_actionsItem = shipment_action_type_parseFromJSON(available_actions_local_nonprimitive);

        list_addElement(available_actionsList, (void *)available_actionsItem);
    }


    extension_shipment_dto_local_var = extension_shipment_dto_create (
        current_status ? current_status_local_nonprim : NULL,
        available_actionsList
        );

    return extension_shipment_dto_local_var;
end:
    if (current_status_local_nonprim) {
        shipment_status_change_dto_free(current_status_local_nonprim);
        current_status_local_nonprim = NULL;
    }
    if (available_actionsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, available_actionsList) {
            shipment_action_type_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(available_actionsList);
        available_actionsList = NULL;
    }
    return NULL;

}
