#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "delivery_services_dto.h"



delivery_services_dto_t *delivery_services_dto_create(
    list_t *delivery_service
    ) {
    delivery_services_dto_t *delivery_services_dto_local_var = malloc(sizeof(delivery_services_dto_t));
    if (!delivery_services_dto_local_var) {
        return NULL;
    }
    delivery_services_dto_local_var->delivery_service = delivery_service;

    return delivery_services_dto_local_var;
}


void delivery_services_dto_free(delivery_services_dto_t *delivery_services_dto) {
    if(NULL == delivery_services_dto){
        return ;
    }
    listEntry_t *listEntry;
    if (delivery_services_dto->delivery_service) {
        list_ForEach(listEntry, delivery_services_dto->delivery_service) {
            delivery_service_info_dto_free(listEntry->data);
        }
        list_freeList(delivery_services_dto->delivery_service);
        delivery_services_dto->delivery_service = NULL;
    }
    free(delivery_services_dto);
}

cJSON *delivery_services_dto_convertToJSON(delivery_services_dto_t *delivery_services_dto) {
    cJSON *item = cJSON_CreateObject();

    // delivery_services_dto->delivery_service
    if (!delivery_services_dto->delivery_service) {
        goto fail;
    }
    cJSON *delivery_service = cJSON_AddArrayToObject(item, "deliveryService");
    if(delivery_service == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *delivery_serviceListEntry;
    if (delivery_services_dto->delivery_service) {
    list_ForEach(delivery_serviceListEntry, delivery_services_dto->delivery_service) {
    cJSON *itemLocal = delivery_service_info_dto_convertToJSON(delivery_serviceListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(delivery_service, itemLocal);
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

delivery_services_dto_t *delivery_services_dto_parseFromJSON(cJSON *delivery_services_dtoJSON){

    delivery_services_dto_t *delivery_services_dto_local_var = NULL;

    // define the local list for delivery_services_dto->delivery_service
    list_t *delivery_serviceList = NULL;

    // delivery_services_dto->delivery_service
    cJSON *delivery_service = cJSON_GetObjectItemCaseSensitive(delivery_services_dtoJSON, "deliveryService");
    if (!delivery_service) {
        goto end;
    }

    
    cJSON *delivery_service_local_nonprimitive = NULL;
    if(!cJSON_IsArray(delivery_service)){
        goto end; //nonprimitive container
    }

    delivery_serviceList = list_createList();

    cJSON_ArrayForEach(delivery_service_local_nonprimitive,delivery_service )
    {
        if(!cJSON_IsObject(delivery_service_local_nonprimitive)){
            goto end;
        }
        delivery_service_info_dto_t *delivery_serviceItem = delivery_service_info_dto_parseFromJSON(delivery_service_local_nonprimitive);

        list_addElement(delivery_serviceList, delivery_serviceItem);
    }


    delivery_services_dto_local_var = delivery_services_dto_create (
        delivery_serviceList
        );

    return delivery_services_dto_local_var;
end:
    if (delivery_serviceList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, delivery_serviceList) {
            delivery_service_info_dto_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(delivery_serviceList);
        delivery_serviceList = NULL;
    }
    return NULL;

}
