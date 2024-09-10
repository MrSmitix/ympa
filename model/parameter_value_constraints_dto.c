#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "parameter_value_constraints_dto.h"



parameter_value_constraints_dto_t *parameter_value_constraints_dto_create(
    double min_value,
    double max_value,
    int max_length
    ) {
    parameter_value_constraints_dto_t *parameter_value_constraints_dto_local_var = malloc(sizeof(parameter_value_constraints_dto_t));
    if (!parameter_value_constraints_dto_local_var) {
        return NULL;
    }
    parameter_value_constraints_dto_local_var->min_value = min_value;
    parameter_value_constraints_dto_local_var->max_value = max_value;
    parameter_value_constraints_dto_local_var->max_length = max_length;

    return parameter_value_constraints_dto_local_var;
}


void parameter_value_constraints_dto_free(parameter_value_constraints_dto_t *parameter_value_constraints_dto) {
    if(NULL == parameter_value_constraints_dto){
        return ;
    }
    listEntry_t *listEntry;
    free(parameter_value_constraints_dto);
}

cJSON *parameter_value_constraints_dto_convertToJSON(parameter_value_constraints_dto_t *parameter_value_constraints_dto) {
    cJSON *item = cJSON_CreateObject();

    // parameter_value_constraints_dto->min_value
    if(parameter_value_constraints_dto->min_value) {
    if(cJSON_AddNumberToObject(item, "minValue", parameter_value_constraints_dto->min_value) == NULL) {
    goto fail; //Numeric
    }
    }


    // parameter_value_constraints_dto->max_value
    if(parameter_value_constraints_dto->max_value) {
    if(cJSON_AddNumberToObject(item, "maxValue", parameter_value_constraints_dto->max_value) == NULL) {
    goto fail; //Numeric
    }
    }


    // parameter_value_constraints_dto->max_length
    if(parameter_value_constraints_dto->max_length) {
    if(cJSON_AddNumberToObject(item, "maxLength", parameter_value_constraints_dto->max_length) == NULL) {
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

parameter_value_constraints_dto_t *parameter_value_constraints_dto_parseFromJSON(cJSON *parameter_value_constraints_dtoJSON){

    parameter_value_constraints_dto_t *parameter_value_constraints_dto_local_var = NULL;

    // parameter_value_constraints_dto->min_value
    cJSON *min_value = cJSON_GetObjectItemCaseSensitive(parameter_value_constraints_dtoJSON, "minValue");
    if (min_value) { 
    if(!cJSON_IsNumber(min_value))
    {
    goto end; //Numeric
    }
    }

    // parameter_value_constraints_dto->max_value
    cJSON *max_value = cJSON_GetObjectItemCaseSensitive(parameter_value_constraints_dtoJSON, "maxValue");
    if (max_value) { 
    if(!cJSON_IsNumber(max_value))
    {
    goto end; //Numeric
    }
    }

    // parameter_value_constraints_dto->max_length
    cJSON *max_length = cJSON_GetObjectItemCaseSensitive(parameter_value_constraints_dtoJSON, "maxLength");
    if (max_length) { 
    if(!cJSON_IsNumber(max_length))
    {
    goto end; //Numeric
    }
    }


    parameter_value_constraints_dto_local_var = parameter_value_constraints_dto_create (
        min_value ? min_value->valuedouble : 0,
        max_value ? max_value->valuedouble : 0,
        max_length ? max_length->valuedouble : 0
        );

    return parameter_value_constraints_dto_local_var;
end:
    return NULL;

}
