#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "logistic_pickup_point_dto.h"


char* logistic_pickup_point_dto_type_ToString(_api__logistic_pickup_point_dto__e type) {
    char* typeArray[] =  { "NULL", "WAREHOUSE", "PICKUP_POINT", "PICKUP_TERMINAL", "PICKUP_POST_OFFICE", "PICKUP_MIXED", "PICKUP_RETAIL", "UNKNOWN" };
    return typeArray[type];
}

_api__logistic_pickup_point_dto__e logistic_pickup_point_dto_type_FromString(char* type){
    int stringToReturn = 0;
    char *typeArray[] =  { "NULL", "WAREHOUSE", "PICKUP_POINT", "PICKUP_TERMINAL", "PICKUP_POST_OFFICE", "PICKUP_MIXED", "PICKUP_RETAIL", "UNKNOWN" };
    size_t sizeofArray = sizeof(typeArray) / sizeof(typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(type, typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

logistic_pickup_point_dto_t *logistic_pickup_point_dto_create(
    long id,
    char *name,
    pickup_address_dto_t *address,
    char *instruction,
    logistic_point_type_t *type,
    long logistic_partner_id
    ) {
    logistic_pickup_point_dto_t *logistic_pickup_point_dto_local_var = malloc(sizeof(logistic_pickup_point_dto_t));
    if (!logistic_pickup_point_dto_local_var) {
        return NULL;
    }
    logistic_pickup_point_dto_local_var->id = id;
    logistic_pickup_point_dto_local_var->name = name;
    logistic_pickup_point_dto_local_var->address = address;
    logistic_pickup_point_dto_local_var->instruction = instruction;
    logistic_pickup_point_dto_local_var->type = type;
    logistic_pickup_point_dto_local_var->logistic_partner_id = logistic_partner_id;

    return logistic_pickup_point_dto_local_var;
}


void logistic_pickup_point_dto_free(logistic_pickup_point_dto_t *logistic_pickup_point_dto) {
    if(NULL == logistic_pickup_point_dto){
        return ;
    }
    listEntry_t *listEntry;
    if (logistic_pickup_point_dto->name) {
        free(logistic_pickup_point_dto->name);
        logistic_pickup_point_dto->name = NULL;
    }
    if (logistic_pickup_point_dto->address) {
        pickup_address_dto_free(logistic_pickup_point_dto->address);
        logistic_pickup_point_dto->address = NULL;
    }
    if (logistic_pickup_point_dto->instruction) {
        free(logistic_pickup_point_dto->instruction);
        logistic_pickup_point_dto->instruction = NULL;
    }
    if (logistic_pickup_point_dto->type) {
        logistic_point_type_free(logistic_pickup_point_dto->type);
        logistic_pickup_point_dto->type = NULL;
    }
    free(logistic_pickup_point_dto);
}

cJSON *logistic_pickup_point_dto_convertToJSON(logistic_pickup_point_dto_t *logistic_pickup_point_dto) {
    cJSON *item = cJSON_CreateObject();

    // logistic_pickup_point_dto->id
    if(logistic_pickup_point_dto->id) {
    if(cJSON_AddNumberToObject(item, "id", logistic_pickup_point_dto->id) == NULL) {
    goto fail; //Numeric
    }
    }


    // logistic_pickup_point_dto->name
    if(logistic_pickup_point_dto->name) {
    if(cJSON_AddStringToObject(item, "name", logistic_pickup_point_dto->name) == NULL) {
    goto fail; //String
    }
    }


    // logistic_pickup_point_dto->address
    if(logistic_pickup_point_dto->address) {
    cJSON *address_local_JSON = pickup_address_dto_convertToJSON(logistic_pickup_point_dto->address);
    if(address_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "address", address_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // logistic_pickup_point_dto->instruction
    if(logistic_pickup_point_dto->instruction) {
    if(cJSON_AddStringToObject(item, "instruction", logistic_pickup_point_dto->instruction) == NULL) {
    goto fail; //String
    }
    }


    // logistic_pickup_point_dto->type
    if(logistic_pickup_point_dto->type != _api__logistic_pickup_point_dto__NULL) {
    cJSON *type_local_JSON = logistic_point_type_convertToJSON(logistic_pickup_point_dto->type);
    if(type_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "type", type_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // logistic_pickup_point_dto->logistic_partner_id
    if(logistic_pickup_point_dto->logistic_partner_id) {
    if(cJSON_AddNumberToObject(item, "logisticPartnerId", logistic_pickup_point_dto->logistic_partner_id) == NULL) {
    goto fail; //Numeric
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

logistic_pickup_point_dto_t *logistic_pickup_point_dto_parseFromJSON(cJSON *logistic_pickup_point_dtoJSON){

    logistic_pickup_point_dto_t *logistic_pickup_point_dto_local_var = NULL;

    // define the local variable for logistic_pickup_point_dto->address
    pickup_address_dto_t *address_local_nonprim = NULL;

    // define the local variable for logistic_pickup_point_dto->type
    logistic_point_type_t *type_local_nonprim = NULL;

    // logistic_pickup_point_dto->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(logistic_pickup_point_dtoJSON, "id");
    if (id) { 
    if(!cJSON_IsNumber(id))
    {
    goto end; //Numeric
    }
    }

    // logistic_pickup_point_dto->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(logistic_pickup_point_dtoJSON, "name");
    if (name) { 
    if(!cJSON_IsString(name) && !cJSON_IsNull(name))
    {
    goto end; //String
    }
    }

    // logistic_pickup_point_dto->address
    cJSON *address = cJSON_GetObjectItemCaseSensitive(logistic_pickup_point_dtoJSON, "address");
    if (address) { 
    address_local_nonprim = pickup_address_dto_parseFromJSON(address); //nonprimitive
    }

    // logistic_pickup_point_dto->instruction
    cJSON *instruction = cJSON_GetObjectItemCaseSensitive(logistic_pickup_point_dtoJSON, "instruction");
    if (instruction) { 
    if(!cJSON_IsString(instruction) && !cJSON_IsNull(instruction))
    {
    goto end; //String
    }
    }

    // logistic_pickup_point_dto->type
    cJSON *type = cJSON_GetObjectItemCaseSensitive(logistic_pickup_point_dtoJSON, "type");
    if (type) { 
    type_local_nonprim = logistic_point_type_parseFromJSON(type); //custom
    }

    // logistic_pickup_point_dto->logistic_partner_id
    cJSON *logistic_partner_id = cJSON_GetObjectItemCaseSensitive(logistic_pickup_point_dtoJSON, "logisticPartnerId");
    if (logistic_partner_id) { 
    if(!cJSON_IsNumber(logistic_partner_id))
    {
    goto end; //Numeric
    }
    }


    logistic_pickup_point_dto_local_var = logistic_pickup_point_dto_create (
        id ? id->valuedouble : 0,
        name && !cJSON_IsNull(name) ? strdup(name->valuestring) : NULL,
        address ? address_local_nonprim : NULL,
        instruction && !cJSON_IsNull(instruction) ? strdup(instruction->valuestring) : NULL,
        type ? type_local_nonprim : NULL,
        logistic_partner_id ? logistic_partner_id->valuedouble : 0
        );

    return logistic_pickup_point_dto_local_var;
end:
    if (address_local_nonprim) {
        pickup_address_dto_free(address_local_nonprim);
        address_local_nonprim = NULL;
    }
    if (type_local_nonprim) {
        logistic_point_type_free(type_local_nonprim);
        type_local_nonprim = NULL;
    }
    return NULL;

}
