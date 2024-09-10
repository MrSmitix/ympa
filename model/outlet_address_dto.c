#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "outlet_address_dto.h"



outlet_address_dto_t *outlet_address_dto_create(
    long region_id,
    char *street,
    char *number,
    char *building,
    char *estate,
    char *block,
    char *additional,
    int km,
    char *city
    ) {
    outlet_address_dto_t *outlet_address_dto_local_var = malloc(sizeof(outlet_address_dto_t));
    if (!outlet_address_dto_local_var) {
        return NULL;
    }
    outlet_address_dto_local_var->region_id = region_id;
    outlet_address_dto_local_var->street = street;
    outlet_address_dto_local_var->number = number;
    outlet_address_dto_local_var->building = building;
    outlet_address_dto_local_var->estate = estate;
    outlet_address_dto_local_var->block = block;
    outlet_address_dto_local_var->additional = additional;
    outlet_address_dto_local_var->km = km;
    outlet_address_dto_local_var->city = city;

    return outlet_address_dto_local_var;
}


void outlet_address_dto_free(outlet_address_dto_t *outlet_address_dto) {
    if(NULL == outlet_address_dto){
        return ;
    }
    listEntry_t *listEntry;
    if (outlet_address_dto->street) {
        free(outlet_address_dto->street);
        outlet_address_dto->street = NULL;
    }
    if (outlet_address_dto->number) {
        free(outlet_address_dto->number);
        outlet_address_dto->number = NULL;
    }
    if (outlet_address_dto->building) {
        free(outlet_address_dto->building);
        outlet_address_dto->building = NULL;
    }
    if (outlet_address_dto->estate) {
        free(outlet_address_dto->estate);
        outlet_address_dto->estate = NULL;
    }
    if (outlet_address_dto->block) {
        free(outlet_address_dto->block);
        outlet_address_dto->block = NULL;
    }
    if (outlet_address_dto->additional) {
        free(outlet_address_dto->additional);
        outlet_address_dto->additional = NULL;
    }
    if (outlet_address_dto->city) {
        free(outlet_address_dto->city);
        outlet_address_dto->city = NULL;
    }
    free(outlet_address_dto);
}

cJSON *outlet_address_dto_convertToJSON(outlet_address_dto_t *outlet_address_dto) {
    cJSON *item = cJSON_CreateObject();

    // outlet_address_dto->region_id
    if (!outlet_address_dto->region_id) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "regionId", outlet_address_dto->region_id) == NULL) {
    goto fail; //Numeric
    }


    // outlet_address_dto->street
    if(outlet_address_dto->street) {
    if(cJSON_AddStringToObject(item, "street", outlet_address_dto->street) == NULL) {
    goto fail; //String
    }
    }


    // outlet_address_dto->number
    if(outlet_address_dto->number) {
    if(cJSON_AddStringToObject(item, "number", outlet_address_dto->number) == NULL) {
    goto fail; //String
    }
    }


    // outlet_address_dto->building
    if(outlet_address_dto->building) {
    if(cJSON_AddStringToObject(item, "building", outlet_address_dto->building) == NULL) {
    goto fail; //String
    }
    }


    // outlet_address_dto->estate
    if(outlet_address_dto->estate) {
    if(cJSON_AddStringToObject(item, "estate", outlet_address_dto->estate) == NULL) {
    goto fail; //String
    }
    }


    // outlet_address_dto->block
    if(outlet_address_dto->block) {
    if(cJSON_AddStringToObject(item, "block", outlet_address_dto->block) == NULL) {
    goto fail; //String
    }
    }


    // outlet_address_dto->additional
    if(outlet_address_dto->additional) {
    if(cJSON_AddStringToObject(item, "additional", outlet_address_dto->additional) == NULL) {
    goto fail; //String
    }
    }


    // outlet_address_dto->km
    if(outlet_address_dto->km) {
    if(cJSON_AddNumberToObject(item, "km", outlet_address_dto->km) == NULL) {
    goto fail; //Numeric
    }
    }


    // outlet_address_dto->city
    if(outlet_address_dto->city) {
    if(cJSON_AddStringToObject(item, "city", outlet_address_dto->city) == NULL) {
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

outlet_address_dto_t *outlet_address_dto_parseFromJSON(cJSON *outlet_address_dtoJSON){

    outlet_address_dto_t *outlet_address_dto_local_var = NULL;

    // outlet_address_dto->region_id
    cJSON *region_id = cJSON_GetObjectItemCaseSensitive(outlet_address_dtoJSON, "regionId");
    if (!region_id) {
        goto end;
    }

    
    if(!cJSON_IsNumber(region_id))
    {
    goto end; //Numeric
    }

    // outlet_address_dto->street
    cJSON *street = cJSON_GetObjectItemCaseSensitive(outlet_address_dtoJSON, "street");
    if (street) { 
    if(!cJSON_IsString(street) && !cJSON_IsNull(street))
    {
    goto end; //String
    }
    }

    // outlet_address_dto->number
    cJSON *number = cJSON_GetObjectItemCaseSensitive(outlet_address_dtoJSON, "number");
    if (number) { 
    if(!cJSON_IsString(number) && !cJSON_IsNull(number))
    {
    goto end; //String
    }
    }

    // outlet_address_dto->building
    cJSON *building = cJSON_GetObjectItemCaseSensitive(outlet_address_dtoJSON, "building");
    if (building) { 
    if(!cJSON_IsString(building) && !cJSON_IsNull(building))
    {
    goto end; //String
    }
    }

    // outlet_address_dto->estate
    cJSON *estate = cJSON_GetObjectItemCaseSensitive(outlet_address_dtoJSON, "estate");
    if (estate) { 
    if(!cJSON_IsString(estate) && !cJSON_IsNull(estate))
    {
    goto end; //String
    }
    }

    // outlet_address_dto->block
    cJSON *block = cJSON_GetObjectItemCaseSensitive(outlet_address_dtoJSON, "block");
    if (block) { 
    if(!cJSON_IsString(block) && !cJSON_IsNull(block))
    {
    goto end; //String
    }
    }

    // outlet_address_dto->additional
    cJSON *additional = cJSON_GetObjectItemCaseSensitive(outlet_address_dtoJSON, "additional");
    if (additional) { 
    if(!cJSON_IsString(additional) && !cJSON_IsNull(additional))
    {
    goto end; //String
    }
    }

    // outlet_address_dto->km
    cJSON *km = cJSON_GetObjectItemCaseSensitive(outlet_address_dtoJSON, "km");
    if (km) { 
    if(!cJSON_IsNumber(km))
    {
    goto end; //Numeric
    }
    }

    // outlet_address_dto->city
    cJSON *city = cJSON_GetObjectItemCaseSensitive(outlet_address_dtoJSON, "city");
    if (city) { 
    if(!cJSON_IsString(city) && !cJSON_IsNull(city))
    {
    goto end; //String
    }
    }


    outlet_address_dto_local_var = outlet_address_dto_create (
        region_id->valuedouble,
        street && !cJSON_IsNull(street) ? strdup(street->valuestring) : NULL,
        number && !cJSON_IsNull(number) ? strdup(number->valuestring) : NULL,
        building && !cJSON_IsNull(building) ? strdup(building->valuestring) : NULL,
        estate && !cJSON_IsNull(estate) ? strdup(estate->valuestring) : NULL,
        block && !cJSON_IsNull(block) ? strdup(block->valuestring) : NULL,
        additional && !cJSON_IsNull(additional) ? strdup(additional->valuestring) : NULL,
        km ? km->valuedouble : 0,
        city && !cJSON_IsNull(city) ? strdup(city->valuestring) : NULL
        );

    return outlet_address_dto_local_var;
end:
    return NULL;

}
