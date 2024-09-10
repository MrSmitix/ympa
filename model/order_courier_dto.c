#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "order_courier_dto.h"



order_courier_dto_t *order_courier_dto_create(
    char *full_name,
    char *phone,
    char *phone_extension,
    char *vehicle_number,
    char *vehicle_description
    ) {
    order_courier_dto_t *order_courier_dto_local_var = malloc(sizeof(order_courier_dto_t));
    if (!order_courier_dto_local_var) {
        return NULL;
    }
    order_courier_dto_local_var->full_name = full_name;
    order_courier_dto_local_var->phone = phone;
    order_courier_dto_local_var->phone_extension = phone_extension;
    order_courier_dto_local_var->vehicle_number = vehicle_number;
    order_courier_dto_local_var->vehicle_description = vehicle_description;

    return order_courier_dto_local_var;
}


void order_courier_dto_free(order_courier_dto_t *order_courier_dto) {
    if(NULL == order_courier_dto){
        return ;
    }
    listEntry_t *listEntry;
    if (order_courier_dto->full_name) {
        free(order_courier_dto->full_name);
        order_courier_dto->full_name = NULL;
    }
    if (order_courier_dto->phone) {
        free(order_courier_dto->phone);
        order_courier_dto->phone = NULL;
    }
    if (order_courier_dto->phone_extension) {
        free(order_courier_dto->phone_extension);
        order_courier_dto->phone_extension = NULL;
    }
    if (order_courier_dto->vehicle_number) {
        free(order_courier_dto->vehicle_number);
        order_courier_dto->vehicle_number = NULL;
    }
    if (order_courier_dto->vehicle_description) {
        free(order_courier_dto->vehicle_description);
        order_courier_dto->vehicle_description = NULL;
    }
    free(order_courier_dto);
}

cJSON *order_courier_dto_convertToJSON(order_courier_dto_t *order_courier_dto) {
    cJSON *item = cJSON_CreateObject();

    // order_courier_dto->full_name
    if(order_courier_dto->full_name) {
    if(cJSON_AddStringToObject(item, "fullName", order_courier_dto->full_name) == NULL) {
    goto fail; //String
    }
    }


    // order_courier_dto->phone
    if(order_courier_dto->phone) {
    if(cJSON_AddStringToObject(item, "phone", order_courier_dto->phone) == NULL) {
    goto fail; //String
    }
    }


    // order_courier_dto->phone_extension
    if(order_courier_dto->phone_extension) {
    if(cJSON_AddStringToObject(item, "phoneExtension", order_courier_dto->phone_extension) == NULL) {
    goto fail; //String
    }
    }


    // order_courier_dto->vehicle_number
    if(order_courier_dto->vehicle_number) {
    if(cJSON_AddStringToObject(item, "vehicleNumber", order_courier_dto->vehicle_number) == NULL) {
    goto fail; //String
    }
    }


    // order_courier_dto->vehicle_description
    if(order_courier_dto->vehicle_description) {
    if(cJSON_AddStringToObject(item, "vehicleDescription", order_courier_dto->vehicle_description) == NULL) {
    goto fail; //String
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

order_courier_dto_t *order_courier_dto_parseFromJSON(cJSON *order_courier_dtoJSON){

    order_courier_dto_t *order_courier_dto_local_var = NULL;

    // order_courier_dto->full_name
    cJSON *full_name = cJSON_GetObjectItemCaseSensitive(order_courier_dtoJSON, "fullName");
    if (full_name) { 
    if(!cJSON_IsString(full_name) && !cJSON_IsNull(full_name))
    {
    goto end; //String
    }
    }

    // order_courier_dto->phone
    cJSON *phone = cJSON_GetObjectItemCaseSensitive(order_courier_dtoJSON, "phone");
    if (phone) { 
    if(!cJSON_IsString(phone) && !cJSON_IsNull(phone))
    {
    goto end; //String
    }
    }

    // order_courier_dto->phone_extension
    cJSON *phone_extension = cJSON_GetObjectItemCaseSensitive(order_courier_dtoJSON, "phoneExtension");
    if (phone_extension) { 
    if(!cJSON_IsString(phone_extension) && !cJSON_IsNull(phone_extension))
    {
    goto end; //String
    }
    }

    // order_courier_dto->vehicle_number
    cJSON *vehicle_number = cJSON_GetObjectItemCaseSensitive(order_courier_dtoJSON, "vehicleNumber");
    if (vehicle_number) { 
    if(!cJSON_IsString(vehicle_number) && !cJSON_IsNull(vehicle_number))
    {
    goto end; //String
    }
    }

    // order_courier_dto->vehicle_description
    cJSON *vehicle_description = cJSON_GetObjectItemCaseSensitive(order_courier_dtoJSON, "vehicleDescription");
    if (vehicle_description) { 
    if(!cJSON_IsString(vehicle_description) && !cJSON_IsNull(vehicle_description))
    {
    goto end; //String
    }
    }


    order_courier_dto_local_var = order_courier_dto_create (
        full_name && !cJSON_IsNull(full_name) ? strdup(full_name->valuestring) : NULL,
        phone && !cJSON_IsNull(phone) ? strdup(phone->valuestring) : NULL,
        phone_extension && !cJSON_IsNull(phone_extension) ? strdup(phone_extension->valuestring) : NULL,
        vehicle_number && !cJSON_IsNull(vehicle_number) ? strdup(vehicle_number->valuestring) : NULL,
        vehicle_description && !cJSON_IsNull(vehicle_description) ? strdup(vehicle_description->valuestring) : NULL
        );

    return order_courier_dto_local_var;
end:
    return NULL;

}
