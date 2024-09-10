#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "fulfillment_warehouse_dto.h"



fulfillment_warehouse_dto_t *fulfillment_warehouse_dto_create(
    long id,
    char *name,
    warehouse_address_dto_t *address
    ) {
    fulfillment_warehouse_dto_t *fulfillment_warehouse_dto_local_var = malloc(sizeof(fulfillment_warehouse_dto_t));
    if (!fulfillment_warehouse_dto_local_var) {
        return NULL;
    }
    fulfillment_warehouse_dto_local_var->id = id;
    fulfillment_warehouse_dto_local_var->name = name;
    fulfillment_warehouse_dto_local_var->address = address;

    return fulfillment_warehouse_dto_local_var;
}


void fulfillment_warehouse_dto_free(fulfillment_warehouse_dto_t *fulfillment_warehouse_dto) {
    if(NULL == fulfillment_warehouse_dto){
        return ;
    }
    listEntry_t *listEntry;
    if (fulfillment_warehouse_dto->name) {
        free(fulfillment_warehouse_dto->name);
        fulfillment_warehouse_dto->name = NULL;
    }
    if (fulfillment_warehouse_dto->address) {
        warehouse_address_dto_free(fulfillment_warehouse_dto->address);
        fulfillment_warehouse_dto->address = NULL;
    }
    free(fulfillment_warehouse_dto);
}

cJSON *fulfillment_warehouse_dto_convertToJSON(fulfillment_warehouse_dto_t *fulfillment_warehouse_dto) {
    cJSON *item = cJSON_CreateObject();

    // fulfillment_warehouse_dto->id
    if (!fulfillment_warehouse_dto->id) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "id", fulfillment_warehouse_dto->id) == NULL) {
    goto fail; //Numeric
    }


    // fulfillment_warehouse_dto->name
    if (!fulfillment_warehouse_dto->name) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "name", fulfillment_warehouse_dto->name) == NULL) {
    goto fail; //String
    }


    // fulfillment_warehouse_dto->address
    if(fulfillment_warehouse_dto->address) {
    cJSON *address_local_JSON = warehouse_address_dto_convertToJSON(fulfillment_warehouse_dto->address);
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

fulfillment_warehouse_dto_t *fulfillment_warehouse_dto_parseFromJSON(cJSON *fulfillment_warehouse_dtoJSON){

    fulfillment_warehouse_dto_t *fulfillment_warehouse_dto_local_var = NULL;

    // define the local variable for fulfillment_warehouse_dto->address
    warehouse_address_dto_t *address_local_nonprim = NULL;

    // fulfillment_warehouse_dto->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(fulfillment_warehouse_dtoJSON, "id");
    if (!id) {
        goto end;
    }

    
    if(!cJSON_IsNumber(id))
    {
    goto end; //Numeric
    }

    // fulfillment_warehouse_dto->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(fulfillment_warehouse_dtoJSON, "name");
    if (!name) {
        goto end;
    }

    
    if(!cJSON_IsString(name))
    {
    goto end; //String
    }

    // fulfillment_warehouse_dto->address
    cJSON *address = cJSON_GetObjectItemCaseSensitive(fulfillment_warehouse_dtoJSON, "address");
    if (address) { 
    address_local_nonprim = warehouse_address_dto_parseFromJSON(address); //nonprimitive
    }


    fulfillment_warehouse_dto_local_var = fulfillment_warehouse_dto_create (
        id->valuedouble,
        strdup(name->valuestring),
        address ? address_local_nonprim : NULL
        );

    return fulfillment_warehouse_dto_local_var;
end:
    if (address_local_nonprim) {
        warehouse_address_dto_free(address_local_nonprim);
        address_local_nonprim = NULL;
    }
    return NULL;

}
