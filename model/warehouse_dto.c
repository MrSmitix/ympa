#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "warehouse_dto.h"



warehouse_dto_t *warehouse_dto_create(
    long id,
    char *name,
    long campaign_id,
    int express,
    warehouse_address_dto_t *address
    ) {
    warehouse_dto_t *warehouse_dto_local_var = malloc(sizeof(warehouse_dto_t));
    if (!warehouse_dto_local_var) {
        return NULL;
    }
    warehouse_dto_local_var->id = id;
    warehouse_dto_local_var->name = name;
    warehouse_dto_local_var->campaign_id = campaign_id;
    warehouse_dto_local_var->express = express;
    warehouse_dto_local_var->address = address;

    return warehouse_dto_local_var;
}


void warehouse_dto_free(warehouse_dto_t *warehouse_dto) {
    if(NULL == warehouse_dto){
        return ;
    }
    listEntry_t *listEntry;
    if (warehouse_dto->name) {
        free(warehouse_dto->name);
        warehouse_dto->name = NULL;
    }
    if (warehouse_dto->address) {
        warehouse_address_dto_free(warehouse_dto->address);
        warehouse_dto->address = NULL;
    }
    free(warehouse_dto);
}

cJSON *warehouse_dto_convertToJSON(warehouse_dto_t *warehouse_dto) {
    cJSON *item = cJSON_CreateObject();

    // warehouse_dto->id
    if (!warehouse_dto->id) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "id", warehouse_dto->id) == NULL) {
    goto fail; //Numeric
    }


    // warehouse_dto->name
    if (!warehouse_dto->name) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "name", warehouse_dto->name) == NULL) {
    goto fail; //String
    }


    // warehouse_dto->campaign_id
    if (!warehouse_dto->campaign_id) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "campaignId", warehouse_dto->campaign_id) == NULL) {
    goto fail; //Numeric
    }


    // warehouse_dto->express
    if (!warehouse_dto->express) {
        goto fail;
    }
    if(cJSON_AddBoolToObject(item, "express", warehouse_dto->express) == NULL) {
    goto fail; //Bool
    }


    // warehouse_dto->address
    if(warehouse_dto->address) {
    cJSON *address_local_JSON = warehouse_address_dto_convertToJSON(warehouse_dto->address);
    if(address_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "address", address_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

warehouse_dto_t *warehouse_dto_parseFromJSON(cJSON *warehouse_dtoJSON){

    warehouse_dto_t *warehouse_dto_local_var = NULL;

    // define the local variable for warehouse_dto->address
    warehouse_address_dto_t *address_local_nonprim = NULL;

    // warehouse_dto->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(warehouse_dtoJSON, "id");
    if (!id) {
        goto end;
    }

    
    if(!cJSON_IsNumber(id))
    {
    goto end; //Numeric
    }

    // warehouse_dto->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(warehouse_dtoJSON, "name");
    if (!name) {
        goto end;
    }

    
    if(!cJSON_IsString(name))
    {
    goto end; //String
    }

    // warehouse_dto->campaign_id
    cJSON *campaign_id = cJSON_GetObjectItemCaseSensitive(warehouse_dtoJSON, "campaignId");
    if (!campaign_id) {
        goto end;
    }

    
    if(!cJSON_IsNumber(campaign_id))
    {
    goto end; //Numeric
    }

    // warehouse_dto->express
    cJSON *express = cJSON_GetObjectItemCaseSensitive(warehouse_dtoJSON, "express");
    if (!express) {
        goto end;
    }

    
    if(!cJSON_IsBool(express))
    {
    goto end; //Bool
    }

    // warehouse_dto->address
    cJSON *address = cJSON_GetObjectItemCaseSensitive(warehouse_dtoJSON, "address");
    if (address) { 
    address_local_nonprim = warehouse_address_dto_parseFromJSON(address); //nonprimitive
    }


    warehouse_dto_local_var = warehouse_dto_create (
        id->valuedouble,
        strdup(name->valuestring),
        campaign_id->valuedouble,
        express->valueint,
        address ? address_local_nonprim : NULL
        );

    return warehouse_dto_local_var;
end:
    if (address_local_nonprim) {
        warehouse_address_dto_free(address_local_nonprim);
        address_local_nonprim = NULL;
    }
    return NULL;

}
