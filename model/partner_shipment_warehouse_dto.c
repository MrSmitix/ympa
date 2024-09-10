#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "partner_shipment_warehouse_dto.h"



partner_shipment_warehouse_dto_t *partner_shipment_warehouse_dto_create(
    long id,
    char *name,
    char *address
    ) {
    partner_shipment_warehouse_dto_t *partner_shipment_warehouse_dto_local_var = malloc(sizeof(partner_shipment_warehouse_dto_t));
    if (!partner_shipment_warehouse_dto_local_var) {
        return NULL;
    }
    partner_shipment_warehouse_dto_local_var->id = id;
    partner_shipment_warehouse_dto_local_var->name = name;
    partner_shipment_warehouse_dto_local_var->address = address;

    return partner_shipment_warehouse_dto_local_var;
}


void partner_shipment_warehouse_dto_free(partner_shipment_warehouse_dto_t *partner_shipment_warehouse_dto) {
    if(NULL == partner_shipment_warehouse_dto){
        return ;
    }
    listEntry_t *listEntry;
    if (partner_shipment_warehouse_dto->name) {
        free(partner_shipment_warehouse_dto->name);
        partner_shipment_warehouse_dto->name = NULL;
    }
    if (partner_shipment_warehouse_dto->address) {
        free(partner_shipment_warehouse_dto->address);
        partner_shipment_warehouse_dto->address = NULL;
    }
    free(partner_shipment_warehouse_dto);
}

cJSON *partner_shipment_warehouse_dto_convertToJSON(partner_shipment_warehouse_dto_t *partner_shipment_warehouse_dto) {
    cJSON *item = cJSON_CreateObject();

    // partner_shipment_warehouse_dto->id
    if(partner_shipment_warehouse_dto->id) {
    if(cJSON_AddNumberToObject(item, "id", partner_shipment_warehouse_dto->id) == NULL) {
    goto fail; //Numeric
    }
    }


    // partner_shipment_warehouse_dto->name
    if(partner_shipment_warehouse_dto->name) {
    if(cJSON_AddStringToObject(item, "name", partner_shipment_warehouse_dto->name) == NULL) {
    goto fail; //String
    }
    }


    // partner_shipment_warehouse_dto->address
    if(partner_shipment_warehouse_dto->address) {
    if(cJSON_AddStringToObject(item, "address", partner_shipment_warehouse_dto->address) == NULL) {
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

partner_shipment_warehouse_dto_t *partner_shipment_warehouse_dto_parseFromJSON(cJSON *partner_shipment_warehouse_dtoJSON){

    partner_shipment_warehouse_dto_t *partner_shipment_warehouse_dto_local_var = NULL;

    // partner_shipment_warehouse_dto->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(partner_shipment_warehouse_dtoJSON, "id");
    if (id) { 
    if(!cJSON_IsNumber(id))
    {
    goto end; //Numeric
    }
    }

    // partner_shipment_warehouse_dto->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(partner_shipment_warehouse_dtoJSON, "name");
    if (name) { 
    if(!cJSON_IsString(name) && !cJSON_IsNull(name))
    {
    goto end; //String
    }
    }

    // partner_shipment_warehouse_dto->address
    cJSON *address = cJSON_GetObjectItemCaseSensitive(partner_shipment_warehouse_dtoJSON, "address");
    if (address) { 
    if(!cJSON_IsString(address) && !cJSON_IsNull(address))
    {
    goto end; //String
    }
    }


    partner_shipment_warehouse_dto_local_var = partner_shipment_warehouse_dto_create (
        id ? id->valuedouble : 0,
        name && !cJSON_IsNull(name) ? strdup(name->valuestring) : NULL,
        address && !cJSON_IsNull(address) ? strdup(address->valuestring) : NULL
        );

    return partner_shipment_warehouse_dto_local_var;
end:
    return NULL;

}
