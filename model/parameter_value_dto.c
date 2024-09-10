#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "parameter_value_dto.h"



parameter_value_dto_t *parameter_value_dto_create(
    long parameter_id,
    long unit_id,
    long value_id,
    char *value
    ) {
    parameter_value_dto_t *parameter_value_dto_local_var = malloc(sizeof(parameter_value_dto_t));
    if (!parameter_value_dto_local_var) {
        return NULL;
    }
    parameter_value_dto_local_var->parameter_id = parameter_id;
    parameter_value_dto_local_var->unit_id = unit_id;
    parameter_value_dto_local_var->value_id = value_id;
    parameter_value_dto_local_var->value = value;

    return parameter_value_dto_local_var;
}


void parameter_value_dto_free(parameter_value_dto_t *parameter_value_dto) {
    if(NULL == parameter_value_dto){
        return ;
    }
    listEntry_t *listEntry;
    if (parameter_value_dto->value) {
        free(parameter_value_dto->value);
        parameter_value_dto->value = NULL;
    }
    free(parameter_value_dto);
}

cJSON *parameter_value_dto_convertToJSON(parameter_value_dto_t *parameter_value_dto) {
    cJSON *item = cJSON_CreateObject();

    // parameter_value_dto->parameter_id
    if (!parameter_value_dto->parameter_id) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "parameterId", parameter_value_dto->parameter_id) == NULL) {
    goto fail; //Numeric
    }


    // parameter_value_dto->unit_id
    if(parameter_value_dto->unit_id) {
    if(cJSON_AddNumberToObject(item, "unitId", parameter_value_dto->unit_id) == NULL) {
    goto fail; //Numeric
    }
    }


    // parameter_value_dto->value_id
    if(parameter_value_dto->value_id) {
    if(cJSON_AddNumberToObject(item, "valueId", parameter_value_dto->value_id) == NULL) {
    goto fail; //Numeric
    }
    }


    // parameter_value_dto->value
    if(parameter_value_dto->value) {
    if(cJSON_AddStringToObject(item, "value", parameter_value_dto->value) == NULL) {
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

parameter_value_dto_t *parameter_value_dto_parseFromJSON(cJSON *parameter_value_dtoJSON){

    parameter_value_dto_t *parameter_value_dto_local_var = NULL;

    // parameter_value_dto->parameter_id
    cJSON *parameter_id = cJSON_GetObjectItemCaseSensitive(parameter_value_dtoJSON, "parameterId");
    if (!parameter_id) {
        goto end;
    }

    
    if(!cJSON_IsNumber(parameter_id))
    {
    goto end; //Numeric
    }

    // parameter_value_dto->unit_id
    cJSON *unit_id = cJSON_GetObjectItemCaseSensitive(parameter_value_dtoJSON, "unitId");
    if (unit_id) { 
    if(!cJSON_IsNumber(unit_id))
    {
    goto end; //Numeric
    }
    }

    // parameter_value_dto->value_id
    cJSON *value_id = cJSON_GetObjectItemCaseSensitive(parameter_value_dtoJSON, "valueId");
    if (value_id) { 
    if(!cJSON_IsNumber(value_id))
    {
    goto end; //Numeric
    }
    }

    // parameter_value_dto->value
    cJSON *value = cJSON_GetObjectItemCaseSensitive(parameter_value_dtoJSON, "value");
    if (value) { 
    if(!cJSON_IsString(value) && !cJSON_IsNull(value))
    {
    goto end; //String
    }
    }


    parameter_value_dto_local_var = parameter_value_dto_create (
        parameter_id->valuedouble,
        unit_id ? unit_id->valuedouble : 0,
        value_id ? value_id->valuedouble : 0,
        value && !cJSON_IsNull(value) ? strdup(value->valuestring) : NULL
        );

    return parameter_value_dto_local_var;
end:
    return NULL;

}
