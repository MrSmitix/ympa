#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "tariff_parameter_dto.h"



tariff_parameter_dto_t *tariff_parameter_dto_create(
    char *name,
    char *value
    ) {
    tariff_parameter_dto_t *tariff_parameter_dto_local_var = malloc(sizeof(tariff_parameter_dto_t));
    if (!tariff_parameter_dto_local_var) {
        return NULL;
    }
    tariff_parameter_dto_local_var->name = name;
    tariff_parameter_dto_local_var->value = value;

    return tariff_parameter_dto_local_var;
}


void tariff_parameter_dto_free(tariff_parameter_dto_t *tariff_parameter_dto) {
    if(NULL == tariff_parameter_dto){
        return ;
    }
    listEntry_t *listEntry;
    if (tariff_parameter_dto->name) {
        free(tariff_parameter_dto->name);
        tariff_parameter_dto->name = NULL;
    }
    if (tariff_parameter_dto->value) {
        free(tariff_parameter_dto->value);
        tariff_parameter_dto->value = NULL;
    }
    free(tariff_parameter_dto);
}

cJSON *tariff_parameter_dto_convertToJSON(tariff_parameter_dto_t *tariff_parameter_dto) {
    cJSON *item = cJSON_CreateObject();

    // tariff_parameter_dto->name
    if (!tariff_parameter_dto->name) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "name", tariff_parameter_dto->name) == NULL) {
    goto fail; //String
    }


    // tariff_parameter_dto->value
    if (!tariff_parameter_dto->value) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "value", tariff_parameter_dto->value) == NULL) {
    goto fail; //String
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

tariff_parameter_dto_t *tariff_parameter_dto_parseFromJSON(cJSON *tariff_parameter_dtoJSON){

    tariff_parameter_dto_t *tariff_parameter_dto_local_var = NULL;

    // tariff_parameter_dto->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(tariff_parameter_dtoJSON, "name");
    if (!name) {
        goto end;
    }

    
    if(!cJSON_IsString(name))
    {
    goto end; //String
    }

    // tariff_parameter_dto->value
    cJSON *value = cJSON_GetObjectItemCaseSensitive(tariff_parameter_dtoJSON, "value");
    if (!value) {
        goto end;
    }

    
    if(!cJSON_IsString(value))
    {
    goto end; //String
    }


    tariff_parameter_dto_local_var = tariff_parameter_dto_create (
        strdup(name->valuestring),
        strdup(value->valuestring)
        );

    return tariff_parameter_dto_local_var;
end:
    return NULL;

}
