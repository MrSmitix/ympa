#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "warehouse_address_dto.h"



warehouse_address_dto_t *warehouse_address_dto_create(
    char *city,
    char *street,
    char *number,
    char *building,
    char *block,
    gps_dto_t *gps
    ) {
    warehouse_address_dto_t *warehouse_address_dto_local_var = malloc(sizeof(warehouse_address_dto_t));
    if (!warehouse_address_dto_local_var) {
        return NULL;
    }
    warehouse_address_dto_local_var->city = city;
    warehouse_address_dto_local_var->street = street;
    warehouse_address_dto_local_var->number = number;
    warehouse_address_dto_local_var->building = building;
    warehouse_address_dto_local_var->block = block;
    warehouse_address_dto_local_var->gps = gps;

    return warehouse_address_dto_local_var;
}


void warehouse_address_dto_free(warehouse_address_dto_t *warehouse_address_dto) {
    if(NULL == warehouse_address_dto){
        return ;
    }
    listEntry_t *listEntry;
    if (warehouse_address_dto->city) {
        free(warehouse_address_dto->city);
        warehouse_address_dto->city = NULL;
    }
    if (warehouse_address_dto->street) {
        free(warehouse_address_dto->street);
        warehouse_address_dto->street = NULL;
    }
    if (warehouse_address_dto->number) {
        free(warehouse_address_dto->number);
        warehouse_address_dto->number = NULL;
    }
    if (warehouse_address_dto->building) {
        free(warehouse_address_dto->building);
        warehouse_address_dto->building = NULL;
    }
    if (warehouse_address_dto->block) {
        free(warehouse_address_dto->block);
        warehouse_address_dto->block = NULL;
    }
    if (warehouse_address_dto->gps) {
        gps_dto_free(warehouse_address_dto->gps);
        warehouse_address_dto->gps = NULL;
    }
    free(warehouse_address_dto);
}

cJSON *warehouse_address_dto_convertToJSON(warehouse_address_dto_t *warehouse_address_dto) {
    cJSON *item = cJSON_CreateObject();

    // warehouse_address_dto->city
    if (!warehouse_address_dto->city) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "city", warehouse_address_dto->city) == NULL) {
    goto fail; //String
    }


    // warehouse_address_dto->street
    if(warehouse_address_dto->street) {
    if(cJSON_AddStringToObject(item, "street", warehouse_address_dto->street) == NULL) {
    goto fail; //String
    }
    }


    // warehouse_address_dto->number
    if(warehouse_address_dto->number) {
    if(cJSON_AddStringToObject(item, "number", warehouse_address_dto->number) == NULL) {
    goto fail; //String
    }
    }


    // warehouse_address_dto->building
    if(warehouse_address_dto->building) {
    if(cJSON_AddStringToObject(item, "building", warehouse_address_dto->building) == NULL) {
    goto fail; //String
    }
    }


    // warehouse_address_dto->block
    if(warehouse_address_dto->block) {
    if(cJSON_AddStringToObject(item, "block", warehouse_address_dto->block) == NULL) {
    goto fail; //String
    }
    }


    // warehouse_address_dto->gps
    if (!warehouse_address_dto->gps) {
        goto fail;
    }
    cJSON *gps_local_JSON = gps_dto_convertToJSON(warehouse_address_dto->gps);
    if(gps_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "gps", gps_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

warehouse_address_dto_t *warehouse_address_dto_parseFromJSON(cJSON *warehouse_address_dtoJSON){

    warehouse_address_dto_t *warehouse_address_dto_local_var = NULL;

    // define the local variable for warehouse_address_dto->gps
    gps_dto_t *gps_local_nonprim = NULL;

    // warehouse_address_dto->city
    cJSON *city = cJSON_GetObjectItemCaseSensitive(warehouse_address_dtoJSON, "city");
    if (!city) {
        goto end;
    }

    
    if(!cJSON_IsString(city))
    {
    goto end; //String
    }

    // warehouse_address_dto->street
    cJSON *street = cJSON_GetObjectItemCaseSensitive(warehouse_address_dtoJSON, "street");
    if (street) { 
    if(!cJSON_IsString(street) && !cJSON_IsNull(street))
    {
    goto end; //String
    }
    }

    // warehouse_address_dto->number
    cJSON *number = cJSON_GetObjectItemCaseSensitive(warehouse_address_dtoJSON, "number");
    if (number) { 
    if(!cJSON_IsString(number) && !cJSON_IsNull(number))
    {
    goto end; //String
    }
    }

    // warehouse_address_dto->building
    cJSON *building = cJSON_GetObjectItemCaseSensitive(warehouse_address_dtoJSON, "building");
    if (building) { 
    if(!cJSON_IsString(building) && !cJSON_IsNull(building))
    {
    goto end; //String
    }
    }

    // warehouse_address_dto->block
    cJSON *block = cJSON_GetObjectItemCaseSensitive(warehouse_address_dtoJSON, "block");
    if (block) { 
    if(!cJSON_IsString(block) && !cJSON_IsNull(block))
    {
    goto end; //String
    }
    }

    // warehouse_address_dto->gps
    cJSON *gps = cJSON_GetObjectItemCaseSensitive(warehouse_address_dtoJSON, "gps");
    if (!gps) {
        goto end;
    }

    
    gps_local_nonprim = gps_dto_parseFromJSON(gps); //nonprimitive


    warehouse_address_dto_local_var = warehouse_address_dto_create (
        strdup(city->valuestring),
        street && !cJSON_IsNull(street) ? strdup(street->valuestring) : NULL,
        number && !cJSON_IsNull(number) ? strdup(number->valuestring) : NULL,
        building && !cJSON_IsNull(building) ? strdup(building->valuestring) : NULL,
        block && !cJSON_IsNull(block) ? strdup(block->valuestring) : NULL,
        gps_local_nonprim
        );

    return warehouse_address_dto_local_var;
end:
    if (gps_local_nonprim) {
        gps_dto_free(gps_local_nonprim);
        gps_local_nonprim = NULL;
    }
    return NULL;

}
